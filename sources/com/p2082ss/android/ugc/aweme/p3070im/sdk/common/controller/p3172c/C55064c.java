package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.c.c */
public final class C55064c {

    /* renamed from: a */
    public static final int f126018a = 1;

    /* renamed from: b */
    public static final C55064c f126019b = new C55064c();

    /* renamed from: c */
    private static final AbstractC89244h f126020c = C89250i.m154773a((AbstractC89171a) C55065a.f126021a);

    /* renamed from: b */
    private static int m100704b() {
        return ((Number) f126020c.getValue()).intValue();
    }

    private C55064c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.c.c$a */
    static final class C55065a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C55065a f126021a = new C55065a();

        static {
            Covode.recordClassIndex(64793);
        }

        C55065a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.m29616a().mo25394a("im_enable_group_invite_entry", 1));
        }
    }

    /* renamed from: a */
    public static boolean m100703a() {
        if (m100704b() == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(64792);
    }
}
