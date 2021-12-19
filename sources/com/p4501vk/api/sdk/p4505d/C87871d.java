package com.p4501vk.api.sdk.p4505d;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.vk.api.sdk.d.d */
public final class C87871d {

    /* renamed from: a */
    public final String f199591a;

    /* renamed from: b */
    public final String f199592b;

    /* renamed from: c */
    public final Map<String, String> f199593c;

    /* renamed from: d */
    public final C87873e f199594d;

    static {
        Covode.recordClassIndex(103881);
    }

    /* renamed from: com.vk.api.sdk.d.d$a */
    public static class C87872a {

        /* renamed from: a */
        public String f199595a = "";

        /* renamed from: b */
        public String f199596b = "";

        /* renamed from: c */
        public Map<String, String> f199597c = new HashMap();

        /* renamed from: d */
        public C87873e f199598d;

        static {
            Covode.recordClassIndex(103882);
        }

        /* renamed from: a */
        public final C87871d mo142350a() {
            return new C87871d(this);
        }

        /* renamed from: a */
        public final String mo142351a(String str) {
            C89219l.m154719c(str, "");
            return this.f199597c.get(str);
        }

        /* renamed from: a */
        public final C87872a mo142349a(String str, String str2) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            this.f199597c.put(str, str2);
            return this;
        }
    }

    protected C87871d(C87872a aVar) {
        C89219l.m154719c(aVar, "");
        if (C89361p.m154870a((CharSequence) aVar.f199595a)) {
            throw new IllegalArgumentException("method is null or empty");
        } else if (!C89361p.m154870a((CharSequence) aVar.f199596b)) {
            this.f199591a = aVar.f199595a;
            this.f199592b = aVar.f199596b;
            this.f199593c = aVar.f199597c;
            this.f199594d = aVar.f199598d;
        } else {
            throw new IllegalArgumentException("version is null or empty");
        }
    }
}
