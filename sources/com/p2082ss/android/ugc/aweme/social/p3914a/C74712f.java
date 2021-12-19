package com.p2082ss.android.ugc.aweme.social.p3914a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.social.a.f */
public final class C74712f {

    /* renamed from: a */
    public static final boolean f167936a;

    /* renamed from: b */
    public static final C74712f f167937b = new C74712f();

    /* renamed from: c */
    private static final AbstractC89244h f167938c = C89250i.m154773a((AbstractC89171a) C74713a.f167939a);

    /* renamed from: a */
    public static int m131168a() {
        return ((Number) f167938c.getValue()).intValue();
    }

    private C74712f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.social.a.f$a */
    static final class C74713a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C74713a f167939a = new C74713a();

        static {
            Covode.recordClassIndex(87548);
        }

        C74713a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "follow_back_on_vertical_share_panel_type", 0));
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(87547);
        if (m131168a() > 0) {
            z = true;
        } else {
            z = false;
        }
        f167936a = z;
    }
}
