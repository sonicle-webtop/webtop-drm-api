/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimetableStamp extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.timetable_stamp</code>
     */
    public static final TimetableStamp TIMETABLE_STAMP = new TimetableStamp();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord.class;
    }

    /**
     * The column <code>drm.timetable_stamp.id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord, java.lang.Integer> ID = createField(org.jooq.impl.DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.timetable_stamp.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>drm.timetable_stamp.user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord, java.lang.String> USER_ID = createField(org.jooq.impl.DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.timetable_stamp.type</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord, java.lang.String> TYPE = createField(org.jooq.impl.DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>drm.timetable_stamp.entrance</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord, org.joda.time.LocalDateTime> ENTRANCE = createField(org.jooq.impl.DSL.name("entrance"), org.jooq.impl.SQLDataType.LOCALDATETIME(6), this, "", new com.sonicle.jooq.jsr310.LocalDateTimeJodaConverter());

    /**
     * The column <code>drm.timetable_stamp.exit</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord, org.joda.time.LocalDateTime> EXIT = createField(org.jooq.impl.DSL.name("exit"), org.jooq.impl.SQLDataType.LOCALDATETIME(6), this, "", new com.sonicle.jooq.jsr310.LocalDateTimeJodaConverter());

    /**
     * The column <code>drm.timetable_stamp.location</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord, java.lang.String> LOCATION = createField(org.jooq.impl.DSL.name("location"), org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    private TimetableStamp(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord> aliased) {
        this(alias, aliased, null);
    }

    private TimetableStamp(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.timetable_stamp</code> table reference
     */
    public TimetableStamp(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), TIMETABLE_STAMP);
    }

    /**
     * Create an aliased <code>drm.timetable_stamp</code> table reference
     */
    public TimetableStamp(org.jooq.Name alias) {
        this(alias, TIMETABLE_STAMP);
    }

    /**
     * Create a <code>drm.timetable_stamp</code> table reference
     */
    public TimetableStamp() {
        this(org.jooq.impl.DSL.name("timetable_stamp"), null);
    }

    public <O extends org.jooq.Record> TimetableStamp(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord> key) {
        super(child, key, TIMETABLE_STAMP);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.TIMETABLE_STAMP_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableStampRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.TIMETABLE_STAMP_PKEY);
    }

    @java.lang.Override
    public TimetableStamp as(java.lang.String alias) {
        return new TimetableStamp(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public TimetableStamp as(org.jooq.Name alias) {
        return new TimetableStamp(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public TimetableStamp rename(java.lang.String name) {
        return new TimetableStamp(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public TimetableStamp rename(org.jooq.Name name) {
        return new TimetableStamp(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row7<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, org.joda.time.LocalDateTime, org.joda.time.LocalDateTime, java.lang.String> fieldsRow() {
        return (org.jooq.Row7) super.fieldsRow();
    }
}
