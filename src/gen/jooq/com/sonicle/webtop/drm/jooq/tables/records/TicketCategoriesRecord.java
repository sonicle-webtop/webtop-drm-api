/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TicketCategoriesRecord extends org.jooq.impl.UpdatableRecordImpl<TicketCategoriesRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>drm.ticket_categories.ticket_category_id</code>.
     */
    public void setTicketCategoryId(java.lang.Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>drm.ticket_categories.ticket_category_id</code>.
     */
    public java.lang.Integer getTicketCategoryId() {
        return (java.lang.Integer) get(0);
    }

    /**
     * Setter for <code>drm.ticket_categories.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drm.ticket_categories.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>drm.ticket_categories.revision_status</code>.
     */
    public void setRevisionStatus(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drm.ticket_categories.revision_status</code>.
     */
    public java.lang.String getRevisionStatus() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>drm.ticket_categories.external_id</code>.
     */
    public void setExternalId(java.lang.String value) {
        set(3, value);
    }

    /**
     * Getter for <code>drm.ticket_categories.external_id</code>.
     */
    public java.lang.String getExternalId() {
        return (java.lang.String) get(3);
    }

    /**
     * Setter for <code>drm.ticket_categories.description</code>.
     */
    public void setDescription(java.lang.String value) {
        set(4, value);
    }

    /**
     * Getter for <code>drm.ticket_categories.description</code>.
     */
    public java.lang.String getDescription() {
        return (java.lang.String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row5) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
        return (org.jooq.Row5) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES.TICKET_CATEGORY_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES.REVISION_STATUS;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field4() {
        return com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES.EXTERNAL_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field5() {
        return com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES.DESCRIPTION;
    }

    @java.lang.Override
    public java.lang.Integer component1() {
        return getTicketCategoryId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getRevisionStatus();
    }

    @java.lang.Override
    public java.lang.String component4() {
        return getExternalId();
    }

    @java.lang.Override
    public java.lang.String component5() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.Integer value1() {
        return getTicketCategoryId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getRevisionStatus();
    }

    @java.lang.Override
    public java.lang.String value4() {
        return getExternalId();
    }

    @java.lang.Override
    public java.lang.String value5() {
        return getDescription();
    }

    @java.lang.Override
    public TicketCategoriesRecord value1(java.lang.Integer value) {
        setTicketCategoryId(value);
        return this;
    }

    @java.lang.Override
    public TicketCategoriesRecord value2(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public TicketCategoriesRecord value3(java.lang.String value) {
        setRevisionStatus(value);
        return this;
    }

    @java.lang.Override
    public TicketCategoriesRecord value4(java.lang.String value) {
        setExternalId(value);
        return this;
    }

    @java.lang.Override
    public TicketCategoriesRecord value5(java.lang.String value) {
        setDescription(value);
        return this;
    }

    @java.lang.Override
    public TicketCategoriesRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5) {
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
     * Create a detached TicketCategoriesRecord
     */
    public TicketCategoriesRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES);
    }

    /**
     * Create a detached, initialised TicketCategoriesRecord
     */
    public TicketCategoriesRecord(java.lang.Integer ticketCategoryId, java.lang.String domainId, java.lang.String revisionStatus, java.lang.String externalId, java.lang.String description) {
        super(com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES);

        setTicketCategoryId(ticketCategoryId);
        setDomainId(domainId);
        setRevisionStatus(revisionStatus);
        setExternalId(externalId);
        setDescription(description);
    }
}
