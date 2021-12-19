package com.bytedance.lynx.hybrid.resource.p1528d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.d.a */
public final class C21290a {

    /* renamed from: a */
    public String f50535a;

    /* renamed from: b */
    public String f50536b;

    /* renamed from: c */
    public boolean f50537c;

    static {
        Covode.recordClassIndex(24908);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21290a)) {
            return false;
        }
        C21290a aVar = (C21290a) obj;
        return C89219l.m154714a(this.f50535a, aVar.f50535a) && C89219l.m154714a(this.f50536b, aVar.f50536b) && this.f50537c == aVar.f50537c;
    }

    public final int hashCode() {
        String str = this.f50535a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f50536b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f50537c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "ChannelBundleModel(channel=" + this.f50535a + ", bundlePath=" + this.f50536b + ", valid=" + this.f50537c + ")";
    }

    /* renamed from: a */
    public final String mo34894a() {
        if (this.f50537c) {
            return this.f50535a;
        }
        return null;
    }

    /* renamed from: b */
    public final String mo34895b() {
        if (this.f50537c) {
            return this.f50536b;
        }
        return null;
    }

    public C21290a(String str, String str2, boolean z) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f50535a = str;
        this.f50536b = str2;
        this.f50537c = z;
    }
}
