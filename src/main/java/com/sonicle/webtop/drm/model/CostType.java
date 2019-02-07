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

import java.math.BigDecimal;

/**
 *
 * @author lssndrvs
 */
public class CostType {

	private Integer id;
	private String domainId;
	private String description;
	private BigDecimal maxImport;
	private String costType;
	private Boolean withOthers;
	private Boolean perPerson;
	private Boolean km;
	private Boolean advancePayment;
	private Boolean exchange;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getMaxImport() {
		return maxImport;
	}

	public void setMaxImport(BigDecimal maxImport) {
		this.maxImport = maxImport;
	}

	public String getCostType() {
		return costType;
	}

	public void setCostType(String costType) {
		this.costType = costType;
	}

	public Boolean getWithOthers() {
		return withOthers;
	}

	public void setWithOthers(Boolean withOthers) {
		this.withOthers = withOthers;
	}

	public Boolean getPerPerson() {
		return perPerson;
	}

	public void setPerPerson(Boolean perPerson) {
		this.perPerson = perPerson;
	}

	public Boolean getKm() {
		return km;
	}

	public void setKm(Boolean km) {
		this.km = km;
	}

	public Boolean getAdvancePayment() {
		return advancePayment;
	}

	public void setAdvancePayment(Boolean advancePayment) {
		this.advancePayment = advancePayment;
	}

	public Boolean getExchange() {
		return exchange;
	}

	public void setExchange(Boolean exchange) {
		this.exchange = exchange;
	}

}
