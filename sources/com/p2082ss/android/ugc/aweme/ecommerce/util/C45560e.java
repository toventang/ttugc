package com.p2082ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.e */
public final class C45560e {

    /* renamed from: a */
    public final String f106100a;

    /* renamed from: b */
    public final AbstractC89171a<Object> f106101b;

    /* renamed from: c */
    public final int f106102c;

    static {
        Covode.recordClassIndex(54053);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45560e)) {
            return false;
        }
        C45560e eVar = (C45560e) obj;
        return C89219l.m154714a(this.f106100a, eVar.f106100a) && C89219l.m154714a(this.f106101b, eVar.f106101b) && this.f106102c == eVar.f106102c;
    }

    public final int hashCode() {
        String str = this.f106100a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AbstractC89171a<Object> aVar = this.f106101b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((hashCode + i) * 31) + this.f106102c;
    }

    public final String toString() {
        return "HighLightText(text=" + this.f106100a + ", block=" + this.f106101b + ", textColor=" + this.f106102c + ")";
    }

    private C45560e(String str, int i) {
        C89219l.m154721d(str, "");
        this.f106100a = str;
        this.f106101b = null;
        this.f106102c = i;
    }

    public /* synthetic */ C45560e(String str, int i, byte b) {
        this(str, i);
    }
}
