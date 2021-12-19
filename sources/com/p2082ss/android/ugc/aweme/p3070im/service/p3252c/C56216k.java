package com.p2082ss.android.ugc.aweme.p3070im.service.p3252c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.im.service.c.k */
public final class C56216k {

    /* renamed from: a */
    public static final C56216k f128221a = new C56216k();

    /* renamed from: b */
    private static final AbstractC89244h f128222b = C89250i.m154773a((AbstractC89171a) C56217a.f128223a);

    /* renamed from: e */
    private static int m102135e() {
        return ((Number) f128222b.getValue()).intValue();
    }

    private C56216k() {
    }

    /* renamed from: b */
    public static boolean m102132b() {
        int e = m102135e();
        if (4 <= e && 5 >= e) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m102133c() {
        if (m102135e() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m102134d() {
        int e = m102135e();
        if (1 <= e && 5 >= e) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.c.k$a */
    static final class C56217a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C56217a f128223a = new C56217a();

        static {
            Covode.recordClassIndex(66026);
        }

        C56217a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "separate_share_more_strategy", 0));
        }
    }

    static {
        Covode.recordClassIndex(66025);
    }

    /* renamed from: a */
    public static boolean m102131a() {
        if (m102135e() == 1 || m102135e() == 4) {
            return true;
        }
        return false;
    }
}
