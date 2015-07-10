package com.logyin.ordering.rt.controller;

import com.alibaba.fastjson.JSON;
import com.logyin.ordering.common.dto.BaseRequest;
import com.logyin.ordering.common.dto.BaseResponse;

public abstract class AbstractController<Req extends BaseRequest, Resp extends BaseResponse> {

	public abstract String entry(Req req);

	public abstract String handleRequest(Req req, Resp resp);

	public String execute(Req req, Resp resp) {
		return handleResponse(req, resp);
	}

	public String handleResponse(Req req, Resp resp) {

		return JSON.toJSONString(resp, true);
	}
}
