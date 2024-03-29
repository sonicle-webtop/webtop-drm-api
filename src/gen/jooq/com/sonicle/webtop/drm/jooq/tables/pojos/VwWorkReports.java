/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VwWorkReports implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String        workReportId;
    private java.lang.String        domainId;
    private java.lang.Integer       number;
    private java.lang.Integer       year;
    private java.lang.String        referenceNo;
    private java.lang.String        operatorId;
    private java.lang.String        operatorDescription;
    private java.lang.String        customerId;
    private java.lang.String        customerDescription;
    private java.lang.String        customerStatId;
    private java.lang.String        customerStatDescription;
    private java.lang.Integer       causalId;
    private java.lang.String        causalDescription;
    private org.joda.time.LocalDate fromDate;
    private org.joda.time.LocalDate toDate;
    private java.lang.Integer       businessTripId;
    private java.lang.String        businessTripDescription;
    private java.lang.String        revisionStatus;
    private java.lang.Boolean       chargeTo;
    private java.lang.Boolean       freeSupport;
    private java.lang.Integer       companyId;
    private java.lang.String        companyDescription;
    private java.lang.Integer       docStatusId;
    private java.lang.String        docStatusDescription;
    private java.lang.String        description;
    private java.lang.String        notes;
    private java.lang.Long          totHours;

    public VwWorkReports() {}

    public VwWorkReports(VwWorkReports value) {
        this.workReportId = value.workReportId;
        this.domainId = value.domainId;
        this.number = value.number;
        this.year = value.year;
        this.referenceNo = value.referenceNo;
        this.operatorId = value.operatorId;
        this.operatorDescription = value.operatorDescription;
        this.customerId = value.customerId;
        this.customerDescription = value.customerDescription;
        this.customerStatId = value.customerStatId;
        this.customerStatDescription = value.customerStatDescription;
        this.causalId = value.causalId;
        this.causalDescription = value.causalDescription;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
        this.businessTripId = value.businessTripId;
        this.businessTripDescription = value.businessTripDescription;
        this.revisionStatus = value.revisionStatus;
        this.chargeTo = value.chargeTo;
        this.freeSupport = value.freeSupport;
        this.companyId = value.companyId;
        this.companyDescription = value.companyDescription;
        this.docStatusId = value.docStatusId;
        this.docStatusDescription = value.docStatusDescription;
        this.description = value.description;
        this.notes = value.notes;
        this.totHours = value.totHours;
    }

    public VwWorkReports(
        java.lang.String        workReportId,
        java.lang.String        domainId,
        java.lang.Integer       number,
        java.lang.Integer       year,
        java.lang.String        referenceNo,
        java.lang.String        operatorId,
        java.lang.String        operatorDescription,
        java.lang.String        customerId,
        java.lang.String        customerDescription,
        java.lang.String        customerStatId,
        java.lang.String        customerStatDescription,
        java.lang.Integer       causalId,
        java.lang.String        causalDescription,
        org.joda.time.LocalDate fromDate,
        org.joda.time.LocalDate toDate,
        java.lang.Integer       businessTripId,
        java.lang.String        businessTripDescription,
        java.lang.String        revisionStatus,
        java.lang.Boolean       chargeTo,
        java.lang.Boolean       freeSupport,
        java.lang.Integer       companyId,
        java.lang.String        companyDescription,
        java.lang.Integer       docStatusId,
        java.lang.String        docStatusDescription,
        java.lang.String        description,
        java.lang.String        notes,
        java.lang.Long          totHours
    ) {
        this.workReportId = workReportId;
        this.domainId = domainId;
        this.number = number;
        this.year = year;
        this.referenceNo = referenceNo;
        this.operatorId = operatorId;
        this.operatorDescription = operatorDescription;
        this.customerId = customerId;
        this.customerDescription = customerDescription;
        this.customerStatId = customerStatId;
        this.customerStatDescription = customerStatDescription;
        this.causalId = causalId;
        this.causalDescription = causalDescription;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.businessTripId = businessTripId;
        this.businessTripDescription = businessTripDescription;
        this.revisionStatus = revisionStatus;
        this.chargeTo = chargeTo;
        this.freeSupport = freeSupport;
        this.companyId = companyId;
        this.companyDescription = companyDescription;
        this.docStatusId = docStatusId;
        this.docStatusDescription = docStatusDescription;
        this.description = description;
        this.notes = notes;
        this.totHours = totHours;
    }

    /**
     * Getter for <code>drm.vw_work_reports.work_report_id</code>.
     */
    public java.lang.String getWorkReportId() {
        return this.workReportId;
    }

    /**
     * Setter for <code>drm.vw_work_reports.work_report_id</code>.
     */
    public void setWorkReportId(java.lang.String workReportId) {
        this.workReportId = workReportId;
    }

    /**
     * Getter for <code>drm.vw_work_reports.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.vw_work_reports.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.vw_work_reports.number</code>.
     */
    public java.lang.Integer getNumber() {
        return this.number;
    }

    /**
     * Setter for <code>drm.vw_work_reports.number</code>.
     */
    public void setNumber(java.lang.Integer number) {
        this.number = number;
    }

    /**
     * Getter for <code>drm.vw_work_reports.year</code>.
     */
    public java.lang.Integer getYear() {
        return this.year;
    }

    /**
     * Setter for <code>drm.vw_work_reports.year</code>.
     */
    public void setYear(java.lang.Integer year) {
        this.year = year;
    }

    /**
     * Getter for <code>drm.vw_work_reports.reference_no</code>.
     */
    public java.lang.String getReferenceNo() {
        return this.referenceNo;
    }

    /**
     * Setter for <code>drm.vw_work_reports.reference_no</code>.
     */
    public void setReferenceNo(java.lang.String referenceNo) {
        this.referenceNo = referenceNo;
    }

    /**
     * Getter for <code>drm.vw_work_reports.operator_id</code>.
     */
    public java.lang.String getOperatorId() {
        return this.operatorId;
    }

    /**
     * Setter for <code>drm.vw_work_reports.operator_id</code>.
     */
    public void setOperatorId(java.lang.String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * Getter for <code>drm.vw_work_reports.operator_description</code>.
     */
    public java.lang.String getOperatorDescription() {
        return this.operatorDescription;
    }

    /**
     * Setter for <code>drm.vw_work_reports.operator_description</code>.
     */
    public void setOperatorDescription(java.lang.String operatorDescription) {
        this.operatorDescription = operatorDescription;
    }

    /**
     * Getter for <code>drm.vw_work_reports.customer_id</code>.
     */
    public java.lang.String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>drm.vw_work_reports.customer_id</code>.
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for <code>drm.vw_work_reports.customer_description</code>.
     */
    public java.lang.String getCustomerDescription() {
        return this.customerDescription;
    }

    /**
     * Setter for <code>drm.vw_work_reports.customer_description</code>.
     */
    public void setCustomerDescription(java.lang.String customerDescription) {
        this.customerDescription = customerDescription;
    }

    /**
     * Getter for <code>drm.vw_work_reports.customer_stat_id</code>.
     */
    public java.lang.String getCustomerStatId() {
        return this.customerStatId;
    }

    /**
     * Setter for <code>drm.vw_work_reports.customer_stat_id</code>.
     */
    public void setCustomerStatId(java.lang.String customerStatId) {
        this.customerStatId = customerStatId;
    }

    /**
     * Getter for <code>drm.vw_work_reports.customer_stat_description</code>.
     */
    public java.lang.String getCustomerStatDescription() {
        return this.customerStatDescription;
    }

    /**
     * Setter for <code>drm.vw_work_reports.customer_stat_description</code>.
     */
    public void setCustomerStatDescription(java.lang.String customerStatDescription) {
        this.customerStatDescription = customerStatDescription;
    }

    /**
     * Getter for <code>drm.vw_work_reports.causal_id</code>.
     */
    public java.lang.Integer getCausalId() {
        return this.causalId;
    }

    /**
     * Setter for <code>drm.vw_work_reports.causal_id</code>.
     */
    public void setCausalId(java.lang.Integer causalId) {
        this.causalId = causalId;
    }

    /**
     * Getter for <code>drm.vw_work_reports.causal_description</code>.
     */
    public java.lang.String getCausalDescription() {
        return this.causalDescription;
    }

    /**
     * Setter for <code>drm.vw_work_reports.causal_description</code>.
     */
    public void setCausalDescription(java.lang.String causalDescription) {
        this.causalDescription = causalDescription;
    }

    /**
     * Getter for <code>drm.vw_work_reports.from_date</code>.
     */
    public org.joda.time.LocalDate getFromDate() {
        return this.fromDate;
    }

    /**
     * Setter for <code>drm.vw_work_reports.from_date</code>.
     */
    public void setFromDate(org.joda.time.LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Getter for <code>drm.vw_work_reports.to_date</code>.
     */
    public org.joda.time.LocalDate getToDate() {
        return this.toDate;
    }

    /**
     * Setter for <code>drm.vw_work_reports.to_date</code>.
     */
    public void setToDate(org.joda.time.LocalDate toDate) {
        this.toDate = toDate;
    }

    /**
     * Getter for <code>drm.vw_work_reports.business_trip_id</code>.
     */
    public java.lang.Integer getBusinessTripId() {
        return this.businessTripId;
    }

    /**
     * Setter for <code>drm.vw_work_reports.business_trip_id</code>.
     */
    public void setBusinessTripId(java.lang.Integer businessTripId) {
        this.businessTripId = businessTripId;
    }

    /**
     * Getter for <code>drm.vw_work_reports.business_trip_description</code>.
     */
    public java.lang.String getBusinessTripDescription() {
        return this.businessTripDescription;
    }

    /**
     * Setter for <code>drm.vw_work_reports.business_trip_description</code>.
     */
    public void setBusinessTripDescription(java.lang.String businessTripDescription) {
        this.businessTripDescription = businessTripDescription;
    }

    /**
     * Getter for <code>drm.vw_work_reports.revision_status</code>.
     */
    public java.lang.String getRevisionStatus() {
        return this.revisionStatus;
    }

    /**
     * Setter for <code>drm.vw_work_reports.revision_status</code>.
     */
    public void setRevisionStatus(java.lang.String revisionStatus) {
        this.revisionStatus = revisionStatus;
    }

    /**
     * Getter for <code>drm.vw_work_reports.charge_to</code>.
     */
    public java.lang.Boolean getChargeTo() {
        return this.chargeTo;
    }

    /**
     * Setter for <code>drm.vw_work_reports.charge_to</code>.
     */
    public void setChargeTo(java.lang.Boolean chargeTo) {
        this.chargeTo = chargeTo;
    }

    /**
     * Getter for <code>drm.vw_work_reports.free_support</code>.
     */
    public java.lang.Boolean getFreeSupport() {
        return this.freeSupport;
    }

    /**
     * Setter for <code>drm.vw_work_reports.free_support</code>.
     */
    public void setFreeSupport(java.lang.Boolean freeSupport) {
        this.freeSupport = freeSupport;
    }

    /**
     * Getter for <code>drm.vw_work_reports.company_id</code>.
     */
    public java.lang.Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>drm.vw_work_reports.company_id</code>.
     */
    public void setCompanyId(java.lang.Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * Getter for <code>drm.vw_work_reports.company_description</code>.
     */
    public java.lang.String getCompanyDescription() {
        return this.companyDescription;
    }

    /**
     * Setter for <code>drm.vw_work_reports.company_description</code>.
     */
    public void setCompanyDescription(java.lang.String companyDescription) {
        this.companyDescription = companyDescription;
    }

    /**
     * Getter for <code>drm.vw_work_reports.doc_status_id</code>.
     */
    public java.lang.Integer getDocStatusId() {
        return this.docStatusId;
    }

    /**
     * Setter for <code>drm.vw_work_reports.doc_status_id</code>.
     */
    public void setDocStatusId(java.lang.Integer docStatusId) {
        this.docStatusId = docStatusId;
    }

    /**
     * Getter for <code>drm.vw_work_reports.doc_status_description</code>.
     */
    public java.lang.String getDocStatusDescription() {
        return this.docStatusDescription;
    }

    /**
     * Setter for <code>drm.vw_work_reports.doc_status_description</code>.
     */
    public void setDocStatusDescription(java.lang.String docStatusDescription) {
        this.docStatusDescription = docStatusDescription;
    }

    /**
     * Getter for <code>drm.vw_work_reports.description</code>.
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>drm.vw_work_reports.description</code>.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Getter for <code>drm.vw_work_reports.notes</code>.
     */
    public java.lang.String getNotes() {
        return this.notes;
    }

    /**
     * Setter for <code>drm.vw_work_reports.notes</code>.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    /**
     * Getter for <code>drm.vw_work_reports.tot_hours</code>.
     */
    public java.lang.Long getTotHours() {
        return this.totHours;
    }

    /**
     * Setter for <code>drm.vw_work_reports.tot_hours</code>.
     */
    public void setTotHours(java.lang.Long totHours) {
        this.totHours = totHours;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VwWorkReports (");

        sb.append(workReportId);
        sb.append(", ").append(domainId);
        sb.append(", ").append(number);
        sb.append(", ").append(year);
        sb.append(", ").append(referenceNo);
        sb.append(", ").append(operatorId);
        sb.append(", ").append(operatorDescription);
        sb.append(", ").append(customerId);
        sb.append(", ").append(customerDescription);
        sb.append(", ").append(customerStatId);
        sb.append(", ").append(customerStatDescription);
        sb.append(", ").append(causalId);
        sb.append(", ").append(causalDescription);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);
        sb.append(", ").append(businessTripId);
        sb.append(", ").append(businessTripDescription);
        sb.append(", ").append(revisionStatus);
        sb.append(", ").append(chargeTo);
        sb.append(", ").append(freeSupport);
        sb.append(", ").append(companyId);
        sb.append(", ").append(companyDescription);
        sb.append(", ").append(docStatusId);
        sb.append(", ").append(docStatusDescription);
        sb.append(", ").append(description);
        sb.append(", ").append(notes);
        sb.append(", ").append(totHours);

        sb.append(")");
        return sb.toString();
    }
}
