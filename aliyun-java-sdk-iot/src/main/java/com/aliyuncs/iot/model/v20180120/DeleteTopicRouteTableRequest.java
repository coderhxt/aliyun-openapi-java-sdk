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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DeleteTopicRouteTableRequest extends RpcAcsRequest<DeleteTopicRouteTableResponse> {
	
	public DeleteTopicRouteTableRequest() {
		super("Iot", "2018-01-20", "DeleteTopicRouteTable");
	}

	private List<String> dstTopics;

	private String srcTopic;

	public List<String> getDstTopics() {
		return this.dstTopics;
	}

	public void setDstTopics(List<String> dstTopics) {
		this.dstTopics = dstTopics;	
		if (dstTopics != null) {
			for (int i = 0; i < dstTopics.size(); i++) {
				putQueryParameter("DstTopic." + (i + 1) , dstTopics.get(i));
			}
		}	
	}

	public String getSrcTopic() {
		return this.srcTopic;
	}

	public void setSrcTopic(String srcTopic) {
		this.srcTopic = srcTopic;
		if(srcTopic != null){
			putQueryParameter("SrcTopic", srcTopic);
		}
	}

	@Override
	public Class<DeleteTopicRouteTableResponse> getResponseClass() {
		return DeleteTopicRouteTableResponse.class;
	}

}