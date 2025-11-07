package com.jwebmp.plugins.agchartsenterprise.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.plugins.agcharts.options.series.AgBarSeriesLabelOptions;
import com.jwebmp.plugins.agcharts.options.series.AgSeriesBaseOptions;
import com.jwebmp.plugins.agcharts.options.series.AgSeriesListeners;

import java.util.List;

/**
 * Radial Column (aka Circular Column) series options for AG Charts Enterprise.
 * <p>
 * Mirrors API described in docs for 'radial-column' with angle and radius keys, stacking/grouping,
 * width controls, and standard styling/tooltip/highlight hooks.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgRadialColumnSeriesOptions<J extends AgRadialColumnSeriesOptions<J>> extends AgSeriesBaseOptions<J>
{
    // --- Required keys ---
    private String angleKey;   // DatumKey (category for polar angle)
    private String radiusKey;  // DatumKey (numeric for radius)

    // --- Names for display ---
    private String angleName;
    private String radiusName;
    private String legendItemName;

    // --- Identity/Data/Visibility ---
    @JsonProperty("id")
    private String id;                 // seriesId exposed to callbacks
    private List<?> data;              // TDatum[]
    private Boolean visible;

    // --- Interaction/Legend/Listeners ---
    private String cursor;             // CSS cursor
    private Object context;            // user context passed to callbacks
    private Object nodeClickRange;     // 'nearest' | 'exact' | number
    private Boolean showInLegend;
    private AgSeriesListeners<?> listeners;

    // --- Grouping/Stacking/Normalisation ---
    private Boolean grouped;           // adjacent grouping
    private Boolean stacked;           // stacked columns
    private String stackGroup;         // grouping id for stacks
    private Number normalizedTo;       // normalise stacks to value

    // --- Geometry/Width ---
    private Double columnWidthRatio;   // ratio
    private Double maxColumnWidthRatio;// ratio relative to diameter

    // --- Styling ---
    private Integer cornerRadius;      // rounded corners
    private Double fillOpacity;
    private String stroke;
    private Integer strokeWidth;
    private Double strokeOpacity;
    private List<Integer> lineDash;
    private Integer lineDashOffset;

    // --- Labels ---
    private AgBarSeriesLabelOptions<?> label; // reuse bar label options for value labels

    public AgRadialColumnSeriesOptions()
    {
        setType("radial-column");
    }

    // --- Getters/Setters ---
    public String getAngleKey() {return angleKey;}

    public J setAngleKey(String angleKey)
    {
        this.angleKey = angleKey;
        return (J) this;
    }

    public String getRadiusKey() {return radiusKey;}

    public J setRadiusKey(String radiusKey)
    {
        this.radiusKey = radiusKey;
        return (J) this;
    }

    public String getAngleName() {return angleName;}

    public J setAngleName(String angleName)
    {
        this.angleName = angleName;
        return (J) this;
    }

    public String getRadiusName() {return radiusName;}

    public J setRadiusName(String radiusName)
    {
        this.radiusName = radiusName;
        return (J) this;
    }

    public String getLegendItemName() {return legendItemName;}

    public J setLegendItemName(String legendItemName)
    {
        this.legendItemName = legendItemName;
        return (J) this;
    }

    public String getId() {return id;}

    public J setId(String id)
    {
        this.id = id;
        setSeriesId(id);
        return (J) this;
    }

    public List<?> getData() {return data;}

    public J setData(List<?> data)
    {
        this.data = data;
        return (J) this;
    }

    public Boolean getVisible() {return visible;}

    public J setVisible(Boolean visible)
    {
        this.visible = visible;
        return (J) this;
    }

    public String getCursor() {return cursor;}

    public J setCursor(String cursor)
    {
        this.cursor = cursor;
        return (J) this;
    }

    public Object getContext() {return context;}

    public J setContext(Object context)
    {
        this.context = context;
        return (J) this;
    }

    public Object getNodeClickRange() {return nodeClickRange;}

    public J setNodeClickRange(String range)
    {
        this.nodeClickRange = range;
        return (J) this;
    }

    public J setNodeClickRange(Integer pixels)
    {
        this.nodeClickRange = pixels;
        return (J) this;
    }

    public Boolean getShowInLegend() {return showInLegend;}

    public J setShowInLegend(Boolean showInLegend)
    {
        this.showInLegend = showInLegend;
        return (J) this;
    }

    public AgSeriesListeners<?> getListeners() {return listeners;}

    public J setListeners(AgSeriesListeners<?> listeners)
    {
        this.listeners = listeners;
        return (J) this;
    }

    public Boolean getGrouped() {return grouped;}

    public J setGrouped(Boolean grouped)
    {
        this.grouped = grouped;
        return (J) this;
    }

    public Boolean getStacked() {return stacked;}

    public J setStacked(Boolean stacked)
    {
        this.stacked = stacked;
        return (J) this;
    }

    public String getStackGroup() {return stackGroup;}

    public J setStackGroup(String stackGroup)
    {
        this.stackGroup = stackGroup;
        return (J) this;
    }

    public Number getNormalizedTo() {return normalizedTo;}

    public J setNormalizedTo(Number normalizedTo)
    {
        this.normalizedTo = normalizedTo;
        return (J) this;
    }

    public Double getColumnWidthRatio() {return columnWidthRatio;}

    public J setColumnWidthRatio(Double columnWidthRatio)
    {
        this.columnWidthRatio = columnWidthRatio;
        return (J) this;
    }

    public Double getMaxColumnWidthRatio() {return maxColumnWidthRatio;}

    public J setMaxColumnWidthRatio(Double maxColumnWidthRatio)
    {
        this.maxColumnWidthRatio = maxColumnWidthRatio;
        return (J) this;
    }

    public Integer getCornerRadius() {return cornerRadius;}

    public J setCornerRadius(Integer cornerRadius)
    {
        this.cornerRadius = cornerRadius;
        return (J) this;
    }

    public Double getFillOpacity() {return fillOpacity;}

    public J setFillOpacity(Double fillOpacity)
    {
        this.fillOpacity = fillOpacity;
        return (J) this;
    }

    public String getStroke() {return stroke;}

    public J setStroke(String stroke)
    {
        this.stroke = stroke;
        return (J) this;
    }

    public Integer getStrokeWidth() {return strokeWidth;}

    public J setStrokeWidth(Integer strokeWidth)
    {
        this.strokeWidth = strokeWidth;
        return (J) this;
    }

    public Double getStrokeOpacity() {return strokeOpacity;}

    public J setStrokeOpacity(Double strokeOpacity)
    {
        this.strokeOpacity = strokeOpacity;
        return (J) this;
    }

    public List<Integer> getLineDash() {return lineDash;}

    public J setLineDash(List<Integer> lineDash)
    {
        this.lineDash = lineDash;
        return (J) this;
    }

    public Integer getLineDashOffset() {return lineDashOffset;}

    public J setLineDashOffset(Integer lineDashOffset)
    {
        this.lineDashOffset = lineDashOffset;
        return (J) this;
    }

    public AgBarSeriesLabelOptions<?> getLabel() {return label;}

    public J setLabel(AgBarSeriesLabelOptions<?> label)
    {
        this.label = label;
        return (J) this;
    }
}