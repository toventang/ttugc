package com.bytedance.p1399im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19537ah;

/* renamed from: com.bytedance.im.core.internal.utils.o */
public final class C20012o {
    static {
        Covode.recordClassIndex(22857);
    }

    /* renamed from: a */
    public static String m37813a(C19537ah ahVar) {
        if (ahVar != null) {
            try {
                return C19999h.f47538a.mo46674b(ahVar);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: a */
    public static C19537ah m37812a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (C19537ah) C19999h.f47538a.mo46670a(str, C19537ah.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
