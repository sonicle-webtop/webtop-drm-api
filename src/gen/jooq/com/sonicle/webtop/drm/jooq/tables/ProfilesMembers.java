/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfilesMembers extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.profiles_members</code>
     */
    public static final ProfilesMembers PROFILES_MEMBERS = new ProfilesMembers();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord.class;
    }

    /**
     * The column <code>drm.profiles_members.id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord, java.lang.Integer> ID = createField(org.jooq.impl.DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('drm.seq_profiles_members'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>drm.profiles_members.profile_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord, java.lang.String> PROFILE_ID = createField(org.jooq.impl.DSL.name("profile_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.profiles_members.user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord, java.lang.String> USER_ID = createField(org.jooq.impl.DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    private ProfilesMembers(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProfilesMembers(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.profiles_members</code> table reference
     */
    public ProfilesMembers(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), PROFILES_MEMBERS);
    }

    /**
     * Create an aliased <code>drm.profiles_members</code> table reference
     */
    public ProfilesMembers(org.jooq.Name alias) {
        this(alias, PROFILES_MEMBERS);
    }

    /**
     * Create a <code>drm.profiles_members</code> table reference
     */
    public ProfilesMembers() {
        this(org.jooq.impl.DSL.name("profiles_members"), null);
    }

    public <O extends org.jooq.Record> ProfilesMembers(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord> key) {
        super(child, key, PROFILES_MEMBERS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.PROFILES_MEMBERS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.PROFILES_MEMBERS_PKEY);
    }

    @java.lang.Override
    public ProfilesMembers as(java.lang.String alias) {
        return new ProfilesMembers(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public ProfilesMembers as(org.jooq.Name alias) {
        return new ProfilesMembers(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public ProfilesMembers rename(java.lang.String name) {
        return new ProfilesMembers(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public ProfilesMembers rename(org.jooq.Name name) {
        return new ProfilesMembers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row3) super.fieldsRow();
    }
}
