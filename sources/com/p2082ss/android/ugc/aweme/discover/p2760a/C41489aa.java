package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.aa */
public final class C41489aa {

    /* renamed from: a */
    public static final C41489aa f96797a = new C41489aa();

    /* renamed from: b */
    private static final AbstractC89244h f96798b = C89250i.m154773a((AbstractC89171a) C41490a.f96799a);

    /* renamed from: a */
    public static int m83439a() {
        return ((Number) f96798b.getValue()).intValue();
    }

    private C41489aa() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.aa$a */
    static final class C41490a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41490a f96799a = new C41490a();

        static {
            Covode.recordClassIndex(49397);
        }

        C41490a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83440a() {
            try {
                return C16048b.m29633a().mo25412a(true, "enable_playlist_icon_in_search_video", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83440a());
        }
    }

    static {
        Covode.recordClassIndex(49396);
    }
}
