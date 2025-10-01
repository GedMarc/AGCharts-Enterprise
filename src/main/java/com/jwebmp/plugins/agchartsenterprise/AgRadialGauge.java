package com.jwebmp.plugins.agchartsenterprise;

import com.jwebmp.plugins.agchartsenterprise.options.gauge.AgRadialGaugeOptions;
import com.jwebmp.plugins.agchartsenterprise.options.gauge.AgRadialGaugeScale;

/**
 * Convenience Radial Gauge component.
 * <p>
 * Provides a simple way to instantiate a gauge with value and scale min/max.
 */
public class AgRadialGauge extends AgGauge<AgRadialGauge>
{
    private Number value;
    private Number min;
    private Number max;

    public AgRadialGauge(String id, Number value, Number min, Number max)
    {
        super(id);
        this.value = value;
        this.min = min;
        this.max = max;
    }

    public AgRadialGauge setValue(Number value)
    {
        this.value = value;
        return this;
    }

    public AgRadialGauge setMin(Number min)
    {
        this.min = min;
        return this;
    }

    public AgRadialGauge setMax(Number max)
    {
        this.max = max;
        return this;
    }

    @Override
    public AgRadialGaugeOptions<?> getInitialOptions()
    {
        AgRadialGaugeScale<?> scale = new AgRadialGaugeScale<>()
                .setMin(min)
                .setMax(max);
        return new AgRadialGaugeOptions<>()
                .setValue(value)
                .setScale(scale);
    }
}
