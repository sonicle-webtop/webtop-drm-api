/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimetableStampRecord extends org.jooq.impl.UpdatableRecordImpl<TimetableStampRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, org.joda.time.LocalDateTime, org.joda.time.LocalDateTime, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.timetable_stamp.id</code>.
     */
    public void setId(java.lang.Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.timetable_stamp.id</code>.
     */
    public java.lang.Integer getId() {
        return (java.lang.Integer) get(0);
    }

    /**
     * Setter for <code>drm.timetable_stamp.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.timetable_stamp.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.timetable_stamp.user_id</code>.
     */
    public void setUserId(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.timetable_stamp.user_id</code>.
     */
    public java.lang.String getUserId() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>drm.timetable_stamp.type</code>.
     */
    public void setType(java.lang.String value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.timetable_stamp.type</code>.
     */
    public java.lang.String getType() {
        return (java.lang.String) get(3);
    }

    /**
     * Setter for <code>drm.timetable_stamp.entrance</code>.
     */
    public void setEntrance(org.joda.time.LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>drm.timetable_stamp.entrance</code>.
     */
    public org.joda.time.LocalDateTime getEntrance() {
        return (org.joda.time.LocalDateTime) get(4);
    }

    /**
     * Setter for <code>drm.timetable_stamp.exit</code>.
     */
    public void setExit(org.joda.time.LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>drm.timetable_stamp.exit</code>.
     */
    public org.joda.time.LocalDateTime getExit() {
        return (org.joda.time.LocalDateTime) get(5);
    }

    /**
     * Setter for <code>drm.timetable_stamp.location</code>.
     */
    public void setLocation(java.lang.String value) {
        set(6, value);
    }

    /**
     * Getter for <code>drm.timetable_stamp.location</code>.
     */
    public java.lang.String getLocation() {
        return (java.lang.String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row7<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, org.joda.time.LocalDateTime, org.joda.time.LocalDateTime, java.lang.String> fieldsRow() {
        return (org.jooq.Row7) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row7<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, org.joda.time.LocalDateTime, org.joda.time.LocalDateTime, java.lang.String> valuesRow() {
        return (org.jooq.Row7) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return com.sonicle.webtop.drm.jooq.tables.TimetableStamp.TIMETABLE_STAMP.ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.TimetableStamp.TIMETABLE_STAMP.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.TimetableStamp.TIMETABLE_STAMP.USER_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field4() {
        return com.sonicle.webtop.drm.jooq.tables.TimetableStamp.TIMETABLE_STAMP.TYPE;
    }

    @java.lang.Override
    public org.jooq.Field<org.joda.time.LocalDateTime> field5() {
        return com.sonicle.webtop.drm.jooq.tables.TimetableStamp.TIMETABLE_STAMP.ENTRANCE;
    }

    @java.lang.Override
    public org.jooq.Field<org.joda.time.LocalDateTime> field6() {
        return com.sonicle.webtop.drm.jooq.tables.TimetableStamp.TIMETABLE_STAMP.EXIT;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field7() {
        return com.sonicle.webtop.drm.jooq.tables.TimetableStamp.TIMETABLE_STAMP.LOCATION;
    }

    @java.lang.Override
    public java.lang.Integer component1() {
        return getId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getUserId();
    }

    @java.lang.Override
    public java.lang.String component4() {
        return getType();
    }

    @java.lang.Override
    public org.joda.time.LocalDateTime component5() {
        return getEntrance();
    }

    @java.lang.Override
    public org.joda.time.LocalDateTime component6() {
        return getExit();
    }

    @java.lang.Override
    public java.lang.String component7() {
        return getLocation();
    }

    @java.lang.Override
    public java.lang.Integer value1() {
        return getId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getUserId();
    }

    @java.lang.Override
    public java.lang.String value4() {
        return getType();
    }

    @java.lang.Override
    public org.joda.time.LocalDateTime value5() {
        return getEntrance();
    }

    @java.lang.Override
    public org.joda.time.LocalDateTime value6() {
        return getExit();
    }

    @java.lang.Override
    public java.lang.String value7() {
        return getLocation();
    }

    @java.lang.Override
    public TimetableStampRecord value1(java.lang.Integer value) {
        setId(value);
        return this;
    }

    @java.lang.Override
    public TimetableStampRecord value2(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public TimetableStampRecord value3(java.lang.String value) {
        setUserId(value);
        return this;
    }

    @java.lang.Override
    public TimetableStampRecord value4(java.lang.String value) {
        setType(value);
        return this;
    }

    @java.lang.Override
    public TimetableStampRecord value5(org.joda.time.LocalDateTime value) {
        setEntrance(value);
        return this;
    }

    @java.lang.Override
    public TimetableStampRecord value6(org.joda.time.LocalDateTime value) {
        setExit(value);
        return this;
    }

    @java.lang.Override
    public TimetableStampRecord value7(java.lang.String value) {
        setLocation(value);
        return this;
    }

    @java.lang.Override
    public TimetableStampRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, org.joda.time.LocalDateTime value5, org.joda.time.LocalDateTime value6, java.lang.String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TimetableStampRecord
     */
    public TimetableStampRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.TimetableStamp.TIMETABLE_STAMP);
    }

    /**
     * Create a detached, initialised TimetableStampRecord
     */
    public TimetableStampRecord(java.lang.Integer id, java.lang.String domainId, java.lang.String userId, java.lang.String type, org.joda.time.LocalDateTime entrance, org.joda.time.LocalDateTime exit, java.lang.String location) {
        super(com.sonicle.webtop.drm.jooq.tables.TimetableStamp.TIMETABLE_STAMP);

        setId(id);
        setDomainId(domainId);
        setUserId(userId);
        setType(type);
        setEntrance(entrance);
        setExit(exit);
        setLocation(location);
    }
}
