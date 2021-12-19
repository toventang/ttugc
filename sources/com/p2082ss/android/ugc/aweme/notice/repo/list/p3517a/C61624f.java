package com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.a.f */
public final class C61624f {
    @AbstractC27891c(mo46611a = "from_users")

    /* renamed from: a */
    public final List<User> f139866a;
    @AbstractC27891c(mo46611a = "merge_count")

    /* renamed from: b */
    public final int f139867b;
    @AbstractC27891c(mo46611a = "extra_schema_url")

    /* renamed from: c */
    public final String f139868c;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: d */
    public final String f139869d;
    @AbstractC27891c(mo46611a = "title_append_info")

    /* renamed from: e */
    public final C61619a f139870e;

    static {
        Covode.recordClassIndex(72320);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61624f)) {
            return false;
        }
        C61624f fVar = (C61624f) obj;
        return C89219l.m154714a(this.f139866a, fVar.f139866a) && this.f139867b == fVar.f139867b && C89219l.m154714a(this.f139868c, fVar.f139868c) && C89219l.m154714a(this.f139869d, fVar.f139869d) && C89219l.m154714a(this.f139870e, fVar.f139870e);
    }

    public final int hashCode() {
        List<User> list = this.f139866a;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f139867b) * 31;
        String str = this.f139868c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f139869d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C61619a aVar = this.f139870e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "TitleTemplate(fromUsers=" + this.f139866a + ", mergeCount=" + this.f139867b + ", extraSchemaUrl=" + this.f139868c + ", title=" + this.f139869d + ", extraAction=" + this.f139870e + ")";
    }
}
