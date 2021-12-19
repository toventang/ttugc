package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.util.r */
public final class C87004r {

    /* renamed from: a */
    public static final C87004r f196174a = new C87004r();

    private C87004r() {
    }

    static {
        Covode.recordClassIndex(102770);
    }

    /* renamed from: a */
    public static boolean m150694a(String str, int i, int i2) {
        C89219l.m154719c(str, "");
        if (!C87007u.m150697a(str) && i >= 0 && i2 >= 0 && i < i2 && i < str.length() && i2 <= str.length()) {
            return true;
        }
        return false;
    }
}
