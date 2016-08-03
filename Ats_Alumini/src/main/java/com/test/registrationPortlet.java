package com.test;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;


@Controller(value="registrationPortlet")
@RequestMapping("VIEW")
public class registrationPortlet{

	@Autowired
	@Qualifier(value="emp")
	private Employe emp1;
	
	@RenderMapping
	public String defaultRenderJsp(RenderRequest req, RenderResponse res){
		System.out.println("in default render.............");
		System.out.println(emp1.getName());
		return "view";
	}
	
    @ActionMapping(params="action=actionOne")
    public void actionOne(ActionRequest actionRequest, ActionResponse actionResponse){
    	System.out.println("in action.............");
    }
}
