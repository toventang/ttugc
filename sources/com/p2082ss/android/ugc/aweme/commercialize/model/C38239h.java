package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.h */
public final class C38239h {

    /* renamed from: a */
    public final int f90349a;

    /* renamed from: b */
    public final String f90350b;

    static {
        Covode.recordClassIndex(45723);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38239h)) {
            return false;
        }
        C38239h hVar = (C38239h) obj;
        return this.f90349a == hVar.f90349a && C89219l.m154714a(this.f90350b, hVar.f90350b);
    }

    public final int hashCode() {
        int i = this.f90349a * 31;
        String str = this.f90350b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdHalfWebPageShowParams(delay=" + this.f90349a + ", eventType=" + this.f90350b + ")";
    }

    public C38239h(int i, String str) {
        this.f90349a = i;
        this.f90350b = str;
    }
}
