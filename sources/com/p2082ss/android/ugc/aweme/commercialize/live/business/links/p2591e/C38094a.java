package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2591e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.AbstractC38089a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.C38090b;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.C38091c;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.C38093e;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.EnumC38092d;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.e.a */
public final class C38094a {

    /* renamed from: a */
    public static final C38094a f90000a = new C38094a();

    private C38094a() {
    }

    static {
        Covode.recordClassIndex(45561);
    }

    /* renamed from: a */
    public static AbstractC38089a m77209a(EnumC38092d dVar, AbstractC89172b<? super Bundle, C89391z> bVar) {
        C89219l.m154721d(dVar, "");
        int i = C38095b.f90001a[dVar.ordinal()];
        if (i == 1) {
            return C38096c.m77210a(C38093e.class, bVar);
        }
        if (i == 2) {
            return C38096c.m77210a(C38090b.class, bVar);
        }
        if (i != 3) {
            return null;
        }
        return C38096c.m77210a(C38091c.class, bVar);
    }
}
