package com.p2082ss.android.ugc.aweme.geofencing.p3047c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.geofencing.c.a */
public final class C52891a implements Serializable {
    @AbstractC27891c(mo46611a = "string_code")

    /* renamed from: a */
    private final String f121659a;
    @AbstractC27891c(mo46611a = "translation")

    /* renamed from: b */
    private final String f121660b;

    /* renamed from: c */
    private boolean f121661c;

    static {
        Covode.recordClassIndex(62296);
    }

    public static /* synthetic */ C52891a copy$default(C52891a aVar, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f121659a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f121660b;
        }
        if ((i & 4) != 0) {
            z = aVar.f121661c;
        }
        return aVar.copy(str, str2, z);
    }

    public final String component1() {
        return this.f121659a;
    }

    public final String component2() {
        return this.f121660b;
    }

    public final boolean component3() {
        return this.f121661c;
    }

    public final C52891a copy(String str, String str2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new C52891a(str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52891a)) {
            return false;
        }
        C52891a aVar = (C52891a) obj;
        return C89219l.m154714a(this.f121659a, aVar.f121659a) && C89219l.m154714a(this.f121660b, aVar.f121660b) && this.f121661c == aVar.f121661c;
    }

    public final int hashCode() {
        String str = this.f121659a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f121660b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f121661c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "TranslatedRegion(code=" + this.f121659a + ", translation=" + this.f121660b + ", selected=" + this.f121661c + ")";
    }

    public final String getCode() {
        return this.f121659a;
    }

    public final boolean getSelected() {
        return this.f121661c;
    }

    public final String getTranslation() {
        return this.f121660b;
    }

    public final void setSelected(boolean z) {
        this.f121661c = z;
    }

    public C52891a(String str, String str2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f121659a = str;
        this.f121660b = str2;
        this.f121661c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C52891a(String str, String str2, boolean z, int i, C89214g gVar) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
