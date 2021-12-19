package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.h */
public final class C17988h {

    /* renamed from: a */
    public static final AbstractC89244h f42836a = C89250i.m154773a((AbstractC89171a) C17990b.f42841a);

    /* renamed from: b */
    public static final C17988h f42837b = new C17988h();

    /* renamed from: c */
    private static final AbstractC89244h f42838c = C89250i.m154773a((AbstractC89171a) C17991c.f42842a);

    /* renamed from: d */
    private static final AbstractC89244h f42839d = C89250i.m154773a((AbstractC89171a) C17989a.f42840a);

    /* renamed from: a */
    public static int m33505a() {
        return ((Number) f42838c.getValue()).intValue();
    }

    private C17988h() {
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.h$a */
    static final class C17989a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17989a f42840a = new C17989a();

        static {
            Covode.recordClassIndex(20610);
        }

        C17989a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C17988h.m33505a() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.h$b */
    static final class C17990b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17990b f42841a = new C17990b();

        static {
            Covode.recordClassIndex(20611);
        }

        C17990b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C17988h.m33505a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.h$c */
    static final class C17991c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C17991c f42842a = new C17991c();

        static {
            Covode.recordClassIndex(20612);
        }

        C17991c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("splash_new_factory_opt", 0));
        }
    }

    static {
        Covode.recordClassIndex(20609);
    }
}
