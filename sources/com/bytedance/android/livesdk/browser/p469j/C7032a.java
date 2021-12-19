package com.bytedance.android.livesdk.browser.p469j;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.browser.j.a */
public final class C7032a {

    /* renamed from: a */
    public static final C7032a f17634a = new C7032a();

    private C7032a() {
    }

    static {
        Covode.recordClassIndex(7771);
    }

    /* renamed from: a */
    public static final String m14989a(String str) {
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
