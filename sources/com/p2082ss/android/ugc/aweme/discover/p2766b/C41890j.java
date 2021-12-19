package com.p2082ss.android.ugc.aweme.discover.p2766b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.b.j */
public final class C41890j {

    /* renamed from: a */
    public static final C41890j f97733a = new C41890j();

    /* renamed from: b */
    private static final AbstractC89244h f97734b = C89250i.m154773a((AbstractC89171a) C41891a.f97735a);

    /* renamed from: a */
    public static final int m83913a() {
        return ((Number) f97734b.getValue()).intValue();
    }

    private C41890j() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.j$a */
    static final class C41891a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41891a f97735a = new C41891a();

        static {
            Covode.recordClassIndex(49817);
        }

        C41891a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83917a() {
            try {
                return C16048b.m29633a().mo25412a(true, "search_video_player_optimization", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83917a());
        }
    }

    /* renamed from: c */
    public static boolean m83915c() {
        if (m83913a() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m83916d() {
        if (m83913a() == 2) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(49816);
    }

    /* renamed from: b */
    public static boolean m83914b() {
        if (m83913a() == 0 || m83913a() == 3) {
            return true;
        }
        return false;
    }
}
