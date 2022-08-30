/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkReportsSettingsRecord extends org.jooq.impl.UpdatableRecordImpl<WorkReportsSettingsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.work_reports_settings.work_report_setting_id</code>.
     */
    public void setWorkReportSettingId(java.lang.Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.work_reports_settings.work_report_setting_id</code>.
     */
    public java.lang.Integer getWorkReportSettingId() {
        return (java.lang.Integer) get(0);
    }

    /**
     * Setter for <code>drm.work_reports_settings.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.work_reports_settings.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.work_reports_settings.warranty_text</code>.
     */
    public void setWarrantyText(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.work_reports_settings.warranty_text</code>.
     */
    public java.lang.String getWarrantyText() {
        return (java.lang.String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row3) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
        return (org.jooq.Row3) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsSettings.WORK_REPORTS_SETTINGS.WORK_REPORT_SETTING_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsSettings.WORK_REPORTS_SETTINGS.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsSettings.WORK_REPORTS_SETTINGS.WARRANTY_TEXT;
    }

    @java.lang.Override
    public java.lang.Integer component1() {
        return getWorkReportSettingId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getWarrantyText();
    }

    @java.lang.Override
    public java.lang.Integer value1() {
        return getWorkReportSettingId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getWarrantyText();
    }

    @java.lang.Override
    public WorkReportsSettingsRecord value1(java.lang.Integer value) {
        setWorkReportSettingId(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsSettingsRecord value2(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsSettingsRecord value3(java.lang.String value) {
        setWarrantyText(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsSettingsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WorkReportsSettingsRecord
     */
    public WorkReportsSettingsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.WorkReportsSettings.WORK_REPORTS_SETTINGS);
    }

    /**
     * Create a detached, initialised WorkReportsSettingsRecord
     */
    public WorkReportsSettingsRecord(java.lang.Integer workReportSettingId, java.lang.String domainId, java.lang.String warrantyText) {
        super(com.sonicle.webtop.drm.jooq.tables.WorkReportsSettings.WORK_REPORTS_SETTINGS);

        setWorkReportSettingId(workReportSettingId);
        setDomainId(domainId);
        setWarrantyText(warrantyText);
    }
}