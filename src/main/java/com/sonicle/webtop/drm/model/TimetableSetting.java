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
 * ANY WARRANTY; without even the implied warrantyText of MERCHANTABILITY or FITNESS
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

import com.sonicle.commons.LangUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lssndrvs
 */
public class TimetableSetting {

	private Integer timetableSettingId;
	private String domainId;
	private String allowedAddresses;
	private String allowedUsers;
	private String staffOfficeEmail;
	private Boolean requestsHolidaysPermitsPreviousDates;
	private String totalToleranceInMinutes;
	private String rounding;
	private String minimumExtraordinary;
	private Boolean companyExit;
	private Boolean manageStamp;
	private Boolean breakAnomaly;
	private Boolean readOnlyEvents;
	private Boolean requestsPermitsNotRemunered;
	private Boolean requestsPermitsMedicalVisits;
	private Boolean requestsPermitsContractuals;
	private Boolean medicalVisitsAutomaticallyApproved;
	private String calendarUserId;
	private Integer defaultEventActivityId;
	private Boolean requestsSickness;
	private Boolean sicknessAutomaticallyApproved;
	private String defaultCausalWorkingHours;
	private String defaultCausalOvertime;
	private String defaultCausalPermits;
	private String defaultCausalHolidays;
	private String defaultCausalSickness;
	private String defaultCausalMedicalVisit;
	private Integer minimumNumberOfHoursPerTicket;
	private Boolean ticketManagement;
	private Boolean automaticOvertime;
	private String defaultStampingMode;
	
	private List<HolidayDate> holidayDates = new ArrayList();

	public Integer getTimetableSettingId() {
		return timetableSettingId;
	}

