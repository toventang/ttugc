package com.p2082ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.a */
public final class C65504a {

    /* renamed from: a */
    public final boolean f147725a;

    /* renamed from: b */
    public final AbstractC89171a<float[]> f147726b;

    static {
        Covode.recordClassIndex(76991);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65504a)) {
            return false;
        }
        C65504a aVar = (C65504a) obj;
        return this.f147725a == aVar.f147725a && C89219l.m154714a(this.f147726b, aVar.f147726b);
    }

    public final int hashCode() {
        boolean z = this.f147725a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        AbstractC89171a<float[]> aVar = this.f147726b;
        return i4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "AnchorVieConfig(needAnimate=" + this.f147725a + ", getAnchorPosition=" + this.f147726b + ")";
    }

    public C65504a(boolean z, AbstractC89171a<float[]> aVar) {
        C89219l.m154721d(aVar, "");
        this.f147725a = z;
        this.f147726b = aVar;
    }
}
