package com.webtest.core;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class WordPressTest extends BaseTest {
	// 1.登录，点击页面，点击文章页面
	@Test
	public void test01() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=post-title-0");
		Thread.sleep(2000);
		webtest.click("id=block-1e682d28-4dfc-4348-b30d-86ec301deaa9");
		Thread.sleep(3000);
	}

	// 2.登录，点击媒体，点击新建页面,点击添加标题，输入标题
	@Test
	public void test02() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=post-title-0");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.enterFrame1("class=editor-post-title__input");
		Thread.sleep(1000);
		webtest.type("name=title", "测试");
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(2000);
	}

	// 3.登录，点击页面，点击新建页面,点击添加标题，输入标题，点击发布
	@Test
	public void test03() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.enterFrame1("class=editor-post-title__input");
		Thread.sleep(1000);
		webtest.type("name=title", "测试");
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 4.登录，点击页面，点击新建页面,点击添加标题，输入标题，点击保存
	@Test
	public void test04() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.enterFrame1("class=editor-post-title__input");
		Thread.sleep(1000);
		webtest.type("name=title", "测试");
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-save-draft is-tertiary");
		Thread.sleep(3000);
	}

	// 5.登录，点击页面，点击新建页面,点击添加区块
	@Test
	public void test05() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
	}

	// 6.登录，点击页面，点击新建页面,点击添加区块,点击分页符
	@Test
	public void test06() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=block-editor-block-icon has-colors");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 7.登录，点击页面，点击新建页面,点击添加区块,点击段落
	@Test
	public void test07() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=block-editor-block-types-list__item-icon");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 8.登录，点击页面，点击新建页面,点击添加区块,点击引语
	@Test
	public void test08() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=block-editor-block-types-list__item-icon");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 9.登录，点击页面，点击新建页面,点击添加区块,点击图像
	@Test
	public void test09() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=block-editor-block-icon has-colors");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 10.登录，点击页面，点击新建页面,点击添加区块,点击图像，点击上传
	@Test
	public void test10() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=block-editor-block-icon has-colors");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-media-placeholder__button block-editor-media-placeholder__upload-button is-secondary");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 11.登录，点击页面，点击新建页面,点击添加区块,点击图像，点击媒体库
	@Test
	public void test11() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=block-editor-block-icon has-colors");
		Thread.sleep(2000);
		webtest.click("class=components-button is-secondary");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 12.登录，点击页面，点击新建页面,点击添加区块,点击图像，点击URl上传，
	@Test
	public void test12() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=block-editor-block-icon has-colors");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-media-placeholder__button is-secondary");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 13.登录，点击页面，点击新建页面,点击添加区块,点击图像，点击URl上传，输入URL，点击应用
	@Test
	public void test13() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=block-editor-block-icon has-colors");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-media-placeholder__button is-secondary");
		Thread.sleep(2000);
		webtest.type("class=block-editor-media-placeholder__url-input-field", "");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-media-placeholder__url-input-submit-button has-icon");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 14.登录，点击页面，点击新建页面,点击添加区块,点击搜索区块（输入内容）
	@Test
	public void test14() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.type("class=block-editor-inserter__search","");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 15.登录，点击页面，点击新建页面,点击添加区块,点击标题
	@Test
	public void test15() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-heading");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 16.登录，点击页面，点击新建页面,点击添加区块,点击画廊
	@Test
	public void test16() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-gallery");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		
	}

	// 17.登录，点击页面，点击新建页面,点击添加区块,点击列表
	@Test
	public void test17() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-list");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 18.登录，点击页面，点击新建页面,点击添加区块,点击音频
	@Test
	public void test18() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-audio");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 19.登录，点击页面，点击新建页面,点击添加区块,点击封面
	@Test
	public void test19() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-cover");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 20.登录，点击页面，点击新建页面,点击添加区块,点击通用区块
	@Test
	public void test20() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[2]/h2/button");
		Thread.sleep(2000);
	}

	// 21.登录，点击页面，点击新建页面,点击添加区块,点击通用区块,点击文件
	@Test
	public void test21() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[2]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-file");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 22.登录，点击页面，点击新建页面,点击添加区块，点击格式
	@Test
	public void test22() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[3]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 23.登录，点击页面，点击新建页面,点击添加区块，点击格式，点击代码
	@Test
	public void test23() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[3]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-code");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 24.登录，点击页面，点击新建页面,点击添加区块，点击格式，点击经典
	@Test
	public void test24() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[3]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-freeform");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 25.登录，点击页面，点击新建页面,点击添加区块，点击格式，点击自定义HTML
	@Test
	public void test25() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[3]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-html");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 26.登录，点击页面，点击新建页面,点击添加区块，点击格式，点击预格式化的
	@Test
	public void test26() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[3]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-preformatted");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 27.登录，点击页面，点击新建页面,点击添加区块，点击格式，点击引文
	@Test
	public void test27() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[3]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-pullquote");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 28.登录，点击页面，点击新建页面,点击添加区块，点击格式，点击表格
	@Test
	public void test28() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[3]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-table");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 29.登录，点击页面，点击新建页面,点击添加区块，点击格式，点击诗句
	@Test
	public void test29() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[3]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-verse");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 30.登录，点击页面，点击新建页面,点击添加区块,点击布局元素
	@Test
	public void test30() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[4]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 31.登录，点击页面，点击新建页面,点击添加区块,点击布局元素，点击按钮
	@Test
	public void test31() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[4]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-buttons");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 32.登录，点击页面，点击新建页面,点击添加区块,点击布局元素，点击栏目
	@Test
	public void test32() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[4]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-columns");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 33.登录，点击页面，点击新建页面,点击添加区块,点击布局元素，点击群组
	@Test
	public void test33() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[4]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-group");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 34.登录，点击页面，点击新建页面,点击添加区块,点击布局元素，点击媒体和文本
	@Test
	public void test34() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[4]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-media-text");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 35.登录，点击页面，点击新建页面,点击添加区块,点击布局元素，点击更多
	@Test
	public void test35() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[4]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-more");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 36.登录，点击页面，点击新建页面,点击添加区块,点击布局元素，点击分隔符
	@Test
	public void test36() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[4]/h2/button");
		Thread.sleep(2000);
		
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-separator");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 37.登录，点击页面，点击新建页面,点击添加区块,点击布局元素，点击空白
	@Test
	public void test37() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[4]/h2/button");
		Thread.sleep(2000);
		
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-spacer");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 38.登录，点击页面，点击新建页面,点击添加区块,点击小工具
	@Test
	public void test38() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[5]/h2/button");
		Thread.sleep(2000);
	}

	// 39.登录，点击页面，点击新建页面,点击添加区块,点击小工具，点击短代码
	@Test
	public void test39() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[5]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-shortcode");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 40.登录，点击页面，点击新建页面,点击添加区块,点击小工具，点击文章归档
	@Test
	public void test40() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[5]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-archives");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 41.登录，点击页面，点击新建页面,点击添加区块,点击小工具，点击日历
	@Test
	public void test41() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[5]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-calendar");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 42.登录，点击页面，点击新建页面,点击添加区块,点击小工具，点击分类目录
	@Test
	public void test42() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[5]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-categories");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 43.登录，点击页面，点击新建页面,点击添加区块,点击小工具，点击最新评论
	@Test
	public void test43() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[5]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-latest-comments");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 44.登录，点击页面，点击新建页面,点击添加区块,点击小工具，点击最新文章
	@Test
	public void test44() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[5]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-latest-posts");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 45.登录，点击页面，点击新建页面,点击添加区块,点击小工具，点击RSS
	@Test
	public void test45() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[5]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-rss");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 46.登录，点击页面，点击新建页面,点击添加区块,点击小工具，点击搜索
	@Test
	public void test46() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[5]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-search");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 47.登录，点击页面，点击新建页面,点击添加区块,点击小工具，点击社交网络图标
	@Test
	public void test47() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[5]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-social-links");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
	}

	// 48.登录，点击页面，点击新建页面,点击添加区块,点击小工具，点击标签云
	@Test
	public void test48() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("class=page-title-action");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button/svg");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[5]/h2/button");
		Thread.sleep(2000);
		webtest.click("class=components-button block-editor-block-types-list__item editor-block-list-item-tag-cloud");
		Thread.sleep(2000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);
		webtest.click("class=components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary");
		Thread.sleep(3000);

	}

	// 49.登录，点击页面，将所有页面移到回收站
	@Test
	public void test49() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.enterFrame1("name=action");
		webtest.selectByValue("name=trash", "移动到回收站");
		Thread.sleep(1000);
		webtest.click("id=cb-select-all-1");
		Thread.sleep(2000);
		webtest.click("id=doaction");
		Thread.sleep(2000);
	}

	// 50.登录，点击页面，将回收站中的页面永久删除
	@Test
	public void test50() throws InterruptedException {
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(2000);
		webtest.click("class=wp-menu-name");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.enterFrame1("name=action");
		webtest.selectByValue("name=delete", "移动到回收站");
		Thread.sleep(1000);
		webtest.click("id=cb-select-all-1");
		Thread.sleep(2000);
		webtest.click("id=doaction");
		Thread.sleep(2000);
		
	}
}