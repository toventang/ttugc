package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.an */
public final class C46702an {

    /* renamed from: a */
    public static final C46702an f108864a = new C46702an();

    /* renamed from: b */
    private static final AbstractC89244h f108865b = C89250i.m154773a((AbstractC89171a) C46703a.f108866a);

    /* renamed from: a */
    public static int m90092a() {
        return ((Number) f108865b.getValue()).intValue();
    }

    private C46702an() {
    }

    /* renamed from: b */
    public static boolean m90093b() {
        if (m90092a() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.an$a */
    static final class C46703a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46703a f108866a = new C46703a();

        static {
            Covode.recordClassIndex(55304);
        }

        C46703a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "feed_adapter_get_view_delay", -1));
        }
    }

    static {
        Covode.recordClassIndex(55303);
    }
}
