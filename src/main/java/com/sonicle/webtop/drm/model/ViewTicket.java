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

import org.joda.time.DateTime;

/**
 *
 * @author dnllr
 */
public class ViewTicket {
    
    public String ticketId;
	public Integer companyId;
	public String companyDescription;
	public String fromOperatorId;
	public String fromOperatorDescription;
	public String toOperatorId;
	public String toOperatorDescription;	
	public String customerId;
	public String customerDescription;
	public String customerStatId;
	public String customerStatDescription;
	public DateTime date;
	public String timezone;
	public Integer ticketCategoryId;
	public String ticketCategoryDescription;
	public Integer statusId;
	public String statusDescription;	
	public String priorityId;
	public String number;	
	public String title;

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
    
    public String getCompanyDescription() {
		return companyDescription;
	}

	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}
    
	public String getFromOperatorId() {
		return fromOperatorId;
	}

	public void setFromOperatorId(String fromOperatorId) {
		this.fromOperatorId = fromOperatorId;
	}
    
    public String getFromOperatorDescription() {
		return fromOperatorDescription;
	}

	public void setFromOperatorDescription(String fromOperatorDescription) {
		this.fromOperatorDescription = fromOperatorDescription;
	}
    
	public String getToOperatorId() {
		return toOperatorId;
	}

	public void setToOperatorId(String toOperatorId) {
		this.toOperatorId = toOperatorId;
	}
	
    public String getToOperatorDescription() {
		return toOperatorDescription;
	}

	public void setToOperatorDescription(String toOperatorDescription) {
		this.toOperatorDescription = toOperatorDescription;
	}
    
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerDescription() {
		return customerDescription;
	}

	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}
    
	public String getCustomerStatId() {
		return customerStatId;
	}

	public void setCustomerStatId(String customerStatId) {
		this.customerStatId = customerStatId;
	}

	public String getCustomerStatDescription() {
		return customerStatDescription;
	}

	public void setCustomerStatDescription(String customerStatDescription) {
		this.customerStatDescription = customerStatDescription;
	}
    
	public Integer getTicketCategoryId() {
		return ticketCategoryId;
	}

	public void setTicketCategoryId(Integer ticketCategoryId) {
		this.ticketCategoryId = ticketCategoryId;
	}

	public String getTicketCategoryDescription() {
		return ticketCategoryDescription;
	}

	public void setTicketCategoryDescription(String ticketCategoryDescription) {
		this.ticketCategoryDescription = ticketCategoryDescription;
	}
    
	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
    
	public String getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(String priorityId) {
		this.priorityId = priorityId;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public DateTime getDate() {
		return date;
	}
	
	public void setDate(DateTime date) {
		this.date = date;
	}

	public String getTimezone() {
		return timezone;
	}
	
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}	
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
