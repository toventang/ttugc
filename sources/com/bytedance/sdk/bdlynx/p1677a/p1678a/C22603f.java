package com.bytedance.sdk.bdlynx.p1677a.p1678a;

import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.serviceapi.defaults.thread.BdpThreadService;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.a.a.f */
public final class C22603f {

    /* renamed from: a */
    public static final C22603f f53406a = new C22603f();

    /* renamed from: b */
    private static final AbstractC89244h f53407b = C89250i.m154773a((AbstractC89171a) C22604a.f53408a);

    /* renamed from: a */
    private static BdpThreadService m42636a() {
        return (BdpThreadService) f53407b.getValue();
    }

    private C22603f() {
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.f$a */
    static final class C22604a extends AbstractC89220m implements AbstractC89171a<BdpThreadService> {

        /* renamed from: a */
        public static final C22604a f53408a = new C22604a();

        static {
            Covode.recordClassIndex(26420);
        }

        C22604a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BdpThreadService invoke() {
            return BdpManager.getInst().getService(BdpThreadService.class);
        }
    }

    static {
        Covode.recordClassIndex(26419);
    }

    /* renamed from: b */
    public static void m42638b(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        m42636a().runOnWorker(runnable);
    }

    /* renamed from: a */
    public static void m42637a(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        m42636a().runOnUIThread(runnable);
    }
}
