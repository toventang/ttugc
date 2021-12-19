package com.p2082ss.android.ugc.aweme.p2282ad.utils;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.b */
public final class C33392b {

    /* renamed from: a */
    public static final C33392b f79345a = new C33392b();

    private C33392b() {
    }

    static {
        Covode.recordClassIndex(40241);
    }

    /* renamed from: a */
    public static void m68476a(View view, int i, int i2, boolean z) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            int i3 = ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
            if (z) {
                if (i3 < 0) {
                    ValueAnimator a = C38545a.m78160a(view, i3, i, i2);
                    C89219l.m154716b(a, "");
                    a.start();
                }
            } else if (i3 >= 0) {
                ValueAnimator a2 = C38545a.m78160a(view, i3, i, i2);
                C89219l.m154716b(a2, "");
                a2.start();
            }
        }
    }
}
