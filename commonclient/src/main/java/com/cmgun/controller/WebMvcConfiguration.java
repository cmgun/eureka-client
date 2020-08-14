package com.cmgun.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 扩展WebMvcConfigurer
 *
 * @author chenqilin
 * @date 2020/3/20
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    /**
     * 扩展Http消息转换器
     * @param converters
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(extMsgConverter());
    }

    /**
     * 金单融处理特殊渠道的消息扩展转换
     * @return
     */
    @Bean
    public ExtMsgHttpMessageConverter extMsgConverter() {
        return new ExtMsgHttpMessageConverter();
    }
}
