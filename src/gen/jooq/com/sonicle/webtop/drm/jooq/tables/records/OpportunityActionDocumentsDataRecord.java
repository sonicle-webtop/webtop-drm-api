/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpportunityActionDocumentsDataRecord extends org.jooq.impl.UpdatableRecordImpl<OpportunityActionDocumentsDataRecord> implements org.jooq.Record2<java.lang.String, byte[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.opportunity_action_documents_data.opportunity_action_document_id</code>.
     */
    public void setOpportunityActionDocumentId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.opportunity_action_documents_data.opportunity_action_document_id</code>.
     */
    public java.lang.String getOpportunityActionDocumentId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>drm.opportunity_action_documents_data.bytes</code>.
     */
    public void setBytes(byte[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.opportunity_action_documents_data.bytes</code>.
     */
    public byte[] getBytes() {
        return (byte[]) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.String> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row2<java.lang.String, byte[]> fieldsRow() {
        return (org.jooq.Row2) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row2<java.lang.String, byte[]> valuesRow() {
        return (org.jooq.Row2) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActionDocumentsData.OPPORTUNITY_ACTION_DOCUMENTS_DATA.OPPORTUNITY_ACTION_DOCUMENT_ID;
    }

    @java.lang.Override
    public org.jooq.Field<byte[]> field2() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityActionDocumentsData.OPPORTUNITY_ACTION_DOCUMENTS_DATA.BYTES;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getOpportunityActionDocumentId();
    }

    @java.lang.Override
    public byte[] component2() {
        return getBytes();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getOpportunityActionDocumentId();
    }

    @java.lang.Override
    public byte[] value2() {
        return getBytes();
    }

    @java.lang.Override
    public OpportunityActionDocumentsDataRecord value1(java.lang.String value) {
        setOpportunityActionDocumentId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionDocumentsDataRecord value2(byte[] value) {
        setBytes(value);
        return this;
    }

    @java.lang.Override
    public OpportunityActionDocumentsDataRecord values(java.lang.String value1, byte[] value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OpportunityActionDocumentsDataRecord
     */
    public OpportunityActionDocumentsDataRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.OpportunityActionDocumentsData.OPPORTUNITY_ACTION_DOCUMENTS_DATA);
    }

    /**
     * Create a detached, initialised OpportunityActionDocumentsDataRecord
     */
    public OpportunityActionDocumentsDataRecord(java.lang.String opportunityActionDocumentId, byte[] bytes) {
        super(com.sonicle.webtop.drm.jooq.tables.OpportunityActionDocumentsData.OPPORTUNITY_ACTION_DOCUMENTS_DATA);

        setOpportunityActionDocumentId(opportunityActionDocumentId);
        setBytes(bytes);
    }
}
