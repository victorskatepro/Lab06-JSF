package com.tecsup.lab06.jsf.bean;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
@ManagedBean(name = "navigationCtrl", eager = true)
@RequestScoped
public class NavigationCtrl implements Serializable {
    
	@ManagedProperty(value = "#param.pageId")
	private String pageId;
	
	public String gotoPage1() {
		return "page1";
	}
	
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
	
	public String showPage() {
		if (pageId == null) {
			return "page2";
		}
		if (pageId.equals("1")) {
			return "page2";
		} else if (pageId.equalsIgnoreCase("2")) {
			return "page2";
		}else {
			return "page2";
		}
	}
}
