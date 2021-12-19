package com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;

/* renamed from: com.ss.android.ugc.aweme.net.h.a.a.e */
public final class C61368e implements AbstractC90202u {
    static {
        Covode.recordClassIndex(72001);
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        if (C61367d.m111106a(aVar.mo144856a())) {
            System.currentTimeMillis();
            C58945a.C58947b.f134185a.mo96429b("feed_ok_security_interceptor_duration", false);
            C58945a.C58947b.f134185a.mo96425a("feed_ok_security_interceptor_to_connection", false);
        }
        return aVar.mo144857a(aVar.mo144856a());
    }
}
