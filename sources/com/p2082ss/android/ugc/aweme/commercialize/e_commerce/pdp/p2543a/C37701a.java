package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2543a;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.a.a */
public final class C37701a {

    /* renamed from: a */
    public final float f89059a = 0.73f;

    /* renamed from: b */
    public final float f89060b = 1.0f;

    /* renamed from: c */
    public final String f89061c;

    /* renamed from: d */
    public final AbstractC89171a<C89391z> f89062d;

    /* renamed from: e */
    public final AbstractC89171a<C89391z> f89063e;

    static {
        Covode.recordClassIndex(45139);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37701a)) {
            return false;
        }
        C37701a aVar = (C37701a) obj;
        return Float.compare(this.f89059a, aVar.f89059a) == 0 && Float.compare(this.f89060b, aVar.f89060b) == 0 && C89219l.m154714a(this.f89061c, aVar.f89061c) && C89219l.m154714a(this.f89062d, aVar.f89062d) && C89219l.m154714a(this.f89063e, aVar.f89063e);
    }

    public final String toString() {
        return "BulletBottomSheetConfig(peekHeightRatio=" + this.f89059a + ", maxHeightRatio=" + this.f89060b + ", schema=" + this.f89061c + ", onHideCallback=" + this.f89062d + ", onShowCallback=" + this.f89063e + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int floatToIntBits = ((Float.floatToIntBits(this.f89059a) * 31) + Float.floatToIntBits(this.f89060b)) * 31;
        String str = this.f89061c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (floatToIntBits + i) * 31;
        AbstractC89171a<C89391z> aVar = this.f89062d;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        AbstractC89171a<C89391z> aVar2 = this.f89063e;
        if (aVar2 != null) {
            i3 = aVar2.hashCode();
        }
        return i5 + i3;
    }

    public C37701a(String str, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f89061c = str;
        this.f89062d = aVar;
        this.f89063e = aVar2;
    }
}
