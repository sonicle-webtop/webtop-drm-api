/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimetableSettingsRecord extends org.jooq.impl.UpdatableRecordImpl<TimetableSettingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.timetable_settings.timetable_setting_id</code>.
     */
    public void setTimetableSettingId(java.lang.Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.timetable_setting_id</code>.
     */
    public java.lang.Integer getTimetableSettingId() {
        return (java.lang.Integer) get(0);
    }

    /**
     * Setter for <code>drm.timetable_settings.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.timetable_settings.allowed_addresses</code>.
     */
    public void setAllowedAddresses(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.allowed_addresses</code>.
     */
    public java.lang.String getAllowedAddresses() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>drm.timetable_settings.allowed_users</code>.
     */
    public void setAllowedUsers(java.lang.String value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.allowed_users</code>.
     */
    public java.lang.String getAllowedUsers() {
        return (java.lang.String) get(3);
    }

    /**
     * Setter for <code>drm.timetable_settings.staff_office_email</code>.
     */
    public void setStaffOfficeEmail(java.lang.String value) {
        set(4, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.staff_office_email</code>.
     */
    public java.lang.String getStaffOfficeEmail() {
        return (java.lang.String) get(4);
    }

    /**
     * Setter for <code>drm.timetable_settings.requests_holidays_permits_previous_dates</code>.
     */
    public void setRequestsHolidaysPermitsPreviousDates(java.lang.Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.requests_holidays_permits_previous_dates</code>.
     */
    public java.lang.Boolean getRequestsHolidaysPermitsPreviousDates() {
        return (java.lang.Boolean) get(5);
    }

    /**
     * Setter for <code>drm.timetable_settings.total_tolerance_in_minutes</code>.
     */
    public void setTotalToleranceInMinutes(java.lang.String value) {
        set(6, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.total_tolerance_in_minutes</code>.
     */
    public java.lang.String getTotalToleranceInMinutes() {
        return (java.lang.String) get(6);
    }

    /**
     * Setter for <code>drm.timetable_settings.rounding</code>.
     */
    public void setRounding(java.lang.String value) {
        set(7, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.rounding</code>.
     */
    public java.lang.String getRounding() {
        return (java.lang.String) get(7);
    }

    /**
     * Setter for <code>drm.timetable_settings.minimum_extraordinary</code>.
     */
    public void setMinimumExtraordinary(java.lang.String value) {
        set(8, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.minimum_extraordinary</code>.
     */
    public java.lang.String getMinimumExtraordinary() {
        return (java.lang.String) get(8);
    }

    /**
     * Setter for <code>drm.timetable_settings.break_anomaly</code>.
     */
    public void setBreakAnomaly(java.lang.Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.break_anomaly</code>.
     */
    public java.lang.Boolean getBreakAnomaly() {
        return (java.lang.Boolean) get(9);
    }

    /**
     * Setter for <code>drm.timetable_settings.read_only_events</code>.
     */
    public void setReadOnlyEvents(java.lang.Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.read_only_events</code>.
     */
    public java.lang.Boolean getReadOnlyEvents() {
        return (java.lang.Boolean) get(10);
    }

    /**
     * Setter for <code>drm.timetable_settings.requests_permits_not_remunered</code>.
     */
    public void setRequestsPermitsNotRemunered(java.lang.Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.requests_permits_not_remunered</code>.
     */
    public java.lang.Boolean getRequestsPermitsNotRemunered() {
        return (java.lang.Boolean) get(11);
    }

    /**
     * Setter for <code>drm.timetable_settings.requests_permits_medical_visits</code>.
     */
    public void setRequestsPermitsMedicalVisits(java.lang.Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.requests_permits_medical_visits</code>.
     */
    public java.lang.Boolean getRequestsPermitsMedicalVisits() {
        return (java.lang.Boolean) get(12);
    }

    /**
     * Setter for <code>drm.timetable_settings.requests_permits_contractuals</code>.
     */
    public void setRequestsPermitsContractuals(java.lang.Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.requests_permits_contractuals</code>.
     */
    public java.lang.Boolean getRequestsPermitsContractuals() {
        return (java.lang.Boolean) get(13);
    }

    /**
     * Setter for <code>drm.timetable_settings.company_exit</code>.
     */
    public void setCompanyExit(java.lang.Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.company_exit</code>.
     */
    public java.lang.Boolean getCompanyExit() {
        return (java.lang.Boolean) get(14);
    }

    /**
     * Setter for <code>drm.timetable_settings.manage_stamp</code>.
     */
    public void setManageStamp(java.lang.Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.manage_stamp</code>.
     */
    public java.lang.Boolean getManageStamp() {
        return (java.lang.Boolean) get(15);
    }

    /**
     * Setter for <code>drm.timetable_settings.medical_visits_automatically_approved</code>.
     */
    public void setMedicalVisitsAutomaticallyApproved(java.lang.Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.medical_visits_automatically_approved</code>.
     */
    public java.lang.Boolean getMedicalVisitsAutomaticallyApproved() {
        return (java.lang.Boolean) get(16);
    }

    /**
     * Setter for <code>drm.timetable_settings.calendar_user_id</code>.
     */
    public void setCalendarUserId(java.lang.String value) {
        set(17, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.calendar_user_id</code>.
     */
    public java.lang.String getCalendarUserId() {
        return (java.lang.String) get(17);
    }

    /**
     * Setter for <code>drm.timetable_settings.default_event_activity_id</code>.
     */
    public void setDefaultEventActivityId(java.lang.Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.default_event_activity_id</code>.
     */
    public java.lang.Integer getDefaultEventActivityId() {
        return (java.lang.Integer) get(18);
    }

    /**
     * Setter for <code>drm.timetable_settings.requests_sickness</code>.
     */
    public void setRequestsSickness(java.lang.Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.requests_sickness</code>.
     */
    public java.lang.Boolean getRequestsSickness() {
        return (java.lang.Boolean) get(19);
    }

    /**
     * Setter for <code>drm.timetable_settings.sickness_automatically_approved</code>.
     */
    public void setSicknessAutomaticallyApproved(java.lang.Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.sickness_automatically_approved</code>.
     */
    public java.lang.Boolean getSicknessAutomaticallyApproved() {
        return (java.lang.Boolean) get(20);
    }

    /**
     * Setter for <code>drm.timetable_settings.default_causal_working_hours</code>.
     */
    public void setDefaultCausalWorkingHours(java.lang.String value) {
        set(21, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.default_causal_working_hours</code>.
     */
    public java.lang.String getDefaultCausalWorkingHours() {
        return (java.lang.String) get(21);
    }

    /**
     * Setter for <code>drm.timetable_settings.default_causal_overtime</code>.
     */
    public void setDefaultCausalOvertime(java.lang.String value) {
        set(22, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.default_causal_overtime</code>.
     */
    public java.lang.String getDefaultCausalOvertime() {
        return (java.lang.String) get(22);
    }

    /**
     * Setter for <code>drm.timetable_settings.default_causal_permits</code>.
     */
    public void setDefaultCausalPermits(java.lang.String value) {
        set(23, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.default_causal_permits</code>.
     */
    public java.lang.String getDefaultCausalPermits() {
        return (java.lang.String) get(23);
    }

    /**
     * Setter for <code>drm.timetable_settings.default_causal_holidays</code>.
     */
    public void setDefaultCausalHolidays(java.lang.String value) {
        set(24, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.default_causal_holidays</code>.
     */
    public java.lang.String getDefaultCausalHolidays() {
        return (java.lang.String) get(24);
    }

    /**
     * Setter for <code>drm.timetable_settings.default_causal_sickness</code>.
     */
    public void setDefaultCausalSickness(java.lang.String value) {
        set(25, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.default_causal_sickness</code>.
     */
    public java.lang.String getDefaultCausalSickness() {
        return (java.lang.String) get(25);
    }

    /**
     * Setter for <code>drm.timetable_settings.default_causal_medical_visit</code>.
     */
    public void setDefaultCausalMedicalVisit(java.lang.String value) {
        set(26, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.default_causal_medical_visit</code>.
     */
    public java.lang.String getDefaultCausalMedicalVisit() {
        return (java.lang.String) get(26);
    }

    /**
     * Setter for <code>drm.timetable_settings.minimum_number_of_hours_per_ticket</code>.
     */
    public void setMinimumNumberOfHoursPerTicket(java.lang.Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.minimum_number_of_hours_per_ticket</code>.
     */
    public java.lang.Integer getMinimumNumberOfHoursPerTicket() {
        return (java.lang.Integer) get(27);
    }

    /**
     * Setter for <code>drm.timetable_settings.ticket_management</code>.
     */
    public void setTicketManagement(java.lang.Boolean value) {
        set(28, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.ticket_management</code>.
     */
    public java.lang.Boolean getTicketManagement() {
        return (java.lang.Boolean) get(28);
    }

    /**
     * Setter for <code>drm.timetable_settings.automatic_overtime</code>.
     */
    public void setAutomaticOvertime(java.lang.Boolean value) {
        set(29, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.automatic_overtime</code>.
     */
    public java.lang.Boolean getAutomaticOvertime() {
        return (java.lang.Boolean) get(29);
    }

    /**
     * Setter for <code>drm.timetable_settings.default_stamping_mode</code>.
     */
    public void setDefaultStampingMode(java.lang.String value) {
        set(30, value);
    }

    /**
     * Getter for <code>drm.timetable_settings.default_stamping_mode</code>.
     */
    public java.lang.String getDefaultStampingMode() {
        return (java.lang.String) get(30);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TimetableSettingsRecord
     */
    public TimetableSettingsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.TimetableSettings.TIMETABLE_SETTINGS);
    }

    /**
     * Create a detached, initialised TimetableSettingsRecord
     */
    public TimetableSettingsRecord(java.lang.Integer timetableSettingId, java.lang.String domainId, java.lang.String allowedAddresses, java.lang.String allowedUsers, java.lang.String staffOfficeEmail, java.lang.Boolean requestsHolidaysPermitsPreviousDates, java.lang.String totalToleranceInMinutes, java.lang.String rounding, java.lang.String minimumExtraordinary, java.lang.Boolean breakAnomaly, java.lang.Boolean readOnlyEvents, java.lang.Boolean requestsPermitsNotRemunered, java.lang.Boolean requestsPermitsMedicalVisits, java.lang.Boolean requestsPermitsContractuals, java.lang.Boolean companyExit, java.lang.Boolean manageStamp, java.lang.Boolean medicalVisitsAutomaticallyApproved, java.lang.String calendarUserId, java.lang.Integer defaultEventActivityId, java.lang.Boolean requestsSickness, java.lang.Boolean sicknessAutomaticallyApproved, java.lang.String defaultCausalWorkingHours, java.lang.String defaultCausalOvertime, java.lang.String defaultCausalPermits, java.lang.String defaultCausalHolidays, java.lang.String defaultCausalSickness, java.lang.String defaultCausalMedicalVisit, java.lang.Integer minimumNumberOfHoursPerTicket, java.lang.Boolean ticketManagement, java.lang.Boolean automaticOvertime, java.lang.String defaultStampingMode) {
        super(com.sonicle.webtop.drm.jooq.tables.TimetableSettings.TIMETABLE_SETTINGS);

        setTimetableSettingId(timetableSettingId);
        setDomainId(domainId);
        setAllowedAddresses(allowedAddresses);
        setAllowedUsers(allowedUsers);
        setStaffOfficeEmail(staffOfficeEmail);
        setRequestsHolidaysPermitsPreviousDates(requestsHolidaysPermitsPreviousDates);
        setTotalToleranceInMinutes(totalToleranceInMinutes);
        setRounding(rounding);
        setMinimumExtraordinary(minimumExtraordinary);
        setBreakAnomaly(breakAnomaly);
        setReadOnlyEvents(readOnlyEvents);
        setRequestsPermitsNotRemunered(requestsPermitsNotRemunered);
        setRequestsPermitsMedicalVisits(requestsPermitsMedicalVisits);
        setRequestsPermitsContractuals(requestsPermitsContractuals);
        setCompanyExit(companyExit);
        setManageStamp(manageStamp);
        setMedicalVisitsAutomaticallyApproved(medicalVisitsAutomaticallyApproved);
        setCalendarUserId(calendarUserId);
        setDefaultEventActivityId(defaultEventActivityId);
        setRequestsSickness(requestsSickness);
        setSicknessAutomaticallyApproved(sicknessAutomaticallyApproved);
        setDefaultCausalWorkingHours(defaultCausalWorkingHours);
        setDefaultCausalOvertime(defaultCausalOvertime);
        setDefaultCausalPermits(defaultCausalPermits);
        setDefaultCausalHolidays(defaultCausalHolidays);
        setDefaultCausalSickness(defaultCausalSickness);
        setDefaultCausalMedicalVisit(defaultCausalMedicalVisit);
        setMinimumNumberOfHoursPerTicket(minimumNumberOfHoursPerTicket);
        setTicketManagement(ticketManagement);
        setAutomaticOvertime(automaticOvertime);
        setDefaultStampingMode(defaultStampingMode);
    }
}
