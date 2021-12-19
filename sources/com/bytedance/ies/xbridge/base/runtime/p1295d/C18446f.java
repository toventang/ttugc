package com.bytedance.ies.xbridge.base.runtime.p1295d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.retrofit.ExecutorC14760a;
import com.bytedance.frameworks.baselib.network.http.retrofit.p996a.p997a.C14761a;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit;
import com.bytedance.ies.xbridge.base.runtime.p1293b.C18432e;
import com.bytedance.ies.xbridge.base.runtime.p1293b.C18435g;
import com.bytedance.ies.xbridge.base.runtime.p1293b.C18436h;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.client.AbstractC22025a;
import com.bytedance.retrofit2.p1613d.p1614a.C22042h;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.base.runtime.d.f */
public final class C18446f implements IHostNetworkDepend {
    static {
        Covode.recordClassIndex(21120);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final Map<String, Object> getAPIParams() {
        return null;
    }

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.d.f$a */
    final class C18447a implements XIRetrofit {

        /* renamed from: a */
        final /* synthetic */ C18446f f44073a;

        /* renamed from: b */
        private final C22092q f44074b;

        static {
            Covode.recordClassIndex(21121);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit
        public final <T> T create(Class<T> cls) {
            C89219l.m154719c(cls, "");
            return (T) this.f44074b.mo35884a(cls);
        }

        public C18447a(C18446f fVar, C22092q qVar) {
            C89219l.m154719c(qVar, "");
            this.f44073a = fVar;
            this.f44074b = qVar;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final XIRetrofit createRetrofit(String str, boolean z) {
        AbstractC22025a.AbstractC22026a hVar;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str, "");
        C22092q.C22094a a = new C22092q.C22094a().mo35892a(str).mo35891a(C14761a.m27085a()).mo35888a(C22042h.m41421a()).mo35893a(new ExecutorC14760a()).mo35889a(new SsInterceptor());
        if (z) {
            hVar = new C18432e();
        } else {
            hVar = new C18436h();
        }
        C22092q a2 = C18435g.m34296a(a.mo35890a(hVar));
        C89219l.m154709a((Object) a2, "");
        return new C18447a(this, a2);
    }
}
