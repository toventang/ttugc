package com.p2082ss.android.ugc.aweme.discover.p2766b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.b.h */
public final class C41886h {

    /* renamed from: a */
    public static final C41886h f97727a = new C41886h();

    /* renamed from: b */
    private static final AbstractC89244h f97728b = C89250i.m154773a((AbstractC89171a) C41887a.f97729a);

    /* renamed from: a */
    public static final int m83907a() {
        return ((Number) f97728b.getValue()).intValue();
    }

    private C41886h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.h$a */
    static final class C41887a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41887a f97729a = new C41887a();

        static {
            Covode.recordClassIndex(49813);
        }

        C41887a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83911a() {
            try {
                return C16048b.m29633a().mo25412a(true, "enable_line_trigger_auto_play_in_search", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83911a());
        }
    }

    /* renamed from: b */
    public static final boolean m83908b() {
        if (m83907a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m83910d() {
        if (!m83908b() || m83909c()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(49812);
    }

    /* renamed from: c */
    public static final boolean m83909c() {
        if (m83907a() == 4 || m83907a() == 5) {
            return true;
        }
        return false;
    }
}
