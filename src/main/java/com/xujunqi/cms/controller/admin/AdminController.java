package com.xujunqi.cms.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.xujunqi.cms.common.CmsConst;

public class AdminController implements  HandlerInterceptor{


	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Object userInfo = request.getSession().getAttribute(CmsConst.UserSessionKey);
		if(userInfo==null) {
			response.sendRedirect("/user/login");
			return false;
		}
		return true;
	}
}
