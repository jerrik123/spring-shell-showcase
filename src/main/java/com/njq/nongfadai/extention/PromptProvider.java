package com.njq.nongfadai.extention;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultPromptProvider;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class PromptProvider extends DefaultPromptProvider {

	@Override
	public String getPrompt() {
		return "njq-shell>";
	}

	@Override
	public String getProviderName() {
		return "#";
	}

}
