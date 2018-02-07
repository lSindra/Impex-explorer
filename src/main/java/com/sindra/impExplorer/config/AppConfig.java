package com.sindra.impExplorer.config;

import com.sindra.impExplorer.services.ImpexFileParser;
import com.sindra.impExplorer.services.impl.ImpexFileParserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public ImpexFileParser impexFileParser() {
		return new ImpexFileParserImpl();
	}
}
