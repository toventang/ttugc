package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.i */
public final class C17526i {

    /* renamed from: a */
    public static final C17527a f41942a = new C17527a(false, 10);

    /* renamed from: b */
    public static final C17526i f41943b = new C17526i();

    /* renamed from: c */
    private static final C17527a f41944c = new C17527a(true, 20);

    /* renamed from: d */
    private static final AbstractC89244h f41945d = C89250i.m154773a((AbstractC89171a) C17528b.f41948a);

    /* renamed from: a */
    static final C17527a m32501a() {
        return (C17527a) f41945d.getValue();
    }

    private C17526i() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.i$b */
    static final class C17528b extends AbstractC89220m implements AbstractC89171a<C17527a> {

        /* renamed from: a */
        public static final C17528b f41948a = new C17528b();

        static {
            Covode.recordClassIndex(20017);
        }

        C17528b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17527a invoke() {
            return m32502a();
        }

        /* renamed from: a */
        private static C17527a m32502a() {
            try {
                Object a = C16048b.m29633a().mo25415a(true, "im_sdk_optimize_send", C17527a.class);
                if (a != null) {
                    return (C17527a) a;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.im.core.opt.SdkOptionsOptimizeSendMsgExperiment.Params");
            } catch (Throwable unused) {
                return C17526i.f41942a;
            }
        }
    }

    static {
        Covode.recordClassIndex(20015);
    }

    /* renamed from: com.bytedance.ies.im.core.e.i$a */
    public static final class C17527a {
        @AbstractC27891c(mo46611a = "enable")

        /* renamed from: a */
        public final boolean f41946a;
        @AbstractC27891c(mo46611a = "cache_size")

        /* renamed from: b */
        public final int f41947b;

        static {
            Covode.recordClassIndex(20016);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17527a)) {
                return false;
            }
            C17527a aVar = (C17527a) obj;
            return this.f41946a == aVar.f41946a && this.f41947b == aVar.f41947b;
        }

        public final int hashCode() {
            boolean z = this.f41946a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return (i * 31) + this.f41947b;
        }

        public final String toString() {
            return "Params(useSendMsgCache=" + this.f41946a + ", cacheSize=" + this.f41947b + ")";
        }

        public C17527a(boolean z, int i) {
            this.f41946a = z;
            this.f41947b = i;
        }
    }
}
