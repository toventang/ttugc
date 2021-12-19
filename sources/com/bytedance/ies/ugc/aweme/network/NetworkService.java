package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.C18100g;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.TTNetInit;
import com.p2082ss.android.ugc.aweme.net.cache.C61313a;
import com.p2082ss.android.ugc.aweme.net.cache.C61328j;
import com.p2082ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet;
import com.p2082ss.android.ugc.aweme.network.AbstractC61491c;
import com.p2082ss.android.ugc.aweme.network.C61464a;
import com.p2082ss.android.ugc.aweme.network.INetwork;
import java.util.concurrent.Executor;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

public class NetworkService implements INetwork {
    static {
        Covode.recordClassIndex(20711);
    }

    @Override // com.p2082ss.android.ugc.aweme.network.INetwork
    /* renamed from: a */
    public final void mo28818a() {
        C18100g.m33702b();
    }

    @Override // com.p2082ss.android.ugc.aweme.network.INetwork
    /* renamed from: b */
    public final C61464a mo28821b() {
        return C18100g.m33701a();
    }

    @Override // com.p2082ss.android.ugc.aweme.network.INetwork
    /* renamed from: c */
    public final AbstractC22021a mo28822c() {
        return new ApiAlisgInterceptorTTNet();
    }

    @Override // com.p2082ss.android.ugc.aweme.network.INetwork
    /* renamed from: a */
    public final void mo28819a(long j) {
        if (C18100g.f43088b && C18100g.f43089c) {
            try {
                TTNetInit.setALogFuncAddr(j);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.network.INetwork
    /* renamed from: a */
    public final void mo28820a(AbstractC61491c cVar, Executor executor) {
        C89219l.m154721d(executor, "");
        cVar.mo98929a();
        C61313a.f139251a = new C61328j();
        C1731i.m5640b(new C18100g.CallableC18101a(cVar), executor);
    }
}
