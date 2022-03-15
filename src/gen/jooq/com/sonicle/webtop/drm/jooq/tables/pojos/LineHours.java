/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LineHours implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;
    private java.lang.String  domainId;
    private java.lang.Integer hourProfileId;
    private java.lang.Integer lineId;
    private java.lang.String  _1E;
    private java.lang.String  _1U;
    private java.lang.String  _1H;
    private java.lang.String  _2E;
    private java.lang.String  _2U;
    private java.lang.String  _2H;
    private java.lang.String  _3E;
    private java.lang.String  _3U;
    private java.lang.String  _3H;
    private java.lang.String  _4E;
    private java.lang.String  _4U;
    private java.lang.String  _4H;
    private java.lang.String  _5E;
    private java.lang.String  _5U;
    private java.lang.String  _5H;
    private java.lang.String  _6E;
    private java.lang.String  _6U;
    private java.lang.String  _6H;
    private java.lang.String  _7E;
    private java.lang.String  _7U;
    private java.lang.String  _7H;

    public LineHours() {}

    public LineHours(LineHours value) {
        this.id = value.id;
        this.domainId = value.domainId;
        this.hourProfileId = value.hourProfileId;
        this.lineId = value.lineId;
        this._1E = value._1E;
        this._1U = value._1U;
        this._1H = value._1H;
        this._2E = value._2E;
        this._2U = value._2U;
        this._2H = value._2H;
        this._3E = value._3E;
        this._3U = value._3U;
        this._3H = value._3H;
        this._4E = value._4E;
        this._4U = value._4U;
        this._4H = value._4H;
        this._5E = value._5E;
        this._5U = value._5U;
        this._5H = value._5H;
        this._6E = value._6E;
        this._6U = value._6U;
        this._6H = value._6H;
        this._7E = value._7E;
        this._7U = value._7U;
        this._7H = value._7H;
    }

    public LineHours(
        java.lang.Integer id,
        java.lang.String  domainId,
        java.lang.Integer hourProfileId,
        java.lang.Integer lineId,
        java.lang.String  _1E,
        java.lang.String  _1U,
        java.lang.String  _1H,
        java.lang.String  _2E,
        java.lang.String  _2U,
        java.lang.String  _2H,
        java.lang.String  _3E,
        java.lang.String  _3U,
        java.lang.String  _3H,
        java.lang.String  _4E,
        java.lang.String  _4U,
        java.lang.String  _4H,
        java.lang.String  _5E,
        java.lang.String  _5U,
        java.lang.String  _5H,
        java.lang.String  _6E,
        java.lang.String  _6U,
        java.lang.String  _6H,
        java.lang.String  _7E,
        java.lang.String  _7U,
        java.lang.String  _7H
    ) {
        this.id = id;
        this.domainId = domainId;
        this.hourProfileId = hourProfileId;
        this.lineId = lineId;
        this._1E = _1E;
        this._1U = _1U;
        this._1H = _1H;
        this._2E = _2E;
        this._2U = _2U;
        this._2H = _2H;
        this._3E = _3E;
        this._3U = _3U;
        this._3H = _3H;
        this._4E = _4E;
        this._4U = _4U;
        this._4H = _4H;
        this._5E = _5E;
        this._5U = _5U;
        this._5H = _5H;
        this._6E = _6E;
        this._6U = _6U;
        this._6H = _6H;
        this._7E = _7E;
        this._7U = _7U;
        this._7H = _7H;
    }

    /**
     * Getter for <code>drm.line_hours.id</code>.
     */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>drm.line_hours.id</code>.
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>drm.line_hours.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>drm.line_hours.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>drm.line_hours.hour_profile_id</code>.
     */
    public java.lang.Integer getHourProfileId() {
        return this.hourProfileId;
    }

    /**
     * Setter for <code>drm.line_hours.hour_profile_id</code>.
     */
    public void setHourProfileId(java.lang.Integer hourProfileId) {
        this.hourProfileId = hourProfileId;
    }

    /**
     * Getter for <code>drm.line_hours.line_id</code>.
     */
    public java.lang.Integer getLineId() {
        return this.lineId;
    }

    /**
     * Setter for <code>drm.line_hours.line_id</code>.
     */
    public void setLineId(java.lang.Integer lineId) {
        this.lineId = lineId;
    }

    /**
     * Getter for <code>drm.line_hours.1_e</code>.
     */
    public java.lang.String get_1E() {
        return this._1E;
    }

    /**
     * Setter for <code>drm.line_hours.1_e</code>.
     */
    public void set_1E(java.lang.String _1E) {
        this._1E = _1E;
    }

    /**
     * Getter for <code>drm.line_hours.1_u</code>.
     */
    public java.lang.String get_1U() {
        return this._1U;
    }

    /**
     * Setter for <code>drm.line_hours.1_u</code>.
     */
    public void set_1U(java.lang.String _1U) {
        this._1U = _1U;
    }

    /**
     * Getter for <code>drm.line_hours.1_h</code>.
     */
    public java.lang.String get_1H() {
        return this._1H;
    }

    /**
     * Setter for <code>drm.line_hours.1_h</code>.
     */
    public void set_1H(java.lang.String _1H) {
        this._1H = _1H;
    }

    /**
     * Getter for <code>drm.line_hours.2_e</code>.
     */
    public java.lang.String get_2E() {
        return this._2E;
    }

    /**
     * Setter for <code>drm.line_hours.2_e</code>.
     */
    public void set_2E(java.lang.String _2E) {
        this._2E = _2E;
    }

    /**
     * Getter for <code>drm.line_hours.2_u</code>.
     */
    public java.lang.String get_2U() {
        return this._2U;
    }

    /**
     * Setter for <code>drm.line_hours.2_u</code>.
     */
    public void set_2U(java.lang.String _2U) {
        this._2U = _2U;
    }

    /**
     * Getter for <code>drm.line_hours.2_h</code>.
     */
    public java.lang.String get_2H() {
        return this._2H;
    }

    /**
     * Setter for <code>drm.line_hours.2_h</code>.
     */
    public void set_2H(java.lang.String _2H) {
        this._2H = _2H;
    }

    /**
     * Getter for <code>drm.line_hours.3_e</code>.
     */
    public java.lang.String get_3E() {
        return this._3E;
    }

    /**
     * Setter for <code>drm.line_hours.3_e</code>.
     */
    public void set_3E(java.lang.String _3E) {
        this._3E = _3E;
    }

    /**
     * Getter for <code>drm.line_hours.3_u</code>.
     */
    public java.lang.String get_3U() {
        return this._3U;
    }

    /**
     * Setter for <code>drm.line_hours.3_u</code>.
     */
    public void set_3U(java.lang.String _3U) {
        this._3U = _3U;
    }

    /**
     * Getter for <code>drm.line_hours.3_h</code>.
     */
    public java.lang.String get_3H() {
        return this._3H;
    }

    /**
     * Setter for <code>drm.line_hours.3_h</code>.
     */
    public void set_3H(java.lang.String _3H) {
        this._3H = _3H;
    }

    /**
     * Getter for <code>drm.line_hours.4_e</code>.
     */
    public java.lang.String get_4E() {
        return this._4E;
    }

    /**
     * Setter for <code>drm.line_hours.4_e</code>.
     */
    public void set_4E(java.lang.String _4E) {
        this._4E = _4E;
    }

    /**
     * Getter for <code>drm.line_hours.4_u</code>.
     */
    public java.lang.String get_4U() {
        return this._4U;
    }

    /**
     * Setter for <code>drm.line_hours.4_u</code>.
     */
    public void set_4U(java.lang.String _4U) {
        this._4U = _4U;
    }

    /**
     * Getter for <code>drm.line_hours.4_h</code>.
     */
    public java.lang.String get_4H() {
        return this._4H;
    }

    /**
     * Setter for <code>drm.line_hours.4_h</code>.
     */
    public void set_4H(java.lang.String _4H) {
        this._4H = _4H;
    }

    /**
     * Getter for <code>drm.line_hours.5_e</code>.
     */
    public java.lang.String get_5E() {
        return this._5E;
    }

    /**
     * Setter for <code>drm.line_hours.5_e</code>.
     */
    public void set_5E(java.lang.String _5E) {
        this._5E = _5E;
    }

    /**
     * Getter for <code>drm.line_hours.5_u</code>.
     */
    public java.lang.String get_5U() {
        return this._5U;
    }

    /**
     * Setter for <code>drm.line_hours.5_u</code>.
     */
    public void set_5U(java.lang.String _5U) {
        this._5U = _5U;
    }

    /**
     * Getter for <code>drm.line_hours.5_h</code>.
     */
    public java.lang.String get_5H() {
        return this._5H;
    }

    /**
     * Setter for <code>drm.line_hours.5_h</code>.
     */
    public void set_5H(java.lang.String _5H) {
        this._5H = _5H;
    }

    /**
     * Getter for <code>drm.line_hours.6_e</code>.
     */
    public java.lang.String get_6E() {
        return this._6E;
    }

    /**
     * Setter for <code>drm.line_hours.6_e</code>.
     */
    public void set_6E(java.lang.String _6E) {
        this._6E = _6E;
    }

    /**
     * Getter for <code>drm.line_hours.6_u</code>.
     */
    public java.lang.String get_6U() {
        return this._6U;
    }

    /**
     * Setter for <code>drm.line_hours.6_u</code>.
     */
    public void set_6U(java.lang.String _6U) {
        this._6U = _6U;
    }

    /**
     * Getter for <code>drm.line_hours.6_h</code>.
     */
    public java.lang.String get_6H() {
        return this._6H;
    }

    /**
     * Setter for <code>drm.line_hours.6_h</code>.
     */
    public void set_6H(java.lang.String _6H) {
        this._6H = _6H;
    }

    /**
     * Getter for <code>drm.line_hours.7_e</code>.
     */
    public java.lang.String get_7E() {
        return this._7E;
    }

    /**
     * Setter for <code>drm.line_hours.7_e</code>.
     */
    public void set_7E(java.lang.String _7E) {
        this._7E = _7E;
    }

    /**
     * Getter for <code>drm.line_hours.7_u</code>.
     */
    public java.lang.String get_7U() {
        return this._7U;
    }

    /**
     * Setter for <code>drm.line_hours.7_u</code>.
     */
    public void set_7U(java.lang.String _7U) {
        this._7U = _7U;
    }

    /**
     * Getter for <code>drm.line_hours.7_h</code>.
     */
    public java.lang.String get_7H() {
        return this._7H;
    }

    /**
     * Setter for <code>drm.line_hours.7_h</code>.
     */
    public void set_7H(java.lang.String _7H) {
        this._7H = _7H;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineHours (");

        sb.append(id);
        sb.append(", ").append(domainId);
        sb.append(", ").append(hourProfileId);
        sb.append(", ").append(lineId);
        sb.append(", ").append(_1E);
        sb.append(", ").append(_1U);
        sb.append(", ").append(_1H);
        sb.append(", ").append(_2E);
        sb.append(", ").append(_2U);
        sb.append(", ").append(_2H);
        sb.append(", ").append(_3E);
        sb.append(", ").append(_3U);
        sb.append(", ").append(_3H);
        sb.append(", ").append(_4E);
        sb.append(", ").append(_4U);
        sb.append(", ").append(_4H);
        sb.append(", ").append(_5E);
        sb.append(", ").append(_5U);
        sb.append(", ").append(_5H);
        sb.append(", ").append(_6E);
        sb.append(", ").append(_6U);
        sb.append(", ").append(_6H);
        sb.append(", ").append(_7E);
        sb.append(", ").append(_7U);
        sb.append(", ").append(_7H);

        sb.append(")");
        return sb.toString();
    }
}
