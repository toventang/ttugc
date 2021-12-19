package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2591e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.AbstractC38089a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.e.c */
public final class C38096c {
    static {
        Covode.recordClassIndex(45563);
    }

    /* renamed from: a */
    public static final <T extends AbstractC38089a> AbstractC38089a m77210a(Class<T> cls, AbstractC89172b<? super Bundle, C89391z> bVar) {
        C89219l.m154721d(cls, "");
        try {
            T newInstance = cls.newInstance();
            Bundle bundle = new Bundle();
            if (bVar != null) {
                bVar.invoke(bundle);
                newInstance.f89998a = bundle;
            }
            return newInstance;
        } catch (Throwable unused) {
            return null;
        }
    }
}
