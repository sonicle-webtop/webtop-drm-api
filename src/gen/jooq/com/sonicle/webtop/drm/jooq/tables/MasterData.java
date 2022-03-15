/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MasterData extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>core.master_data</code>
     */
    public static final MasterData MASTER_DATA = new MasterData();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord.class;
    }

    /**
     * The column <code>core.master_data.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>core.master_data.master_data_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> MASTER_DATA_ID = createField(org.jooq.impl.DSL.name("master_data_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>core.master_data.parent_master_data_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> PARENT_MASTER_DATA_ID = createField(org.jooq.impl.DSL.name("parent_master_data_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>core.master_data.external_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> EXTERNAL_ID = createField(org.jooq.impl.DSL.name("external_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>core.master_data.type</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> TYPE = createField(org.jooq.impl.DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>core.master_data.revision_status</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> REVISION_STATUS = createField(org.jooq.impl.DSL.name("revision_status"), org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>core.master_data.revision_timestamp</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, org.joda.time.DateTime> REVISION_TIMESTAMP = createField(org.jooq.impl.DSL.name("revision_timestamp"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "", new com.sonicle.jooq.jsr310.OffsetDateTimeJodaConverter());

    /**
     * The column <code>core.master_data.revision_sequence</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.Integer> REVISION_SEQUENCE = createField(org.jooq.impl.DSL.name("revision_sequence"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>core.master_data.lock_status</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> LOCK_STATUS = createField(org.jooq.impl.DSL.name("lock_status"), org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>core.master_data.description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> DESCRIPTION = createField(org.jooq.impl.DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>core.master_data.address</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> ADDRESS = createField(org.jooq.impl.DSL.name("address"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>core.master_data.city</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> CITY = createField(org.jooq.impl.DSL.name("city"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>core.master_data.postal_code</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> POSTAL_CODE = createField(org.jooq.impl.DSL.name("postal_code"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>core.master_data.state</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> STATE = createField(org.jooq.impl.DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>core.master_data.country</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> COUNTRY = createField(org.jooq.impl.DSL.name("country"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>core.master_data.telephone</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> TELEPHONE = createField(org.jooq.impl.DSL.name("telephone"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>core.master_data.fax</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> FAX = createField(org.jooq.impl.DSL.name("fax"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>core.master_data.mobile</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> MOBILE = createField(org.jooq.impl.DSL.name("mobile"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>core.master_data.email</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> EMAIL = createField(org.jooq.impl.DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(320), this, "");

    /**
     * The column <code>core.master_data.notes</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.String> NOTES = createField(org.jooq.impl.DSL.name("notes"), org.jooq.impl.SQLDataType.VARCHAR(2000), this, "");

    /**
     * The column <code>core.master_data.distance</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord, java.lang.Integer> DISTANCE = createField(org.jooq.impl.DSL.name("distance"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    private MasterData(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private MasterData(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>core.master_data</code> table reference
     */
    public MasterData(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), MASTER_DATA);
    }

    /**
     * Create an aliased <code>core.master_data</code> table reference
     */
    public MasterData(org.jooq.Name alias) {
        this(alias, MASTER_DATA);
    }

    /**
     * Create a <code>core.master_data</code> table reference
     */
    public MasterData() {
        this(org.jooq.impl.DSL.name("master_data"), null);
    }

    public <O extends org.jooq.Record> MasterData(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord> key) {
        super(child, key, MASTER_DATA);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Core.CORE;
    }

    @java.lang.Override
    public java.util.List<org.jooq.Index> getIndexes() {
        return java.util.Arrays.<org.jooq.Index>asList(com.sonicle.webtop.drm.jooq.Indexes.MASTER_DATA_AK1, com.sonicle.webtop.drm.jooq.Indexes.MASTER_DATA_AK2, com.sonicle.webtop.drm.jooq.Indexes.MASTER_DATA_AK3);
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.MASTER_DATA_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.MasterDataRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.MASTER_DATA_PKEY);
    }

    @java.lang.Override
    public MasterData as(java.lang.String alias) {
        return new MasterData(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public MasterData as(org.jooq.Name alias) {
        return new MasterData(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public MasterData rename(java.lang.String name) {
        return new MasterData(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public MasterData rename(org.jooq.Name name) {
        return new MasterData(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row21<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
        return (org.jooq.Row21) super.fieldsRow();
    }
}
