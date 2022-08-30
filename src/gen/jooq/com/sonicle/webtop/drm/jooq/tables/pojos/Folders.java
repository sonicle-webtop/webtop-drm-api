/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Folders implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String  folderId;
    private java.lang.String  name;
    private java.lang.String  description;
    private java.lang.Boolean expired;

    public Folders() {}

    public Folders(Folders value) {
        this.folderId = value.folderId;
        this.name = value.name;
        this.description = value.description;
        this.expired = value.expired;
    }

    public Folders(
        java.lang.String  folderId,
        java.lang.String  name,
        java.lang.String  description,
        java.lang.Boolean expired
    ) {
        this.folderId = folderId;
        this.name = name;
        this.description = description;
        this.expired = expired;
    }

    /**
     * Getter for <code>drm.folders.folder_id</code>.
     */
    public java.lang.String getFolderId() {
        return this.folderId;
    }

    /**
     * Setter for <code>drm.folders.folder_id</code>.
     */
    public void setFolderId(java.lang.String folderId) {
        this.folderId = folderId;
    }

    /**
     * Getter for <code>drm.folders.name</code>.
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * Setter for <code>drm.folders.name</code>.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Getter for <code>drm.folders.description</code>.
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>drm.folders.description</code>.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Getter for <code>drm.folders.expired</code>.
     */
    public java.lang.Boolean getExpired() {
        return this.expired;
    }

    /**
     * Setter for <code>drm.folders.expired</code>.
     */
    public void setExpired(java.lang.Boolean expired) {
        this.expired = expired;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Folders (");

        sb.append(folderId);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(expired);

        sb.append(")");
        return sb.toString();
    }
}