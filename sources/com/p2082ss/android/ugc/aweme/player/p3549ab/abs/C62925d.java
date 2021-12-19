package com.p2082ss.android.ugc.aweme.player.p3549ab.abs;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.player.ab.abs.d */
public final class C62925d {

    /* renamed from: a */
    public static final C62925d f142828a = new C62925d();

    /* renamed from: b */
    private static final AbstractC89244h f142829b = C89250i.m154773a((AbstractC89171a) C62926a.f142830a);

    /* renamed from: a */
    public static int m113345a() {
        return ((Number) f142829b.getValue()).intValue();
    }

    private C62925d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.player.ab.abs.d$a */
    static final class C62926a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C62926a f142830a = new C62926a();

        static {
            Covode.recordClassIndex(73763);
        }

        C62926a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "video_rsp_log_frequency", 10));
        }
    }

    static {
        Covode.recordClassIndex(73762);
    }
}
