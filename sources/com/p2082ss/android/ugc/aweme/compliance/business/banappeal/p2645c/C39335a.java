package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.c.a */
public final class C39335a {

    /* renamed from: a */
    public final String f92850a;

    /* renamed from: b */
    public final AbstractC89183m<DialogInterface, Integer, C89391z> f92851b;

    static {
        Covode.recordClassIndex(47015);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39335a)) {
            return false;
        }
        C39335a aVar = (C39335a) obj;
        return C89219l.m154714a(this.f92850a, aVar.f92850a) && C89219l.m154714a(this.f92851b, aVar.f92851b);
    }

    public final int hashCode() {
        String str = this.f92850a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AbstractC89183m<DialogInterface, Integer, C89391z> mVar = this.f92851b;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AppealDialogButtonState(title=" + this.f92850a + ", listener=" + this.f92851b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super android.content.DialogInterface, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39335a(String str, AbstractC89183m<? super DialogInterface, ? super Integer, C89391z> mVar) {
        C89219l.m154721d(mVar, "");
        this.f92850a = str;
        this.f92851b = mVar;
    }
}
