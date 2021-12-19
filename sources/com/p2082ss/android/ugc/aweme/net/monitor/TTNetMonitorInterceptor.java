package com.p2082ss.android.ugc.aweme.net.monitor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor */
public final class TTNetMonitorInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(72080);
    }

    /* renamed from: a */
    private static C22099u<?> m111190a(AbstractC22021a.AbstractC22022a aVar) {
        C89219l.m154721d(aVar, "");
        C61425e<Request, C22099u<?>> a = C61439n.f139485e.mo68796a(new C61425e<>(aVar.mo35809a(), null, 62));
        if (a.f139473f == EnumC61424d.INTERCEPT && a.f139469b != null) {
            R r = a.f139469b;
            if (r == null) {
                C89219l.m154715b();
            }
            return r;
        } else if (a.f139473f != EnumC61424d.EXCEPTION || a.f139472e == null) {
            Q q = a.f139468a;
            if (q == null) {
                C89219l.m154715b();
            }
            a.f139469b = (R) aVar.mo35810a(q);
            C61425e<Request, C22099u<?>> b = C61439n.f139485e.mo68798b(a);
            if (b.f139473f != EnumC61424d.EXCEPTION || b.f139472e == null) {
                R r2 = b.f139469b;
                if (r2 == null) {
                    C89219l.m154715b();
                }
                return r2;
            }
            RuntimeException runtimeException = b.f139472e;
            if (runtimeException == null) {
                C89219l.m154715b();
            }
            throw runtimeException;
        } else {
            RuntimeException runtimeException2 = a.f139472e;
            if (runtimeException2 == null) {
                C89219l.m154715b();
            }
            throw runtimeException2;
        }
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m111190a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u<?> a = m111190a(aVar);
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
