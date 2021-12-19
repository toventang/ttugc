package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.bb */
public final class C46726bb {

    /* renamed from: a */
    public static final C46726bb f108909a = new C46726bb();

    /* renamed from: b */
    private static final AbstractC89244h f108910b = C89250i.m154773a((AbstractC89171a) C46727a.f108911a);

    /* renamed from: a */
    public static int m90106a() {
        return ((Number) f108910b.getValue()).intValue();
    }

    private C46726bb() {
    }

    /* renamed from: b */
    public static boolean m90107b() {
        if (m90106a() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m90108c() {
        if (m90106a() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.bb$a */
    static final class C46727a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46727a f108911a = new C46727a();

        static {
            Covode.recordClassIndex(55328);
        }

        C46727a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepoSync("ab_repo_cold_boot", 1).getInt("cold_boot_optim_v1", 0));
        }
    }

    static {
        Covode.recordClassIndex(55327);
    }
}
