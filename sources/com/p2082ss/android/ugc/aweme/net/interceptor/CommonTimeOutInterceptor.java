package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14617b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.p1703d.C22944d;
import com.p2082ss.android.ugc.aweme.net.p3491d.C61334b;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.CommonTimeOutInterceptor */
public final class CommonTimeOutInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(72038);
    }

    /* renamed from: a */
    private static C22099u<?> m111160a(AbstractC22021a.AbstractC22022a aVar) {
        C89219l.m154721d(aVar, "");
        Request a = aVar.mo35809a();
        Set<String> set = C61334b.f139295b.f139298a;
        C89219l.m154716b(a, "");
        if (set.contains(a.getPath())) {
            Object extraInfo = a.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = new C22944d();
                a.setExtraInfo(extraInfo);
            }
            if (!(extraInfo instanceof C14617b)) {
                extraInfo = null;
            }
            C14617b bVar = (C14617b) extraInfo;
            if (bVar != null) {
                bVar.f35406i = C61334b.f139295b.f139302e;
                bVar.f35403f = C61334b.f139295b.f139299b;
                bVar.f35405h = C61334b.f139295b.f139300c;
                bVar.f35404g = C61334b.f139295b.f139301d;
            }
        }
        C22099u<?> a2 = aVar.mo35810a(a);
        C89219l.m154716b(a2, "");
        return a2;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m111160a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u<?> a = m111160a(aVar);
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
