package com.p2082ss.android.ugc.aweme.views;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.views.q */
public final class C81464q extends ViewOutlineProvider {

    /* renamed from: a */
    private float f182118a;

    /* renamed from: b */
    private int f182119b;

    /* renamed from: c */
    private int f182120c;

    static {
        Covode.recordClassIndex(94836);
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(new Rect(0, 0, this.f182119b, this.f182120c), this.f182118a);
    }

    public C81464q(float f, int i, int i2) {
        this.f182118a = f;
        this.f182119b = i;
        this.f182120c = i2;
    }
}
