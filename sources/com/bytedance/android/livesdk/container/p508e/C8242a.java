package com.bytedance.android.livesdk.container.p508e;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.e.a */
public final class C8242a {
    static {
        Covode.recordClassIndex(9077);
    }

    /* renamed from: a */
    public static final void m16384a(View view, int i) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }
}
