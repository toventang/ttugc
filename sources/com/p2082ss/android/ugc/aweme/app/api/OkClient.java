package com.p2082ss.android.ugc.aweme.app.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o;
import com.bytedance.frameworks.baselib.network.http.p995g.C14756f;
import com.bytedance.retrofit2.client.AbstractC22025a;
import com.bytedance.retrofit2.client.AbstractC22029d;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.p1705f.C22954c;

/* renamed from: com.ss.android.ugc.aweme.app.api.OkClient */
public class OkClient implements AbstractC22025a.AbstractC22026a {
    static {
        Covode.recordClassIndex(40493);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.OkClient$a */
    static class C33601a implements AbstractC22025a {
        static {
            Covode.recordClassIndex(40494);
        }

        private C33601a() {
        }

        /* synthetic */ C33601a(byte b) {
            this();
        }

        @Override // com.bytedance.retrofit2.client.AbstractC22025a
        /* renamed from: a */
        public final AbstractC22029d mo11597a(Request request) {
            Context a = TTNetInit.getTTNetDepend().mo37259a();
            C14722o a2 = C14722o.m26949a(a);
            if (C14756f.m27057b(a)) {
                C14722o.f35861j = C22954c.m43256a();
            }
            return a2.mo11597a(request);
        }
    }

    @Override // com.bytedance.retrofit2.client.AbstractC22025a.AbstractC22026a
    public AbstractC22025a get() {
        return new C33601a((byte) 0);
    }
}
