package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.util.u */
public final class C87007u {

    /* renamed from: a */
    public static final C87007u f196177a = new C87007u();

    private C87007u() {
    }

    static {
        Covode.recordClassIndex(102773);
    }

    /* renamed from: a */
    public static boolean m150697a(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m150698a(String str, String str2) {
        if (!m150697a(str) || !m150697a(str2)) {
            return C89219l.m154714a((Object) str, (Object) str2);
        }
        return true;
    }
}
