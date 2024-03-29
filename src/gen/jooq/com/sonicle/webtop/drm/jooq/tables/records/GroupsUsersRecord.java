/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupsUsersRecord extends org.jooq.impl.UpdatableRecordImpl<GroupsUsersRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.groups_users.association_id</code>.
     */
    public void setAssociationId(java.lang.Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.groups_users.association_id</code>.
     */
    public java.lang.Integer getAssociationId() {
        return (java.lang.Integer) get(0);
    }

    /**
     * Setter for <code>drm.groups_users.group_id</code>.
     */
    public void setGroupId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.groups_users.group_id</code>.
     */
    public java.lang.String getGroupId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.groups_users.user_id</code>.
     */
    public void setUserId(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.groups_users.user_id</code>.
     */
    public java.lang.String getUserId() {
        return (java.lang.String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row3) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
        return (org.jooq.Row3) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return com.sonicle.webtop.drm.jooq.tables.GroupsUsers.GROUPS_USERS.ASSOCIATION_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.GroupsUsers.GROUPS_USERS.GROUP_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.GroupsUsers.GROUPS_USERS.USER_ID;
    }

    @java.lang.Override
    public java.lang.Integer component1() {
        return getAssociationId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getGroupId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getUserId();
    }

    @java.lang.Override
    public java.lang.Integer value1() {
        return getAssociationId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getGroupId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getUserId();
    }

    @java.lang.Override
    public GroupsUsersRecord value1(java.lang.Integer value) {
        setAssociationId(value);
        return this;
    }

    @java.lang.Override
    public GroupsUsersRecord value2(java.lang.String value) {
        setGroupId(value);
        return this;
    }

    @java.lang.Override
    public GroupsUsersRecord value3(java.lang.String value) {
        setUserId(value);
        return this;
    }

    @java.lang.Override
    public GroupsUsersRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GroupsUsersRecord
     */
    public GroupsUsersRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.GroupsUsers.GROUPS_USERS);
    }

    /**
     * Create a detached, initialised GroupsUsersRecord
     */
    public GroupsUsersRecord(java.lang.Integer associationId, java.lang.String groupId, java.lang.String userId) {
        super(com.sonicle.webtop.drm.jooq.tables.GroupsUsers.GROUPS_USERS);

        setAssociationId(associationId);
        setGroupId(groupId);
        setUserId(userId);
    }
}
