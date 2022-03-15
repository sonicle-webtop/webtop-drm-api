/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimetableReportTemp implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer           id;
    private java.lang.String            domainId;
    private java.lang.String            userId;
    private java.lang.Integer           companyId;
    private org.joda.time.LocalDateTime date;
    private java.lang.String            workingHours;
    private java.lang.String            overtime;
    private java.lang.String            paidLeave;
    private java.lang.String            unpaidLeave;
    private java.lang.String            holiday;
    private java.lang.String            medicalVisit;
    private java.lang.String            contractual;
    private java.lang.String            causal;
    private java.lang.String            hour;
    private java.lang.String            detail;
    private java.lang.String            note;
    private java.lang.String            targetUserId;
    private java.lang.String            workReportHours;
    private java.lang.String            jobHours;
    private java.lang.String            sickness;
    private java.lang.String            other;
    private java.lang.String            causalId;
    private java.lang.String            totalLineHour;
    private java.lang.Boolean           hasRequests;

    public TimetableReportTemp() {}

    public TimetableReportTemp(TimetableReportTemp value) {
        this.id = value.id;
        this.domainId = value.domainId;
        this.userId = value.userId;
        this.companyId = value.companyId;
        this.date = value.date;
        this.workingHours = value.workingHours;
        this.overtime = value.overtime;
        this.paidLeave = value.paidLeave;
        this.unpaidLeave = value.unpaidLeave;
        this.holiday = value.holiday;
        this.medicalVisit = value.medicalVisit;
        this.contractual = value.contractual;
        this.causal = value.causal;
        this.hour = value.hour;
        this.detail = value.detail;
        this.note = value.note;
        this.targetUserId = value.targetUserId;
        this.workReportHours = value.workReportHours;
        this.jobHours = value.jobHours;
        this.sickness = value.sickness;
        this.other = value.other;
        this.causalId = value.causalId;
        this.totalLineHour = value.totalLineHour;
        this.hasRequests = value.hasRequests;
    }

    public TimetableReportTemp(
        java.lang.Integer           id,
        java.lang.String            domainId,
        java.lang.String            userId,
        java.lang.Integer           companyId,
        org.joda.time.LocalDateTime date,
        java.lang.String            workingHours,
        java.lang.String            overtime,
        java.lang.String            paidLeave,
        java.lang.String            unpaidLeave,
        java.lang.String            holiday,
        java.lang.String            medicalVisit,
        java.lang.String            contractual,
        java.lang.String            causal,
        java.lang.String            hour,
        java.lang.String            detail,
        java.lang.String            note,
        java.lang.String            targetUserId,
        java.lang.String            workReportHours,
        java.lang.String            jobHours,
        java.lang.String            sickness,
        java.lang.String            other,
        java.lang.String            causalId,
        java.lang.String            totalLineHour,
        java.lang.Boolean           hasRequests
    ) {
        this.id = id;
        this.domainId = domainId;
        this.userId = userId;
        this.companyId = companyId;
        this.date = date;
        this.workingHours = workingHours;
        this.overtime = overtime;
        this.paidLeave = paidLeave;
        this.unpaidLeave = unpaidLeave;
        this.holiday = holiday;
        this.medicalVisit = medicalVisit;
        this.contractual = contractual;
        this.causal = causal;
        this.hour = hour;
        this.detail = detail;
        this.note = note;
        this.targetUserId = targetUserId;
        this.workReportHours = workReportHours;
        this.jobHours = jobHours;
        this.sickness = sickness;
        this.other = other;
        this.causalId = causalId;
        this.totalLineHour = totalLineHour;
        this.hasRequests = hasRequests;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.id</code>.
     */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.id</code>.
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.user_id</code>.
     */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.user_id</code>.
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.company_id</code>.
     */
    public java.lang.Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.company_id</code>.
     */
    public void setCompanyId(java.lang.Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.date</code>.
     */
    public org.joda.time.LocalDateTime getDate() {
        return this.date;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.date</code>.
     */
    public void setDate(org.joda.time.LocalDateTime date) {
        this.date = date;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.working_hours</code>.
     */
    public java.lang.String getWorkingHours() {
        return this.workingHours;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.working_hours</code>.
     */
    public void setWorkingHours(java.lang.String workingHours) {
        this.workingHours = workingHours;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.overtime</code>.
     */
    public java.lang.String getOvertime() {
        return this.overtime;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.overtime</code>.
     */
    public void setOvertime(java.lang.String overtime) {
        this.overtime = overtime;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.paid_leave</code>.
     */
    public java.lang.String getPaidLeave() {
        return this.paidLeave;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.paid_leave</code>.
     */
    public void setPaidLeave(java.lang.String paidLeave) {
        this.paidLeave = paidLeave;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.unpaid_leave</code>.
     */
    public java.lang.String getUnpaidLeave() {
        return this.unpaidLeave;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.unpaid_leave</code>.
     */
    public void setUnpaidLeave(java.lang.String unpaidLeave) {
        this.unpaidLeave = unpaidLeave;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.holiday</code>.
     */
    public java.lang.String getHoliday() {
        return this.holiday;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.holiday</code>.
     */
    public void setHoliday(java.lang.String holiday) {
        this.holiday = holiday;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.medical_visit</code>.
     */
    public java.lang.String getMedicalVisit() {
        return this.medicalVisit;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.medical_visit</code>.
     */
    public void setMedicalVisit(java.lang.String medicalVisit) {
        this.medicalVisit = medicalVisit;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.contractual</code>.
     */
    public java.lang.String getContractual() {
        return this.contractual;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.contractual</code>.
     */
    public void setContractual(java.lang.String contractual) {
        this.contractual = contractual;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.causal</code>.
     */
    public java.lang.String getCausal() {
        return this.causal;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.causal</code>.
     */
    public void setCausal(java.lang.String causal) {
        this.causal = causal;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.hour</code>.
     */
    public java.lang.String getHour() {
        return this.hour;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.hour</code>.
     */
    public void setHour(java.lang.String hour) {
        this.hour = hour;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.detail</code>.
     */
    public java.lang.String getDetail() {
        return this.detail;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.detail</code>.
     */
    public void setDetail(java.lang.String detail) {
        this.detail = detail;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.note</code>.
     */
    public java.lang.String getNote() {
        return this.note;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.note</code>.
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.target_user_id</code>.
     */
    public java.lang.String getTargetUserId() {
        return this.targetUserId;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.target_user_id</code>.
     */
    public void setTargetUserId(java.lang.String targetUserId) {
        this.targetUserId = targetUserId;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.work_report_hours</code>.
     */
    public java.lang.String getWorkReportHours() {
        return this.workReportHours;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.work_report_hours</code>.
     */
    public void setWorkReportHours(java.lang.String workReportHours) {
        this.workReportHours = workReportHours;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.job_hours</code>.
     */
    public java.lang.String getJobHours() {
        return this.jobHours;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.job_hours</code>.
     */
    public void setJobHours(java.lang.String jobHours) {
        this.jobHours = jobHours;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.sickness</code>.
     */
    public java.lang.String getSickness() {
        return this.sickness;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.sickness</code>.
     */
    public void setSickness(java.lang.String sickness) {
        this.sickness = sickness;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.other</code>.
     */
    public java.lang.String getOther() {
        return this.other;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.other</code>.
     */
    public void setOther(java.lang.String other) {
        this.other = other;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.causal_id</code>.
     */
    public java.lang.String getCausalId() {
        return this.causalId;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.causal_id</code>.
     */
    public void setCausalId(java.lang.String causalId) {
        this.causalId = causalId;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.total_line_hour</code>.
     */
    public java.lang.String getTotalLineHour() {
        return this.totalLineHour;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.total_line_hour</code>.
     */
    public void setTotalLineHour(java.lang.String totalLineHour) {
        this.totalLineHour = totalLineHour;
    }

    /**
     * Getter for <code>drm.timetable_report_temp.has_requests</code>.
     */
    public java.lang.Boolean getHasRequests() {
        return this.hasRequests;
    }

    /**
     * Setter for <code>drm.timetable_report_temp.has_requests</code>.
     */
    public void setHasRequests(java.lang.Boolean hasRequests) {
        this.hasRequests = hasRequests;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimetableReportTemp (");

        sb.append(id);
        sb.append(", ").append(domainId);
        sb.append(", ").append(userId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(date);
        sb.append(", ").append(workingHours);
        sb.append(", ").append(overtime);
        sb.append(", ").append(paidLeave);
        sb.append(", ").append(unpaidLeave);
        sb.append(", ").append(holiday);
        sb.append(", ").append(medicalVisit);
        sb.append(", ").append(contractual);
        sb.append(", ").append(causal);
        sb.append(", ").append(hour);
        sb.append(", ").append(detail);
        sb.append(", ").append(note);
        sb.append(", ").append(targetUserId);
        sb.append(", ").append(workReportHours);
        sb.append(", ").append(jobHours);
        sb.append(", ").append(sickness);
        sb.append(", ").append(other);
        sb.append(", ").append(causalId);
        sb.append(", ").append(totalLineHour);
        sb.append(", ").append(hasRequests);

        sb.append(")");
        return sb.toString();
    }
}
