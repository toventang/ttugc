package com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.api.C48331e;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;

/* renamed from: com.ss.android.ugc.aweme.net.h.a.a.d */
public class C61367d implements AbstractC90202u {
    static {
        Covode.recordClassIndex(72000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo98961a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C90029ac mo98960a(AbstractC90202u.AbstractC90203a aVar) {
        return aVar.mo144857a(aVar.mo144856a());
    }

    /* renamed from: a */
    public static boolean m111106a(Request request) {
        if (request == null || request.url() == null || !C48331e.m91791a(request.url().toString())) {
            return false;
        }
        return true;
    }

    @Override // okhttp3.AbstractC90202u
    public C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        Request a = aVar.mo144856a();
        if (!mo98961a() || !m111106a(a)) {
            return aVar.mo144857a(aVar.mo144856a());
        }
        return mo98960a(aVar);
    }
}
