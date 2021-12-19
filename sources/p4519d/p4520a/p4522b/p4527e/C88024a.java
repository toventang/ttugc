package p4519d.p4520a.p4522b.p4527e;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.b.e.a */
public final class C88024a {

    /* renamed from: a */
    public final int f199900a;

    /* renamed from: b */
    public final Runnable f199901b;

    static {
        Covode.recordClassIndex(104050);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88024a)) {
            return false;
        }
        C88024a aVar = (C88024a) obj;
        return this.f199900a == aVar.f199900a && C89219l.m154714a(this.f199901b, aVar.f199901b);
    }

    public final int hashCode() {
        int i = this.f199900a * 31;
        Runnable runnable = this.f199901b;
        return i + (runnable != null ? runnable.hashCode() : 0);
    }

    public final String toString() {
        return "WorkerRequest(contextId=" + this.f199900a + ", runnable=" + this.f199901b + ")";
    }
}
