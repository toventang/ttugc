package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.u */
public final class C41549u {

    /* renamed from: a */
    public static final C41549u f96903a = new C41549u();

    /* renamed from: b */
    private static final AbstractC89244h f96904b = C89250i.m154773a((AbstractC89171a) C41550a.f96905a);

    private C41549u() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.u$a */
    static final class C41550a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41550a f96905a = new C41550a();

        static {
            Covode.recordClassIndex(49457);
        }

        C41550a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83485a() {
            try {
                return C16048b.m29633a().mo25412a(true, "enable_search_multi_layer_in_fyp", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83485a());
        }
    }

    static {
        Covode.recordClassIndex(49456);
    }

    /* renamed from: a */
    public static boolean m83484a() {
        if (((Number) f96904b.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }
}
