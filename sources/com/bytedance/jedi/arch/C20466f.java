package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.f */
public final class C20466f<T> extends AbstractC20362a<T> {

    /* renamed from: a */
    public final Throwable f48408a;

    static {
        Covode.recordClassIndex(23987);
    }

    public final String toString() {
        return "Fail(error=" + this.f48408a + ")";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C89204ab.m154669a(this.f48408a.getClass()), this.f48408a.getMessage(), this.f48408a.getStackTrace()[0]});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20466f(Throwable th) {
        super((byte) 0);
        C89219l.m154719c(th, "");
        this.f48408a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20466f)) {
            return false;
        }
        Throwable th = ((C20466f) obj).f48408a;
        if (!C89219l.m154714a(C89204ab.m154669a(this.f48408a.getClass()), C89204ab.m154669a(th.getClass())) || !C89219l.m154714a((Object) this.f48408a.getMessage(), (Object) th.getMessage()) || !C89219l.m154714a(this.f48408a.getStackTrace()[0], th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
