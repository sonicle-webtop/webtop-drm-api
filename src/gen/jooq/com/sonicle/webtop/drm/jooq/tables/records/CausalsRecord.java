/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CausalsRecord extends org.jooq.impl.UpdatableRecordImpl<CausalsRecord> implements org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.causals.id</code>.
     */
    public void setId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.causals.id</code>.
     */
    public java.lang.String getId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>drm.causals.description</code>.
     */
    public void setDescription(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.causals.description</code>.
     */
    public java.lang.String getDescription() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.causals.external_code</code>.
     */
    public void setExternalCode(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.causals.external_code</code>.
     */
    public java.lang.String getExternalCode() {
        return (java.lang.String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.String> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row3) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> valuesRow() {
        return (org.jooq.Row3) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.Causals.CAUSALS.ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.Causals.CAUSALS.DESCRIPTION;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.Causals.CAUSALS.EXTERNAL_CODE;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getExternalCode();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getExternalCode();
    }

    @java.lang.Override
    public CausalsRecord value1(java.lang.String value) {
        setId(value);
        return this;
    }

    @java.lang.Override
    public CausalsRecord value2(java.lang.String value) {
        setDescription(value);
        return this;
    }

    @java.lang.Override
    public CausalsRecord value3(java.lang.String value) {
        setExternalCode(value);
        return this;
    }

    @java.lang.Override
    public CausalsRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CausalsRecord
     */
    public CausalsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.Causals.CAUSALS);
    }

    /**
     * Create a detached, initialised CausalsRecord
     */
    public CausalsRecord(java.lang.String id, java.lang.String description, java.lang.String externalCode) {
        super(com.sonicle.webtop.drm.jooq.tables.Causals.CAUSALS);

        setId(id);
        setDescription(description);
        setExternalCode(externalCode);
    }
}
