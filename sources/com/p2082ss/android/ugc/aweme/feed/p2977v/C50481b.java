package com.p2082ss.android.ugc.aweme.feed.p2977v;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.feed.v.b */
public final class C50481b {

    /* renamed from: a */
    public static final int f116596a = 1500;

    /* renamed from: b */
    public static final C50481b f116597b = new C50481b();

    /* renamed from: c */
    private static final AbstractC89244h f116598c = C89250i.m154773a((AbstractC89171a) C50482a.f116599a);

    /* renamed from: b */
    private static int m94646b() {
        return ((Number) f116598c.getValue()).intValue();
    }

    private C50481b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.v.b$a */
    static final class C50482a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C50482a f116599a = new C50482a();

        static {
            Covode.recordClassIndex(59619);
        }

        C50482a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.m29616a().mo25394a("vboost_feed_scroll_opt_time", 1500));
        }
    }

    static {
        Covode.recordClassIndex(59618);
    }

    /* renamed from: a */
    public static final int m94645a() {
        if (C46796cm.f109016a) {
            return m94646b();
        }
        return SettingsManager.m29616a().mo25394a("vboost_feed_scroll_opt_time", 1500);
    }
}
