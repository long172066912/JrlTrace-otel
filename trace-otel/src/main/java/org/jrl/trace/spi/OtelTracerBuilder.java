package org.jrl.trace.spi;

import org.jrl.trace.JrlTracer;
import org.jrl.trace.otel.JrlOtelTracer;
import io.opentelemetry.api.GlobalOpenTelemetry;

/**
 * Otel实现
 *
 * @author JerryLong
 * @version V1.0
 */
public class OtelTracerBuilder implements JrlTracerBuilder {
    /**
     * 构建一个新的Tracer
     *
     * @param name 名称
     * @return JrlTracer
     */
    @Override
    public JrlTracer buildTracer(String name) {
        return new JrlOtelTracer(GlobalOpenTelemetry.getTracer(name));
    }
}
