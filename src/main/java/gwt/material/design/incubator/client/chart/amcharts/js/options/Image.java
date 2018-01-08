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

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Image {

    @JsProperty
    public String balloonColor;

    @JsProperty
    public String balloonText;

    @JsProperty
    public String color;

    @JsProperty
    public int height;

    @JsProperty
    public int offsetX;

    @JsProperty
    public int offsetY;

    @JsProperty
    public String outlineColor;

    @JsProperty
    public int rotation;

    @JsProperty
    public String svgPath;

    @JsProperty
    public String url;

    @JsProperty
    public int width;
}
