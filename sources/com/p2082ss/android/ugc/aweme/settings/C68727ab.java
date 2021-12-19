package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settings.ab */
public final class C68727ab {

    /* renamed from: a */
    public final String f153743a;

    /* renamed from: b */
    public final String f153744b;

    /* renamed from: c */
    public final String f153745c;

    static {
        Covode.recordClassIndex(80996);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68727ab)) {
            return false;
        }
        C68727ab abVar = (C68727ab) obj;
        return C89219l.m154714a(this.f153743a, abVar.f153743a) && C89219l.m154714a(this.f153744b, abVar.f153744b) && C89219l.m154714a(this.f153745c, abVar.f153745c);
    }

    public final int hashCode() {
        String str = this.f153743a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f153744b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f153745c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ResourceInterceptItem(url=" + this.f153743a + ", channel=" + this.f153744b + ", fileName=" + this.f153745c + ")";
    }
}
