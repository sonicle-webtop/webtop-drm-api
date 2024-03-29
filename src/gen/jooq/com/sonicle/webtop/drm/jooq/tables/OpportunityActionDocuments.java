/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpportunityActionDocuments extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.opportunity_action_documents</code>
     */
    public static final OpportunityActionDocuments OPPORTUNITY_ACTION_DOCUMENTS = new OpportunityActionDocuments();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord.class;
    }

    /**
     * The column <code>drm.opportunity_action_documents.id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord, java.lang.String> ID = createField(org.jooq.impl.DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.opportunity_action_documents.opportunity_action_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord, java.lang.Integer> OPPORTUNITY_ACTION_ID = createField(org.jooq.impl.DSL.name("opportunity_action_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.opportunity_action_documents.revision_timestamp</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord, org.joda.time.DateTime> REVISION_TIMESTAMP = createField(org.jooq.impl.DSL.name("revision_timestamp"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "", new com.sonicle.jooq.jsr310.OffsetDateTimeJodaConverter());

    /**
     * The column <code>drm.opportunity_action_documents.revision_sequence</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord, java.lang.Short> REVISION_SEQUENCE = createField(org.jooq.impl.DSL.name("revision_sequence"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>drm.opportunity_action_documents.filename</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord, java.lang.String> FILENAME = createField(org.jooq.impl.DSL.name("filename"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>drm.opportunity_action_documents.size</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord, java.lang.Long> SIZE = createField(org.jooq.impl.DSL.name("size"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>drm.opportunity_action_documents.media_type</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord, java.lang.String> MEDIA_TYPE = createField(org.jooq.impl.DSL.name("media_type"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    private OpportunityActionDocuments(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OpportunityActionDocuments(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.opportunity_action_documents</code> table reference
     */
    public OpportunityActionDocuments(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), OPPORTUNITY_ACTION_DOCUMENTS);
    }

    /**
     * Create an aliased <code>drm.opportunity_action_documents</code> table reference
     */
    public OpportunityActionDocuments(org.jooq.Name alias) {
        this(alias, OPPORTUNITY_ACTION_DOCUMENTS);
    }

    /**
     * Create a <code>drm.opportunity_action_documents</code> table reference
     */
    public OpportunityActionDocuments() {
        this(org.jooq.impl.DSL.name("opportunity_action_documents"), null);
    }

    public <O extends org.jooq.Record> OpportunityActionDocuments(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord> key) {
        super(child, key, OPPORTUNITY_ACTION_DOCUMENTS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.OPPORTUNITY_ACTION_DOCUMENTS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.OpportunityActionDocumentsRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.OPPORTUNITY_ACTION_DOCUMENTS_PKEY);
    }

    @java.lang.Override
    public OpportunityActionDocuments as(java.lang.String alias) {
        return new OpportunityActionDocuments(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public OpportunityActionDocuments as(org.jooq.Name alias) {
        return new OpportunityActionDocuments(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public OpportunityActionDocuments rename(java.lang.String name) {
        return new OpportunityActionDocuments(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public OpportunityActionDocuments rename(org.jooq.Name name) {
        return new OpportunityActionDocuments(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row7<java.lang.String, java.lang.Integer, org.joda.time.DateTime, java.lang.Short, java.lang.String, java.lang.Long, java.lang.String> fieldsRow() {
        return (org.jooq.Row7) super.fieldsRow();
    }
}
