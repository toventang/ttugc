package com.p2082ss.android.ugc.aweme.net.p3499i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.C18182a;
import com.bytedance.ies.ugc.network.partner.p1276b.C18199f;
import com.bytedance.ies.ugc.network.partner.p1276b.C18201g;
import com.bytedance.retrofit2.client.C22027b;
import com.p2082ss.android.ugc.aweme.IApiGuardService;
import com.p2082ss.android.ugc.aweme.account.apiguard.ApiGuardService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.i.b */
public final class C61381b implements AbstractC18185b.AbstractC18190e, AbstractC18185b.AbstractC18192f {

    /* renamed from: a */
    public static final AbstractC89244h f139371a = C89250i.m154773a((AbstractC89171a) C61383b.f139373a);

    /* renamed from: b */
    public static final C61382a f139372b = new C61382a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.net.i.b$a */
    public static final class C61382a {
        static {
            Covode.recordClassIndex(72015);
        }

        /* renamed from: a */
        public static IApiGuardService m111118a() {
            return (IApiGuardService) C61381b.f139371a.getValue();
        }

        private C61382a() {
        }

        public /* synthetic */ C61382a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.i.b$b */
    static final class C61383b extends AbstractC89220m implements AbstractC89171a<IApiGuardService> {

        /* renamed from: a */
        public static final C61383b f139373a = new C61383b();

        static {
            Covode.recordClassIndex(72016);
        }

        C61383b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IApiGuardService invoke() {
            return ApiGuardService.createIApiGuardServicebyMonsterPlugin(false);
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b
    /* renamed from: a */
    public final String mo29034a() {
        return AbstractC18185b.C18188c.m33836a(this);
    }

    static {
        Covode.recordClassIndex(72014);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18190e
    /* renamed from: a */
    public final void mo29043a(C18199f fVar, C18182a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        if (C61382a.m111118a().isEnabled()) {
            IApiGuardService a = C61382a.m111118a();
            String a2 = fVar.f43342b.mo29061a();
            C89219l.m154716b(a2, "");
            Map<String, String> headers = a.getHeaders(a2);
            if (!headers.isEmpty()) {
                aVar.mo29032a(this, true);
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    fVar.f43343c.mo29047a(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18192f
    /* renamed from: a */
    public final void mo29044a(C18201g<?> gVar, C18182a aVar) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(aVar, "");
        if (!(!C89219l.m154714a(aVar.mo29031a(this), (Object) true))) {
            List<C22027b> a = gVar.f43358d.mo29046a();
            IApiGuardService a2 = C61382a.m111118a();
            HashMap hashMap = new HashMap(a.size());
            for (C22027b bVar : a) {
                hashMap.put(bVar.f52037a, bVar.f52038b);
            }
            a2.parseHeaders(hashMap);
        }
    }
}
