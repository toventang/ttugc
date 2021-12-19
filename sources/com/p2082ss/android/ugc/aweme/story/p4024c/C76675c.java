package com.p2082ss.android.ugc.aweme.story.p4024c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.story.c.c */
public final class C76675c {

    /* renamed from: a */
    public static final C76675c f172085a = new C76675c();

    /* renamed from: b */
    private static final AbstractC89244h f172086b = C89250i.m154773a((AbstractC89171a) C76676a.f172087a);

    /* renamed from: a */
    public static int m134253a() {
        return ((Number) f172086b.getValue()).intValue();
    }

    private C76675c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.c.c$a */
    static final class C76676a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C76676a f172087a = new C76676a();

        static {
            Covode.recordClassIndex(89671);
        }

        C76676a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "tt_story_icon_display_strategy", 1));
        }
    }

    /* renamed from: b */
    public static boolean m134254b() {
        if (m134253a() == 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(89670);
    }
}
