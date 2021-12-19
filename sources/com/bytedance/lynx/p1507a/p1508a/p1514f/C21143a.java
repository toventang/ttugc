package com.bytedance.lynx.p1507a.p1508a.p1514f;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.a.a.f.a */
public final class C21143a {

    /* renamed from: a */
    public static final C21143a f50169a = new C21143a();

    private C21143a() {
    }

    static {
        Covode.recordClassIndex(24759);
    }

    /* renamed from: a */
    public static String m39807a(String str) {
        C89219l.m154719c(str, "");
        if (str.length() == 8 || str.length() == 9) {
            if (C89361p.m154874b(str, "#", false)) {
                str = C89361p.m154821a(str, 1);
            }
            return "#".concat(String.valueOf(C89361p.m154828k(str) + C89361p.m154823b(str, 2)));
        } else if (str.length() == 6) {
            return "#".concat(String.valueOf(str));
        } else {
            return str;
        }
    }
}
