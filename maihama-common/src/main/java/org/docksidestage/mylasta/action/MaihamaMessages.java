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
package org.docksidestage.mylasta.action;

import org.docksidestage.mylasta.action.MaihamaLabels;
import org.lastaflute.web.ruts.message.ActionMessage;

/**
 * The keys for message.
 * @author FreeGen
 */
public class MaihamaMessages extends MaihamaLabels {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    /** The key of the message: <font color="red"><ul> */
    public static final String ERRORS_HEADER = "{errors.header}";

    /** The key of the message: </ul></font> */
    public static final String ERRORS_FOOTER = "{errors.footer}";

    /** The key of the message: <li> */
    public static final String ERRORS_PREFIX = "{errors.prefix}";

    /** The key of the message: </li> */
    public static final String ERRORS_SUFFIX = "{errors.suffix}";

    /** The key of the message: must be false */
    public static final String CONSTRAINTS_AssertFalse_MESSAGE = "{constraints.AssertFalse.message}";

    /** The key of the message: must be true */
    public static final String CONSTRAINTS_AssertTrue_MESSAGE = "{constraints.AssertTrue.message}";

    /** The key of the message: must be less than ${inclusive == true ? 'or equal to ' : ''}{value} */
    public static final String CONSTRAINTS_DecimalMax_MESSAGE = "{constraints.DecimalMax.message}";

    /** The key of the message: must be greater than ${inclusive == true ? 'or equal to ' : ''}{value} */
    public static final String CONSTRAINTS_DecimalMin_MESSAGE = "{constraints.DecimalMin.message}";

    /** The key of the message: numeric value out of bounds (<{integer} digits>.<{fraction} digits> expected) */
    public static final String CONSTRAINTS_Digits_MESSAGE = "{constraints.Digits.message}";

    /** The key of the message: must be in the future */
    public static final String CONSTRAINTS_Future_MESSAGE = "{constraints.Future.message}";

    /** The key of the message: must be less than or equal to {value} */
    public static final String CONSTRAINTS_Max_MESSAGE = "{constraints.Max.message}";

    /** The key of the message: must be greater than or equal to {value} */
    public static final String CONSTRAINTS_Min_MESSAGE = "{constraints.Min.message}";

    /** The key of the message: may not be null */
    public static final String CONSTRAINTS_NotNull_MESSAGE = "{constraints.NotNull.message}";

    /** The key of the message: must be null */
    public static final String CONSTRAINTS_Null_MESSAGE = "{constraints.Null.message}";

    /** The key of the message: must be in the past */
    public static final String CONSTRAINTS_Past_MESSAGE = "{constraints.Past.message}";

    /** The key of the message: must match "{regexp}" */
    public static final String CONSTRAINTS_Pattern_MESSAGE = "{constraints.Pattern.message}";

    /** The key of the message: size must be between {min} and {max} */
    public static final String CONSTRAINTS_Size_MESSAGE = "{constraints.Size.message}";

    /** The key of the message: invalid credit card number */
    public static final String CONSTRAINTS_CreditCardNumber_MESSAGE = "{constraints.CreditCardNumber.message}";

    /** The key of the message: invalid {type} barcode */
    public static final String CONSTRAINTS_EAN_MESSAGE = "{constraints.EAN.message}";

    /** The key of the message: not a well-formed email address */
    public static final String CONSTRAINTS_Email_MESSAGE = "{constraints.Email.message}";

    /** The key of the message: length must be between {min} and {max} */
    public static final String CONSTRAINTS_Length_MESSAGE = "{constraints.Length.message}";

    /** The key of the message: The check digit for ${value} is invalid, Luhn Modulo 10 checksum failed */
    public static final String CONSTRAINTS_LuhnCheck_MESSAGE = "{constraints.LuhnCheck.message}";

    /** The key of the message: The check digit for ${value} is invalid, Modulo 10 checksum failed */
    public static final String CONSTRAINTS_Mod10Check_MESSAGE = "{constraints.Mod10Check.message}";

    /** The key of the message: The check digit for ${value} is invalid, Modulo 11 checksum failed */
    public static final String CONSTRAINTS_Mod11Check_MESSAGE = "{constraints.Mod11Check.message}";

    /** The key of the message: The check digit for ${value} is invalid, ${modType} checksum failed */
    public static final String CONSTRAINTS_ModCheck_MESSAGE = "{constraints.ModCheck.message}";

