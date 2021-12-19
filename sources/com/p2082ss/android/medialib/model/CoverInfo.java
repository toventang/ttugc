package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.CoverInfo */
public class CoverInfo {
    int[] data;
    int height;
    int width;

    static {
        Covode.recordClassIndex(36476);
    }

    public int[] getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setData(int[] iArr) {
        this.data = iArr;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public CoverInfo(int i, int i2, int[] iArr) {
        this.width = i;
        this.height = i2;
        this.data = iArr;
    }
}
