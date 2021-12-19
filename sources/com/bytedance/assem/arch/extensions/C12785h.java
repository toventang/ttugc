package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.extensions.h */
public final class C12785h<T> extends AbstractC12783f<T> {

    /* renamed from: a */
    public final Throwable f31103a;

    static {
        Covode.recordClassIndex(14613);
    }

    public final String toString() {
        return "Fail(error=" + this.f31103a + ")";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C89204ab.m154669a(this.f31103a.getClass()), this.f31103a.getMessage(), this.f31103a.getStackTrace()[0]});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12785h(Throwable th) {
        super((byte) 0);
        C89219l.m154719c(th, "");
        this.f31103a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12785h)) {
            return false;
        }
        Throwable th = ((C12785h) obj).f31103a;
        if (!C89219l.m154714a(C89204ab.m154669a(this.f31103a.getClass()), C89204ab.m154669a(th.getClass())) || !C89219l.m154714a((Object) this.f31103a.getMessage(), (Object) th.getMessage()) || !C89219l.m154714a(this.f31103a.getStackTrace()[0], th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
