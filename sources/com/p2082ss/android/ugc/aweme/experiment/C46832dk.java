package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.dk */
public final class C46832dk {

    /* renamed from: a */
    public static final int f109103a = 1;

    /* renamed from: b */
    static final int f109104b = 2;

    /* renamed from: c */
    static final int f109105c = 4;

    /* renamed from: d */
    static final int f109106d = 8;

    /* renamed from: e */
    public static final AbstractC89244h f109107e = C89250i.m154773a((AbstractC89171a) C46833a.f109113a);

    /* renamed from: f */
    public static final C46832dk f109108f = new C46832dk();

    /* renamed from: g */
    private static final AbstractC89244h f109109g = C89250i.m154773a((AbstractC89171a) C46835c.f109115a);

    /* renamed from: h */
    private static final AbstractC89244h f109110h = C89250i.m154773a((AbstractC89171a) C46837e.f109117a);

    /* renamed from: i */
    private static final AbstractC89244h f109111i = C89250i.m154773a((AbstractC89171a) C46836d.f109116a);

    /* renamed from: j */
    private static final AbstractC89244h f109112j = C89250i.m154773a((AbstractC89171a) C46834b.f109114a);

    /* renamed from: a */
    public static int m90150a() {
        return ((Number) f109109g.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m90151b() {
        return ((Boolean) f109110h.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m90152c() {
        return ((Boolean) f109111i.getValue()).booleanValue();
    }

    /* renamed from: d */
    public static boolean m90153d() {
        return ((Boolean) f109112j.getValue()).booleanValue();
    }

    private C46832dk() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dk$a */
    static final class C46833a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46833a f109113a = new C46833a();

        static {
            Covode.recordClassIndex(55434);
        }

        C46833a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46832dk.m90150a() & C46832dk.f109106d) == C46832dk.f109106d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dk$b */
    static final class C46834b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46834b f109114a = new C46834b();

        static {
            Covode.recordClassIndex(55435);
        }

        C46834b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46832dk.m90150a() & C46832dk.f109105c) == C46832dk.f109105c) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dk$c */
    static final class C46835c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46835c f109115a = new C46835c();

        static {
            Covode.recordClassIndex(55436);
        }

        C46835c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("first_frame_do_frame_opt", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dk$d */
    static final class C46836d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46836d f109116a = new C46836d();

        static {
            Covode.recordClassIndex(55437);
        }

        C46836d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46832dk.m90150a() & C46832dk.f109104b) == C46832dk.f109104b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dk$e */
    static final class C46837e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46837e f109117a = new C46837e();

        static {
            Covode.recordClassIndex(55438);
        }

        C46837e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C46832dk.m90150a() & C46832dk.f109103a) == C46832dk.f109103a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(55433);
    }
}
