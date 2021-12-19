package com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2964r.C49906b;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.p3495h.C61370b;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;

/* renamed from: com.ss.android.ugc.aweme.net.h.a.a.b */
public final class C61365b extends C61367d {
    static {
        Covode.recordClassIndex(71998);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a.C61367d
    /* renamed from: a */
    public final boolean mo98961a() {
        C58945a.C58947b.f134185a.mo96429b("feed_network_to_ensure_main_interceptor", false);
        if (!C49906b.f115048b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a.C61367d
    /* renamed from: a */
    public final C90029ac mo98960a(AbstractC90202u.AbstractC90203a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        C49906b.m93684a();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C58945a.C58947b.f134185a.mo96423a("ensure_main_activity_interceptor_duration", currentTimeMillis2);
        if (currentTimeMillis2 >= 5000) {
            return C61370b.m111109a(aVar, "ensure_main_interceptor");
        }
        return super.mo98960a(aVar);
    }
}
