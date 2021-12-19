package com.lynx.tasm.behavior.p2052ui.swiper;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.utils.C28926j;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.behavior.ui.swiper.b */
public final class C28668b extends FrameLayout {

    /* renamed from: a */
    final C28669c f67555a;

    /* renamed from: b */
    final LinearLayout f67556b;

    /* renamed from: c */
    final int f67557c;

    /* renamed from: d */
    int f67558d;

    /* renamed from: e */
    int f67559e;

    /* renamed from: f */
    int f67560f;

    /* renamed from: g */
    int f67561g;

    static {
        Covode.recordClassIndex(34736);
    }

    public C28668b(Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: a */
    static GradientDrawable m57348a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: a */
    public final void mo49691a(boolean z) {
        if (z) {
            C0792v.m2759b((View) this.f67556b, 1);
        } else {
            C0792v.m2759b((View) this.f67556b, 0);
        }
        this.f67555a.f67577p = z;
    }

    /* renamed from: c */
    public final void mo49693c(int i) {
        this.f67561g = i;
        LinearLayout linearLayout = this.f67556b;
        if (linearLayout != null) {
            removeView(linearLayout);
            m57349d(i);
        }
        this.f67555a.f67579r = i;
    }

    /* renamed from: b */
    public final void mo49692b(int i) {
        this.f67560f = i;
        for (int childCount = this.f67556b.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f67556b.getChildAt(childCount);
            if (childCount == this.f67560f) {
                childAt.setBackground(m57348a(this.f67558d));
            } else {
                childAt.setBackground(m57348a(this.f67559e));
            }
        }
    }

    /* renamed from: d */
    private void m57349d(int i) {
        FrameLayout.LayoutParams layoutParams;
        if (i == 1) {
            this.f67556b.setGravity(16);
            this.f67556b.setOrientation(1);
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.rightMargin = (int) C28926j.m57938a(10.0f);
            layoutParams.gravity = 8388629;
        } else {
            this.f67556b.setGravity(17);
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = (int) C28926j.m57938a(10.0f);
            layoutParams.gravity = 81;
        }
        addView(this.f67556b, layoutParams);
    }

    private C28668b(Context context, byte b) {
        super(context, null);
        MethodCollector.m26663i(4205);
        this.f67558d = XSwiperUI.f67516a;
        this.f67559e = XSwiperUI.f67517b;
        this.f67557c = (int) C28926j.m57938a(7.0f);
        C28669c cVar = new C28669c(context);
        this.f67555a = cVar;
        addView(cVar, new FrameLayout.LayoutParams(-1, -1));
        this.f67556b = new LinearLayout(context);
        m57349d(0);
        MethodCollector.m26664o(4205);
    }
}
