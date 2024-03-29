/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EnabledProgramsRecord extends org.jooq.impl.UpdatableRecordImpl<EnabledProgramsRecord> implements org.jooq.Record5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.enabled_programs.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.enabled_programs.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>drm.enabled_programs.group_id</code>.
     */
    public void setGroupId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.enabled_programs.group_id</code>.
     */
    public java.lang.String getGroupId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.enabled_programs.program_id</code>.
     */
    public void setProgramId(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.enabled_programs.program_id</code>.
     */
    public java.lang.String getProgramId() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>drm.enabled_programs.parent_id</code>.
     */
    public void setParentId(java.lang.String value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.enabled_programs.parent_id</code>.
     */
    public java.lang.String getParentId() {
        return (java.lang.String) get(3);
    }

    /**
     * Setter for <code>drm.enabled_programs.read_only</code>.
     */
    public void setReadOnly(java.lang.Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>drm.enabled_programs.read_only</code>.
     */
    public java.lang.Boolean getReadOnly() {
        return (java.lang.Boolean) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record2<java.lang.String, java.lang.String> key() {
        return (org.jooq.Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> fieldsRow() {
        return (org.jooq.Row5) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> valuesRow() {
        return (org.jooq.Row5) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.EnabledPrograms.ENABLED_PROGRAMS.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.EnabledPrograms.ENABLED_PROGRAMS.GROUP_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.EnabledPrograms.ENABLED_PROGRAMS.PROGRAM_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field4() {
        return com.sonicle.webtop.drm.jooq.tables.EnabledPrograms.ENABLED_PROGRAMS.PARENT_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field5() {
        return com.sonicle.webtop.drm.jooq.tables.EnabledPrograms.ENABLED_PROGRAMS.READ_ONLY;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getGroupId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getProgramId();
    }

    @java.lang.Override
    public java.lang.String component4() {
        return getParentId();
    }

    @java.lang.Override
    public java.lang.Boolean component5() {
        return getReadOnly();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getGroupId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getProgramId();
    }

    @java.lang.Override
    public java.lang.String value4() {
        return getParentId();
    }

    @java.lang.Override
    public java.lang.Boolean value5() {
        return getReadOnly();
    }

    @java.lang.Override
    public EnabledProgramsRecord value1(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public EnabledProgramsRecord value2(java.lang.String value) {
        setGroupId(value);
        return this;
    }

    @java.lang.Override
    public EnabledProgramsRecord value3(java.lang.String value) {
        setProgramId(value);
        return this;
    }

    @java.lang.Override
    public EnabledProgramsRecord value4(java.lang.String value) {
        setParentId(value);
        return this;
    }

    @java.lang.Override
    public EnabledProgramsRecord value5(java.lang.Boolean value) {
        setReadOnly(value);
        return this;
    }

    @java.lang.Override
    public EnabledProgramsRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.Boolean value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EnabledProgramsRecord
     */
    public EnabledProgramsRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.EnabledPrograms.ENABLED_PROGRAMS);
    }

    /**
     * Create a detached, initialised EnabledProgramsRecord
     */
    public EnabledProgramsRecord(java.lang.String domainId, java.lang.String groupId, java.lang.String programId, java.lang.String parentId, java.lang.Boolean readOnly) {
        super(com.sonicle.webtop.drm.jooq.tables.EnabledPrograms.ENABLED_PROGRAMS);

        setDomainId(domainId);
        setGroupId(groupId);
        setProgramId(programId);
        setParentId(parentId);
        setReadOnly(readOnly);
    }
}
