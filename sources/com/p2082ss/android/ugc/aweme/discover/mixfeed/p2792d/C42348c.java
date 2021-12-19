package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.c */
public final class C42348c {

    /* renamed from: a */
    public static final C42348c f98660a = new C42348c();

    /* renamed from: b */
    private static final AbstractC89244h f98661b = C89250i.m154773a((AbstractC89171a) C42349a.f98662a);

    /* renamed from: a */
    public static int m84712a() {
        return ((Number) f98661b.getValue()).intValue();
    }

    private C42348c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.c$a */
    static final class C42349a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C42349a f98662a = new C42349a();

        static {
            Covode.recordClassIndex(50294);
        }

        C42349a() {
            super(0);
        }

        /* renamed from: a */
        private static int m84713a() {
            try {
                return C16048b.m29633a().mo25412a(true, "enable_show_related_searches", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m84713a());
        }
    }

    static {
        Covode.recordClassIndex(50293);
    }
}
