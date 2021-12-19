package com.p2082ss.android.ugc.aweme.sticker.p3947a.p3948a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.a.a.a */
public final class C75249a {
    @AbstractC27891c(mo46611a = "needUpzip")

    /* renamed from: a */
    public int f169190a;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: b */
    public List<String> f169191b;

    static {
        Covode.recordClassIndex(88151);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75249a)) {
            return false;
        }
        C75249a aVar = (C75249a) obj;
        return this.f169190a == aVar.f169190a && C89219l.m154714a(this.f169191b, aVar.f169191b);
    }

    public final int hashCode() {
        int i = this.f169190a * 31;
        List<String> list = this.f169191b;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DownloadRequest(needUpzip=" + this.f169190a + ", url=" + this.f169191b + ")";
    }
}
