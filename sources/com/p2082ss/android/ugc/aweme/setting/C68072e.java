package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.setting.e */
public final class C68072e {

    /* renamed from: a */
    public static final int f152459a = 0;

    /* renamed from: b */
    static final int f152460b = 1;

    /* renamed from: c */
    static final AbstractC89244h f152461c = C89250i.m154773a((AbstractC89171a) C68073a.f152464a);

    /* renamed from: d */
    public static final C68072e f152462d = new C68072e();

    /* renamed from: e */
    private static final AbstractC89244h f152463e = C89250i.m154773a((AbstractC89171a) C68074b.f152465a);

    /* renamed from: a */
    public static boolean m120373a() {
        return ((Boolean) f152463e.getValue()).booleanValue();
    }

    private C68072e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.e$a */
    static final class C68073a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C68073a f152464a = new C68073a();

        static {
            Covode.recordClassIndex(80269);
        }

        C68073a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("cold_boot_cpu_monitor", C68072e.f152459a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.e$b */
    static final class C68074b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C68074b f152465a = new C68074b();

        static {
            Covode.recordClassIndex(80270);
        }

        C68074b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((((Number) C68072e.f152461c.getValue()).intValue() & C68072e.f152460b) == C68072e.f152460b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(80268);
    }
}
