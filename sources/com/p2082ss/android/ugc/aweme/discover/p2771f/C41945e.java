package com.p2082ss.android.ugc.aweme.discover.p2771f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.f.e */
public final class C41945e {

    /* renamed from: a */
    static final C41946a f97828a = new C41946a(0);

    /* renamed from: b */
    public static final C41946a f97829b = null;

    /* renamed from: c */
    public static final C41945e f97830c = new C41945e();

    /* renamed from: d */
    private static final AbstractC89244h f97831d = C89250i.m154773a((AbstractC89171a) C41947b.f97834a);

    /* renamed from: c */
    private static C41946a m83986c() {
        return (C41946a) f97831d.getValue();
    }

    private C41945e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.f.e$a */
    public static final class C41946a {
        @AbstractC27891c(mo46611a = "enable")

        /* renamed from: a */
        public final boolean f97832a;
        @AbstractC27891c(mo46611a = "pool_size")

        /* renamed from: b */
        public final int f97833b;

        static {
            Covode.recordClassIndex(49873);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C41946a)) {
                return false;
            }
            C41946a aVar = (C41946a) obj;
            return this.f97832a == aVar.f97832a && this.f97833b == aVar.f97833b;
        }

        public final int hashCode() {
            boolean z = this.f97832a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return (i * 31) + this.f97833b;
        }

        public final String toString() {
            return "DiscoveryCommonPoolExperimentConfig(enable=" + this.f97832a + ", poolSize=" + this.f97833b + ")";
        }

        private /* synthetic */ C41946a() {
            this(16);
        }

        public C41946a(int i) {
            this.f97832a = false;
            this.f97833b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.f.e$b */
    static final class C41947b extends AbstractC89220m implements AbstractC89171a<C41946a> {

        /* renamed from: a */
        public static final C41947b f97834a = new C41947b();

        static {
            Covode.recordClassIndex(49874);
        }

        C41947b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41946a invoke() {
            return m83987a();
        }

        /* renamed from: a */
        private static C41946a m83987a() {
            try {
                C41946a aVar = (C41946a) C16048b.m29633a().mo25416a(true, "discovery_common_recyclerview_pool", C41946a.class, C41945e.f97829b);
                if (aVar == null) {
                    return C41945e.f97828a;
                }
                return aVar;
            } catch (Throwable unused) {
                return C41945e.f97828a;
            }
        }
    }

    /* renamed from: a */
    public static boolean m83984a() {
        m83986c();
        return m83986c().f97832a;
    }

    /* renamed from: b */
    public static int m83985b() {
        m83986c();
        return m83986c().f97833b;
    }

    static {
        Covode.recordClassIndex(49872);
    }
}
