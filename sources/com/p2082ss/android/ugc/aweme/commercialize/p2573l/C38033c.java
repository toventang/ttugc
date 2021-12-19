package com.p2082ss.android.ugc.aweme.commercialize.p2573l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.l.c */
public final class C38033c {

    /* renamed from: a */
    public static final C38033c f89867a = new C38033c();

    /* renamed from: b */
    private static final AbstractC89244h f89868b = C89250i.m154773a((AbstractC89171a) C38034a.f89869a);

    private C38033c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.l.c$a */
    static final class C38034a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C38034a f89869a = new C38034a();

        static {
            Covode.recordClassIndex(45496);
        }

        C38034a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_rich_ad_tracker", false));
        }
    }

    /* renamed from: a */
    public static boolean m77103a() {
        return SettingsManager.m29616a().mo25400a("enable_rich_ad_tracker", false);
    }

    static {
        Covode.recordClassIndex(45495);
    }
}
