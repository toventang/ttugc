package com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2510d;

import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.C37446c;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.a.d.a */
public final class C37457a {
    static {
        Covode.recordClassIndex(44842);
    }

    /* renamed from: a */
    public static void m75545a(C37446c cVar) {
        if (!cVar.mo65160d()) {
            throw new IllegalStateException("Viewability adsession should be active");
        }
    }

    /* renamed from: a */
    public static boolean m75546a(View view) {
        int i = Build.VERSION.SDK_INT;
        if (view.isAttachedToWindow() && view.getVisibility() == 0 && view.getAlpha() != 0.0f) {
            return true;
        }
        return false;
    }
}
