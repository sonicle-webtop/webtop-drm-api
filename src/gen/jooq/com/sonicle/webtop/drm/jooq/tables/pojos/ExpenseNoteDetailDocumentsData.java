/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExpenseNoteDetailDocumentsData implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String expenseNoteDetailDocumentId;
    private byte[]           bytes;

    public ExpenseNoteDetailDocumentsData() {}

    public ExpenseNoteDetailDocumentsData(ExpenseNoteDetailDocumentsData value) {
        this.expenseNoteDetailDocumentId = value.expenseNoteDetailDocumentId;
        this.bytes = value.bytes;
    }

    public ExpenseNoteDetailDocumentsData(
        java.lang.String expenseNoteDetailDocumentId,
        byte[]           bytes
    ) {
        this.expenseNoteDetailDocumentId = expenseNoteDetailDocumentId;
        this.bytes = bytes;
    }

    /**
     * Getter for <code>drm.expense_note_detail_documents_data.expense_note_detail_document_id</code>.
     */
    public java.lang.String getExpenseNoteDetailDocumentId() {
        return this.expenseNoteDetailDocumentId;
    }

    /**
     * Setter for <code>drm.expense_note_detail_documents_data.expense_note_detail_document_id</code>.
     */
    public void setExpenseNoteDetailDocumentId(java.lang.String expenseNoteDetailDocumentId) {
        this.expenseNoteDetailDocumentId = expenseNoteDetailDocumentId;
    }

    /**
     * Getter for <code>drm.expense_note_detail_documents_data.bytes</code>.
     */
    public byte[] getBytes() {
        return this.bytes;
    }

    /**
     * Setter for <code>drm.expense_note_detail_documents_data.bytes</code>.
     */
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExpenseNoteDetailDocumentsData (");

        sb.append(expenseNoteDetailDocumentId);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}