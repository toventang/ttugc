package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.af */
public final class C41497af {

    /* renamed from: a */
    public static final AbstractC89244h f96810a = C89250i.m154773a((AbstractC89171a) C41498a.f96812a);

    /* renamed from: b */
    public static final C41497af f96811b = new C41497af();

    private C41497af() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.af$a */
    static final class C41498a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41498a f96812a = new C41498a();

        static {
            Covode.recordClassIndex(49405);
        }

        C41498a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83445a() {
            try {
                return C16048b.m29633a().mo25412a(true, "search_video_click_like", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83445a());
        }
    }

    static {
        Covode.recordClassIndex(49404);
    }
}
