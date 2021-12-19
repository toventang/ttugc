package com.p2082ss.android.ugc.aweme.editSticker;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.a */
public final class C45821a {

    /* renamed from: a */
    public final String f106761a;

    /* renamed from: b */
    public final String f106762b;

    /* renamed from: c */
    public final int f106763c = 100;

    static {
        Covode.recordClassIndex(54344);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45821a)) {
            return false;
        }
        C45821a aVar = (C45821a) obj;
        return C89219l.m154714a(this.f106761a, aVar.f106761a) && C89219l.m154714a(this.f106762b, aVar.f106762b) && this.f106763c == aVar.f106763c;
    }

    public final int hashCode() {
        String str = this.f106761a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f106762b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f106763c;
    }

    public final String toString() {
        return "EditEffectTextStickerConfig(stylePanel=" + this.f106761a + ", fontPanel=" + this.f106762b + ", effectMaxCharNum=" + this.f106763c + ")";
    }

    public C45821a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f106761a = str;
        this.f106762b = str2;
    }
}
