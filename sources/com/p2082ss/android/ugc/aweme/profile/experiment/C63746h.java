package com.p2082ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.profile.experiment.h */
public final class C63746h {

    /* renamed from: a */
    public static final C63746h f144504a = new C63746h();

    /* renamed from: b */
    private static final AbstractC89244h f144505b = C89250i.m154773a((AbstractC89171a) C63747a.f144506a);

    /* renamed from: c */
    private static int m115279c() {
        return ((Number) f144505b.getValue()).intValue();
    }

    private C63746h() {
    }

    /* renamed from: a */
    public static boolean m115277a() {
        if (m115279c() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.experiment.h$a */
    static final class C63747a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C63747a f144506a = new C63747a();

        static {
            Covode.recordClassIndex(75075);
        }

        C63747a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "recommend_card_style", 0));
        }
    }

    static {
        Covode.recordClassIndex(75074);
    }

    /* renamed from: b */
    public static boolean m115278b() {
        if (m115279c() == 1 || m115279c() == 2) {
            return true;
        }
        return false;
    }
}
