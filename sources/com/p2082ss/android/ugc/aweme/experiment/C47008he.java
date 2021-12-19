package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.he */
public final class C47008he {

    /* renamed from: a */
    public static final C47008he f109534a = new C47008he();

    /* renamed from: b */
    private static final AbstractC89244h f109535b = C89250i.m154773a((AbstractC89171a) C47009a.f109536a);

    /* renamed from: a */
    public static int m90282a() {
        return ((Number) f109535b.getValue()).intValue();
    }

    private C47008he() {
    }

    /* renamed from: b */
    public static boolean m90283b() {
        if (m90282a() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.he$a */
    static final class C47009a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C47009a f109536a = new C47009a();

        static {
            Covode.recordClassIndex(55610);
        }

        C47009a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "feed_user_suggestion_style", 0));
        }
    }

    static {
        Covode.recordClassIndex(55609);
    }
}
