package com.p2082ss.android.ugc.aweme.search.p3684b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.search.b.a */
public final class C67348a {

    /* renamed from: a */
    public static final C67348a f150916a = new C67348a();

    /* renamed from: b */
    private static final AbstractC89244h f150917b = C89250i.m154773a((AbstractC89171a) C67349a.f150918a);

    /* renamed from: b */
    public static int m119401b() {
        return ((Number) f150917b.getValue()).intValue();
    }

    private C67348a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.b.a$a */
    static final class C67349a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C67349a f150918a = new C67349a();

        static {
            Covode.recordClassIndex(78979);
        }

        C67349a() {
            super(0);
        }

        /* renamed from: a */
        private static int m119402a() {
            try {
                return C16048b.m29633a().mo25412a(true, "disable_relationship", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m119402a());
        }
    }

    /* renamed from: a */
    public static boolean m119400a() {
        if (m119401b() != 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(78978);
    }
}
