/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Autosave implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String domainId;
    private java.lang.String userId;
    private java.lang.String webtopClientId;
    private java.lang.String serviceId;
    private java.lang.String context;
    private java.lang.String key;
    private java.lang.String value;

    public Autosave() {}

    public Autosave(Autosave value) {
        this.domainId = value.domainId;
        this.userId = value.userId;
        this.webtopClientId = value.webtopClientId;
        this.serviceId = value.serviceId;
        this.context = value.context;
        this.key = value.key;
        this.value = value.value;
    }

    public Autosave(
        java.lang.String domainId,
        java.lang.String userId,
        java.lang.String webtopClientId,
        java.lang.String serviceId,
        java.lang.String context,
        java.lang.String key,
        java.lang.String value
    ) {
        this.domainId = domainId;
        this.userId = userId;
        this.webtopClientId = webtopClientId;
        this.serviceId = serviceId;
        this.context = context;
        this.key = key;
        this.value = value;
    }

    /**
     * Getter for <code>core.autosave.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>core.autosave.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>core.autosave.user_id</code>.
     */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>core.autosave.user_id</code>.
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>core.autosave.webtop_client_id</code>.
     */
    public java.lang.String getWebtopClientId() {
        return this.webtopClientId;
    }

    /**
     * Setter for <code>core.autosave.webtop_client_id</code>.
     */
    public void setWebtopClientId(java.lang.String webtopClientId) {
        this.webtopClientId = webtopClientId;
    }

    /**
     * Getter for <code>core.autosave.service_id</code>.
     */
    public java.lang.String getServiceId() {
        return this.serviceId;
    }

    /**
     * Setter for <code>core.autosave.service_id</code>.
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * Getter for <code>core.autosave.context</code>.
     */
    public java.lang.String getContext() {
        return this.context;
    }

    /**
     * Setter for <code>core.autosave.context</code>.
     */
    public void setContext(java.lang.String context) {
        this.context = context;
    }

    /**
     * Getter for <code>core.autosave.key</code>.
     */
    public java.lang.String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>core.autosave.key</code>.
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }

    /**
     * Getter for <code>core.autosave.value</code>.
     */
    public java.lang.String getValue() {
        return this.value;
    }

    /**
     * Setter for <code>core.autosave.value</code>.
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Autosave (");

        sb.append(domainId);
        sb.append(", ").append(userId);
        sb.append(", ").append(webtopClientId);
        sb.append(", ").append(serviceId);
        sb.append(", ").append(context);
        sb.append(", ").append(key);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }
}
