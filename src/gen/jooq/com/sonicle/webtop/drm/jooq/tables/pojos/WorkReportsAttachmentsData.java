/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkReportsAttachmentsData implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String workReportAttachmentId;
    private byte[]           bytes;

    public WorkReportsAttachmentsData() {}

    public WorkReportsAttachmentsData(WorkReportsAttachmentsData value) {
        this.workReportAttachmentId = value.workReportAttachmentId;
        this.bytes = value.bytes;
    }

    public WorkReportsAttachmentsData(
        java.lang.String workReportAttachmentId,
        byte[]           bytes
    ) {
        this.workReportAttachmentId = workReportAttachmentId;
        this.bytes = bytes;
    }

    /**
     * Getter for <code>drm.work_reports_attachments_data.work_report_attachment_id</code>.
     */
    public java.lang.String getWorkReportAttachmentId() {
        return this.workReportAttachmentId;
    }

    /**
     * Setter for <code>drm.work_reports_attachments_data.work_report_attachment_id</code>.
     */
    public void setWorkReportAttachmentId(java.lang.String workReportAttachmentId) {
        this.workReportAttachmentId = workReportAttachmentId;
    }

    /**
     * Getter for <code>drm.work_reports_attachments_data.bytes</code>.
     */
    public byte[] getBytes() {
        return this.bytes;
    }

    /**
     * Setter for <code>drm.work_reports_attachments_data.bytes</code>.
     */
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkReportsAttachmentsData (");

        sb.append(workReportAttachmentId);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}
