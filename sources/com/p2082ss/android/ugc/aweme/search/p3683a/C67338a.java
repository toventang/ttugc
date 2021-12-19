package com.p2082ss.android.ugc.aweme.search.p3683a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.search.a.a */
public final class C67338a {

    /* renamed from: a */
    public static final C67338a f150899a = new C67338a();

    /* renamed from: b */
    private static final AbstractC89244h f150900b = C89250i.m154773a((AbstractC89171a) C67339a.f150901a);

    /* renamed from: e */
    private static int m119385e() {
        return ((Number) f150900b.getValue()).intValue();
    }

    private C67338a() {
    }

    /* renamed from: a */
    public static boolean m119381a() {
        if (m119385e() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m119382b() {
        if (m119385e() == 0 || m119385e() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m119383c() {
        if (m119385e() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m119384d() {
        if (m119385e() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.search.a.a$a */
    static final class C67339a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C67339a f150901a = new C67339a();

        static {
            Covode.recordClassIndex(78967);
        }

        C67339a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "playlist_interactive_optimization", 0));
        }
    }

    static {
        Covode.recordClassIndex(78966);
    }
}
