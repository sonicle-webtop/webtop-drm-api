/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Domains implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String  domainId;
    private java.lang.String  internetName;
    private java.lang.Boolean enabled;
    private java.lang.String  description;
    private java.lang.Boolean userAutoCreation;
    private java.lang.String  dirUri;
    private java.lang.String  dirAdmin;
    private java.lang.String  dirPassword;
    private java.lang.String  dirConnectionSecurity;
    private java.lang.Boolean dirCaseSensitive;
    private java.lang.Boolean dirPasswordPolicy;
    private java.lang.String  dirParameters;
    private java.lang.Boolean dirPwdPolicyComplexity;
    private java.lang.Short   dirPwdPolicyMinLength;
    private java.lang.Boolean dirPwdPolicyAvoidConsecutiveChars;
    private java.lang.Boolean dirPwdPolicyAvoidOldSimilarity;
    private java.lang.Boolean dirPwdPolicyAvoidUsernameSimilarity;
    private java.lang.Short   dirPwdPolicyExpiration;
    private java.lang.Boolean dirPwdPolicyVerifyAtLogin;

    public Domains() {}

    public Domains(Domains value) {
        this.domainId = value.domainId;
        this.internetName = value.internetName;
        this.enabled = value.enabled;
        this.description = value.description;
        this.userAutoCreation = value.userAutoCreation;
        this.dirUri = value.dirUri;
        this.dirAdmin = value.dirAdmin;
        this.dirPassword = value.dirPassword;
        this.dirConnectionSecurity = value.dirConnectionSecurity;
        this.dirCaseSensitive = value.dirCaseSensitive;
        this.dirPasswordPolicy = value.dirPasswordPolicy;
        this.dirParameters = value.dirParameters;
        this.dirPwdPolicyComplexity = value.dirPwdPolicyComplexity;
        this.dirPwdPolicyMinLength = value.dirPwdPolicyMinLength;
        this.dirPwdPolicyAvoidConsecutiveChars = value.dirPwdPolicyAvoidConsecutiveChars;
        this.dirPwdPolicyAvoidOldSimilarity = value.dirPwdPolicyAvoidOldSimilarity;
        this.dirPwdPolicyAvoidUsernameSimilarity = value.dirPwdPolicyAvoidUsernameSimilarity;
        this.dirPwdPolicyExpiration = value.dirPwdPolicyExpiration;
        this.dirPwdPolicyVerifyAtLogin = value.dirPwdPolicyVerifyAtLogin;
    }

    public Domains(
        java.lang.String  domainId,
        java.lang.String  internetName,
        java.lang.Boolean enabled,
        java.lang.String  description,
        java.lang.Boolean userAutoCreation,
        java.lang.String  dirUri,
        java.lang.String  dirAdmin,
        java.lang.String  dirPassword,
        java.lang.String  dirConnectionSecurity,
        java.lang.Boolean dirCaseSensitive,
        java.lang.Boolean dirPasswordPolicy,
        java.lang.String  dirParameters,
        java.lang.Boolean dirPwdPolicyComplexity,
        java.lang.Short   dirPwdPolicyMinLength,
        java.lang.Boolean dirPwdPolicyAvoidConsecutiveChars,
        java.lang.Boolean dirPwdPolicyAvoidOldSimilarity,
        java.lang.Boolean dirPwdPolicyAvoidUsernameSimilarity,
        java.lang.Short   dirPwdPolicyExpiration,
        java.lang.Boolean dirPwdPolicyVerifyAtLogin
    ) {
        this.domainId = domainId;
        this.internetName = internetName;
        this.enabled = enabled;
        this.description = description;
        this.userAutoCreation = userAutoCreation;
        this.dirUri = dirUri;
        this.dirAdmin = dirAdmin;
        this.dirPassword = dirPassword;
        this.dirConnectionSecurity = dirConnectionSecurity;
        this.dirCaseSensitive = dirCaseSensitive;
        this.dirPasswordPolicy = dirPasswordPolicy;
        this.dirParameters = dirParameters;
        this.dirPwdPolicyComplexity = dirPwdPolicyComplexity;
        this.dirPwdPolicyMinLength = dirPwdPolicyMinLength;
        this.dirPwdPolicyAvoidConsecutiveChars = dirPwdPolicyAvoidConsecutiveChars;
        this.dirPwdPolicyAvoidOldSimilarity = dirPwdPolicyAvoidOldSimilarity;
        this.dirPwdPolicyAvoidUsernameSimilarity = dirPwdPolicyAvoidUsernameSimilarity;
        this.dirPwdPolicyExpiration = dirPwdPolicyExpiration;
        this.dirPwdPolicyVerifyAtLogin = dirPwdPolicyVerifyAtLogin;
    }

    /**
     * Getter for <code>core.domains.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>core.domains.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>core.domains.internet_name</code>.
     */
    public java.lang.String getInternetName() {
        return this.internetName;
    }

    /**
     * Setter for <code>core.domains.internet_name</code>.
     */
    public void setInternetName(java.lang.String internetName) {
        this.internetName = internetName;
    }

    /**
     * Getter for <code>core.domains.enabled</code>.
     */
    public java.lang.Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for <code>core.domains.enabled</code>.
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for <code>core.domains.description</code>.
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>core.domains.description</code>.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Getter for <code>core.domains.user_auto_creation</code>.
     */
    public java.lang.Boolean getUserAutoCreation() {
        return this.userAutoCreation;
    }

    /**
     * Setter for <code>core.domains.user_auto_creation</code>.
     */
    public void setUserAutoCreation(java.lang.Boolean userAutoCreation) {
        this.userAutoCreation = userAutoCreation;
    }

    /**
     * Getter for <code>core.domains.dir_uri</code>.
     */
    public java.lang.String getDirUri() {
        return this.dirUri;
    }

    /**
     * Setter for <code>core.domains.dir_uri</code>.
     */
    public void setDirUri(java.lang.String dirUri) {
        this.dirUri = dirUri;
    }

    /**
     * Getter for <code>core.domains.dir_admin</code>.
     */
    public java.lang.String getDirAdmin() {
        return this.dirAdmin;
    }

    /**
     * Setter for <code>core.domains.dir_admin</code>.
     */
    public void setDirAdmin(java.lang.String dirAdmin) {
        this.dirAdmin = dirAdmin;
    }

    /**
     * Getter for <code>core.domains.dir_password</code>.
     */
    public java.lang.String getDirPassword() {
        return this.dirPassword;
    }

    /**
     * Setter for <code>core.domains.dir_password</code>.
     */
    public void setDirPassword(java.lang.String dirPassword) {
        this.dirPassword = dirPassword;
    }

    /**
     * Getter for <code>core.domains.dir_connection_security</code>.
     */
    public java.lang.String getDirConnectionSecurity() {
        return this.dirConnectionSecurity;
    }

    /**
     * Setter for <code>core.domains.dir_connection_security</code>.
     */
    public void setDirConnectionSecurity(java.lang.String dirConnectionSecurity) {
        this.dirConnectionSecurity = dirConnectionSecurity;
    }

    /**
     * Getter for <code>core.domains.dir_case_sensitive</code>.
     */
    public java.lang.Boolean getDirCaseSensitive() {
        return this.dirCaseSensitive;
    }

    /**
     * Setter for <code>core.domains.dir_case_sensitive</code>.
     */
    public void setDirCaseSensitive(java.lang.Boolean dirCaseSensitive) {
        this.dirCaseSensitive = dirCaseSensitive;
    }

    /**
     * Getter for <code>core.domains.dir_password_policy</code>.
     */
    public java.lang.Boolean getDirPasswordPolicy() {
        return this.dirPasswordPolicy;
    }

    /**
     * Setter for <code>core.domains.dir_password_policy</code>.
     */
    public void setDirPasswordPolicy(java.lang.Boolean dirPasswordPolicy) {
        this.dirPasswordPolicy = dirPasswordPolicy;
    }

    /**
     * Getter for <code>core.domains.dir_parameters</code>.
     */
    public java.lang.String getDirParameters() {
        return this.dirParameters;
    }

    /**
     * Setter for <code>core.domains.dir_parameters</code>.
     */
    public void setDirParameters(java.lang.String dirParameters) {
        this.dirParameters = dirParameters;
    }

    /**
     * Getter for <code>core.domains.dir_pwd_policy_complexity</code>.
     */
    public java.lang.Boolean getDirPwdPolicyComplexity() {
        return this.dirPwdPolicyComplexity;
    }

    /**
     * Setter for <code>core.domains.dir_pwd_policy_complexity</code>.
     */
    public void setDirPwdPolicyComplexity(java.lang.Boolean dirPwdPolicyComplexity) {
        this.dirPwdPolicyComplexity = dirPwdPolicyComplexity;
    }

    /**
     * Getter for <code>core.domains.dir_pwd_policy_min_length</code>.
     */
    public java.lang.Short getDirPwdPolicyMinLength() {
        return this.dirPwdPolicyMinLength;
    }

    /**
     * Setter for <code>core.domains.dir_pwd_policy_min_length</code>.
     */
    public void setDirPwdPolicyMinLength(java.lang.Short dirPwdPolicyMinLength) {
        this.dirPwdPolicyMinLength = dirPwdPolicyMinLength;
    }

    /**
     * Getter for <code>core.domains.dir_pwd_policy_avoid_consecutive_chars</code>.
     */
    public java.lang.Boolean getDirPwdPolicyAvoidConsecutiveChars() {
        return this.dirPwdPolicyAvoidConsecutiveChars;
    }

    /**
     * Setter for <code>core.domains.dir_pwd_policy_avoid_consecutive_chars</code>.
     */
    public void setDirPwdPolicyAvoidConsecutiveChars(java.lang.Boolean dirPwdPolicyAvoidConsecutiveChars) {
        this.dirPwdPolicyAvoidConsecutiveChars = dirPwdPolicyAvoidConsecutiveChars;
    }

    /**
     * Getter for <code>core.domains.dir_pwd_policy_avoid_old_similarity</code>.
     */
    public java.lang.Boolean getDirPwdPolicyAvoidOldSimilarity() {
        return this.dirPwdPolicyAvoidOldSimilarity;
    }

    /**
     * Setter for <code>core.domains.dir_pwd_policy_avoid_old_similarity</code>.
     */
    public void setDirPwdPolicyAvoidOldSimilarity(java.lang.Boolean dirPwdPolicyAvoidOldSimilarity) {
        this.dirPwdPolicyAvoidOldSimilarity = dirPwdPolicyAvoidOldSimilarity;
    }

    /**
     * Getter for <code>core.domains.dir_pwd_policy_avoid_username_similarity</code>.
     */
    public java.lang.Boolean getDirPwdPolicyAvoidUsernameSimilarity() {
        return this.dirPwdPolicyAvoidUsernameSimilarity;
    }

    /**
     * Setter for <code>core.domains.dir_pwd_policy_avoid_username_similarity</code>.
     */
    public void setDirPwdPolicyAvoidUsernameSimilarity(java.lang.Boolean dirPwdPolicyAvoidUsernameSimilarity) {
        this.dirPwdPolicyAvoidUsernameSimilarity = dirPwdPolicyAvoidUsernameSimilarity;
    }

    /**
     * Getter for <code>core.domains.dir_pwd_policy_expiration</code>.
     */
    public java.lang.Short getDirPwdPolicyExpiration() {
        return this.dirPwdPolicyExpiration;
    }

    /**
     * Setter for <code>core.domains.dir_pwd_policy_expiration</code>.
     */
    public void setDirPwdPolicyExpiration(java.lang.Short dirPwdPolicyExpiration) {
        this.dirPwdPolicyExpiration = dirPwdPolicyExpiration;
    }

    /**
     * Getter for <code>core.domains.dir_pwd_policy_verify_at_login</code>.
     */
    public java.lang.Boolean getDirPwdPolicyVerifyAtLogin() {
        return this.dirPwdPolicyVerifyAtLogin;
    }

    /**
     * Setter for <code>core.domains.dir_pwd_policy_verify_at_login</code>.
     */
    public void setDirPwdPolicyVerifyAtLogin(java.lang.Boolean dirPwdPolicyVerifyAtLogin) {
        this.dirPwdPolicyVerifyAtLogin = dirPwdPolicyVerifyAtLogin;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Domains (");

        sb.append(domainId);
        sb.append(", ").append(internetName);
        sb.append(", ").append(enabled);
        sb.append(", ").append(description);
        sb.append(", ").append(userAutoCreation);
        sb.append(", ").append(dirUri);
        sb.append(", ").append(dirAdmin);
        sb.append(", ").append(dirPassword);
        sb.append(", ").append(dirConnectionSecurity);
        sb.append(", ").append(dirCaseSensitive);
        sb.append(", ").append(dirPasswordPolicy);
        sb.append(", ").append(dirParameters);
        sb.append(", ").append(dirPwdPolicyComplexity);
        sb.append(", ").append(dirPwdPolicyMinLength);
        sb.append(", ").append(dirPwdPolicyAvoidConsecutiveChars);
        sb.append(", ").append(dirPwdPolicyAvoidOldSimilarity);
        sb.append(", ").append(dirPwdPolicyAvoidUsernameSimilarity);
        sb.append(", ").append(dirPwdPolicyExpiration);
        sb.append(", ").append(dirPwdPolicyVerifyAtLogin);

        sb.append(")");
        return sb.toString();
    }
}
