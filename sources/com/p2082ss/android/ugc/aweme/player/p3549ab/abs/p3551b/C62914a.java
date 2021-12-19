package com.p2082ss.android.ugc.aweme.player.p3549ab.abs.p3551b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.player.ab.abs.b.a */
public final class C62914a {

    /* renamed from: a */
    public static final C62914a f142812a = new C62914a();

    /* renamed from: b */
    private static final AbstractC89244h f142813b = C89250i.m154773a((AbstractC89171a) C62915a.f142814a);

    /* renamed from: a */
    public static int m113340a() {
        return ((Number) f142813b.getValue()).intValue();
    }

    private C62914a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.player.ab.abs.b.a$a */
    static final class C62915a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C62915a f142814a = new C62915a();

        static {
            Covode.recordClassIndex(73751);
        }

        C62915a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "player_prerender_check_cache_size", 204800));
        }
    }

    static {
        Covode.recordClassIndex(73750);
    }
}
