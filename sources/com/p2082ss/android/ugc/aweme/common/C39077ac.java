package com.p2082ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88982v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.ac */
public final class C39077ac {
    static {
        Covode.recordClassIndex(46693);
    }

    /* renamed from: a */
    private static <T> void m79341a(AbstractC88982v<T> vVar) {
        C89219l.m154721d(vVar, "");
        if (!vVar.isDisposed()) {
            vVar.mo143023a();
        }
    }

    /* renamed from: b */
    private static <T> void m79344b(AbstractC88982v<T> vVar, T t) {
        C89219l.m154721d(vVar, "");
        if (!vVar.isDisposed()) {
            vVar.mo143031a((Object) t);
        }
    }

    /* renamed from: a */
    public static final <T> void m79342a(AbstractC88982v<T> vVar, T t) {
        C89219l.m154721d(vVar, "");
        m79344b(vVar, t);
        m79341a(vVar);
    }

    /* renamed from: a */
    public static final <T> void m79343a(AbstractC88982v<T> vVar, Throwable th) {
        C89219l.m154721d(vVar, "");
        C89219l.m154721d(th, "");
        if (!vVar.isDisposed()) {
            vVar.mo143024a(th);
        }
    }
}
