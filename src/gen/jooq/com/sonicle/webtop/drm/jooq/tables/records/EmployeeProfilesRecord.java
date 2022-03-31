/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeProfilesRecord extends org.jooq.impl.UpdatableRecordImpl<EmployeeProfilesRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.employee_profiles.id</code>.
     */
    public void setId(java.lang.Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.employee_profiles.id</code>.
     */
    public java.lang.Integer getId() {
        return (java.lang.Integer) get(0);
    }

    /**
     * Setter for <code>drm.employee_profiles.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.employee_profiles.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.employee_profiles.user_id</code>.
     */
    public void setUserId(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.employee_profiles.user_id</code>.
     */
    public java.lang.String getUserId() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>drm.employee_profiles.number</code>.
     */
    public void setNumber(java.lang.String value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.employee_profiles.number</code>.
     */
    public java.lang.String getNumber() {
        return (java.lang.String) get(3);
    }

    /**
     * Setter for <code>drm.employee_profiles.tolerance</code>.
     */
    public void setTolerance(java.lang.String value) {
        set(4, value);
    }

    /**
     * Getter for <code>drm.employee_profiles.tolerance</code>.
     */
    public java.lang.String getTolerance() {
        return (java.lang.String) get(4);
    }

    /**
     * Setter for <code>drm.employee_profiles.extraordinary</code>.
     */
    public void setExtraordinary(java.lang.Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>drm.employee_profiles.extraordinary</code>.
     */
    public java.lang.Boolean getExtraordinary() {
        return (java.lang.Boolean) get(5);
    }

    /**
     * Setter for <code>drm.employee_profiles.only_presence</code>.
     */
    public void setOnlyPresence(java.lang.Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>drm.employee_profiles.only_presence</code>.
     */
    public java.lang.Boolean getOnlyPresence() {
        return (java.lang.Boolean) get(6);
    }

    /**
     * Setter for <code>drm.employee_profiles.hour_profile_id</code>.
     */
    public void setHourProfileId(java.lang.Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>drm.employee_profiles.hour_profile_id</code>.
     */
    public java.lang.Integer getHourProfileId() {
        return (java.lang.Integer) get(7);
    }

    /**
     * Setter for <code>drm.employee_profiles.headquarters_code</code>.
     */
    public void setHeadquartersCode(java.lang.String value) {
        set(8, value);
    }

    /**
     * Getter for <code>drm.employee_profiles.headquarters_code</code>.
     */
    public java.lang.String getHeadquartersCode() {
        return (java.lang.String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String> fieldsRow() {
        return (org.jooq.Row9) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String> valuesRow() {
        return (org.jooq.Row9) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return com.sonicle.webtop.drm.jooq.tables.EmployeeProfiles.EMPLOYEE_PROFILES.ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.EmployeeProfiles.EMPLOYEE_PROFILES.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.EmployeeProfiles.EMPLOYEE_PROFILES.USER_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field4() {
        return com.sonicle.webtop.drm.jooq.tables.EmployeeProfiles.EMPLOYEE_PROFILES.NUMBER;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field5() {
        return com.sonicle.webtop.drm.jooq.tables.EmployeeProfiles.EMPLOYEE_PROFILES.TOLERANCE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field6() {
        return com.sonicle.webtop.drm.jooq.tables.EmployeeProfiles.EMPLOYEE_PROFILES.EXTRAORDINARY;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field7() {
        return com.sonicle.webtop.drm.jooq.tables.EmployeeProfiles.EMPLOYEE_PROFILES.ONLY_PRESENCE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field8() {
        return com.sonicle.webtop.drm.jooq.tables.EmployeeProfiles.EMPLOYEE_PROFILES.HOUR_PROFILE_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field9() {
        return com.sonicle.webtop.drm.jooq.tables.EmployeeProfiles.EMPLOYEE_PROFILES.HEADQUARTERS_CODE;
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
        return getNumber();
    }

    @java.lang.Override
    public java.lang.String component5() {
        return getTolerance();
    }

    @java.lang.Override
    public java.lang.Boolean component6() {
        return getExtraordinary();
    }

    @java.lang.Override
    public java.lang.Boolean component7() {
        return getOnlyPresence();
    }

    @java.lang.Override
    public java.lang.Integer component8() {
        return getHourProfileId();
    }

    @java.lang.Override
    public java.lang.String component9() {
        return getHeadquartersCode();
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
        return getNumber();
    }

    @java.lang.Override
    public java.lang.String value5() {
        return getTolerance();
    }

    @java.lang.Override
    public java.lang.Boolean value6() {
        return getExtraordinary();
    }

    @java.lang.Override
    public java.lang.Boolean value7() {
        return getOnlyPresence();
    }

    @java.lang.Override
    public java.lang.Integer value8() {
        return getHourProfileId();
    }

    @java.lang.Override
    public java.lang.String value9() {
        return getHeadquartersCode();
    }

    @java.lang.Override
    public EmployeeProfilesRecord value1(java.lang.Integer value) {
        setId(value);
        return this;
    }

    @java.lang.Override
    public EmployeeProfilesRecord value2(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public EmployeeProfilesRecord value3(java.lang.String value) {
        setUserId(value);
        return this;
    }

    @java.lang.Override
    public EmployeeProfilesRecord value4(java.lang.String value) {
        setNumber(value);
        return this;
    }

    @java.lang.Override
    public EmployeeProfilesRecord value5(java.lang.String value) {
        setTolerance(value);
        return this;
    }

    @java.lang.Override
    public EmployeeProfilesRecord value6(java.lang.Boolean value) {
        setExtraordinary(value);
        return this;
    }

    @java.lang.Override
    public EmployeeProfilesRecord value7(java.lang.Boolean value) {
        setOnlyPresence(value);
        return this;
    }

    @java.lang.Override
    public EmployeeProfilesRecord value8(java.lang.Integer value) {
        setHourProfileId(value);
        return this;
    }

    @java.lang.Override
    public EmployeeProfilesRecord value9(java.lang.String value) {
        setHeadquartersCode(value);
        return this;
    }

    @java.lang.Override
    public EmployeeProfilesRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.Boolean value6, java.lang.Boolean value7, java.lang.Integer value8, java.lang.String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeeProfilesRecord
     */
    public EmployeeProfilesRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.EmployeeProfiles.EMPLOYEE_PROFILES);
    }

    /**
     * Create a detached, initialised EmployeeProfilesRecord
     */
    public EmployeeProfilesRecord(java.lang.Integer id, java.lang.String domainId, java.lang.String userId, java.lang.String number, java.lang.String tolerance, java.lang.Boolean extraordinary, java.lang.Boolean onlyPresence, java.lang.Integer hourProfileId, java.lang.String headquartersCode) {
        super(com.sonicle.webtop.drm.jooq.tables.EmployeeProfiles.EMPLOYEE_PROFILES);

        setId(id);
        setDomainId(domainId);
        setUserId(userId);
        setNumber(number);
        setTolerance(tolerance);
        setExtraordinary(extraordinary);
        setOnlyPresence(onlyPresence);
        setHourProfileId(hourProfileId);
        setHeadquartersCode(headquartersCode);
    }
}
