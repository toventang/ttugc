package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.ae */
public final class C46686ae {

    /* renamed from: a */
    public static final C46686ae f108840a = new C46686ae();

    /* renamed from: b */
    private static final AbstractC89244h f108841b = C89250i.m154773a((AbstractC89171a) C46687a.f108842a);

    /* renamed from: a */
    public static boolean m90088a() {
        return ((Boolean) f108841b.getValue()).booleanValue();
    }

    private C46686ae() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ae$a */
    static final class C46687a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46687a f108842a = new C46687a();

        static {
            Covode.recordClassIndex(55288);
        }

        C46687a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "codecoverage_memory_opt", false));
        }
    }

    static {
        Covode.recordClassIndex(55287);
    }
}
