package com.p2082ss.android.ugc.aweme.compliance.business.termspp;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.c */
public final class C39586c {

    /* renamed from: a */
    public static final C39586c f93345a = new C39586c();

    /* renamed from: b */
    private static final AbstractC89244h f93346b = C89250i.m154773a((AbstractC89171a) C39587a.f93347a);

    /* renamed from: a */
    public static int m80369a() {
        return ((Number) f93346b.getValue()).intValue();
    }

    private C39586c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.c$a */
    static final class C39587a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C39587a f93347a = new C39587a();

        static {
            Covode.recordClassIndex(47298);
        }

        C39587a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25411a("kr_consent_box_optimization", ClientExpManager.kr_consent_box_optimization()));
        }
    }

    static {
        Covode.recordClassIndex(47297);
    }
}