    /** The key of the message: may not be empty */
    public static final String CONSTRAINTS_NotBlank_MESSAGE = "{constraints.NotBlank.message}";

    /** The key of the message: may not be empty */
    public static final String CONSTRAINTS_NotEmpty_MESSAGE = "{constraints.NotEmpty.message}";

    /** The key of the message: script expression "{script}" didn't evaluate to true */
    public static final String CONSTRAINTS_ParametersScriptAssert_MESSAGE = "{constraints.ParametersScriptAssert.message}";

    /** The key of the message: must be between {min} and {max} */
    public static final String CONSTRAINTS_Range_MESSAGE = "{constraints.Range.message}";

    /** The key of the message: may have unsafe html content */
    public static final String CONSTRAINTS_SafeHtml_MESSAGE = "{constraints.SafeHtml.message}";

    /** The key of the message: script expression "{script}" didn't evaluate to true */
    public static final String CONSTRAINTS_ScriptAssert_MESSAGE = "{constraints.ScriptAssert.message}";

    /** The key of the message: must be a valid URL */
    public static final String CONSTRAINTS_URL_MESSAGE = "{constraints.URL.message}";

    /** The key of the message: is required */
    public static final String CONSTRAINTS_Required_MESSAGE = "{constraints.Required.message}";

    /** The key of the message: invalid mail address or password */
    public static final String ERRORS_LOGIN_FAILURE = "{errors.login.failure}";

    /** The key of the message: retry because of illegal transition */
    public static final String ERRORS_APP_ILLEGAL_TRANSITION = "{errors.app.illegal.transition}";

    /** The key of the message: others might be updated, so retry */
    public static final String ERRORS_APP_DB_ALREADY_DELETED = "{errors.app.db.already.deleted}";

    /** The key of the message: others might be updated, so retry */
    public static final String ERRORS_APP_DB_ALREADY_UPDATED = "{errors.app.db.already.updated}";

    /** The key of the message: already existing data, so retry */
    public static final String ERRORS_APP_DB_ALREADY_EXISTS = "{errors.app.db.already.exists}";

