package com.p2082ss.android.ugc.aweme.comment.p2490d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.comment.d.g */
public final class C36410g {

    /* renamed from: a */
    public static final C36410g f86103a = new C36410g();

    /* renamed from: b */
    private static final AbstractC89244h f86104b = C89250i.m154773a((AbstractC89171a) C36411a.f86105a);

    /* renamed from: a */
    public static int m74110a() {
        return ((Number) f86104b.getValue()).intValue();
    }

    private C36410g() {
    }

    /* renamed from: b */
    public static boolean m74111b() {
        if (m74110a() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m74113d() {
        int a = m74110a();
        if (1 <= a && 4 >= a) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.d.g$a */
    static final class C36411a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C36411a f86105a = new C36411a();

        static {
            Covode.recordClassIndex(43706);
        }

        C36411a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "social_video_tag", 0));
        }
    }

    static {
        Covode.recordClassIndex(43705);
    }

    /* renamed from: c */
    public static boolean m74112c() {
        if (m74110a() <= 0 || m74110a() == 4) {
            return false;
        }
        return true;
    }
}
