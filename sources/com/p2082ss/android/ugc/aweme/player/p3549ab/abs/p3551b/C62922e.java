package com.p2082ss.android.ugc.aweme.player.p3549ab.abs.p3551b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.player.ab.abs.b.e */
public final class C62922e {

    /* renamed from: a */
    public static final C62922e f142824a = new C62922e();

    /* renamed from: b */
    private static final AbstractC89244h f142825b = C89250i.m154773a((AbstractC89171a) C62923a.f142826a);

    /* renamed from: a */
    public static boolean m113344a() {
        return ((Boolean) f142825b.getValue()).booleanValue();
    }

    private C62922e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.player.ab.abs.b.e$a */
    static final class C62923a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C62923a f142826a = new C62923a();

        static {
            Covode.recordClassIndex(73759);
        }

        C62923a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "player_scroll_prerender_range_enable", true));
        }
    }

    static {
        Covode.recordClassIndex(73758);
    }
}
