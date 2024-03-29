/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkReportsRowsRecord extends org.jooq.impl.UpdatableRecordImpl<WorkReportsRowsRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.Short, java.lang.Integer, java.lang.Short, java.lang.Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.work_reports_rows.id</code>.
     */
    public void setId(java.lang.Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.work_reports_rows.id</code>.
     */
    public java.lang.Integer getId() {
        return (java.lang.Integer) get(0);
    }

    /**
     * Setter for <code>drm.work_reports_rows.work_report_id</code>.
     */
    public void setWorkReportId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.work_reports_rows.work_report_id</code>.
     */
    public java.lang.String getWorkReportId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.work_reports_rows.row_no</code>.
     */
    public void setRowNo(java.lang.Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.work_reports_rows.row_no</code>.
     */
    public java.lang.Short getRowNo() {
        return (java.lang.Short) get(2);
    }

    /**
     * Setter for <code>drm.work_reports_rows.work_type_id</code>.
     */
    public void setWorkTypeId(java.lang.Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.work_reports_rows.work_type_id</code>.
     */
    public java.lang.Integer getWorkTypeId() {
        return (java.lang.Integer) get(3);
    }

    /**
     * Setter for <code>drm.work_reports_rows.duration</code>.
     */
    public void setDuration(java.lang.Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>drm.work_reports_rows.duration</code>.
     */
    public java.lang.Short getDuration() {
        return (java.lang.Short) get(4);
    }

    /**
     * Setter for <code>drm.work_reports_rows.extra</code>.
     */
    public void setExtra(java.lang.Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>drm.work_reports_rows.extra</code>.
     */
    public java.lang.Boolean getExtra() {
        return (java.lang.Boolean) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.Short, java.lang.Integer, java.lang.Short, java.lang.Boolean> fieldsRow() {
        return (org.jooq.Row6) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.Short, java.lang.Integer, java.lang.Short, java.lang.Boolean> valuesRow() {
        return (org.jooq.Row6) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsRows.WORK_REPORTS_ROWS.ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsRows.WORK_REPORTS_ROWS.WORK_REPORT_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Short> field3() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsRows.WORK_REPORTS_ROWS.ROW_NO;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field4() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsRows.WORK_REPORTS_ROWS.WORK_TYPE_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Short> field5() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsRows.WORK_REPORTS_ROWS.DURATION;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field6() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsRows.WORK_REPORTS_ROWS.EXTRA;
    }

    @java.lang.Override
    public java.lang.Integer component1() {
        return getId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getWorkReportId();
    }

    @java.lang.Override
    public java.lang.Short component3() {
        return getRowNo();
    }

    @java.lang.Override
    public java.lang.Integer component4() {
        return getWorkTypeId();
    }

    @java.lang.Override
    public java.lang.Short component5() {
        return getDuration();
    }

    @java.lang.Override
    public java.lang.Boolean component6() {
        return getExtra();
    }

    @java.lang.Override
    public java.lang.Integer value1() {
        return getId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getWorkReportId();
    }

    @java.lang.Override
    public java.lang.Short value3() {
        return getRowNo();
    }

    @java.lang.Override
    public java.lang.Integer value4() {
        return getWorkTypeId();
    }

    @java.lang.Override
    public java.lang.Short value5() {
        return getDuration();
    }

    @java.lang.Override
    public java.lang.Boolean value6() {
        return getExtra();
    }

    @java.lang.Override
    public WorkReportsRowsRecord value1(java.lang.Integer value) {
        setId(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsRowsRecord value2(java.lang.String value) {
        setWorkReportId(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsRowsRecord value3(java.lang.Short value) {
        setRowNo(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsRowsRecord value4(java.lang.Integer value) {
        setWorkTypeId(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsRowsRecord value5(java.lang.Short value) {
        setDuration(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsRowsRecord value6(java.lang.Boolean value) {
        setExtra(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsRowsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Short value3, java.lang.Integer value4, java.lang.Short value5, java.lang.Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WorkReportsRowsRecord
     */
    public WorkReportsRowsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.WorkReportsRows.WORK_REPORTS_ROWS);
    }

    /**
     * Create a detached, initialised WorkReportsRowsRecord
     */
    public WorkReportsRowsRecord(java.lang.Integer id, java.lang.String workReportId, java.lang.Short rowNo, java.lang.Integer workTypeId, java.lang.Short duration, java.lang.Boolean extra) {
        super(com.sonicle.webtop.drm.jooq.tables.WorkReportsRows.WORK_REPORTS_ROWS);

        setId(id);
        setWorkReportId(workReportId);
        setRowNo(rowNo);
        setWorkTypeId(workTypeId);
        setDuration(duration);
        setExtra(extra);
    }
}
