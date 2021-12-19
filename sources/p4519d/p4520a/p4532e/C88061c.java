package p4519d.p4520a.p4532e;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.e.c */
public final class C88061c implements AbstractC88059a {

    /* renamed from: a */
    private boolean f199975a;

    static {
        Covode.recordClassIndex(104087);
    }

    @Override // p4519d.p4520a.p4532e.AbstractC88059a
    public final void logError(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
    }

    @Override // p4519d.p4520a.p4532e.AbstractC88059a
    public final void logError(String str, String str2, Throwable th) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(th, "");
    }

    @Override // p4519d.p4520a.p4532e.AbstractC88059a
    public final boolean getEnabled() {
        return this.f199975a;
    }

    @Override // p4519d.p4520a.p4532e.AbstractC88059a
    public final void logDebug(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        getEnabled();
    }
}
