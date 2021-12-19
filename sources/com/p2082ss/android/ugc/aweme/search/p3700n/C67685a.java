package com.p2082ss.android.ugc.aweme.search.p3700n;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.n.a */
public final class C67685a {

    /* renamed from: a */
    public String f151706a;

    /* renamed from: b */
    public String f151707b;

    static {
        Covode.recordClassIndex(79330);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67685a)) {
            return false;
        }
        C67685a aVar = (C67685a) obj;
        return C89219l.m154714a(this.f151706a, aVar.f151706a) && C89219l.m154714a(this.f151707b, aVar.f151707b);
    }

    public final int hashCode() {
        String str = this.f151706a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f151707b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SearchContainerData(searchId=" + this.f151706a + ", searchKey=" + this.f151707b + ")";
    }

    public /* synthetic */ C67685a() {
        this("", "");
    }

    /* renamed from: a */
    public final void mo106782a(String str) {
        C89219l.m154721d(str, "");
        this.f151706a = str;
    }

    /* renamed from: b */
    public final void mo106783b(String str) {
        C89219l.m154721d(str, "");
        this.f151707b = str;
    }

    public C67685a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f151706a = str;
        this.f151707b = str2;
    }
}
