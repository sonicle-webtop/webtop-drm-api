/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LineManagerUsersRecord extends org.jooq.impl.UpdatableRecordImpl<LineManagerUsersRecord> implements org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.line_manager_users.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.line_manager_users.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>drm.line_manager_users.line_manager_user_id</code>.
     */
    public void setLineManagerUserId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.line_manager_users.line_manager_user_id</code>.
     */
    public java.lang.String getLineManagerUserId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.line_manager_users.user_id</code>.
     */
    public void setUserId(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.line_manager_users.user_id</code>.
     */
    public java.lang.String getUserId() {
        return (java.lang.String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String> key() {
        return (org.jooq.Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row3) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> valuesRow() {
        return (org.jooq.Row3) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.LineManagerUsers.LINE_MANAGER_USERS.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.LineManagerUsers.LINE_MANAGER_USERS.LINE_MANAGER_USER_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.LineManagerUsers.LINE_MANAGER_USERS.USER_ID;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getLineManagerUserId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getUserId();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getLineManagerUserId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getUserId();
    }

    @java.lang.Override
    public LineManagerUsersRecord value1(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public LineManagerUsersRecord value2(java.lang.String value) {
        setLineManagerUserId(value);
        return this;
    }

    @java.lang.Override
    public LineManagerUsersRecord value3(java.lang.String value) {
        setUserId(value);
        return this;
    }

    @java.lang.Override
    public LineManagerUsersRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LineManagerUsersRecord
     */
    public LineManagerUsersRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.LineManagerUsers.LINE_MANAGER_USERS);
    }

    /**
     * Create a detached, initialised LineManagerUsersRecord
     */
    public LineManagerUsersRecord(java.lang.String domainId, java.lang.String lineManagerUserId, java.lang.String userId) {
        super(com.sonicle.webtop.drm.jooq.tables.LineManagerUsers.LINE_MANAGER_USERS);

        setDomainId(domainId);
        setLineManagerUserId(lineManagerUserId);
        setUserId(userId);
    }
}
