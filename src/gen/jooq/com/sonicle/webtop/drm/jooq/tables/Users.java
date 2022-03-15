/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>core.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.UsersRecord.class;
    }

    /**
     * The column <code>core.users.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>core.users.user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord, java.lang.String> USER_ID = createField(org.jooq.impl.DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>core.users.type</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord, java.lang.String> TYPE = createField(org.jooq.impl.DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>core.users.enabled</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord, java.lang.Boolean> ENABLED = createField(org.jooq.impl.DSL.name("enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>core.users.user_uid</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord, java.lang.String> USER_UID = createField(org.jooq.impl.DSL.name("user_uid"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>core.users.display_name</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord, java.lang.String> DISPLAY_NAME = createField(org.jooq.impl.DSL.name("display_name"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>core.users.secret</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord, java.lang.String> SECRET = createField(org.jooq.impl.DSL.name("secret"), org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    private Users(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>core.users</code> table reference
     */
    public Users(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>core.users</code> table reference
     */
    public Users(org.jooq.Name alias) {
        this(alias, USERS);
    }

    /**
     * Create a <code>core.users</code> table reference
     */
    public Users() {
        this(org.jooq.impl.DSL.name("users"), null);
    }

    public <O extends org.jooq.Record> Users(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.UsersRecord> key) {
        super(child, key, USERS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Core.CORE;
    }

    @java.lang.Override
    public java.util.List<org.jooq.Index> getIndexes() {
        return java.util.Arrays.<org.jooq.Index>asList(com.sonicle.webtop.drm.jooq.Indexes.USERS_AK1, com.sonicle.webtop.drm.jooq.Indexes.USERS_AK3, com.sonicle.webtop.drm.jooq.Indexes.USERS_AK4);
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.USERS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.UsersRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.USERS_PKEY);
    }

    @java.lang.Override
    public Users as(java.lang.String alias) {
        return new Users(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public Users as(org.jooq.Name alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public Users rename(java.lang.String name) {
        return new Users(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public Users rename(org.jooq.Name name) {
        return new Users(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row7) super.fieldsRow();
    }
}
