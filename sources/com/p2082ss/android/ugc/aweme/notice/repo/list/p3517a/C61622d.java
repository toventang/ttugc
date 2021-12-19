package com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.a.d */
public final class C61622d {
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: a */
    public final String f139857a;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: b */
    public final Integer f139858b;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: c */
    public final String f139859c;
    @AbstractC27891c(mo46611a = "actions")

    /* renamed from: d */
    public final List<Integer> f139860d;

    static {
        Covode.recordClassIndex(72318);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61622d)) {
            return false;
        }
        C61622d dVar = (C61622d) obj;
        return C89219l.m154714a(this.f139857a, dVar.f139857a) && C89219l.m154714a(this.f139858b, dVar.f139858b) && C89219l.m154714a(this.f139859c, dVar.f139859c) && C89219l.m154714a(this.f139860d, dVar.f139860d);
    }

    public final int hashCode() {
        String str = this.f139857a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f139858b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f139859c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Integer> list = this.f139860d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "NoticeUITemplateButton(content=" + this.f139857a + ", type=" + this.f139858b + ", schemaUrl=" + this.f139859c + ", actions=" + this.f139860d + ")";
    }
}
