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

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "AmCharts")
public class AmFunnelChart {

    @JsProperty
    public int angle;

    @JsProperty
    public String balloonText;

    @JsProperty
    public int baseWidth;

    @JsProperty
    public int depth3D;

    @JsProperty
    public String labelPosition;

    @JsProperty
    public String labelText;

    @JsProperty
    public int neckHeight;

    @JsProperty
    public int neckWidth;

    @JsProperty
    public int pullDistance;

    @JsProperty
    public boolean rotate;

    @JsProperty
    public int startX;

    @JsProperty
    public int startY;

    @JsProperty
    public String valueRepresents;
}
