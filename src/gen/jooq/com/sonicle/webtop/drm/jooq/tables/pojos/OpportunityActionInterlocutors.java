/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpportunityActionInterlocutors implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;
    private java.lang.Integer opportunityActionId;
    private java.lang.String  contactId;

    public OpportunityActionInterlocutors() {}

    public OpportunityActionInterlocutors(OpportunityActionInterlocutors value) {
        this.id = value.id;
        this.opportunityActionId = value.opportunityActionId;
        this.contactId = value.contactId;
    }

    public OpportunityActionInterlocutors(
        java.lang.Integer id,
        java.lang.Integer opportunityActionId,
        java.lang.String  contactId
    ) {
        this.id = id;
        this.opportunityActionId = opportunityActionId;
        this.contactId = contactId;
    }

    /**
     * Getter for <code>drm.opportunity_action_interlocutors.id</code>.
     */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>drm.opportunity_action_interlocutors.id</code>.
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>drm.opportunity_action_interlocutors.opportunity_action_id</code>.
     */
    public java.lang.Integer getOpportunityActionId() {
        return this.opportunityActionId;
    }

    /**
     * Setter for <code>drm.opportunity_action_interlocutors.opportunity_action_id</code>.
     */
    public void setOpportunityActionId(java.lang.Integer opportunityActionId) {
        this.opportunityActionId = opportunityActionId;
    }

    /**
     * Getter for <code>drm.opportunity_action_interlocutors.contact_id</code>.
     */
    public java.lang.String getContactId() {
        return this.contactId;
    }

    /**
     * Setter for <code>drm.opportunity_action_interlocutors.contact_id</code>.
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OpportunityActionInterlocutors (");

        sb.append(id);
        sb.append(", ").append(opportunityActionId);
        sb.append(", ").append(contactId);

        sb.append(")");
        return sb.toString();
    }
}
