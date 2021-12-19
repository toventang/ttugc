package com.p2082ss.android.ugc.aweme.qna.fragment;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.fragment.f */
public final class C66105f {

    /* renamed from: a */
    public final String f148829a;

    /* renamed from: b */
    public final int f148830b;

    /* renamed from: c */
    public final EnumC66102c f148831c;

    static {
        Covode.recordClassIndex(77613);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66105f)) {
            return false;
        }
        C66105f fVar = (C66105f) obj;
        return C89219l.m154714a(this.f148829a, fVar.f148829a) && this.f148830b == fVar.f148830b && C89219l.m154714a(this.f148831c, fVar.f148831c);
    }

    public final int hashCode() {
        String str = this.f148829a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f148830b) * 31;
        EnumC66102c cVar = this.f148831c;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BottomSheetActionUiModel(actionTitle=" + this.f148829a + ", tuxActionSheetVariant=" + this.f148830b + ", bottomSheetActionEnum=" + this.f148831c + ")";
    }

    public C66105f(String str, int i, EnumC66102c cVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cVar, "");
        this.f148829a = str;
        this.f148830b = i;
        this.f148831c = cVar;
    }
}
