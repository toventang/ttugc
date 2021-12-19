package com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.a.a */
public final class C61619a {
    @AbstractC27891c(mo46611a = "action_type")

    /* renamed from: a */
    public final int f139831a;
    @AbstractC27891c(mo46611a = "view_type")

    /* renamed from: b */
    public final int f139832b;
    @AbstractC27891c(mo46611a = "text_content")

    /* renamed from: c */
    public final String f139833c;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: d */
    public final String f139834d;

    static {
        Covode.recordClassIndex(72315);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61619a)) {
            return false;
        }
        C61619a aVar = (C61619a) obj;
        return this.f139831a == aVar.f139831a && this.f139832b == aVar.f139832b && C89219l.m154714a(this.f139833c, aVar.f139833c) && C89219l.m154714a(this.f139834d, aVar.f139834d);
    }

    public final int hashCode() {
        int i = ((this.f139831a * 31) + this.f139832b) * 31;
        String str = this.f139833c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f139834d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ExtraActionTemplate(actionType=" + this.f139831a + ", viewType=" + this.f139832b + ", content=" + this.f139833c + ", schema=" + this.f139834d + ")";
    }
}
