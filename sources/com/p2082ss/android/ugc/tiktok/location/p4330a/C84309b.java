package com.p2082ss.android.ugc.tiktok.location.p4330a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.location.a.b */
public final class C84309b {

    /* renamed from: a */
    public static boolean f188530a;

    /* renamed from: b */
    public static final C84309b f188531b = new C84309b();

    /* renamed from: c */
    private static final AbstractC89244h f188532c = C89250i.m154773a((AbstractC89171a) C84310a.f188533a);

    /* renamed from: b */
    private static int m145008b() {
        return ((Number) f188532c.getValue()).intValue();
    }

    private C84309b() {
    }

    /* renamed from: com.ss.android.ugc.tiktok.location.a.b$a */
    static final class C84310a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C84310a f188533a = new C84310a();

        static {
            Covode.recordClassIndex(98240);
        }

        C84310a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(false, "request_location_permission", 0));
        }
    }

    static {
        Covode.recordClassIndex(98239);
    }

    /* renamed from: a */
    public static int m145007a() {
        if (f188530a) {
            StringBuilder append = new StringBuilder("request_location_permission value = ").append(m145008b()).append(" user_id = ");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            C51423a.m95787a(append.append(g.getCurUserId()).toString());
            return m145008b();
        }
        int i = 0;
        try {
            i = C16048b.m29633a().mo25412a(false, "request_location_permission", 0);
        } catch (Throwable th) {
            C51423a.m95787a("request_location_permission error, throwable = " + th.getMessage());
        }
        StringBuilder append2 = new StringBuilder("request_location_permission value = ").append(i).append(" user_id = ");
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        C51423a.m95787a(append2.append(g2.getCurUserId()).toString());
        return i;
    }
}
