package com.webtest.core;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

@SuppressWarnings("unused")
public class Tests extends BaseTest{
	//1.登录，点击任务，点击项目管理
	@Test
	public void test01() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		webtest.click("class=icon-home");
		Thread.sleep(3000);
	}
	//2.登录，点击任务，点击项目管理，点击我执行的任务
	@Test
	public void test02() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	//3.登录，点击任务，点击项目管理，点击我执行的任务，点击新增，点击关闭
	@Test
	public void test03() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		webtest.click("class=icon-plus");
		Thread.sleep(2000);
		webtest.click("id=winiframe_spancancel");
		Thread.sleep(2000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	//4.登录，点击任务，点击项目管理，点击我执行的任务，点击新增，选择项目类型，输入项目名称，点击关闭
	@Test
	public void test04() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		webtest.click("class=icon-plus");
		Thread.sleep(2000);
		
		webtest.enterFrame1("name=openinputiframe");
		webtest.selectByValue("name=type", "一般项目");
		Thread.sleep(1000);
		webtest.type("name=title", "真好");
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(2000);
		webtest.click("id=winiframe_spancancel");
		Thread.sleep(2000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	
	//5.登录，点击任务，点击项目管理，点击我执行的任务，点击新增，选择负责人，点击关闭
		@Test
		public void test05() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.click("class=icon-plus");
			Thread.sleep(2000);
			webtest.enterFrame1("name=openinputiframe");

			webtest.click("id=btnchange_fuze");
			Thread.sleep(1000);
			webtest.type("xpath=//input[starts-with(@id,'changekey')]", "董事长");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@name,'changeuserinput')]");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@id,'changeok')]");
			Thread.sleep(3000);
			webtest.leaveFrame();
			Thread.sleep(2000);
			webtest.click("id=winiframe_spancancel");
			Thread.sleep(2000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
	
		//6.登录，点击任务，点击项目管理，点击我执行的任务，点击新增，选择执行人，点击关闭
		@Test
		public void test06() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.click("class=icon-plus");
			Thread.sleep(2000);
			webtest.enterFrame1("name=openinputiframe");
			Thread.sleep(2000);
			webtest.click("id=btnchange_runuser");
			webtest.type("xpath=//input[starts-with(@id,'changekey')]", "财务总监");
			Thread.sleep(1000);
			webtest.mouseToElementandClick("xpath=//input[contains(@name,'_soukey')]");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@id,'changeok')]");
			Thread.sleep(3000);
			webtest.leaveFrame();
			Thread.sleep(2000);
			webtest.click("id=winiframe_spancancel");
			Thread.sleep(2000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
		
		//7.登录，点击任务，点击项目管理，点击我执行的任务，点击新增，选择进度，点击关闭
		@Test
		public void test07() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.click("class=icon-plus");
			Thread.sleep(2000);
			
			webtest.enterFrame1("name=openinputiframe");
			Thread.sleep(3000);
			webtest.runJs("window.scrollTo(0,300);");
			Thread.sleep(1000);
			webtest.selectByValue("name=progress", "50");
			Thread.sleep(3000);
			webtest.runJs("window.scrollTo(0,-300);");
			Thread.sleep(1000);
			webtest.leaveFrame();
			Thread.sleep(2000);
			webtest.click("id=winiframe_spancancel");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
		
		//8.登录，点击任务，点击项目管理，点击我执行的任务，点击新增，选择状态，点击关闭
		@Test
		public void test08() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.click("class=icon-plus");
			Thread.sleep(2000);
			
			webtest.enterFrame1("name=openinputiframe");
			Thread.sleep(3000);
			webtest.runJs("window.scrollTo(0,300);");
			Thread.sleep(1000);
			webtest.selectByValue("name=status", "3");
			Thread.sleep(1000);
			webtest.runJs("window.scrollTo(0,-300);");
			Thread.sleep(2000);
			webtest.leaveFrame();
			Thread.sleep(2000);
			webtest.click("id=winiframe_spancancel");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}	
		//9.登录，点击任务，点击项目管理，点击我执行的任务，点击新增，随即填入必选项，点击保存
		@Test
		public void test09() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.click("class=icon-plus");
			Thread.sleep(2000);
			
			webtest.enterFrame1("name=openinputiframe");
			Thread.sleep(3000);
			webtest.selectByValue("name=type", "一般项目");
			Thread.sleep(1000);
			webtest.type("name=title", "真好");
			Thread.sleep(1000);
			
			webtest.click("id=btnchange_fuze");
			Thread.sleep(1000);
			webtest.type("xpath=//input[starts-with(@id,'changekey')]", "董事长");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@name,'changeuserinput')]");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@id,'changeok')]");
			Thread.sleep(1000);
			
			webtest.click("id=btnchange_runuser");
			webtest.type("xpath=//input[starts-with(@id,'changekey')]", "财务总监");
			Thread.sleep(1000);
			webtest.mouseToElementandClick("xpath=//input[contains(@name,'_soukey')]");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@id,'changeok')]");
			
			
			webtest.runJs("window.scrollTo(0,300);");
			Thread.sleep(1000);
			webtest.selectByValue("name=progress", "50");
			Thread.sleep(1000);
			webtest.selectByValue("name=status", "3");
			Thread.sleep(1000);
			webtest.click("id=AltS");
			Thread.sleep(3000);
			webtest.leaveFrame();
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}	
		
		//10.登录，点击任务，点击项目管理，点击我执行的任务，点击不同项目类型，点击搜索
		@Test
		public void test10() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.selectByValue("xpath=//select[contains(@id,'selstatus')]", "0");
			Thread.sleep(1000);
			webtest.click("xpath=//button[@click='searchbtn']");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
		//11.登录，点击任务，点击项目管理，点击我执行的任务，点击不同项目类型，点击搜索
		@Test
		public void test11() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.selectByValue("xpath=//select[contains(@id,'selstatus')]", "1");
			Thread.sleep(1000);
			webtest.click("xpath=//button[@click='searchbtn']");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}	
		
		//12.登录，点击任务，点击项目管理，点击我执行的任务，点击不同项目类型，点击搜索
		@Test
		public void test12() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.selectByValue("xpath=//select[contains(@id,'selstatus')]", "5");
			Thread.sleep(1000);
			webtest.click("xpath=//button[@click='searchbtn']");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}		
		//13.登录，点击任务，点击项目管理，点击我执行的任务，点击我未完成项目
		@Test
		public void test13() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.click("xpath=//button[contains(@id,'wwc')]");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
		
		//14.登录，点击任务，点击项目管理，点击我执行的任务，点击我负责项目
		@Test
		public void test14() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.click("xpath=//button[contains(@id,'myfz')]");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
		
		//15.登录，点击任务，点击项目管理，点击我执行的任务，点击我创建项目
		@Test
		public void test15() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.click("xpath=//button[contains(@id,'mycj')]");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}	
		//16.登录，点击任务，点击项目管理，点击我执行的任务，点击我未完成项目，点击我负责项目，点击我创建项目
		@Test
		public void test16() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			webtest.click("xpath=//button[contains(@id,'wwc')]");
			Thread.sleep(1000);
			webtest.click("xpath=//button[contains(@id,'myfz')]");
			Thread.sleep(1000);
			webtest.click("xpath=//button[contains(@id,'mycj')]");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}	
		//17.登录，点击任务，点击项目管理，点击我执行的任务，点击搜索旁下拉框，点击高级搜索（只输入名称）
		@Test
		public void test17() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			
			webtest.click("class=icon-angle-down");
			Thread.sleep(2000);
			webtest.click("xpath=//li[@temp='0']");
			Thread.sleep(2000);
			webtest.type("name=soufields_title","微信");
			Thread.sleep(1000);
			webtest.click("id=searchhigh_btn0");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
	//18.登录，点击任务，点击项目管理，点击我执行的任务，点击搜索旁下拉框，点击高级搜索（只输入编号）
	@Test
	public void test18() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		
		webtest.click("class=icon-angle-down");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='0']");
		Thread.sleep(2000);
		webtest.type("name=soufields_num","android");
		Thread.sleep(1000);
		webtest.click("id=searchhigh_btn0");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	
	//19.登录，点击任务，点击项目管理，点击我执行的任务，点击搜索旁下拉框，点击高级搜索（只输入项目类型）
	@Test
	public void test19() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		
		webtest.click("class=icon-angle-down");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='0']");
		Thread.sleep(2000);
		webtest.selectByValue("name=soufields_type", "一般项目");
		Thread.sleep(1000);
		webtest.click("id=searchhigh_btn0");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	
	//20.登录，点击任务，点击项目管理，点击我执行的任务，点击搜索旁下拉框，点击高级搜索（只输入负责人）
		@Test
		public void test20() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			
			webtest.click("class=icon-angle-down");
			Thread.sleep(2000);
			webtest.click("xpath=//li[@temp='0']");
			Thread.sleep(2000);
			webtest.type("name=soufields_fuze", "管理员");
			Thread.sleep(1000);
			webtest.click("id=searchhigh_btn0");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
		
		//21.登录，点击任务，点击项目管理，点击我执行的任务，点击搜索旁下拉框，点击高级搜索（只输入执行人）
		@Test
		public void test21() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			
			webtest.click("class=icon-angle-down");
			Thread.sleep(2000);
			webtest.click("xpath=//li[@temp='0']");
			Thread.sleep(2000);
			webtest.runJs("window.scrollTo(0,100);");
			webtest.type("name=soufields_runuser", "开发部");
			Thread.sleep(1000);
			webtest.click("id=searchhigh_btn0");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
		
		//22.登录，点击任务，点击项目管理，点击我执行的任务，点击搜索旁下拉框，点击高级搜索（综合搜索）
		@Test
		public void test22() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num79");
			Thread.sleep(2000);
			
			webtest.click("id=menu_list_num69");
			Thread.sleep(2000);
			
			webtest.click("class=icon-angle-down");
			Thread.sleep(2000);
			webtest.click("xpath=//li[@temp='0']");
			Thread.sleep(2000);
			webtest.type("name=soufields_title","微信");
			Thread.sleep(1000);
			webtest.type("name=soufields_num","xiao");
			Thread.sleep(1000);
			webtest.selectByValue("name=soufields_type", "一般项目");
			Thread.sleep(1000);
			webtest.type("name=soufields_fuze", "管理员");
			Thread.sleep(1000);
			webtest.runJs("window.scrollTo(0,100);");
			Thread.sleep(1000);
			webtest.type("name=soufields_runuser", "开发部");
			Thread.sleep(1000);
			webtest.click("id=searchhigh_btn0");
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}		
	
	//23.登录，点击任务，点击项目管理，点击我执行的任务，点击搜索旁下拉框，点击高级搜索（综合搜索）,点击重置
	@Test
	public void test23() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		
		webtest.click("class=icon-angle-down");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='0']");
		Thread.sleep(2000);
		webtest.type("name=soufields_title","微信");
		Thread.sleep(1000);
		webtest.type("name=soufields_num","xiao");
		Thread.sleep(1000);
		webtest.selectByValue("name=soufields_type", "一般项目");
		Thread.sleep(1000);
		webtest.type("name=soufields_fuze", "管理员");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,100);");
		Thread.sleep(1000);
		webtest.type("name=soufields_runuser", "开发部");
		Thread.sleep(1000);
		webtest.click("id=searchhigh_cz");
		Thread.sleep(1000);
		webtest.click("id=searchhigh_spancancel");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}		
	
	//24.登录，点击任务，点击项目管理，点击我执行的任务，点击搜索旁下拉框，点击自定义显示
	@Test
	public void test24() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		
		webtest.click("class=icon-angle-down");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='1']");
		Thread.sleep(5000);
		webtest.click("xpath=//input[@value='base_name']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='base_deptname']");
		Thread.sleep(1000);
		webtest.click("id=searchhigh_btn0");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
		}
	
	//25.登录，点击任务，点击项目管理，点击我执行的任务，点击搜索旁下拉框，点击自定义显示
	@Test
	public void test25() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		
		webtest.click("class=icon-angle-down");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='1']");
		Thread.sleep(5000);
		webtest.click("xpath=//input[@value='title']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='num']");
		Thread.sleep(1000);
		webtest.click("id=searchhigh_btn0");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
		}
	//26.登录，点击任务，点击项目管理，点击我执行的任务，点击搜索旁下拉框，点击自定义显示
	@Test
	public void test26() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		
		webtest.click("class=icon-angle-down");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='1']");
		Thread.sleep(5000);
		webtest.runJs("window.scrollTo(0,300);");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='status']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='caozuo']");
		Thread.sleep(1000);
		webtest.click("id=searchhigh_btn0");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
		}	
	//27.登录，点击任务，点击项目管理，点击我执行的任务，点击点击操作，详情
	@Test
	public void test27() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(@temp,'caozuomenu')]");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='0']");
		Thread.sleep(2000);
		webtest.click("id=winiframe_spancancel");
		Thread.sleep(2000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	
	//28.登录，点击任务，点击项目管理，点击我执行的任务，点击操作，更新进度
	@Test
	public void test28() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(@temp,'caozuomenu')]");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='2']");
		Thread.sleep(2000);
		webtest.selectByValue("name=progress", "20");
		Thread.sleep(1000);
		webtest.click("id=confirm_btn1");
		Thread.sleep(2000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}	
	
	//29.登录，点击任务，点击项目管理，点击我执行的任务，点击操作，更新状态
	@Test
	public void test29() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(@temp,'caozuomenu')]");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='3']");
		Thread.sleep(2000);
		webtest.type("id=confirm_input", "年轻人不讲武德，劝你耗子尾汁");
		Thread.sleep(2000);
		webtest.click("id=confirm_btn1");
		Thread.sleep(2000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}	
	
	//30.登录，点击任务，点击项目管理，点击我执行的任务，点击操作，更新状态
	@Test
	public void test30() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(@temp,'caozuomenu')]");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='5']");
		Thread.sleep(2000);
		webtest.type("id=confirm_input", "年轻人不讲武德，劝你耗子尾汁");
		Thread.sleep(2000);
		webtest.click("id=confirm_btn1");
		Thread.sleep(2000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}	
	//31.登录，点击任务，点击项目管理，点击我执行的任务，点击操作，评论
	@Test
	public void test31() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(@temp,'caozuomenu')]");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='6']");
		Thread.sleep(2000);
		webtest.type("id=confirm_input", "年轻人不讲武德，劝你耗子尾汁");
		Thread.sleep(2000);
		webtest.click("id=confirm_btn1");
		Thread.sleep(2000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}	
	
	//32.登录，点击任务，点击项目管理，点击我执行的任务，点击操作，删除
	@Test
	public void test32() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(@temp,'caozuomenu')]");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='9']");
		Thread.sleep(2000);
		webtest.type("id=confirm_input", "年轻人不讲武德，劝你耗子尾汁");
		Thread.sleep(2000);
		webtest.click("id=confirm_btn1");
		Thread.sleep(2000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	
	//33.登录，点击任务，点击项目管理，点击我的任务，新增，关闭
	@Test
	public void test33() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num65");
		Thread.sleep(2000);
		
		webtest.click("class=icon-plus");
		Thread.sleep(2000);
		webtest.click("id=winiframe_spancancel");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	
	//34.登录，点击任务，点击项目管理，点击我的任务，点击新增，选择项目类型，输入项目名称，点击关闭
	@Test
	public void test34() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num65");
		Thread.sleep(2000);
		
		webtest.click("class=icon-plus");
		Thread.sleep(2000);
		webtest.enterFrame1("name=openinputiframe");
		webtest.selectByValue("name=type", "bug");
		Thread.sleep(1000);
		webtest.type("name=title", "真好");
		Thread.sleep(1000);
		webtest.leaveFrame();
		Thread.sleep(1000);
		webtest.click("id=winiframe_spancancel");
		Thread.sleep(2000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	
	//35.登录，点击任务，点击项目管理，点击我的任务，点击新增，选择项目等级，输入项目名称，点击关闭
	@Test
	public void test35() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num65");
		Thread.sleep(2000);
		
		webtest.click("class=icon-plus");
		Thread.sleep(2000);
		webtest.enterFrame1("name=openinputiframe");
		webtest.selectByValue("name=grade", "高");
		Thread.sleep(1000);
		webtest.type("name=title", "真好");
		Thread.sleep(1000);
		webtest.leaveFrame();
		Thread.sleep(1000);
		webtest.click("id=winiframe_spancancel");
		Thread.sleep(2000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	
	//36.登录，点击任务，点击项目管理，点击我的任务，点击新增，选择负责人，点击关闭
		@Test
		public void test36() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num65");
			Thread.sleep(2000);
			
			webtest.click("class=icon-plus");
			Thread.sleep(2000);
			webtest.enterFrame1("name=openinputiframe");
			
			
			
			webtest.click("id=btnchange_dist");
			Thread.sleep(1000);
			webtest.type("xpath=//input[starts-with(@id,'changekey')]", "董事长");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@name,'changeuserinput')]");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@id,'changeok')]");
			Thread.sleep(1000);
			webtest.leaveFrame();
			Thread.sleep(1000);
			webtest.click("id=winiframe_spancancel");
			Thread.sleep(2000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
		
		//37.登录，点击任务，点击项目管理，点击我的任务，点击新增，选择执行人，点击关闭
		@Test
		public void test37() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num65");
			Thread.sleep(2000);
			
			webtest.click("class=icon-plus");
			Thread.sleep(2000);
			webtest.enterFrame1("name=openinputiframe");
			
			webtest.click("id=btnchange_ddname");
			webtest.type("xpath=//input[starts-with(@id,'changekey')]", "财务总监");
			Thread.sleep(1000);
			webtest.mouseToElementandClick("xpath=//input[contains(@name,'_soukey')]");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@id,'changeok')]");
			Thread.sleep(1000);
			webtest.leaveFrame();
			Thread.sleep(1000);
			webtest.click("id=winiframe_spancancel");
			Thread.sleep(2000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
		
		//38.登录，点击任务，点击项目管理，点击我执行的任务，点击新增，选择分值，点击关闭
		@Test
		public void test38() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num65");
			Thread.sleep(2000);
		
			webtest.click("class=icon-plus");
			Thread.sleep(2000);
			
			webtest.enterFrame1("name=openinputiframe");
			Thread.sleep(3000);
			webtest.runJs("window.scrollTo(0,300);");
			webtest.type("name=score", "5");
			Thread.sleep(1000);
			webtest.leaveFrame();
			Thread.sleep(1000);
			webtest.click("id=winiframe_spancancel");
			Thread.sleep(2000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}
		

		//39.登录，点击任务，点击项目管理，点击我执行的任务，点击新增，随即填入必选项，点击保存
		@Test
		public void test39() throws InterruptedException {
			webtest.click("xpath=//span[@pmenuid='66']");
			Thread.sleep(2000);
			webtest.click("id=menu_list_num65");
			Thread.sleep(2000);
			webtest.click("class=icon-plus");
			Thread.sleep(2000);
			
			webtest.enterFrame1("name=openinputiframe");
			Thread.sleep(3000);
			webtest.selectByValue("name=type", "bug");
			Thread.sleep(1000);
			webtest.selectByValue("name=grade", "高");
			Thread.sleep(1000);
			webtest.type("name=title", "真好");
			Thread.sleep(1000);
			
			webtest.click("id=btnchange_dist");
			Thread.sleep(1000);
			webtest.type("xpath=//input[starts-with(@id,'changekey')]", "董事长");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@name,'changeuserinput')]");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@id,'changeok')]");
			Thread.sleep(1000);
			
			webtest.click("id=btnchange_ddname");
			webtest.type("xpath=//input[starts-with(@id,'changekey')]", "财务总监");
			Thread.sleep(1000);
			webtest.mouseToElementandClick("xpath=//input[contains(@name,'_soukey')]");
			Thread.sleep(1000);
			webtest.click("xpath=//input[starts-with(@id,'changeok')]");
			Thread.sleep(1000);
			
			webtest.runJs("window.scrollTo(0,300);");
			webtest.type("name=score", "5");
			Thread.sleep(1000);
			webtest.click("id=AltS");
			webtest.leaveFrame();
			Thread.sleep(3000);
			webtest.click("class=icon-remove");
			Thread.sleep(3000);
		}	
	//40.登录，点击任务，点击项目管理，点击我的任务，点击不同项目类型，点击搜索
	@Test
	public void test40() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num65");
		Thread.sleep(2000);

		webtest.selectByValue("xpath=//select[contains(@id,'selstatus')]", "0");
		Thread.sleep(1000);
		webtest.click("xpath=//button[@click='searchbtn']");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	//41.登录，点击任务，点击项目管理，点击我的任务，点击不同项目类型，点击搜索
	@Test
	public void test41() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num65");
		Thread.sleep(2000);
		webtest.selectByValue("xpath=//select[contains(@id,'selstatus')]", "1");
		Thread.sleep(1000);
		webtest.click("xpath=//button[@click='searchbtn']");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}	
	
	//42.登录，点击任务，点击项目管理，点击我的任务，点击不同项目类型，点击搜索
	@Test
	public void test42() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num65");
		Thread.sleep(2000);
		webtest.selectByValue("xpath=//select[contains(@id,'selstatus')]", "5");
		Thread.sleep(1000);
		webtest.click("xpath=//button[@click='searchbtn']");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}		
	//43.登录，点击任务，点击项目管理，点击我的任务，点击我未完成项目
	@Test
	public void test43() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num65");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(@id,'wwc')]");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	
	//44.登录，点击任务，点击项目管理，点击我的任务，点击我负责项目
	@Test
	public void test44() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num65");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(@id,'myfz')]");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	
	//45.登录，点击任务，点击项目管理，点击我的任务，点击我创建项目
	@Test
	public void test45() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		
		webtest.click("id=menu_list_num65");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(@id,'mycj')]");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}	
	//46.登录，点击任务，点击项目管理，点击我的任务，点击我未完成项目，点击我负责项目，点击我创建项目
	@Test
	public void test46() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num65");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(@id,'wwc')]");
		Thread.sleep(1000);
		webtest.click("xpath=//button[contains(@id,'myfz')]");
		Thread.sleep(1000);
		webtest.click("xpath=//button[contains(@id,'mycj')]");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}	
	
	
	
	//47.登录，点击任务，点击项目管理，点击所有任务，点击搜索旁下拉框，点击高级搜索（只输入名称）
	@Test
	public void test47() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num81");
		Thread.sleep(2000);
		
		
		webtest.click("class=icon-angle-down");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='0']");
		Thread.sleep(2000);
		webtest.type("name=soufields_title","信呼");
		Thread.sleep(1000);
		webtest.click("id=searchhigh_btn0");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}

	//48.登录，点击任务，点击项目管理，点击所有任务，点击搜索旁下拉框，点击高级搜索（只输入项目类型）
	@Test
	public void test48() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num81");
		Thread.sleep(2000);
		
		
		webtest.click("class=icon-angle-down");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='0']");
		Thread.sleep(2000);
		webtest.selectByValue("name=soufields_type", "bug");
		Thread.sleep(1000);
		webtest.click("id=searchhigh_btn0");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}


	
	//49.登录，点击任务，点击项目管理，点击所有任务，点击搜索旁下拉框，点击高级搜索（只输入执行人）
	@Test
	public void test49() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num81");
		Thread.sleep(2000);
		
		webtest.click("class=icon-angle-down");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='0']");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,100);");
		webtest.type("name=soufields_dist", "磐石");
		Thread.sleep(1000);
		webtest.click("id=searchhigh_btn0");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}
	
	//50.登录，点击任务，点击项目管理，点击所有任务，点击搜索旁下拉框，点击高级搜索（综合搜索）
	@Test
	public void test50() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(2000);
		webtest.click("id=menu_list_num81");
		Thread.sleep(2000);
		
		
		webtest.click("class=icon-angle-down");
		Thread.sleep(2000);
		webtest.click("xpath=//li[@temp='0']");
		Thread.sleep(2000);
		
		webtest.type("name=soufields_title","真好");
		Thread.sleep(1000);
		webtest.selectByValue("name=soufields_type", "bug");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,100);");
		webtest.type("name=soufields_dist", "磐石");
		Thread.sleep(1000);
		webtest.click("id=searchhigh_btn0");
		Thread.sleep(3000);
		webtest.click("class=icon-remove");
		Thread.sleep(3000);
	}		
}