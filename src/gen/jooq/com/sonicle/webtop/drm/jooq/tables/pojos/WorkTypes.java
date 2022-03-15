/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkTypes implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer workTypeId;
    private java.lang.String  domainId;
    private java.lang.String  revisionStatus;
    private java.lang.String  externalId;
    private java.lang.String  description;

    public WorkTypes() {}

    public WorkTypes(WorkTypes value) {
        this.workTypeId = value.workTypeId;
        this.domainId = value.domainId;
        this.revisionStatus = value.revisionStatus;
        this.externalId = value.externalId;
        this.description = value.description;
    }

    public WorkTypes(
        java.lang.Integer workTypeId,
        java.lang.String  domainId,
        java.lang.String  revisionStatus,
        java.lang.String  externalId,
        java.lang.String  description
    ) {
        this.workTypeId = workTypeId;
        this.domainId = domainId;
        this.revisionStatus = revisionStatus;
        this.externalId = externalId;
        this.description = description;
    }

    /**
     * Getter for <code>drm.work_types.work_type_id</code>.
     */
    public java.lang.Integer getWorkTypeId() {
        return this.workTypeId;
    }

    /**
     * Setter for <code>drm.work_types.work_type_id</code>.
     */
    public void setWorkTypeId(java.lang.Integer workTypeId) {
        this.workTypeId = workTypeId;
    }

    /**
     * Getter for <code>drm.work_types.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.work_types.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.work_types.revision_status</code>.
     */
    public java.lang.String getRevisionStatus() {
        return this.revisionStatus;
    }

    /**
     * Setter for <code>drm.work_types.revision_status</code>.
     */
    public void setRevisionStatus(java.lang.String revisionStatus) {
        this.revisionStatus = revisionStatus;
    }

    /**
     * Getter for <code>drm.work_types.external_id</code>.
     */
    public java.lang.String getExternalId() {
        return this.externalId;
    }

    /**
     * Setter for <code>drm.work_types.external_id</code>.
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    /**
     * Getter for <code>drm.work_types.description</code>.
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>drm.work_types.description</code>.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkTypes (");

        sb.append(workTypeId);
        sb.append(", ").append(domainId);
        sb.append(", ").append(revisionStatus);
        sb.append(", ").append(externalId);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
