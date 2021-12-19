package com.bytedance.ies.p1208im.core.p1223d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.d.a */
public final class C17505a implements Serializable {
    @AbstractC27891c(mo46611a = "tips")

    /* renamed from: a */
    private final String f41896a;

    static {
        Covode.recordClassIndex(19994);
    }

    public static /* synthetic */ C17505a copy$default(C17505a aVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f41896a;
        }
        return aVar.copy(str);
    }

    public final String component1() {
        return this.f41896a;
    }

    public final C17505a copy(String str) {
        return new C17505a(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C17505a) && C89219l.m154714a(this.f41896a, ((C17505a) obj).f41896a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f41896a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CheckContent(tips=" + this.f41896a + ")";
    }

    public final String getTips() {
        return this.f41896a;
    }

    public C17505a(String str) {
        this.f41896a = str;
    }
}
