package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.C25068b;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.g */
public final class C25156g {

    /* renamed from: a */
    public final C25068b f59599a;

    /* renamed from: b */
    public final byte[] f59600b;

    static {
        Covode.recordClassIndex(30522);
    }

    public final int hashCode() {
        return ((this.f59599a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f59600b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f59599a + ", bytes=[...]}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25156g)) {
            return false;
        }
        C25156g gVar = (C25156g) obj;
        if (!this.f59599a.equals(gVar.f59599a)) {
            return false;
        }
        return Arrays.equals(this.f59600b, gVar.f59600b);
    }

    public C25156g(C25068b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f59599a = bVar;
        this.f59600b = bArr;
    }
}
