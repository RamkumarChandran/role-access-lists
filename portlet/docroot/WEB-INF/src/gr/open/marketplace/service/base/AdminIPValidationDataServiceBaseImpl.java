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

package gr.open.marketplace.service.base;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import gr.open.marketplace.model.AdminIPValidationData;
import gr.open.marketplace.service.AdminIPValidationDataLocalService;
import gr.open.marketplace.service.AdminIPValidationDataService;
import gr.open.marketplace.service.persistence.AdminIPValidationDataPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the admin i p validation data remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link gr.open.marketplace.service.impl.AdminIPValidationDataServiceImpl}.
 * </p>
 *
 * @author cotria
 * @see gr.open.marketplace.service.impl.AdminIPValidationDataServiceImpl
 * @see gr.open.marketplace.service.AdminIPValidationDataServiceUtil
 * @generated
 */
public abstract class AdminIPValidationDataServiceBaseImpl
	extends BaseServiceImpl implements AdminIPValidationDataService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link gr.open.marketplace.service.AdminIPValidationDataServiceUtil} to access the admin i p validation data remote service.
	 */

	/**
	 * Returns the admin i p validation data local service.
	 *
	 * @return the admin i p validation data local service
	 */
	public AdminIPValidationDataLocalService getAdminIPValidationDataLocalService() {
		return adminIPValidationDataLocalService;
	}

	/**
	 * Sets the admin i p validation data local service.
	 *
	 * @param adminIPValidationDataLocalService the admin i p validation data local service
	 */
	public void setAdminIPValidationDataLocalService(
		AdminIPValidationDataLocalService adminIPValidationDataLocalService) {
		this.adminIPValidationDataLocalService = adminIPValidationDataLocalService;
	}

	/**
	 * Returns the admin i p validation data remote service.
	 *
	 * @return the admin i p validation data remote service
	 */
	public AdminIPValidationDataService getAdminIPValidationDataService() {
		return adminIPValidationDataService;
	}

	/**
	 * Sets the admin i p validation data remote service.
	 *
	 * @param adminIPValidationDataService the admin i p validation data remote service
	 */
	public void setAdminIPValidationDataService(
		AdminIPValidationDataService adminIPValidationDataService) {
		this.adminIPValidationDataService = adminIPValidationDataService;
	}

	/**
	 * Returns the admin i p validation data persistence.
	 *
	 * @return the admin i p validation data persistence
	 */
	public AdminIPValidationDataPersistence getAdminIPValidationDataPersistence() {
		return adminIPValidationDataPersistence;
	}

	/**
	 * Sets the admin i p validation data persistence.
	 *
	 * @param adminIPValidationDataPersistence the admin i p validation data persistence
	 */
	public void setAdminIPValidationDataPersistence(
		AdminIPValidationDataPersistence adminIPValidationDataPersistence) {
		this.adminIPValidationDataPersistence = adminIPValidationDataPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return AdminIPValidationData.class;
	}

	protected String getModelClassName() {
		return AdminIPValidationData.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = adminIPValidationDataPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = AdminIPValidationDataLocalService.class)
	protected AdminIPValidationDataLocalService adminIPValidationDataLocalService;
	@BeanReference(type = AdminIPValidationDataService.class)
	protected AdminIPValidationDataService adminIPValidationDataService;
	@BeanReference(type = AdminIPValidationDataPersistence.class)
	protected AdminIPValidationDataPersistence adminIPValidationDataPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private AdminIPValidationDataServiceClpInvoker _clpInvoker = new AdminIPValidationDataServiceClpInvoker();
}