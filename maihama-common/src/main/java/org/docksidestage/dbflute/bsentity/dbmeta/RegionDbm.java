/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.dbflute.allcommon.*;
import org.docksidestage.dbflute.exentity.*;

/**
 * The DB meta of region. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RegionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RegionDbm _instance = new RegionDbm();
    private RegionDbm() {}
    public static RegionDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    @Override
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    @Override
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    @Override
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    @Override
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Region)et).getRegionId(), (et, vl) -> {
            ColumnInfo col = columnRegionId();
            CDef.Region cls = (CDef.Region)gcls(et, col, vl);
            if (cls != null) {
                ((Region)et).setRegionIdAsRegion(cls);
            } else {
                ((Region)et).mynativeMappingRegionId(ctn(vl, Integer.class));
            }
        }, "regionId");
        setupEpg(_epgMap, et -> ((Region)et).getRegionName(), (et, vl) -> ((Region)et).setRegionName((String)vl), "regionName");
    }
    @Override
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "region";
    protected final String _tableDispName = "REGION";
    protected final String _tablePropertyName = "region";
    protected final TableSqlName _tableSqlName = new TableSqlName("REGION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    @Override
    public String getTableDbName() { return _tableDbName; }
    @Override
    public String getTableDispName() { return _tableDispName; }
    @Override
    public String getTablePropertyName() { return _tablePropertyName; }
    @Override
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "地域";
    @Override
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRegionId = cci("REGION_ID", "REGION_ID", null, "地域ID", Integer.class, "regionId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "memberAddressList", CDef.DefMeta.Region, false);
    protected final ColumnInfo _columnRegionName = cci("REGION_NAME", "REGION_NAME", null, "地域名称", String.class, "regionName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);

    /**
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegionId() { return _columnRegionId; }
    /**
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegionName() { return _columnRegionName; }

    @Override
    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRegionId());
        ls.add(columnRegionName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    @Override
    protected UniqueInfo cpui() { return hpcpui(columnRegionId()); }
    @Override
    public boolean hasPrimaryKey() { return true; }
    @Override
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberAddressList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRegionId(), MemberAddressDbm.getInstance().columnRegionId());
        return cri("FK_MEMBER_ADDRESS_REGION", "memberAddressList", this, MemberAddressDbm.getInstance(), mp, false, "region");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    @Override
    public String getEntityTypeName() { return "org.docksidestage.dbflute.exentity.Region"; }
    @Override
    public String getConditionBeanTypeName() { return "org.docksidestage.dbflute.cbean.RegionCB"; }
    @Override
    public String getBehaviorTypeName() { return "org.docksidestage.dbflute.exbhv.RegionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<Region> getEntityType() { return Region.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Region newEntity() { return new Region(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Region)et, mp); }
    @Override
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Region)et, mp); }
    @Override
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    @Override
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}