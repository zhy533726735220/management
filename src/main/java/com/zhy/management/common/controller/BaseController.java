package com.zhy.management.common.controller;

import com.zhy.management.common.utils.ShiroUtils;
import com.zhy.management.system.vo.UserDO;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}