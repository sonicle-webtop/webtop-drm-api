/*
 * Copyright (C) 2017 Sonicle S.r.l.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY SONICLE, SONICLE DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Sonicle S.r.l. at email address sonicle[at]sonicle[dot]com
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * Sonicle logo and Sonicle copyright notice. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Copyright (C) 2017 Sonicle S.r.l.".
 */
package com.sonicle.webtop.drm.model;

import com.google.gson.annotations.SerializedName;
import com.sonicle.webtop.core.sdk.UserProfileId;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 *
 * @author lssndrvs
 */
public class WorkReport {

	private String workReportId;
	private Integer number;
	private Integer year;
	private Integer companyId;
	private String operatorId;
	private RevisionStatus revisionStatus;
	private DateTime revisionTimestamp;
	private Integer revisionSequence;
	private Integer docStatusId;
	private Integer contactId;
	private String customerId;
	private String customerStatId;
	private LocalDate fromDate;
	private LocalDate toDate;
	private String referenceNo;
	private Integer causalId;
	private String ddtNo;
	private LocalDate ddtDate;
	private String notes;
	private String description;
	private Boolean applySignature;
	private Boolean chargeTo;
	private Boolean freeSupport;
	private Integer businessTripId;
	private Integer businessTripDays;
	private Integer eventId;

	private List<WorkReportRow> details = new ArrayList();
	private List<WorkReportAttachment> attachments = new ArrayList();

	public String getWorkReportId() {
		return workReportId;
	}

	public void setWorkReportId(String workReportId) {
		this.workReportId = workReportId;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public RevisionStatus getRevisionStatus() {
		return revisionStatus;
	}

	public void setRevisionStatus(RevisionStatus revisionStatus) {
		this.revisionStatus = revisionStatus;
	}

	public DateTime getRevisionTimestamp() {
		return revisionTimestamp;
	}

	public void setRevisionTimestamp(DateTime revisionTimestamp) {
		this.revisionTimestamp = revisionTimestamp;
	}

	public Integer getRevisionSequence() {
		return revisionSequence;
	}

	public void setRevisionSequence(Integer revisionSequence) {
		this.revisionSequence = revisionSequence;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerStatId() {
		return customerStatId;
	}

	public void setCustomerStatId(String customerStatId) {
		this.customerStatId = customerStatId;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public Integer getCausalId() {
		return causalId;
	}

	public void setCausalId(Integer causalId) {
		this.causalId = causalId;
	}

	public String getDdtNo() {
		return ddtNo;
	}

	public void setDdtNo(String ddtNo) {
		this.ddtNo = ddtNo;
	}

	public LocalDate getDdtDate() {
		return ddtDate;
	}

	public void setDdtDate(LocalDate ddtDate) {
		this.ddtDate = ddtDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getApplySignature() {
		return applySignature;
	}

	public void setApplySignature(Boolean applySignature) {
		this.applySignature = applySignature;
	}

	public Boolean getChargeTo() {
		return chargeTo;
	}

	public void setChargeTo(Boolean chargeTo) {
		this.chargeTo = chargeTo;
	}

	public Boolean getFreeSupport() {
		return freeSupport;
	}

	public void setFreeSupport(Boolean freeSupport) {
		this.freeSupport = freeSupport;
	}

	public Integer getDocStatusId() {
		return docStatusId;
	}

	public void setDocStatusId(Integer docStatusId) {
		this.docStatusId = docStatusId;
	}

	public Integer getBusinessTripId() {
		return businessTripId;
	}

	public void setBusinessTripId(Integer businessTripId) {
		this.businessTripId = businessTripId;
	}

	public Integer getBusinessTripDays() {
		return businessTripDays;
	}

	public void setBusinessTripDays(Integer businessTripDays) {
		this.businessTripDays = businessTripDays;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	
	public List<WorkReportRow> getDetails() {
		return details;
	}

	public void setDetails(List<WorkReportRow> details) {
		this.details = details;
	}

	public List<WorkReportAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<WorkReportAttachment> attachments) {
		this.attachments = attachments;
	}
	
	public UserProfileId getOperatorProfileId(String domainId) {
		return new UserProfileId(domainId, getOperatorId());
	}
	
	public static enum RevisionStatus {
		@SerializedName("N") NEW,
		@SerializedName("M") MODIFIED,
		@SerializedName("D") DELETED;
	}

}
