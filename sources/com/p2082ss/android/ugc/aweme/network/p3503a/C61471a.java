package com.p2082ss.android.ugc.aweme.network.p3503a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.network.a.a */
public final class C61471a {

    /* renamed from: a */
    static final AbstractC89244h f139551a = C89250i.m154773a((AbstractC89171a) C61472a.f139554a);

    /* renamed from: b */
    public static final C61471a f139552b = new C61471a();

    /* renamed from: c */
    private static final AbstractC89244h f139553c = C89250i.m154773a((AbstractC89171a) C61473b.f139555a);

    /* renamed from: a */
    public static boolean m111324a() {
        return ((Boolean) f139553c.getValue()).booleanValue();
    }

    private C61471a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a.a$a */
    static final class C61472a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C61472a f139554a = new C61472a();

        static {
            Covode.recordClassIndex(72129);
        }

        C61472a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("enable_request_tag", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a.a$b */
    static final class C61473b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C61473b f139555a = new C61473b();

        static {
            Covode.recordClassIndex(72130);
        }

        C61473b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((((Number) C61471a.f139551a.getValue()).intValue() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(72128);
    }
}
