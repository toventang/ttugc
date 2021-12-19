package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.a.g */
public final class C55054g {

    /* renamed from: a */
    public static final C55054g f125997a = new C55054g();

    /* renamed from: b */
    private static final AbstractC89244h f125998b = C89250i.m154773a((AbstractC89171a) C55055a.f125999a);

    /* renamed from: a */
    public static int m100677a() {
        return ((Number) f125998b.getValue()).intValue();
    }

    private C55054g() {
    }

    /* renamed from: c */
    public static boolean m100679c() {
        if (m100677a() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.a.g$a */
    static final class C55055a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C55055a f125999a = new C55055a();

        static {
            Covode.recordClassIndex(64783);
        }

        C55055a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "im_unread_view_style", 0));
        }
    }

    static {
        Covode.recordClassIndex(64782);
    }

    /* renamed from: b */
    public static boolean m100678b() {
        if (m100677a() == 1 || m100677a() == 2 || m100677a() == 3) {
            return true;
        }
        return false;
    }
}
