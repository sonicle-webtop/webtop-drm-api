/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Syslog implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Long         syslogId;
    private org.joda.time.DateTime timestamp;
    private java.lang.String       domainId;
    private java.lang.String       userId;
    private java.lang.String       serviceId;
    private java.lang.String       action;
    private java.lang.String       swName;
    private java.lang.String       ipAddress;
    private java.lang.String       userAgent;
    private java.lang.String       sessionId;
    private java.lang.String       data;

    public Syslog() {}

    public Syslog(Syslog value) {
        this.syslogId = value.syslogId;
        this.timestamp = value.timestamp;
        this.domainId = value.domainId;
        this.userId = value.userId;
        this.serviceId = value.serviceId;
        this.action = value.action;
        this.swName = value.swName;
        this.ipAddress = value.ipAddress;
        this.userAgent = value.userAgent;
        this.sessionId = value.sessionId;
        this.data = value.data;
    }

    public Syslog(
        java.lang.Long         syslogId,
        org.joda.time.DateTime timestamp,
        java.lang.String       domainId,
        java.lang.String       userId,
        java.lang.String       serviceId,
        java.lang.String       action,
        java.lang.String       swName,
        java.lang.String       ipAddress,
        java.lang.String       userAgent,
        java.lang.String       sessionId,
        java.lang.String       data
    ) {
        this.syslogId = syslogId;
        this.timestamp = timestamp;
        this.domainId = domainId;
        this.userId = userId;
        this.serviceId = serviceId;
        this.action = action;
        this.swName = swName;
        this.ipAddress = ipAddress;
        this.userAgent = userAgent;
        this.sessionId = sessionId;
        this.data = data;
    }

    /**
     * Getter for <code>core.syslog.syslog_id</code>.
     */
    public java.lang.Long getSyslogId() {
        return this.syslogId;
    }

    /**
     * Setter for <code>core.syslog.syslog_id</code>.
     */
    public void setSyslogId(java.lang.Long syslogId) {
        this.syslogId = syslogId;
    }

    /**
     * Getter for <code>core.syslog.timestamp</code>.
     */
    public org.joda.time.DateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Setter for <code>core.syslog.timestamp</code>.
     */
    public void setTimestamp(org.joda.time.DateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for <code>core.syslog.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>core.syslog.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>core.syslog.user_id</code>.
     */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>core.syslog.user_id</code>.
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>core.syslog.service_id</code>.
     */
    public java.lang.String getServiceId() {
        return this.serviceId;
    }

    /**
     * Setter for <code>core.syslog.service_id</code>.
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * Getter for <code>core.syslog.action</code>.
     */
    public java.lang.String getAction() {
        return this.action;
    }

    /**
     * Setter for <code>core.syslog.action</code>.
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    /**
     * Getter for <code>core.syslog.sw_name</code>.
     */
    public java.lang.String getSwName() {
        return this.swName;
    }

    /**
     * Setter for <code>core.syslog.sw_name</code>.
     */
    public void setSwName(java.lang.String swName) {
        this.swName = swName;
    }

    /**
     * Getter for <code>core.syslog.ip_address</code>.
     */
    public java.lang.String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Setter for <code>core.syslog.ip_address</code>.
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Getter for <code>core.syslog.user_agent</code>.
     */
    public java.lang.String getUserAgent() {
        return this.userAgent;
    }

    /**
     * Setter for <code>core.syslog.user_agent</code>.
     */
    public void setUserAgent(java.lang.String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * Getter for <code>core.syslog.session_id</code>.
     */
    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    /**
     * Setter for <code>core.syslog.session_id</code>.
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * Getter for <code>core.syslog.data</code>.
     */
    public java.lang.String getData() {
        return this.data;
    }

    /**
     * Setter for <code>core.syslog.data</code>.
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Syslog (");

        sb.append(syslogId);
        sb.append(", ").append(timestamp);
        sb.append(", ").append(domainId);
        sb.append(", ").append(userId);
        sb.append(", ").append(serviceId);
        sb.append(", ").append(action);
        sb.append(", ").append(swName);
        sb.append(", ").append(ipAddress);
        sb.append(", ").append(userAgent);
        sb.append(", ").append(sessionId);
        sb.append(", ").append(data);

        sb.append(")");
        return sb.toString();
    }
}
