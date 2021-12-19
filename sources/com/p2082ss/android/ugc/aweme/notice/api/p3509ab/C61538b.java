package com.p2082ss.android.ugc.aweme.notice.api.p3509ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ab.b */
public final class C61538b {

    /* renamed from: a */
    public static final C61538b f139682a = new C61538b();

    /* renamed from: b */
    private static final AbstractC89244h f139683b = C89250i.m154773a((AbstractC89171a) C61539a.f139684a);

    /* renamed from: a */
    public static int m111450a() {
        return ((Number) f139683b.getValue()).intValue();
    }

    private C61538b() {
    }

    /* renamed from: b */
    public static boolean m111451b() {
        if (m111450a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ab.b$a */
    static final class C61539a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C61539a f139684a = new C61539a();

        static {
            Covode.recordClassIndex(72208);
        }

        C61539a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "notice_red_point_show_opt", 0));
        }
    }

    static {
        Covode.recordClassIndex(72207);
    }
}
