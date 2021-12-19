package com.bytedance.android.livesdk.toolbar;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.toolbar.a */
public final class C10892a {
    static {
        Covode.recordClassIndex(12500);
    }

    /* renamed from: a */
    public static final void m19505a(View view) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = C3966y.m9653a(36.0f);
        marginLayoutParams.width = C3966y.m9653a(44.0f);
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        view.setLayoutParams(marginLayoutParams);
    }
}
