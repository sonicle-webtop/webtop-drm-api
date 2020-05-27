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

/**
 *
 * @author dnllr
 */
public class Activity {

	private Integer activityId;
	private String description;
	private String externalId;
	private String domainId;
	private Boolean customer;
	private Boolean timetable;
	private Boolean jobs;
	private Boolean opportunities;
	private Boolean exportable;
	
	private List<ActivityGroupAssociation> associatedProfiles = new ArrayList();

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}
	
	public Boolean getCustomer() {
		return customer;
	}

	public void setCustomer(Boolean customer) {
		this.customer = customer;
	}

	public Boolean getTimetable() {
		return timetable;
	}

	public void setTimetable(Boolean timetable) {
		this.timetable = timetable;
	}
	
	public Boolean getJobs() {
		return jobs;
	}

	public void setJobs(Boolean jobs) {
		this.jobs = jobs;
	}
	
	public Boolean getOpportunities() {
		return opportunities;
	}

	public void setOpportunities(Boolean opportunities) {
		this.opportunities = opportunities;
	}
	
	public List<ActivityGroupAssociation> getAssociatedProfiles() {
		return associatedProfiles;
	}

	public void setAssociatedProfiles(List<ActivityGroupAssociation> associatedProfiles) {
		this.associatedProfiles = associatedProfiles;
	}
	
	public Boolean getExportable() {
		return exportable;
	}

	public void setExportable(Boolean exportable) {
		this.exportable = exportable;
	}	
}
