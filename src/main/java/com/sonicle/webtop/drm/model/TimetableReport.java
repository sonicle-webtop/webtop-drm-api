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
 * ANY WARRANTY; without even the implied warrantyText of MERCHANTABILITY or FITNESS
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
import org.joda.time.LocalDate;

/**
 *
 * @author lssndrvs
 */
public class TimetableReport {

	private Integer id;
	private String domainId;
	private String useriId;
	private Integer companyId;
	private LocalDate date;
	private String workingHours;
	private String overtime;
	private String paidLeave;
	private String unpaidLeave;
	private String holiday;
	private String medicalVisit;
	private String contractual;
	private String causal;
	private String hour;
	private String detail;
	private String note;
	private String targetUserId;
	private String workReportHours;
	private String jobHours;
	private String sickness;
	
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

	public String getUseriId() {
		return useriId;
	}

	public void setUseriId(String useriId) {
		this.useriId = useriId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

	public String getOvertime() {
		return overtime;
	}

	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}

	public String getPaidLeave() {
		return paidLeave;
	}

	public void setPaidLeave(String paidLeave) {
		this.paidLeave = paidLeave;
	}

	public String getUnpaidLeave() {
		return unpaidLeave;
	}

	public void setUnpaidLeave(String unpaidLeave) {
		this.unpaidLeave = unpaidLeave;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public String getMedicalVisit() {
		return medicalVisit;
	}

	public void setMedicalVisit(String medicalVisit) {
		this.medicalVisit = medicalVisit;
	}

	public String getContractual() {
		return contractual;
	}

	public void setContractual(String contractual) {
		this.contractual = contractual;
	}

	public String getCausal() {
		return causal;
	}

	public void setCausal(String causal) {
		this.causal = causal;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getTargetUserId() {
		return targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
	}
	
	public String getWorkReportHours() {
		return workReportHours;
	}

	public void setWorkReportHours(String workReportHours) {
		this.workReportHours = workReportHours;
	}
	
	public String getJobHours() {
		return jobHours;
	}

	public void setJobHours(String jobHours) {
		this.jobHours = jobHours;
	}
	
	public String getSickness() {
		return sickness;
	}

	public void setSickness(String sickness) {
		this.sickness = sickness;
	}
}
