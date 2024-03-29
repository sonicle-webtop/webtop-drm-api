/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Companies extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>drm.companies</code>
     */
    public static final Companies COMPANIES = new Companies();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord> getRecordType() {
        return com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord.class;
    }

    /**
     * The column <code>drm.companies.company_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.Integer> COMPANY_ID = createField(org.jooq.impl.DSL.name("company_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('drm.seq_companies'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>drm.companies.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>drm.companies.name</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> NAME = createField(org.jooq.impl.DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>drm.companies.address</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> ADDRESS = createField(org.jooq.impl.DSL.name("address"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.companies.postal_code</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> POSTAL_CODE = createField(org.jooq.impl.DSL.name("postal_code"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>drm.companies.city</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> CITY = createField(org.jooq.impl.DSL.name("city"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.companies.state</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> STATE = createField(org.jooq.impl.DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>drm.companies.phone</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> PHONE = createField(org.jooq.impl.DSL.name("phone"), org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>drm.companies.fax</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> FAX = createField(org.jooq.impl.DSL.name("fax"), org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>drm.companies.vat</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> VAT = createField(org.jooq.impl.DSL.name("vat"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>drm.companies.tax_code</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> TAX_CODE = createField(org.jooq.impl.DSL.name("tax_code"), org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>drm.companies.rea</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> REA = createField(org.jooq.impl.DSL.name("rea"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>drm.companies.business_register</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> BUSINESS_REGISTER = createField(org.jooq.impl.DSL.name("business_register"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>drm.companies.revision_status</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> REVISION_STATUS = createField(org.jooq.impl.DSL.name("revision_status"), org.jooq.impl.SQLDataType.CHAR(1), this, "");

    /**
     * The column <code>drm.companies.footer_columns</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> FOOTER_COLUMNS = createField(org.jooq.impl.DSL.name("footer_columns"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>drm.companies.footer_column_left</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> FOOTER_COLUMN_LEFT = createField(org.jooq.impl.DSL.name("footer_column_left"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>drm.companies.footer_column_right</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord, java.lang.String> FOOTER_COLUMN_RIGHT = createField(org.jooq.impl.DSL.name("footer_column_right"), org.jooq.impl.SQLDataType.CLOB, this, "");

    private Companies(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Companies(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>drm.companies</code> table reference
     */
    public Companies(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), COMPANIES);
    }

    /**
     * Create an aliased <code>drm.companies</code> table reference
     */
    public Companies(org.jooq.Name alias) {
        this(alias, COMPANIES);
    }

    /**
     * Create a <code>drm.companies</code> table reference
     */
    public Companies() {
        this(org.jooq.impl.DSL.name("companies"), null);
    }

    public <O extends org.jooq.Record> Companies(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord> key) {
        super(child, key, COMPANIES);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.drm.jooq.Drm.DRM;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord> getPrimaryKey() {
        return com.sonicle.webtop.drm.jooq.Keys.COMPANIES_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.CompaniesRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.COMPANIES_PKEY);
    }

    @java.lang.Override
    public Companies as(java.lang.String alias) {
        return new Companies(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public Companies as(org.jooq.Name alias) {
        return new Companies(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public Companies rename(java.lang.String name) {
        return new Companies(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public Companies rename(org.jooq.Name name) {
        return new Companies(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row17<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row17) super.fieldsRow();
    }
}
