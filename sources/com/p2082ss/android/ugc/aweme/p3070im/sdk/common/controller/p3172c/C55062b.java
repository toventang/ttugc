package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.c.b */
public final class C55062b {

    /* renamed from: a */
    public static final int f126014a = 16;

    /* renamed from: b */
    public static final C55062b f126015b = new C55062b();

    /* renamed from: c */
    private static final AbstractC89244h f126016c = C89250i.m154773a((AbstractC89171a) C55063a.f126017a);

    /* renamed from: a */
    public static int m100702a() {
        return ((Number) f126016c.getValue()).intValue();
    }

    private C55062b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.c.b$a */
    static final class C55063a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C55063a f126017a = new C55063a();

        static {
            Covode.recordClassIndex(64791);
        }

        C55063a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.m29616a().mo25394a("im_group_max_members", 16));
        }
    }

    static {
        Covode.recordClassIndex(64790);
    }
}
