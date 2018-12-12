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

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/**
 *
 * @author lssndrvs
 */
public class LeaveRequest {

	private Integer leaveRequestId;
	private String domainId;
	private Integer companyId;
	private String userId;
	private String managerId;
	private String status;
	private String type;
	private LocalDate fromDate;
	private LocalDate toDate;
	private String fromHour;
	private String toHour;
	private String notes;
	private Boolean result;
	private Boolean cancRequest;
	private String cancReason;
	private Boolean cancResult;
	private Integer eventId;

	private List<LeaveRequestDocument> documents = new ArrayList();

	public Integer getLeaveRequestId() {
		return leaveRequestId;
	}

	public void setLeaveRequestId(Integer leaveRequestId) {
		this.leaveRequestId = leaveRequestId;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getFromHour() {
		return fromHour;
	}

	public void setFromHour(String fromHour) {
		this.fromHour = fromHour;
	}

	public String getToHour() {
		return toHour;
	}

	public void setToHour(String toHour) {
		this.toHour = toHour;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public Boolean getCancRequest() {
		return cancRequest;
	}

	public void setCancRequest(Boolean cancRequest) {
		this.cancRequest = cancRequest;
	}

	public String getCancReason() {
		return cancReason;
	}

	public void setCancReason(String cancReason) {
		this.cancReason = cancReason;
	}

	public Boolean getCancResult() {
		return cancResult;
	}

	public void setCancResult(Boolean cancResult) {
		this.cancResult = cancResult;
	}

	public List<LeaveRequestDocument> getDocuments() {
		return documents;
	}

	public void setDocuments(List<LeaveRequestDocument> documents) {
		this.documents = documents;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
}
