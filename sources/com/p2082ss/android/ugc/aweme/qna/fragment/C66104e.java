package com.p2082ss.android.ugc.aweme.qna.fragment;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66356b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.fragment.e */
public final class C66104e {

    /* renamed from: a */
    public final C66356b f148827a;

    /* renamed from: b */
    public final EnumC66102c f148828b;

    static {
        Covode.recordClassIndex(77612);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66104e)) {
            return false;
        }
        C66104e eVar = (C66104e) obj;
        return C89219l.m154714a(this.f148827a, eVar.f148827a) && C89219l.m154714a(this.f148828b, eVar.f148828b);
    }

    public final int hashCode() {
        C66356b bVar = this.f148827a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        EnumC66102c cVar = this.f148828b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BottomSheetActionPayload(navigateDialogUiModel=" + this.f148827a + ", bottomSheetActionEnum=" + this.f148828b + ")";
    }

    public C66104e(C66356b bVar, EnumC66102c cVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(cVar, "");
        this.f148827a = bVar;
        this.f148828b = cVar;
    }
}
