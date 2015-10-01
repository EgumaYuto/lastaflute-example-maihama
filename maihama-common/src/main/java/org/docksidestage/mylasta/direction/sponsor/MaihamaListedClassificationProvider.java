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
package org.docksidestage.mylasta.direction.sponsor;

import java.util.Locale;

import org.dbflute.jdbc.ClassificationMeta;
import org.dbflute.optional.OptionalObject;
import org.dbflute.optional.OptionalThing;
import org.dbflute.util.Srl;
import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.allcommon.DBCurrent;
import org.lastaflute.db.dbflute.classification.ListedClassificationProvider;
import org.lastaflute.db.dbflute.exception.ProvidedClassificationNotFoundException;

/**
 * @author jflute
 */
public class MaihamaListedClassificationProvider implements ListedClassificationProvider {

    @Override
    public ClassificationMeta provide(String classificationName) throws ProvidedClassificationNotFoundException {
        final ClassificationMeta onMainSchema = findOnMainSchema(classificationName);
        if (onMainSchema == null) {
            String msg = "Not found the classification: " + classificationName;
            throw new ProvidedClassificationNotFoundException(msg);
        }
        return onMainSchema;
    }

    protected ClassificationMeta findOnMainSchema(String classificationName) throws ProvidedClassificationNotFoundException {
        String searchName = classificationName;
        if (classificationName.contains(".")) {
            final String dbName = Srl.substringFirstFront(classificationName, ".");
            if (dbName.equals(DBCurrent.getInstance().projectName())) {
                searchName = Srl.substringFirstRear(classificationName, ".");
            } else {
                return null;
            }
        }
        try {
            return CDef.DefMeta.valueOf(searchName);
        } catch (IllegalArgumentException ignored) { // not found
            return null; // handled later
        }
    }

    @Override
    public OptionalThing<String> determineAlias(Locale locale) {
        return OptionalObject.empty();
    }
}