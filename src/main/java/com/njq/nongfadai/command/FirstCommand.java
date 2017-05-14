/**
 * Project Name:spring-shell-showcase
 * File Name:FirstCommand.java
 * Package Name:com.njq.nongfadai.command
 * Date:2017年5月14日上午11:41:59
 * Copyright (c) 2017, yangjie_software@163.com All Rights Reserved.
*/

package com.njq.nongfadai.command;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

/**
 * ClassName: FirstCommand
 * Description: 第一个spring shell例子.
 * Date: 2017年5月14日 上午11:41:59
 * Copyright (c) 2017, yangjie_software@163.com All Rights Reserved
 * Author: Jerrik
 */
@Component
public class FirstCommand implements CommandMarker {

	@CliCommand(value = "hello",help = "第一个hello world spring shell命令.")
	public String sayHello(
			@CliOption(key = "hints",mandatory = false,help = "提示语") final String hints){
		System.out.println("sayHello->: " + hints);
		return hints;
	}
}

