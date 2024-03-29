/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LeaveRequestDocuments implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String       leaveRequestDocumentId;
    private java.lang.Integer      leaveRequestId;
    private org.joda.time.DateTime revisionTimestamp;
    private java.lang.Short        revisionSequence;
    private java.lang.String       filename;
    private java.lang.Long         size;
    private java.lang.String       mediaType;

    public LeaveRequestDocuments() {}

    public LeaveRequestDocuments(LeaveRequestDocuments value) {
        this.leaveRequestDocumentId = value.leaveRequestDocumentId;
        this.leaveRequestId = value.leaveRequestId;
        this.revisionTimestamp = value.revisionTimestamp;
        this.revisionSequence = value.revisionSequence;
        this.filename = value.filename;
        this.size = value.size;
        this.mediaType = value.mediaType;
    }

    public LeaveRequestDocuments(
        java.lang.String       leaveRequestDocumentId,
        java.lang.Integer      leaveRequestId,
        org.joda.time.DateTime revisionTimestamp,
        java.lang.Short        revisionSequence,
        java.lang.String       filename,
        java.lang.Long         size,
        java.lang.String       mediaType
    ) {
        this.leaveRequestDocumentId = leaveRequestDocumentId;
        this.leaveRequestId = leaveRequestId;
        this.revisionTimestamp = revisionTimestamp;
        this.revisionSequence = revisionSequence;
        this.filename = filename;
        this.size = size;
        this.mediaType = mediaType;
    }

    /**
     * Getter for <code>drm.leave_request_documents.leave_request_document_id</code>.
     */
    public java.lang.String getLeaveRequestDocumentId() {
        return this.leaveRequestDocumentId;
    }

    /**
     * Setter for <code>drm.leave_request_documents.leave_request_document_id</code>.
     */
    public void setLeaveRequestDocumentId(java.lang.String leaveRequestDocumentId) {
        this.leaveRequestDocumentId = leaveRequestDocumentId;
    }

    /**
     * Getter for <code>drm.leave_request_documents.leave_request_id</code>.
     */
    public java.lang.Integer getLeaveRequestId() {
        return this.leaveRequestId;
    }

    /**
     * Setter for <code>drm.leave_request_documents.leave_request_id</code>.
     */
    public void setLeaveRequestId(java.lang.Integer leaveRequestId) {
        this.leaveRequestId = leaveRequestId;
    }

    /**
     * Getter for <code>drm.leave_request_documents.revision_timestamp</code>.
     */
    public org.joda.time.DateTime getRevisionTimestamp() {
        return this.revisionTimestamp;
    }

    /**
     * Setter for <code>drm.leave_request_documents.revision_timestamp</code>.
     */
    public void setRevisionTimestamp(org.joda.time.DateTime revisionTimestamp) {
        this.revisionTimestamp = revisionTimestamp;
    }

    /**
     * Getter for <code>drm.leave_request_documents.revision_sequence</code>.
     */
    public java.lang.Short getRevisionSequence() {
        return this.revisionSequence;
    }

    /**
     * Setter for <code>drm.leave_request_documents.revision_sequence</code>.
     */
    public void setRevisionSequence(java.lang.Short revisionSequence) {
        this.revisionSequence = revisionSequence;
    }

    /**
     * Getter for <code>drm.leave_request_documents.filename</code>.
     */
    public java.lang.String getFilename() {
        return this.filename;
    }

    /**
     * Setter for <code>drm.leave_request_documents.filename</code>.
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }

    /**
     * Getter for <code>drm.leave_request_documents.size</code>.
     */
    public java.lang.Long getSize() {
        return this.size;
    }

    /**
     * Setter for <code>drm.leave_request_documents.size</code>.
     */
    public void setSize(java.lang.Long size) {
        this.size = size;
    }

    /**
     * Getter for <code>drm.leave_request_documents.media_type</code>.
     */
    public java.lang.String getMediaType() {
        return this.mediaType;
    }

    /**
     * Setter for <code>drm.leave_request_documents.media_type</code>.
     */
    public void setMediaType(java.lang.String mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LeaveRequestDocuments (");

        sb.append(leaveRequestDocumentId);
        sb.append(", ").append(leaveRequestId);
        sb.append(", ").append(revisionTimestamp);
        sb.append(", ").append(revisionSequence);
        sb.append(", ").append(filename);
        sb.append(", ").append(size);
        sb.append(", ").append(mediaType);

        sb.append(")");
        return sb.toString();
    }
}
