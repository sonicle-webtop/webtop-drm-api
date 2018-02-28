/*
 * Copyright (C) 2017 Sonicle S.r.l.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY SONICLE, SONICLE DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Sonicle S.r.l. at email address sonicle[at]sonicle[dot]com
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * Sonicle logo and Sonicle copyright notice. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Copyright (C) 2017 Sonicle S.r.l.".
 */
package com.sonicle.webtop.drm.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lssndrvs
 */
public class Company {

	private String domainId;
	private Integer companyId;
	private String revisionStatus;
	private String name;
	public String address;
	public String postalCode;
	public String city;
	public String state;
	public String phone;
	public String fax;
	public String vat;
	public String taxCode;
	public String rea;
	public String businessRegister;
	public String logoUploadId;
	public String footerColumns;
	public String footerColumnLeft;
	public String footerColumnRight;
	
	public boolean hasPicture;

	private List<CompanyUserAssociation> associatedUsers = new ArrayList();

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getRevisionStatus() {
		return revisionStatus;
	}

	public void setRevisionStatus(String revisionStatus) {
		this.revisionStatus = revisionStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getRea() {
		return rea;
	}

	public void setRea(String rea) {
		this.rea = rea;
	}

	public String getBusinessRegister() {
		return businessRegister;
	}

	public void setBusinessRegister(String businessRegister) {
		this.businessRegister = businessRegister;
	}

	public String getLogoUploadId() {
		return logoUploadId;
	}

	public void setLogoUploadId(String logoUploadId) {
		this.logoUploadId = logoUploadId;
	}

	public String getFooterColumns() {
		return footerColumns;
	}

	public void setFooterColumns(String footerColumns) {
		this.footerColumns = footerColumns;
	}

	public String getFooterColumnLeft() {
		return footerColumnLeft;
	}

	public void setFooterColumnLeft(String footerColumnLeft) {
		this.footerColumnLeft = footerColumnLeft;
	}

	public String getFooterColumnRight() {
		return footerColumnRight;
	}

	public void setFooterColumnRight(String footerColumnRight) {
		this.footerColumnRight = footerColumnRight;
	}

	public List<CompanyUserAssociation> getAssociatedUsers() {
		return associatedUsers;
	}

	public void setAssociatedUsers(List<CompanyUserAssociation> associatedUsers) {
		this.associatedUsers = associatedUsers;
	}

	public boolean getHasPicture() {
		return hasPicture;
	}

	public void setHasPicture(boolean hasPicture) {
		this.hasPicture = hasPicture;
	}
}
