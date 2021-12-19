package com.p2082ss.android.ugc.aweme.net.interceptor;

import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90200t;
import okhttp3.Request;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.a */
public final class C61399a implements AbstractC90202u {
    static {
        Covode.recordClassIndex(72049);
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        C90200t.C90201a j;
        C89219l.m154721d(aVar, "");
        Request a = aVar.mo144856a();
        C90200t f = C90200t.m156802f(a.url().toString());
        if (!(f == null || (j = f.mo145060j()) == null)) {
            if (C89219l.m154714a((Object) f.f204861d, (Object) "api.tiktokv.com")) {
                j.mo145069c("api-h2.tiktokv.com");
            }
            a = a.newBuilder().mo144691a(j.mo145068b().toString()).mo144698a();
        }
        C90029ac a2 = aVar.mo144857a(a);
        C89219l.m154716b(a2, "");
        return a2;
    }
}
