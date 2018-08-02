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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.joda.time.DateTime;

/**
 *
 * @author lssndrvs
 */
public class OpportunityActionDocument {

	private Integer id;
	private Integer opportunityActionId;
	private DateTime revisionTimestamp;
	private Integer revisionSequence;
	private String fileName;
	private Integer size;
	private String mediaType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOpportunityActionId() {
		return opportunityActionId;
	}

	public void setOpportunityActionId(Integer opportunityActionId) {
		this.opportunityActionId = opportunityActionId;
	}

	public DateTime getRevisionTimestamp() {
		return revisionTimestamp;
	}

	public void setRevisionTimestamp(DateTime revisionTimestamp) {
		this.revisionTimestamp = revisionTimestamp;
	}

	public Integer getRevisionSequence() {
		return revisionSequence;
	}

	public void setRevisionSequence(Integer revisionSequence) {
		this.revisionSequence = revisionSequence;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getId())
				.append(getOpportunityActionId())
				.append(getFileName())
				.append(getSize())
				.append(getMediaType())
				.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OpportunityActionDocument == false) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		final OpportunityActionDocument otherObject = (OpportunityActionDocument) obj;
		return new EqualsBuilder()
				.append(getId(), otherObject.getId())
				.isEquals();
	}

}
