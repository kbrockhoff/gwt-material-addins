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

import gwt.material.design.incubator.client.chart.amcharts.js.options.ValueAxis;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

@JsType(isNative = true, namespace = "AmCharts")
public class AmGanttChart extends AmSerialChart {

    @JsProperty
    public int brightnessStep;

    @JsProperty
    public String columnWidthField;

    @JsProperty
    public String durationField;

    @JsProperty
    public String endDateField;

    @JsProperty
    public String endField;

    @JsProperty
    public AmGraph amGraph;

    @JsProperty
    public String period;

    @JsProperty
    public String segmentsField;

    @JsProperty
    public Date startDate;

    @JsProperty
    public String startDateField;

    @JsProperty
    public String startField;

    @JsProperty
    public ValueAxis valueAxis;
}
