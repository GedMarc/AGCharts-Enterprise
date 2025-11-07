package com.jwebmp.plugins.agchartsenterprise.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.plugins.agcharts.options.axes.AgAxisBaseOptions;

/**
 * Radius Number Axis options for polar charts.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgRadiusNumberAxisOptions<J extends AgRadiusNumberAxisOptions<J>> extends AgAxisBaseOptions<J>
{
    private Double innerRadiusRatio; // 0..1 sets inner hole size
    private Integer positionAngle;   // degrees for axis line position

    public AgRadiusNumberAxisOptions()
    {
        setType("radius-number");
    }

    public Double getInnerRadiusRatio() {return innerRadiusRatio;}

    public J setInnerRadiusRatio(Double innerRadiusRatio)
    {
        this.innerRadiusRatio = innerRadiusRatio;
        return (J) this;
    }

    public Integer getPositionAngle() {return positionAngle;}

    public J setPositionAngle(Integer positionAngle)
    {
        this.positionAngle = positionAngle;
        return (J) this;
    }
}