	public void setTimetableSettingId(Integer timetableSettingId) {
		this.timetableSettingId = timetableSettingId;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getAllowedAddresses() {
		return allowedAddresses;
	}

	public void setAllowedAddresses(String allowedAddresses) {
		this.allowedAddresses = allowedAddresses;
	}

	public String getAllowedUsers() {
		return allowedUsers;
	}

	public void setAllowedUsers(String allowedUsers) {
		this.allowedUsers = allowedUsers;
	}

	public String getStaffOfficeEmail() {
		return staffOfficeEmail;
	}

	public void setStaffOfficeEmail(String staffOfficeEmail) {
		this.staffOfficeEmail = staffOfficeEmail;
	}

	public Boolean getRequestsHolidaysPermitsPreviousDates() {
		return requestsHolidaysPermitsPreviousDates;
	}

	public void setRequestsHolidaysPermitsPreviousDates(Boolean requestsHolidaysPermitsPreviousDates) {
		this.requestsHolidaysPermitsPreviousDates = requestsHolidaysPermitsPreviousDates;
	}

	public String getTotalToleranceInMinutes() {
		return totalToleranceInMinutes;
	}

	public void setTotalToleranceInMinutes(String totalToleranceInMinutes) {
		this.totalToleranceInMinutes = totalToleranceInMinutes;
	}

	public String getRounding() {
		return rounding;
	}

	public void setRounding(String rounding) {
		this.rounding = rounding;
	}

	public String getMinimumExtraordinary() {
		return minimumExtraordinary;
	}

	public void setMinimumExtraordinary(String minimumExtraordinary) {
		this.minimumExtraordinary = minimumExtraordinary;
	}

	public Boolean getCompanyExit() {
		return companyExit;
	}

	public void setCompanyExit(Boolean companyExit) {
		this.companyExit = companyExit;
	}

	public Boolean getManageStamp() {
		return manageStamp;
	}

	public void setManageStamp(Boolean manageStamp) {
		this.manageStamp = manageStamp;
	}

	public Boolean getBreakAnomaly() {
		return breakAnomaly;
	}

	public void setBreakAnomaly(Boolean breakAnomaly) {
		this.breakAnomaly = breakAnomaly;
	}

	public Boolean getReadOnlyEvents() {
		return readOnlyEvents;
	}

	public void setReadOnlyEvents(Boolean readOnlyEvents) {
		this.readOnlyEvents = readOnlyEvents;
	}

	public List<HolidayDate> getHolidayDates() {
		return holidayDates;
	}

	public void setHolidayDates(List<HolidayDate> holidayDates) {
		this.holidayDates = holidayDates;
	}

	public Boolean getRequestsPermitsNotRemunered() {
		return requestsPermitsNotRemunered;
	}

	public void setRequestsPermitsNotRemunered(Boolean requestsPermitsNotRemunered) {
		this.requestsPermitsNotRemunered = requestsPermitsNotRemunered;
	}

	public Boolean getRequestsPermitsMedicalVisits() {
		return requestsPermitsMedicalVisits;
	}

	public void setRequestsPermitsMedicalVisits(Boolean requestsPermitsMedicalVisits) {
		this.requestsPermitsMedicalVisits = requestsPermitsMedicalVisits;
	}

	public Boolean getRequestsPermitsContractuals() {
		return requestsPermitsContractuals;
	}

	public void setRequestsPermitsContractuals(Boolean requestsPermitsContractuals) {
		this.requestsPermitsContractuals = requestsPermitsContractuals;
	}

	public Boolean getMedicalVisitsAutomaticallyApproved() {
		return medicalVisitsAutomaticallyApproved;
	}

	public void setMedicalVisitsAutomaticallyApproved(Boolean medicalVisitsAutomaticallyApproved) {
		this.medicalVisitsAutomaticallyApproved = LangUtils.coalesce(medicalVisitsAutomaticallyApproved, false);
	}

	public String getCalendarUserId() {
		return calendarUserId;
	}

	public void setCalendarUserId(String calendarUserId) {
		this.calendarUserId = calendarUserId;
	}

	public Integer getDefaultEventActivityId() {
		return defaultEventActivityId;
	}

	public void setDefaultEventActivityId(Integer defaultEventActivityId) {
		this.defaultEventActivityId = defaultEventActivityId;
	}
	
	public Boolean getRequestsSickness() {
		return requestsSickness;
	}

	public void setRequestsSickness(Boolean requestsSickness) {
		this.requestsSickness = requestsSickness;
	}
	
	public Boolean getSicknessAutomaticallyApproved() {
		return sicknessAutomaticallyApproved;
	}

	public void setSicknessAutomaticallyApproved(Boolean sicknessAutomaticallyApproved) {
		this.sicknessAutomaticallyApproved = LangUtils.coalesce(sicknessAutomaticallyApproved, false);
	}

	public String getDefaultCausalWorkingHours() {
		return defaultCausalWorkingHours;
	}

	public void setDefaultCausalWorkingHours(String defaultCausalWorkingHours) {
		this.defaultCausalWorkingHours = defaultCausalWorkingHours;
	}

	public String getDefaultCausalOvertime() {
		return defaultCausalOvertime;
	}

	public void setDefaultCausalOvertime(String defaultCausalOvertime) {
		this.defaultCausalOvertime = defaultCausalOvertime;
	}

	public String getDefaultCausalPermits() {
		return defaultCausalPermits;
	}

	public void setDefaultCausalPermits(String defaultCausalPermits) {
		this.defaultCausalPermits = defaultCausalPermits;
	}

	public String getDefaultCausalHolidays() {
		return defaultCausalHolidays;
	}

	public void setDefaultCausalHolidays(String defaultCausalHolidays) {
		this.defaultCausalHolidays = defaultCausalHolidays;
	}

	public String getDefaultCausalSickness() {
		return defaultCausalSickness;
	}

	public void setDefaultCausalSickness(String defaultCausalSickness) {
		this.defaultCausalSickness = defaultCausalSickness;
	}

	public String getDefaultCausalMedicalVisit() {
		return defaultCausalMedicalVisit;
	}

	public void setDefaultCausalMedicalVisit(String defaultCausalMedicalVisit) {
		this.defaultCausalMedicalVisit = defaultCausalMedicalVisit;
	}

	public Integer getMinimumNumberOfHoursPerTicket() {
		return minimumNumberOfHoursPerTicket;
	}

	public void setMinimumNumberOfHoursPerTicket(Integer minimumNumberOfHoursPerTicket) {
		this.minimumNumberOfHoursPerTicket = minimumNumberOfHoursPerTicket;
	}

	public Boolean getTicketManagement() {
		return ticketManagement;
	}

	public void setTicketManagement(Boolean ticketManagement) {
		this.ticketManagement = ticketManagement;
	}

	public Boolean getAutomaticOvertime() {
		return automaticOvertime;
	}

	public void setAutomaticOvertime(Boolean automaticOvertime) {
		this.automaticOvertime = automaticOvertime;
	}
	
	public String getDefaultStampingMode() {
		return defaultStampingMode;
	}
	
	public void setDefaultStampingMode(String mode) {
		this.defaultStampingMode = mode;
	}

}
