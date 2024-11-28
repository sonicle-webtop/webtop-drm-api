/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpportunityInterlocutors implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;
    private java.lang.Integer opportunityId;
    private java.lang.String  contactId;

    public OpportunityInterlocutors() {}

    public OpportunityInterlocutors(OpportunityInterlocutors value) {
        this.id = value.id;
        this.opportunityId = value.opportunityId;
        this.contactId = value.contactId;
    }

    public OpportunityInterlocutors(
        java.lang.Integer id,
        java.lang.Integer opportunityId,
        java.lang.String  contactId
    ) {
        this.id = id;
        this.opportunityId = opportunityId;
        this.contactId = contactId;
    }

    /**
     * Getter for <code>drm.opportunity_interlocutors.id</code>.
     */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>drm.opportunity_interlocutors.id</code>.
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>drm.opportunity_interlocutors.opportunity_id</code>.
     */
    public java.lang.Integer getOpportunityId() {
        return this.opportunityId;
    }

    /**
     * Setter for <code>drm.opportunity_interlocutors.opportunity_id</code>.
     */
    public void setOpportunityId(java.lang.Integer opportunityId) {
        this.opportunityId = opportunityId;
    }

    /**
     * Getter for <code>drm.opportunity_interlocutors.contact_id</code>.
     */
    public java.lang.String getContactId() {
        return this.contactId;
    }

    /**
     * Setter for <code>drm.opportunity_interlocutors.contact_id</code>.
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OpportunityInterlocutors (");

        sb.append(id);
        sb.append(", ").append(opportunityId);
        sb.append(", ").append(contactId);

        sb.append(")");
        return sb.toString();
    }
}
