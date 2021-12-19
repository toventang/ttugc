package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.fc */
public final class C46924fc {

    /* renamed from: a */
    public static boolean f109352a = true;

    /* renamed from: b */
    static final AbstractC89244h f109353b = C89250i.m154773a((AbstractC89171a) C46925a.f109356a);

    /* renamed from: c */
    public static final C46924fc f109354c = new C46924fc();

    /* renamed from: d */
    private static final AbstractC89244h f109355d = C89250i.m154773a((AbstractC89171a) C46926b.f109357a);

    /* renamed from: a */
    public static final boolean m90226a() {
        return ((Boolean) f109355d.getValue()).booleanValue();
    }

    private C46924fc() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.fc$a */
    static final class C46925a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46925a f109356a = new C46925a();

        static {
            Covode.recordClassIndex(55526);
        }

        C46925a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("player_resume_experiment", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.fc$b */
    static final class C46926b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46926b f109357a = new C46926b();

        static {
            Covode.recordClassIndex(55527);
        }

        C46926b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!C46924fc.f109352a || ((Number) C46924fc.f109353b.getValue()).intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(55525);
    }
}