    /**
     * Add the created action message for the key 'errors.header' with parameters.
     * <pre>
     * message: <font color="red"><ul>
     * comment: ------------
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addErrorsHeader(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_HEADER));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.footer' with parameters.
     * <pre>
     * message: </ul></font>
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addErrorsFooter(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_FOOTER));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.prefix' with parameters.
     * <pre>
     * message: <li>
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addErrorsPrefix(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_PREFIX));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.suffix' with parameters.
     * <pre>
     * message: </li>
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addErrorsSuffix(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_SUFFIX));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.AssertFalse.message' with parameters.
     * <pre>
     * message: must be false
     * comment: ---------------
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsAssertFalseMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_AssertFalse_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.AssertTrue.message' with parameters.
     * <pre>
     * message: must be true
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsAssertTrueMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_AssertTrue_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.DecimalMax.message' with parameters.
     * <pre>
     * message: must be less than ${inclusive == true ? 'or equal to ' : ''}{value}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsDecimalMaxMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_DecimalMax_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.DecimalMin.message' with parameters.
     * <pre>
     * message: must be greater than ${inclusive == true ? 'or equal to ' : ''}{value}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsDecimalMinMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_DecimalMin_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Digits.message' with parameters.
     * <pre>
     * message: numeric value out of bounds (<{integer} digits>.<{fraction} digits> expected)
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param integer The parameter integer for message. (NotNull)
     * @param fraction The parameter fraction for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsDigitsMessage(String property, String integer, String fraction) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Digits_MESSAGE, integer, fraction));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Future.message' with parameters.
     * <pre>
     * message: must be in the future
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsFutureMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Future_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Max.message' with parameters.
     * <pre>
     * message: must be less than or equal to {value}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsMaxMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Max_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Min.message' with parameters.
     * <pre>
     * message: must be greater than or equal to {value}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsMinMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Min_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.NotNull.message' with parameters.
     * <pre>
     * message: may not be null
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsNotNullMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_NotNull_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Null.message' with parameters.
     * <pre>
     * message: must be null
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsNullMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Null_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Past.message' with parameters.
     * <pre>
     * message: must be in the past
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsPastMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Past_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Pattern.message' with parameters.
     * <pre>
     * message: must match "{regexp}"
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param regexp The parameter regexp for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsPatternMessage(String property, String regexp) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Pattern_MESSAGE, regexp));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Size.message' with parameters.
     * <pre>
     * message: size must be between {min} and {max}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param min The parameter min for message. (NotNull)
     * @param max The parameter max for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsSizeMessage(String property, String min, String max) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Size_MESSAGE, min, max));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.CreditCardNumber.message' with parameters.
     * <pre>
     * message: invalid credit card number
     * comment: -------------------
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsCreditCardNumberMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_CreditCardNumber_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.EAN.message' with parameters.
     * <pre>
     * message: invalid {type} barcode
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param type The parameter type for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsEanMessage(String property, String type) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_EAN_MESSAGE, type));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Email.message' with parameters.
     * <pre>
     * message: not a well-formed email address
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsEmailMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Email_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Length.message' with parameters.
     * <pre>
     * message: length must be between {min} and {max}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param min The parameter min for message. (NotNull)
     * @param max The parameter max for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsLengthMessage(String property, String min, String max) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Length_MESSAGE, min, max));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.LuhnCheck.message' with parameters.
     * <pre>
     * message: The check digit for ${value} is invalid, Luhn Modulo 10 checksum failed
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsLuhnCheckMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_LuhnCheck_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Mod10Check.message' with parameters.
     * <pre>
     * message: The check digit for ${value} is invalid, Modulo 10 checksum failed
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsMod10CheckMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Mod10Check_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Mod11Check.message' with parameters.
     * <pre>
     * message: The check digit for ${value} is invalid, Modulo 11 checksum failed
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsMod11CheckMessage(String property, String value) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Mod11Check_MESSAGE, value));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.ModCheck.message' with parameters.
     * <pre>
     * message: The check digit for ${value} is invalid, ${modType} checksum failed
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param value The parameter value for message. (NotNull)
     * @param modType The parameter modType for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsModCheckMessage(String property, String value, String modType) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_ModCheck_MESSAGE, value, modType));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.NotBlank.message' with parameters.
     * <pre>
     * message: may not be empty
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsNotBlankMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_NotBlank_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.NotEmpty.message' with parameters.
     * <pre>
     * message: may not be empty
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsNotEmptyMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_NotEmpty_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.ParametersScriptAssert.message' with parameters.
     * <pre>
     * message: script expression "{script}" didn't evaluate to true
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param script The parameter script for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsParametersScriptAssertMessage(String property, String script) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_ParametersScriptAssert_MESSAGE, script));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Range.message' with parameters.
     * <pre>
     * message: must be between {min} and {max}
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param min The parameter min for message. (NotNull)
     * @param max The parameter max for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsRangeMessage(String property, String min, String max) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Range_MESSAGE, min, max));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.SafeHtml.message' with parameters.
     * <pre>
     * message: may have unsafe html content
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsSafeHtmlMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_SafeHtml_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.ScriptAssert.message' with parameters.
     * <pre>
     * message: script expression "{script}" didn't evaluate to true
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @param script The parameter script for message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsScriptAssertMessage(String property, String script) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_ScriptAssert_MESSAGE, script));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.URL.message' with parameters.
     * <pre>
     * message: must be a valid URL
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsUrlMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_URL_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'constraints.Required.message' with parameters.
     * <pre>
     * message: is required
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addConstraintsRequiredMessage(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(CONSTRAINTS_Required_MESSAGE));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.login.failure' with parameters.
     * <pre>
     * message: invalid mail address or password
     * comment: - - - - - - - - - -/
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addErrorsLoginFailure(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_LOGIN_FAILURE));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.app.illegal.transition' with parameters.
     * <pre>
     * message: retry because of illegal transition
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addErrorsAppIllegalTransition(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_APP_ILLEGAL_TRANSITION));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.app.db.already.deleted' with parameters.
     * <pre>
     * message: others might be updated, so retry
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addErrorsAppDbAlreadyDeleted(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_APP_DB_ALREADY_DELETED));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.app.db.already.updated' with parameters.
     * <pre>
     * message: others might be updated, so retry
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addErrorsAppDbAlreadyUpdated(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_APP_DB_ALREADY_UPDATED));
        return this;
    }

    /**
     * Add the created action message for the key 'errors.app.db.already.exists' with parameters.
     * <pre>
     * message: already existing data, so retry
     * </pre>
     * @param property The property name for the message. (NotNull)
     * @return this. (NotNull)
     */
    public MaihamaMessages addErrorsAppDbAlreadyExists(String property) {
        assertPropertyNotNull(property);
        add(property, new ActionMessage(ERRORS_APP_DB_ALREADY_EXISTS));
        return this;
    }
}