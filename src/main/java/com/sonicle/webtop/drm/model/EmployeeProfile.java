package com.sonicle.webtop.drm.model;

import java.util.ArrayList;
import java.util.List;

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
/**
 *
 * @author lssndrvs
 */
public class EmployeeProfile {
	public Integer id;
	public String domainId;
	public String userId;
	public String number;
	public String tolerance;
	public Boolean extraordinary;
	public Boolean onlyPresence;
	public Integer hourProfileId;
	public String headquartersCode;
	public Boolean noStamping;
	public Integer minimumNumberOfHoursPerTicket;
	public String stampingMode;

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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTolerance() {
		return tolerance;
	}

	public void setTolerance(String tolerance) {
		this.tolerance = tolerance;
	}

	public Boolean getExtraordinary() {
		return extraordinary;
	}

	public void setExtraordinary(Boolean extraordinary) {
		this.extraordinary = extraordinary;
	}

	public Boolean getOnlyPresence() {
		return onlyPresence;
	}

	public void setOnlyPresence(Boolean onlyPresence) {
		this.onlyPresence = onlyPresence;
	}

	public Integer getHourProfileId() {
		return hourProfileId;
	}

	public void setHourProfileId(Integer hourProfileId) {
		this.hourProfileId = hourProfileId;
	}

	public String getHeadquartersCode() {
		return headquartersCode;
	}

	public void setHeadquartersCode(String headquartersCode) {
		this.headquartersCode = headquartersCode;
	}

	public Boolean getNoStamping() {
		return noStamping;
	}

	public void setNoStamping(Boolean noStamping) {
		this.noStamping = noStamping;
	}

	public Integer getMinimumNumberOfHoursPerTicket() {
		return minimumNumberOfHoursPerTicket;
	}

	public void setMinimumNumberOfHoursPerTicket(Integer minimumNumberOfHoursPerTicket) {
		this.minimumNumberOfHoursPerTicket = minimumNumberOfHoursPerTicket;
	}
	
	public String getStampingMode() {
		return this.stampingMode;
	}
	
	public void setStampingMode(String mode) {
		this.stampingMode = mode;
	}

}
