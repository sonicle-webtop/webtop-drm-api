/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Groups implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String groupId;
    private java.lang.String domainId;
    private java.lang.String groupCategory;
    private java.lang.String name;
    private java.lang.String description;
    private java.lang.String groupType;
    private java.lang.String customerId;
    private java.lang.String supervisiorUserId;

    public Groups() {}

    public Groups(Groups value) {
        this.groupId = value.groupId;
        this.domainId = value.domainId;
        this.groupCategory = value.groupCategory;
        this.name = value.name;
        this.description = value.description;
        this.groupType = value.groupType;
        this.customerId = value.customerId;
        this.supervisiorUserId = value.supervisiorUserId;
    }

    public Groups(
        java.lang.String groupId,
        java.lang.String domainId,
        java.lang.String groupCategory,
        java.lang.String name,
        java.lang.String description,
        java.lang.String groupType,
        java.lang.String customerId,
        java.lang.String supervisiorUserId
    ) {
        this.groupId = groupId;
        this.domainId = domainId;
        this.groupCategory = groupCategory;
        this.name = name;
        this.description = description;
        this.groupType = groupType;
        this.customerId = customerId;
        this.supervisiorUserId = supervisiorUserId;
    }

    /**
     * Getter for <code>drm.groups.group_id</code>.
     */
    public java.lang.String getGroupId() {
        return this.groupId;
    }

    /**
     * Setter for <code>drm.groups.group_id</code>.
     */
    public void setGroupId(java.lang.String groupId) {
        this.groupId = groupId;
    }

    /**
     * Getter for <code>drm.groups.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.groups.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.groups.group_category</code>.
     */
    public java.lang.String getGroupCategory() {
        return this.groupCategory;
    }

    /**
     * Setter for <code>drm.groups.group_category</code>.
     */
    public void setGroupCategory(java.lang.String groupCategory) {
        this.groupCategory = groupCategory;
    }

    /**
     * Getter for <code>drm.groups.name</code>.
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * Setter for <code>drm.groups.name</code>.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Getter for <code>drm.groups.description</code>.
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>drm.groups.description</code>.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Getter for <code>drm.groups.group_type</code>.
     */
    public java.lang.String getGroupType() {
        return this.groupType;
    }

    /**
     * Setter for <code>drm.groups.group_type</code>.
     */
    public void setGroupType(java.lang.String groupType) {
        this.groupType = groupType;
    }

    /**
     * Getter for <code>drm.groups.customer_id</code>.
     */
    public java.lang.String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>drm.groups.customer_id</code>.
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for <code>drm.groups.supervisior_user_id</code>.
     */
    public java.lang.String getSupervisiorUserId() {
        return this.supervisiorUserId;
    }

    /**
     * Setter for <code>drm.groups.supervisior_user_id</code>.
     */
    public void setSupervisiorUserId(java.lang.String supervisiorUserId) {
        this.supervisiorUserId = supervisiorUserId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Groups (");

        sb.append(groupId);
        sb.append(", ").append(domainId);
        sb.append(", ").append(groupCategory);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(groupType);
        sb.append(", ").append(customerId);
        sb.append(", ").append(supervisiorUserId);

        sb.append(")");
        return sb.toString();
    }
}
