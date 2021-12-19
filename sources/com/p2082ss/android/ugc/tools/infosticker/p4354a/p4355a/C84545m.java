package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.a.m */
public final class C84545m {

    /* renamed from: a */
    public final EnumC84546n f188953a;

    /* renamed from: b */
    public final String f188954b;

    static {
        Covode.recordClassIndex(98510);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84545m)) {
            return false;
        }
        C84545m mVar = (C84545m) obj;
        return C89219l.m154714a(this.f188953a, mVar.f188953a) && C89219l.m154714a(this.f188954b, mVar.f188954b);
    }

    public final int hashCode() {
        EnumC84546n nVar = this.f188953a;
        int i = 0;
        int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
        String str = this.f188954b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProviderStickerInfo(state=" + this.f188953a + ", filePath=" + this.f188954b + ")";
    }

    public C84545m(EnumC84546n nVar, String str) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(str, "");
        this.f188953a = nVar;
        this.f188954b = str;
    }
}
