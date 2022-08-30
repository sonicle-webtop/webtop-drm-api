/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LineManagerUsers implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String domainId;
    private java.lang.String lineManagerUserId;
    private java.lang.String userId;

    public LineManagerUsers() {}

    public LineManagerUsers(LineManagerUsers value) {
        this.domainId = value.domainId;
        this.lineManagerUserId = value.lineManagerUserId;
        this.userId = value.userId;
    }

    public LineManagerUsers(
        java.lang.String domainId,
        java.lang.String lineManagerUserId,
        java.lang.String userId
    ) {
        this.domainId = domainId;
        this.lineManagerUserId = lineManagerUserId;
        this.userId = userId;
    }

    /**
     * Getter for <code>drm.line_manager_users.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.line_manager_users.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.line_manager_users.line_manager_user_id</code>.
     */
    public java.lang.String getLineManagerUserId() {
        return this.lineManagerUserId;
    }

    /**
     * Setter for <code>drm.line_manager_users.line_manager_user_id</code>.
     */
    public void setLineManagerUserId(java.lang.String lineManagerUserId) {
        this.lineManagerUserId = lineManagerUserId;
    }

    /**
     * Getter for <code>drm.line_manager_users.user_id</code>.
     */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>drm.line_manager_users.user_id</code>.
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineManagerUsers (");

        sb.append(domainId);
        sb.append(", ").append(lineManagerUserId);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }
}