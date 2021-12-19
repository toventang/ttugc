package com.bytedance.helios.sdk.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.utils.d */
public final class C15482d {

    /* renamed from: a */
    public static final Keva f37729a = Keva.getRepo("sky_eye_repo", 1);

    /* renamed from: b */
    public static final C15482d f37730b = new C15482d();

    private C15482d() {
    }

    static {
        Covode.recordClassIndex(17736);
    }

    /* renamed from: a */
    public static void m28487a(String str, int i) {
        C89219l.m154719c(str, "");
        f37729a.storeInt(str, i);
    }

    /* renamed from: b */
    public static void m28488b(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        f37729a.storeString(str, str2);
    }

    /* renamed from: a */
    public static String m28486a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        String string = f37729a.getString(str, str2);
        C89219l.m154709a((Object) string, "");
        return string;
    }
}
