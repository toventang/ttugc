package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.o */
public final class C49523o {

    /* renamed from: a */
    public static final C49523o f113901a = new C49523o();

    /* renamed from: b */
    private static final AbstractC89244h f113902b = C89250i.m154773a((AbstractC89171a) C49524a.f113903a);

    /* renamed from: a */
    public static int m92759a() {
        return ((Number) f113902b.getValue()).intValue();
    }

    private C49523o() {
    }

    /* renamed from: b */
    public static final boolean m92760b() {
        if (m92759a() == 4) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.experiment.o$a */
    static final class C49524a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C49524a f113903a = new C49524a();

        static {
            Covode.recordClassIndex(58338);
        }

        C49524a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "show_shorter_caption_by_default", 4));
        }
    }

    static {
        Covode.recordClassIndex(58337);
    }
}
