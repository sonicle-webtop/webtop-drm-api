/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MediaTypesRecord extends org.jooq.impl.UpdatableRecordImpl<MediaTypesRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>core.media_types.extension</code>.
     */
    public void setExtension(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>core.media_types.extension</code>.
     */
    public java.lang.String getExtension() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>core.media_types.media_type</code>.
     */
    public void setMediaType(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>core.media_types.media_type</code>.
     */
    public java.lang.String getMediaType() {
        return (java.lang.String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record2<java.lang.String, java.lang.String> key() {
        return (org.jooq.Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row2) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
        return (org.jooq.Row2) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.MediaTypes.MEDIA_TYPES.EXTENSION;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.MediaTypes.MEDIA_TYPES.MEDIA_TYPE;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getExtension();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getMediaType();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getExtension();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getMediaType();
    }

    @java.lang.Override
    public MediaTypesRecord value1(java.lang.String value) {
        setExtension(value);
        return this;
    }

    @java.lang.Override
    public MediaTypesRecord value2(java.lang.String value) {
        setMediaType(value);
        return this;
    }

    @java.lang.Override
    public MediaTypesRecord values(java.lang.String value1, java.lang.String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MediaTypesRecord
     */
    public MediaTypesRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.MediaTypes.MEDIA_TYPES);
    }

    /**
     * Create a detached, initialised MediaTypesRecord
     */
    public MediaTypesRecord(java.lang.String extension, java.lang.String mediaType) {
        super(com.sonicle.webtop.drm.jooq.tables.MediaTypes.MEDIA_TYPES);

        setExtension(extension);
        setMediaType(mediaType);
    }
}
