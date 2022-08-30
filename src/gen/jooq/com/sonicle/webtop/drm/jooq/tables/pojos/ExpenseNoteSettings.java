/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExpenseNoteSettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer    expenseNoteSettingId;
    private java.lang.String     domainId;
    private java.lang.Boolean    averageMaximum;
    private java.lang.String     defaultCurrency;
    private java.math.BigDecimal kmCost;

    public ExpenseNoteSettings() {}

    public ExpenseNoteSettings(ExpenseNoteSettings value) {
        this.expenseNoteSettingId = value.expenseNoteSettingId;
        this.domainId = value.domainId;
        this.averageMaximum = value.averageMaximum;
        this.defaultCurrency = value.defaultCurrency;
        this.kmCost = value.kmCost;
    }

    public ExpenseNoteSettings(
        java.lang.Integer    expenseNoteSettingId,
        java.lang.String     domainId,
        java.lang.Boolean    averageMaximum,
        java.lang.String     defaultCurrency,
        java.math.BigDecimal kmCost
    ) {
        this.expenseNoteSettingId = expenseNoteSettingId;
        this.domainId = domainId;
        this.averageMaximum = averageMaximum;
        this.defaultCurrency = defaultCurrency;
        this.kmCost = kmCost;
    }

    /**
     * Getter for <code>drm.expense_note_settings.expense_note_setting_id</code>.
     */
    public java.lang.Integer getExpenseNoteSettingId() {
        return this.expenseNoteSettingId;
    }

    /**
     * Setter for <code>drm.expense_note_settings.expense_note_setting_id</code>.
     */
    public void setExpenseNoteSettingId(java.lang.Integer expenseNoteSettingId) {
        this.expenseNoteSettingId = expenseNoteSettingId;
    }

    /**
     * Getter for <code>drm.expense_note_settings.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.expense_note_settings.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.expense_note_settings.average_maximum</code>.
     */
    public java.lang.Boolean getAverageMaximum() {
        return this.averageMaximum;
    }

    /**
     * Setter for <code>drm.expense_note_settings.average_maximum</code>.
     */
    public void setAverageMaximum(java.lang.Boolean averageMaximum) {
        this.averageMaximum = averageMaximum;
    }

    /**
     * Getter for <code>drm.expense_note_settings.default_currency</code>.
     */
    public java.lang.String getDefaultCurrency() {
        return this.defaultCurrency;
    }

    /**
     * Setter for <code>drm.expense_note_settings.default_currency</code>.
     */
    public void setDefaultCurrency(java.lang.String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    /**
     * Getter for <code>drm.expense_note_settings.km_cost</code>.
     */
    public java.math.BigDecimal getKmCost() {
        return this.kmCost;
    }

    /**
     * Setter for <code>drm.expense_note_settings.km_cost</code>.
     */
    public void setKmCost(java.math.BigDecimal kmCost) {
        this.kmCost = kmCost;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExpenseNoteSettings (");

        sb.append(expenseNoteSettingId);
        sb.append(", ").append(domainId);
        sb.append(", ").append(averageMaximum);
        sb.append(", ").append(defaultCurrency);
        sb.append(", ").append(kmCost);

        sb.append(")");
        return sb.toString();
    }
}