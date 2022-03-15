/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DomainSettingsRecord extends org.jooq.impl.UpdatableRecordImpl<DomainSettingsRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>core.domain_settings.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>core.domain_settings.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>core.domain_settings.service_id</code>.
     */
    public void setServiceId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>core.domain_settings.service_id</code>.
     */
    public java.lang.String getServiceId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>core.domain_settings.key</code>.
     */
    public void setKey(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>core.domain_settings.key</code>.
     */
    public java.lang.String getKey() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>core.domain_settings.value</code>.
     */
    public void setValue(java.lang.String value) {
        set(3, value);
    }

    /**
     * Getter for <code>core.domain_settings.value</code>.
     */
    public java.lang.String getValue() {
        return (java.lang.String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String> key() {
        return (org.jooq.Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row4) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
        return (org.jooq.Row4) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.DomainSettings.DOMAIN_SETTINGS.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.DomainSettings.DOMAIN_SETTINGS.SERVICE_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.DomainSettings.DOMAIN_SETTINGS.KEY;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field4() {
        return com.sonicle.webtop.drm.jooq.tables.DomainSettings.DOMAIN_SETTINGS.VALUE;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getServiceId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getKey();
    }

    @java.lang.Override
    public java.lang.String component4() {
        return getValue();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getServiceId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getKey();
    }

    @java.lang.Override
    public java.lang.String value4() {
        return getValue();
    }

    @java.lang.Override
    public DomainSettingsRecord value1(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public DomainSettingsRecord value2(java.lang.String value) {
        setServiceId(value);
        return this;
    }

    @java.lang.Override
    public DomainSettingsRecord value3(java.lang.String value) {
        setKey(value);
        return this;
    }

    @java.lang.Override
    public DomainSettingsRecord value4(java.lang.String value) {
        setValue(value);
        return this;
    }

    @java.lang.Override
    public DomainSettingsRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4) {
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
     * Create a detached DomainSettingsRecord
     */
    public DomainSettingsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.DomainSettings.DOMAIN_SETTINGS);
    }

    /**
     * Create a detached, initialised DomainSettingsRecord
     */
    public DomainSettingsRecord(java.lang.String domainId, java.lang.String serviceId, java.lang.String key, java.lang.String value) {
        super(com.sonicle.webtop.drm.jooq.tables.DomainSettings.DOMAIN_SETTINGS);

        setDomainId(domainId);
        setServiceId(serviceId);
        setKey(key);
        setValue(value);
    }
}
