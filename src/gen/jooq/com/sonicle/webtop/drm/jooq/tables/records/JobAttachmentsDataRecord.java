/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobAttachmentsDataRecord extends org.jooq.impl.UpdatableRecordImpl<JobAttachmentsDataRecord> implements org.jooq.Record2<java.lang.String, byte[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.job_attachments_data.job_attachment_id</code>.
     */
    public void setJobAttachmentId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.job_attachments_data.job_attachment_id</code>.
     */
    public java.lang.String getJobAttachmentId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>drm.job_attachments_data.bytes</code>.
     */
    public void setBytes(byte[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.job_attachments_data.bytes</code>.
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
        return com.sonicle.webtop.drm.jooq.tables.JobAttachmentsData.JOB_ATTACHMENTS_DATA.JOB_ATTACHMENT_ID;
    }

    @java.lang.Override
    public org.jooq.Field<byte[]> field2() {
        return com.sonicle.webtop.drm.jooq.tables.JobAttachmentsData.JOB_ATTACHMENTS_DATA.BYTES;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getJobAttachmentId();
    }

    @java.lang.Override
    public byte[] component2() {
        return getBytes();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getJobAttachmentId();
    }

    @java.lang.Override
    public byte[] value2() {
        return getBytes();
    }

    @java.lang.Override
    public JobAttachmentsDataRecord value1(java.lang.String value) {
        setJobAttachmentId(value);
        return this;
    }

    @java.lang.Override
    public JobAttachmentsDataRecord value2(byte[] value) {
        setBytes(value);
        return this;
    }

    @java.lang.Override
    public JobAttachmentsDataRecord values(java.lang.String value1, byte[] value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobAttachmentsDataRecord
     */
    public JobAttachmentsDataRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.JobAttachmentsData.JOB_ATTACHMENTS_DATA);
    }

    /**
     * Create a detached, initialised JobAttachmentsDataRecord
     */
    public JobAttachmentsDataRecord(java.lang.String jobAttachmentId, byte[] bytes) {
        super(com.sonicle.webtop.drm.jooq.tables.JobAttachmentsData.JOB_ATTACHMENTS_DATA);

        setJobAttachmentId(jobAttachmentId);
        setBytes(bytes);
    }
}
