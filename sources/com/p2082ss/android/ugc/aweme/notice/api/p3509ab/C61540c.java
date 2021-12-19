package com.p2082ss.android.ugc.aweme.notice.api.p3509ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ab.c */
public final class C61540c {

    /* renamed from: a */
    public static final int f139685a = 1;

    /* renamed from: b */
    public static final int f139686b = 3;

    /* renamed from: c */
    public static final int f139687c = 4;

    /* renamed from: d */
    public static final C61540c f139688d = new C61540c();

    /* renamed from: e */
    private static final int f139689e = 2;

    /* renamed from: f */
    private static final AbstractC89244h f139690f = C89250i.m154773a((AbstractC89171a) C61541a.f139691a);

    /* renamed from: a */
    public static int m111452a() {
        return ((Number) f139690f.getValue()).intValue();
    }

    private C61540c() {
    }

    /* renamed from: c */
    public static final boolean m111454c() {
        if (m111452a() == f139687c) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ab.c$a */
    static final class C61541a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C61541a f139691a = new C61541a();

        static {
            Covode.recordClassIndex(72210);
        }

        C61541a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "social_reverse_ws_ability", 0));
        }
    }

    /* renamed from: b */
    public static final boolean m111453b() {
        if (m111452a() == f139689e || m111452a() == f139686b || m111452a() == f139687c) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(72209);
    }
}
