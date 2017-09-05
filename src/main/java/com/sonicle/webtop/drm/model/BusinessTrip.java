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

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author stfnnvl
 */
public class BusinessTrip {

	private Integer businessTripId;
	private String domainId;
	private RevisionStatus revisionStatus;
	private String externalId;
	private String description;

	public Integer getBusinessTripId() {
		return businessTripId;
	}

	public void setBusinessTripId(Integer businessTripId) {
		this.businessTripId = businessTripId;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public RevisionStatus getRevisionStatus() {
		return revisionStatus;
	}

	public void setRevisionStatus(RevisionStatus revisionStatus) {
		this.revisionStatus = revisionStatus;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public static enum RevisionStatus {
		@SerializedName("M")
		MODIFIED,
		@SerializedName("D")
		DELETED;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getBusinessTripId())
				.append(getDomainId())
				.append(getExternalId())
				.append(getDescription())
				.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BusinessTrip == false) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		final BusinessTrip otherObject = (BusinessTrip) obj;
		return new EqualsBuilder()
				.append(getBusinessTripId(), otherObject.getBusinessTripId())
				.isEquals();
	}

}
