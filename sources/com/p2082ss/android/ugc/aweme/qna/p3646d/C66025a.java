package com.p2082ss.android.ugc.aweme.qna.p3646d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.d.a */
public final class C66025a {
    @AbstractC27891c(mo46611a = "translation_info")

    /* renamed from: a */
    public final List<C66057k> f148640a;
    @AbstractC27891c(mo46611a = "trg_lang")

    /* renamed from: b */
    public final String f148641b;

    static {
        Covode.recordClassIndex(77531);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66025a)) {
            return false;
        }
        C66025a aVar = (C66025a) obj;
        return C89219l.m154714a(this.f148640a, aVar.f148640a) && C89219l.m154714a(this.f148641b, aVar.f148641b);
    }

    public final int hashCode() {
        List<C66057k> list = this.f148640a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f148641b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MultiTranslationBody(translationInfos=" + this.f148640a + ", trgLang=" + this.f148641b + ")";
    }

    public C66025a(List<C66057k> list, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        this.f148640a = list;
        this.f148641b = str;
    }
}
