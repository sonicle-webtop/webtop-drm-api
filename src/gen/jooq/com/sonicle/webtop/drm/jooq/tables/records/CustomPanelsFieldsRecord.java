/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomPanelsFieldsRecord extends org.jooq.impl.UpdatableRecordImpl<CustomPanelsFieldsRecord> implements org.jooq.Record3<java.lang.String, java.lang.String, java.lang.Short> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>core.custom_panels_fields.custom_panel_id</code>.
     */
    public void setCustomPanelId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>core.custom_panels_fields.custom_panel_id</code>.
     */
    public java.lang.String getCustomPanelId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>core.custom_panels_fields.custom_field_id</code>.
     */
    public void setCustomFieldId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>core.custom_panels_fields.custom_field_id</code>.
     */
    public java.lang.String getCustomFieldId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>core.custom_panels_fields.order</code>.
     */
    public void setOrder(java.lang.Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>core.custom_panels_fields.order</code>.
     */
    public java.lang.Short getOrder() {
        return (java.lang.Short) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record2<java.lang.String, java.lang.String> key() {
        return (org.jooq.Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.Short> fieldsRow() {
        return (org.jooq.Row3) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.Short> valuesRow() {
        return (org.jooq.Row3) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.CustomPanelsFields.CUSTOM_PANELS_FIELDS.CUSTOM_PANEL_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.CustomPanelsFields.CUSTOM_PANELS_FIELDS.CUSTOM_FIELD_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Short> field3() {
        return com.sonicle.webtop.drm.jooq.tables.CustomPanelsFields.CUSTOM_PANELS_FIELDS.ORDER;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getCustomPanelId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getCustomFieldId();
    }

    @java.lang.Override
    public java.lang.Short component3() {
        return getOrder();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getCustomPanelId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getCustomFieldId();
    }

    @java.lang.Override
    public java.lang.Short value3() {
        return getOrder();
    }

    @java.lang.Override
    public CustomPanelsFieldsRecord value1(java.lang.String value) {
        setCustomPanelId(value);
        return this;
    }

    @java.lang.Override
    public CustomPanelsFieldsRecord value2(java.lang.String value) {
        setCustomFieldId(value);
        return this;
    }

    @java.lang.Override
    public CustomPanelsFieldsRecord value3(java.lang.Short value) {
        setOrder(value);
        return this;
    }

    @java.lang.Override
    public CustomPanelsFieldsRecord values(java.lang.String value1, java.lang.String value2, java.lang.Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomPanelsFieldsRecord
     */
    public CustomPanelsFieldsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.CustomPanelsFields.CUSTOM_PANELS_FIELDS);
    }

    /**
     * Create a detached, initialised CustomPanelsFieldsRecord
     */
    public CustomPanelsFieldsRecord(java.lang.String customPanelId, java.lang.String customFieldId, java.lang.Short order) {
        super(com.sonicle.webtop.drm.jooq.tables.CustomPanelsFields.CUSTOM_PANELS_FIELDS);

        setCustomPanelId(customPanelId);
        setCustomFieldId(customFieldId);
        setOrder(order);
    }
}
