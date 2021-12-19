package com.p2082ss.android.ugc.aweme.player.p3549ab.abs.p3551b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.player.ab.abs.b.d */
public final class C62920d {

    /* renamed from: a */
    public static final C62920d f142821a = new C62920d();

    /* renamed from: b */
    private static final AbstractC89244h f142822b = C89250i.m154773a((AbstractC89171a) C62921a.f142823a);

    /* renamed from: a */
    public static int m113343a() {
        return ((Number) f142822b.getValue()).intValue();
    }

    private C62920d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.player.ab.abs.b.d$a */
    static final class C62921a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C62921a f142823a = new C62921a();

        static {
            Covode.recordClassIndex(73757);
        }

        C62921a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "player_prerender_need_check_video_duration", 0));
        }
    }

    static {
        Covode.recordClassIndex(73756);
    }
}
