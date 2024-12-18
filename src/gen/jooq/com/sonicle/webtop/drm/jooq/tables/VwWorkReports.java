/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VwWorkReports extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.vw_work_reports</code>
     */
    public static final VwWorkReports VW_WORK_REPORTS = new VwWorkReports();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord.class;
    }

    /**
     * The column <code>drm.vw_work_reports.work_report_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> WORK_REPORT_ID = createField(org.jooq.impl.DSL.name("work_report_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_work_reports.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>drm.vw_work_reports.number</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.Integer> NUMBER = createField(org.jooq.impl.DSL.name("number"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_work_reports.year</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.Integer> YEAR = createField(org.jooq.impl.DSL.name("year"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_work_reports.reference_no</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> REFERENCE_NO = createField(org.jooq.impl.DSL.name("reference_no"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>drm.vw_work_reports.operator_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> OPERATOR_ID = createField(org.jooq.impl.DSL.name("operator_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_work_reports.operator_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> OPERATOR_DESCRIPTION = createField(org.jooq.impl.DSL.name("operator_description"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.vw_work_reports.customer_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> CUSTOMER_ID = createField(org.jooq.impl.DSL.name("customer_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_work_reports.customer_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> CUSTOMER_DESCRIPTION = createField(org.jooq.impl.DSL.name("customer_description"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.vw_work_reports.customer_stat_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> CUSTOMER_STAT_ID = createField(org.jooq.impl.DSL.name("customer_stat_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_work_reports.customer_stat_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> CUSTOMER_STAT_DESCRIPTION = createField(org.jooq.impl.DSL.name("customer_stat_description"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.vw_work_reports.causal_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.Integer> CAUSAL_ID = createField(org.jooq.impl.DSL.name("causal_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_work_reports.causal_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> CAUSAL_DESCRIPTION = createField(org.jooq.impl.DSL.name("causal_description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>drm.vw_work_reports.from_date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, org.joda.time.LocalDate> FROM_DATE = createField(org.jooq.impl.DSL.name("from_date"), org.jooq.impl.SQLDataType.LOCALDATE, this, "", new com.sonicle.jooq.jsr310.LocalDateJodaConverter());

    /**
     * The column <code>drm.vw_work_reports.to_date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, org.joda.time.LocalDate> TO_DATE = createField(org.jooq.impl.DSL.name("to_date"), org.jooq.impl.SQLDataType.LOCALDATE, this, "", new com.sonicle.jooq.jsr310.LocalDateJodaConverter());

    /**
     * The column <code>drm.vw_work_reports.business_trip_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.Integer> BUSINESS_TRIP_ID = createField(org.jooq.impl.DSL.name("business_trip_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_work_reports.business_trip_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> BUSINESS_TRIP_DESCRIPTION = createField(org.jooq.impl.DSL.name("business_trip_description"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.vw_work_reports.revision_status</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> REVISION_STATUS = createField(org.jooq.impl.DSL.name("revision_status"), org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>drm.vw_work_reports.charge_to</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.Boolean> CHARGE_TO = createField(org.jooq.impl.DSL.name("charge_to"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.vw_work_reports.free_support</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.Boolean> FREE_SUPPORT = createField(org.jooq.impl.DSL.name("free_support"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.vw_work_reports.company_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.Integer> COMPANY_ID = createField(org.jooq.impl.DSL.name("company_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_work_reports.company_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> COMPANY_DESCRIPTION = createField(org.jooq.impl.DSL.name("company_description"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.vw_work_reports.doc_status_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.Integer> DOC_STATUS_ID = createField(org.jooq.impl.DSL.name("doc_status_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_work_reports.doc_status_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> DOC_STATUS_DESCRIPTION = createField(org.jooq.impl.DSL.name("doc_status_description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>drm.vw_work_reports.description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> DESCRIPTION = createField(org.jooq.impl.DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>drm.vw_work_reports.notes</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.String> NOTES = createField(org.jooq.impl.DSL.name("notes"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>drm.vw_work_reports.tot_hours</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord, java.lang.Long> TOT_HOURS = createField(org.jooq.impl.DSL.name("tot_hours"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    private VwWorkReports(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord> aliased) {
        this(alias, aliased, null);
    }

    private VwWorkReports(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.view("create view \"vw_work_reports\" as  SELECT wr.work_report_id,\n    wr.domain_id,\n    wr.number,\n    wr.year,\n    wr.reference_no,\n    wr.operator_id,\n    us.display_name AS operator_description,\n    wr.customer_id,\n    rmd.description AS customer_description,\n    wr.customer_stat_id,\n    smd.description AS customer_stat_description,\n    wr.causal_id,\n    ca.description AS causal_description,\n    wr.from_date,\n    wr.to_date,\n    wr.business_trip_id,\n    bt.description AS business_trip_description,\n    wr.revision_status,\n    wr.charge_to,\n    wr.free_support,\n    wr.company_id,\n    co.name AS company_description,\n    wr.doc_status_id,\n    ds.description AS doc_status_description,\n    wr.description,\n    wr.notes,\n    sum(wrr.duration) AS tot_hours\n   FROM ((((((((drm.work_reports wr\n     LEFT JOIN drm.companies co ON ((wr.company_id = co.company_id)))\n     LEFT JOIN core.master_data rmd ON ((((wr.customer_id)::text = (rmd.master_data_id)::text) AND ((co.domain_id)::text = (rmd.domain_id)::text))))\n     LEFT JOIN core.master_data smd ON ((((wr.customer_stat_id)::text = (smd.master_data_id)::text) AND ((co.domain_id)::text = (rmd.domain_id)::text))))\n     LEFT JOIN drm.doc_statuses ds ON ((wr.doc_status_id = ds.doc_status_id)))\n     LEFT JOIN core.causals ca ON (((wr.causal_id = ca.causal_id) AND ((co.domain_id)::text = (ca.domain_id)::text))))\n     LEFT JOIN drm.business_trips bt ON (((wr.business_trip_id = bt.business_trip_id) AND ((co.domain_id)::text = (bt.domain_id)::text))))\n     LEFT JOIN drm.work_reports_rows wrr ON (((wr.work_report_id)::text = (wrr.work_report_id)::text)))\n     LEFT JOIN core.users us ON ((((wr.operator_id)::text = (us.user_id)::text) AND ((co.domain_id)::text = (us.domain_id)::text))))\n  GROUP BY wr.work_report_id, wr.domain_id, wr.number, wr.year, wr.reference_no, wr.operator_id, us.display_name, wr.customer_id, rmd.description, wr.customer_stat_id, smd.description, wr.causal_id, ca.description, wr.from_date, wr.to_date, wr.business_trip_id, bt.description, wr.revision_status, wr.charge_to, wr.free_support, wr.company_id, co.name, wr.doc_status_id, ds.description, wr.description, wr.notes;"));
    }

    /**
     * Create an aliased <code>drm.vw_work_reports</code> table reference
     */
    public VwWorkReports(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), VW_WORK_REPORTS);
    }

    /**
     * Create an aliased <code>drm.vw_work_reports</code> table reference
     */
    public VwWorkReports(org.jooq.Name alias) {
        this(alias, VW_WORK_REPORTS);
    }

    /**
     * Create a <code>drm.vw_work_reports</code> table reference
     */
    public VwWorkReports() {
        this(org.jooq.impl.DSL.name("vw_work_reports"), null);
    }

    public <O extends org.jooq.Record> VwWorkReports(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.VwWorkReportsRecord> key) {
        super(child, key, VW_WORK_REPORTS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public VwWorkReports as(java.lang.String alias) {
        return new VwWorkReports(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public VwWorkReports as(org.jooq.Name alias) {
        return new VwWorkReports(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public VwWorkReports rename(java.lang.String name) {
        return new VwWorkReports(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public VwWorkReports rename(org.jooq.Name name) {
        return new VwWorkReports(name, null);
    }
}
