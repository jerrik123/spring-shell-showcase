/**
 * Project Name:spring-shell-showcase
 * File Name:FirstCommand.java
 * Package Name:com.njq.nongfadai.command
 * Date:2017年5月14日上午11:41:59
 * Copyright (c) 2017, yangjie_software@163.com All Rights Reserved.
*/

package com.njq.nongfadai.command;

import java.util.concurrent.TimeUnit;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

/**
 * ClassName: SecondCommand
 * Description: 第二个spring shell例子.
 * Date: 2017年5月14日 上午11:41:59
 * Copyright (c) 2017, yangjie_software@163.com All Rights Reserved
 * Author: Jerrik
 */
@Component
public class SecondCommand implements CommandMarker {


	@CliCommand(value = "open-account",help="开户")
	public String batchOpenAccount(
			@CliOption(key = "sleep" ,mandatory = false,unspecifiedDefaultValue = "0" , help = "开户时间间隔(系统休眠)",specifiedDefaultValue = "0" ) final String sleep,
			@CliOption(key = "from" ,mandatory = false,unspecifiedDefaultValue = "0" , help = "从第from行开始执行",specifiedDefaultValue = "0"  ) final String from,
			@CliOption(key = "to" ,mandatory = false,unspecifiedDefaultValue = "0" , help = "执行到第to行" ) final String to){
		
		System.out.println("request param-> sleep: " + sleep + " ,from: " + from + " ,to: " + to);
		try {
			if(Integer.parseInt(sleep)>0){
				System.out.println("系统自动休眠: " + sleep + "秒.");
				TimeUnit.SECONDS.sleep(Integer.parseInt(sleep));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return "DONE";
	}
}

