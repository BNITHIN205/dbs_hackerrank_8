package com.dbs.portfolio.config;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerConfig {
	 @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2).select()
	            .apis(RequestHandlerSelectors
	            .basePackage("DbsEquityTradePortFolioController"))
	            .paths(PathSelectors.regex("/.*"))
	            .build().apiInfo(apiEndPointsInfo());
	    }

	
	private static ApiInfo apiEndPointsInfo() {
	        return new ApiInfoBuilder().title(" Vhub API Documentation ")
	            .description("vHub is a growing development platform inspired by a unique software development methodology to assemble solution asset and build solutions, and solve complex use cases and challenges. You can host your solutions, platforms, components, and frameworks that can be leveraged by Virtusans in their projects and solution development journey")
	            .version("Andromeda 2.1")
	           // .termsOfServiceUrl("https://developer.virtusa.com")
	            .contact(new Contact("DeveloperSupportTeam", "", "developersupport@virtusa.com"))
	            .license("Apache 2.0")
	            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
	            .build();
	    }
}
