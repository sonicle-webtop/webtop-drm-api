/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeProfiles implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;
    private java.lang.String  domainId;
    private java.lang.String  userId;
    private java.lang.String  number;
    private java.lang.String  tolerance;
    private java.lang.Boolean extraordinary;
    private java.lang.Boolean onlyPresence;
    private java.lang.Integer hourProfileId;
    private java.lang.String  headquartersCode;
    private java.lang.Boolean noStamping;
    private java.lang.Integer minimumNumberOfHoursPerTicket;
    private java.lang.String  stampingMode;

    public EmployeeProfiles() {}

    public EmployeeProfiles(EmployeeProfiles value) {
        this.id = value.id;
        this.domainId = value.domainId;
        this.userId = value.userId;
        this.number = value.number;
        this.tolerance = value.tolerance;
        this.extraordinary = value.extraordinary;
        this.onlyPresence = value.onlyPresence;
        this.hourProfileId = value.hourProfileId;
        this.headquartersCode = value.headquartersCode;
        this.noStamping = value.noStamping;
        this.minimumNumberOfHoursPerTicket = value.minimumNumberOfHoursPerTicket;
        this.stampingMode = value.stampingMode;
    }

    public EmployeeProfiles(
        java.lang.Integer id,
        java.lang.String  domainId,
        java.lang.String  userId,
        java.lang.String  number,
        java.lang.String  tolerance,
        java.lang.Boolean extraordinary,
        java.lang.Boolean onlyPresence,
        java.lang.Integer hourProfileId,
        java.lang.String  headquartersCode,
        java.lang.Boolean noStamping,
        java.lang.Integer minimumNumberOfHoursPerTicket,
        java.lang.String  stampingMode
    ) {
        this.id = id;
        this.domainId = domainId;
        this.userId = userId;
        this.number = number;
        this.tolerance = tolerance;
        this.extraordinary = extraordinary;
        this.onlyPresence = onlyPresence;
        this.hourProfileId = hourProfileId;
        this.headquartersCode = headquartersCode;
        this.noStamping = noStamping;
        this.minimumNumberOfHoursPerTicket = minimumNumberOfHoursPerTicket;
        this.stampingMode = stampingMode;
    }

    /**
     * Getter for <code>drm.employee_profiles.id</code>.
     */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>drm.employee_profiles.id</code>.
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>drm.employee_profiles.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.employee_profiles.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.employee_profiles.user_id</code>.
     */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>drm.employee_profiles.user_id</code>.
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>drm.employee_profiles.number</code>.
     */
    public java.lang.String getNumber() {
        return this.number;
    }

    /**
     * Setter for <code>drm.employee_profiles.number</code>.
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }

    /**
     * Getter for <code>drm.employee_profiles.tolerance</code>.
     */
    public java.lang.String getTolerance() {
        return this.tolerance;
    }

    /**
     * Setter for <code>drm.employee_profiles.tolerance</code>.
     */
    public void setTolerance(java.lang.String tolerance) {
        this.tolerance = tolerance;
    }

    /**
     * Getter for <code>drm.employee_profiles.extraordinary</code>.
     */
    public java.lang.Boolean getExtraordinary() {
        return this.extraordinary;
    }

    /**
     * Setter for <code>drm.employee_profiles.extraordinary</code>.
     */
    public void setExtraordinary(java.lang.Boolean extraordinary) {
        this.extraordinary = extraordinary;
    }

    /**
     * Getter for <code>drm.employee_profiles.only_presence</code>.
     */
    public java.lang.Boolean getOnlyPresence() {
        return this.onlyPresence;
    }

    /**
     * Setter for <code>drm.employee_profiles.only_presence</code>.
     */
    public void setOnlyPresence(java.lang.Boolean onlyPresence) {
        this.onlyPresence = onlyPresence;
    }

    /**
     * Getter for <code>drm.employee_profiles.hour_profile_id</code>.
     */
    public java.lang.Integer getHourProfileId() {
        return this.hourProfileId;
    }

    /**
     * Setter for <code>drm.employee_profiles.hour_profile_id</code>.
     */
    public void setHourProfileId(java.lang.Integer hourProfileId) {
        this.hourProfileId = hourProfileId;
    }

    /**
     * Getter for <code>drm.employee_profiles.headquarters_code</code>.
     */
    public java.lang.String getHeadquartersCode() {
        return this.headquartersCode;
    }

    /**
     * Setter for <code>drm.employee_profiles.headquarters_code</code>.
     */
    public void setHeadquartersCode(java.lang.String headquartersCode) {
        this.headquartersCode = headquartersCode;
    }

    /**
     * Getter for <code>drm.employee_profiles.no_stamping</code>.
     */
    public java.lang.Boolean getNoStamping() {
        return this.noStamping;
    }

    /**
     * Setter for <code>drm.employee_profiles.no_stamping</code>.
     */
    public void setNoStamping(java.lang.Boolean noStamping) {
        this.noStamping = noStamping;
    }

    /**
     * Getter for <code>drm.employee_profiles.minimum_number_of_hours_per_ticket</code>.
     */
    public java.lang.Integer getMinimumNumberOfHoursPerTicket() {
        return this.minimumNumberOfHoursPerTicket;
    }

    /**
     * Setter for <code>drm.employee_profiles.minimum_number_of_hours_per_ticket</code>.
     */
    public void setMinimumNumberOfHoursPerTicket(java.lang.Integer minimumNumberOfHoursPerTicket) {
        this.minimumNumberOfHoursPerTicket = minimumNumberOfHoursPerTicket;
    }

    /**
     * Getter for <code>drm.employee_profiles.stamping_mode</code>.
     */
    public java.lang.String getStampingMode() {
        return this.stampingMode;
    }

    /**
     * Setter for <code>drm.employee_profiles.stamping_mode</code>.
     */
    public void setStampingMode(java.lang.String stampingMode) {
        this.stampingMode = stampingMode;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmployeeProfiles (");

        sb.append(id);
        sb.append(", ").append(domainId);
        sb.append(", ").append(userId);
        sb.append(", ").append(number);
        sb.append(", ").append(tolerance);
        sb.append(", ").append(extraordinary);
        sb.append(", ").append(onlyPresence);
        sb.append(", ").append(hourProfileId);
        sb.append(", ").append(headquartersCode);
        sb.append(", ").append(noStamping);
        sb.append(", ").append(minimumNumberOfHoursPerTicket);
        sb.append(", ").append(stampingMode);

        sb.append(")");
        return sb.toString();
    }
}
