package com.jwebmp.plugins.agchartsenterprise.options.gauge;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.agcharts.options.AgChartBackground;
import com.jwebmp.plugins.agcharts.options.AgChartCaptionOptions;
import com.jwebmp.plugins.agcharts.options.locale.AgLocaleOptions;
import com.jwebmp.plugins.agcharts.options.theme.AgChartTheme;
import com.jwebmp.plugins.agcharts.options.theme.AgChartThemeName;
import com.jwebmp.plugins.agcharts.options.tooltip.AgChartTooltipOptions;

import java.util.List;

/**
 * Enterprise: Radial Gauge root options.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgRadialGaugeOptions<J extends AgRadialGaugeOptions<J>> extends JavaScriptPart<J>
{
    private final String type = "radial-gauge";

    // core
    private Number value; // required

    // theming / container
    private Object theme; // AgChartTheme | AgChartThemeName (string)
    private Object container; // HTMLElement | null (left for runtime)

    // layout
    private Integer width;
    private Integer height;
    private Integer minHeight; // default 300 at runtime
    private Integer minWidth;  // default 300 at runtime
    private Object padding;    // number | {top,right,bottom,left}

    private AgChartBackground<?> background;
    private AgChartCaptionOptions<?> title;
    private AgChartCaptionOptions<?> subtitle;
    private AgChartCaptionOptions<?> footnote;

    private AgChartTooltipOptions<?> tooltip;
    private Object animation; // keep generic
    private Object contextMenu; // keep generic
    private Object context; // user context
    private AgLocaleOptions<?> locale;
    private Object listeners; // base chart listeners - generic

    // gauge specific
    private List<AgRadialGaugeTarget<?>> targets;

    private Integer outerRadius; // px
    private Integer innerRadius; // px
    private Double outerRadiusRatio; // ratio
    private Double innerRadiusRatio; // ratio

    private Integer startAngle; // deg
    private Integer endAngle;   // deg

    private AgGaugeSegmentation<?> segmentation;
    private Integer cornerRadius;
    private AgGaugeCornerMode cornerMode;

    private AgRadialGaugeNeedleStyle<?> needle;
    private AgRadialGaugeScale<?> scale;
    private AgRadialGaugeBarStyle<?> bar;

    private AgRadialGaugeLabelOptions<?> label;
    private AgRadialGaugeSecondaryLabelOptions<?> secondaryLabel;

    private Integer spacing; // px between text and shape edges

    private String cursor;
    private Object highlight; // reuse general highlight model if needed
    private Object nodeClickRange; // InteractionRange

    public String getType() {return type;}

    public Number getValue() {return value;}

    public J setValue(Number value)
    {
        this.value = value;
        return (J) this;
    }

    public Object getTheme() {return theme;}

    public J setTheme(AgChartTheme<?> theme)
    {
        this.theme = theme;
        return (J) this;
    }

    public J setTheme(String themeName)
    {
        this.theme = themeName;
        return (J) this;
    }

    public J setTheme(AgChartThemeName themeName)
    {
        this.theme = themeName != null ? themeName.toString() : null;
        return (J) this;
    }

    public Object getContainer() {return container;}

    public J setContainer(Object container)
    {
        this.container = container;
        return (J) this;
    }

    public Integer getWidth() {return width;}

    public J setWidth(Integer width)
    {
        this.width = width;
        return (J) this;
    }

    public Integer getHeight() {return height;}

    public J setHeight(Integer height)
    {
        this.height = height;
        return (J) this;
    }

    public Integer getMinHeight() {return minHeight;}

    public J setMinHeight(Integer minHeight)
    {
        this.minHeight = minHeight;
        return (J) this;
    }

    public Integer getMinWidth() {return minWidth;}

    public J setMinWidth(Integer minWidth)
    {
        this.minWidth = minWidth;
        return (J) this;
    }

    public Object getPadding() {return padding;}

    public J setPadding(Integer padding)
    {
        this.padding = padding;
        return (J) this;
    }

    public J setPadding(Object padding)
    {
        this.padding = padding;
        return (J) this;
    }

    public AgChartBackground<?> getBackground() {return background;}

    public J setBackground(AgChartBackground<?> background)
    {
        this.background = background;
        return (J) this;
    }

    public AgChartCaptionOptions<?> getTitle() {return title;}

    public J setTitle(AgChartCaptionOptions<?> title)
    {
        this.title = title;
        return (J) this;
    }

    public AgChartCaptionOptions<?> getSubtitle() {return subtitle;}

    public J setSubtitle(AgChartCaptionOptions<?> subtitle)
    {
        this.subtitle = subtitle;
        return (J) this;
    }

    public AgChartCaptionOptions<?> getFootnote() {return footnote;}

    public J setFootnote(AgChartCaptionOptions<?> footnote)
    {
        this.footnote = footnote;
        return (J) this;
    }

    public AgChartTooltipOptions<?> getTooltip() {return tooltip;}

    public J setTooltip(AgChartTooltipOptions<?> tooltip)
    {
        this.tooltip = tooltip;
        return (J) this;
    }

    public Object getAnimation() {return animation;}

    public J setAnimation(Object animation)
    {
        this.animation = animation;
        return (J) this;
    }

    public Object getContextMenu() {return contextMenu;}

    public J setContextMenu(Object contextMenu)
    {
        this.contextMenu = contextMenu;
        return (J) this;
    }

    public Object getContext() {return context;}

    public J setContext(Object context)
    {
        this.context = context;
        return (J) this;
    }

    public AgLocaleOptions<?> getLocale() {return locale;}

    public J setLocale(AgLocaleOptions<?> locale)
    {
        this.locale = locale;
        return (J) this;
    }

    public Object getListeners() {return listeners;}

    public J setListeners(Object listeners)
    {
        this.listeners = listeners;
        return (J) this;
    }

    public List<AgRadialGaugeTarget<?>> getTargets() {return targets;}

    public J setTargets(List<AgRadialGaugeTarget<?>> targets)
    {
        this.targets = targets;
        return (J) this;
    }

    public Integer getOuterRadius() {return outerRadius;}

    public J setOuterRadius(Integer outerRadius)
    {
        this.outerRadius = outerRadius;
        return (J) this;
    }

    public Integer getInnerRadius() {return innerRadius;}

    public J setInnerRadius(Integer innerRadius)
    {
        this.innerRadius = innerRadius;
        return (J) this;
    }

    public Double getOuterRadiusRatio() {return outerRadiusRatio;}

    public J setOuterRadiusRatio(Double outerRadiusRatio)
    {
        this.outerRadiusRatio = outerRadiusRatio;
        return (J) this;
    }

    public Double getInnerRadiusRatio() {return innerRadiusRatio;}

    public J setInnerRadiusRatio(Double innerRadiusRatio)
    {
        this.innerRadiusRatio = innerRadiusRatio;
        return (J) this;
    }

    public Integer getStartAngle() {return startAngle;}

    public J setStartAngle(Integer startAngle)
    {
        this.startAngle = startAngle;
        return (J) this;
    }

    public Integer getEndAngle() {return endAngle;}

    public J setEndAngle(Integer endAngle)
    {
        this.endAngle = endAngle;
        return (J) this;
    }

    public AgGaugeSegmentation<?> getSegmentation() {return segmentation;}

    public J setSegmentation(AgGaugeSegmentation<?> segmentation)
    {
        this.segmentation = segmentation;
        return (J) this;
    }

    public Integer getCornerRadius() {return cornerRadius;}

    public J setCornerRadius(Integer cornerRadius)
    {
        this.cornerRadius = cornerRadius;
        return (J) this;
    }

    public AgGaugeCornerMode getCornerMode() {return cornerMode;}

    public J setCornerMode(AgGaugeCornerMode cornerMode)
    {
        this.cornerMode = cornerMode;
        return (J) this;
    }

    public AgRadialGaugeNeedleStyle<?> getNeedle() {return needle;}

    public J setNeedle(AgRadialGaugeNeedleStyle<?> needle)
    {
        this.needle = needle;
        return (J) this;
    }

    public AgRadialGaugeScale<?> getScale() {return scale;}

    public J setScale(AgRadialGaugeScale<?> scale)
    {
        this.scale = scale;
        return (J) this;
    }

    public AgRadialGaugeBarStyle<?> getBar() {return bar;}

    public J setBar(AgRadialGaugeBarStyle<?> bar)
    {
        this.bar = bar;
        return (J) this;
    }

    public AgRadialGaugeLabelOptions<?> getLabel() {return label;}

    public J setLabel(AgRadialGaugeLabelOptions<?> label)
    {
        this.label = label;
        return (J) this;
    }

    public AgRadialGaugeSecondaryLabelOptions<?> getSecondaryLabel() {return secondaryLabel;}

    public J setSecondaryLabel(AgRadialGaugeSecondaryLabelOptions<?> secondaryLabel)
    {
        this.secondaryLabel = secondaryLabel;
        return (J) this;
    }

    public Integer getSpacing() {return spacing;}

    public J setSpacing(Integer spacing)
    {
        this.spacing = spacing;
        return (J) this;
    }

    public String getCursor() {return cursor;}

    public J setCursor(String cursor)
    {
        this.cursor = cursor;
        return (J) this;
    }

    public Object getHighlight() {return highlight;}

    public J setHighlight(Object highlight)
    {
        this.highlight = highlight;
        return (J) this;
    }

    public Object getNodeClickRange() {return nodeClickRange;}

    public J setNodeClickRange(Object nodeClickRange)
    {
        this.nodeClickRange = nodeClickRange;
        return (J) this;
    }
}
