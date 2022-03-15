/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MasterDataRecord extends org.jooq.impl.UpdatableRecordImpl<MasterDataRecord> implements org.jooq.Record21<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>core.master_data.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>core.master_data.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>core.master_data.master_data_id</code>.
     */
    public void setMasterDataId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>core.master_data.master_data_id</code>.
     */
    public java.lang.String getMasterDataId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>core.master_data.parent_master_data_id</code>.
     */
    public void setParentMasterDataId(java.lang.String value) {
        set(2, value);
    }

    /**
     * Getter for <code>core.master_data.parent_master_data_id</code>.
     */
    public java.lang.String getParentMasterDataId() {
        return (java.lang.String) get(2);
    }

    /**
     * Setter for <code>core.master_data.external_id</code>.
     */
    public void setExternalId(java.lang.String value) {
        set(3, value);
    }

    /**
     * Getter for <code>core.master_data.external_id</code>.
     */
    public java.lang.String getExternalId() {
        return (java.lang.String) get(3);
    }

    /**
     * Setter for <code>core.master_data.type</code>.
     */
    public void setType(java.lang.String value) {
        set(4, value);
    }

    /**
     * Getter for <code>core.master_data.type</code>.
     */
    public java.lang.String getType() {
        return (java.lang.String) get(4);
    }

    /**
     * Setter for <code>core.master_data.revision_status</code>.
     */
    public void setRevisionStatus(java.lang.String value) {
        set(5, value);
    }

    /**
     * Getter for <code>core.master_data.revision_status</code>.
     */
    public java.lang.String getRevisionStatus() {
        return (java.lang.String) get(5);
    }

    /**
     * Setter for <code>core.master_data.revision_timestamp</code>.
     */
    public void setRevisionTimestamp(org.joda.time.DateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>core.master_data.revision_timestamp</code>.
     */
    public org.joda.time.DateTime getRevisionTimestamp() {
        return (org.joda.time.DateTime) get(6);
    }

    /**
     * Setter for <code>core.master_data.revision_sequence</code>.
     */
    public void setRevisionSequence(java.lang.Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>core.master_data.revision_sequence</code>.
     */
    public java.lang.Integer getRevisionSequence() {
        return (java.lang.Integer) get(7);
    }

    /**
     * Setter for <code>core.master_data.lock_status</code>.
     */
    public void setLockStatus(java.lang.String value) {
        set(8, value);
    }

    /**
     * Getter for <code>core.master_data.lock_status</code>.
     */
    public java.lang.String getLockStatus() {
        return (java.lang.String) get(8);
    }

    /**
     * Setter for <code>core.master_data.description</code>.
     */
    public void setDescription(java.lang.String value) {
        set(9, value);
    }

    /**
     * Getter for <code>core.master_data.description</code>.
     */
    public java.lang.String getDescription() {
        return (java.lang.String) get(9);
    }

    /**
     * Setter for <code>core.master_data.address</code>.
     */
    public void setAddress(java.lang.String value) {
        set(10, value);
    }

    /**
     * Getter for <code>core.master_data.address</code>.
     */
    public java.lang.String getAddress() {
        return (java.lang.String) get(10);
    }

    /**
     * Setter for <code>core.master_data.city</code>.
     */
    public void setCity(java.lang.String value) {
        set(11, value);
    }

    /**
     * Getter for <code>core.master_data.city</code>.
     */
    public java.lang.String getCity() {
        return (java.lang.String) get(11);
    }

    /**
     * Setter for <code>core.master_data.postal_code</code>.
     */
    public void setPostalCode(java.lang.String value) {
        set(12, value);
    }

    /**
     * Getter for <code>core.master_data.postal_code</code>.
     */
    public java.lang.String getPostalCode() {
        return (java.lang.String) get(12);
    }

    /**
     * Setter for <code>core.master_data.state</code>.
     */
    public void setState(java.lang.String value) {
        set(13, value);
    }

    /**
     * Getter for <code>core.master_data.state</code>.
     */
    public java.lang.String getState() {
        return (java.lang.String) get(13);
    }

    /**
     * Setter for <code>core.master_data.country</code>.
     */
    public void setCountry(java.lang.String value) {
        set(14, value);
    }

    /**
     * Getter for <code>core.master_data.country</code>.
     */
    public java.lang.String getCountry() {
        return (java.lang.String) get(14);
    }

    /**
     * Setter for <code>core.master_data.telephone</code>.
     */
    public void setTelephone(java.lang.String value) {
        set(15, value);
    }

    /**
     * Getter for <code>core.master_data.telephone</code>.
     */
    public java.lang.String getTelephone() {
        return (java.lang.String) get(15);
    }

    /**
     * Setter for <code>core.master_data.fax</code>.
     */
    public void setFax(java.lang.String value) {
        set(16, value);
    }

    /**
     * Getter for <code>core.master_data.fax</code>.
     */
    public java.lang.String getFax() {
        return (java.lang.String) get(16);
    }

    /**
     * Setter for <code>core.master_data.mobile</code>.
     */
    public void setMobile(java.lang.String value) {
        set(17, value);
    }

    /**
     * Getter for <code>core.master_data.mobile</code>.
     */
    public java.lang.String getMobile() {
        return (java.lang.String) get(17);
    }

    /**
     * Setter for <code>core.master_data.email</code>.
     */
    public void setEmail(java.lang.String value) {
        set(18, value);
    }

    /**
     * Getter for <code>core.master_data.email</code>.
     */
    public java.lang.String getEmail() {
        return (java.lang.String) get(18);
    }

    /**
     * Setter for <code>core.master_data.notes</code>.
     */
    public void setNotes(java.lang.String value) {
        set(19, value);
    }

    /**
     * Getter for <code>core.master_data.notes</code>.
     */
    public java.lang.String getNotes() {
        return (java.lang.String) get(19);
    }

    /**
     * Setter for <code>core.master_data.distance</code>.
     */
    public void setDistance(java.lang.Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>core.master_data.distance</code>.
     */
    public java.lang.Integer getDistance() {
        return (java.lang.Integer) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record2<java.lang.String, java.lang.String> key() {
        return (org.jooq.Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row21<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
        return (org.jooq.Row21) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row21<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
        return (org.jooq.Row21) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.MASTER_DATA_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field3() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.PARENT_MASTER_DATA_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field4() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.EXTERNAL_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field5() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.TYPE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field6() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.REVISION_STATUS;
    }

    @java.lang.Override
    public org.jooq.Field<org.joda.time.DateTime> field7() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.REVISION_TIMESTAMP;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field8() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.REVISION_SEQUENCE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field9() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.LOCK_STATUS;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field10() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.DESCRIPTION;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field11() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.ADDRESS;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field12() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.CITY;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field13() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.POSTAL_CODE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field14() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.STATE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field15() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.COUNTRY;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field16() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.TELEPHONE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field17() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.FAX;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field18() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.MOBILE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field19() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.EMAIL;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field20() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.NOTES;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Integer> field21() {
        return com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA.DISTANCE;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getMasterDataId();
    }

    @java.lang.Override
    public java.lang.String component3() {
        return getParentMasterDataId();
    }

    @java.lang.Override
    public java.lang.String component4() {
        return getExternalId();
    }

    @java.lang.Override
    public java.lang.String component5() {
        return getType();
    }

    @java.lang.Override
    public java.lang.String component6() {
        return getRevisionStatus();
    }

    @java.lang.Override
    public org.joda.time.DateTime component7() {
        return getRevisionTimestamp();
    }

    @java.lang.Override
    public java.lang.Integer component8() {
        return getRevisionSequence();
    }

    @java.lang.Override
    public java.lang.String component9() {
        return getLockStatus();
    }

    @java.lang.Override
    public java.lang.String component10() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.String component11() {
        return getAddress();
    }

    @java.lang.Override
    public java.lang.String component12() {
        return getCity();
    }

    @java.lang.Override
    public java.lang.String component13() {
        return getPostalCode();
    }

    @java.lang.Override
    public java.lang.String component14() {
        return getState();
    }

    @java.lang.Override
    public java.lang.String component15() {
        return getCountry();
    }

    @java.lang.Override
    public java.lang.String component16() {
        return getTelephone();
    }

    @java.lang.Override
    public java.lang.String component17() {
        return getFax();
    }

    @java.lang.Override
    public java.lang.String component18() {
        return getMobile();
    }

    @java.lang.Override
    public java.lang.String component19() {
        return getEmail();
    }

    @java.lang.Override
    public java.lang.String component20() {
        return getNotes();
    }

    @java.lang.Override
    public java.lang.Integer component21() {
        return getDistance();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getMasterDataId();
    }

    @java.lang.Override
    public java.lang.String value3() {
        return getParentMasterDataId();
    }

    @java.lang.Override
    public java.lang.String value4() {
        return getExternalId();
    }

    @java.lang.Override
    public java.lang.String value5() {
        return getType();
    }

    @java.lang.Override
    public java.lang.String value6() {
        return getRevisionStatus();
    }

    @java.lang.Override
    public org.joda.time.DateTime value7() {
        return getRevisionTimestamp();
    }

    @java.lang.Override
    public java.lang.Integer value8() {
        return getRevisionSequence();
    }

    @java.lang.Override
    public java.lang.String value9() {
        return getLockStatus();
    }

    @java.lang.Override
    public java.lang.String value10() {
        return getDescription();
    }

    @java.lang.Override
    public java.lang.String value11() {
        return getAddress();
    }

    @java.lang.Override
    public java.lang.String value12() {
        return getCity();
    }

    @java.lang.Override
    public java.lang.String value13() {
        return getPostalCode();
    }

    @java.lang.Override
    public java.lang.String value14() {
        return getState();
    }

    @java.lang.Override
    public java.lang.String value15() {
        return getCountry();
    }

    @java.lang.Override
    public java.lang.String value16() {
        return getTelephone();
    }

    @java.lang.Override
    public java.lang.String value17() {
        return getFax();
    }

    @java.lang.Override
    public java.lang.String value18() {
        return getMobile();
    }

    @java.lang.Override
    public java.lang.String value19() {
        return getEmail();
    }

    @java.lang.Override
    public java.lang.String value20() {
        return getNotes();
    }

    @java.lang.Override
    public java.lang.Integer value21() {
        return getDistance();
    }

    @java.lang.Override
    public MasterDataRecord value1(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value2(java.lang.String value) {
        setMasterDataId(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value3(java.lang.String value) {
        setParentMasterDataId(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value4(java.lang.String value) {
        setExternalId(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value5(java.lang.String value) {
        setType(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value6(java.lang.String value) {
        setRevisionStatus(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value7(org.joda.time.DateTime value) {
        setRevisionTimestamp(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value8(java.lang.Integer value) {
        setRevisionSequence(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value9(java.lang.String value) {
        setLockStatus(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value10(java.lang.String value) {
        setDescription(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value11(java.lang.String value) {
        setAddress(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value12(java.lang.String value) {
        setCity(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value13(java.lang.String value) {
        setPostalCode(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value14(java.lang.String value) {
        setState(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value15(java.lang.String value) {
        setCountry(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value16(java.lang.String value) {
        setTelephone(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value17(java.lang.String value) {
        setFax(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value18(java.lang.String value) {
        setMobile(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value19(java.lang.String value) {
        setEmail(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value20(java.lang.String value) {
        setNotes(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord value21(java.lang.Integer value) {
        setDistance(value);
        return this;
    }

    @java.lang.Override
    public MasterDataRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, org.joda.time.DateTime value7, java.lang.Integer value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.lang.String value12, java.lang.String value13, java.lang.String value14, java.lang.String value15, java.lang.String value16, java.lang.String value17, java.lang.String value18, java.lang.String value19, java.lang.String value20, java.lang.Integer value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MasterDataRecord
     */
    public MasterDataRecord() {
        super(com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA);
    }

    /**
     * Create a detached, initialised MasterDataRecord
     */
    public MasterDataRecord(java.lang.String domainId, java.lang.String masterDataId, java.lang.String parentMasterDataId, java.lang.String externalId, java.lang.String type, java.lang.String revisionStatus, org.joda.time.DateTime revisionTimestamp, java.lang.Integer revisionSequence, java.lang.String lockStatus, java.lang.String description, java.lang.String address, java.lang.String city, java.lang.String postalCode, java.lang.String state, java.lang.String country, java.lang.String telephone, java.lang.String fax, java.lang.String mobile, java.lang.String email, java.lang.String notes, java.lang.Integer distance) {
        super(com.sonicle.webtop.drm.jooq.tables.MasterData.MASTER_DATA);

        setDomainId(domainId);
        setMasterDataId(masterDataId);
        setParentMasterDataId(parentMasterDataId);
        setExternalId(externalId);
        setType(type);
        setRevisionStatus(revisionStatus);
        setRevisionTimestamp(revisionTimestamp);
        setRevisionSequence(revisionSequence);
        setLockStatus(lockStatus);
        setDescription(description);
        setAddress(address);
        setCity(city);
        setPostalCode(postalCode);
        setState(state);
        setCountry(country);
        setTelephone(telephone);
        setFax(fax);
        setMobile(mobile);
        setEmail(email);
        setNotes(notes);
        setDistance(distance);
    }
}
