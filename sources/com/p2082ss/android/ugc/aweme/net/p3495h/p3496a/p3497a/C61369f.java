package com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;

/* renamed from: com.ss.android.ugc.aweme.net.h.a.a.f */
public final class C61369f implements AbstractC90202u {

    /* renamed from: a */
    private AbstractC90202u f139361a;

    static {
        Covode.recordClassIndex(72002);
    }

    public C61369f(AbstractC90202u uVar) {
        this.f139361a = uVar;
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        if (C61367d.m111106a(aVar.mo144856a())) {
            System.currentTimeMillis();
            C58945a.C58947b.f134185a.mo96429b("feed_ok_start_to_security_interceptor", false);
            C58945a.C58947b.f134185a.mo96425a("feed_ok_security_interceptor_duration", false);
        }
        AbstractC90202u uVar = this.f139361a;
        if (uVar != null) {
            return uVar.intercept(aVar);
        }
        return aVar.mo144857a(aVar.mo144856a());
    }
}
