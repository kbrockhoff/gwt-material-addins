/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.incubator.client.chart.amcharts.js;

import gwt.material.design.incubator.client.chart.amcharts.js.options.ChartCursor;
import gwt.material.design.incubator.client.chart.amcharts.js.options.ChartScrollbar;
import gwt.material.design.incubator.client.chart.amcharts.js.options.TrendLine;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class AmRectangularChart extends AmCoordinateChart {

    @JsProperty
    public int angle;

    @JsProperty
    public int autoMarginOffset;

    @JsProperty
    public boolean autoMargins;

    @JsProperty
    public ChartCursor chartCursor;

    @JsProperty
    public ChartScrollbar chartScrollbar;

    @JsProperty
    public int depth3D;

    @JsProperty
    public int marginLeft;

    @JsProperty
    public int marginBottom;

    @JsProperty
    public int marginRight;

    @JsProperty
    public boolean marginsUpdated;

    @JsProperty
    public int marginTop;

    @JsProperty
    public int maxZoomFactor;

    @JsProperty
    public int minMarginBottom;

    @JsProperty
    public int minMarginLeft;

    @JsProperty
    public int minMarginRight;

    @JsProperty
    public int minMarginTop;

    @JsProperty
    public double plotAreaBorderAlpha;

    @JsProperty
    public String plotAreaBorderColor;

    @JsProperty
    public double plotAreaFillAlphas;

    @JsProperty
    public String plotAreaFillColors;

    @JsProperty
    public int plotAreaGradientAngle;

    @JsProperty
    public TrendLine[] trendLines;

    @JsProperty
    public double zoomOutButtonAlpha;

    @JsProperty
    public String zoomOutButtonColor;

    @JsProperty
    public String zoomOutButtonImage;

    @JsProperty
    public int zoomOutButtonImageSize;

    @JsProperty
    public int zoomOutButtonPadding;

    @JsProperty
    public double zoomOutButtonRollOverAlpha;

    @JsProperty
    public int zoomOutButtonTabIndex;

    @JsProperty
    public String zoomOutText;

    @JsMethod
    public native void addChartCursor(ChartCursor chartCursor);

    @JsMethod
    public native void addChartScrollbar(ChartScrollbar chartScrollBar);

    @JsMethod
    public native void addTrendLine(TrendLine trendLine);

    @JsMethod
    public native void removeChartCursor();

    @JsMethod
    public native void removeTrendLine(TrendLine trendLine);

    @JsMethod
    public native void zoomOutValueAxes();
}