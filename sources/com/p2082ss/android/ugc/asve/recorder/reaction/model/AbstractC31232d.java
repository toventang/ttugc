package com.p2082ss.android.ugc.asve.recorder.reaction.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.d */
public abstract class AbstractC31232d implements AbstractC31229a, Serializable {
    @AbstractC27891c(mo46611a = "react_window_resource_path")

    /* renamed from: a */
    private final String f74865a;
    @AbstractC27891c(mo46611a = "react_is_circle_shape")

    /* renamed from: b */
    private boolean f74866b;

    /* renamed from: c */
    private final int f74867c;

    /* renamed from: d */
    private final int f74868d;

    /* renamed from: e */
    private final int f74869e;

    /* renamed from: f */
    private final int f74870f;
    public final int outputVideoHeight;
    public final int outputVideoWidth;

    static {
        Covode.recordClassIndex(37879);
    }

    public final String getMImagePath() {
        return this.f74865a;
    }

    public final boolean getMIsCircle() {
        return this.f74866b;
    }

    public final int getDefaultHeight() {
        return convertDpToHeight(this.f74868d);
    }

    public final int getDefaultWidth() {
        return convertDpToWidth(this.f74867c);
    }

    public final int getMinHeight() {
        return convertDpToWidth(this.f74870f);
    }

    public final int getMinWidth() {
        return convertDpToWidth(this.f74869e);
    }

    public float getWidthHeightRatio() {
        return ((float) this.f74867c) / ((float) this.f74868d);
    }

    public final void setMIsCircle(boolean z) {
        this.f74866b = z;
    }

    public AbstractC31232d(String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        C89219l.m154721d(str, "");
        this.f74865a = str;
        this.f74866b = z;
        this.outputVideoWidth = i;
        this.outputVideoHeight = i2;
        this.f74867c = i3;
        this.f74868d = i4;
        this.f74869e = i5;
        this.f74870f = i6;
    }
}
