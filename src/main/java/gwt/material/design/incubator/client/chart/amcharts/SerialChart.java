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
package gwt.material.design.incubator.client.chart.amcharts;

import gwt.material.design.client.MaterialDesign;
import gwt.material.design.incubator.client.chart.amcharts.base.AbstractChart;
import gwt.material.design.incubator.client.chart.amcharts.base.IsCoordinate;
import gwt.material.design.incubator.client.chart.amcharts.js.AmSerialChart;
import gwt.material.design.incubator.client.chart.amcharts.js.AmGraph;
import gwt.material.design.incubator.client.chart.amcharts.resources.ChartThemeClientBundle;
import gwt.material.design.incubator.client.chart.amcharts.resources.ChartTypeClientBundle;

public class SerialChart extends AbstractChart<AmSerialChart> implements IsCoordinate {

    static {
        MaterialDesign.injectJs(ChartTypeClientBundle.INSTANCE.serialJs());
        MaterialDesign.injectJs(ChartThemeClientBundle.INSTANCE.darkJs());
    }

    private AmSerialChart amSerialChart = AmSerialChart.create();

    public SerialChart() {
        super();
    }

    public void setCategoryField(String categoryField) {
        amSerialChart.categoryField = categoryField;
    }

    @Override
    public void addGraph(AmGraph amGraph) {
        amSerialChart.addGraph(amGraph);
    }

    @Override
    public AmSerialChart getChart() {
        return amSerialChart;
    }

    @Override
    public void setAngle(int angle) {
        amSerialChart.angle = angle;
    }

    @Override
    public void setAutoMarginOffset(int autoMarginOffset) {
        amSerialChart.autoMarginOffset = autoMarginOffset;
    }

    @Override
    public void setAutoMargins(boolean autoMargins) {
        amSerialChart.autoMargins = autoMargins;
    }

    @Override
    public void setMarginRight(int marginRight) {
        amSerialChart.marginRight = marginRight;
    }

    @Override
    public void setMarginTop(int marginTop) {
        amSerialChart.marginTop = marginTop;
    }
}
