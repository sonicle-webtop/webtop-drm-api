/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpportunityInterlocutorsRecord extends org.jooq.impl.UpdatableRecordImpl<OpportunityInterlocutorsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.opportunity_interlocutors.id</code>.
     */
    public void setId(java.lang.Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.opportunity_interlocutors.id</code>.
     */
    public java.lang.Integer getId() {
        return (java.lang.Integer) get(0);
    }

    /**
     * Setter for <code>drm.opportunity_interlocutors.opportunity_id</code>.
     */
    public void setOpportunityId(java.lang.Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.opportunity_interlocutors.opportunity_id</code>.
     */
    public java.lang.Integer getOpportunityId() {
        return (java.lang.Integer) get(1);
    }

    /**
     * Setter for <code>drm.opportunity_interlocutors.contact_id</code>.
     */
    public void setContactId(java.lang.Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.opportunity_interlocutors.contact_id</code>.
     */
    public java.lang.Integer getContactId() {
        return (java.lang.Integer) get(2);
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
    public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
        return (org.jooq.Row3) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
        return (org.jooq.Row3) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityInterlocutors.OPPORTUNITY_INTERLOCUTORS.ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field2() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityInterlocutors.OPPORTUNITY_INTERLOCUTORS.OPPORTUNITY_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field3() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityInterlocutors.OPPORTUNITY_INTERLOCUTORS.CONTACT_ID;
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
    public java.lang.Integer component3() {
        return getContactId();
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
    public java.lang.Integer value3() {
        return getContactId();
    }

    @java.lang.Override
    public OpportunityInterlocutorsRecord value1(java.lang.Integer value) {
        setId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityInterlocutorsRecord value2(java.lang.Integer value) {
        setOpportunityId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityInterlocutorsRecord value3(java.lang.Integer value) {
        setContactId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityInterlocutorsRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OpportunityInterlocutorsRecord
     */
    public OpportunityInterlocutorsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.OpportunityInterlocutors.OPPORTUNITY_INTERLOCUTORS);
    }

    /**
     * Create a detached, initialised OpportunityInterlocutorsRecord
     */
    public OpportunityInterlocutorsRecord(java.lang.Integer id, java.lang.Integer opportunityId, java.lang.Integer contactId) {
        super(com.sonicle.webtop.drm.jooq.tables.OpportunityInterlocutors.OPPORTUNITY_INTERLOCUTORS);

        setId(id);
        setOpportunityId(opportunityId);
        setContactId(contactId);
    }
}
