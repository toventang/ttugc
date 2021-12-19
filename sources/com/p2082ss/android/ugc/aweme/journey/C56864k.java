package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.k */
public final class C56864k {
    @AbstractC27891c(mo46611a = "content_languages")

    /* renamed from: a */
    public final List<C56862i> f129490a;
    @AbstractC27891c(mo46611a = "content_lang_dialog")

    /* renamed from: b */
    public final C56863j f129491b;

    static {
        Covode.recordClassIndex(66750);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56864k)) {
            return false;
        }
        C56864k kVar = (C56864k) obj;
        return C89219l.m154714a(this.f129490a, kVar.f129490a) && C89219l.m154714a(this.f129491b, kVar.f129491b);
    }

    public final int hashCode() {
        List<C56862i> list = this.f129490a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C56863j jVar = this.f129491b;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "JourneyContentLanguageWrapper(content_languages=" + this.f129490a + ", content_lang_dialog=" + this.f129491b + ")";
    }
}
