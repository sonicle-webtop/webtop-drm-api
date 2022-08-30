/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FoldersRecord extends org.jooq.impl.UpdatableRecordImpl<FoldersRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.folders.folder_id</code>.
     */
    public void setFolderId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.folders.folder_id</code>.
     */
    public java.lang.String getFolderId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>drm.folders.name</code>.
     */
    public void setName(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.folders.name</code>.
     */
    public java.lang.String getName() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.folders.description</code>.
     */
    public void setDescription(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.folders.description</code>.
     */
    public java.lang.String getDescription() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>drm.folders.expired</code>.
     */
    public void setExpired(java.lang.Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.folders.expired</code>.
     */
    public java.lang.Boolean getExpired() {
        return (java.lang.Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.String> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> fieldsRow() {
        return (org.jooq.Row4) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> valuesRow() {
        return (org.jooq.Row4) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.Folders.FOLDERS.FOLDER_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.Folders.FOLDERS.NAME;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.Folders.FOLDERS.DESCRIPTION;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field4() {
        return com.sonicle.webtop.drm.jooq.tables.Folders.FOLDERS.EXPIRED;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getFolderId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getName();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.Boolean component4() {
        return getExpired();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getFolderId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getName();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.Boolean value4() {
        return getExpired();
    }

    @java.lang.Override
    public FoldersRecord value1(java.lang.String value) {
        setFolderId(value);
        return this;
    }

    @java.lang.Override
    public FoldersRecord value2(java.lang.String value) {
        setName(value);
        return this;
    }

    @java.lang.Override
    public FoldersRecord value3(java.lang.String value) {
        setDescription(value);
        return this;
    }

    @java.lang.Override
    public FoldersRecord value4(java.lang.Boolean value) {
        setExpired(value);
        return this;
    }

    @java.lang.Override
    public FoldersRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Boolean value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FoldersRecord
     */
    public FoldersRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.Folders.FOLDERS);
    }

    /**
     * Create a detached, initialised FoldersRecord
     */
    public FoldersRecord(java.lang.String folderId, java.lang.String name, java.lang.String description, java.lang.Boolean expired) {
        super(com.sonicle.webtop.drm.jooq.tables.Folders.FOLDERS);

        setFolderId(folderId);
        setName(name);
        setDescription(description);
        setExpired(expired);
    }
}