/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessTrips implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer businessTripId;
    private java.lang.String  domainId;
    private java.lang.String  revisionStatus;
    private java.lang.String  externalId;
    private java.lang.String  description;

    public BusinessTrips() {}

    public BusinessTrips(BusinessTrips value) {
        this.businessTripId = value.businessTripId;
        this.domainId = value.domainId;
        this.revisionStatus = value.revisionStatus;
        this.externalId = value.externalId;
        this.description = value.description;
    }

    public BusinessTrips(
        java.lang.Integer businessTripId,
        java.lang.String  domainId,
        java.lang.String  revisionStatus,
        java.lang.String  externalId,
        java.lang.String  description
    ) {
        this.businessTripId = businessTripId;
        this.domainId = domainId;
        this.revisionStatus = revisionStatus;
        this.externalId = externalId;
        this.description = description;
    }

    /**
     * Getter for <code>drm.business_trips.business_trip_id</code>.
     */
    public java.lang.Integer getBusinessTripId() {
        return this.businessTripId;
    }

    /**
     * Setter for <code>drm.business_trips.business_trip_id</code>.
     */
    public void setBusinessTripId(java.lang.Integer businessTripId) {
        this.businessTripId = businessTripId;
    }

    /**
     * Getter for <code>drm.business_trips.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.business_trips.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.business_trips.revision_status</code>.
     */
    public java.lang.String getRevisionStatus() {
        return this.revisionStatus;
    }

    /**
     * Setter for <code>drm.business_trips.revision_status</code>.
     */
    public void setRevisionStatus(java.lang.String revisionStatus) {
        this.revisionStatus = revisionStatus;
    }

    /**
     * Getter for <code>drm.business_trips.external_id</code>.
     */
    public java.lang.String getExternalId() {
        return this.externalId;
    }

    /**
     * Setter for <code>drm.business_trips.external_id</code>.
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    /**
     * Getter for <code>drm.business_trips.description</code>.
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>drm.business_trips.description</code>.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessTrips (");

        sb.append(businessTripId);
        sb.append(", ").append(domainId);
        sb.append(", ").append(revisionStatus);
        sb.append(", ").append(externalId);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}