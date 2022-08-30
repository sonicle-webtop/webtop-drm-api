/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobAttachmentsData implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String jobAttachmentId;
    private byte[]           bytes;

    public JobAttachmentsData() {}

    public JobAttachmentsData(JobAttachmentsData value) {
        this.jobAttachmentId = value.jobAttachmentId;
        this.bytes = value.bytes;
    }

    public JobAttachmentsData(
        java.lang.String jobAttachmentId,
        byte[]           bytes
    ) {
        this.jobAttachmentId = jobAttachmentId;
        this.bytes = bytes;
    }

    /**
     * Getter for <code>drm.job_attachments_data.job_attachment_id</code>.
     */
    public java.lang.String getJobAttachmentId() {
        return this.jobAttachmentId;
    }

    /**
     * Setter for <code>drm.job_attachments_data.job_attachment_id</code>.
     */
    public void setJobAttachmentId(java.lang.String jobAttachmentId) {
        this.jobAttachmentId = jobAttachmentId;
    }

    /**
     * Getter for <code>drm.job_attachments_data.bytes</code>.
     */
    public byte[] getBytes() {
        return this.bytes;
    }

    /**
     * Setter for <code>drm.job_attachments_data.bytes</code>.
     */
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JobAttachmentsData (");

        sb.append(jobAttachmentId);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}