package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.av */
public final class C46714av {

    /* renamed from: a */
    public static final AbstractC89244h f108880a = C89250i.m154773a((AbstractC89171a) C46715a.f108886a);

    /* renamed from: b */
    public static final AbstractC89244h f108881b = C89250i.m154773a((AbstractC89171a) C46718d.f108889a);

    /* renamed from: c */
    public static final C46714av f108882c = new C46714av();

    /* renamed from: d */
    private static final AbstractC89244h f108883d = C89250i.m154773a((AbstractC89171a) C46719e.f108890a);

    /* renamed from: e */
    private static final AbstractC89244h f108884e = C89250i.m154773a((AbstractC89171a) C46716b.f108887a);

    /* renamed from: f */
    private static final AbstractC89244h f108885f = C89250i.m154773a((AbstractC89171a) C46717c.f108888a);

    /* renamed from: a */
    public static int m90099a() {
        return ((Number) f108883d.getValue()).intValue();
    }

    /* renamed from: b */
    public static final boolean m90100b() {
        return ((Boolean) f108884e.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static final boolean m90101c() {
        return ((Boolean) f108885f.getValue()).booleanValue();
    }

    private C46714av() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.av$a */
    static final class C46715a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46715a f108886a = new C46715a();

        static {
            Covode.recordClassIndex(55316);
        }

        C46715a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46714av.m90099a() & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.av$b */
    static final class C46716b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46716b f108887a = new C46716b();

        static {
            Covode.recordClassIndex(55317);
        }

        C46716b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C46714av.m90099a() & 1) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.av$c */
    static final class C46717c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46717c f108888a = new C46717c();

        static {
            Covode.recordClassIndex(55318);
        }

        C46717c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46714av.m90099a() & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.av$d */
    static final class C46718d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46718d f108889a = new C46718d();

        static {
            Covode.recordClassIndex(55319);
        }

        C46718d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46714av.m90099a() & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.av$e */
    static final class C46719e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46719e f108890a = new C46719e();

        static {
            Covode.recordClassIndex(55320);
        }

        C46719e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("coldboot_mainact_task_exp", 0));
        }
    }

    static {
        Covode.recordClassIndex(55315);
    }
}
