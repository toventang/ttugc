package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.f */
public final class C46920f {

    /* renamed from: a */
    public static final C46920f f109342a = new C46920f();

    /* renamed from: b */
    private static final AbstractC89244h f109343b = C89250i.m154773a((AbstractC89171a) C46921a.f109344a);

    /* renamed from: d */
    private static int m90224d() {
        return ((Number) f109343b.getValue()).intValue();
    }

    private C46920f() {
    }

    /* renamed from: a */
    public static final boolean m90221a() {
        if ((m90224d() & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m90222b() {
        if ((m90224d() & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m90223c() {
        if ((m90224d() & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.f$a */
    static final class C46921a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46921a f109344a = new C46921a();

        static {
            Covode.recordClassIndex(55522);
        }

        C46921a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "add_comment_and_like_bubble", 0));
        }
    }

    static {
        Covode.recordClassIndex(55521);
    }
}
