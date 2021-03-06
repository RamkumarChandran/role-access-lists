/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package gr.open.marketplace.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the AdminIPConfiguration service. Represents a row in the &quot;opengr_AdminIPConfiguration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link gr.open.marketplace.model.impl.AdminIPConfigurationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link gr.open.marketplace.model.impl.AdminIPConfigurationImpl}.
 * </p>
 *
 * @author cotria
 * @see AdminIPConfiguration
 * @see gr.open.marketplace.model.impl.AdminIPConfigurationImpl
 * @see gr.open.marketplace.model.impl.AdminIPConfigurationModelImpl
 * @generated
 */
public interface AdminIPConfigurationModel extends BaseModel<AdminIPConfiguration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a admin i p configuration model instance should use the {@link AdminIPConfiguration} interface instead.
	 */

	/**
	 * Returns the primary key of this admin i p configuration.
	 *
	 * @return the primary key of this admin i p configuration
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this admin i p configuration.
	 *
	 * @param primaryKey the primary key of this admin i p configuration
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this admin i p configuration.
	 *
	 * @return the ID of this admin i p configuration
	 */
	public long getId();

	/**
	 * Sets the ID of this admin i p configuration.
	 *
	 * @param id the ID of this admin i p configuration
	 */
	public void setId(long id);

	/**
	 * Returns the redirect url of this admin i p configuration.
	 *
	 * @return the redirect url of this admin i p configuration
	 */
	@AutoEscape
	public String getRedirectUrl();

	/**
	 * Sets the redirect url of this admin i p configuration.
	 *
	 * @param redirectUrl the redirect url of this admin i p configuration
	 */
	public void setRedirectUrl(String redirectUrl);

	/**
	 * Returns the debug of this admin i p configuration.
	 *
	 * @return the debug of this admin i p configuration
	 */
	public boolean getDebug();

	/**
	 * Returns <code>true</code> if this admin i p configuration is debug.
	 *
	 * @return <code>true</code> if this admin i p configuration is debug; <code>false</code> otherwise
	 */
	public boolean isDebug();

	/**
	 * Sets whether this admin i p configuration is debug.
	 *
	 * @param debug the debug of this admin i p configuration
	 */
	public void setDebug(boolean debug);

	/**
	 * Returns the mode of this admin i p configuration.
	 *
	 * @return the mode of this admin i p configuration
	 */
	public int getMode();

	/**
	 * Sets the mode of this admin i p configuration.
	 *
	 * @param mode the mode of this admin i p configuration
	 */
	public void setMode(int mode);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(AdminIPConfiguration adminIPConfiguration);

	public int hashCode();

	public CacheModel<AdminIPConfiguration> toCacheModel();

	public AdminIPConfiguration toEscapedModel();

	public String toString();

	public String toXmlString();
}