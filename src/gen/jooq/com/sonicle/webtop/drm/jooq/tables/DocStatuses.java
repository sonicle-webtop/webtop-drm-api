/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocStatuses extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.doc_statuses</code>
     */
    public static final DocStatuses DOC_STATUSES = new DocStatuses();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord.class;
    }

    /**
     * The column <code>drm.doc_statuses.doc_status_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord, java.lang.Integer> DOC_STATUS_ID = createField(org.jooq.impl.DSL.name("doc_status_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('drm.seq_doc_statuses'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>drm.doc_statuses.name</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord, java.lang.String> NAME = createField(org.jooq.impl.DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.doc_statuses.description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord, java.lang.String> DESCRIPTION = createField(org.jooq.impl.DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>drm.doc_statuses.type</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord, java.lang.String> TYPE = createField(org.jooq.impl.DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>drm.doc_statuses.built_in</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord, java.lang.Boolean> BUILT_IN = createField(org.jooq.impl.DSL.name("built_in"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    private DocStatuses(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DocStatuses(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.doc_statuses</code> table reference
     */
    public DocStatuses(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), DOC_STATUSES);
    }

    /**
     * Create an aliased <code>drm.doc_statuses</code> table reference
     */
    public DocStatuses(org.jooq.Name alias) {
        this(alias, DOC_STATUSES);
    }

    /**
     * Create a <code>drm.doc_statuses</code> table reference
     */
    public DocStatuses() {
        this(org.jooq.impl.DSL.name("doc_statuses"), null);
    }

    public <O extends org.jooq.Record> DocStatuses(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord> key) {
        super(child, key, DOC_STATUSES);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.DOC_STATUSES_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.DocStatusesRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.DOC_STATUSES_PKEY);
    }

    @java.lang.Override
    public DocStatuses as(java.lang.String alias) {
        return new DocStatuses(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public DocStatuses as(org.jooq.Name alias) {
        return new DocStatuses(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public DocStatuses rename(java.lang.String name) {
        return new DocStatuses(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public DocStatuses rename(org.jooq.Name name) {
        return new DocStatuses(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> fieldsRow() {
        return (org.jooq.Row5) super.fieldsRow();
    }
}