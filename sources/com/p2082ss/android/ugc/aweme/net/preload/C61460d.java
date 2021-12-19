package com.p2082ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.net.preload.d */
public final class C61460d {
    static {
        Covode.recordClassIndex(72116);
    }

    /* renamed from: a */
    public static final boolean m111308a(Request request) {
        C89219l.m154721d(request, "");
        if (m111309b(request) || m111310c(request)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m111309b(Request request) {
        C89219l.m154721d(request, "");
        return C89361p.m154872a("GET", request.getMethod(), true);
    }

    /* renamed from: c */
    private static boolean m111310c(Request request) {
        C89219l.m154721d(request, "");
        return C89361p.m154872a("POST", request.getMethod(), true);
    }
}
