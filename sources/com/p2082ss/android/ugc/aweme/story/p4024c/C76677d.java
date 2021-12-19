package com.p2082ss.android.ugc.aweme.story.p4024c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.story.c.d */
public final class C76677d {

    /* renamed from: a */
    public static final C76677d f172088a = new C76677d();

    /* renamed from: b */
    private static final AbstractC89244h f172089b = C89250i.m154773a((AbstractC89171a) C76678a.f172090a);

    /* renamed from: a */
    public static boolean m134255a() {
        return ((Boolean) f172089b.getValue()).booleanValue();
    }

    private C76677d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.c.d$a */
    static final class C76678a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C76678a f172090a = new C76678a();

        static {
            Covode.recordClassIndex(89673);
        }

        C76678a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "tt_story_performance_opt_experiment", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(89672);
    }
}
