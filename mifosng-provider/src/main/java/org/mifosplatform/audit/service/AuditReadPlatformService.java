/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.audit.service;

import java.util.Collection;

import org.mifosplatform.audit.data.AuditData;
import org.mifosplatform.audit.data.AuditSearchData;

public interface AuditReadPlatformService {

    Collection<AuditData> retrieveAuditEntries(String extraCriteria, boolean includeJson);

    AuditData retrieveAuditEntry(Long auditId);

    AuditSearchData retrieveSearchTemplate(String useType);

    Collection<AuditData> retrieveAllEntriesToBeChecked();

}