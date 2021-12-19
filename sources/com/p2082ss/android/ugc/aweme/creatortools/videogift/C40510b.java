package com.p2082ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.b */
public final class C40510b {
    @AbstractC27891c(mo46611a = "uri")

    /* renamed from: a */
    public final String f94778a;
    @AbstractC27891c(mo46611a = "url_list")

    /* renamed from: b */
    public final List<String> f94779b;

    static {
        Covode.recordClassIndex(48322);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40510b)) {
            return false;
        }
        C40510b bVar = (C40510b) obj;
        return C89219l.m154714a(this.f94778a, bVar.f94778a) && C89219l.m154714a(this.f94779b, bVar.f94779b);
    }

    public final int hashCode() {
        String str = this.f94778a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f94779b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Image(uri=" + this.f94778a + ", urlList=" + this.f94779b + ")";
    }
}
