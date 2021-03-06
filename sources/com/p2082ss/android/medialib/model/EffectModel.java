package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.EffectModel */
public class EffectModel {
    private int end;
    private int index;
    private int start;

    static {
        Covode.recordClassIndex(36478);
    }

    public EffectModel() {
    }

    public int getEnd() {
        return this.end;
    }

    public int getIndex() {
        return this.index;
    }

    public int getStart() {
        return this.start;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public EffectModel(int i, int i2, int i3) {
        this.index = i;
        this.start = i2;
        this.end = i3;
    }
}
