package com.p2082ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.profile.experiment.i */
public final class C63748i {

    /* renamed from: a */
    public static final AbstractC89244h f144507a = C89250i.m154773a((AbstractC89171a) C63750b.f144513a);

    /* renamed from: b */
    public static final C63748i f144508b = new C63748i();

    /* renamed from: c */
    private static final AbstractC89244h f144509c = C89250i.m154773a((AbstractC89171a) C63752d.f144515a);

    /* renamed from: d */
    private static final AbstractC89244h f144510d = C89250i.m154773a((AbstractC89171a) C63749a.f144512a);

    /* renamed from: e */
    private static final AbstractC89244h f144511e = C89250i.m154773a((AbstractC89171a) C63751c.f144514a);

    /* renamed from: a */
    public static int m115280a() {
        return ((Number) f144509c.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m115281b() {
        return ((Boolean) f144510d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m115282c() {
        return ((Boolean) f144511e.getValue()).booleanValue();
    }

    private C63748i() {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.experiment.i$a */
    static final class C63749a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C63749a f144512a = new C63749a();

        static {
            Covode.recordClassIndex(75077);
        }

        C63749a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C63748i.m115280a() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.experiment.i$b */
    static final class C63750b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C63750b f144513a = new C63750b();

        static {
            Covode.recordClassIndex(75078);
        }

        C63750b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C63748i.m115280a() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.experiment.i$c */
    static final class C63751c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C63751c f144514a = new C63751c();

        static {
            Covode.recordClassIndex(75079);
        }

        C63751c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C63748i.m115280a() == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.experiment.i$d */
    static final class C63752d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C63752d f144515a = new C63752d();

        static {
            Covode.recordClassIndex(75080);
        }

        C63752d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "blank_profile_recommend_users", 0));
        }
    }

    static {
        Covode.recordClassIndex(75076);
    }
}
