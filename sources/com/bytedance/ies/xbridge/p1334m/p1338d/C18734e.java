package com.bytedance.ies.xbridge.p1334m.p1338d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.m.d.e */
public final class C18734e {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final String f44518a;
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: b */
    public final String f44519b;

    static {
        Covode.recordClassIndex(21428);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18734e)) {
            return false;
        }
        C18734e eVar = (C18734e) obj;
        return C89219l.m154714a(this.f44518a, eVar.f44518a) && C89219l.m154714a(this.f44519b, eVar.f44519b);
    }

    public final int hashCode() {
        String str = this.f44518a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f44519b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "StorageValue(type=" + this.f44518a + ", value=" + this.f44519b + ")";
    }

    public C18734e(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f44518a = str;
        this.f44519b = str2;
    }
}
