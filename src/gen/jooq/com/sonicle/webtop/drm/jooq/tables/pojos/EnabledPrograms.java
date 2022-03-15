/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EnabledPrograms implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String  domainId;
    private java.lang.String  groupId;
    private java.lang.String  programId;
    private java.lang.String  parentId;
    private java.lang.Boolean readOnly;

    public EnabledPrograms() {}

    public EnabledPrograms(EnabledPrograms value) {
        this.domainId = value.domainId;
        this.groupId = value.groupId;
        this.programId = value.programId;
        this.parentId = value.parentId;
        this.readOnly = value.readOnly;
    }

    public EnabledPrograms(
        java.lang.String  domainId,
        java.lang.String  groupId,
        java.lang.String  programId,
        java.lang.String  parentId,
        java.lang.Boolean readOnly
    ) {
        this.domainId = domainId;
        this.groupId = groupId;
        this.programId = programId;
        this.parentId = parentId;
        this.readOnly = readOnly;
    }

    /**
     * Getter for <code>drm.enabled_programs.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.enabled_programs.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.enabled_programs.group_id</code>.
     */
    public java.lang.String getGroupId() {
        return this.groupId;
    }

    /**
     * Setter for <code>drm.enabled_programs.group_id</code>.
     */
    public void setGroupId(java.lang.String groupId) {
        this.groupId = groupId;
    }

    /**
     * Getter for <code>drm.enabled_programs.program_id</code>.
     */
    public java.lang.String getProgramId() {
        return this.programId;
    }

    /**
     * Setter for <code>drm.enabled_programs.program_id</code>.
     */
    public void setProgramId(java.lang.String programId) {
        this.programId = programId;
    }

    /**
     * Getter for <code>drm.enabled_programs.parent_id</code>.
     */
    public java.lang.String getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>drm.enabled_programs.parent_id</code>.
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }

    /**
     * Getter for <code>drm.enabled_programs.read_only</code>.
     */
    public java.lang.Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * Setter for <code>drm.enabled_programs.read_only</code>.
     */
    public void setReadOnly(java.lang.Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnabledPrograms (");

        sb.append(domainId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(programId);
        sb.append(", ").append(parentId);
        sb.append(", ").append(readOnly);

        sb.append(")");
        return sb.toString();
    }
}
