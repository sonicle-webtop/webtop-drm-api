/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActivitiesRecord extends org.jooq.impl.UpdatableRecordImpl<ActivitiesRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.activities.activity_id</code>.
     */
    public void setActivityId(java.lang.Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.activities.activity_id</code>.
     */
    public java.lang.Integer getActivityId() {
        return (java.lang.Integer) get(0);
    }

    /**
     * Setter for <code>drm.activities.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.activities.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.activities.external_id</code>.
     */
    public void setExternalId(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.activities.external_id</code>.
     */
    public java.lang.String getExternalId() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>drm.activities.description</code>.
     */
    public void setDescription(java.lang.String value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.activities.description</code>.
     */
    public java.lang.String getDescription() {
        return (java.lang.String) get(3);
    }

    /**
     * Setter for <code>drm.activities.customer</code>.
     */
    public void setCustomer(java.lang.Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>drm.activities.customer</code>.
     */
    public java.lang.Boolean getCustomer() {
        return (java.lang.Boolean) get(4);
    }

    /**
     * Setter for <code>drm.activities.timetable</code>.
     */
    public void setTimetable(java.lang.Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>drm.activities.timetable</code>.
     */
    public java.lang.Boolean getTimetable() {
        return (java.lang.Boolean) get(5);
    }

    /**
     * Setter for <code>drm.activities.jobs</code>.
     */
    public void setJobs(java.lang.Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>drm.activities.jobs</code>.
     */
    public java.lang.Boolean getJobs() {
        return (java.lang.Boolean) get(6);
    }

    /**
     * Setter for <code>drm.activities.opportunities</code>.
     */
    public void setOpportunities(java.lang.Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>drm.activities.opportunities</code>.
     */
    public java.lang.Boolean getOpportunities() {
        return (java.lang.Boolean) get(7);
    }

    /**
     * Setter for <code>drm.activities.exportable</code>.
     */
    public void setExportable(java.lang.Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>drm.activities.exportable</code>.
     */
    public java.lang.Boolean getExportable() {
        return (java.lang.Boolean) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean> fieldsRow() {
        return (org.jooq.Row9) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean> valuesRow() {
        return (org.jooq.Row9) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.ACTIVITY_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.EXTERNAL_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field4() {
        return com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.DESCRIPTION;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field5() {
        return com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.CUSTOMER;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field6() {
        return com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.TIMETABLE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field7() {
        return com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.JOBS;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field8() {
        return com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.OPPORTUNITIES;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field9() {
        return com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.EXPORTABLE;
    }

    @java.lang.Override
    public java.lang.Integer component1() {
        return getActivityId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getExternalId();
    }

    @java.lang.Override
    public java.lang.String component4() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.Boolean component5() {
        return getCustomer();
    }

    @java.lang.Override
    public java.lang.Boolean component6() {
        return getTimetable();
    }

    @java.lang.Override
    public java.lang.Boolean component7() {
        return getJobs();
    }

    @java.lang.Override
    public java.lang.Boolean component8() {
        return getOpportunities();
    }

    @java.lang.Override
    public java.lang.Boolean component9() {
        return getExportable();
    }

    @java.lang.Override
    public java.lang.Integer value1() {
        return getActivityId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getExternalId();
    }

    @java.lang.Override
    public java.lang.String value4() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.Boolean value5() {
        return getCustomer();
    }

    @java.lang.Override
    public java.lang.Boolean value6() {
        return getTimetable();
    }

    @java.lang.Override
    public java.lang.Boolean value7() {
        return getJobs();
    }

    @java.lang.Override
    public java.lang.Boolean value8() {
        return getOpportunities();
    }

    @java.lang.Override
    public java.lang.Boolean value9() {
        return getExportable();
    }

    @java.lang.Override
    public ActivitiesRecord value1(java.lang.Integer value) {
        setActivityId(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesRecord value2(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesRecord value3(java.lang.String value) {
        setExternalId(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesRecord value4(java.lang.String value) {
        setDescription(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesRecord value5(java.lang.Boolean value) {
        setCustomer(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesRecord value6(java.lang.Boolean value) {
        setTimetable(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesRecord value7(java.lang.Boolean value) {
        setJobs(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesRecord value8(java.lang.Boolean value) {
        setOpportunities(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesRecord value9(java.lang.Boolean value) {
        setExportable(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.Boolean value5, java.lang.Boolean value6, java.lang.Boolean value7, java.lang.Boolean value8, java.lang.Boolean value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActivitiesRecord
     */
    public ActivitiesRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES);
    }

    /**
     * Create a detached, initialised ActivitiesRecord
     */
    public ActivitiesRecord(java.lang.Integer activityId, java.lang.String domainId, java.lang.String externalId, java.lang.String description, java.lang.Boolean customer, java.lang.Boolean timetable, java.lang.Boolean jobs, java.lang.Boolean opportunities, java.lang.Boolean exportable) {
        super(com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES);

        setActivityId(activityId);
        setDomainId(domainId);
        setExternalId(externalId);
        setDescription(description);
        setCustomer(customer);
        setTimetable(timetable);
        setJobs(jobs);
        setOpportunities(opportunities);
        setExportable(exportable);
    }
}
