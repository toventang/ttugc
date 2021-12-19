package com.p2082ss.android.ugc.tools.p4346h.p4347a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.a.o */
public final class C84458o {

    /* renamed from: a */
    public final Integer f188789a;

    /* renamed from: b */
    public final Exception f188790b;

    static {
        Covode.recordClassIndex(98423);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84458o)) {
            return false;
        }
        C84458o oVar = (C84458o) obj;
        return C89219l.m154714a(this.f188789a, oVar.f188789a) && C89219l.m154714a(this.f188790b, oVar.f188790b);
    }

    public final int hashCode() {
        Integer num = this.f188789a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Exception exc = this.f188790b;
        if (exc != null) {
            i = exc.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SimpleDownloaderErrorInfo(errorCode=" + this.f188789a + ", errorException=" + this.f188790b + ")";
    }
}
