/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpportunityFieldsRecord extends org.jooq.impl.UpdatableRecordImpl<OpportunityFieldsRecord> implements org.jooq.Record8<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.opportunity_fields.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.opportunity_fields.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>drm.opportunity_fields.tab_id</code>.
     */
    public void setTabId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.opportunity_fields.tab_id</code>.
     */
    public java.lang.String getTabId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.opportunity_fields.field_id</code>.
     */
    public void setFieldId(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.opportunity_fields.field_id</code>.
     */
    public java.lang.String getFieldId() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>drm.opportunity_fields.visible</code>.
     */
    public void setVisible(java.lang.Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.opportunity_fields.visible</code>.
     */
    public java.lang.Boolean getVisible() {
        return (java.lang.Boolean) get(3);
    }

    /**
     * Setter for <code>drm.opportunity_fields.required</code>.
     */
    public void setRequired(java.lang.Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>drm.opportunity_fields.required</code>.
     */
    public java.lang.Boolean getRequired() {
        return (java.lang.Boolean) get(4);
    }

    /**
     * Setter for <code>drm.opportunity_fields.order</code>.
     */
    public void setOrder(java.lang.Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>drm.opportunity_fields.order</code>.
     */
    public java.lang.Integer getOrder() {
        return (java.lang.Integer) get(5);
    }

    /**
     * Setter for <code>drm.opportunity_fields.label</code>.
     */
    public void setLabel(java.lang.String value) {
        set(6, value);
    }

    /**
     * Getter for <code>drm.opportunity_fields.label</code>.
     */
    public java.lang.String getLabel() {
        return (java.lang.String) get(6);
    }

    /**
     * Setter for <code>drm.opportunity_fields.show_on_grid</code>.
     */
    public void setShowOnGrid(java.lang.Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>drm.opportunity_fields.show_on_grid</code>.
     */
    public java.lang.Boolean getShowOnGrid() {
        return (java.lang.Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String> key() {
        return (org.jooq.Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Boolean> fieldsRow() {
        return (org.jooq.Row8) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Boolean> valuesRow() {
        return (org.jooq.Row8) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityFields.OPPORTUNITY_FIELDS.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityFields.OPPORTUNITY_FIELDS.TAB_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityFields.OPPORTUNITY_FIELDS.FIELD_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field4() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityFields.OPPORTUNITY_FIELDS.VISIBLE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field5() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityFields.OPPORTUNITY_FIELDS.REQUIRED;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field6() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityFields.OPPORTUNITY_FIELDS.ORDER;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field7() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityFields.OPPORTUNITY_FIELDS.LABEL;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field8() {
        return com.sonicle.webtop.drm.jooq.tables.OpportunityFields.OPPORTUNITY_FIELDS.SHOW_ON_GRID;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getTabId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getFieldId();
    }

    @java.lang.Override
    public java.lang.Boolean component4() {
        return getVisible();
    }

    @java.lang.Override
    public java.lang.Boolean component5() {
        return getRequired();
    }

    @java.lang.Override
    public java.lang.Integer component6() {
        return getOrder();
    }

    @java.lang.Override
    public java.lang.String component7() {
        return getLabel();
    }

    @java.lang.Override
    public java.lang.Boolean component8() {
        return getShowOnGrid();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getTabId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getFieldId();
    }

    @java.lang.Override
    public java.lang.Boolean value4() {
        return getVisible();
    }

    @java.lang.Override
    public java.lang.Boolean value5() {
        return getRequired();
    }

    @java.lang.Override
    public java.lang.Integer value6() {
        return getOrder();
    }

    @java.lang.Override
    public java.lang.String value7() {
        return getLabel();
    }

    @java.lang.Override
    public java.lang.Boolean value8() {
        return getShowOnGrid();
    }

    @java.lang.Override
    public OpportunityFieldsRecord value1(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityFieldsRecord value2(java.lang.String value) {
        setTabId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityFieldsRecord value3(java.lang.String value) {
        setFieldId(value);
        return this;
    }

    @java.lang.Override
    public OpportunityFieldsRecord value4(java.lang.Boolean value) {
        setVisible(value);
        return this;
    }

    @java.lang.Override
    public OpportunityFieldsRecord value5(java.lang.Boolean value) {
        setRequired(value);
        return this;
    }

    @java.lang.Override
    public OpportunityFieldsRecord value6(java.lang.Integer value) {
        setOrder(value);
        return this;
    }

    @java.lang.Override
    public OpportunityFieldsRecord value7(java.lang.String value) {
        setLabel(value);
        return this;
    }

    @java.lang.Override
    public OpportunityFieldsRecord value8(java.lang.Boolean value) {
        setShowOnGrid(value);
        return this;
    }

    @java.lang.Override
    public OpportunityFieldsRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Boolean value4, java.lang.Boolean value5, java.lang.Integer value6, java.lang.String value7, java.lang.Boolean value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OpportunityFieldsRecord
     */
    public OpportunityFieldsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.OpportunityFields.OPPORTUNITY_FIELDS);
    }

    /**
     * Create a detached, initialised OpportunityFieldsRecord
     */
    public OpportunityFieldsRecord(java.lang.String domainId, java.lang.String tabId, java.lang.String fieldId, java.lang.Boolean visible, java.lang.Boolean required, java.lang.Integer order, java.lang.String label, java.lang.Boolean showOnGrid) {
        super(com.sonicle.webtop.drm.jooq.tables.OpportunityFields.OPPORTUNITY_FIELDS);

        setDomainId(domainId);
        setTabId(tabId);
        setFieldId(fieldId);
        setVisible(visible);
        setRequired(required);
        setOrder(order);
        setLabel(label);
        setShowOnGrid(showOnGrid);
    }
}
