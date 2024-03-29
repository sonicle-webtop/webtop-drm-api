/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Activities implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer activityId;
    private java.lang.String  domainId;
    private java.lang.String  externalId;
    private java.lang.String  description;
    private java.lang.Boolean customer;
    private java.lang.Boolean timetable;
    private java.lang.Boolean jobs;
    private java.lang.Boolean opportunities;
    private java.lang.Boolean exportable;

    public Activities() {}

    public Activities(Activities value) {
        this.activityId = value.activityId;
        this.domainId = value.domainId;
        this.externalId = value.externalId;
        this.description = value.description;
        this.customer = value.customer;
        this.timetable = value.timetable;
        this.jobs = value.jobs;
        this.opportunities = value.opportunities;
        this.exportable = value.exportable;
    }

    public Activities(
        java.lang.Integer activityId,
        java.lang.String  domainId,
        java.lang.String  externalId,
        java.lang.String  description,
        java.lang.Boolean customer,
        java.lang.Boolean timetable,
        java.lang.Boolean jobs,
        java.lang.Boolean opportunities,
        java.lang.Boolean exportable
    ) {
        this.activityId = activityId;
        this.domainId = domainId;
        this.externalId = externalId;
        this.description = description;
        this.customer = customer;
        this.timetable = timetable;
        this.jobs = jobs;
        this.opportunities = opportunities;
        this.exportable = exportable;
    }

    /**
     * Getter for <code>drm.activities.activity_id</code>.
     */
    public java.lang.Integer getActivityId() {
        return this.activityId;
    }

    /**
     * Setter for <code>drm.activities.activity_id</code>.
     */
    public void setActivityId(java.lang.Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * Getter for <code>drm.activities.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.activities.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.activities.external_id</code>.
     */
    public java.lang.String getExternalId() {
        return this.externalId;
    }

    /**
     * Setter for <code>drm.activities.external_id</code>.
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    /**
     * Getter for <code>drm.activities.description</code>.
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>drm.activities.description</code>.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Getter for <code>drm.activities.customer</code>.
     */
    public java.lang.Boolean getCustomer() {
        return this.customer;
    }

    /**
     * Setter for <code>drm.activities.customer</code>.
     */
    public void setCustomer(java.lang.Boolean customer) {
        this.customer = customer;
    }

    /**
     * Getter for <code>drm.activities.timetable</code>.
     */
    public java.lang.Boolean getTimetable() {
        return this.timetable;
    }

    /**
     * Setter for <code>drm.activities.timetable</code>.
     */
    public void setTimetable(java.lang.Boolean timetable) {
        this.timetable = timetable;
    }

    /**
     * Getter for <code>drm.activities.jobs</code>.
     */
    public java.lang.Boolean getJobs() {
        return this.jobs;
    }

    /**
     * Setter for <code>drm.activities.jobs</code>.
     */
    public void setJobs(java.lang.Boolean jobs) {
        this.jobs = jobs;
    }

    /**
     * Getter for <code>drm.activities.opportunities</code>.
     */
    public java.lang.Boolean getOpportunities() {
        return this.opportunities;
    }

    /**
     * Setter for <code>drm.activities.opportunities</code>.
     */
    public void setOpportunities(java.lang.Boolean opportunities) {
        this.opportunities = opportunities;
    }

    /**
     * Getter for <code>drm.activities.exportable</code>.
     */
    public java.lang.Boolean getExportable() {
        return this.exportable;
    }

    /**
     * Setter for <code>drm.activities.exportable</code>.
     */
    public void setExportable(java.lang.Boolean exportable) {
        this.exportable = exportable;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Activities (");

        sb.append(activityId);
        sb.append(", ").append(domainId);
        sb.append(", ").append(externalId);
        sb.append(", ").append(description);
        sb.append(", ").append(customer);
        sb.append(", ").append(timetable);
        sb.append(", ").append(jobs);
        sb.append(", ").append(opportunities);
        sb.append(", ").append(exportable);

        sb.append(")");
        return sb.toString();
    }
}
