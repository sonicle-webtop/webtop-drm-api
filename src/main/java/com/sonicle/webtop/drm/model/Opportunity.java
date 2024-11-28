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
import org.joda.time.LocalDate;

/**
 *
 * @author lssndrvs
 */
public class Opportunity {

	private Integer id;
	private String domainId;
	private Integer companyId;
	private String operatorId;
	private DateTime startDate;
	private DateTime endDate;
	private String executedWith;
	private String customerId;
	private String customerStatId;
	private String sector;
	private String description;
	private String place;
	private String objective;
	private Integer causalId;
	private Integer activityId;
	private String objective2;
	private String result;
	private String discoveries;
	private String customerPotential;
	private String notes;
	private Integer statusId;
	private String signedBy;
	private Boolean signature;
	private Boolean success;
	private String eventId;

	private List<OpportunityInterlocutor> interlocutors = new ArrayList();
	private List<OpportunityAction> actions = new ArrayList();
	private List<OpportunityDocument> documents = new ArrayList();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
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

	public String getExecutedWith() {
		return executedWith;
	}

	public void setExecutedWith(String executedWith) {
		this.executedWith = executedWith;
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

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public Integer getCausalId() {
		return causalId;
	}

	public void setCausalId(Integer causalId) {
		this.causalId = causalId;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getObjective2() {
		return objective2;
	}

	public void setObjective2(String objective2) {
		this.objective2 = objective2;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDiscoveries() {
		return discoveries;
	}

	public void setDiscoveries(String discoveries) {
		this.discoveries = discoveries;
	}

	public String getCustomerPotential() {
		return customerPotential;
	}

	public void setCustomerPotential(String customerPotential) {
		this.customerPotential = customerPotential;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getSignedBy() {
		return signedBy;
	}

	public void setSignedBy(String signedBy) {
		this.signedBy = signedBy;
	}

	public Boolean getSignature() {
		return signature;
	}

	public void setSignature(Boolean signature) {
		this.signature = signature;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public List<OpportunityInterlocutor> getInterlocutors() {
		return interlocutors;
	}

	public void setInterlocutors(List<OpportunityInterlocutor> interlocutors) {
		this.interlocutors = interlocutors;
	}

	public List<OpportunityAction> getActions() {
		return actions;
	}

	public void setActions(List<OpportunityAction> actions) {
		this.actions = actions;
	}

	public List<OpportunityDocument> getDocuments() {
		return documents;
	}

	public void setDocuments(List<OpportunityDocument> documents) {
		this.documents = documents;
	}

	public UserProfileId getOperatorProfileId(String domainId) {
		return new UserProfileId(domainId, getOperatorId());
	}
	
	public UserProfileId getExecutedWithProfileId(String domainId) {
		return new UserProfileId(domainId, getExecutedWith());
	}
	
	public UserProfileId getSignedByProfileId(String domainId) {
		return new UserProfileId(domainId, getSignedBy());
	}
}
