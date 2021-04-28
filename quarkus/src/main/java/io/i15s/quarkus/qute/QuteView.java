package io.i15s.quarkus.qute;

import io.quarkus.qute.TemplateData;

@TemplateData
public class QuteView {

    private float number;

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }
}
