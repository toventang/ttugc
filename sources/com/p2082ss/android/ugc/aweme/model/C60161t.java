package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.t */
public final class C60161t {

    /* renamed from: a */
    public final String f137145a;

    /* renamed from: b */
    private final String f137146b;

    static {
        Covode.recordClassIndex(70688);
    }

    /* renamed from: a */
    public final int mo97835a() {
        try {
            return Integer.parseInt(this.f137146b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public C60161t(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f137146b = str;
        this.f137145a = str2;
    }
}
