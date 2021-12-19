package com.p2082ss.android.ugc.aweme.story.p4024c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.story.c.f */
public final class C76681f {

    /* renamed from: a */
    public static final C76681f f172094a = new C76681f();

    /* renamed from: b */
    private static final AbstractC89244h f172095b = C89250i.m154773a((AbstractC89171a) C76682a.f172096a);

    /* renamed from: a */
    public static boolean m134256a() {
        return ((Boolean) f172095b.getValue()).booleanValue();
    }

    private C76681f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.c.f$a */
    static final class C76682a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C76682a f172096a = new C76682a();

        static {
            Covode.recordClassIndex(89677);
        }

        C76682a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "tt_story_sidebar_value_verify_exp", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(89676);
    }
}
