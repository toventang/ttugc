package com.p2082ss.android.ugc.aweme.specact.popup.p3942a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.a.f */
public final class C75121f {
    @AbstractC27891c(mo46611a = "calendar_info")

    /* renamed from: a */
    public C75118c f168873a;
    @AbstractC27891c(mo46611a = "subsequent_popup")

    /* renamed from: b */
    public C75124i f168874b;

    static {
        Covode.recordClassIndex(87994);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75121f)) {
            return false;
        }
        C75121f fVar = (C75121f) obj;
        return C89219l.m154714a(this.f168873a, fVar.f168873a) && C89219l.m154714a(this.f168874b, fVar.f168874b);
    }

    public final int hashCode() {
        C75118c cVar = this.f168873a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        C75124i iVar = this.f168874b;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Others(calendarInfo=" + this.f168873a + ", subSequentPopup=" + this.f168874b + ")";
    }

    public /* synthetic */ C75121f() {
        this(new C75118c());
    }

    private C75121f(C75118c cVar) {
        C89219l.m154721d(cVar, "");
        this.f168873a = cVar;
        this.f168874b = null;
    }
}
