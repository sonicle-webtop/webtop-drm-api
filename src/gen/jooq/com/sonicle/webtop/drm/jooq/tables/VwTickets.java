/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VwTickets extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.vw_tickets</code>
     */
    public static final VwTickets VW_TICKETS = new VwTickets();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord.class;
    }

    /**
     * The column <code>drm.vw_tickets.ticket_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> TICKET_ID = createField(org.jooq.impl.DSL.name("ticket_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_tickets.from_operator_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> FROM_OPERATOR_ID = createField(org.jooq.impl.DSL.name("from_operator_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_tickets.from_operator_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> FROM_OPERATOR_DESCRIPTION = createField(org.jooq.impl.DSL.name("from_operator_description"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.vw_tickets.to_operator_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> TO_OPERATOR_ID = createField(org.jooq.impl.DSL.name("to_operator_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_tickets.to_operator_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> TO_OPERATOR_DESCRIPTION = createField(org.jooq.impl.DSL.name("to_operator_description"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.vw_tickets.customer_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> CUSTOMER_ID = createField(org.jooq.impl.DSL.name("customer_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_tickets.customer_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> CUSTOMER_DESCRIPTION = createField(org.jooq.impl.DSL.name("customer_description"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.vw_tickets.customer_stat_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> CUSTOMER_STAT_ID = createField(org.jooq.impl.DSL.name("customer_stat_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>drm.vw_tickets.customer_stat_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> CUSTOMER_STAT_DESCRIPTION = createField(org.jooq.impl.DSL.name("customer_stat_description"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.vw_tickets.ticket_category_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.Integer> TICKET_CATEGORY_ID = createField(org.jooq.impl.DSL.name("ticket_category_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_tickets.ticket_category_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> TICKET_CATEGORY_DESCRIPTION = createField(org.jooq.impl.DSL.name("ticket_category_description"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.vw_tickets.date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, org.joda.time.DateTime> DATE = createField(org.jooq.impl.DSL.name("date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "", new com.sonicle.jooq.jsr310.OffsetDateTimeJodaConverter());

    /**
     * The column <code>drm.vw_tickets.timezone</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> TIMEZONE = createField(org.jooq.impl.DSL.name("timezone"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.vw_tickets.company_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.Integer> COMPANY_ID = createField(org.jooq.impl.DSL.name("company_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_tickets.company_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> COMPANY_DESCRIPTION = createField(org.jooq.impl.DSL.name("company_description"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.vw_tickets.title</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> TITLE = createField(org.jooq.impl.DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.vw_tickets.status_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.Integer> STATUS_ID = createField(org.jooq.impl.DSL.name("status_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.vw_tickets.status_description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> STATUS_DESCRIPTION = createField(org.jooq.impl.DSL.name("status_description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>drm.vw_tickets.priority_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> PRIORITY_ID = createField(org.jooq.impl.DSL.name("priority_id"), org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>drm.vw_tickets.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>drm.vw_tickets.number</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> NUMBER = createField(org.jooq.impl.DSL.name("number"), org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>drm.vw_tickets.type</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> TYPE = createField(org.jooq.impl.DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>drm.vw_tickets.description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord, java.lang.String> DESCRIPTION = createField(org.jooq.impl.DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    private VwTickets(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord> aliased) {
        this(alias, aliased, null);
    }

    private VwTickets(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.view("create view \"vw_tickets\" as SELECT tckt.ticket_id, tckt.from_operator_id, fop.display_name AS from_operator_description, tckt.to_operator_id, top.display_name AS to_operator_description, tckt.customer_id, rmd.description AS customer_description, tckt.customer_stat_id, smd.description AS customer_stat_description, tckt.ticket_category_id, tc.description AS ticket_category_description, tckt.date, tckt.timezone, tckt.company_id, co.name AS company_description, tckt.title, tckt.status_id, ds.description AS status_description, tckt.priority_id, tckt.domain_id, tckt.number, ds.type, tckt.description FROM (((((((drm.tickets tckt LEFT JOIN drm.companies co ON (((tckt.company_id = co.company_id) AND ((tckt.domain_id)::text = (co.domain_id)::text)))) LEFT JOIN core.master_data rmd ON ((((tckt.customer_id)::text = (rmd.master_data_id)::text) AND ((tckt.domain_id)::text = (rmd.domain_id)::text)))) LEFT JOIN core.master_data smd ON ((((tckt.customer_stat_id)::text = (smd.master_data_id)::text) AND ((tckt.domain_id)::text = (rmd.domain_id)::text)))) LEFT JOIN drm.ticket_categories tc ON (((tckt.ticket_category_id = tc.ticket_category_id) AND ((tckt.domain_id)::text = (tc.domain_id)::text)))) LEFT JOIN core.users fop ON ((((tckt.from_operator_id)::text = (fop.user_id)::text) AND ((tckt.domain_id)::text = (fop.domain_id)::text)))) LEFT JOIN core.users top ON ((((tckt.to_operator_id)::text = (top.user_id)::text) AND ((tckt.domain_id)::text = (top.domain_id)::text)))) LEFT JOIN drm.doc_statuses ds ON ((tckt.status_id = ds.doc_status_id)));"));
    }

    /**
     * Create an aliased <code>drm.vw_tickets</code> table reference
     */
    public VwTickets(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), VW_TICKETS);
    }

    /**
     * Create an aliased <code>drm.vw_tickets</code> table reference
     */
    public VwTickets(org.jooq.Name alias) {
        this(alias, VW_TICKETS);
    }

    /**
     * Create a <code>drm.vw_tickets</code> table reference
     */
    public VwTickets() {
        this(org.jooq.impl.DSL.name("vw_tickets"), null);
    }

    public <O extends org.jooq.Record> VwTickets(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.VwTicketsRecord> key) {
        super(child, key, VW_TICKETS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public VwTickets as(java.lang.String alias) {
        return new VwTickets(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public VwTickets as(org.jooq.Name alias) {
        return new VwTickets(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public VwTickets rename(java.lang.String name) {
        return new VwTickets(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public VwTickets rename(org.jooq.Name name) {
        return new VwTickets(name, null);
    }
}
