package com.p2082ss.android.ugc.aweme.notice.api.p3509ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ab.a */
public final class C61536a {

    /* renamed from: a */
    public static final C61536a f139678a = new C61536a();

    /* renamed from: b */
    private static final int f139679b = 1;

    /* renamed from: c */
    private static final AbstractC89244h f139680c = C89250i.m154773a((AbstractC89171a) C61537a.f139681a);

    /* renamed from: a */
    public static int m111448a() {
        return ((Number) f139680c.getValue()).intValue();
    }

    private C61536a() {
    }

    /* renamed from: b */
    public static boolean m111449b() {
        if (m111448a() == f139679b) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ab.a$a */
    static final class C61537a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C61537a f139681a = new C61537a();

        static {
            Covode.recordClassIndex(72206);
        }

        C61537a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "refactor_notification_code", 0));
        }
    }

    static {
        Covode.recordClassIndex(72205);
    }
}
