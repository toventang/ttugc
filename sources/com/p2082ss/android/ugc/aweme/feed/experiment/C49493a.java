package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.a */
public final class C49493a {

    /* renamed from: a */
    public static final boolean f113850a = false;

    /* renamed from: b */
    public static final C49493a f113851b = new C49493a();

    /* renamed from: c */
    private static final AbstractC89244h f113852c = C89250i.m154773a((AbstractC89171a) C49494a.f113853a);

    /* renamed from: a */
    public static boolean m92732a() {
        return ((Boolean) f113852c.getValue()).booleanValue();
    }

    private C49493a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.experiment.a$a */
    static final class C49494a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C49494a f113853a = new C49494a();

        static {
            Covode.recordClassIndex(58308);
        }

        C49494a() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m92733a() {
            try {
                return SettingsManager.m29616a().mo25400a("advance_omsdk_session_start_timing", false);
            } catch (Throwable unused) {
                return C49493a.f113850a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m92733a());
        }
    }

    static {
        Covode.recordClassIndex(58307);
    }
}
