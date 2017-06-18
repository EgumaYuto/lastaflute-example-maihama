<member-list>
  <div class="wrap">
    <h2 class="content-title">List of Member</h2>
    <section class="member-search-box">
      <h3 class="content-title-second">Search Condition</h3>
      <span class="errors" if={validationErrors._global}> {validationErrors._global}</span>
      <form class="member-search-form">
        <ul class="member-search-condition-list">
          <li>
            <span>Member Name</span>
            <input type="text" ref="memberName" />
            <span if={validationErrors.memberName} class="errors"> {validationErrors.memberName}</span>
          </li>
          <li>
            <span>Purchase Product</span>
            <input type="text" ref="purchaseProductName" />
            <span if={validationErrors.purchaseProductName} class="errors"> {validationErrors.purchaseProductName}</span>
          </li>
          <li>
            <span>Member Status</span>
            <select ref="memberStatus">
              <option value=""></option>
              <option each={memberStatusList} value={key}>{value}</option>
            </select>
          </li>
          <li>
            <span>has unpaid?</span><input type="checkbox" ref="unpaid" />
          </li>
          <li>
            <span>Formalized Date</span>
            <input type="text" ref="formalizedFrom" size="10"/>
            - <input type="text" ref="formalizedTo" size="10"/>
            <span if={validationErrors.formalizedFrom} class="errors"> {validationErrors.formalizedFrom}</span>
          </li>
        </ul>

        <button class="btn btn-success" onclick={onSearchMemberList}>Search</button>
      </form>
  </div>
  <section class="member-result-box">
    <h3 class="content-title-second">Search Result</h3>
		<a href="/member/add">add Member</a>
    <table class="list-tbl">
      <thead>
        <tr>
					<th>Member Id</th>
					<th>Member Name</th>
					<th>Member Status</th>
					<th>Formalized Date</th>
					<th>Update Datetime</th>
					<th>Editable</th>
					<th>Purchase</th>
        </tr>
      </thead>
      <tbody>
        <tr each={memberList}>
          <td>{memberId}</td>
          <td>{memberName}</td>
          <td>{memberStatusName}</td>
					<td>{formalizedDate}</td>
					<td>{updateDatetime}</td>
					<td>
						<span if="{!withdrawalMember}"><a href="/member/edit/{memberId}">Edit</a></span>
						<span if="{withdrawalMember}">Cannot</span>
					</td>
					<td>
						<a if="{purchaseCount > 0}" href="member/detail/{memberId}">has Purchases</a>
					</td>
        </tr>
      </tbody>
    </table>
    <section class="member-list-paging-box">
      <pagination></pagination>
    </section>
  </section>
  </div>

  <script>
    var RC = window.RC || {};
    var helper = window.helper || {};
    var obs = window.observable || {};
    var self = this;

    this.memberList = [];
    this.validationErrors = {};

    // ===================================================================================
    //                                                                               Event
    //                                                                               =====
    this.on('mount', () => {
      if (opts.back) {
        var queryParams = self.getSessionSearchCondition();
        var href = self.getSearchMemberListUrl(queryParams);
        obs.trigger(RC.EVENT.route.change, href);
        return
      }
      self.selectMemberStatus(opts.memberStatus);
      self.setSearchCondition(opts);
      self.searchMemberList(opts);
    });

    this.on('before-unmount', () => {
      self.setSessionSearchCondition()
    })

    this.onSearchMemberList = function (e) {
      if (e) {
        e.preventDefault();
      }
      var queryParams = self.getSearchCondition();
      var href = self.getSearchMemberListUrl(queryParams);
      history.pushState(null, null, href);
      self.searchMemberList(queryParams);
    };

    this.onSearchMemberListIncremental = function (e) {
      if (self.refs.incrementalSearch.checked) {
        self.onSearchMemberList(e);
      }
    }

    this.moveDetail = function(e) {
      e.preventDefault();
      var href = e.target.pathname + e.target.search;
      obs.trigger(RC.EVENT.route.change, href);
    };

    // ===================================================================================
    //                                                                               Logic
    //                                                                               =====
    this.getSearchMemberListUrl = function(queryParams) {
      return '/member/list' + window.helper.joinQueryParams(queryParams);
    }

    this.searchMemberList = function (queryParams) {
      var page = queryParams.page || 1;
      delete queryParams.page;

      self.validationErrors = {};

      request.post(RC.API.member.list + page, queryParams,
        (response) => {
          var data = JSON.parse(response.text);
          self.memberList = data.rows;
          self.update();
          obs.trigger(RC.EVENT.pagenation.set, data);
        },
        (errors) => {
          self.validationErrors = errors;
          self.update();
        });
    }

    this.selectMemberStatus = function (memberStatus) {
      request.get(RC.API.member.status,
        (response) => {
          self.memberStatusList = JSON.parse(response.text);
          self.update();
          self.refs.memberStatus.value = memberStatus;
        });
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    this.setSearchCondition = (queryParams) => {
      self.refs.memberName.value = queryParams.memberName || "";
      self.refs.purchaseProductName = queryParams.purchaseProductName || "";
      self.refs.memberStatus = queryParams.memberStatus || "";
      if (queryParams.unpaid === "true") {
        self.refs.unpaid.checked = true;
      }
      if (queryParams.formalizedFrom) {
        self.refs.formalizedFrom.value = queryParams.formalizedFrom;
      }
      if (queryParams.formalizedTo) {
        self.refs.formalizedTo.value = queryParams.formalizedTo;
      }
    }

    this.getSearchCondition = () => {
      var condition =  {
        memberName: self.refs.memberName.value,
        memberStatus: self.refs.memberStatus.value,
        unpaid: self.refs.unpaid.checked,
      }
      if (self.refs.formalizedFrom.value) {
        condition.formalizedFrom = self.refs.formalizedFrom.value;
      }
      if (self.refs.formalizedTo.value) {
        condition.formalizedTo =  self.refs.formalizedTo.value;
      }
      return condition;
    }

    // ===================================================================================
    //                                                                     Session Storage
    //                                                                     ===============
    this.getSessionSearchCondition = () => {
      const paramsString = sessionStorage.getItem('member-list-search-condition')
      if (!paramsString) {
        return self.getSearchCondition()
      }
      return JSON.parse(paramsString)
    }

    this.setSessionSearchCondition = () => {
      const searchCondition = JSON.stringify(self.getSearchCondition())
      sessionStorage.setItem('member-list-search-condition', searchCondition)
    }
  </script>
</member-list>