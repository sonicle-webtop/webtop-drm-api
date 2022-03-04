/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpportunityDocumentsData implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String opportunityDocumentId;
    private byte[]           bytes;

    public OpportunityDocumentsData() {}

    public OpportunityDocumentsData(OpportunityDocumentsData value) {
        this.opportunityDocumentId = value.opportunityDocumentId;
        this.bytes = value.bytes;
    }

    public OpportunityDocumentsData(
        java.lang.String opportunityDocumentId,
        byte[]           bytes
    ) {
        this.opportunityDocumentId = opportunityDocumentId;
        this.bytes = bytes;
    }

    /**
     * Getter for <code>drm.opportunity_documents_data.opportunity_document_id</code>.
     */
    public java.lang.String getOpportunityDocumentId() {
        return this.opportunityDocumentId;
    }

    /**
     * Setter for <code>drm.opportunity_documents_data.opportunity_document_id</code>.
     */
    public void setOpportunityDocumentId(java.lang.String opportunityDocumentId) {
        this.opportunityDocumentId = opportunityDocumentId;
    }

    /**
     * Getter for <code>drm.opportunity_documents_data.bytes</code>.
     */
    public byte[] getBytes() {
        return this.bytes;
    }

    /**
     * Setter for <code>drm.opportunity_documents_data.bytes</code>.
     */
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OpportunityDocumentsData (");

        sb.append(opportunityDocumentId);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}
