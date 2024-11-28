/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LeaveRequests extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.leave_requests</code>
     */
    public static final LeaveRequests LEAVE_REQUESTS = new LeaveRequests();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord.class;
    }

    /**
     * The column <code>drm.leave_requests.leave_request_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.Integer> LEAVE_REQUEST_ID = createField(org.jooq.impl.DSL.name("leave_request_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.leave_requests.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>drm.leave_requests.company_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.Integer> COMPANY_ID = createField(org.jooq.impl.DSL.name("company_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>drm.leave_requests.user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.String> USER_ID = createField(org.jooq.impl.DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.leave_requests.manager_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.String> MANAGER_ID = createField(org.jooq.impl.DSL.name("manager_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>drm.leave_requests.type</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.String> TYPE = createField(org.jooq.impl.DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>drm.leave_requests.from_date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, org.joda.time.LocalDate> FROM_DATE = createField(org.jooq.impl.DSL.name("from_date"), org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "", new com.sonicle.jooq.jsr310.LocalDateJodaConverter());

    /**
     * The column <code>drm.leave_requests.to_date</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, org.joda.time.LocalDate> TO_DATE = createField(org.jooq.impl.DSL.name("to_date"), org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "", new com.sonicle.jooq.jsr310.LocalDateJodaConverter());

    /**
     * The column <code>drm.leave_requests.from_hour</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.String> FROM_HOUR = createField(org.jooq.impl.DSL.name("from_hour"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.leave_requests.to_hour</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.String> TO_HOUR = createField(org.jooq.impl.DSL.name("to_hour"), org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>drm.leave_requests.status</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.String> STATUS = createField(org.jooq.impl.DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>drm.leave_requests.notes</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.String> NOTES = createField(org.jooq.impl.DSL.name("notes"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>drm.leave_requests.employee_req_timestamp</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, org.joda.time.DateTime> EMPLOYEE_REQ_TIMESTAMP = createField(org.jooq.impl.DSL.name("employee_req_timestamp"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "", new com.sonicle.jooq.jsr310.OffsetDateTimeJodaConverter());

    /**
     * The column <code>drm.leave_requests.manager_resp_timestamp</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, org.joda.time.DateTime> MANAGER_RESP_TIMESTAMP = createField(org.jooq.impl.DSL.name("manager_resp_timestamp"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "", new com.sonicle.jooq.jsr310.OffsetDateTimeJodaConverter());

    /**
     * The column <code>drm.leave_requests.result</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.Boolean> RESULT = createField(org.jooq.impl.DSL.name("result"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.leave_requests.employee_canc_req</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.Boolean> EMPLOYEE_CANC_REQ = createField(org.jooq.impl.DSL.name("employee_canc_req"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.leave_requests.employee_canc_req_timestamp</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, org.joda.time.DateTime> EMPLOYEE_CANC_REQ_TIMESTAMP = createField(org.jooq.impl.DSL.name("employee_canc_req_timestamp"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "", new com.sonicle.jooq.jsr310.OffsetDateTimeJodaConverter());

    /**
     * The column <code>drm.leave_requests.manager_canc_resp_timetamp</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, org.joda.time.DateTime> MANAGER_CANC_RESP_TIMETAMP = createField(org.jooq.impl.DSL.name("manager_canc_resp_timetamp"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "", new com.sonicle.jooq.jsr310.OffsetDateTimeJodaConverter());

    /**
     * The column <code>drm.leave_requests.canc_reason</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.String> CANC_REASON = createField(org.jooq.impl.DSL.name("canc_reason"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>drm.leave_requests.canc_result</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.Boolean> CANC_RESULT = createField(org.jooq.impl.DSL.name("canc_result"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>drm.leave_requests.event_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord, java.lang.String> EVENT_ID = createField(org.jooq.impl.DSL.name("event_id"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    private LeaveRequests(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord> aliased) {
        this(alias, aliased, null);
    }

    private LeaveRequests(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.leave_requests</code> table reference
     */
    public LeaveRequests(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), LEAVE_REQUESTS);
    }

    /**
     * Create an aliased <code>drm.leave_requests</code> table reference
     */
    public LeaveRequests(org.jooq.Name alias) {
        this(alias, LEAVE_REQUESTS);
    }

    /**
     * Create a <code>drm.leave_requests</code> table reference
     */
    public LeaveRequests() {
        this(org.jooq.impl.DSL.name("leave_requests"), null);
    }

    public <O extends org.jooq.Record> LeaveRequests(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord> key) {
        super(child, key, LEAVE_REQUESTS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.LEAVE_REQUESTS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.LeaveRequestsRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.LEAVE_REQUESTS_PKEY);
    }

    @java.lang.Override
    public LeaveRequests as(java.lang.String alias) {
        return new LeaveRequests(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public LeaveRequests as(org.jooq.Name alias) {
        return new LeaveRequests(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public LeaveRequests rename(java.lang.String name) {
        return new LeaveRequests(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public LeaveRequests rename(org.jooq.Name name) {
        return new LeaveRequests(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row21<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, org.joda.time.LocalDate, org.joda.time.LocalDate, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.Boolean, java.lang.Boolean, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, java.lang.Boolean, java.lang.String> fieldsRow() {
        return (org.jooq.Row21) super.fieldsRow();
    }
}
