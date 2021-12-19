package com.p2082ss.android.ugc.aweme.compliance.business.p2641a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.a.a */
public final class C39290a {

    /* renamed from: a */
    public static final int f92765a = 1;

    /* renamed from: b */
    public static final AbstractC89244h f92766b = C89250i.m154773a((AbstractC89171a) C39291a.f92768a);

    /* renamed from: c */
    public static final C39290a f92767c = new C39290a();

    private C39290a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.a$a */
    static final class C39291a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C39291a f92768a = new C39291a();

        static {
            Covode.recordClassIndex(46970);
        }

        C39291a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25411a("kr_consent_box_fix", ClientExpManager.kr_consent_box_fix()));
        }
    }

    static {
        Covode.recordClassIndex(46969);
    }
}
