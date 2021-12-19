package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.h */
public final class C72791h {

    /* renamed from: a */
    public final boolean f163224a;

    /* renamed from: b */
    public final AbstractC89171a<Boolean> f163225b;

    /* renamed from: c */
    public final boolean f163226c;

    /* renamed from: d */
    public final boolean f163227d;

    static {
        Covode.recordClassIndex(85477);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72791h)) {
            return false;
        }
        C72791h hVar = (C72791h) obj;
        return this.f163224a == hVar.f163224a && C89219l.m154714a(this.f163225b, hVar.f163225b) && this.f163226c == hVar.f163226c && this.f163227d == hVar.f163227d;
    }

    public final int hashCode() {
        boolean z = this.f163224a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        AbstractC89171a<Boolean> aVar = this.f163225b;
        int hashCode = (i5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z2 = this.f163226c;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (hashCode + i6) * 31;
        if (!this.f163227d) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        return "CameraDegradationConfig(enableRemoveCameraOpened=" + this.f163224a + ", forbidOpenCameraInBackground=" + this.f163225b + ", enableAudioCapture=" + this.f163226c + ", optimizeAntiShake=" + this.f163227d + ")";
    }

    public /* synthetic */ C72791h() {
        this(false, C727921.f163228a, false, false);
    }

    /* renamed from: a */
    public static /* synthetic */ C72791h m128376a(C72791h hVar, AbstractC89171a aVar) {
        boolean z = hVar.f163227d;
        C89219l.m154721d(aVar, "");
        return new C72791h(true, aVar, true, z);
    }

    private C72791h(boolean z, AbstractC89171a<Boolean> aVar, boolean z2, boolean z3) {
        C89219l.m154721d(aVar, "");
        this.f163224a = z;
        this.f163225b = aVar;
        this.f163226c = z2;
        this.f163227d = z3;
    }
}
