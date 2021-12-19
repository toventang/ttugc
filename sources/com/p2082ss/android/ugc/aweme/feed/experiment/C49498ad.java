package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.ad */
public final class C49498ad {

    /* renamed from: a */
    static final AbstractC89244h f113857a = C89250i.m154773a((AbstractC89171a) C49501c.f113864a);

    /* renamed from: b */
    public static boolean f113858b = true;

    /* renamed from: c */
    public static final C49498ad f113859c = new C49498ad();

    /* renamed from: d */
    private static final AbstractC89244h f113860d = C89250i.m154773a((AbstractC89171a) C49500b.f113863a);

    /* renamed from: e */
    private static final AbstractC89244h f113861e = C89250i.m154773a((AbstractC89171a) C49499a.f113862a);

    /* renamed from: a */
    public static boolean m92737a() {
        return ((Boolean) f113860d.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static boolean m92738b() {
        return ((Boolean) f113861e.getValue()).booleanValue();
    }

    private C49498ad() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.experiment.ad$a */
    static final class C49499a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C49499a f113862a = new C49499a();

        static {
            Covode.recordClassIndex(58313);
        }

        C49499a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (!C49498ad.f113858b || !C49498ad.m92737a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.experiment.ad$b */
    static final class C49500b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C49500b f113863a = new C49500b();

        static {
            Covode.recordClassIndex(58314);
        }

        C49500b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((((Number) C49498ad.f113857a.getValue()).intValue() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.experiment.ad$c */
    static final class C49501c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C49501c f113864a = new C49501c();

        static {
            Covode.recordClassIndex(58315);
        }

        C49501c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("jump_cookie", 0));
        }
    }

    static {
        Covode.recordClassIndex(58312);
    }
}
