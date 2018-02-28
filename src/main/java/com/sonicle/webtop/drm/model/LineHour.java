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

/**
 *
 * @author lssndrvs
 */
public class LineHour {
	
	public Integer id;
	public String domainId;
	public Integer hourProfileId;
	public Integer lineId;
	public String e_1;
	public String u_1;
	public String h_1;
	public String e_2;
	public String u_2;
	public String h_2;
	public String e_3;
	public String u_3;
	public String h_3;
	public String e_4;
	public String u_4;
	public String h_4;
	public String e_5;
	public String u_5;
	public String h_5;
	public String e_6;
	public String u_6;
	public String h_6;
	public String e_7;
	public String u_7;
	public String h_7;

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

	public Integer getHourProfileId() {
		return hourProfileId;
	}

	public void setHourProfileId(Integer hourProfileId) {
		this.hourProfileId = hourProfileId;
	}

	public Integer getLineId() {
		return lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

	public String getE_1() {
		return e_1;
	}

	public void setE_1(String e_1) {
		this.e_1 = e_1;
	}

	public String getU_1() {
		return u_1;
	}

	public void setU_1(String u_1) {
		this.u_1 = u_1;
	}

	public String getE_2() {
		return e_2;
	}

	public void setE_2(String e_2) {
		this.e_2 = e_2;
	}

	public String getU_2() {
		return u_2;
	}

	public void setU_2(String u_2) {
		this.u_2 = u_2;
	}

	public String getE_3() {
		return e_3;
	}

	public void setE_3(String e_3) {
		this.e_3 = e_3;
	}

	public String getU_3() {
		return u_3;
	}

	public void setU_3(String u_3) {
		this.u_3 = u_3;
	}

	public String getE_4() {
		return e_4;
	}

	public void setE_4(String e_4) {
		this.e_4 = e_4;
	}

	public String getU_4() {
		return u_4;
	}

	public void setU_4(String u_4) {
		this.u_4 = u_4;
	}

	public String getE_5() {
		return e_5;
	}

	public void setE_5(String e_5) {
		this.e_5 = e_5;
	}

	public String getU_5() {
		return u_5;
	}

	public void setU_5(String u_5) {
		this.u_5 = u_5;
	}

	public String getE_6() {
		return e_6;
	}

	public void setE_6(String e_6) {
		this.e_6 = e_6;
	}

	public String getU_6() {
		return u_6;
	}

	public void setU_6(String u_6) {
		this.u_6 = u_6;
	}

	public String getE_7() {
		return e_7;
	}

	public void setE_7(String e_7) {
		this.e_7 = e_7;
	}

	public String getU_7() {
		return u_7;
	}

	public void setU_7(String u_7) {
		this.u_7 = u_7;
	}

	public String getH_1() {
		return h_1;
	}

	public void setH_1(String h_1) {
		this.h_1 = h_1;
	}

	public String getH_2() {
		return h_2;
	}

	public void setH_2(String h_2) {
		this.h_2 = h_2;
	}

	public String getH_3() {
		return h_3;
	}

	public void setH_3(String h_3) {
		this.h_3 = h_3;
	}

	public String getH_4() {
		return h_4;
	}

	public void setH_4(String h_4) {
		this.h_4 = h_4;
	}

	public String getH_5() {
		return h_5;
	}

	public void setH_5(String h_5) {
		this.h_5 = h_5;
	}

	public String getH_6() {
		return h_6;
	}

	public void setH_6(String h_6) {
		this.h_6 = h_6;
	}

	public String getH_7() {
		return h_7;
	}

	public void setH_7(String h_7) {
		this.h_7 = h_7;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getId())
				.append(getDomainId())
				.append(getHourProfileId())
				.append(getLineId())
				.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LineHour == false) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		final LineHour otherObject = (LineHour) obj;
		return new EqualsBuilder()
				.append(getId(), otherObject.getId())
				.isEquals();
	}
}
