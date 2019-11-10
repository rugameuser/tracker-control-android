/*
 * Copyright (C) 2019 Konrad Kollnig, University of Oxford
 *
 * Tracker Control is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Tracker Control is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Tracker Control. If not, see <http://www.gnu.org/licenses/>.
 */

package net.kollnig.missioncontrol.data;

public class Company {
	public final String country;
	public final String name;
	public final String owner;

	public Company (String country, String name, String owner) {
		this.country = country;
		this.name = name;
		this.owner = owner;
	}

	public String getOwner () {
		if (owner == null || owner.equals("null")) return null;
		return owner;
	}

	public String getRoot () {
		if (getOwner() != null) return getOwner();
		return name;
	}
}
