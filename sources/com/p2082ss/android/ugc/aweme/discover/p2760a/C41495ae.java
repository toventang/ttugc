package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.ae */
public final class C41495ae {

    /* renamed from: a */
    public static final C41495ae f96807a = new C41495ae();

    /* renamed from: b */
    private static final AbstractC89244h f96808b = C89250i.m154773a((AbstractC89171a) C41496a.f96809a);

    /* renamed from: a */
    public static int m83443a() {
        return ((Number) f96808b.getValue()).intValue();
    }

    private C41495ae() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.ae$a */
    static final class C41496a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41496a f96809a = new C41496a();

        static {
            Covode.recordClassIndex(49403);
        }

        C41496a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83444a() {
            try {
                return C16048b.m29633a().mo25412a(true, "enable_playlist_in_search_user_card", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83444a());
        }
    }

    static {
        Covode.recordClassIndex(49402);
    }
}
