/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpportunityDocumentsRecord extends org.jooq.impl.UpdatableRecordImpl<OpportunityDocumentsRecord> implements org.jooq.Record7<java.lang.String, java.lang.Integer, org.joda.time.DateTime, java.lang.Short, java.lang.String, java.lang.Long, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.opportunity_documents.id</code>.
     */
    public void setId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.opportunity_documents.id</code>.
     */
    public java.lang.String getId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>drm.opportunity_documents.opportunity_id</code>.
     */
    public void setOpportunityId(java.lang.Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.opportunity_documents.opportunity_id</code>.
     */
    public java.lang.Integer getOpportunityId() {
        return (java.lang.Integer) get(1);
    }

    /**
     * Setter for <code>drm.opportunity_documents.revision_timestamp</code>.
     */
    public void setRevisionTimestamp(org.joda.time.DateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.opportunity_documents.revision_timestamp</code>.
     */
    public org.joda.time.DateTime getRevisionTimestamp() {
        return (org.joda.time.DateTime) get(2);
    }

    /**
     * Setter for <code>drm.opportunity_documents.revision_sequence</code>.
     */
    public void setRevisionSequence(java.lang.Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.opportunity_documents.revision_sequence</code>.
     */
    public java.lang.Short getRevisionSequence() {
        return (java.lang.Short) get(3);
    }

    /**
     * Setter for <code>drm.opportunity_documents.filename</code>.
     */
    public void setFilename(java.lang.String value) {
        set(4, value);
    }

    /**
     * Getter for <code>drm.opportunity_documents.filename</code>.
     */
    public java.lang.String getFilename() {
        return (java.lang.String) get(4);
    }

    /**
     * Setter for <code>drm.opportunity_documents.size</code>.
     */
    public void setSize(java.lang.Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>drm.opportunity_documents.size</code>.
     */
    public java.lang.Long getSize() {
        return (java.lang.Long) get(5);
    }

    /**
     * Setter for <code>drm.opportunity_documents.media_type</code>.
     */
    public void setMediaType(java.lang.String value) {
        set(6, value);
    }

    /**
     * Getter for <code>drm.opportunity_documents.media_type</code>.
     */
    public java.lang.String getMediaType() {
        return (java.lang.String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.String> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row7<java.lang.String, java.lang.Integer, org.joda.time.DateTime, java.lang.Short, java.lang.String, java.lang.Long, java.lang.String> fieldsRow() {
        return (org.jooq.Row7) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row7<java.lang.String, java.lang.Integer, org.joda.time.DateTime, java.lang.Short, java.lang.String, java.lang.Long, java.lang.String> valuesRow() {
        return (org.jooq.Row7) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityDocuments.OPPORTUNITY_DOCUMENTS.ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field2() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityDocuments.OPPORTUNITY_DOCUMENTS.OPPORTUNITY_ID;
    }

    @java.lang.Override
    public org.jooq.Field<org.joda.time.DateTime> field3() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityDocuments.OPPORTUNITY_DOCUMENTS.REVISION_TIMESTAMP;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Short> field4() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityDocuments.OPPORTUNITY_DOCUMENTS.REVISION_SEQUENCE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field5() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityDocuments.OPPORTUNITY_DOCUMENTS.FILENAME;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Long> field6() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityDocuments.OPPORTUNITY_DOCUMENTS.SIZE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field7() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityDocuments.OPPORTUNITY_DOCUMENTS.MEDIA_TYPE;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getId();
    }

    @java.lang.Override
    public java.lang.Integer component2() {
        return getOpportunityId();
    }

    @java.lang.Override
    public org.joda.time.DateTime component3() {
        return getRevisionTimestamp();
    }

    @java.lang.Override
    public java.lang.Short component4() {
        return getRevisionSequence();
    }

    @java.lang.Override
    public java.lang.String component5() {
        return getFilename();
    }

    @java.lang.Override
    public java.lang.Long component6() {
        return getSize();
    }

    @java.lang.Override
    public java.lang.String component7() {
        return getMediaType();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getId();
    }

    @java.lang.Override
    public java.lang.Integer value2() {
        return getOpportunityId();
    }

    @java.lang.Override
    public org.joda.time.DateTime value3() {
        return getRevisionTimestamp();
    }

    @java.lang.Override
    public java.lang.Short value4() {
        return getRevisionSequence();
    }

    @java.lang.Override
    public java.lang.String value5() {
        return getFilename();
    }

    @java.lang.Override
    public java.lang.Long value6() {
        return getSize();
    }

    @java.lang.Override
    public java.lang.String value7() {
        return getMediaType();
    }

    @java.lang.Override
    public OpportunityDocumentsRecord value1(java.lang.String value) {
        setId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityDocumentsRecord value2(java.lang.Integer value) {
        setOpportunityId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityDocumentsRecord value3(org.joda.time.DateTime value) {
        setRevisionTimestamp(value);
        return this;
    }

    @java.lang.Override
    public OpportunityDocumentsRecord value4(java.lang.Short value) {
        setRevisionSequence(value);
        return this;
    }

    @java.lang.Override
    public OpportunityDocumentsRecord value5(java.lang.String value) {
        setFilename(value);
        return this;
    }

    @java.lang.Override
    public OpportunityDocumentsRecord value6(java.lang.Long value) {
        setSize(value);
        return this;
    }

    @java.lang.Override
    public OpportunityDocumentsRecord value7(java.lang.String value) {
        setMediaType(value);
        return this;
    }

    @java.lang.Override
    public OpportunityDocumentsRecord values(java.lang.String value1, java.lang.Integer value2, org.joda.time.DateTime value3, java.lang.Short value4, java.lang.String value5, java.lang.Long value6, java.lang.String value7) {
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
     * Create a detached OpportunityDocumentsRecord
     */
    public OpportunityDocumentsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.OpportunityDocuments.OPPORTUNITY_DOCUMENTS);
    }

    /**
     * Create a detached, initialised OpportunityDocumentsRecord
     */
    public OpportunityDocumentsRecord(java.lang.String id, java.lang.Integer opportunityId, org.joda.time.DateTime revisionTimestamp, java.lang.Short revisionSequence, java.lang.String filename, java.lang.Long size, java.lang.String mediaType) {
        super(com.sonicle.webtop.drm.jooq.tables.OpportunityDocuments.OPPORTUNITY_DOCUMENTS);

        setId(id);
        setOpportunityId(opportunityId);
        setRevisionTimestamp(revisionTimestamp);
        setRevisionSequence(revisionSequence);
        setFilename(filename);
        setSize(size);
        setMediaType(mediaType);
    }
}
