package com.bytedance.android.live.liveinteract.cohost.p279ui.p283d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.d.e */
public final class C4706e {

    /* renamed from: a */
    public final String f12435a;

    /* renamed from: b */
    public final String f12436b;

    static {
        Covode.recordClassIndex(5283);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4706e)) {
            return false;
        }
        C4706e eVar = (C4706e) obj;
        return C89219l.m154714a(this.f12435a, eVar.f12435a) && C89219l.m154714a(this.f12436b, eVar.f12436b);
    }

    public final int hashCode() {
        String str = this.f12435a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f12436b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SuggestionItem(suggestContent=" + this.f12435a + ", clickableContent=" + this.f12436b + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C4706e() {
        /*
            r3 = this;
            r0 = 2131827234(0x7f111a22, float:1.9287375E38)
            java.lang.String r2 = com.bytedance.android.live.core.p218f.C3966y.m9657a(r0)
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r1)
            r0 = 2131827235(0x7f111a23, float:1.9287377E38)
            java.lang.String r0 = com.bytedance.android.live.core.p218f.C3966y.m9657a(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r3.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4706e.<init>():void");
    }

    private C4706e(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f12435a = str;
        this.f12436b = str2;
    }
}
