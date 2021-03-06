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
 * @author dnllr
 */
public class TicketAttachment {

	private String ticketAttachmentId;
	private String ticketId;
	private DateTime revisionTimestamp;
	private Short revisionSequence;
	private String fileName;
	private Long size;
	private String mediaType;

	public String getTicketAttachmentId() {
		return ticketAttachmentId;
	}

	public void setTicketAttachmentId(String ticketAttachmentId) {
		this.ticketAttachmentId = ticketAttachmentId;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public DateTime getRevisionTimestamp() {
		return revisionTimestamp;
	}

	public void setRevisionTimestamp(DateTime revisionTimestamp) {
		this.revisionTimestamp = revisionTimestamp;
	}

	public Short getRevisionSequence() {
		return revisionSequence;
	}

	public void setRevisionSequence(Short revisionSequence) {
		this.revisionSequence = revisionSequence;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
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
				.append(getTicketAttachmentId())
				.append(getTicketId())
				.append(getFileName())
				.append(getSize())
				.append(getMediaType())
				.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TicketAttachment == false) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		final TicketAttachment otherObject = (TicketAttachment) obj;
		return new EqualsBuilder()
				.append(getTicketAttachmentId(), otherObject.getTicketAttachmentId())
				.isEquals();
	}

}