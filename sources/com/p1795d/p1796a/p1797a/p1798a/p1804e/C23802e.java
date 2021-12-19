package com.p1795d.p1796a.p1797a.p1798a.p1804e;

import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.d.a.a.a.e.e */
public final class C23802e {
    static {
        Covode.recordClassIndex(27910);
    }

    /* renamed from: a */
    public static float m44997a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static String m44999c(View view) {
        int i = Build.VERSION.SDK_INT;
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m44998b(android.view.View r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r0 = 19
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L_0x000c
            return r2
        L_0x000c:
            boolean r0 = r3.isShown()
            if (r0 != 0) goto L_0x0015
            return r2
        L_0x0013:
            if (r3 == 0) goto L_0x002a
        L_0x0015:
            float r1 = r3.getAlpha()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
            return r2
        L_0x001f:
            android.view.ViewParent r3 = r3.getParent()
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L_0x002a
            android.view.View r3 = (android.view.View) r3
            goto L_0x0013
        L_0x002a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p1795d.p1796a.p1797a.p1798a.p1804e.C23802e.m44998b(android.view.View):boolean");
    }
}
