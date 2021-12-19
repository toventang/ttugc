package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.p1007g.C14853c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.bx */
public final class C46773bx {

    /* renamed from: a */
    public static final int f108982a = 0;

    /* renamed from: b */
    public static final C46773bx f108983b = new C46773bx();

    /* renamed from: c */
    private static final int f108984c = 1;

    /* renamed from: d */
    private static final int f108985d = 2;

    /* renamed from: e */
    private static final AbstractC89244h<Integer> f108986e = C89250i.m154773a((AbstractC89171a) C46774a.f108987a);

    private C46773bx() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.bx$a */
    static final class C46774a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46774a f108987a = new C46774a();

        static {
            Covode.recordClassIndex(55375);
        }

        C46774a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m90125a());
        }

        /* renamed from: a */
        private static int m90125a() {
            try {
                return C16048b.m29633a().mo25411a("cpu_big_core_bound_client", ClientExpManager.cpu_big_core_bound_client());
            } catch (Exception unused) {
                return C46773bx.f108982a;
            }
        }
    }

    static {
        Covode.recordClassIndex(55374);
    }

    /* renamed from: a */
    public static boolean m90124a() {
        if (C14853c.f36267d && f108986e.getValue().intValue() == f108984c) {
            return true;
        }
        return false;
    }
}
