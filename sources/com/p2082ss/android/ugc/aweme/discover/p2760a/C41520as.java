package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.as */
public final class C41520as {

    /* renamed from: a */
    public static final C41520as f96853a = new C41520as();

    /* renamed from: b */
    private static final AbstractC89244h f96854b = C89250i.m154773a((AbstractC89171a) C41521a.f96855a);

    /* renamed from: a */
    public static int m83460a() {
        return ((Number) f96854b.getValue()).intValue();
    }

    private C41520as() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.as$a */
    static final class C41521a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41521a f96855a = new C41521a();

        static {
            Covode.recordClassIndex(49428);
        }

        C41521a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83462a() {
            try {
                return C16048b.m29633a().mo25412a(true, "video_layout_optimization", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83462a());
        }
    }

    static {
        Covode.recordClassIndex(49427);
    }

    /* renamed from: b */
    public static boolean m83461b() {
        if (m83460a() == 0 || m83460a() == 1 || m83460a() == 2) {
            return true;
        }
        return false;
    }
}
