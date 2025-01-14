/*******************************************************************************
 * Copyright (c) 2006-2018 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. I2b2 is also distributed under
 * the terms of the Healthcare Disclaimer.
 ******************************************************************************/
package edu.harvard.i2b2.crc.datavo.db;

// Generated Oct 10, 2006 5:52:18 PM by Hibernate Tools 3.1.0.beta5

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * QtQueryMaster generated by hbm2java
 */
public class QtQueryMaster implements java.io.Serializable {

	// Fields

	private String queryMasterId;
	private String name;
	private String userId;
	private String groupId;
	private Date createDate;
	private Date deleteDate;
	private String requestXml;
	private String generatedSql;
	private String masterTypeCd = null;
	private String pluginId = null;
	private Set<QtQueryInstance> qtQueryInstances = new HashSet<QtQueryInstance>(
			0);

	private String deleteFlag;
	private String i2b2RequestXml;

	public final static String DELETE_ON_FLAG = "Y";
	public final static String DELETE_OFF_FLAG = "N";

	// Constructors

	/** default constructor */
	public QtQueryMaster() {
	}

	/** minimal constructor */
	public QtQueryMaster(String queryMasterId, String name, String userId,
			String groupId, Date createDate) {
		this.queryMasterId = queryMasterId;
		this.name = name;
		this.userId = userId;
		this.groupId = groupId;
		this.createDate = createDate;
	}

	/** full constructor */
	public QtQueryMaster(String queryMasterId, String name, String userId,
			String groupId, Date createDate, Date deleteDate,
			String requestXml, Set<QtQueryInstance> qtQueryInstances) {
		this.queryMasterId = queryMasterId;
		this.name = name;
		this.userId = userId;
		this.groupId = groupId;
		this.createDate = createDate;
		this.deleteDate = deleteDate;
		this.requestXml = requestXml;
		this.qtQueryInstances = qtQueryInstances;
	}

	// Property accessors
	public String getQueryMasterId() {
		return this.queryMasterId;
	}

	public void setQueryMasterId(String queryMasterId) {
		this.queryMasterId = queryMasterId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getRequestXml() {
		return this.requestXml;
	}

	public void setRequestXml(String requestXml) {
		this.requestXml = requestXml;
	}

	public String getGeneratedSql() {
		return generatedSql;
	}

	public void setGeneratedSql(String generatedSql) {
		this.generatedSql = generatedSql;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Set<QtQueryInstance> getQtQueryInstances() {
		return this.qtQueryInstances;
	}

	public void setQtQueryInstances(Set<QtQueryInstance> qtQueryInstances) {
		this.qtQueryInstances = qtQueryInstances;
	}

	public String getI2b2RequestXml() {
		return i2b2RequestXml;
	}

	public void setI2b2RequestXml(String requestXml) {
		i2b2RequestXml = requestXml;
	}

	public String getMasterTypeCd() {
		return masterTypeCd;
	}

	public void setMasterTypeCd(String masterTypeCd) {
		this.masterTypeCd = masterTypeCd;
	}

	public String getPluginId() {
		return pluginId;
	}

	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

}
