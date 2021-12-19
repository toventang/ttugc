package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.m */
public final class C41539m {

    /* renamed from: a */
    public static final C41539m f96886a = new C41539m();

    /* renamed from: b */
    private static final AbstractC89244h f96887b = C89250i.m154773a((AbstractC89171a) C41540a.f96888a);

    /* renamed from: b */
    public static int m83476b() {
        return ((Number) f96887b.getValue()).intValue();
    }

    private C41539m() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.m$a */
    static final class C41540a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41540a f96888a = new C41540a();

        static {
            Covode.recordClassIndex(49447);
        }

        C41540a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83477a() {
            try {
                return C16048b.m29633a().mo25412a(true, "discover_placeholder_style", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83477a());
        }
    }

    /* renamed from: a */
    public static boolean m83475a() {
        if (m83476b() != 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(49446);
    }
}
