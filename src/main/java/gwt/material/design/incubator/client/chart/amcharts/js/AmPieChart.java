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

import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "AmCharts")
public class AmPieChart extends AmSlicedChart {

    @JsProperty
    public boolean adjustPrecision;

    @JsProperty
    public int angle;

    @JsProperty
    public Functions.Func balloonFunction;

    @JsProperty
    public String balloonText;

    @JsProperty
    public int depth3D;

    @JsProperty
    public String gradientType;

    @JsProperty
    public int innerRadius;

    @JsProperty
    public int labelRadius;

    @JsProperty
    public String labelRadiusField;

    @JsProperty
    public String labelText;

    @JsProperty
    public int minRadius;

    @JsProperty
    public Object pieX;

    @JsProperty
    public Object pieY;

    @JsProperty
    public Object radius;

    @JsProperty
    public Object startAngle;

    @JsProperty
    public Object startRadius;
}
