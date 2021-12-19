package com.p2082ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.profile.experiment.d */
public final class C63740d {

    /* renamed from: a */
    static final AbstractC89244h f144495a = C89250i.m154773a((AbstractC89171a) C63742b.f144499a);

    /* renamed from: b */
    public static final AbstractC89244h f144496b = C89250i.m154773a((AbstractC89171a) C63741a.f144498a);

    /* renamed from: c */
    public static final C63740d f144497c = new C63740d();

    private C63740d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.experiment.d$a */
    static final class C63741a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C63741a f144498a = new C63741a();

        static {
            Covode.recordClassIndex(75069);
        }

        C63741a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (((Number) C63740d.f144495a.getValue()).intValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.experiment.d$b */
    static final class C63742b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C63742b f144499a = new C63742b();

        static {
            Covode.recordClassIndex(75070);
        }

        C63742b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "guide_user_reach_private_account_setting_user_new", 0));
        }
    }

    static {
        Covode.recordClassIndex(75068);
    }
}
