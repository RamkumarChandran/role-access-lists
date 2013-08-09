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
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import gr.open.marketplace.model.AdminIPValidationData;
import gr.open.marketplace.service.AdminIPConfigurationLocalService;
import gr.open.marketplace.service.AdminIPValidationDataLocalService;
import gr.open.marketplace.service.persistence.AdminIPConfigurationPersistence;
import gr.open.marketplace.service.persistence.AdminIPValidationDataPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the admin i p validation data local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link gr.open.marketplace.service.impl.AdminIPValidationDataLocalServiceImpl}.
 * </p>
 *
 * @author cotria
 * @see gr.open.marketplace.service.impl.AdminIPValidationDataLocalServiceImpl
 * @see gr.open.marketplace.service.AdminIPValidationDataLocalServiceUtil
 * @generated
 */
public abstract class AdminIPValidationDataLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements AdminIPValidationDataLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link gr.open.marketplace.service.AdminIPValidationDataLocalServiceUtil} to access the admin i p validation data local service.
	 */

	/**
	 * Adds the admin i p validation data to the database. Also notifies the appropriate model listeners.
	 *
	 * @param adminIPValidationData the admin i p validation data
	 * @return the admin i p validation data that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AdminIPValidationData addAdminIPValidationData(
		AdminIPValidationData adminIPValidationData) throws SystemException {
		adminIPValidationData.setNew(true);

		return adminIPValidationDataPersistence.update(adminIPValidationData,
			false);
	}

	/**
	 * Creates a new admin i p validation data with the primary key. Does not add the admin i p validation data to the database.
	 *
	 * @param id the primary key for the new admin i p validation data
	 * @return the new admin i p validation data
	 */
	public AdminIPValidationData createAdminIPValidationData(long id) {
		return adminIPValidationDataPersistence.create(id);
	}

	/**
	 * Deletes the admin i p validation data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the admin i p validation data
	 * @return the admin i p validation data that was removed
	 * @throws PortalException if a admin i p validation data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public AdminIPValidationData deleteAdminIPValidationData(long id)
		throws PortalException, SystemException {
		return adminIPValidationDataPersistence.remove(id);
	}

	/**
	 * Deletes the admin i p validation data from the database. Also notifies the appropriate model listeners.
	 *
	 * @param adminIPValidationData the admin i p validation data
	 * @return the admin i p validation data that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public AdminIPValidationData deleteAdminIPValidationData(
		AdminIPValidationData adminIPValidationData) throws SystemException {
		return adminIPValidationDataPersistence.remove(adminIPValidationData);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(AdminIPValidationData.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return adminIPValidationDataPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return adminIPValidationDataPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return adminIPValidationDataPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return adminIPValidationDataPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public AdminIPValidationData fetchAdminIPValidationData(long id)
		throws SystemException {
		return adminIPValidationDataPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the admin i p validation data with the primary key.
	 *
	 * @param id the primary key of the admin i p validation data
	 * @return the admin i p validation data
	 * @throws PortalException if a admin i p validation data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdminIPValidationData getAdminIPValidationData(long id)
		throws PortalException, SystemException {
		return adminIPValidationDataPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return adminIPValidationDataPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the admin i p validation datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of admin i p validation datas
	 * @param end the upper bound of the range of admin i p validation datas (not inclusive)
	 * @return the range of admin i p validation datas
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdminIPValidationData> getAdminIPValidationDatas(int start,
		int end) throws SystemException {
		return adminIPValidationDataPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of admin i p validation datas.
	 *
	 * @return the number of admin i p validation datas
	 * @throws SystemException if a system exception occurred
	 */
	public int getAdminIPValidationDatasCount() throws SystemException {
		return adminIPValidationDataPersistence.countAll();
	}

	/**
	 * Updates the admin i p validation data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param adminIPValidationData the admin i p validation data
	 * @return the admin i p validation data that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AdminIPValidationData updateAdminIPValidationData(
		AdminIPValidationData adminIPValidationData) throws SystemException {
		return updateAdminIPValidationData(adminIPValidationData, true);
	}

	/**
	 * Updates the admin i p validation data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param adminIPValidationData the admin i p validation data
	 * @param merge whether to merge the admin i p validation data with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the admin i p validation data that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AdminIPValidationData updateAdminIPValidationData(
		AdminIPValidationData adminIPValidationData, boolean merge)
		throws SystemException {
		adminIPValidationData.setNew(false);

		return adminIPValidationDataPersistence.update(adminIPValidationData,
			merge);
	}

	/**
	 * Returns the admin i p configuration local service.
	 *
	 * @return the admin i p configuration local service
	 */
	public AdminIPConfigurationLocalService getAdminIPConfigurationLocalService() {
		return adminIPConfigurationLocalService;
	}

	/**
	 * Sets the admin i p configuration local service.
	 *
	 * @param adminIPConfigurationLocalService the admin i p configuration local service
	 */
	public void setAdminIPConfigurationLocalService(
		AdminIPConfigurationLocalService adminIPConfigurationLocalService) {
		this.adminIPConfigurationLocalService = adminIPConfigurationLocalService;
	}

	/**
	 * Returns the admin i p configuration persistence.
	 *
	 * @return the admin i p configuration persistence
	 */
	public AdminIPConfigurationPersistence getAdminIPConfigurationPersistence() {
		return adminIPConfigurationPersistence;
	}

	/**
	 * Sets the admin i p configuration persistence.
	 *
	 * @param adminIPConfigurationPersistence the admin i p configuration persistence
	 */
	public void setAdminIPConfigurationPersistence(
		AdminIPConfigurationPersistence adminIPConfigurationPersistence) {
		this.adminIPConfigurationPersistence = adminIPConfigurationPersistence;
	}

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
		PersistedModelLocalServiceRegistryUtil.register("gr.open.marketplace.model.AdminIPValidationData",
			adminIPValidationDataLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"gr.open.marketplace.model.AdminIPValidationData");
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

	@BeanReference(type = AdminIPConfigurationLocalService.class)
	protected AdminIPConfigurationLocalService adminIPConfigurationLocalService;
	@BeanReference(type = AdminIPConfigurationPersistence.class)
	protected AdminIPConfigurationPersistence adminIPConfigurationPersistence;
	@BeanReference(type = AdminIPValidationDataLocalService.class)
	protected AdminIPValidationDataLocalService adminIPValidationDataLocalService;
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
	private AdminIPValidationDataLocalServiceClpInvoker _clpInvoker = new AdminIPValidationDataLocalServiceClpInvoker();
}