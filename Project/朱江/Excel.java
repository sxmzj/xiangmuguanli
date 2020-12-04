package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Excel extends BaseTest{
	
	//数据驱动，登陆，点击页面
	@Test(dataProvider = "wordpress", dataProviderClass = NSDataProvider.class)
	public void test_login(String s1, String s2) {
		//登陆
		webtest.type("name=log", s1);
		webtest.type("name=pwd", s2);
		webtest.click("name=wp-submit");
		//点击页面
		webtest.click("class=wp-menu-name");
	}

}
