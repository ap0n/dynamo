/*
_______________________
Apatar Open Source Data Integration
Copyright (C) 2005-2007, Apatar, Inc.
info@apatar.com
195 Meadow St., 2nd Floor
Chicopee, MA 01013

��� This program is free software; you can redistribute it and/or modify
��� it under the terms of the GNU General Public License as published by
��� the Free Software Foundation; either version 2 of the License, or
��� (at your option) any later version.

��� This program is distributed in the hope that it will be useful,
��� but WITHOUT ANY WARRANTY; without even the implied warranty of
��� MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.� See the
��� GNU General Public License for more details.

��� You should have received a copy of the GNU General Public License along
��� with this program; if not, write to the Free Software Foundation, Inc.,
��� 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
________________________

*/

package com.apatar.amazon;

import org.jdom.Element;

import com.apatar.core.IPersistent;
import com.apatar.core.PersistentUtils;

public class AmazonConnection implements IPersistent{
	protected String SubscriptionID = "1MYX8CB6F9MDQMRJ8402";
	
	public AmazonConnection() {
	}
	
	public Element saveToElement()
	{
		Element e = PersistentUtils.CreateElement(this);
		e.setAttribute("SubscriptionID", SubscriptionID);
		return e;
	}
	
	public void initFromElement(Element e) {
		this.SubscriptionID = e.getAttributeValue("SubscriptionID");
	}


	public String getSubscriptionID() {
		return SubscriptionID;
	}


	public void setSubscriptionID(String subscriptionID) {
		SubscriptionID = subscriptionID;
	}	
}

