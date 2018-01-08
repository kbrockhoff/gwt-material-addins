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

import gwt.material.design.incubator.client.chart.amcharts.js.AmGraph;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ChartCursor {

    @JsProperty
    public int adjustment;

    @JsProperty
    public double animationDuration;

    @JsProperty
    public boolean avoidBalloonOverlapping;

    @JsProperty
    public String balloonPointerOrientation;

    @JsProperty
    public boolean bulletsEnabled;

    @JsProperty
    public int bulletSize;

    @JsProperty
    public int categoryBalloonAlpha;

    @JsProperty
    public String categoryBalloonColor;

    @JsProperty
    public String categoryBalloonDateFormat;

    @JsProperty
    public boolean categoryBalloonEnabled;

    @JsProperty
    public Functions.Func categoryBalloonFunction;

    @JsProperty
    public String categoryBalloonText;

    @JsProperty
    public String color;

    @JsProperty
    public int cursorAlpha;

    @JsProperty
    public String cursorColor;

    @JsProperty
    public String cursorPosition;

    @JsProperty
    public boolean enabled;

    @JsProperty
    public boolean fullWidth;

    @JsProperty
    public double graphBulletAlpha;

    @JsProperty
    public int graphBulletSize;

    @JsProperty
    public boolean leaveAfterTouch;

    @JsProperty
    public boolean leaveCursor;

    @JsProperty
    public AmGraph limitToAmGraph;

    @JsProperty
    public Object[] listeners;

    @JsProperty
    public boolean oneBalloonOnly;

    @JsProperty
    public boolean pan;

    @JsProperty
    public double selectionAlpha;

    @JsProperty
    public boolean selectWithoutZooming;

    @JsProperty
    public boolean showNextAvailable;

    @JsProperty
    public int tabIndex;

    @JsProperty
    public boolean valueBalloonsEnabled;

    @JsProperty
    public double valueLineAlpha;

    @JsProperty
    public boolean valueLineBalloonEnabled;

    @JsProperty
    public boolean valueLineEnabled;

    @JsProperty
    public boolean valueZoomable;

    @JsProperty
    public boolean zoomable;

    @JsProperty
    public boolean zooming;

    @JsMethod
    public native void addListener(String type, Functions.Func handler);

    @JsMethod
    public native void clearSelection();

    @JsMethod
    public native void hideCursor();

    @JsMethod
    public native void removeListener(String type, Functions.Func handler);

    @JsMethod
    public native void showCursorAt(String category);

    @JsMethod
    public native void syncWithCursor(ChartCursor chartCursor);

    // TODO Events
}
