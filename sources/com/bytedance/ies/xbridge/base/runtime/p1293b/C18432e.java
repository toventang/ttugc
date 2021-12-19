package com.bytedance.ies.xbridge.base.runtime.p1293b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o;
import com.bytedance.frameworks.baselib.network.http.p995g.C14756f;
import com.bytedance.retrofit2.client.AbstractC22025a;
import com.bytedance.retrofit2.client.AbstractC22029d;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.AbstractC22938d;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.p1705f.C22954c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.base.runtime.b.e */
public final class C18432e implements AbstractC22025a.AbstractC22026a {
    static {
        Covode.recordClassIndex(21106);
    }

    @Override // com.bytedance.retrofit2.client.AbstractC22025a.AbstractC22026a
    public final AbstractC22025a get() {
        return new C18433a();
    }

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.b.e$a */
    public static final class C18433a implements AbstractC22025a {
        static {
            Covode.recordClassIndex(21107);
        }

        @Override // com.bytedance.retrofit2.client.AbstractC22025a
        /* renamed from: a */
        public final AbstractC22029d mo11597a(Request request) {
            AbstractC22938d tTNetDepend = TTNetInit.getTTNetDepend();
            C89219l.m154709a((Object) tTNetDepend, "");
            Context a = tTNetDepend.mo37259a();
            C14722o a2 = C14722o.m26949a(a);
            if (C14756f.m27057b(a)) {
                C14722o.m26959a(C22954c.m43256a());
            }
            return a2.mo11597a(request);
        }
    }
}
