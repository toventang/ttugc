package com.p2082ss.android.ugc.aweme.p2226a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.a.a */
public final class C31292a {

    /* renamed from: a */
    public static final C31292a f75000a = new C31292a();

    /* renamed from: b */
    private static final AbstractC89244h f75001b = C89250i.m154773a((AbstractC89171a) C31293a.f75002a);

    private C31292a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.a.a$a */
    static final class C31293a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C31293a f75002a = new C31293a();

        static {
            Covode.recordClassIndex(37992);
        }

        C31293a() {
            super(0);
        }

        /* renamed from: a */
        private static int m65466a() {
            try {
                return C16048b.m29633a().mo25412a(true, "add_live_vertical_tab_result_page", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m65466a());
        }
    }

    static {
        Covode.recordClassIndex(37991);
    }

    /* renamed from: a */
    public static boolean m65465a() {
        if (((Number) f75001b.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }
}
