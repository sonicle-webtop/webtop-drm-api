/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LeaveRequestDocuments extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.leave_request_documents</code>
     */
    public static final LeaveRequestDocuments LEAVE_REQUEST_DOCUMENTS = new LeaveRequestDocuments();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord.class;
    }

    /**
     * The column <code>drm.leave_request_documents.leave_request_document_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord, java.lang.String> LEAVE_REQUEST_DOCUMENT_ID = createField(org.jooq.impl.DSL.name("leave_request_document_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.leave_request_documents.leave_request_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord, java.lang.Integer> LEAVE_REQUEST_ID = createField(org.jooq.impl.DSL.name("leave_request_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.leave_request_documents.revision_timestamp</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord, org.joda.time.DateTime> REVISION_TIMESTAMP = createField(org.jooq.impl.DSL.name("revision_timestamp"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "", new com.sonicle.jooq.jsr310.OffsetDateTimeJodaConverter());

    /**
     * The column <code>drm.leave_request_documents.revision_sequence</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord, java.lang.Short> REVISION_SEQUENCE = createField(org.jooq.impl.DSL.name("revision_sequence"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>drm.leave_request_documents.filename</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord, java.lang.String> FILENAME = createField(org.jooq.impl.DSL.name("filename"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>drm.leave_request_documents.size</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord, java.lang.Long> SIZE = createField(org.jooq.impl.DSL.name("size"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>drm.leave_request_documents.media_type</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord, java.lang.String> MEDIA_TYPE = createField(org.jooq.impl.DSL.name("media_type"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    private LeaveRequestDocuments(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private LeaveRequestDocuments(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.leave_request_documents</code> table reference
     */
    public LeaveRequestDocuments(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), LEAVE_REQUEST_DOCUMENTS);
    }

    /**
     * Create an aliased <code>drm.leave_request_documents</code> table reference
     */
    public LeaveRequestDocuments(org.jooq.Name alias) {
        this(alias, LEAVE_REQUEST_DOCUMENTS);
    }

    /**
     * Create a <code>drm.leave_request_documents</code> table reference
     */
    public LeaveRequestDocuments() {
        this(org.jooq.impl.DSL.name("leave_request_documents"), null);
    }

    public <O extends org.jooq.Record> LeaveRequestDocuments(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord> key) {
        super(child, key, LEAVE_REQUEST_DOCUMENTS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.LEAVE_REQUEST_DOCUMENTS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestDocumentsRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.LEAVE_REQUEST_DOCUMENTS_PKEY);
    }

    @java.lang.Override
    public LeaveRequestDocuments as(java.lang.String alias) {
        return new LeaveRequestDocuments(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public LeaveRequestDocuments as(org.jooq.Name alias) {
        return new LeaveRequestDocuments(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public LeaveRequestDocuments rename(java.lang.String name) {
        return new LeaveRequestDocuments(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public LeaveRequestDocuments rename(org.jooq.Name name) {
        return new LeaveRequestDocuments(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row7<java.lang.String, java.lang.Integer, org.joda.time.DateTime, java.lang.Short, java.lang.String, java.lang.Long, java.lang.String> fieldsRow() {
        return (org.jooq.Row7) super.fieldsRow();
    }
}
