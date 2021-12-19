package com.p2082ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.b */
public final class C45554b {

    /* renamed from: a */
    public static final C45554b f106093a = new C45554b();

    /* renamed from: b */
    private static final AbstractC89244h f106094b = C89250i.m154773a((AbstractC89171a) C45555a.f106095a);

    /* renamed from: a */
    public static String m88105a() {
        return (String) f106094b.getValue();
    }

    private C45554b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.util.b$a */
    static final class C45555a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C45555a f106095a = new C45555a();

        static {
            Covode.recordClassIndex(54048);
        }

        C45555a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (C58939a.C58940a.f134171a.f134170a.enableBoe()) {
                return "http://oec-api.tiktokv.com.boe-gateway.byted.org/";
            }
            return "https://oec-api.tiktokv.com/";
        }
    }

    static {
        Covode.recordClassIndex(54047);
    }
}
