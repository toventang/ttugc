package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.C30731d;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bf */
public final class C73987bf {
    static {
        Covode.recordClassIndex(86737);
    }

    /* renamed from: a */
    public static final int m130120a(C30731d.EnumC30737f fVar) {
        C89219l.m154721d(fVar, "");
        int i = C73988bg.f166081a[fVar.ordinal()];
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        throw new C89376n();
    }
}
