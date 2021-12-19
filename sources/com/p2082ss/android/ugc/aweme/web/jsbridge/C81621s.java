package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.HybridRegistryProvider;
import com.p2082ss.android.ugc.aweme.web.AbstractC81548i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.s */
public final class C81621s {

    /* renamed from: a */
    public static final C81621s f182514a = new C81621s();

    private C81621s() {
    }

    static {
        Covode.recordClassIndex(95018);
    }

    /* renamed from: a */
    public static AbstractC81548i m141472a(Context context) {
        IHybridRegistryProvider a = HybridRegistryProvider.m81713a();
        if (context == null) {
            C89219l.m154715b();
        }
        AbstractC81548i a2 = a.mo69604a(context);
        C89219l.m154716b(a2, "");
        return a2;
    }
}
