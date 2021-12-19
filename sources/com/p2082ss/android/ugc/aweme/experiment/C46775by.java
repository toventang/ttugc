package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.lego.p3392b.C58177c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.by */
public final class C46775by {

    /* renamed from: a */
    static final AbstractC89244h f108988a = C89250i.m154773a((AbstractC89171a) C46777b.f108992a);

    /* renamed from: b */
    public static final C46775by f108989b = new C46775by();

    /* renamed from: c */
    private static final AbstractC89244h f108990c = C89250i.m154773a((AbstractC89171a) C46776a.f108991a);

    /* renamed from: a */
    public static boolean m90126a() {
        return ((Boolean) f108990c.getValue()).booleanValue();
    }

    private C46775by() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.by$a */
    static final class C46776a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46776a f108991a = new C46776a();

        static {
            Covode.recordClassIndex(55377);
        }

        C46776a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!C58177c.m105092a() || (((Number) C46775by.f108988a.getValue()).intValue() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.by$b */
    static final class C46777b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46777b f108992a = new C46777b();

        static {
            Covode.recordClassIndex(55378);
        }

        C46777b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("delay_ttlivesdk", 1));
        }
    }

    static {
        Covode.recordClassIndex(55376);
    }
}
