/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpportunityActionInterlocutors extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.opportunity_action_interlocutors</code>
     */
    public static final OpportunityActionInterlocutors OPPORTUNITY_ACTION_INTERLOCUTORS = new OpportunityActionInterlocutors();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord.class;
    }

    /**
     * The column <code>drm.opportunity_action_interlocutors.id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord, java.lang.Integer> ID = createField(org.jooq.impl.DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.opportunity_action_interlocutors.opportunity_action_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord, java.lang.Integer> OPPORTUNITY_ACTION_ID = createField(org.jooq.impl.DSL.name("opportunity_action_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.opportunity_action_interlocutors.contact_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord, java.lang.Integer> CONTACT_ID = createField(org.jooq.impl.DSL.name("contact_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    private OpportunityActionInterlocutors(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OpportunityActionInterlocutors(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.opportunity_action_interlocutors</code> table reference
     */
    public OpportunityActionInterlocutors(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), OPPORTUNITY_ACTION_INTERLOCUTORS);
    }

    /**
     * Create an aliased <code>drm.opportunity_action_interlocutors</code> table reference
     */
    public OpportunityActionInterlocutors(org.jooq.Name alias) {
        this(alias, OPPORTUNITY_ACTION_INTERLOCUTORS);
    }

    /**
     * Create a <code>drm.opportunity_action_interlocutors</code> table reference
     */
    public OpportunityActionInterlocutors() {
        this(org.jooq.impl.DSL.name("opportunity_action_interlocutors"), null);
    }

    public <O extends org.jooq.Record> OpportunityActionInterlocutors(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord> key) {
        super(child, key, OPPORTUNITY_ACTION_INTERLOCUTORS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.OPPORTUNITY_ACTION_INTERLOCUTORS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionInterlocutorsRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.OPPORTUNITY_ACTION_INTERLOCUTORS_PKEY);
    }

    @java.lang.Override
    public OpportunityActionInterlocutors as(java.lang.String alias) {
        return new OpportunityActionInterlocutors(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public OpportunityActionInterlocutors as(org.jooq.Name alias) {
        return new OpportunityActionInterlocutors(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public OpportunityActionInterlocutors rename(java.lang.String name) {
        return new OpportunityActionInterlocutors(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public OpportunityActionInterlocutors rename(org.jooq.Name name) {
        return new OpportunityActionInterlocutors(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
        return (org.jooq.Row3) super.fieldsRow();
    }
}