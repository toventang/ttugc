package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.ct */
public final class C46803ct {

    /* renamed from: a */
    public static volatile boolean f109040a;

    /* renamed from: b */
    public static final C46803ct f109041b = new C46803ct();

    /* renamed from: c */
    private static final AbstractC89244h f109042c = C89250i.m154773a((AbstractC89171a) C46804a.f109043a);

    /* renamed from: a */
    public static boolean m90142a() {
        return ((Boolean) f109042c.getValue()).booleanValue();
    }

    private C46803ct() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ct$a */
    static final class C46804a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46804a f109043a = new C46804a();

        static {
            Covode.recordClassIndex(55405);
        }

        C46804a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C49301e.m92383n() || Keva.getRepo("ab_repo_cold_boot").getInt("first_feed_ok", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(55404);
    }
}
