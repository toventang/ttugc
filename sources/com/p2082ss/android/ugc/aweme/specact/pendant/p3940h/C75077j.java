package com.p2082ss.android.ugc.aweme.specact.pendant.p3940h;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.j */
public final class C75077j {

    /* renamed from: a */
    public static final AbstractC89244h f168737a = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C75079b.f168740a);

    /* renamed from: b */
    public static final C75078a f168738b = new C75078a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f168739c = C89250i.m154773a((AbstractC89171a) C75080c.f168741a);

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.j$a */
    public static final class C75078a {
        static {
            Covode.recordClassIndex(87950);
        }

        /* renamed from: a */
        public static C75077j m131843a() {
            return (C75077j) C75077j.f168737a.getValue();
        }

        private C75078a() {
        }

        public /* synthetic */ C75078a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.j$b */
    static final class C75079b extends AbstractC89220m implements AbstractC89171a<C75077j> {

        /* renamed from: a */
        public static final C75079b f168740a = new C75079b();

        static {
            Covode.recordClassIndex(87951);
        }

        C75079b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75077j invoke() {
            return new C75077j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.j$c */
    static final class C75080c extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C75080c f168741a = new C75080c();

        static {
            Covode.recordClassIndex(87952);
        }

        C75080c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("spec_act_debug_time");
        }
    }

    /* renamed from: a */
    public final boolean mo118185a() {
        return ((Keva) this.f168739c.getValue()).getBoolean("use_local_time", false);
    }

    static {
        Covode.recordClassIndex(87949);
    }
}
