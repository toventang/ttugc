package com.p2082ss.android.ugc.aweme.social.p3914a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.social.a.e */
public final class C74710e {

    /* renamed from: a */
    public static final int f167927a = 0;

    /* renamed from: b */
    public static final int f167928b = 1;

    /* renamed from: c */
    public static final int f167929c = 2;

    /* renamed from: d */
    public static final int f167930d = 3;

    /* renamed from: e */
    public static final int f167931e = 4;

    /* renamed from: f */
    public static final boolean f167932f;

    /* renamed from: g */
    public static final C74710e f167933g = new C74710e();

    /* renamed from: h */
    private static final AbstractC89244h f167934h = C89250i.m154773a((AbstractC89171a) C74711a.f167935a);

    /* renamed from: a */
    public static int m131167a() {
        return ((Number) f167934h.getValue()).intValue();
    }

    private C74710e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.social.a.e$a */
    static final class C74711a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C74711a f167935a = new C74711a();

        static {
            Covode.recordClassIndex(87546);
        }

        C74711a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "follow_back_on_share_panel_type", 0));
        }
    }

    static {
        Covode.recordClassIndex(87545);
        boolean z = true;
        if (m131167a() <= f167927a) {
            z = false;
        }
        f167932f = z;
    }
}
