/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfilesMembers implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer id;
    private java.lang.String  profileId;
    private java.lang.String  userId;

    public ProfilesMembers() {}

    public ProfilesMembers(ProfilesMembers value) {
        this.id = value.id;
        this.profileId = value.profileId;
        this.userId = value.userId;
    }

    public ProfilesMembers(
        java.lang.Integer id,
        java.lang.String  profileId,
        java.lang.String  userId
    ) {
        this.id = id;
        this.profileId = profileId;
        this.userId = userId;
    }

    /**
     * Getter for <code>drm.profiles_members.id</code>.
     */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>drm.profiles_members.id</code>.
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>drm.profiles_members.profile_id</code>.
     */
    public java.lang.String getProfileId() {
        return this.profileId;
    }

    /**
     * Setter for <code>drm.profiles_members.profile_id</code>.
     */
    public void setProfileId(java.lang.String profileId) {
        this.profileId = profileId;
    }

    /**
     * Getter for <code>drm.profiles_members.user_id</code>.
     */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>drm.profiles_members.user_id</code>.
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfilesMembers (");

        sb.append(id);
        sb.append(", ").append(profileId);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }
}
