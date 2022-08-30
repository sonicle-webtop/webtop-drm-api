/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeProfiles extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.employee_profiles</code>
     */
    public static final EmployeeProfiles EMPLOYEE_PROFILES = new EmployeeProfiles();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord.class;
    }

    /**
     * The column <code>drm.employee_profiles.id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord, java.lang.Integer> ID = createField(org.jooq.impl.DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.employee_profiles.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>drm.employee_profiles.user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord, java.lang.String> USER_ID = createField(org.jooq.impl.DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.employee_profiles.number</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord, java.lang.String> NUMBER = createField(org.jooq.impl.DSL.name("number"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.employee_profiles.tolerance</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord, java.lang.String> TOLERANCE = createField(org.jooq.impl.DSL.name("tolerance"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.employee_profiles.extraordinary</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord, java.lang.Boolean> EXTRAORDINARY = createField(org.jooq.impl.DSL.name("extraordinary"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.employee_profiles.only_presence</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord, java.lang.Boolean> ONLY_PRESENCE = createField(org.jooq.impl.DSL.name("only_presence"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.employee_profiles.hour_profile_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord, java.lang.Integer> HOUR_PROFILE_ID = createField(org.jooq.impl.DSL.name("hour_profile_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.employee_profiles.headquarters_code</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord, java.lang.String> HEADQUARTERS_CODE = createField(org.jooq.impl.DSL.name("headquarters_code"), org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>drm.employee_profiles.no_stamping</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord, java.lang.Boolean> NO_STAMPING = createField(org.jooq.impl.DSL.name("no_stamping"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.employee_profiles.minimum_number_of_hours_per_ticket</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord, java.lang.Integer> MINIMUM_NUMBER_OF_HOURS_PER_TICKET = createField(org.jooq.impl.DSL.name("minimum_number_of_hours_per_ticket"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    private EmployeeProfiles(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmployeeProfiles(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.employee_profiles</code> table reference
     */
    public EmployeeProfiles(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), EMPLOYEE_PROFILES);
    }

    /**
     * Create an aliased <code>drm.employee_profiles</code> table reference
     */
    public EmployeeProfiles(org.jooq.Name alias) {
        this(alias, EMPLOYEE_PROFILES);
    }

    /**
     * Create a <code>drm.employee_profiles</code> table reference
     */
    public EmployeeProfiles() {
        this(org.jooq.impl.DSL.name("employee_profiles"), null);
    }

    public <O extends org.jooq.Record> EmployeeProfiles(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord> key) {
        super(child, key, EMPLOYEE_PROFILES);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.EMPLOYEE_PROFILES_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.EmployeeProfilesRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.EMPLOYEE_PROFILES_PKEY);
    }

    @java.lang.Override
    public EmployeeProfiles as(java.lang.String alias) {
        return new EmployeeProfiles(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public EmployeeProfiles as(org.jooq.Name alias) {
        return new EmployeeProfiles(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public EmployeeProfiles rename(java.lang.String name) {
        return new EmployeeProfiles(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public EmployeeProfiles rename(org.jooq.Name name) {
        return new EmployeeProfiles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row11<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Integer> fieldsRow() {
        return (org.jooq.Row11) super.fieldsRow();
    }
}