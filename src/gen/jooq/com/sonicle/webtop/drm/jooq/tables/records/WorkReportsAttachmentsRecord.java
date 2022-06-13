/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkReportsAttachmentsRecord extends org.jooq.impl.UpdatableRecordImpl<WorkReportsAttachmentsRecord> implements org.jooq.Record7<java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.Short, java.lang.String, java.lang.Long, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.work_reports_attachments.work_report_attachment_id</code>.
     */
    public void setWorkReportAttachmentId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.work_reports_attachments.work_report_attachment_id</code>.
     */
    public java.lang.String getWorkReportAttachmentId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>drm.work_reports_attachments.work_report_id</code>.
     */
    public void setWorkReportId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.work_reports_attachments.work_report_id</code>.
     */
    public java.lang.String getWorkReportId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.work_reports_attachments.revision_timestamp</code>.
     */
    public void setRevisionTimestamp(org.joda.time.DateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.work_reports_attachments.revision_timestamp</code>.
     */
    public org.joda.time.DateTime getRevisionTimestamp() {
        return (org.joda.time.DateTime) get(2);
    }

    /**
     * Setter for <code>drm.work_reports_attachments.revision_sequence</code>.
     */
    public void setRevisionSequence(java.lang.Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.work_reports_attachments.revision_sequence</code>.
     */
    public java.lang.Short getRevisionSequence() {
        return (java.lang.Short) get(3);
    }

    /**
     * Setter for <code>drm.work_reports_attachments.filename</code>.
     */
    public void setFilename(java.lang.String value) {
        set(4, value);
    }

    /**
     * Getter for <code>drm.work_reports_attachments.filename</code>.
     */
    public java.lang.String getFilename() {
        return (java.lang.String) get(4);
    }

    /**
     * Setter for <code>drm.work_reports_attachments.size</code>.
     */
    public void setSize(java.lang.Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>drm.work_reports_attachments.size</code>.
     */
    public java.lang.Long getSize() {
        return (java.lang.Long) get(5);
    }

    /**
     * Setter for <code>drm.work_reports_attachments.media_type</code>.
     */
    public void setMediaType(java.lang.String value) {
        set(6, value);
    }

    /**
     * Getter for <code>drm.work_reports_attachments.media_type</code>.
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
    public org.jooq.Row7<java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.Short, java.lang.String, java.lang.Long, java.lang.String> fieldsRow() {
        return (org.jooq.Row7) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row7<java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.Short, java.lang.String, java.lang.Long, java.lang.String> valuesRow() {
        return (org.jooq.Row7) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments.WORK_REPORTS_ATTACHMENTS.WORK_REPORT_ATTACHMENT_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments.WORK_REPORTS_ATTACHMENTS.WORK_REPORT_ID;
    }

    @java.lang.Override
    public org.jooq.Field<org.joda.time.DateTime> field3() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments.WORK_REPORTS_ATTACHMENTS.REVISION_TIMESTAMP;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Short> field4() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments.WORK_REPORTS_ATTACHMENTS.REVISION_SEQUENCE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field5() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments.WORK_REPORTS_ATTACHMENTS.FILENAME;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Long> field6() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments.WORK_REPORTS_ATTACHMENTS.SIZE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field7() {
        return com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments.WORK_REPORTS_ATTACHMENTS.MEDIA_TYPE;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getWorkReportAttachmentId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getWorkReportId();
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
        return getWorkReportAttachmentId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getWorkReportId();
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
    public WorkReportsAttachmentsRecord value1(java.lang.String value) {
        setWorkReportAttachmentId(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsAttachmentsRecord value2(java.lang.String value) {
        setWorkReportId(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsAttachmentsRecord value3(org.joda.time.DateTime value) {
        setRevisionTimestamp(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsAttachmentsRecord value4(java.lang.Short value) {
        setRevisionSequence(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsAttachmentsRecord value5(java.lang.String value) {
        setFilename(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsAttachmentsRecord value6(java.lang.Long value) {
        setSize(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsAttachmentsRecord value7(java.lang.String value) {
        setMediaType(value);
        return this;
    }

    @java.lang.Override
    public WorkReportsAttachmentsRecord values(java.lang.String value1, java.lang.String value2, org.joda.time.DateTime value3, java.lang.Short value4, java.lang.String value5, java.lang.Long value6, java.lang.String value7) {
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
     * Create a detached WorkReportsAttachmentsRecord
     */
    public WorkReportsAttachmentsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments.WORK_REPORTS_ATTACHMENTS);
    }

    /**
     * Create a detached, initialised WorkReportsAttachmentsRecord
     */
    public WorkReportsAttachmentsRecord(java.lang.String workReportAttachmentId, java.lang.String workReportId, org.joda.time.DateTime revisionTimestamp, java.lang.Short revisionSequence, java.lang.String filename, java.lang.Long size, java.lang.String mediaType) {
        super(com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments.WORK_REPORTS_ATTACHMENTS);

        setWorkReportAttachmentId(workReportAttachmentId);
        setWorkReportId(workReportId);
        setRevisionTimestamp(revisionTimestamp);
        setRevisionSequence(revisionSequence);
        setFilename(filename);
        setSize(size);
        setMediaType(mediaType);
    }
}
