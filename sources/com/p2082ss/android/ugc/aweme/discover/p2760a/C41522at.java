package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.at */
public final class C41522at {

    /* renamed from: a */
    public static final C41522at f96856a = new C41522at();

    /* renamed from: b */
    private static final AbstractC89244h f96857b = C89250i.m154773a((AbstractC89171a) C41523a.f96858a);

    private C41522at() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.at$a */
    static final class C41523a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41523a f96858a = new C41523a();

        static {
            Covode.recordClassIndex(49430);
        }

        C41523a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83464a() {
            try {
                return C16048b.m29633a().mo25412a(true, "reverse_layout_optimization", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83464a());
        }
    }

    static {
        Covode.recordClassIndex(49429);
    }

    /* renamed from: a */
    public static boolean m83463a() {
        if (((Number) f96857b.getValue()).intValue() == 0) {
            return true;
        }
        return false;
    }
}
