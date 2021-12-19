package com.p2082ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.canvas.PhotoCanvasTransformFilterParam */
public final class PhotoCanvasTransformFilterParam implements Serializable {
    private int borderColor = -1;
    private int borderWidthPx;
    private int clipIndex = -1;
    private int degree;
    private float scaleFactor = 1.0f;
    private float transX;
    private float transY;

    static {
        Covode.recordClassIndex(42527);
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final int getBorderWidthPx() {
        return this.borderWidthPx;
    }

    public final int getClipIndex() {
        return this.clipIndex;
    }

    public final int getDegree() {
        return this.degree;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final float getTransX() {
        return this.transX;
    }

    public final float getTransY() {
        return this.transY;
    }

    public final boolean isValid() {
        if (this.clipIndex != -1) {
            return true;
        }
        return false;
    }

    public final void setBorderColor(int i) {
        this.borderColor = i;
    }

    public final void setBorderWidthPx(int i) {
        this.borderWidthPx = i;
    }

    public final void setClipIndex(int i) {
        this.clipIndex = i;
    }

    public final void setDegree(int i) {
        this.degree = i;
    }

    public final void setScaleFactor(float f) {
        this.scaleFactor = f;
    }

    public final void setTransX(float f) {
        this.transX = f;
    }

    public final void setTransY(float f) {
        this.transY = f;
    }
}
