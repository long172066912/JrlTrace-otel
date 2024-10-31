package com.jrl.trace;

/**
 * 链路单节点信息
 * @author JerryLong
 * @version V1.0
 */
public interface JrlSpan {
    /**
     * 获取traceId
     *
     * @return
     */
    String getTraceId();

    /**
     * 获取SpanId
     *
     * @return
     */
    String getSpanId();

    /**
     * 添加tag
     *
     * @param key
     * @param value
     */
    void addTag(String key, String value);

    /**
     * 结束
     */
    void end();
}