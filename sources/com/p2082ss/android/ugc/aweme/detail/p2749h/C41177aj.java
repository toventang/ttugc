package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.detail.h.aj */
public final class C41177aj implements ViewPager.AbstractC1580f {

    /* renamed from: a */
    private AbstractC41176ai f96210a;

    /* renamed from: b */
    private Boolean f96211b = true;

    /* renamed from: c */
    private Boolean f96212c = true;

    static {
        Covode.recordClassIndex(49060);
    }

    public C41177aj(AbstractC41176ai aiVar) {
        this.f96210a = aiVar;
    }

    /* renamed from: b */
    private static void m82941b(View view, float f) {
        int width = view.getWidth();
        int height = view.getHeight();
        float max = Math.max(0.85f, 1.0f - Math.abs(f));
        float f2 = 1.0f - max;
        float f3 = (((float) height) * f2) / 2.0f;
        float f4 = (((float) width) * f2) / 2.0f;
        if (f < 0.0f) {
            view.setTranslationX(f4 - (f3 / 2.0f));
        } else {
            view.setTranslationX((-f4) + (f3 / 2.0f));
        }
        view.setScaleX(max);
        view.setScaleY(max);
        view.setAlpha((((max - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1580f
    /* renamed from: a */
    public final void mo5330a(View view, float f) {
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(0.0f);
        } else if (this.f96210a != null) {
            if (((double) f) == 0.0d || f == -1.0f || f == 1.0f) {
                this.f96211b = true;
                this.f96212c = true;
                m82941b(view, 0.0f);
            } else if (this.f96212c.booleanValue()) {
                if (this.f96211b.booleanValue()) {
                    this.f96211b = false;
                    if ((f >= 0.0f || f <= -0.5f) && (f <= 0.5f || f >= 1.0f)) {
                        this.f96212c = Boolean.valueOf(this.f96210a.mo70433a());
                    } else {
                        this.f96212c = Boolean.valueOf(this.f96210a.mo70434b());
                    }
                }
                if (this.f96212c.booleanValue()) {
                    m82941b(view, f);
                }
            }
        }
    }
}
