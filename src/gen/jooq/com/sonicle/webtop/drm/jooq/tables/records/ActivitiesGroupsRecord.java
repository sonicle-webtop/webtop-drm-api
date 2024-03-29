/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActivitiesGroupsRecord extends org.jooq.impl.UpdatableRecordImpl<ActivitiesGroupsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.activities_groups.association_id</code>.
     */
    public void setAssociationId(java.lang.Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.activities_groups.association_id</code>.
     */
    public java.lang.Integer getAssociationId() {
        return (java.lang.Integer) get(0);
    }

    /**
     * Setter for <code>drm.activities_groups.activity_id</code>.
     */
    public void setActivityId(java.lang.Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.activities_groups.activity_id</code>.
     */
    public java.lang.Integer getActivityId() {
        return (java.lang.Integer) get(1);
    }

    /**
     * Setter for <code>drm.activities_groups.group_id</code>.
     */
    public void setGroupId(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.activities_groups.group_id</code>.
     */
    public java.lang.String getGroupId() {
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
    public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
        return (org.jooq.Row3) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
        return (org.jooq.Row3) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return com.sonicle.webtop.drm.jooq.tables.ActivitiesGroups.ACTIVITIES_GROUPS.ASSOCIATION_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field2() {
        return com.sonicle.webtop.drm.jooq.tables.ActivitiesGroups.ACTIVITIES_GROUPS.ACTIVITY_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.ActivitiesGroups.ACTIVITIES_GROUPS.GROUP_ID;
    }

    @java.lang.Override
    public java.lang.Integer component1() {
        return getAssociationId();
    }

    @java.lang.Override
    public java.lang.Integer component2() {
        return getActivityId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getGroupId();
    }

    @java.lang.Override
    public java.lang.Integer value1() {
        return getAssociationId();
    }

    @java.lang.Override
    public java.lang.Integer value2() {
        return getActivityId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getGroupId();
    }

    @java.lang.Override
    public ActivitiesGroupsRecord value1(java.lang.Integer value) {
        setAssociationId(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesGroupsRecord value2(java.lang.Integer value) {
        setActivityId(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesGroupsRecord value3(java.lang.String value) {
        setGroupId(value);
        return this;
    }

    @java.lang.Override
    public ActivitiesGroupsRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActivitiesGroupsRecord
     */
    public ActivitiesGroupsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.ActivitiesGroups.ACTIVITIES_GROUPS);
    }

    /**
     * Create a detached, initialised ActivitiesGroupsRecord
     */
    public ActivitiesGroupsRecord(java.lang.Integer associationId, java.lang.Integer activityId, java.lang.String groupId) {
        super(com.sonicle.webtop.drm.jooq.tables.ActivitiesGroups.ACTIVITIES_GROUPS);

        setAssociationId(associationId);
        setActivityId(activityId);
        setGroupId(groupId);
    }
}
