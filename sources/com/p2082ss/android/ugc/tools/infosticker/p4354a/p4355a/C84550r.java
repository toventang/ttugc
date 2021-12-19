package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.a.r */
public final class C84550r {

    /* renamed from: a */
    public final EnumC84544l f188960a;

    /* renamed from: b */
    public final String f188961b;

    static {
        Covode.recordClassIndex(98515);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84550r)) {
            return false;
        }
        C84550r rVar = (C84550r) obj;
        return C89219l.m154714a(this.f188960a, rVar.f188960a) && C89219l.m154714a(this.f188961b, rVar.f188961b);
    }

    public final int hashCode() {
        EnumC84544l lVar = this.f188960a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        String str = this.f188961b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "StickerStateInfo(state=" + this.f188960a + ", filePath=" + this.f188961b + ")";
    }
}
