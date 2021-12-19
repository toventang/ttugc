package com.p2082ss.android.ugc.aweme.discover.p2771f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.f.f */
public final class C41948f {

    /* renamed from: a */
    static final C41949a f97835a = new C41949a();

    /* renamed from: b */
    public static final C41949a f97836b = null;

    /* renamed from: c */
    public static final C41948f f97837c = new C41948f();

    /* renamed from: d */
    private static final AbstractC89244h f97838d = C89250i.m154773a((AbstractC89171a) C41950b.f97841a);

    /* renamed from: com.ss.android.ugc.aweme.discover.f.f$a */
    public static final class C41949a {
        @AbstractC27891c(mo46611a = "enable_opt_function")

        /* renamed from: a */
        public final boolean f97839a = false;
        @AbstractC27891c(mo46611a = "enable_opt_event_trace")

        /* renamed from: b */
        public final boolean f97840b = false;

        static {
            Covode.recordClassIndex(49876);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C41949a)) {
                return false;
            }
            C41949a aVar = (C41949a) obj;
            return this.f97839a == aVar.f97839a && this.f97840b == aVar.f97840b;
        }

        public final int hashCode() {
            boolean z = this.f97839a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            if (!this.f97840b) {
                i = 0;
            }
            return i5 + i;
        }

        public final String toString() {
            return "Config(enable1=" + this.f97839a + ", enable2=" + this.f97840b + ")";
        }
    }

    /* renamed from: a */
    public static C41949a m83988a() {
        return (C41949a) f97838d.getValue();
    }

    private C41948f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.f.f$b */
    static final class C41950b extends AbstractC89220m implements AbstractC89171a<C41949a> {

        /* renamed from: a */
        public static final C41950b f97841a = new C41950b();

        static {
            Covode.recordClassIndex(49877);
        }

        C41950b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41949a invoke() {
            return m83989a();
        }

        /* renamed from: a */
        private static C41949a m83989a() {
            C41949a aVar;
            try {
                aVar = (C41949a) C16048b.m29633a().mo25416a(true, "discovery_fps_opt_experiment", C41949a.class, C41948f.f97836b);
                if (aVar == null) {
                    aVar = C41948f.f97835a;
                }
                C89219l.m154716b(aVar, "");
            } catch (Throwable unused) {
                aVar = C41948f.f97835a;
            }
            C51423a.m95791b(4, "DiscoveryFpsOptExperiment", "enableOptFunction=" + aVar.f97839a + " ; enableOptEventTrace=" + aVar.f97840b);
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(49875);
    }
}
