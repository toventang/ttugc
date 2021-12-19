package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.i */
public final class C44955i {

    /* renamed from: c */
    public static final C44956a f104890c = new C44956a((byte) 0);

    /* renamed from: a */
    public final Object f104891a;

    /* renamed from: b */
    public boolean f104892b;

    static {
        Covode.recordClassIndex(53372);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44955i)) {
            return false;
        }
        C44955i iVar = (C44955i) obj;
        return C89219l.m154714a(this.f104891a, iVar.f104891a) && this.f104892b == iVar.f104892b;
    }

    public final int hashCode() {
        Object obj = this.f104891a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        boolean z = this.f104892b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "TrackTag(data=" + this.f104891a + ", isTrack=" + this.f104892b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.i$a */
    public static final class C44956a {
        static {
            Covode.recordClassIndex(53373);
        }

        private C44956a() {
        }

        public /* synthetic */ C44956a(byte b) {
            this();
        }
    }

    private C44955i(Object obj) {
        C89219l.m154721d(obj, "");
        this.f104891a = obj;
        this.f104892b = false;
    }

    public /* synthetic */ C44955i(Object obj, byte b) {
        this(obj);
    }
}
