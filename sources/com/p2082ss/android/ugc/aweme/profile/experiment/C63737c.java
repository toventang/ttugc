package com.p2082ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.profile.experiment.c */
public final class C63737c {

    /* renamed from: a */
    public static final AbstractC89244h f144490a = C89250i.m154773a((AbstractC89171a) C63738a.f144493a);

    /* renamed from: b */
    public static final C63737c f144491b = new C63737c();

    /* renamed from: c */
    private static final AbstractC89244h f144492c = C89250i.m154773a((AbstractC89171a) C63739b.f144494a);

    /* renamed from: a */
    public static int m115267a() {
        return ((Number) f144492c.getValue()).intValue();
    }

    private C63737c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.experiment.c$a */
    static final class C63738a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C63738a f144493a = new C63738a();

        static {
            Covode.recordClassIndex(75066);
        }

        C63738a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C63737c.m115267a() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.experiment.c$b */
    static final class C63739b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C63739b f144494a = new C63739b();

        static {
            Covode.recordClassIndex(75067);
        }

        C63739b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "guide_user_reach_private_account_setting_user_all", 0));
        }
    }

    static {
        Covode.recordClassIndex(75065);
    }
}
