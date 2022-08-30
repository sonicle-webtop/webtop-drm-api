/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HolidayDateRecord extends org.jooq.impl.UpdatableRecordImpl<HolidayDateRecord> implements org.jooq.Record4<java.lang.String, org.joda.time.LocalDate, java.lang.String, java.lang.Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.holiday_date.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.holiday_date.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>drm.holiday_date.date</code>.
     */
    public void setDate(org.joda.time.LocalDate value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.holiday_date.date</code>.
     */
    public org.joda.time.LocalDate getDate() {
        return (org.joda.time.LocalDate) get(1);
    }

    /**
     * Setter for <code>drm.holiday_date.description</code>.
     */
    public void setDescription(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.holiday_date.description</code>.
     */
    public java.lang.String getDescription() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>drm.holiday_date.holiday_date_id</code>.
     */
    public void setHolidayDateId(java.lang.Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.holiday_date.holiday_date_id</code>.
     */
    public java.lang.Integer getHolidayDateId() {
        return (java.lang.Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record2<java.lang.String, org.joda.time.LocalDate> key() {
        return (org.jooq.Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row4<java.lang.String, org.joda.time.LocalDate, java.lang.String, java.lang.Integer> fieldsRow() {
        return (org.jooq.Row4) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row4<java.lang.String, org.joda.time.LocalDate, java.lang.String, java.lang.Integer> valuesRow() {
        return (org.jooq.Row4) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.HolidayDate.HOLIDAY_DATE.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<org.joda.time.LocalDate> field2() {
        return com.sonicle.webtop.drm.jooq.tables.HolidayDate.HOLIDAY_DATE.DATE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.HolidayDate.HOLIDAY_DATE.DESCRIPTION;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field4() {
        return com.sonicle.webtop.drm.jooq.tables.HolidayDate.HOLIDAY_DATE.HOLIDAY_DATE_ID;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getDomainId();
    }

    @java.lang.Override
    public org.joda.time.LocalDate component2() {
        return getDate();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.Integer component4() {
        return getHolidayDateId();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getDomainId();
    }

    @java.lang.Override
    public org.joda.time.LocalDate value2() {
        return getDate();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.Integer value4() {
        return getHolidayDateId();
    }

    @java.lang.Override
    public HolidayDateRecord value1(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public HolidayDateRecord value2(org.joda.time.LocalDate value) {
        setDate(value);
        return this;
    }

    @java.lang.Override
    public HolidayDateRecord value3(java.lang.String value) {
        setDescription(value);
        return this;
    }

    @java.lang.Override
    public HolidayDateRecord value4(java.lang.Integer value) {
        setHolidayDateId(value);
        return this;
    }

    @java.lang.Override
    public HolidayDateRecord values(java.lang.String value1, org.joda.time.LocalDate value2, java.lang.String value3, java.lang.Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HolidayDateRecord
     */
    public HolidayDateRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.HolidayDate.HOLIDAY_DATE);
    }

    /**
     * Create a detached, initialised HolidayDateRecord
     */
    public HolidayDateRecord(java.lang.String domainId, org.joda.time.LocalDate date, java.lang.String description, java.lang.Integer holidayDateId) {
        super(com.sonicle.webtop.drm.jooq.tables.HolidayDate.HOLIDAY_DATE);

        setDomainId(domainId);
        setDate(date);
        setDescription(description);
        setHolidayDateId(holidayDateId);
    }
}