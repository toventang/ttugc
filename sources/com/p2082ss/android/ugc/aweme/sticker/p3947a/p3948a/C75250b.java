package com.p2082ss.android.ugc.aweme.sticker.p3947a.p3948a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.a.a.b */
public final class C75250b {
    @AbstractC27891c(mo46611a = "path")

    /* renamed from: a */
    public String f169192a;
    @AbstractC27891c(mo46611a = "success")

    /* renamed from: b */
    public int f169193b;

    static {
        Covode.recordClassIndex(88152);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75250b)) {
            return false;
        }
        C75250b bVar = (C75250b) obj;
        return C89219l.m154714a(this.f169192a, bVar.f169192a) && this.f169193b == bVar.f169193b;
    }

    public final int hashCode() {
        String str = this.f169192a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f169193b;
    }

    public final String toString() {
        return "DownloadResult(path=" + this.f169192a + ", success=" + this.f169193b + ")";
    }

    public C75250b(String str, int i) {
        C89219l.m154721d(str, "");
        this.f169192a = str;
        this.f169193b = i;
    }
}
