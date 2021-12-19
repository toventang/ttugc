package com.p2082ss.android.ugc.aweme.discover.p2771f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.f.g */
public final class C41951g {

    /* renamed from: a */
    public static final C41951g f97842a = new C41951g();

    /* renamed from: b */
    private static final AbstractC89244h f97843b = C89250i.m154773a((AbstractC89171a) C41952a.f97844a);

    /* renamed from: a */
    public static boolean m83990a() {
        return ((Boolean) f97843b.getValue()).booleanValue();
    }

    private C41951g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.f.g$a */
    static final class C41952a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C41952a f97844a = new C41952a();

        static {
            Covode.recordClassIndex(49879);
        }

        C41952a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.m29616a().mo25400a("dynamic_cover_decode_config", false));
        }
    }

    static {
        Covode.recordClassIndex(49878);
    }
}
