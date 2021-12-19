package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import p4519d.p4520a.p4534g.C88071e;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.util.n */
public final class C87000n {

    /* renamed from: a */
    public static final C87000n f196169a = new C87000n();

    private C87000n() {
    }

    static {
        Covode.recordClassIndex(102766);
    }

    /* renamed from: a */
    public static String m150684a(String str) {
        C89219l.m154719c(str, "");
        int a = C89361p.m154885a((CharSequence) str, "/");
        int a2 = C88071e.C88072a.m153146a(str, "_v[0-9]");
        int i = a + 1;
        if (C87004r.m150694a(str, i, a2)) {
            String substring = str.substring(i, a2);
            C89219l.m154709a((Object) substring, "");
            return substring;
        }
        int a3 = C88071e.C88072a.m153146a(str, "\\.model|_model|\\.dat");
        if (a3 <= 0 || a3 <= a) {
            String substring2 = str.substring(i, str.length());
            C89219l.m154709a((Object) substring2, "");
            return substring2;
        }
        String substring3 = str.substring(i, a3);
        C89219l.m154709a((Object) substring3, "");
        return substring3;
    }

    /* renamed from: b */
    public static String m150686b(String str) {
        C89219l.m154719c(str, "");
        C89361p.m154885a((CharSequence) str, "/");
        int a = C89361p.m154885a((CharSequence) str, "_v");
        int a2 = C88071e.C88072a.m153146a(str, "\\.model|_model|\\.dat");
        if (a <= 0) {
            return "1.0";
        }
        String substring = str.substring(a + 2, a2);
        C89219l.m154709a((Object) substring, "");
        return substring;
    }

    /* renamed from: c */
    public static int m150687c(String str) {
        int a;
        C89219l.m154719c(str, "");
        if (!C89361p.m154908a((CharSequence) str, (CharSequence) "size", false)) {
            return 0;
        }
        int a2 = C89361p.m154885a((CharSequence) str, "size");
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "md5", false)) {
            a = C88071e.C88072a.m153146a(str, "_md5");
        } else {
            a = C88071e.C88072a.m153146a(str, "\\.model|_model|\\.dat");
        }
        if (a2 >= a) {
            return -1;
        }
        String substring = str.substring(a2 + 4, a);
        C89219l.m154709a((Object) substring, "");
        try {
            return Integer.parseInt(substring);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static String m150688d(String str) {
        C89219l.m154719c(str, "");
        if (!C89361p.m154908a((CharSequence) str, (CharSequence) "md5", false)) {
            return null;
        }
        try {
            String substring = str.substring(C89361p.m154888a((CharSequence) str, "md5", 0, false, 6) + 3, C89361p.m154885a((CharSequence) str, "_model"));
            C89219l.m154709a((Object) substring, "");
            return substring;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m150685a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        boolean z = false;
        if (C87007u.m150697a(str) || C87007u.m150697a(str2)) {
            return false;
        }
        if (C87007u.m150698a(str, str2)) {
            return true;
        }
        try {
            String substring = str.substring(0, C89361p.m154888a((CharSequence) str, ".", 0, false, 6));
            C89219l.m154709a((Object) substring, "");
            String substring2 = str2.substring(0, C89361p.m154888a((CharSequence) str, ".", 0, false, 6));
            C89219l.m154709a((Object) substring2, "");
            z = C87007u.m150698a(substring, substring2);
            return z;
        } catch (Exception unused) {
            return z;
        }
    }
}
