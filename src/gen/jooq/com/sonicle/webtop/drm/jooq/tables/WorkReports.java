/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkReports extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.work_reports</code>
     */
    public static final WorkReports WORK_REPORTS = new WorkReports();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord.class;
    }

    /**
     * The column <code>drm.work_reports.work_report_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> WORK_REPORT_ID = createField(org.jooq.impl.DSL.name("work_report_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.work_reports.company_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Integer> COMPANY_ID = createField(org.jooq.impl.DSL.name("company_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.work_reports.operator_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> OPERATOR_ID = createField(org.jooq.impl.DSL.name("operator_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.work_reports.revision_status</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> REVISION_STATUS = createField(org.jooq.impl.DSL.name("revision_status"), org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>drm.work_reports.revision_timestamp</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, org.joda.time.DateTime> REVISION_TIMESTAMP = createField(org.jooq.impl.DSL.name("revision_timestamp"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "", new com.sonicle.jooq.jsr310.OffsetDateTimeJodaConverter());

    /**
     * The column <code>drm.work_reports.revision_sequence</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Integer> REVISION_SEQUENCE = createField(org.jooq.impl.DSL.name("revision_sequence"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.work_reports.doc_status_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Integer> DOC_STATUS_ID = createField(org.jooq.impl.DSL.name("doc_status_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.work_reports.contact_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> CONTACT_ID = createField(org.jooq.impl.DSL.name("contact_id"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>drm.work_reports.customer_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> CUSTOMER_ID = createField(org.jooq.impl.DSL.name("customer_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.work_reports.customer_stat_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> CUSTOMER_STAT_ID = createField(org.jooq.impl.DSL.name("customer_stat_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.work_reports.from_date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, org.joda.time.LocalDate> FROM_DATE = createField(org.jooq.impl.DSL.name("from_date"), org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "", new com.sonicle.jooq.jsr310.LocalDateJodaConverter());

    /**
     * The column <code>drm.work_reports.to_date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, org.joda.time.LocalDate> TO_DATE = createField(org.jooq.impl.DSL.name("to_date"), org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "", new com.sonicle.jooq.jsr310.LocalDateJodaConverter());

    /**
     * The column <code>drm.work_reports.reference_no</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> REFERENCE_NO = createField(org.jooq.impl.DSL.name("reference_no"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>drm.work_reports.causal_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Integer> CAUSAL_ID = createField(org.jooq.impl.DSL.name("causal_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.work_reports.ddt_no</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> DDT_NO = createField(org.jooq.impl.DSL.name("ddt_no"), org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>drm.work_reports.ddt_date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, org.joda.time.LocalDate> DDT_DATE = createField(org.jooq.impl.DSL.name("ddt_date"), org.jooq.impl.SQLDataType.LOCALDATE, this, "", new com.sonicle.jooq.jsr310.LocalDateJodaConverter());

    /**
     * The column <code>drm.work_reports.notes</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> NOTES = createField(org.jooq.impl.DSL.name("notes"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>drm.work_reports.description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> DESCRIPTION = createField(org.jooq.impl.DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>drm.work_reports.apply_signature</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Boolean> APPLY_SIGNATURE = createField(org.jooq.impl.DSL.name("apply_signature"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.work_reports.charge_to</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Boolean> CHARGE_TO = createField(org.jooq.impl.DSL.name("charge_to"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.work_reports.free_support</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Boolean> FREE_SUPPORT = createField(org.jooq.impl.DSL.name("free_support"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.work_reports.business_trip_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Integer> BUSINESS_TRIP_ID = createField(org.jooq.impl.DSL.name("business_trip_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.work_reports.business_trip_days</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Short> BUSINESS_TRIP_DAYS = createField(org.jooq.impl.DSL.name("business_trip_days"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>drm.work_reports.number</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Integer> NUMBER = createField(org.jooq.impl.DSL.name("number"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.work_reports.year</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Integer> YEAR = createField(org.jooq.impl.DSL.name("year"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.work_reports.event_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> EVENT_ID = createField(org.jooq.impl.DSL.name("event_id"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>drm.work_reports.timetable_hours</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.Integer> TIMETABLE_HOURS = createField(org.jooq.impl.DSL.name("timetable_hours"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.work_reports.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    private WorkReports(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord> aliased) {
        this(alias, aliased, null);
    }

    private WorkReports(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.work_reports</code> table reference
     */
    public WorkReports(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), WORK_REPORTS);
    }

    /**
     * Create an aliased <code>drm.work_reports</code> table reference
     */
    public WorkReports(org.jooq.Name alias) {
        this(alias, WORK_REPORTS);
    }

    /**
     * Create a <code>drm.work_reports</code> table reference
     */
    public WorkReports() {
        this(org.jooq.impl.DSL.name("work_reports"), null);
    }

    public <O extends org.jooq.Record> WorkReports(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord> key) {
        super(child, key, WORK_REPORTS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.WORK_REPORTS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.WORK_REPORTS_PKEY);
    }

    @java.lang.Override
    public WorkReports as(java.lang.String alias) {
        return new WorkReports(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public WorkReports as(org.jooq.Name alias) {
        return new WorkReports(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public WorkReports rename(java.lang.String name) {
        return new WorkReports(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public WorkReports rename(org.jooq.Name name) {
        return new WorkReports(name, null);
    }
}
