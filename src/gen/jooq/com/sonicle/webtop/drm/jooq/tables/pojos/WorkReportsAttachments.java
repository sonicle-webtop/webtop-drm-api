/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkReportsAttachments implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String       workReportAttachmentId;
    private java.lang.String       workReportId;
    private org.joda.time.DateTime revisionTimestamp;
    private java.lang.Short        revisionSequence;
    private java.lang.String       filename;
    private java.lang.Long         size;
    private java.lang.String       mediaType;

    public WorkReportsAttachments() {}

    public WorkReportsAttachments(WorkReportsAttachments value) {
        this.workReportAttachmentId = value.workReportAttachmentId;
        this.workReportId = value.workReportId;
        this.revisionTimestamp = value.revisionTimestamp;
        this.revisionSequence = value.revisionSequence;
        this.filename = value.filename;
        this.size = value.size;
        this.mediaType = value.mediaType;
    }

    public WorkReportsAttachments(
        java.lang.String       workReportAttachmentId,
        java.lang.String       workReportId,
        org.joda.time.DateTime revisionTimestamp,
        java.lang.Short        revisionSequence,
        java.lang.String       filename,
        java.lang.Long         size,
        java.lang.String       mediaType
    ) {
        this.workReportAttachmentId = workReportAttachmentId;
        this.workReportId = workReportId;
        this.revisionTimestamp = revisionTimestamp;
        this.revisionSequence = revisionSequence;
        this.filename = filename;
        this.size = size;
        this.mediaType = mediaType;
    }

    /**
     * Getter for <code>drm.work_reports_attachments.work_report_attachment_id</code>.
     */
    public java.lang.String getWorkReportAttachmentId() {
        return this.workReportAttachmentId;
    }

    /**
     * Setter for <code>drm.work_reports_attachments.work_report_attachment_id</code>.
     */
    public void setWorkReportAttachmentId(java.lang.String workReportAttachmentId) {
        this.workReportAttachmentId = workReportAttachmentId;
    }

    /**
     * Getter for <code>drm.work_reports_attachments.work_report_id</code>.
     */
    public java.lang.String getWorkReportId() {
        return this.workReportId;
    }

    /**
     * Setter for <code>drm.work_reports_attachments.work_report_id</code>.
     */
    public void setWorkReportId(java.lang.String workReportId) {
        this.workReportId = workReportId;
    }

    /**
     * Getter for <code>drm.work_reports_attachments.revision_timestamp</code>.
     */
    public org.joda.time.DateTime getRevisionTimestamp() {
        return this.revisionTimestamp;
    }

    /**
     * Setter for <code>drm.work_reports_attachments.revision_timestamp</code>.
     */
    public void setRevisionTimestamp(org.joda.time.DateTime revisionTimestamp) {
        this.revisionTimestamp = revisionTimestamp;
    }

    /**
     * Getter for <code>drm.work_reports_attachments.revision_sequence</code>.
     */
    public java.lang.Short getRevisionSequence() {
        return this.revisionSequence;
    }

    /**
     * Setter for <code>drm.work_reports_attachments.revision_sequence</code>.
     */
    public void setRevisionSequence(java.lang.Short revisionSequence) {
        this.revisionSequence = revisionSequence;
    }

    /**
     * Getter for <code>drm.work_reports_attachments.filename</code>.
     */
    public java.lang.String getFilename() {
        return this.filename;
    }

    /**
     * Setter for <code>drm.work_reports_attachments.filename</code>.
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }

    /**
     * Getter for <code>drm.work_reports_attachments.size</code>.
     */
    public java.lang.Long getSize() {
        return this.size;
    }

    /**
     * Setter for <code>drm.work_reports_attachments.size</code>.
     */
    public void setSize(java.lang.Long size) {
        this.size = size;
    }

    /**
     * Getter for <code>drm.work_reports_attachments.media_type</code>.
     */
    public java.lang.String getMediaType() {
        return this.mediaType;
    }

    /**
     * Setter for <code>drm.work_reports_attachments.media_type</code>.
     */
    public void setMediaType(java.lang.String mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkReportsAttachments (");

        sb.append(workReportAttachmentId);
        sb.append(", ").append(workReportId);
        sb.append(", ").append(revisionTimestamp);
        sb.append(", ").append(revisionSequence);
        sb.append(", ").append(filename);
        sb.append(", ").append(size);
        sb.append(", ").append(mediaType);

        sb.append(")");
        return sb.toString();
    }
}