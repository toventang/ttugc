package com.p2082ss.android.ugc.aweme.p3682s;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.s.f */
public final class C67269f {

    /* renamed from: a */
    public static final AbstractC89244h f150745a = C89250i.m154773a((AbstractC89171a) C67270a.f150750a);

    /* renamed from: b */
    public static final C67269f f150746b = new C67269f();

    /* renamed from: c */
    private static final AbstractC89244h f150747c = C89250i.m154773a((AbstractC89171a) C67272c.f150752a);

    /* renamed from: d */
    private static final AbstractC89244h f150748d = C89250i.m154773a((AbstractC89171a) C67271b.f150751a);

    /* renamed from: e */
    private static final AbstractC89244h f150749e = C89250i.m154773a((AbstractC89171a) C67273d.f150753a);

    /* renamed from: a */
    public static boolean m119190a() {
        return ((Boolean) f150747c.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static boolean m119191b() {
        return ((Boolean) f150748d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m119192c() {
        return ((Boolean) f150749e.getValue()).booleanValue();
    }

    private C67269f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.s.f$a */
    static final class C67270a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C67270a f150750a = new C67270a();

        static {
            Covode.recordClassIndex(78889);
        }

        C67270a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("first_feed_dont_move_doframe_opt", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.s.f$b */
    static final class C67271b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C67271b f150751a = new C67271b();

        static {
            Covode.recordClassIndex(78890);
        }

        C67271b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("first_feed_msg_asynchronous_opt", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.s.f$c */
    static final class C67272c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C67272c f150752a = new C67272c();

        static {
            Covode.recordClassIndex(78891);
        }

        C67272c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("first_feed_msg_focus_send_opt", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.s.f$d */
    static final class C67273d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C67273d f150753a = new C67273d();

        static {
            Covode.recordClassIndex(78892);
        }

        C67273d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("first_feed_msg_post_animation_opt", false));
        }
    }

    static {
        Covode.recordClassIndex(78888);
    }
}
