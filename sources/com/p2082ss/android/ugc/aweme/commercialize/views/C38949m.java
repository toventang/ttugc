package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.views.m */
public final class C38949m extends ViewOutlineProvider {

    /* renamed from: a */
    private float f92003a;

    /* renamed from: b */
    private int f92004b;

    /* renamed from: c */
    private int f92005c;

    static {
        Covode.recordClassIndex(46537);
    }

    public final void getOutline(View view, Outline outline) {
        if (Build.VERSION.SDK_INT >= 21) {
            outline.setRoundRect(new Rect(0, 0, this.f92004b, this.f92005c), this.f92003a);
        }
    }

    C38949m(float f, int i, int i2) {
        this.f92003a = f;
        this.f92004b = i;
        this.f92005c = i2;
    }
}
