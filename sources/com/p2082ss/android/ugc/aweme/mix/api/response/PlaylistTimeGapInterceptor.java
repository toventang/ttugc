package com.p2082ss.android.ugc.aweme.mix.api.response;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;

/* renamed from: com.ss.android.ugc.aweme.mix.api.response.PlaylistTimeGapInterceptor */
public final class PlaylistTimeGapInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(69786);
    }

    /* renamed from: a */
    private static C22099u<?> m109105a(AbstractC22021a.AbstractC22022a aVar) {
        Request request;
        C22099u<?> uVar;
        T t;
        C22028c cVar;
        Object obj;
        if (aVar != null) {
            try {
                request = aVar.mo35809a();
            } catch (Throwable unused) {
                if (aVar != null) {
                    return aVar.mo35810a(aVar.mo35809a());
                }
                return null;
            }
        } else {
            request = null;
        }
        if (request == null) {
            return null;
        }
        if (aVar != null) {
            uVar = aVar.mo35810a(request);
        } else {
            uVar = null;
        }
        if (uVar != null) {
            t = uVar.f52262b;
        } else {
            t = null;
        }
        if (uVar != null) {
            cVar = uVar.f52261a;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            obj = cVar.f52044f;
        } else {
            obj = null;
        }
        if ((t instanceof AbstractC33631g) && (obj instanceof C14612a)) {
            t.setRequestInfo((C14612a) obj);
        }
        return uVar;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m109105a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u<?> a = m109105a(aVar);
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
