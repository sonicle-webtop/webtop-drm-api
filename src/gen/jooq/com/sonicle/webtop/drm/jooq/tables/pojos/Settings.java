/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Settings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String serviceId;
    private java.lang.String key;
    private java.lang.String value;

    public Settings() {}

    public Settings(Settings value) {
        this.serviceId = value.serviceId;
        this.key = value.key;
        this.value = value.value;
    }

    public Settings(
        java.lang.String serviceId,
        java.lang.String key,
        java.lang.String value
    ) {
        this.serviceId = serviceId;
        this.key = key;
        this.value = value;
    }

    /**
     * Getter for <code>core.settings.service_id</code>.
     */
    public java.lang.String getServiceId() {
        return this.serviceId;
    }

    /**
     * Setter for <code>core.settings.service_id</code>.
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * Getter for <code>core.settings.key</code>.
     */
    public java.lang.String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>core.settings.key</code>.
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }

    /**
     * Getter for <code>core.settings.value</code>.
     */
    public java.lang.String getValue() {
        return this.value;
    }

    /**
     * Setter for <code>core.settings.value</code>.
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Settings (");

        sb.append(serviceId);
        sb.append(", ").append(key);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }
}
