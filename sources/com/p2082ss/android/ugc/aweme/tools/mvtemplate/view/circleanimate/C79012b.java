package com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.graphics.drawable.GradientDrawable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.b */
public final class C79012b {

    /* renamed from: a */
    public int f177578a;

    /* renamed from: b */
    public int f177579b;

    /* renamed from: c */
    public GradientDrawable f177580c;

    static {
        Covode.recordClassIndex(92175);
    }

    /* renamed from: a */
    public final void mo122826a() {
        this.f177578a = 0;
        this.f177580c.setStroke(0, this.f177579b);
    }

    public C79012b(GradientDrawable gradientDrawable) {
        this.f177580c = gradientDrawable;
    }

    /* renamed from: a */
    public final void mo122827a(int i) {
        this.f177579b = i;
        this.f177580c.setStroke(this.f177578a, i);
    }
}
