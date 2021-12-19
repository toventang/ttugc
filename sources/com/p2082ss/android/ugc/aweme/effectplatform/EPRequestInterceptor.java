package com.p2082ss.android.ugc.aweme.effectplatform;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import okhttp3.C90200t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor */
public final class EPRequestInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(54977);
    }

    /* renamed from: a */
    private static C22099u<?> m89509a(AbstractC22021a.AbstractC22022a aVar) {
        C89219l.m154721d(aVar, "");
        Request a = aVar.mo35809a();
        C89219l.m154716b(a, "");
        C90200t f = C90200t.m156802f(a.getUrl());
        if (f != null) {
            String tVar = f.mo145060j().mo145070c("channel", EffectPlatform.m89511b()).mo145068b().toString();
            C89219l.m154716b(tVar, "");
            a = a.newBuilder().mo35838a(tVar).mo35840a();
        }
        C22099u<?> a2 = aVar.mo35810a(a);
        C89219l.m154716b(a2, "");
        return a2;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m89509a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u<?> a = m89509a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }
}
