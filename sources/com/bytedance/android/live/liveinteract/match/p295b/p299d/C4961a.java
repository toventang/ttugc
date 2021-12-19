package com.bytedance.android.live.liveinteract.match.p295b.p299d;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.bytedance.android.live.liveinteract.match.b.d.a */
public final class C4961a {

    /* renamed from: a */
    public static final C4961a f12937a = new C4961a();

    /* renamed from: b */
    private static int m11161b(boolean z) {
        return z ? 138 : 154;
    }

    private C4961a() {
    }

    static {
        Covode.recordClassIndex(5544);
    }

    /* renamed from: a */
    public static int m11159a(boolean z) {
        return C3966y.m9653a((float) m11161b(z));
    }

    /* renamed from: a */
    public static void m11160a(View view, boolean z) {
        int i;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z) {
                i = 28;
            } else {
                i = 12;
            }
            marginLayoutParams.topMargin = C3966y.m9653a((float) i);
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
