package com.ectumotech.upd;

import com.ectumotech.upd.uil.*;
import com.ectumotech.upd.modell.*;

import com.ectumotech.upd.controll.*;

public class TestUPD {
	public static void main(String[] args) {
	/**
	 * 维护管理界面
	 */
	Maintainace maintainace = new Maintainace();
		/**
		 * 新建数据库
		 */
		Datum database = new Datum();
			database.initData();		//初始化数据库资料
		/**
		 * 新建UI菜单
		 */
		UIshow UI = new UIshow();
			UI.initMenu();  			//初始化UI菜单
	maintainace.setDatum(database);		//装载数据信息
	maintainace.setuIshow(UI);			//装载界面
	maintainace.choiceMain();			//进入维护系统界面选择	
	
	}
}
