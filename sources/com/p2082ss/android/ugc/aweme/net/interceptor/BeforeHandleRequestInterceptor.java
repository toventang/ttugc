package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.app.Activity;
import android.content.ComponentName;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.net.p3494g.C61355a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor */
public final class BeforeHandleRequestInterceptor implements AbstractC22021a {

    /* renamed from: a */
    private final AbstractC22021a f139395a;

    static {
        Covode.recordClassIndex(72035);
    }

    public BeforeHandleRequestInterceptor(AbstractC22021a aVar) {
        C89219l.m154721d(aVar, "");
        this.f139395a = aVar;
    }

    /* renamed from: a */
    private C22099u<?> m111157a(AbstractC22021a.AbstractC22022a aVar) {
        String str;
        ComponentName componentName;
        C89219l.m154721d(aVar, "");
        Request a = aVar.mo35809a();
        C89219l.m154716b(a, "");
        if (C61355a.m111096a(a)) {
            return this.f139395a.intercept(aVar);
        }
        Activity j = C17873f.m33102j();
        if (j == null || (componentName = j.getComponentName()) == null || (str = componentName.getClassName()) == null) {
            str = "unknown";
        }
        C89219l.m154716b(str, "");
        long currentTimeMillis = System.currentTimeMillis();
        C22099u<?> intercept = this.f139395a.intercept(aVar);
        C89219l.m154716b(intercept, "");
        C61355a.m111095a(a, intercept, currentTimeMillis, str);
        return intercept;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m111157a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u<?> a = m111157a(aVar);
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
