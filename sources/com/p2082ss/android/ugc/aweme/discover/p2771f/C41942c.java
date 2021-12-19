package com.p2082ss.android.ugc.aweme.discover.p2771f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.f.c */
public final class C41942c {

    /* renamed from: a */
    public static final int f97823a = 3;

    /* renamed from: b */
    public static final C41942c f97824b = new C41942c();

    /* renamed from: c */
    private static final AbstractC89244h f97825c = C89250i.m154773a((AbstractC89171a) C41943a.f97826a);

    /* renamed from: a */
    public static boolean m83981a() {
        return ((Boolean) f97825c.getValue()).booleanValue();
    }

    private C41942c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.f.c$a */
    static final class C41943a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C41943a f97826a = new C41943a();

        static {
            Covode.recordClassIndex(49870);
        }

        C41943a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m83982a());
        }

        /* renamed from: a */
        private static boolean m83982a() {
            int i;
            try {
                i = SettingsManager.m29616a().mo25394a("discover_fps_phone_performance_2", 3);
            } catch (Exception e) {
                e.printStackTrace();
                i = C41942c.f97823a;
            }
            if (i == 3) {
                return true;
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(49869);
    }
}
