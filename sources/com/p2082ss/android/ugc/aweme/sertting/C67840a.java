package com.p2082ss.android.ugc.aweme.sertting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sertting.a */
public final class C67840a {
    @AbstractC27891c(mo46611a = "url_regex")

    /* renamed from: a */
    public final String f152037a;
    @AbstractC27891c(mo46611a = "url_config")

    /* renamed from: b */
    public final List<PersonalizationModel> f152038b;

    static {
        Covode.recordClassIndex(79505);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67840a)) {
            return false;
        }
        C67840a aVar = (C67840a) obj;
        return C89219l.m154714a(this.f152037a, aVar.f152037a) && C89219l.m154714a(this.f152038b, aVar.f152038b);
    }

    public final int hashCode() {
        String str = this.f152037a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<PersonalizationModel> list = this.f152038b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DeeplinkPersonalizationConfig(urlRegex=" + this.f152037a + ", urlConfig=" + this.f152038b + ")";
    }

    private /* synthetic */ C67840a() {
        this("", new ArrayList());
    }

    private C67840a(String str, List<PersonalizationModel> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.f152037a = str;
        this.f152038b = list;
    }
}
