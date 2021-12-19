package com.p2082ss.android.ugc.aweme.player.p3549ab.abs;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.player.ab.abs.b */
public final class C62912b {

    /* renamed from: a */
    public static final int f142808a = 1;

    /* renamed from: b */
    public static final C62912b f142809b = new C62912b();

    /* renamed from: c */
    private static final AbstractC89244h f142810c = C89250i.m154773a((AbstractC89171a) C62913a.f142811a);

    /* renamed from: a */
    public static int m113339a() {
        return ((Number) f142810c.getValue()).intValue();
    }

    private C62912b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.player.ab.abs.b$a */
    static final class C62913a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C62913a f142811a = new C62913a();

        static {
            Covode.recordClassIndex(73749);
        }

        C62913a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "player_ab_block_type", 0));
        }
    }

    static {
        Covode.recordClassIndex(73748);
    }
}
