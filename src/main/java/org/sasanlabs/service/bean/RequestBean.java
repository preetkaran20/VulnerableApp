package org.sasanlabs.service.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DTO which is passed from the controller layer to service layer.
 * @author KSASAN preetkaran20@gmail.com
 */
public class RequestBean {

	private Map<String, String> queryParams = new HashMap<>();
	private Map<String, List<String>> headers = new HashMap<>();
	private String level;
	private String endPoint;
	private String url;
	private String body;
	
	public Map<String, String> getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(Map<String, String> urlParams) {
		this.queryParams = urlParams;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public Map<String, List<String>> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, List<String>> headers) {
		this.headers = headers;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
