package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.w */
public final class C49533w {

    /* renamed from: a */
    public static final C49533w f113915a = new C49533w();

    /* renamed from: b */
    private static final AbstractC89244h f113916b = C89250i.m154773a((AbstractC89171a) C49534a.f113917a);

    /* renamed from: a */
    public static int m92772a() {
        return ((Number) f113916b.getValue()).intValue();
    }

    private C49533w() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.experiment.w$a */
    static final class C49534a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C49534a f113917a = new C49534a();

        static {
            Covode.recordClassIndex(58348);
        }

        C49534a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "refactor_feed_foryou_2240", 0));
        }
    }

    static {
        Covode.recordClassIndex(58347);
    }

    /* renamed from: b */
    public static final boolean m92773b() {
        if (m92772a() == 1 || m92772a() == 2 || m92772a() == 3 || C49535x.f113918a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m92774c() {
        if (m92772a() == 2 || m92772a() == 3 || C49535x.f113918a) {
            return true;
        }
        return false;
    }
}
