package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.a.o */
public final class C84547o {

    /* renamed from: a */
    public final EnumC84548p f188956a;

    /* renamed from: b */
    public final String f188957b;

    static {
        Covode.recordClassIndex(98512);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84547o)) {
            return false;
        }
        C84547o oVar = (C84547o) obj;
        return C89219l.m154714a(this.f188956a, oVar.f188956a) && C89219l.m154714a(this.f188957b, oVar.f188957b);
    }

    public final int hashCode() {
        EnumC84548p pVar = this.f188956a;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        String str = this.f188957b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SearchStickerInfo(state=" + this.f188956a + ", filePath=" + this.f188957b + ")";
    }

    public C84547o(EnumC84548p pVar, String str) {
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(str, "");
        this.f188956a = pVar;
        this.f188957b = str;
    }
}
