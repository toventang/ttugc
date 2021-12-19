package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4141f;

import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.f.f */
public final class C78961f implements ViewPager.AbstractC1580f {

    /* renamed from: a */
    private float f177470a;

    static {
        Covode.recordClassIndex(92110);
    }

    public C78961f(float f) {
        this.f177470a = f;
    }

    /* renamed from: a */
    private static boolean m137787a(float f) {
        if (f == 0.0f || Float.isNaN(f) || Float.isInfinite(f)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1580f
    /* renamed from: a */
    public final void mo5330a(View view, float f) {
        mo122761b(view, f);
    }

    /* renamed from: b */
    public final void mo122761b(View view, float f) {
        float f2;
        float f3;
        float f4 = 1.0f;
        if (f < -1.0f) {
            f = -1.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.0f) {
            f2 = f + 1.0f;
        } else {
            f2 = 1.0f - f;
        }
        float f5 = (f2 * 0.100000024f) + 0.9f;
        if (m137787a(f5)) {
            f5 = 1.0f;
        }
        view.setScaleX(f5);
        view.setScaleY(f5);
        if (f < 0.0f) {
            f3 = f + 1.0f;
        } else {
            f3 = 1.0f - f;
        }
        float f6 = this.f177470a;
        float f7 = f6 + (f3 * (1.0f - f6));
        if (!m137787a(f7)) {
            f4 = f7;
        }
        view.setAlpha(f4);
        int i = Build.VERSION.SDK_INT;
    }
}
