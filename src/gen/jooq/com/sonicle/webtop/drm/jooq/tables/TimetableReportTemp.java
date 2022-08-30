/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimetableReportTemp extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.timetable_report_temp</code>
     */
    public static final TimetableReportTemp TIMETABLE_REPORT_TEMP = new TimetableReportTemp();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord.class;
    }

    /**
     * The column <code>drm.timetable_report_temp.id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.Integer> ID = createField(org.jooq.impl.DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.timetable_report_temp.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>drm.timetable_report_temp.user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> USER_ID = createField(org.jooq.impl.DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.timetable_report_temp.company_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.Integer> COMPANY_ID = createField(org.jooq.impl.DSL.name("company_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.timetable_report_temp.date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, org.joda.time.LocalDateTime> DATE = createField(org.jooq.impl.DSL.name("date"), org.jooq.impl.SQLDataType.LOCALDATETIME(6), this, "", new com.sonicle.jooq.jsr310.LocalDateTimeJodaConverter());

    /**
     * The column <code>drm.timetable_report_temp.working_hours</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> WORKING_HOURS = createField(org.jooq.impl.DSL.name("working_hours"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.overtime</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> OVERTIME = createField(org.jooq.impl.DSL.name("overtime"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.paid_leave</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> PAID_LEAVE = createField(org.jooq.impl.DSL.name("paid_leave"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.unpaid_leave</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> UNPAID_LEAVE = createField(org.jooq.impl.DSL.name("unpaid_leave"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.holiday</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> HOLIDAY = createField(org.jooq.impl.DSL.name("holiday"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.medical_visit</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> MEDICAL_VISIT = createField(org.jooq.impl.DSL.name("medical_visit"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.contractual</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> CONTRACTUAL = createField(org.jooq.impl.DSL.name("contractual"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.causal</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> CAUSAL = createField(org.jooq.impl.DSL.name("causal"), org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>drm.timetable_report_temp.hour</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> HOUR = createField(org.jooq.impl.DSL.name("hour"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.detail</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> DETAIL = createField(org.jooq.impl.DSL.name("detail"), org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>drm.timetable_report_temp.note</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> NOTE = createField(org.jooq.impl.DSL.name("note"), org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>drm.timetable_report_temp.target_user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> TARGET_USER_ID = createField(org.jooq.impl.DSL.name("target_user_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.timetable_report_temp.work_report_hours</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> WORK_REPORT_HOURS = createField(org.jooq.impl.DSL.name("work_report_hours"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.job_hours</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> JOB_HOURS = createField(org.jooq.impl.DSL.name("job_hours"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.sickness</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> SICKNESS = createField(org.jooq.impl.DSL.name("sickness"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.other</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> OTHER = createField(org.jooq.impl.DSL.name("other"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.causal_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> CAUSAL_ID = createField(org.jooq.impl.DSL.name("causal_id"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.total_line_hour</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.String> TOTAL_LINE_HOUR = createField(org.jooq.impl.DSL.name("total_line_hour"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_report_temp.has_requests</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord, java.lang.Boolean> HAS_REQUESTS = createField(org.jooq.impl.DSL.name("has_requests"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    private TimetableReportTemp(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord> aliased) {
        this(alias, aliased, null);
    }

    private TimetableReportTemp(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.timetable_report_temp</code> table reference
     */
    public TimetableReportTemp(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), TIMETABLE_REPORT_TEMP);
    }

    /**
     * Create an aliased <code>drm.timetable_report_temp</code> table reference
     */
    public TimetableReportTemp(org.jooq.Name alias) {
        this(alias, TIMETABLE_REPORT_TEMP);
    }

    /**
     * Create a <code>drm.timetable_report_temp</code> table reference
     */
    public TimetableReportTemp() {
        this(org.jooq.impl.DSL.name("timetable_report_temp"), null);
    }

    public <O extends org.jooq.Record> TimetableReportTemp(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord> key) {
        super(child, key, TIMETABLE_REPORT_TEMP);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public java.util.List<org.jooq.Index> getIndexes() {
        return java.util.Arrays.<org.jooq.Index>asList(com.sonicle.webtop.drm.jooq.Indexes.TTRT_AK1);
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.TIMETABLE_REPORT_TEMP_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableReportTempRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.TIMETABLE_REPORT_TEMP_PKEY);
    }

    @java.lang.Override
    public TimetableReportTemp as(java.lang.String alias) {
        return new TimetableReportTemp(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public TimetableReportTemp as(org.jooq.Name alias) {
        return new TimetableReportTemp(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public TimetableReportTemp rename(java.lang.String name) {
        return new TimetableReportTemp(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public TimetableReportTemp rename(org.jooq.Name name) {
        return new TimetableReportTemp(name, null);
    }
}
