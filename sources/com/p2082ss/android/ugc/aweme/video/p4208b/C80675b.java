package com.p2082ss.android.ugc.aweme.video.p4208b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.video.b.b */
public final class C80675b {

    /* renamed from: a */
    public static final C80675b f180371a = new C80675b();

    /* renamed from: b */
    private static final AbstractC89244h f180372b = C89250i.m154773a((AbstractC89171a) C80676a.f180373a);

    /* renamed from: a */
    public static final boolean m139904a() {
        return ((Boolean) f180372b.getValue()).booleanValue();
    }

    private C80675b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.video.b.b$a */
    static final class C80676a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C80676a f180373a = new C80676a();

        static {
            Covode.recordClassIndex(93957);
        }

        C80676a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "use_own_player_high_level", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(93956);
    }
}
