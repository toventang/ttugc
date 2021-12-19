package com.p2082ss.android.ugc.tools.p4346h.p4347a;

import com.bytedance.covode.number.Covode;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.a.i */
public final class C84450i {
    static {
        Covode.recordClassIndex(98415);
    }

    /* renamed from: a */
    public static final <KEY, RESULT, INFO> boolean m145271a(AbstractC84449h<KEY, RESULT, INFO> hVar, KEY key) {
        C89219l.m154721d(hVar, "");
        C89378p<EnumC84446e, Boolean> b = hVar.mo129431b(key);
        if (b == null) {
            return false;
        }
        EnumC84446e component1 = b.component1();
        if (component1 == EnumC84446e.PENDING || component1 == EnumC84446e.START) {
            return true;
        }
        return false;
    }
}
