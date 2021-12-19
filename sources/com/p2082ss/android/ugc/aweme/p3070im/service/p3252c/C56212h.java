package com.p2082ss.android.ugc.aweme.p3070im.service.p3252c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.im.service.c.h */
public final class C56212h {

    /* renamed from: a */
    public static final C56212h f128213a = new C56212h();

    /* renamed from: b */
    private static final AbstractC89244h f128214b = C89250i.m154773a((AbstractC89171a) C56213a.f128215a);

    private C56212h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.c.h$a */
    static final class C56213a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C56213a f128215a = new C56213a();

        static {
            Covode.recordClassIndex(66022);
        }

        C56213a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "dm_push_message_preview", 0));
        }
    }

    static {
        Covode.recordClassIndex(66021);
    }

    /* renamed from: a */
    public static boolean m102127a() {
        if (((Number) f128214b.getValue()).intValue() > 0) {
            return true;
        }
        return false;
    }
}
