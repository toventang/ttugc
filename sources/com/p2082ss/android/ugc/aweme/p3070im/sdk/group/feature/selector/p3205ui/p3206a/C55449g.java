package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3206a;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.AbstractC12798a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.g */
public final class C55449g implements AbstractC12798a {

    /* renamed from: a */
    public final String f126696a;

    /* renamed from: b */
    public final C12776a<Boolean> f126697b;

    static {
        Covode.recordClassIndex(65220);
    }

    /* renamed from: a */
    public static /* synthetic */ C55449g m101227a(C55449g gVar, String str, C12776a aVar, int i) {
        if ((i & 1) != 0) {
            str = gVar.f126696a;
        }
        if ((i & 2) != 0) {
            aVar = gVar.f126697b;
        }
        return m101228a(str, aVar);
    }

    /* renamed from: a */
    private static C55449g m101228a(String str, C12776a<Boolean> aVar) {
        C89219l.m154721d(aVar, "");
        return new C55449g(str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55449g)) {
            return false;
        }
        C55449g gVar = (C55449g) obj;
        return C89219l.m154714a(this.f126696a, gVar.f126696a) && C89219l.m154714a(this.f126697b, gVar.f126697b);
    }

    public final int hashCode() {
        String str = this.f126696a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C12776a<Boolean> aVar = this.f126697b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SearchBarData(keyword=" + this.f126696a + ", clearEvent=" + this.f126697b + ")";
    }

    public C55449g(String str, C12776a<Boolean> aVar) {
        C89219l.m154721d(aVar, "");
        this.f126696a = str;
        this.f126697b = aVar;
    }
}
