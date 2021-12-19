package com.bytedance.android.live.network;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p987c.C14665a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.client.AbstractC22025a;
import com.p2082ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor;
import com.p2082ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61410h;
import com.p2082ss.android.ugc.aweme.utils.C80399eo;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.network.p */
public final class C5826p {
    static {
        Covode.recordClassIndex(6432);
    }

    /* renamed from: a */
    public static C22092q m12763a(C22092q.C22094a aVar) {
        if (C61410h.m111181a().f139422a) {
            try {
                AbstractC22025a.AbstractC22026a aVar2 = (AbstractC22025a.AbstractC22026a) Reflect.m24529on(aVar).field("clientProvider", new Class[0]).get();
                AbstractC22025a aVar3 = aVar2.get();
                if ("com.ss.android.ugc.aweme.app.api.OkClient".equals(aVar2.getClass().getName()) || (aVar3 instanceof C14722o) || (aVar3 instanceof C14665a)) {
                    return aVar.mo35894a();
                }
            } catch (Throwable th) {
                C80399eo.m139373a(th, "error occured.");
            }
        }
        C22092q a = aVar.mo35894a();
        if (a.f52140g != null) {
            a.f52140g.add(new TTNetMonitorInterceptor());
            a.f52140g.set(0, new BeforeHandleRequestInterceptor(a.f52140g.get(0)));
        }
        return a;
    }
}
