/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfilesSupervisedUsers extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.profiles_supervised_users</code>
     */
    public static final ProfilesSupervisedUsers PROFILES_SUPERVISED_USERS = new ProfilesSupervisedUsers();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord.class;
    }

    /**
     * The column <code>drm.profiles_supervised_users.id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord, java.lang.Integer> ID = createField(org.jooq.impl.DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('drm.seq_profiles_supervised_users'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>drm.profiles_supervised_users.profile_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord, java.lang.String> PROFILE_ID = createField(org.jooq.impl.DSL.name("profile_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.profiles_supervised_users.user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord, java.lang.String> USER_ID = createField(org.jooq.impl.DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    private ProfilesSupervisedUsers(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProfilesSupervisedUsers(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.profiles_supervised_users</code> table reference
     */
    public ProfilesSupervisedUsers(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), PROFILES_SUPERVISED_USERS);
    }

    /**
     * Create an aliased <code>drm.profiles_supervised_users</code> table reference
     */
    public ProfilesSupervisedUsers(org.jooq.Name alias) {
        this(alias, PROFILES_SUPERVISED_USERS);
    }

    /**
     * Create a <code>drm.profiles_supervised_users</code> table reference
     */
    public ProfilesSupervisedUsers() {
        this(org.jooq.impl.DSL.name("profiles_supervised_users"), null);
    }

    public <O extends org.jooq.Record> ProfilesSupervisedUsers(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord> key) {
        super(child, key, PROFILES_SUPERVISED_USERS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.PROFILES_SUPERVISED_USERS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.ProfilesSupervisedUsersRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.PROFILES_SUPERVISED_USERS_PKEY);
    }

    @java.lang.Override
    public ProfilesSupervisedUsers as(java.lang.String alias) {
        return new ProfilesSupervisedUsers(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public ProfilesSupervisedUsers as(org.jooq.Name alias) {
        return new ProfilesSupervisedUsers(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public ProfilesSupervisedUsers rename(java.lang.String name) {
        return new ProfilesSupervisedUsers(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public ProfilesSupervisedUsers rename(org.jooq.Name name) {
        return new ProfilesSupervisedUsers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row3) super.fieldsRow();
    }
}
