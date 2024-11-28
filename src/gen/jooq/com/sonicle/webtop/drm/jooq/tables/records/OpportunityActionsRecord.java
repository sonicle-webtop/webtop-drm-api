/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpportunityActionsRecord extends org.jooq.impl.UpdatableRecordImpl<OpportunityActionsRecord> implements org.jooq.Record11<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, org.joda.time.LocalDateTime, org.joda.time.LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.opportunity_actions.id</code>.
     */
    public void setId(java.lang.Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.opportunity_actions.id</code>.
     */
    public java.lang.Integer getId() {
        return (java.lang.Integer) get(0);
    }

    /**
     * Setter for <code>drm.opportunity_actions.opportunity_id</code>.
     */
    public void setOpportunityId(java.lang.Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.opportunity_actions.opportunity_id</code>.
     */
    public java.lang.Integer getOpportunityId() {
        return (java.lang.Integer) get(1);
    }

    /**
     * Setter for <code>drm.opportunity_actions.operator_id</code>.
     */
    public void setOperatorId(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.opportunity_actions.operator_id</code>.
     */
    public java.lang.String getOperatorId() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>drm.opportunity_actions.status_id</code>.
     */
    public void setStatusId(java.lang.Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.opportunity_actions.status_id</code>.
     */
    public java.lang.Integer getStatusId() {
        return (java.lang.Integer) get(3);
    }

    /**
     * Setter for <code>drm.opportunity_actions.description</code>.
     */
    public void setDescription(java.lang.String value) {
        set(4, value);
    }

    /**
     * Getter for <code>drm.opportunity_actions.description</code>.
     */
    public java.lang.String getDescription() {
        return (java.lang.String) get(4);
    }

    /**
     * Setter for <code>drm.opportunity_actions.place</code>.
     */
    public void setPlace(java.lang.String value) {
        set(5, value);
    }

    /**
     * Getter for <code>drm.opportunity_actions.place</code>.
     */
    public java.lang.String getPlace() {
        return (java.lang.String) get(5);
    }

    /**
     * Setter for <code>drm.opportunity_actions.subsequent_actions</code>.
     */
    public void setSubsequentActions(java.lang.String value) {
        set(6, value);
    }

    /**
     * Getter for <code>drm.opportunity_actions.subsequent_actions</code>.
     */
    public java.lang.String getSubsequentActions() {
        return (java.lang.String) get(6);
    }

    /**
     * Setter for <code>drm.opportunity_actions.activity_id</code>.
     */
    public void setActivityId(java.lang.Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>drm.opportunity_actions.activity_id</code>.
     */
    public java.lang.Integer getActivityId() {
        return (java.lang.Integer) get(7);
    }

    /**
     * Setter for <code>drm.opportunity_actions.event_id</code>.
     */
    public void setEventId(java.lang.String value) {
        set(8, value);
    }

    /**
     * Getter for <code>drm.opportunity_actions.event_id</code>.
     */
    public java.lang.String getEventId() {
        return (java.lang.String) get(8);
    }

    /**
     * Setter for <code>drm.opportunity_actions.start_date</code>.
     */
    public void setStartDate(org.joda.time.LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>drm.opportunity_actions.start_date</code>.
     */
    public org.joda.time.LocalDateTime getStartDate() {
        return (org.joda.time.LocalDateTime) get(9);
    }

    /**
     * Setter for <code>drm.opportunity_actions.end_date</code>.
     */
    public void setEndDate(org.joda.time.LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>drm.opportunity_actions.end_date</code>.
     */
    public org.joda.time.LocalDateTime getEndDate() {
        return (org.joda.time.LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row11<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, org.joda.time.LocalDateTime, org.joda.time.LocalDateTime> fieldsRow() {
        return (org.jooq.Row11) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row11<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, org.joda.time.LocalDateTime, org.joda.time.LocalDateTime> valuesRow() {
        return (org.jooq.Row11) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS.ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field2() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS.OPPORTUNITY_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS.OPERATOR_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field4() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS.STATUS_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field5() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS.DESCRIPTION;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field6() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS.PLACE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field7() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS.SUBSEQUENT_ACTIONS;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field8() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS.ACTIVITY_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field9() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS.EVENT_ID;
    }

    @java.lang.Override
    public org.jooq.Field<org.joda.time.LocalDateTime> field10() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS.START_DATE;
    }

    @java.lang.Override
    public org.jooq.Field<org.joda.time.LocalDateTime> field11() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS.END_DATE;
    }

    @java.lang.Override
    public java.lang.Integer component1() {
        return getId();
    }

    @java.lang.Override
    public java.lang.Integer component2() {
        return getOpportunityId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getOperatorId();
    }

    @java.lang.Override
    public java.lang.Integer component4() {
        return getStatusId();
    }

    @java.lang.Override
    public java.lang.String component5() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.String component6() {
        return getPlace();
    }

    @java.lang.Override
    public java.lang.String component7() {
        return getSubsequentActions();
    }

    @java.lang.Override
    public java.lang.Integer component8() {
        return getActivityId();
    }

    @java.lang.Override
    public java.lang.String component9() {
        return getEventId();
    }

    @java.lang.Override
    public org.joda.time.LocalDateTime component10() {
        return getStartDate();
    }

    @java.lang.Override
    public org.joda.time.LocalDateTime component11() {
        return getEndDate();
    }

    @java.lang.Override
    public java.lang.Integer value1() {
        return getId();
    }

    @java.lang.Override
    public java.lang.Integer value2() {
        return getOpportunityId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getOperatorId();
    }

    @java.lang.Override
    public java.lang.Integer value4() {
        return getStatusId();
    }

    @java.lang.Override
    public java.lang.String value5() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.String value6() {
        return getPlace();
    }

    @java.lang.Override
    public java.lang.String value7() {
        return getSubsequentActions();
    }

    @java.lang.Override
    public java.lang.Integer value8() {
        return getActivityId();
    }

    @java.lang.Override
    public java.lang.String value9() {
        return getEventId();
    }

    @java.lang.Override
    public org.joda.time.LocalDateTime value10() {
        return getStartDate();
    }

    @java.lang.Override
    public org.joda.time.LocalDateTime value11() {
        return getEndDate();
    }

    @java.lang.Override
    public OpportunityActionsRecord value1(java.lang.Integer value) {
        setId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionsRecord value2(java.lang.Integer value) {
        setOpportunityId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionsRecord value3(java.lang.String value) {
        setOperatorId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionsRecord value4(java.lang.Integer value) {
        setStatusId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionsRecord value5(java.lang.String value) {
        setDescription(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionsRecord value6(java.lang.String value) {
        setPlace(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionsRecord value7(java.lang.String value) {
        setSubsequentActions(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionsRecord value8(java.lang.Integer value) {
        setActivityId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionsRecord value9(java.lang.String value) {
        setEventId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionsRecord value10(org.joda.time.LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionsRecord value11(org.joda.time.LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionsRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.lang.Integer value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Integer value8, java.lang.String value9, org.joda.time.LocalDateTime value10, org.joda.time.LocalDateTime value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OpportunityActionsRecord
     */
    public OpportunityActionsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS);
    }

    /**
     * Create a detached, initialised OpportunityActionsRecord
     */
    public OpportunityActionsRecord(java.lang.Integer id, java.lang.Integer opportunityId, java.lang.String operatorId, java.lang.Integer statusId, java.lang.String description, java.lang.String place, java.lang.String subsequentActions, java.lang.Integer activityId, java.lang.String eventId, org.joda.time.LocalDateTime startDate, org.joda.time.LocalDateTime endDate) {
        super(com.sonicle.webtop.drm.jooq.tables.OpportunityActions.OPPORTUNITY_ACTIONS);

        setId(id);
        setOpportunityId(opportunityId);
        setOperatorId(operatorId);
        setStatusId(statusId);
        setDescription(description);
        setPlace(place);
        setSubsequentActions(subsequentActions);
        setActivityId(activityId);
        setEventId(eventId);
        setStartDate(startDate);
        setEndDate(endDate);
    }
}
