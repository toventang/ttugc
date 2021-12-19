package com.p2082ss.android.ugc.aweme.common.p2634f;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.f.c */
public final class C39113c {

    /* renamed from: a */
    public static final C39113c f92312a = new C39113c();

    private C39113c() {
    }

    static {
        Covode.recordClassIndex(46729);
    }

    /* renamed from: a */
    public static void m79407a(View view) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = (int) C13628n.m24520b(view.getContext(), -29.0f);
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
