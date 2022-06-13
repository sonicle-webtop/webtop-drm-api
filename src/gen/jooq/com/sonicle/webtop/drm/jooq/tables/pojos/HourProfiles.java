/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HourProfiles implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;
    private java.lang.String  domainId;
    private java.lang.String  description;

    public HourProfiles() {}

    public HourProfiles(HourProfiles value) {
        this.id = value.id;
        this.domainId = value.domainId;
        this.description = value.description;
    }

    public HourProfiles(
        java.lang.Integer id,
        java.lang.String  domainId,
        java.lang.String  description
    ) {
        this.id = id;
        this.domainId = domainId;
        this.description = description;
    }

    /**
     * Getter for <code>drm.hour_profiles.id</code>.
     */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>drm.hour_profiles.id</code>.
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>drm.hour_profiles.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.hour_profiles.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.hour_profiles.description</code>.
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>drm.hour_profiles.description</code>.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HourProfiles (");

        sb.append(id);
        sb.append(", ").append(domainId);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
