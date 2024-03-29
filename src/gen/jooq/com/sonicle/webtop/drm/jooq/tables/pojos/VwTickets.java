/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VwTickets implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String       ticketId;
    private java.lang.String       fromOperatorId;
    private java.lang.String       fromOperatorDescription;
    private java.lang.String       toOperatorId;
    private java.lang.String       toOperatorDescription;
    private java.lang.String       customerId;
    private java.lang.String       customerDescription;
    private java.lang.String       customerStatId;
    private java.lang.String       customerStatDescription;
    private java.lang.Integer      ticketCategoryId;
    private java.lang.String       ticketCategoryDescription;
    private org.joda.time.DateTime date;
    private java.lang.String       timezone;
    private java.lang.Integer      companyId;
    private java.lang.String       companyDescription;
    private java.lang.String       title;
    private java.lang.Integer      statusId;
    private java.lang.String       statusDescription;
    private java.lang.String       priorityId;
    private java.lang.String       domainId;
    private java.lang.String       number;
    private java.lang.String       type;
    private java.lang.String       description;

    public VwTickets() {}

    public VwTickets(VwTickets value) {
        this.ticketId = value.ticketId;
        this.fromOperatorId = value.fromOperatorId;
        this.fromOperatorDescription = value.fromOperatorDescription;
        this.toOperatorId = value.toOperatorId;
        this.toOperatorDescription = value.toOperatorDescription;
        this.customerId = value.customerId;
        this.customerDescription = value.customerDescription;
        this.customerStatId = value.customerStatId;
        this.customerStatDescription = value.customerStatDescription;
        this.ticketCategoryId = value.ticketCategoryId;
        this.ticketCategoryDescription = value.ticketCategoryDescription;
        this.date = value.date;
        this.timezone = value.timezone;
        this.companyId = value.companyId;
        this.companyDescription = value.companyDescription;
        this.title = value.title;
        this.statusId = value.statusId;
        this.statusDescription = value.statusDescription;
        this.priorityId = value.priorityId;
        this.domainId = value.domainId;
        this.number = value.number;
        this.type = value.type;
        this.description = value.description;
    }

    public VwTickets(
        java.lang.String       ticketId,
        java.lang.String       fromOperatorId,
        java.lang.String       fromOperatorDescription,
        java.lang.String       toOperatorId,
        java.lang.String       toOperatorDescription,
        java.lang.String       customerId,
        java.lang.String       customerDescription,
        java.lang.String       customerStatId,
        java.lang.String       customerStatDescription,
        java.lang.Integer      ticketCategoryId,
        java.lang.String       ticketCategoryDescription,
        org.joda.time.DateTime date,
        java.lang.String       timezone,
        java.lang.Integer      companyId,
        java.lang.String       companyDescription,
        java.lang.String       title,
        java.lang.Integer      statusId,
        java.lang.String       statusDescription,
        java.lang.String       priorityId,
        java.lang.String       domainId,
        java.lang.String       number,
        java.lang.String       type,
        java.lang.String       description
    ) {
        this.ticketId = ticketId;
        this.fromOperatorId = fromOperatorId;
        this.fromOperatorDescription = fromOperatorDescription;
        this.toOperatorId = toOperatorId;
        this.toOperatorDescription = toOperatorDescription;
        this.customerId = customerId;
        this.customerDescription = customerDescription;
        this.customerStatId = customerStatId;
        this.customerStatDescription = customerStatDescription;
        this.ticketCategoryId = ticketCategoryId;
        this.ticketCategoryDescription = ticketCategoryDescription;
        this.date = date;
        this.timezone = timezone;
        this.companyId = companyId;
        this.companyDescription = companyDescription;
        this.title = title;
        this.statusId = statusId;
        this.statusDescription = statusDescription;
        this.priorityId = priorityId;
        this.domainId = domainId;
        this.number = number;
        this.type = type;
        this.description = description;
    }

    /**
     * Getter for <code>drm.vw_tickets.ticket_id</code>.
     */
    public java.lang.String getTicketId() {
        return this.ticketId;
    }

    /**
     * Setter for <code>drm.vw_tickets.ticket_id</code>.
     */
    public void setTicketId(java.lang.String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * Getter for <code>drm.vw_tickets.from_operator_id</code>.
     */
    public java.lang.String getFromOperatorId() {
        return this.fromOperatorId;
    }

    /**
     * Setter for <code>drm.vw_tickets.from_operator_id</code>.
     */
    public void setFromOperatorId(java.lang.String fromOperatorId) {
        this.fromOperatorId = fromOperatorId;
    }

    /**
     * Getter for <code>drm.vw_tickets.from_operator_description</code>.
     */
    public java.lang.String getFromOperatorDescription() {
        return this.fromOperatorDescription;
    }

    /**
     * Setter for <code>drm.vw_tickets.from_operator_description</code>.
     */
    public void setFromOperatorDescription(java.lang.String fromOperatorDescription) {
        this.fromOperatorDescription = fromOperatorDescription;
    }

    /**
     * Getter for <code>drm.vw_tickets.to_operator_id</code>.
     */
    public java.lang.String getToOperatorId() {
        return this.toOperatorId;
    }

    /**
     * Setter for <code>drm.vw_tickets.to_operator_id</code>.
     */
    public void setToOperatorId(java.lang.String toOperatorId) {
        this.toOperatorId = toOperatorId;
    }

    /**
     * Getter for <code>drm.vw_tickets.to_operator_description</code>.
     */
    public java.lang.String getToOperatorDescription() {
        return this.toOperatorDescription;
    }

    /**
     * Setter for <code>drm.vw_tickets.to_operator_description</code>.
     */
    public void setToOperatorDescription(java.lang.String toOperatorDescription) {
        this.toOperatorDescription = toOperatorDescription;
    }

    /**
     * Getter for <code>drm.vw_tickets.customer_id</code>.
     */
    public java.lang.String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>drm.vw_tickets.customer_id</code>.
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for <code>drm.vw_tickets.customer_description</code>.
     */
    public java.lang.String getCustomerDescription() {
        return this.customerDescription;
    }

    /**
     * Setter for <code>drm.vw_tickets.customer_description</code>.
     */
    public void setCustomerDescription(java.lang.String customerDescription) {
        this.customerDescription = customerDescription;
    }

    /**
     * Getter for <code>drm.vw_tickets.customer_stat_id</code>.
     */
    public java.lang.String getCustomerStatId() {
        return this.customerStatId;
    }

    /**
     * Setter for <code>drm.vw_tickets.customer_stat_id</code>.
     */
    public void setCustomerStatId(java.lang.String customerStatId) {
        this.customerStatId = customerStatId;
    }

    /**
     * Getter for <code>drm.vw_tickets.customer_stat_description</code>.
     */
    public java.lang.String getCustomerStatDescription() {
        return this.customerStatDescription;
    }

    /**
     * Setter for <code>drm.vw_tickets.customer_stat_description</code>.
     */
    public void setCustomerStatDescription(java.lang.String customerStatDescription) {
        this.customerStatDescription = customerStatDescription;
    }

    /**
     * Getter for <code>drm.vw_tickets.ticket_category_id</code>.
     */
    public java.lang.Integer getTicketCategoryId() {
        return this.ticketCategoryId;
    }

    /**
     * Setter for <code>drm.vw_tickets.ticket_category_id</code>.
     */
    public void setTicketCategoryId(java.lang.Integer ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    /**
     * Getter for <code>drm.vw_tickets.ticket_category_description</code>.
     */
    public java.lang.String getTicketCategoryDescription() {
        return this.ticketCategoryDescription;
    }

    /**
     * Setter for <code>drm.vw_tickets.ticket_category_description</code>.
     */
    public void setTicketCategoryDescription(java.lang.String ticketCategoryDescription) {
        this.ticketCategoryDescription = ticketCategoryDescription;
    }

    /**
     * Getter for <code>drm.vw_tickets.date</code>.
     */
    public org.joda.time.DateTime getDate() {
        return this.date;
    }

    /**
     * Setter for <code>drm.vw_tickets.date</code>.
     */
    public void setDate(org.joda.time.DateTime date) {
        this.date = date;
    }

    /**
     * Getter for <code>drm.vw_tickets.timezone</code>.
     */
    public java.lang.String getTimezone() {
        return this.timezone;
    }

    /**
     * Setter for <code>drm.vw_tickets.timezone</code>.
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }

    /**
     * Getter for <code>drm.vw_tickets.company_id</code>.
     */
    public java.lang.Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>drm.vw_tickets.company_id</code>.
     */
    public void setCompanyId(java.lang.Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * Getter for <code>drm.vw_tickets.company_description</code>.
     */
    public java.lang.String getCompanyDescription() {
        return this.companyDescription;
    }

    /**
     * Setter for <code>drm.vw_tickets.company_description</code>.
     */
    public void setCompanyDescription(java.lang.String companyDescription) {
        this.companyDescription = companyDescription;
    }

    /**
     * Getter for <code>drm.vw_tickets.title</code>.
     */
    public java.lang.String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>drm.vw_tickets.title</code>.
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    /**
     * Getter for <code>drm.vw_tickets.status_id</code>.
     */
    public java.lang.Integer getStatusId() {
        return this.statusId;
    }

    /**
     * Setter for <code>drm.vw_tickets.status_id</code>.
     */
    public void setStatusId(java.lang.Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * Getter for <code>drm.vw_tickets.status_description</code>.
     */
    public java.lang.String getStatusDescription() {
        return this.statusDescription;
    }

    /**
     * Setter for <code>drm.vw_tickets.status_description</code>.
     */
    public void setStatusDescription(java.lang.String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * Getter for <code>drm.vw_tickets.priority_id</code>.
     */
    public java.lang.String getPriorityId() {
        return this.priorityId;
    }

    /**
     * Setter for <code>drm.vw_tickets.priority_id</code>.
     */
    public void setPriorityId(java.lang.String priorityId) {
        this.priorityId = priorityId;
    }

    /**
     * Getter for <code>drm.vw_tickets.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.vw_tickets.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.vw_tickets.number</code>.
     */
    public java.lang.String getNumber() {
        return this.number;
    }

    /**
     * Setter for <code>drm.vw_tickets.number</code>.
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }

    /**
     * Getter for <code>drm.vw_tickets.type</code>.
     */
    public java.lang.String getType() {
        return this.type;
    }

    /**
     * Setter for <code>drm.vw_tickets.type</code>.
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    /**
     * Getter for <code>drm.vw_tickets.description</code>.
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>drm.vw_tickets.description</code>.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VwTickets (");

        sb.append(ticketId);
        sb.append(", ").append(fromOperatorId);
        sb.append(", ").append(fromOperatorDescription);
        sb.append(", ").append(toOperatorId);
        sb.append(", ").append(toOperatorDescription);
        sb.append(", ").append(customerId);
        sb.append(", ").append(customerDescription);
        sb.append(", ").append(customerStatId);
        sb.append(", ").append(customerStatDescription);
        sb.append(", ").append(ticketCategoryId);
        sb.append(", ").append(ticketCategoryDescription);
        sb.append(", ").append(date);
        sb.append(", ").append(timezone);
        sb.append(", ").append(companyId);
        sb.append(", ").append(companyDescription);
        sb.append(", ").append(title);
        sb.append(", ").append(statusId);
        sb.append(", ").append(statusDescription);
        sb.append(", ").append(priorityId);
        sb.append(", ").append(domainId);
        sb.append(", ").append(number);
        sb.append(", ").append(type);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
