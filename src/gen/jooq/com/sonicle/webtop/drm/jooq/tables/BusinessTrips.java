/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessTrips extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.business_trips</code>
     */
    public static final BusinessTrips BUSINESS_TRIPS = new BusinessTrips();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord.class;
    }

    /**
     * The column <code>drm.business_trips.business_trip_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord, java.lang.Integer> BUSINESS_TRIP_ID = createField(org.jooq.impl.DSL.name("business_trip_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('drm.seq_business_trips'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>drm.business_trips.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>drm.business_trips.revision_status</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord, java.lang.String> REVISION_STATUS = createField(org.jooq.impl.DSL.name("revision_status"), org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>drm.business_trips.external_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord, java.lang.String> EXTERNAL_ID = createField(org.jooq.impl.DSL.name("external_id"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.business_trips.description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord, java.lang.String> DESCRIPTION = createField(org.jooq.impl.DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    private BusinessTrips(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord> aliased) {
        this(alias, aliased, null);
    }

    private BusinessTrips(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.business_trips</code> table reference
     */
    public BusinessTrips(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), BUSINESS_TRIPS);
    }

    /**
     * Create an aliased <code>drm.business_trips</code> table reference
     */
    public BusinessTrips(org.jooq.Name alias) {
        this(alias, BUSINESS_TRIPS);
    }

    /**
     * Create a <code>drm.business_trips</code> table reference
     */
    public BusinessTrips() {
        this(org.jooq.impl.DSL.name("business_trips"), null);
    }

    public <O extends org.jooq.Record> BusinessTrips(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord> key) {
        super(child, key, BUSINESS_TRIPS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.BUSINESS_TRIPS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.BUSINESS_TRIPS_PKEY);
    }

    @java.lang.Override
    public BusinessTrips as(java.lang.String alias) {
        return new BusinessTrips(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public BusinessTrips as(org.jooq.Name alias) {
        return new BusinessTrips(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public BusinessTrips rename(java.lang.String name) {
        return new BusinessTrips(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public BusinessTrips rename(org.jooq.Name name) {
        return new BusinessTrips(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row5) super.fieldsRow();
    }
}
