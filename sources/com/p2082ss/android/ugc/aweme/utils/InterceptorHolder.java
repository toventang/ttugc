package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39364a;
import com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39367c;
import com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39369d;
import com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39371e;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.VerifyInterceptor;
import com.p2082ss.android.ugc.aweme.net.InterceptorProvider;
import com.p2082ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import com.p2082ss.android.ugc.aweme.net.monitor.C61427b;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.monitor.C61445p;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61410h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.AbstractC90202u;

/* renamed from: com.ss.android.ugc.aweme.utils.InterceptorHolder */
public class InterceptorHolder implements InterceptorProvider {
    static {
        Covode.recordClassIndex(93424);
    }

    @Override // com.p2082ss.android.ugc.aweme.net.InterceptorProvider
    /* renamed from: a */
    public final List<AbstractC22021a> mo98922a() {
        return Arrays.asList(new VerifyInterceptor());
    }

    @Override // com.p2082ss.android.ugc.aweme.net.InterceptorProvider
    /* renamed from: b */
    public final List<AbstractC22021a> mo98923b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FeedRetryInterceptorTTNet());
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.InterceptorProvider
    /* renamed from: c */
    public final List<AbstractC90202u> mo98924c() {
        ArrayList arrayList = new ArrayList();
        if (!C61410h.m111181a().f139422a) {
            arrayList.add(new C61445p());
        }
        return arrayList;
    }

    /* renamed from: e */
    public static InterceptorProvider m138948e() {
        MethodCollector.m26663i(9765);
        Object a = C81908b.m141854a(InterceptorProvider.class, false);
        if (a != null) {
            InterceptorProvider interceptorProvider = (InterceptorProvider) a;
            MethodCollector.m26664o(9765);
            return interceptorProvider;
        }
        if (C81908b.f183393ew == null) {
            synchronized (InterceptorProvider.class) {
                try {
                    if (C81908b.f183393ew == null) {
                        C81908b.f183393ew = new InterceptorHolder();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9765);
                    throw th;
                }
            }
        }
        InterceptorHolder interceptorHolder = (InterceptorHolder) C81908b.f183393ew;
        MethodCollector.m26664o(9765);
        return interceptorHolder;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.InterceptorProvider
    /* renamed from: d */
    public final void mo98925d() {
        C61439n.C61440a.m111264a(new C61427b());
        C61439n.C61440a.m111264a(new C39364a());
        C61439n.C61440a.m111264a(new C39367c());
        C61439n.C61440a.m111264a(new C39371e());
        C61439n.C61440a.m111264a(new C39369d());
        C39223a.m79596j().mo68697a(C80356dr.f179888a);
    }
}
