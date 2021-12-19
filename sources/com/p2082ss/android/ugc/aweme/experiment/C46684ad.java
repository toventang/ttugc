package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.ad */
public final class C46684ad {

    /* renamed from: a */
    public static final C46684ad f108837a = new C46684ad();

    /* renamed from: b */
    private static final AbstractC89244h f108838b = C89250i.m154773a((AbstractC89171a) C46685a.f108839a);

    /* renamed from: a */
    public static boolean m90087a() {
        return ((Boolean) f108838b.getValue()).booleanValue();
    }

    private C46684ad() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ad$a */
    static final class C46685a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46685a f108839a = new C46685a();

        static {
            Covode.recordClassIndex(55286);
        }

        C46685a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "codecoverage_enable", true));
        }
    }

    static {
        Covode.recordClassIndex(55285);
    }
}
