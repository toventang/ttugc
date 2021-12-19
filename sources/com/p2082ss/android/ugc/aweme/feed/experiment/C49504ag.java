package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.ag */
public final class C49504ag {

    /* renamed from: a */
    public static final C49504ag f113866a = new C49504ag();

    /* renamed from: b */
    private static final AbstractC89244h f113867b = C89250i.m154773a((AbstractC89171a) C49505a.f113868a);

    /* renamed from: c */
    private static int m92742c() {
        return ((Number) f113867b.getValue()).intValue();
    }

    private C49504ag() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.experiment.ag$a */
    static final class C49505a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C49505a f113868a = new C49505a();

        static {
            Covode.recordClassIndex(58319);
        }

        C49505a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "ux_opt_card_exp", 1));
        }
    }

    static {
        Covode.recordClassIndex(58318);
    }

    /* renamed from: a */
    public static final boolean m92740a() {
        if (m92742c() == 2 || m92742c() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m92741b() {
        if (m92742c() == 3 || m92742c() == 4) {
            return true;
        }
        return false;
    }
}
