/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimetableSettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer timetableSettingId;
    private java.lang.String  domainId;
    private java.lang.String  allowedAddresses;
    private java.lang.String  allowedUsers;
    private java.lang.String  staffOfficeEmail;
    private java.lang.Boolean requestsHolidaysPermitsPreviousDates;
    private java.lang.String  totalToleranceInMinutes;
    private java.lang.String  rounding;
    private java.lang.String  minimumExtraordinary;
    private java.lang.Boolean breakAnomaly;
    private java.lang.Boolean readOnlyEvents;
    private java.lang.Boolean requestsPermitsNotRemunered;
    private java.lang.Boolean requestsPermitsMedicalVisits;
    private java.lang.Boolean requestsPermitsContractuals;
    private java.lang.Boolean companyExit;
    private java.lang.Boolean manageStamp;
    private java.lang.Boolean medicalVisitsAutomaticallyApproved;
    private java.lang.String  calendarUserId;
    private java.lang.Integer defaultEventActivityId;
    private java.lang.Boolean requestsSickness;
    private java.lang.Boolean sicknessAutomaticallyApproved;
    private java.lang.String  defaultCausalWorkingHours;
    private java.lang.String  defaultCausalOvertime;
    private java.lang.String  defaultCausalPermits;
    private java.lang.String  defaultCausalHolidays;
    private java.lang.String  defaultCausalSickness;

    public TimetableSettings() {}

    public TimetableSettings(TimetableSettings value) {
        this.timetableSettingId = value.timetableSettingId;
        this.domainId = value.domainId;
        this.allowedAddresses = value.allowedAddresses;
        this.allowedUsers = value.allowedUsers;
        this.staffOfficeEmail = value.staffOfficeEmail;
        this.requestsHolidaysPermitsPreviousDates = value.requestsHolidaysPermitsPreviousDates;
        this.totalToleranceInMinutes = value.totalToleranceInMinutes;
        this.rounding = value.rounding;
        this.minimumExtraordinary = value.minimumExtraordinary;
        this.breakAnomaly = value.breakAnomaly;
        this.readOnlyEvents = value.readOnlyEvents;
        this.requestsPermitsNotRemunered = value.requestsPermitsNotRemunered;
        this.requestsPermitsMedicalVisits = value.requestsPermitsMedicalVisits;
        this.requestsPermitsContractuals = value.requestsPermitsContractuals;
        this.companyExit = value.companyExit;
        this.manageStamp = value.manageStamp;
        this.medicalVisitsAutomaticallyApproved = value.medicalVisitsAutomaticallyApproved;
        this.calendarUserId = value.calendarUserId;
        this.defaultEventActivityId = value.defaultEventActivityId;
        this.requestsSickness = value.requestsSickness;
        this.sicknessAutomaticallyApproved = value.sicknessAutomaticallyApproved;
        this.defaultCausalWorkingHours = value.defaultCausalWorkingHours;
        this.defaultCausalOvertime = value.defaultCausalOvertime;
        this.defaultCausalPermits = value.defaultCausalPermits;
        this.defaultCausalHolidays = value.defaultCausalHolidays;
        this.defaultCausalSickness = value.defaultCausalSickness;
    }

    public TimetableSettings(
        java.lang.Integer timetableSettingId,
        java.lang.String  domainId,
        java.lang.String  allowedAddresses,
        java.lang.String  allowedUsers,
        java.lang.String  staffOfficeEmail,
        java.lang.Boolean requestsHolidaysPermitsPreviousDates,
        java.lang.String  totalToleranceInMinutes,
        java.lang.String  rounding,
        java.lang.String  minimumExtraordinary,
        java.lang.Boolean breakAnomaly,
        java.lang.Boolean readOnlyEvents,
        java.lang.Boolean requestsPermitsNotRemunered,
        java.lang.Boolean requestsPermitsMedicalVisits,
        java.lang.Boolean requestsPermitsContractuals,
        java.lang.Boolean companyExit,
        java.lang.Boolean manageStamp,
        java.lang.Boolean medicalVisitsAutomaticallyApproved,
        java.lang.String  calendarUserId,
        java.lang.Integer defaultEventActivityId,
        java.lang.Boolean requestsSickness,
        java.lang.Boolean sicknessAutomaticallyApproved,
        java.lang.String  defaultCausalWorkingHours,
        java.lang.String  defaultCausalOvertime,
        java.lang.String  defaultCausalPermits,
        java.lang.String  defaultCausalHolidays,
        java.lang.String  defaultCausalSickness
    ) {
        this.timetableSettingId = timetableSettingId;
        this.domainId = domainId;
        this.allowedAddresses = allowedAddresses;
        this.allowedUsers = allowedUsers;
        this.staffOfficeEmail = staffOfficeEmail;
        this.requestsHolidaysPermitsPreviousDates = requestsHolidaysPermitsPreviousDates;
        this.totalToleranceInMinutes = totalToleranceInMinutes;
        this.rounding = rounding;
        this.minimumExtraordinary = minimumExtraordinary;
        this.breakAnomaly = breakAnomaly;
        this.readOnlyEvents = readOnlyEvents;
        this.requestsPermitsNotRemunered = requestsPermitsNotRemunered;
        this.requestsPermitsMedicalVisits = requestsPermitsMedicalVisits;
        this.requestsPermitsContractuals = requestsPermitsContractuals;
        this.companyExit = companyExit;
        this.manageStamp = manageStamp;
        this.medicalVisitsAutomaticallyApproved = medicalVisitsAutomaticallyApproved;
        this.calendarUserId = calendarUserId;
        this.defaultEventActivityId = defaultEventActivityId;
        this.requestsSickness = requestsSickness;
        this.sicknessAutomaticallyApproved = sicknessAutomaticallyApproved;
        this.defaultCausalWorkingHours = defaultCausalWorkingHours;
        this.defaultCausalOvertime = defaultCausalOvertime;
        this.defaultCausalPermits = defaultCausalPermits;
        this.defaultCausalHolidays = defaultCausalHolidays;
        this.defaultCausalSickness = defaultCausalSickness;
    }

    /**
     * Getter for <code>drm.timetable_settings.timetable_setting_id</code>.
     */
    public java.lang.Integer getTimetableSettingId() {
        return this.timetableSettingId;
    }

    /**
     * Setter for <code>drm.timetable_settings.timetable_setting_id</code>.
     */
    public void setTimetableSettingId(java.lang.Integer timetableSettingId) {
        this.timetableSettingId = timetableSettingId;
    }

    /**
     * Getter for <code>drm.timetable_settings.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.timetable_settings.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.timetable_settings.allowed_addresses</code>.
     */
    public java.lang.String getAllowedAddresses() {
        return this.allowedAddresses;
    }

    /**
     * Setter for <code>drm.timetable_settings.allowed_addresses</code>.
     */
    public void setAllowedAddresses(java.lang.String allowedAddresses) {
        this.allowedAddresses = allowedAddresses;
    }

    /**
     * Getter for <code>drm.timetable_settings.allowed_users</code>.
     */
    public java.lang.String getAllowedUsers() {
        return this.allowedUsers;
    }

    /**
     * Setter for <code>drm.timetable_settings.allowed_users</code>.
     */
    public void setAllowedUsers(java.lang.String allowedUsers) {
        this.allowedUsers = allowedUsers;
    }

    /**
     * Getter for <code>drm.timetable_settings.staff_office_email</code>.
     */
    public java.lang.String getStaffOfficeEmail() {
        return this.staffOfficeEmail;
    }

    /**
     * Setter for <code>drm.timetable_settings.staff_office_email</code>.
     */
    public void setStaffOfficeEmail(java.lang.String staffOfficeEmail) {
        this.staffOfficeEmail = staffOfficeEmail;
    }

    /**
     * Getter for <code>drm.timetable_settings.requests_holidays_permits_previous_dates</code>.
     */
    public java.lang.Boolean getRequestsHolidaysPermitsPreviousDates() {
        return this.requestsHolidaysPermitsPreviousDates;
    }

    /**
     * Setter for <code>drm.timetable_settings.requests_holidays_permits_previous_dates</code>.
     */
    public void setRequestsHolidaysPermitsPreviousDates(java.lang.Boolean requestsHolidaysPermitsPreviousDates) {
        this.requestsHolidaysPermitsPreviousDates = requestsHolidaysPermitsPreviousDates;
    }

    /**
     * Getter for <code>drm.timetable_settings.total_tolerance_in_minutes</code>.
     */
    public java.lang.String getTotalToleranceInMinutes() {
        return this.totalToleranceInMinutes;
    }

    /**
     * Setter for <code>drm.timetable_settings.total_tolerance_in_minutes</code>.
     */
    public void setTotalToleranceInMinutes(java.lang.String totalToleranceInMinutes) {
        this.totalToleranceInMinutes = totalToleranceInMinutes;
    }

    /**
     * Getter for <code>drm.timetable_settings.rounding</code>.
     */
    public java.lang.String getRounding() {
        return this.rounding;
    }

    /**
     * Setter for <code>drm.timetable_settings.rounding</code>.
     */
    public void setRounding(java.lang.String rounding) {
        this.rounding = rounding;
    }

    /**
     * Getter for <code>drm.timetable_settings.minimum_extraordinary</code>.
     */
    public java.lang.String getMinimumExtraordinary() {
        return this.minimumExtraordinary;
    }

    /**
     * Setter for <code>drm.timetable_settings.minimum_extraordinary</code>.
     */
    public void setMinimumExtraordinary(java.lang.String minimumExtraordinary) {
        this.minimumExtraordinary = minimumExtraordinary;
    }

    /**
     * Getter for <code>drm.timetable_settings.break_anomaly</code>.
     */
    public java.lang.Boolean getBreakAnomaly() {
        return this.breakAnomaly;
    }

    /**
     * Setter for <code>drm.timetable_settings.break_anomaly</code>.
     */
    public void setBreakAnomaly(java.lang.Boolean breakAnomaly) {
        this.breakAnomaly = breakAnomaly;
    }

    /**
     * Getter for <code>drm.timetable_settings.read_only_events</code>.
     */
    public java.lang.Boolean getReadOnlyEvents() {
        return this.readOnlyEvents;
    }

    /**
     * Setter for <code>drm.timetable_settings.read_only_events</code>.
     */
    public void setReadOnlyEvents(java.lang.Boolean readOnlyEvents) {
        this.readOnlyEvents = readOnlyEvents;
    }

    /**
     * Getter for <code>drm.timetable_settings.requests_permits_not_remunered</code>.
     */
    public java.lang.Boolean getRequestsPermitsNotRemunered() {
        return this.requestsPermitsNotRemunered;
    }

    /**
     * Setter for <code>drm.timetable_settings.requests_permits_not_remunered</code>.
     */
    public void setRequestsPermitsNotRemunered(java.lang.Boolean requestsPermitsNotRemunered) {
        this.requestsPermitsNotRemunered = requestsPermitsNotRemunered;
    }

    /**
     * Getter for <code>drm.timetable_settings.requests_permits_medical_visits</code>.
     */
    public java.lang.Boolean getRequestsPermitsMedicalVisits() {
        return this.requestsPermitsMedicalVisits;
    }

    /**
     * Setter for <code>drm.timetable_settings.requests_permits_medical_visits</code>.
     */
    public void setRequestsPermitsMedicalVisits(java.lang.Boolean requestsPermitsMedicalVisits) {
        this.requestsPermitsMedicalVisits = requestsPermitsMedicalVisits;
    }

    /**
     * Getter for <code>drm.timetable_settings.requests_permits_contractuals</code>.
     */
    public java.lang.Boolean getRequestsPermitsContractuals() {
        return this.requestsPermitsContractuals;
    }

    /**
     * Setter for <code>drm.timetable_settings.requests_permits_contractuals</code>.
     */
    public void setRequestsPermitsContractuals(java.lang.Boolean requestsPermitsContractuals) {
        this.requestsPermitsContractuals = requestsPermitsContractuals;
    }

    /**
     * Getter for <code>drm.timetable_settings.company_exit</code>.
     */
    public java.lang.Boolean getCompanyExit() {
        return this.companyExit;
    }

    /**
     * Setter for <code>drm.timetable_settings.company_exit</code>.
     */
    public void setCompanyExit(java.lang.Boolean companyExit) {
        this.companyExit = companyExit;
    }

    /**
     * Getter for <code>drm.timetable_settings.manage_stamp</code>.
     */
    public java.lang.Boolean getManageStamp() {
        return this.manageStamp;
    }

    /**
     * Setter for <code>drm.timetable_settings.manage_stamp</code>.
     */
    public void setManageStamp(java.lang.Boolean manageStamp) {
        this.manageStamp = manageStamp;
    }

    /**
     * Getter for <code>drm.timetable_settings.medical_visits_automatically_approved</code>.
     */
    public java.lang.Boolean getMedicalVisitsAutomaticallyApproved() {
        return this.medicalVisitsAutomaticallyApproved;
    }

    /**
     * Setter for <code>drm.timetable_settings.medical_visits_automatically_approved</code>.
     */
    public void setMedicalVisitsAutomaticallyApproved(java.lang.Boolean medicalVisitsAutomaticallyApproved) {
        this.medicalVisitsAutomaticallyApproved = medicalVisitsAutomaticallyApproved;
    }

    /**
     * Getter for <code>drm.timetable_settings.calendar_user_id</code>.
     */
    public java.lang.String getCalendarUserId() {
        return this.calendarUserId;
    }

    /**
     * Setter for <code>drm.timetable_settings.calendar_user_id</code>.
     */
    public void setCalendarUserId(java.lang.String calendarUserId) {
        this.calendarUserId = calendarUserId;
    }

    /**
     * Getter for <code>drm.timetable_settings.default_event_activity_id</code>.
     */
    public java.lang.Integer getDefaultEventActivityId() {
        return this.defaultEventActivityId;
    }

    /**
     * Setter for <code>drm.timetable_settings.default_event_activity_id</code>.
     */
    public void setDefaultEventActivityId(java.lang.Integer defaultEventActivityId) {
        this.defaultEventActivityId = defaultEventActivityId;
    }

    /**
     * Getter for <code>drm.timetable_settings.requests_sickness</code>.
     */
    public java.lang.Boolean getRequestsSickness() {
        return this.requestsSickness;
    }

    /**
     * Setter for <code>drm.timetable_settings.requests_sickness</code>.
     */
    public void setRequestsSickness(java.lang.Boolean requestsSickness) {
        this.requestsSickness = requestsSickness;
    }

    /**
     * Getter for <code>drm.timetable_settings.sickness_automatically_approved</code>.
     */
    public java.lang.Boolean getSicknessAutomaticallyApproved() {
        return this.sicknessAutomaticallyApproved;
    }

    /**
     * Setter for <code>drm.timetable_settings.sickness_automatically_approved</code>.
     */
    public void setSicknessAutomaticallyApproved(java.lang.Boolean sicknessAutomaticallyApproved) {
        this.sicknessAutomaticallyApproved = sicknessAutomaticallyApproved;
    }

    /**
     * Getter for <code>drm.timetable_settings.default_causal_working_hours</code>.
     */
    public java.lang.String getDefaultCausalWorkingHours() {
        return this.defaultCausalWorkingHours;
    }

    /**
     * Setter for <code>drm.timetable_settings.default_causal_working_hours</code>.
     */
    public void setDefaultCausalWorkingHours(java.lang.String defaultCausalWorkingHours) {
        this.defaultCausalWorkingHours = defaultCausalWorkingHours;
    }

    /**
     * Getter for <code>drm.timetable_settings.default_causal_overtime</code>.
     */
    public java.lang.String getDefaultCausalOvertime() {
        return this.defaultCausalOvertime;
    }

    /**
     * Setter for <code>drm.timetable_settings.default_causal_overtime</code>.
     */
    public void setDefaultCausalOvertime(java.lang.String defaultCausalOvertime) {
        this.defaultCausalOvertime = defaultCausalOvertime;
    }

    /**
     * Getter for <code>drm.timetable_settings.default_causal_permits</code>.
     */
    public java.lang.String getDefaultCausalPermits() {
        return this.defaultCausalPermits;
    }

    /**
     * Setter for <code>drm.timetable_settings.default_causal_permits</code>.
     */
    public void setDefaultCausalPermits(java.lang.String defaultCausalPermits) {
        this.defaultCausalPermits = defaultCausalPermits;
    }

    /**
     * Getter for <code>drm.timetable_settings.default_causal_holidays</code>.
     */
    public java.lang.String getDefaultCausalHolidays() {
        return this.defaultCausalHolidays;
    }

    /**
     * Setter for <code>drm.timetable_settings.default_causal_holidays</code>.
     */
    public void setDefaultCausalHolidays(java.lang.String defaultCausalHolidays) {
        this.defaultCausalHolidays = defaultCausalHolidays;
    }

    /**
     * Getter for <code>drm.timetable_settings.default_causal_sickness</code>.
     */
    public java.lang.String getDefaultCausalSickness() {
        return this.defaultCausalSickness;
    }

    /**
     * Setter for <code>drm.timetable_settings.default_causal_sickness</code>.
     */
    public void setDefaultCausalSickness(java.lang.String defaultCausalSickness) {
        this.defaultCausalSickness = defaultCausalSickness;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimetableSettings (");

        sb.append(timetableSettingId);
        sb.append(", ").append(domainId);
        sb.append(", ").append(allowedAddresses);
        sb.append(", ").append(allowedUsers);
        sb.append(", ").append(staffOfficeEmail);
        sb.append(", ").append(requestsHolidaysPermitsPreviousDates);
        sb.append(", ").append(totalToleranceInMinutes);
        sb.append(", ").append(rounding);
        sb.append(", ").append(minimumExtraordinary);
        sb.append(", ").append(breakAnomaly);
        sb.append(", ").append(readOnlyEvents);
        sb.append(", ").append(requestsPermitsNotRemunered);
        sb.append(", ").append(requestsPermitsMedicalVisits);
        sb.append(", ").append(requestsPermitsContractuals);
        sb.append(", ").append(companyExit);
        sb.append(", ").append(manageStamp);
        sb.append(", ").append(medicalVisitsAutomaticallyApproved);
        sb.append(", ").append(calendarUserId);
        sb.append(", ").append(defaultEventActivityId);
        sb.append(", ").append(requestsSickness);
        sb.append(", ").append(sicknessAutomaticallyApproved);
        sb.append(", ").append(defaultCausalWorkingHours);
        sb.append(", ").append(defaultCausalOvertime);
        sb.append(", ").append(defaultCausalPermits);
        sb.append(", ").append(defaultCausalHolidays);
        sb.append(", ").append(defaultCausalSickness);

        sb.append(")");
        return sb.toString();
    }
}
