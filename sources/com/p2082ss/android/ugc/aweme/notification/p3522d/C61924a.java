package com.p2082ss.android.ugc.aweme.notification.p3522d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.notification.d.a */
public final class C61924a {

    /* renamed from: a */
    public static final int f140574a = 0;

    /* renamed from: b */
    public static final C61924a f140575b = new C61924a();

    /* renamed from: c */
    private static final AbstractC89244h f140576c = C89250i.m154773a((AbstractC89171a) C61925a.f140577a);

    /* renamed from: a */
    private static int m112052a() {
        return ((Number) f140576c.getValue()).intValue();
    }

    private C61924a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.d.a$a */
    static final class C61925a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C61925a f140577a = new C61925a();

        static {
            Covode.recordClassIndex(72674);
        }

        C61925a() {
            super(0);
        }

        /* renamed from: a */
        private static int m112054a() {
            try {
                return C16048b.m29633a().mo25412a(true, "notice_report_boot_rate", 0);
            } catch (Throwable unused) {
                return C61924a.f140574a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m112054a());
        }
    }

    static {
        Covode.recordClassIndex(72673);
    }

    /* renamed from: a */
    public static boolean m112053a(long j, long j2) {
        if (m112052a() > 0 && j2 - j > ((long) m112052a()) * 3600000) {
            return true;
        }
        return false;
    }
}
