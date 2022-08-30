/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LineManagers extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.LineManagersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.line_managers</code>
     */
    public static final LineManagers LINE_MANAGERS = new LineManagers();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.LineManagersRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.LineManagersRecord.class;
    }

    /**
     * The column <code>drm.line_managers.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LineManagersRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>drm.line_managers.user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LineManagersRecord, java.lang.String> USER_ID = createField(org.jooq.impl.DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    private LineManagers(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.LineManagersRecord> aliased) {
        this(alias, aliased, null);
    }

    private LineManagers(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.LineManagersRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.line_managers</code> table reference
     */
    public LineManagers(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), LINE_MANAGERS);
    }

    /**
     * Create an aliased <code>drm.line_managers</code> table reference
     */
    public LineManagers(org.jooq.Name alias) {
        this(alias, LINE_MANAGERS);
    }

    /**
     * Create a <code>drm.line_managers</code> table reference
     */
    public LineManagers() {
        this(org.jooq.impl.DSL.name("line_managers"), null);
    }

    public <O extends org.jooq.Record> LineManagers(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.LineManagersRecord> key) {
        super(child, key, LINE_MANAGERS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.LineManagersRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.LINE_MANAGERS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.LineManagersRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.LineManagersRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.LINE_MANAGERS_PKEY);
    }

    @java.lang.Override
    public LineManagers as(java.lang.String alias) {
        return new LineManagers(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public LineManagers as(org.jooq.Name alias) {
        return new LineManagers(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public LineManagers rename(java.lang.String name) {
        return new LineManagers(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public LineManagers rename(org.jooq.Name name) {
        return new LineManagers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row2) super.fieldsRow();
    }
}