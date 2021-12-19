package com.p2082ss.android.ugc.aweme.crossplatform.abtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.abtest.a */
public final class C40524a {

    /* renamed from: a */
    public static final boolean f94796a = true;

    /* renamed from: b */
    public static final C40524a f94797b = new C40524a();

    /* renamed from: c */
    private static final AbstractC89244h f94798c = C89250i.m154773a((AbstractC89171a) C40525a.f94799a);

    /* renamed from: a */
    public static boolean m81745a() {
        return ((Boolean) f94798c.getValue()).booleanValue();
    }

    private C40524a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.abtest.a$a */
    static final class C40525a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C40525a f94799a = new C40525a();

        static {
            Covode.recordClassIndex(48342);
        }

        C40525a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.m29616a().mo25400a("enable_use_onreceivederror_for_safety", true));
        }
    }

    static {
        Covode.recordClassIndex(48341);
    }
}
