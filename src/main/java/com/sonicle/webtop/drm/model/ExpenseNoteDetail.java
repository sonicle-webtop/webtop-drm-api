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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/**
 *
 * @author lssndrvs
 */
public class ExpenseNoteDetail {
	
	private Integer id;
	private Integer expenseNoteId;
	private String operatorId;
	private Integer companyId;
	private Integer typeId;
	private BigDecimal total;
	private LocalDate date;
	private Boolean paymentCompany;
	private Boolean invoice;
	private String invoiceNumber;
	private String withOthers;
	private String customerId;
	private BigDecimal km;
	private String currency;
	private BigDecimal change;
	private String description;
	private BigDecimal totalDoc;
	private String currencyDoc;
	
	private List<ExpenseNoteDetailDocument> detailDocuments = new ArrayList();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getExpenseNoteId() {
		return expenseNoteId;
	}

	public void setExpenseNoteId(Integer expenseNoteId) {
		this.expenseNoteId = expenseNoteId;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Boolean getPaymentCompany() {
		return paymentCompany;
	}

	public void setPaymentCompany(Boolean paymentCompany) {
		this.paymentCompany = paymentCompany;
	}

	public Boolean getInvoice() {
		return invoice;
	}

	public void setInvoice(Boolean invoice) {
		this.invoice = invoice;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getWithOthers() {
		return withOthers;
	}

	public void setWithOthers(String withOthers) {
		this.withOthers = withOthers;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public BigDecimal getKm() {
		return km;
	}

	public void setKm(BigDecimal km) {
		this.km = km;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getChange() {
		return change;
	}

	public void setChange(BigDecimal change) {
		this.change = change;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getTotalDoc() {
		return totalDoc;
	}

	public void setTotalDoc(BigDecimal totalDoc) {
		this.totalDoc = totalDoc;
	}

	public String getCurrencyDoc() {
		return currencyDoc;
	}

	public void setCurrencyDoc(String currencyDoc) {
		this.currencyDoc = currencyDoc;
	}

	public List<ExpenseNoteDetailDocument> getDetailDocuments() {
		return detailDocuments;
	}

	public void setDetailDocuments(List<ExpenseNoteDetailDocument> detailDocuments) {
		this.detailDocuments = detailDocuments;
	}
}
