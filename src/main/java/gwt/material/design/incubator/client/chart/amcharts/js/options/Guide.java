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
package gwt.material.design.incubator.client.chart.amcharts.js.options;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Guide {

    @JsProperty
    public boolean above;

    @JsProperty
    public int angle;

    @JsProperty
    public String balloonColor;

    @JsProperty
    public String balloonText;

    @JsProperty
    public boolean boldLabel;

    @JsProperty
    public String category;

    @JsProperty
    public String color;

    @JsProperty
    public int dashLength;

    @JsProperty
    public Date date;

    @JsProperty
    public boolean expand;

    @JsProperty
    public double fillAlpha;

    @JsProperty
    public String fillColor;

    @JsProperty
    public int fontSize;

    @JsProperty
    public String id;

    @JsProperty
    public boolean inside;

    @JsProperty
    public String label;

    @JsProperty
    public int labelRotation;

    @JsProperty
    public double lineAlpha;

    @JsProperty
    public String lineColor;

    @JsProperty
    public int lineThickness;

    @JsProperty
    public String position;

    @JsProperty
    public int tickLength;

    @JsProperty
    public int toAngle;

    @JsProperty
    public String toCategory;

    @JsProperty
    public Date toDate;

    @JsProperty
    public int toValue;

    @JsProperty
    public int value;

    @JsProperty
    public ValueAxis valueAxis;
}
