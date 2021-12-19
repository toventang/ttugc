package com.bytedance.ies.p1208im.core.api.p1216f;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.api.f.d */
public final class C17458d implements Serializable {
    @AbstractC27891c(mo46611a = "is_active_x")

    /* renamed from: a */
    private final boolean f41808a;
    @AbstractC27891c(mo46611a = "im_token")

    /* renamed from: b */
    private final String f41809b;

    static {
        Covode.recordClassIndex(19945);
    }

    public C17458d() {
        this(false, null, 3, null);
    }

    public static /* synthetic */ C17458d copy$default(C17458d dVar, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dVar.f41808a;
        }
        if ((i & 2) != 0) {
            str = dVar.f41809b;
        }
        return dVar.copy(z, str);
    }

    public final boolean component1() {
        return this.f41808a;
    }

    public final String component2() {
        return this.f41809b;
    }

    public final C17458d copy(boolean z, String str) {
        return new C17458d(z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17458d)) {
            return false;
        }
        C17458d dVar = (C17458d) obj;
        return this.f41808a == dVar.f41808a && C89219l.m154714a(this.f41809b, dVar.f41809b);
    }

    public final int hashCode() {
        boolean z = this.f41808a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f41809b;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RebootMiscModel(isActiveX=" + this.f41808a + ", imToken=" + this.f41809b + ")";
    }

    public final String getImToken() {
        return this.f41809b;
    }

    public final boolean isActiveX() {
        return this.f41808a;
    }

    public C17458d(boolean z, String str) {
        this.f41808a = z;
        this.f41809b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17458d(boolean z, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }
}
