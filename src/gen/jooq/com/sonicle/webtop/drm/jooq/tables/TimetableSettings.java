/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimetableSettings extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.timetable_settings</code>
     */
    public static final TimetableSettings TIMETABLE_SETTINGS = new TimetableSettings();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord.class;
    }

    /**
     * The column <code>drm.timetable_settings.timetable_setting_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Integer> TIMETABLE_SETTING_ID = createField(org.jooq.impl.DSL.name("timetable_setting_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.timetable_settings.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>drm.timetable_settings.allowed_addresses</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> ALLOWED_ADDRESSES = createField(org.jooq.impl.DSL.name("allowed_addresses"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.timetable_settings.allowed_users</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> ALLOWED_USERS = createField(org.jooq.impl.DSL.name("allowed_users"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.timetable_settings.staff_office_email</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> STAFF_OFFICE_EMAIL = createField(org.jooq.impl.DSL.name("staff_office_email"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.timetable_settings.requests_holidays_permits_previous_dates</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> REQUESTS_HOLIDAYS_PERMITS_PREVIOUS_DATES = createField(org.jooq.impl.DSL.name("requests_holidays_permits_previous_dates"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.timetable_settings.total_tolerance_in_minutes</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> TOTAL_TOLERANCE_IN_MINUTES = createField(org.jooq.impl.DSL.name("total_tolerance_in_minutes"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.timetable_settings.rounding</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> ROUNDING = createField(org.jooq.impl.DSL.name("rounding"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.timetable_settings.minimum_extraordinary</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> MINIMUM_EXTRAORDINARY = createField(org.jooq.impl.DSL.name("minimum_extraordinary"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.timetable_settings.break_anomaly</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> BREAK_ANOMALY = createField(org.jooq.impl.DSL.name("break_anomaly"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>drm.timetable_settings.read_only_events</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> READ_ONLY_EVENTS = createField(org.jooq.impl.DSL.name("read_only_events"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>drm.timetable_settings.requests_permits_not_remunered</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> REQUESTS_PERMITS_NOT_REMUNERED = createField(org.jooq.impl.DSL.name("requests_permits_not_remunered"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>drm.timetable_settings.requests_permits_medical_visits</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> REQUESTS_PERMITS_MEDICAL_VISITS = createField(org.jooq.impl.DSL.name("requests_permits_medical_visits"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>drm.timetable_settings.requests_permits_contractuals</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> REQUESTS_PERMITS_CONTRACTUALS = createField(org.jooq.impl.DSL.name("requests_permits_contractuals"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>drm.timetable_settings.company_exit</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> COMPANY_EXIT = createField(org.jooq.impl.DSL.name("company_exit"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>drm.timetable_settings.manage_stamp</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> MANAGE_STAMP = createField(org.jooq.impl.DSL.name("manage_stamp"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>drm.timetable_settings.medical_visits_automatically_approved</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> MEDICAL_VISITS_AUTOMATICALLY_APPROVED = createField(org.jooq.impl.DSL.name("medical_visits_automatically_approved"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.timetable_settings.calendar_user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> CALENDAR_USER_ID = createField(org.jooq.impl.DSL.name("calendar_user_id"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.timetable_settings.default_event_activity_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Integer> DEFAULT_EVENT_ACTIVITY_ID = createField(org.jooq.impl.DSL.name("default_event_activity_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.timetable_settings.requests_sickness</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> REQUESTS_SICKNESS = createField(org.jooq.impl.DSL.name("requests_sickness"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.timetable_settings.sickness_automatically_approved</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> SICKNESS_AUTOMATICALLY_APPROVED = createField(org.jooq.impl.DSL.name("sickness_automatically_approved"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.timetable_settings.default_causal_working_hours</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> DEFAULT_CAUSAL_WORKING_HOURS = createField(org.jooq.impl.DSL.name("default_causal_working_hours"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_settings.default_causal_overtime</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> DEFAULT_CAUSAL_OVERTIME = createField(org.jooq.impl.DSL.name("default_causal_overtime"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_settings.default_causal_permits</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> DEFAULT_CAUSAL_PERMITS = createField(org.jooq.impl.DSL.name("default_causal_permits"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_settings.default_causal_holidays</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> DEFAULT_CAUSAL_HOLIDAYS = createField(org.jooq.impl.DSL.name("default_causal_holidays"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_settings.default_causal_sickness</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> DEFAULT_CAUSAL_SICKNESS = createField(org.jooq.impl.DSL.name("default_causal_sickness"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_settings.default_causal_medical_visit</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> DEFAULT_CAUSAL_MEDICAL_VISIT = createField(org.jooq.impl.DSL.name("default_causal_medical_visit"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.timetable_settings.minimum_number_of_hours_per_ticket</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Integer> MINIMUM_NUMBER_OF_HOURS_PER_TICKET = createField(org.jooq.impl.DSL.name("minimum_number_of_hours_per_ticket"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>drm.timetable_settings.ticket_management</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> TICKET_MANAGEMENT = createField(org.jooq.impl.DSL.name("ticket_management"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.timetable_settings.automatic_overtime</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.Boolean> AUTOMATIC_OVERTIME = createField(org.jooq.impl.DSL.name("automatic_overtime"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>drm.timetable_settings.default_stamping_mode</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord, java.lang.String> DEFAULT_STAMPING_MODE = createField(org.jooq.impl.DSL.name("default_stamping_mode"), org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.field("'B'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    private TimetableSettings(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TimetableSettings(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.timetable_settings</code> table reference
     */
    public TimetableSettings(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), TIMETABLE_SETTINGS);
    }

    /**
     * Create an aliased <code>drm.timetable_settings</code> table reference
     */
    public TimetableSettings(org.jooq.Name alias) {
        this(alias, TIMETABLE_SETTINGS);
    }

    /**
     * Create a <code>drm.timetable_settings</code> table reference
     */
    public TimetableSettings() {
        this(org.jooq.impl.DSL.name("timetable_settings"), null);
    }

    public <O extends org.jooq.Record> TimetableSettings(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord> key) {
        super(child, key, TIMETABLE_SETTINGS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.TIMETABLE_SETTINGS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableSettingsRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.TIMETABLE_SETTINGS_PKEY);
    }

    @java.lang.Override
    public TimetableSettings as(java.lang.String alias) {
        return new TimetableSettings(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public TimetableSettings as(org.jooq.Name alias) {
        return new TimetableSettings(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public TimetableSettings rename(java.lang.String name) {
        return new TimetableSettings(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public TimetableSettings rename(org.jooq.Name name) {
        return new TimetableSettings(name, null);
    }
}
