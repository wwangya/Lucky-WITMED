package com.wwangya.witmed.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b></b>
 *
 * @author WWY
 * 2022/7/2
 */
@Controller("baseController")
public class BaseController{
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}

