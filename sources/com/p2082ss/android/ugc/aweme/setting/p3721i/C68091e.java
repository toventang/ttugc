package com.p2082ss.android.ugc.aweme.setting.p3721i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.setting.i.e */
public final class C68091e {

    /* renamed from: a */
    public static final C68091e f152489a = new C68091e();

    /* renamed from: b */
    private static final AbstractC89244h f152490b = C89250i.m154773a((AbstractC89171a) C68092a.f152491a);

    /* renamed from: a */
    public static final boolean m120393a() {
        return ((Boolean) f152490b.getValue()).booleanValue();
    }

    private C68091e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.i.e$a */
    static final class C68092a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C68092a f152491a = new C68092a();

        static {
            Covode.recordClassIndex(80288);
        }

        C68092a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "creative_tools_stop_video_player", false));
        }
    }

    static {
        Covode.recordClassIndex(80287);
    }
}
