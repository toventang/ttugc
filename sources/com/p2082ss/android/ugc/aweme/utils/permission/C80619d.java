package com.p2082ss.android.ugc.aweme.utils.permission;

import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.d */
public final class C80619d {
    static {
        Covode.recordClassIndex(93893);
    }

    /* renamed from: a */
    public static int m139776a() {
        if (m139777a("android.permission.READ_CONTACTS")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static boolean m139777a(String str) {
        try {
            if (C0643b.m2367a(C17867d.m33078a(), str) == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
        }
    }
}
