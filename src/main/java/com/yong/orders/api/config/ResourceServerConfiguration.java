package com.yong.orders.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author LiangYong
 * @createdDate 2017/11/5
 * TODO 将resource server config 配置成依赖，而不是每一个API层都重新写一个 ResourceServerConfiguration
 * TODO 校验完成后，如果url没有匹配上，依然返回401，pending fixed
 */


@Configuration
@EnableResourceServer
@EnableOAuth2Client
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		//TODO use config protected-urls instead of hard code
		http.authorizeRequests()
			.antMatchers(HttpMethod.GET, "/*.html", "/**/*.css", "/**/*.js", "/**/*.png").permitAll()
			.antMatchers("/v2/api-docs", "/swagger-resources/**").permitAll()
			.anyRequest().authenticated().and().csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	@Bean
	public OAuth2RestTemplate oauth2RestTemplate(OAuth2ClientContext oauth2ClientContext, OAuth2ProtectedResourceDetails details) {
		return new OAuth2RestTemplate(details, oauth2ClientContext);
	}

}
