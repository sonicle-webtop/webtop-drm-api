/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimetableEventsCopy extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.timetable_events_copy</code>
     */
    public static final TimetableEventsCopy TIMETABLE_EVENTS_COPY = new TimetableEventsCopy();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord.class;
    }

    /**
     * The column <code>drm.timetable_events_copy.timetable_event_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord, java.lang.Integer> TIMETABLE_EVENT_ID = createField(org.jooq.impl.DSL.name("timetable_event_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.timetable_events_copy.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>drm.timetable_events_copy.company_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord, java.lang.Integer> COMPANY_ID = createField(org.jooq.impl.DSL.name("company_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.timetable_events_copy.user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord, java.lang.String> USER_ID = createField(org.jooq.impl.DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.timetable_events_copy.type</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord, java.lang.String> TYPE = createField(org.jooq.impl.DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>drm.timetable_events_copy.date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord, org.joda.time.LocalDate> DATE = createField(org.jooq.impl.DSL.name("date"), org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "", new com.sonicle.jooq.jsr310.LocalDateJodaConverter());

    /**
     * The column <code>drm.timetable_events_copy.hour</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord, java.lang.String> HOUR = createField(org.jooq.impl.DSL.name("hour"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.timetable_events_copy.leave_request_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord, java.lang.Integer> LEAVE_REQUEST_ID = createField(org.jooq.impl.DSL.name("leave_request_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    private TimetableEventsCopy(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord> aliased) {
        this(alias, aliased, null);
    }

    private TimetableEventsCopy(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.timetable_events_copy</code> table reference
     */
    public TimetableEventsCopy(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), TIMETABLE_EVENTS_COPY);
    }

    /**
     * Create an aliased <code>drm.timetable_events_copy</code> table reference
     */
    public TimetableEventsCopy(org.jooq.Name alias) {
        this(alias, TIMETABLE_EVENTS_COPY);
    }

    /**
     * Create a <code>drm.timetable_events_copy</code> table reference
     */
    public TimetableEventsCopy() {
        this(org.jooq.impl.DSL.name("timetable_events_copy"), null);
    }

    public <O extends org.jooq.Record> TimetableEventsCopy(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord> key) {
        super(child, key, TIMETABLE_EVENTS_COPY);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.TIMETABLE_EVENTS_COPY_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableEventsCopyRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.TIMETABLE_EVENTS_COPY_PKEY);
    }

    @java.lang.Override
    public TimetableEventsCopy as(java.lang.String alias) {
        return new TimetableEventsCopy(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public TimetableEventsCopy as(org.jooq.Name alias) {
        return new TimetableEventsCopy(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public TimetableEventsCopy rename(java.lang.String name) {
        return new TimetableEventsCopy(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public TimetableEventsCopy rename(org.jooq.Name name) {
        return new TimetableEventsCopy(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row8<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, org.joda.time.LocalDate, java.lang.String, java.lang.Integer> fieldsRow() {
        return (org.jooq.Row8) super.fieldsRow();
    }
}
