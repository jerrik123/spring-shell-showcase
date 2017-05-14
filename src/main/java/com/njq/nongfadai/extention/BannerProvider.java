package com.njq.nongfadai.extention;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultBannerProvider;
import org.springframework.shell.support.util.OsUtils;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class BannerProvider extends DefaultBannerProvider {

	public String getBanner() {
		StringBuffer buf = new StringBuffer();
		buf.append("=======================================" + OsUtils.LINE_SEPARATOR);
		buf.append("*                                      *" + OsUtils.LINE_SEPARATOR);
		buf.append("*              常用命令行工具                                  *" + OsUtils.LINE_SEPARATOR);
		buf.append("*                                      *" + OsUtils.LINE_SEPARATOR);
		buf.append("=======================================" + OsUtils.LINE_SEPARATOR);
		buf.append("Version:" + this.getVersion());
		return buf.toString();
	}

	public String getVersion() {
		return "1.0.0";
	}

	public String getWelcomeMessage() {
		return "Welcome to use njq batch shell";
	}

	@Override
	public String getProviderName() {
		return "Njq Utility Banner";
	}

}
