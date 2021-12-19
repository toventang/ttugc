package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.c */
public final class C42341c {

    /* renamed from: a */
    public static final C42341c f98640a = new C42341c();

    /* renamed from: b */
    private static final AbstractC89244h f98641b = C89250i.m154773a((AbstractC89171a) C42342a.f98642a);

    /* renamed from: b */
    private static int m84707b() {
        return ((Number) f98641b.getValue()).intValue();
    }

    private C42341c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.c$a */
    static final class C42342a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C42342a f98642a = new C42342a();

        static {
            Covode.recordClassIndex(50287);
        }

        C42342a() {
            super(0);
        }

        /* renamed from: a */
        private static int m84708a() {
            try {
                return C16048b.m29633a().mo25412a(true, "enable_show_search_recommend", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m84708a());
        }
    }

    /* renamed from: a */
    public static boolean m84706a() {
        if (m84707b() == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(50286);
    }
}
