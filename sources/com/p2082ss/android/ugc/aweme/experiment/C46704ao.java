package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.ao */
public final class C46704ao {

    /* renamed from: a */
    public static final C46704ao f108867a = new C46704ao();

    /* renamed from: b */
    private static final AbstractC89244h f108868b = C89250i.m154773a((AbstractC89171a) C46705a.f108869a);

    /* renamed from: a */
    public static int m90094a() {
        return ((Number) f108868b.getValue()).intValue();
    }

    private C46704ao() {
    }

    /* renamed from: b */
    public static boolean m90095b() {
        if (m90094a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m90096c() {
        if (m90094a() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ao$a */
    static final class C46705a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46705a f108869a = new C46705a();

        static {
            Covode.recordClassIndex(55306);
        }

        C46705a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "viewpager_load_delay_phase", 0));
        }
    }

    static {
        Covode.recordClassIndex(55305);
    }
}
