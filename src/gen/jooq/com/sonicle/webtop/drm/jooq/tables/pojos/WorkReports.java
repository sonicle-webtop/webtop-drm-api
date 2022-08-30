/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkReports implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String        workReportId;
    private java.lang.Integer       companyId;
    private java.lang.String        operatorId;
    private java.lang.String        revisionStatus;
    private org.joda.time.DateTime  revisionTimestamp;
    private java.lang.Integer       revisionSequence;
    private java.lang.Integer       docStatusId;
    private java.lang.Integer       contactId;
    private java.lang.String        customerId;
    private java.lang.String        customerStatId;
    private org.joda.time.LocalDate fromDate;
    private org.joda.time.LocalDate toDate;
    private java.lang.String        referenceNo;
    private java.lang.Integer       causalId;
    private java.lang.String        ddtNo;
    private org.joda.time.LocalDate ddtDate;
    private java.lang.String        notes;
    private java.lang.String        description;
    private java.lang.Boolean       applySignature;
    private java.lang.Boolean       chargeTo;
    private java.lang.Boolean       freeSupport;
    private java.lang.Integer       businessTripId;
    private java.lang.Short         businessTripDays;
    private java.lang.Integer       number;
    private java.lang.Integer       year;
    private java.lang.Integer       eventId;
    private java.lang.Integer       timetableHours;
    private java.lang.String        domainId;

    public WorkReports() {}

    public WorkReports(WorkReports value) {
        this.workReportId = value.workReportId;
        this.companyId = value.companyId;
        this.operatorId = value.operatorId;
        this.revisionStatus = value.revisionStatus;
        this.revisionTimestamp = value.revisionTimestamp;
        this.revisionSequence = value.revisionSequence;
        this.docStatusId = value.docStatusId;
        this.contactId = value.contactId;
        this.customerId = value.customerId;
        this.customerStatId = value.customerStatId;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
        this.referenceNo = value.referenceNo;
        this.causalId = value.causalId;
        this.ddtNo = value.ddtNo;
        this.ddtDate = value.ddtDate;
        this.notes = value.notes;
        this.description = value.description;
        this.applySignature = value.applySignature;
        this.chargeTo = value.chargeTo;
        this.freeSupport = value.freeSupport;
        this.businessTripId = value.businessTripId;
        this.businessTripDays = value.businessTripDays;
        this.number = value.number;
        this.year = value.year;
        this.eventId = value.eventId;
        this.timetableHours = value.timetableHours;
        this.domainId = value.domainId;
    }

    public WorkReports(
        java.lang.String        workReportId,
        java.lang.Integer       companyId,
        java.lang.String        operatorId,
        java.lang.String        revisionStatus,
        org.joda.time.DateTime  revisionTimestamp,
        java.lang.Integer       revisionSequence,
        java.lang.Integer       docStatusId,
        java.lang.Integer       contactId,
        java.lang.String        customerId,
        java.lang.String        customerStatId,
        org.joda.time.LocalDate fromDate,
        org.joda.time.LocalDate toDate,
        java.lang.String        referenceNo,
        java.lang.Integer       causalId,
        java.lang.String        ddtNo,
        org.joda.time.LocalDate ddtDate,
        java.lang.String        notes,
        java.lang.String        description,
        java.lang.Boolean       applySignature,
        java.lang.Boolean       chargeTo,
        java.lang.Boolean       freeSupport,
        java.lang.Integer       businessTripId,
        java.lang.Short         businessTripDays,
        java.lang.Integer       number,
        java.lang.Integer       year,
        java.lang.Integer       eventId,
        java.lang.Integer       timetableHours,
        java.lang.String        domainId
    ) {
        this.workReportId = workReportId;
        this.companyId = companyId;
        this.operatorId = operatorId;
        this.revisionStatus = revisionStatus;
        this.revisionTimestamp = revisionTimestamp;
        this.revisionSequence = revisionSequence;
        this.docStatusId = docStatusId;
        this.contactId = contactId;
        this.customerId = customerId;
        this.customerStatId = customerStatId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.referenceNo = referenceNo;
        this.causalId = causalId;
        this.ddtNo = ddtNo;
        this.ddtDate = ddtDate;
        this.notes = notes;
        this.description = description;
        this.applySignature = applySignature;
        this.chargeTo = chargeTo;
        this.freeSupport = freeSupport;
        this.businessTripId = businessTripId;
        this.businessTripDays = businessTripDays;
        this.number = number;
        this.year = year;
        this.eventId = eventId;
        this.timetableHours = timetableHours;
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.work_reports.work_report_id</code>.
     */
    public java.lang.String getWorkReportId() {
        return this.workReportId;
    }

    /**
     * Setter for <code>drm.work_reports.work_report_id</code>.
     */
    public void setWorkReportId(java.lang.String workReportId) {
        this.workReportId = workReportId;
    }

    /**
     * Getter for <code>drm.work_reports.company_id</code>.
     */
    public java.lang.Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>drm.work_reports.company_id</code>.
     */
    public void setCompanyId(java.lang.Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * Getter for <code>drm.work_reports.operator_id</code>.
     */
    public java.lang.String getOperatorId() {
        return this.operatorId;
    }

    /**
     * Setter for <code>drm.work_reports.operator_id</code>.
     */
    public void setOperatorId(java.lang.String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * Getter for <code>drm.work_reports.revision_status</code>.
     */
    public java.lang.String getRevisionStatus() {
        return this.revisionStatus;
    }

    /**
     * Setter for <code>drm.work_reports.revision_status</code>.
     */
    public void setRevisionStatus(java.lang.String revisionStatus) {
        this.revisionStatus = revisionStatus;
    }

    /**
     * Getter for <code>drm.work_reports.revision_timestamp</code>.
     */
    public org.joda.time.DateTime getRevisionTimestamp() {
        return this.revisionTimestamp;
    }

    /**
     * Setter for <code>drm.work_reports.revision_timestamp</code>.
     */
    public void setRevisionTimestamp(org.joda.time.DateTime revisionTimestamp) {
        this.revisionTimestamp = revisionTimestamp;
    }

    /**
     * Getter for <code>drm.work_reports.revision_sequence</code>.
     */
    public java.lang.Integer getRevisionSequence() {
        return this.revisionSequence;
    }

    /**
     * Setter for <code>drm.work_reports.revision_sequence</code>.
     */
    public void setRevisionSequence(java.lang.Integer revisionSequence) {
        this.revisionSequence = revisionSequence;
    }

    /**
     * Getter for <code>drm.work_reports.doc_status_id</code>.
     */
    public java.lang.Integer getDocStatusId() {
        return this.docStatusId;
    }

    /**
     * Setter for <code>drm.work_reports.doc_status_id</code>.
     */
    public void setDocStatusId(java.lang.Integer docStatusId) {
        this.docStatusId = docStatusId;
    }

    /**
     * Getter for <code>drm.work_reports.contact_id</code>.
     */
    public java.lang.Integer getContactId() {
        return this.contactId;
    }

    /**
     * Setter for <code>drm.work_reports.contact_id</code>.
     */
    public void setContactId(java.lang.Integer contactId) {
        this.contactId = contactId;
    }

    /**
     * Getter for <code>drm.work_reports.customer_id</code>.
     */
    public java.lang.String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>drm.work_reports.customer_id</code>.
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for <code>drm.work_reports.customer_stat_id</code>.
     */
    public java.lang.String getCustomerStatId() {
        return this.customerStatId;
    }

    /**
     * Setter for <code>drm.work_reports.customer_stat_id</code>.
     */
    public void setCustomerStatId(java.lang.String customerStatId) {
        this.customerStatId = customerStatId;
    }

    /**
     * Getter for <code>drm.work_reports.from_date</code>.
     */
    public org.joda.time.LocalDate getFromDate() {
        return this.fromDate;
    }

    /**
     * Setter for <code>drm.work_reports.from_date</code>.
     */
    public void setFromDate(org.joda.time.LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Getter for <code>drm.work_reports.to_date</code>.
     */
    public org.joda.time.LocalDate getToDate() {
        return this.toDate;
    }

    /**
     * Setter for <code>drm.work_reports.to_date</code>.
     */
    public void setToDate(org.joda.time.LocalDate toDate) {
        this.toDate = toDate;
    }

    /**
     * Getter for <code>drm.work_reports.reference_no</code>.
     */
    public java.lang.String getReferenceNo() {
        return this.referenceNo;
    }

    /**
     * Setter for <code>drm.work_reports.reference_no</code>.
     */
    public void setReferenceNo(java.lang.String referenceNo) {
        this.referenceNo = referenceNo;
    }

    /**
     * Getter for <code>drm.work_reports.causal_id</code>.
     */
    public java.lang.Integer getCausalId() {
        return this.causalId;
    }

    /**
     * Setter for <code>drm.work_reports.causal_id</code>.
     */
    public void setCausalId(java.lang.Integer causalId) {
        this.causalId = causalId;
    }

    /**
     * Getter for <code>drm.work_reports.ddt_no</code>.
     */
    public java.lang.String getDdtNo() {
        return this.ddtNo;
    }

    /**
     * Setter for <code>drm.work_reports.ddt_no</code>.
     */
    public void setDdtNo(java.lang.String ddtNo) {
        this.ddtNo = ddtNo;
    }

    /**
     * Getter for <code>drm.work_reports.ddt_date</code>.
     */
    public org.joda.time.LocalDate getDdtDate() {
        return this.ddtDate;
    }

    /**
     * Setter for <code>drm.work_reports.ddt_date</code>.
     */
    public void setDdtDate(org.joda.time.LocalDate ddtDate) {
        this.ddtDate = ddtDate;
    }

    /**
     * Getter for <code>drm.work_reports.notes</code>.
     */
    public java.lang.String getNotes() {
        return this.notes;
    }

    /**
     * Setter for <code>drm.work_reports.notes</code>.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    /**
     * Getter for <code>drm.work_reports.description</code>.
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>drm.work_reports.description</code>.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Getter for <code>drm.work_reports.apply_signature</code>.
     */
    public java.lang.Boolean getApplySignature() {
        return this.applySignature;
    }

    /**
     * Setter for <code>drm.work_reports.apply_signature</code>.
     */
    public void setApplySignature(java.lang.Boolean applySignature) {
        this.applySignature = applySignature;
    }

    /**
     * Getter for <code>drm.work_reports.charge_to</code>.
     */
    public java.lang.Boolean getChargeTo() {
        return this.chargeTo;
    }

    /**
     * Setter for <code>drm.work_reports.charge_to</code>.
     */
    public void setChargeTo(java.lang.Boolean chargeTo) {
        this.chargeTo = chargeTo;
    }

    /**
     * Getter for <code>drm.work_reports.free_support</code>.
     */
    public java.lang.Boolean getFreeSupport() {
        return this.freeSupport;
    }

    /**
     * Setter for <code>drm.work_reports.free_support</code>.
     */
    public void setFreeSupport(java.lang.Boolean freeSupport) {
        this.freeSupport = freeSupport;
    }

    /**
     * Getter for <code>drm.work_reports.business_trip_id</code>.
     */
    public java.lang.Integer getBusinessTripId() {
        return this.businessTripId;
    }

    /**
     * Setter for <code>drm.work_reports.business_trip_id</code>.
     */
    public void setBusinessTripId(java.lang.Integer businessTripId) {
        this.businessTripId = businessTripId;
    }

    /**
     * Getter for <code>drm.work_reports.business_trip_days</code>.
     */
    public java.lang.Short getBusinessTripDays() {
        return this.businessTripDays;
    }

    /**
     * Setter for <code>drm.work_reports.business_trip_days</code>.
     */
    public void setBusinessTripDays(java.lang.Short businessTripDays) {
        this.businessTripDays = businessTripDays;
    }

    /**
     * Getter for <code>drm.work_reports.number</code>.
     */
    public java.lang.Integer getNumber() {
        return this.number;
    }

    /**
     * Setter for <code>drm.work_reports.number</code>.
     */
    public void setNumber(java.lang.Integer number) {
        this.number = number;
    }

    /**
     * Getter for <code>drm.work_reports.year</code>.
     */
    public java.lang.Integer getYear() {
        return this.year;
    }

    /**
     * Setter for <code>drm.work_reports.year</code>.
     */
    public void setYear(java.lang.Integer year) {
        this.year = year;
    }

    /**
     * Getter for <code>drm.work_reports.event_id</code>.
     */
    public java.lang.Integer getEventId() {
        return this.eventId;
    }

    /**
     * Setter for <code>drm.work_reports.event_id</code>.
     */
    public void setEventId(java.lang.Integer eventId) {
        this.eventId = eventId;
    }

    /**
     * Getter for <code>drm.work_reports.timetable_hours</code>.
     */
    public java.lang.Integer getTimetableHours() {
        return this.timetableHours;
    }

    /**
     * Setter for <code>drm.work_reports.timetable_hours</code>.
     */
    public void setTimetableHours(java.lang.Integer timetableHours) {
        this.timetableHours = timetableHours;
    }

    /**
     * Getter for <code>drm.work_reports.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.work_reports.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkReports (");

        sb.append(workReportId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(operatorId);
        sb.append(", ").append(revisionStatus);
        sb.append(", ").append(revisionTimestamp);
        sb.append(", ").append(revisionSequence);
        sb.append(", ").append(docStatusId);
        sb.append(", ").append(contactId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(customerStatId);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);
        sb.append(", ").append(referenceNo);
        sb.append(", ").append(causalId);
        sb.append(", ").append(ddtNo);
        sb.append(", ").append(ddtDate);
        sb.append(", ").append(notes);
        sb.append(", ").append(description);
        sb.append(", ").append(applySignature);
        sb.append(", ").append(chargeTo);
        sb.append(", ").append(freeSupport);
        sb.append(", ").append(businessTripId);
        sb.append(", ").append(businessTripDays);
        sb.append(", ").append(number);
        sb.append(", ").append(year);
        sb.append(", ").append(eventId);
        sb.append(", ").append(timetableHours);
        sb.append(", ").append(domainId);

        sb.append(")");
        return sb.toString();
    }
}