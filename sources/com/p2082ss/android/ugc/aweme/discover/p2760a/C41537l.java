package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.l */
public final class C41537l {

    /* renamed from: a */
    public static final C41537l f96883a = new C41537l();

    /* renamed from: b */
    private static final AbstractC89244h f96884b = C89250i.m154773a((AbstractC89171a) C41538a.f96885a);

    private C41537l() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.l$a */
    static final class C41538a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41538a f96885a = new C41538a();

        static {
            Covode.recordClassIndex(49445);
        }

        C41538a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83474a() {
            try {
                return C16048b.m29633a().mo25412a(true, "should_show_follow_button", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83474a());
        }
    }

    static {
        Covode.recordClassIndex(49444);
    }

    /* renamed from: a */
    public static boolean m83473a() {
        if (((Number) f96884b.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }
}
