/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LineManagers implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String domainId;
    private java.lang.String userId;

    public LineManagers() {}

    public LineManagers(LineManagers value) {
        this.domainId = value.domainId;
        this.userId = value.userId;
    }

    public LineManagers(
        java.lang.String domainId,
        java.lang.String userId
    ) {
        this.domainId = domainId;
        this.userId = userId;
    }

    /**
     * Getter for <code>drm.line_managers.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.line_managers.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.line_managers.user_id</code>.
     */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>drm.line_managers.user_id</code>.
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineManagers (");

        sb.append(domainId);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }
}
