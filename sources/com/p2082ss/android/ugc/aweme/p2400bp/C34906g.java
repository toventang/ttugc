package com.p2082ss.android.ugc.aweme.p2400bp;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;

/* renamed from: com.ss.android.ugc.aweme.bp.g */
public final class C34906g {
    static {
        Covode.recordClassIndex(41917);
    }

    /* renamed from: a */
    public static boolean m71289a() {
        Context a;
        if (Build.VERSION.SDK_INT >= 23 && (a = C17867d.m33078a()) != null && a.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r3 == null) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m71288a(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2400bp.C34906g.m71288a(android.content.Context):void");
    }
}
