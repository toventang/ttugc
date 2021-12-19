package com.twitter.sdk.android.core.internal.p4498a;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.C87691i;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.C87745b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90195q;
import okhttp3.C90200t;
import okhttp3.Request;

/* renamed from: com.twitter.sdk.android.core.internal.a.d */
public final class C87715d implements AbstractC90202u {

    /* renamed from: a */
    final C87691i<? extends TwitterAuthToken> f199232a;

    /* renamed from: b */
    final TwitterAuthConfig f199233b;

    static {
        Covode.recordClassIndex(103704);
    }

    /* renamed from: a */
    private static Map<String, String> m152643a(Request request) {
        HashMap hashMap = new HashMap();
        if ("POST".equals(request.method().toUpperCase(Locale.US))) {
            AbstractC90025ab body = request.body();
            if (body instanceof C90195q) {
                C90195q qVar = (C90195q) body;
                for (int i = 0; i < qVar.mo145019a(); i++) {
                    hashMap.put(qVar.mo145020a(i), C90200t.m156795a(qVar.mo145021b(i), true));
                }
            }
        }
        return hashMap;
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        Request a = aVar.mo144856a();
        Request.C90016a newBuilder = a.newBuilder();
        C90200t url = a.url();
        C90200t.C90201a j = url.mo145060j();
        j.f204873g = null;
        if (url.f204864g != null) {
            int size = url.f204864g.size() / 2;
            for (int i = 0; i < size; i++) {
                if (url.f204864g != null) {
                    int i2 = i * 2;
                    String b = C87717f.m152648b(url.f204864g.get(i2));
                    if (url.f204864g != null) {
                        j.mo145067b(b, C87717f.m152648b(url.f204864g.get(i2 + 1)));
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
        }
        Request a2 = newBuilder.mo144697a(j.mo145068b()).mo144698a();
        return aVar.mo144857a(a2.newBuilder().mo144692a("Authorization", C87745b.m152707a(this.f199233b, (TwitterAuthToken) this.f199232a.f199192a, null, a2.method(), a2.url().toString(), m152643a(a2))).mo144698a());
    }

    public C87715d(C87691i<? extends TwitterAuthToken> iVar, TwitterAuthConfig twitterAuthConfig) {
        this.f199232a = iVar;
        this.f199233b = twitterAuthConfig;
    }
}
