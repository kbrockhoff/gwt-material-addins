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

/**
 * Creates a label on the chart which can be placed anywhere, multiple can be assigned.
 *
 * @author kevzlou7979@gmail.com
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Label {

    @JsProperty
    public String align;

    @JsProperty
    public int alpha;

    @JsProperty
    public boolean bold;

    @JsProperty
    public String color;

    @JsProperty
    public String id;

    @JsProperty
    public int rotation;

    @JsProperty
    public int size;

    @JsProperty
    public int tabIndex;

    @JsProperty
    public String text;

    @JsProperty
    public String url;

    @JsProperty
    public String x;

    @JsProperty
    public String y;
}
