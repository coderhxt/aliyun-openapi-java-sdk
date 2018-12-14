/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudDbExpertServiceRequest extends RpcAcsRequest<DescribeCloudDbExpertServiceResponse> {
	
	public DescribeCloudDbExpertServiceRequest() {
		super("Rds", "2014-08-15", "DescribeCloudDbExpertService", "rds");
	}

	private String serviceRequestParam;

	private Long resourceOwnerId;

	private String securityToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String dBInstanceId;

	private Long ownerId;

	private String serviceRequestType;

	public String getServiceRequestParam() {
		return this.serviceRequestParam;
	}

	public void setServiceRequestParam(String serviceRequestParam) {
		this.serviceRequestParam = serviceRequestParam;
		if(serviceRequestParam != null){
			putQueryParameter("ServiceRequestParam", serviceRequestParam);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getServiceRequestType() {
		return this.serviceRequestType;
	}

	public void setServiceRequestType(String serviceRequestType) {
		this.serviceRequestType = serviceRequestType;
		if(serviceRequestType != null){
			putQueryParameter("ServiceRequestType", serviceRequestType);
		}
	}

	@Override
	public Class<DescribeCloudDbExpertServiceResponse> getResponseClass() {
		return DescribeCloudDbExpertServiceResponse.class;
	}

}
