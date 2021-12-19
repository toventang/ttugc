package com.bytedance.android.livesdk.gift.p548d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.gift.d.i */
public final class C8805i {

    /* renamed from: a */
    public final boolean f21685a = true;

    /* renamed from: b */
    public final String f21686b;

    static {
        Covode.recordClassIndex(9683);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8805i)) {
            return false;
        }
        C8805i iVar = (C8805i) obj;
        return this.f21685a == iVar.f21685a && C89219l.m154714a(this.f21686b, iVar.f21686b);
    }

    public final int hashCode() {
        boolean z = this.f21685a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f21686b;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SendEnvelope(send=" + this.f21685a + ", source=" + this.f21686b + ")";
    }

    public C8805i(String str) {
        C89219l.m154721d(str, "");
        this.f21686b = str;
    }
}
