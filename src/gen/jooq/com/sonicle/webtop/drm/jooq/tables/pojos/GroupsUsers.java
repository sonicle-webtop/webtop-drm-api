/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupsUsers implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer associationId;
    private java.lang.String  groupId;
    private java.lang.String  userId;

    public GroupsUsers() {}

    public GroupsUsers(GroupsUsers value) {
        this.associationId = value.associationId;
        this.groupId = value.groupId;
        this.userId = value.userId;
    }

    public GroupsUsers(
        java.lang.Integer associationId,
        java.lang.String  groupId,
        java.lang.String  userId
    ) {
        this.associationId = associationId;
        this.groupId = groupId;
        this.userId = userId;
    }

    /**
     * Getter for <code>drm.groups_users.association_id</code>.
     */
    public java.lang.Integer getAssociationId() {
        return this.associationId;
    }

    /**
     * Setter for <code>drm.groups_users.association_id</code>.
     */
    public void setAssociationId(java.lang.Integer associationId) {
        this.associationId = associationId;
    }

    /**
     * Getter for <code>drm.groups_users.group_id</code>.
     */
    public java.lang.String getGroupId() {
        return this.groupId;
    }

    /**
     * Setter for <code>drm.groups_users.group_id</code>.
     */
    public void setGroupId(java.lang.String groupId) {
        this.groupId = groupId;
    }

    /**
     * Getter for <code>drm.groups_users.user_id</code>.
     */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>drm.groups_users.user_id</code>.
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GroupsUsers (");

        sb.append(associationId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }
}
