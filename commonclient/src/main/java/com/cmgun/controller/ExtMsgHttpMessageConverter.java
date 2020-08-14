package com.cmgun.controller;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractGenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * 扩展请求消息转换器
 *
 * @author chenqilin
 * @date 2020/3/19
 */
public class ExtMsgHttpMessageConverter extends AbstractGenericHttpMessageConverter<Object> {

    /**
     * url路径中的资源数量，即/的分割数量
     */
    private final static int URL_PATH_RESOURCES = 6;
    private static final String UTF_8 = "UTF-8";


    /**
     * 只处理 MediaType=application/json
     */
    public ExtMsgHttpMessageConverter() {
        super(MediaType.APPLICATION_JSON);
    }

    @Override
    public boolean canRead(Type type, Class<?> contextClass, MediaType mediaType) {
        if (!canRead(mediaType)) {
            // mediaType不合法
            return false;
        }
        return false;
    }

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return this.canRead(clazz, null, mediaType);
    }

    @Override
    protected boolean canWrite(MediaType mediaType) {
        // 暂时不做响应消息转换
        return false;
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        // 暂时不做响应消息转换
        return false;
    }

    @Override
    protected void writeInternal(Object finGatewayRequestReq, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        // 暂时不做响应消息转换
        throw new UnsupportedOperationException();
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        // 不会走到这个方法，直接在canRead中处理
        return false;
    }

    @Override
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return readAndConvert(clazz, null, inputMessage);
    }

    @Override
    public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return readAndConvert(type, contextClass, inputMessage);
    }

    /**
     * 获取扩展消息配置
     *
     * @return 扩展消息配置beanName
     */
    private String getExtMsgConvert() {
        return "false";
    }

    /**
     * 读取请求并根据策略进行转换
     *
     * @param type
     * @param contextClass
     * @param inputMessage
     * @return
     */
    private Object readAndConvert(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException {
        return null;
    }
}
