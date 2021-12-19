package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.gd */
public final class C46967gd {

    /* renamed from: a */
    static final AbstractC89244h f109457a = C89250i.m154773a((AbstractC89171a) C46968a.f109460a);

    /* renamed from: b */
    public static final C46967gd f109458b = new C46967gd();

    /* renamed from: c */
    private static final AbstractC89244h f109459c = C89250i.m154773a((AbstractC89171a) C46969b.f109461a);

    /* renamed from: a */
    public static final boolean m90247a() {
        return ((Boolean) f109459c.getValue()).booleanValue();
    }

    private C46967gd() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.gd$a */
    static final class C46968a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46968a f109460a = new C46968a();

        static {
            Covode.recordClassIndex(55569);
        }

        C46968a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("settings_manager_notify_settings_experiment", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.gd$b */
    static final class C46969b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46969b f109461a = new C46969b();

        static {
            Covode.recordClassIndex(55570);
        }

        C46969b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (((Number) C46967gd.f109457a.getValue()).intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(55568);
    }
}
