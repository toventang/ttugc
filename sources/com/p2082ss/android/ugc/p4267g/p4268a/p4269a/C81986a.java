package com.p2082ss.android.ugc.p4267g.p4268a.p4269a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4267g.p4268a.EnumC81991b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.g.a.a.a */
public final class C81986a {

    /* renamed from: a */
    public final boolean f183467a;

    /* renamed from: b */
    public final EnumC81991b f183468b;

    static {
        Covode.recordClassIndex(95801);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C81986a) {
                C81986a aVar = (C81986a) obj;
                if (this.f183467a != aVar.f183467a || !C89219l.m154714a(this.f183468b, aVar.f183468b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f183467a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        EnumC81991b bVar = this.f183468b;
        return i4 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "DetectResult(needNextStep=" + this.f183467a + ", state=" + this.f183468b + ")";
    }

    public C81986a(boolean z, EnumC81991b bVar) {
        C89219l.m154719c(bVar, "");
        this.f183467a = z;
        this.f183468b = bVar;
    }
}
