package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.n */
public final class C41541n {

    /* renamed from: a */
    public static final C41541n f96889a = new C41541n();

    /* renamed from: b */
    private static final AbstractC89244h f96890b = C89250i.m154773a((AbstractC89171a) C41542a.f96891a);

    /* renamed from: b */
    private static int m83479b() {
        return ((Number) f96890b.getValue()).intValue();
    }

    private C41541n() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.n$a */
    static final class C41542a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41542a f96891a = new C41542a();

        static {
            Covode.recordClassIndex(49449);
        }

        C41542a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83480a() {
            try {
                return C16048b.m29633a().mo25412a(true, "search_live_paging", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83480a());
        }
    }

    /* renamed from: a */
    public static boolean m83478a() {
        if (m83479b() == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(49448);
    }
}
