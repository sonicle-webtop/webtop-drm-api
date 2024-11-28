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

import com.sonicle.webtop.core.sdk.UserProfileId;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author dnllr
 */
public class Job {

	private String jobId;
	private Integer companyId;
	private String operatorId;
	private String customerId;
	private String customerStatId;
	private DateTime startDate;
	private DateTime endDate;
	private String timezone;
	private Integer activityId;
	private String title;
	private String description;
	private String eventId;
	private String domainId;
	private String ticketId;
	private String number;
	private Integer causalId;
	
	private List<JobAttachment> attachments = new ArrayList();

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
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

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
		
	public DateTime getStartDate() {
		return startDate;
	}
	
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
	
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	public String getTimezone() {
		return timezone;
	}
	
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	public void setDatesAndTimes(String timezone, DateTime startDate, DateTime endDate) {
		this.timezone = timezone;
		this.startDate = startDate;
		this.endDate = endDate;
		ensureCoherence();
	}	
	
	public List<JobAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<JobAttachment> attachments) {
		this.attachments = attachments;
	}
	
	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}
	
	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public UserProfileId getOperatorProfileId(String domainId) {
		return new UserProfileId(domainId, getOperatorId());
	}

	public void ensureCoherence() {
		if ((startDate != null) && (endDate != null)) {
			// Ensure start < end
			if (startDate.compareTo(endDate) > 0) {
				final DateTime dt = endDate;
				setEndDate(startDate);
				setStartDate(dt);
			}
		}
	}
	
	public Integer getCausalId() {
		return causalId;
	}

	public void setCausalId(Integer causalId) {
		this.causalId = causalId;
	}	
	
}
