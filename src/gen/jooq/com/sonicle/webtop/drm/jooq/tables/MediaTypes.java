/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MediaTypes extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.MediaTypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>core.media_types</code>
     */
    public static final MediaTypes MEDIA_TYPES = new MediaTypes();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.MediaTypesRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.MediaTypesRecord.class;
    }

    /**
     * The column <code>core.media_types.extension</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MediaTypesRecord, java.lang.String> EXTENSION = createField(org.jooq.impl.DSL.name("extension"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>core.media_types.media_type</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MediaTypesRecord, java.lang.String> MEDIA_TYPE = createField(org.jooq.impl.DSL.name("media_type"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    private MediaTypes(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.MediaTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private MediaTypes(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.MediaTypesRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>core.media_types</code> table reference
     */
    public MediaTypes(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), MEDIA_TYPES);
    }

    /**
     * Create an aliased <code>core.media_types</code> table reference
     */
    public MediaTypes(org.jooq.Name alias) {
        this(alias, MEDIA_TYPES);
    }

    /**
     * Create a <code>core.media_types</code> table reference
     */
    public MediaTypes() {
        this(org.jooq.impl.DSL.name("media_types"), null);
    }

    public <O extends org.jooq.Record> MediaTypes(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.MediaTypesRecord> key) {
        super(child, key, MEDIA_TYPES);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Core.CORE;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.MediaTypesRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.MEDIA_TYPES_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.MediaTypesRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.MediaTypesRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.MEDIA_TYPES_PKEY);
    }

    @java.lang.Override
    public MediaTypes as(java.lang.String alias) {
        return new MediaTypes(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public MediaTypes as(org.jooq.Name alias) {
        return new MediaTypes(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public MediaTypes rename(java.lang.String name) {
        return new MediaTypes(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public MediaTypes rename(org.jooq.Name name) {
        return new MediaTypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row2) super.fieldsRow();
    }
}
