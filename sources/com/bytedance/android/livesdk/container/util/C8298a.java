package com.bytedance.android.livesdk.container.util;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.container.util.a */
public final class C8298a {

    /* renamed from: a */
    public static final C8298a f20567a = new C8298a();

    private C8298a() {
    }

    static {
        Covode.recordClassIndex(9135);
    }

    /* renamed from: a */
    public static String m16454a(String str) {
        C89219l.m154721d(str, "");
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
