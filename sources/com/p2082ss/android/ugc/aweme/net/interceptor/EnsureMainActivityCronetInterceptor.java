package com.p2082ss.android.ugc.aweme.net.interceptor;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.experiment.C46807cw;
import com.p2082ss.android.ugc.aweme.feed.p2964r.C49906b;
import com.p2082ss.android.ugc.aweme.logger.C58945a;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.EnsureMainActivityCronetInterceptor */
public class EnsureMainActivityCronetInterceptor extends FeedBaseCronetInterceptor {
    static {
        Covode.recordClassIndex(72041);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    /* renamed from: a */
    public final boolean mo98967a() {
        C58945a.C58947b.f134185a.mo96429b("feed_network_to_ensure_main_interceptor", false);
        boolean z = !C49906b.f115048b;
        if (!z && C46807cw.f109052d) {
            C58945a.C58947b.f134185a.mo96425a("feed_preload_ensuremain_interceptor", false);
            C58945a.C58947b.f134185a.mo96429b("feed_preload_ensuremain_interceptor", false);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    /* renamed from: a */
    public final C22099u mo98966a(AbstractC22021a.AbstractC22022a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        C49906b.m93684a();
        C58945a.C58947b.f134185a.mo96423a("ensure_main_activity_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        C58945a.C58947b.f134185a.mo96425a("feed_preload_ensuremain_interceptor", false);
        C58945a.C58947b.f134185a.mo96429b("feed_preload_ensuremain_interceptor", false);
        return super.mo98966a(aVar);
    }
}
