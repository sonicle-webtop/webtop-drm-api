/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VwJobs extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.vw_jobs</code>
     */
    public static final VwJobs VW_JOBS = new VwJobs();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord.class;
    }

    /**
     * The column <code>drm.vw_jobs.job_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> JOB_ID = createField(org.jooq.impl.DSL.name("job_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_jobs.operator_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> OPERATOR_ID = createField(org.jooq.impl.DSL.name("operator_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_jobs.operator_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> OPERATOR_DESCRIPTION = createField(org.jooq.impl.DSL.name("operator_description"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.vw_jobs.customer_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> CUSTOMER_ID = createField(org.jooq.impl.DSL.name("customer_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_jobs.customer_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> CUSTOMER_DESCRIPTION = createField(org.jooq.impl.DSL.name("customer_description"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.vw_jobs.customer_stat_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> CUSTOMER_STAT_ID = createField(org.jooq.impl.DSL.name("customer_stat_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_jobs.customer_stat_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> CUSTOMER_STAT_DESCRIPTION = createField(org.jooq.impl.DSL.name("customer_stat_description"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.vw_jobs.activity_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.Integer> ACTIVITY_ID = createField(org.jooq.impl.DSL.name("activity_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_jobs.activity_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> ACTIVITY_DESCRIPTION = createField(org.jooq.impl.DSL.name("activity_description"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.vw_jobs.start_date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, org.joda.time.DateTime> START_DATE = createField(org.jooq.impl.DSL.name("start_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "", new com.sonicle.jooq.jsr310.OffsetDateTimeJodaConverter());

    /**
     * The column <code>drm.vw_jobs.end_date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, org.joda.time.DateTime> END_DATE = createField(org.jooq.impl.DSL.name("end_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "", new com.sonicle.jooq.jsr310.OffsetDateTimeJodaConverter());

    /**
     * The column <code>drm.vw_jobs.timezone</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> TIMEZONE = createField(org.jooq.impl.DSL.name("timezone"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.vw_jobs.company_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.Integer> COMPANY_ID = createField(org.jooq.impl.DSL.name("company_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_jobs.company_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> COMPANY_DESCRIPTION = createField(org.jooq.impl.DSL.name("company_description"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.vw_jobs.title</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> TITLE = createField(org.jooq.impl.DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.vw_jobs.ticket_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> TICKET_ID = createField(org.jooq.impl.DSL.name("ticket_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_jobs.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>drm.vw_jobs.number</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> NUMBER = createField(org.jooq.impl.DSL.name("number"), org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>drm.vw_jobs.description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> DESCRIPTION = createField(org.jooq.impl.DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>drm.vw_jobs.causal_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.Integer> CAUSAL_ID = createField(org.jooq.impl.DSL.name("causal_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_jobs.causal_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord, java.lang.String> CAUSAL_DESCRIPTION = createField(org.jooq.impl.DSL.name("causal_description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    private VwJobs(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord> aliased) {
        this(alias, aliased, null);
    }

    private VwJobs(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.view("create view \"vw_jobs\" as  SELECT jb.job_id,\n    jb.operator_id,\n    us.display_name AS operator_description,\n    jb.customer_id,\n    rmd.description AS customer_description,\n    jb.customer_stat_id,\n    smd.description AS customer_stat_description,\n    jb.activity_id,\n    ac.description AS activity_description,\n    jb.start_date,\n    jb.end_date,\n    jb.timezone,\n    jb.company_id,\n    co.name AS company_description,\n    jb.title,\n    jb.ticket_id,\n    jb.domain_id,\n    jb.number,\n    jb.description,\n    jb.causal_id,\n    ca.description AS causal_description\n   FROM ((((((drm.jobs jb\n     LEFT JOIN drm.companies co ON (((jb.company_id = co.company_id) AND ((jb.domain_id)::text = (co.domain_id)::text))))\n     LEFT JOIN core.master_data rmd ON ((((jb.customer_id)::text = (rmd.master_data_id)::text) AND ((jb.domain_id)::text = (rmd.domain_id)::text))))\n     LEFT JOIN core.master_data smd ON ((((jb.customer_stat_id)::text = (smd.master_data_id)::text) AND ((jb.domain_id)::text = (rmd.domain_id)::text))))\n     LEFT JOIN drm.activities ac ON (((jb.activity_id = ac.activity_id) AND ((jb.domain_id)::text = (ac.domain_id)::text))))\n     LEFT JOIN core.users us ON ((((jb.operator_id)::text = (us.user_id)::text) AND ((jb.domain_id)::text = (us.domain_id)::text))))\n     LEFT JOIN core.causals ca ON (((jb.causal_id = ca.causal_id) AND ((jb.domain_id)::text = (ca.domain_id)::text))));"));
    }

    /**
     * Create an aliased <code>drm.vw_jobs</code> table reference
     */
    public VwJobs(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), VW_JOBS);
    }

    /**
     * Create an aliased <code>drm.vw_jobs</code> table reference
     */
    public VwJobs(org.jooq.Name alias) {
        this(alias, VW_JOBS);
    }

    /**
     * Create a <code>drm.vw_jobs</code> table reference
     */
    public VwJobs() {
        this(org.jooq.impl.DSL.name("vw_jobs"), null);
    }

    public <O extends org.jooq.Record> VwJobs(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.VwJobsRecord> key) {
        super(child, key, VW_JOBS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public VwJobs as(java.lang.String alias) {
        return new VwJobs(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public VwJobs as(org.jooq.Name alias) {
        return new VwJobs(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public VwJobs rename(java.lang.String name) {
        return new VwJobs(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public VwJobs rename(org.jooq.Name name) {
        return new VwJobs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row21<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String> fieldsRow() {
        return (org.jooq.Row21) super.fieldsRow();
    }
}
