/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobAttachmentsData extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.job_attachments_data</code>
     */
    public static final JobAttachmentsData JOB_ATTACHMENTS_DATA = new JobAttachmentsData();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord.class;
    }

    /**
     * The column <code>drm.job_attachments_data.job_attachment_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord, java.lang.String> JOB_ATTACHMENT_ID = createField(org.jooq.impl.DSL.name("job_attachment_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.job_attachments_data.bytes</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord, byte[]> BYTES = createField(org.jooq.impl.DSL.name("bytes"), org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    private JobAttachmentsData(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobAttachmentsData(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.job_attachments_data</code> table reference
     */
    public JobAttachmentsData(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), JOB_ATTACHMENTS_DATA);
    }

    /**
     * Create an aliased <code>drm.job_attachments_data</code> table reference
     */
    public JobAttachmentsData(org.jooq.Name alias) {
        this(alias, JOB_ATTACHMENTS_DATA);
    }

    /**
     * Create a <code>drm.job_attachments_data</code> table reference
     */
    public JobAttachmentsData() {
        this(org.jooq.impl.DSL.name("job_attachments_data"), null);
    }

    public <O extends org.jooq.Record> JobAttachmentsData(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord> key) {
        super(child, key, JOB_ATTACHMENTS_DATA);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.JOB_ATTACHMENTS_DATA_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.JOB_ATTACHMENTS_DATA_PKEY);
    }

    @java.lang.Override
    public java.util.List<org.jooq.ForeignKey<com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord, ?>> getReferences() {
        return java.util.Arrays.<org.jooq.ForeignKey<com.sonicle.webtop.drm.jooq.tables.records.JobAttachmentsDataRecord, ?>>asList(com.sonicle.webtop.drm.jooq.Keys.JOB_ATTACHMENTS_DATA__JOB_ATTACHMENTS_DATA_JOB_ATTACHMENT_ID_FKEY);
    }

    private transient com.sonicle.webtop.drm.jooq.tables.JobAttachments _jobAttachments;

    public com.sonicle.webtop.drm.jooq.tables.JobAttachments jobAttachments() {
        if (_jobAttachments == null)
            _jobAttachments = new com.sonicle.webtop.drm.jooq.tables.JobAttachments(this, com.sonicle.webtop.drm.jooq.Keys.JOB_ATTACHMENTS_DATA__JOB_ATTACHMENTS_DATA_JOB_ATTACHMENT_ID_FKEY);

        return _jobAttachments;
    }

    @java.lang.Override
    public JobAttachmentsData as(java.lang.String alias) {
        return new JobAttachmentsData(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public JobAttachmentsData as(org.jooq.Name alias) {
        return new JobAttachmentsData(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public JobAttachmentsData rename(java.lang.String name) {
        return new JobAttachmentsData(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public JobAttachmentsData rename(org.jooq.Name name) {
        return new JobAttachmentsData(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row2<java.lang.String, byte[]> fieldsRow() {
        return (org.jooq.Row2) super.fieldsRow();
    }
}
