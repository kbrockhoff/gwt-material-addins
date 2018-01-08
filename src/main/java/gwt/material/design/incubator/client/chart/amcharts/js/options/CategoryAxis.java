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

import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class CategoryAxis extends AxisBase {

    @JsProperty
    public int autoRotateAngle;

    @JsProperty
    public int autoRotateCount;

    @JsProperty
    public String autoWrap;

    @JsProperty
    public Functions.Func categoryFunction;

    @JsProperty
    public String classNameField;

    @JsProperty
    public Object[] dateFormats;

    @JsProperty
    public boolean equalSpacing;

    @JsProperty
    public String forceShowField;

    @JsProperty
    public String gridPosition;

    @JsProperty
    public String labelColorField;

    @JsProperty
    Functions.Func labelFunction;

    @JsProperty
    public String minPeriod;

    @JsProperty
    public boolean parseDates;

    @JsProperty
    public String position;

    @JsProperty
    public boolean startOnAxis;

    @JsProperty
    public String tickPosition;

    @JsProperty
    public boolean twoLineMode;

    @JsProperty
    public String widthField;

    @JsMethod
    public native int categoryToCoordinate(String category);

    @JsMethod
    public native Date coordinateToDate(int coordinate);

    @JsMethod
    public native int dateToCoordinate(Date date);

    @JsMethod
    public native int xToIndex(int x);
}
