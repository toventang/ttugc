package com.p2082ss.android.ugc.aweme.user;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.user.a */
public final class C80036a {

    /* renamed from: a */
    public static final C80036a f179351a = new C80036a();

    private C80036a() {
    }

    static {
        Covode.recordClassIndex(93267);
    }

    /* renamed from: a */
    public static final int m138775a(String str) {
        boolean z;
        Integer a;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (a = m138776a(str, "save_login")) != null) {
            return a.intValue();
        }
        return -1;
    }

    /* renamed from: b */
    private static Keva m138779b(String str) {
        C89219l.m154721d(str, "");
        String concat = "aweme_user_config_".concat(String.valueOf(C80044b.f179362a.replace(C89361p.m154910b((CharSequence) str).toString(), "")));
        C89219l.m154716b(concat, "");
        Keva repo = Keva.getRepo(concat);
        C89219l.m154716b(repo, "");
        return repo;
    }

    /* renamed from: a */
    public static Integer m138776a(String str, String str2) {
        boolean z;
        C89219l.m154721d(str2, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        return Integer.valueOf(m138779b(str).getInt(str2, -1));
    }

    /* renamed from: a */
    public static final void m138778a(String str, boolean z) {
        int i;
        C89219l.m154721d(str, "");
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        m138777a(str, "save_login", i);
    }

    /* renamed from: a */
    public static void m138777a(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m138779b(str).storeInt(str2, i);
    }
}
