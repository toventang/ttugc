package com.p2082ss.android.ugc.aweme.journey.step.p3294c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.journey.C56862i;
import com.p2082ss.android.ugc.aweme.journey.C56863j;
import com.p2082ss.android.ugc.aweme.journey.C56864k;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.c.e */
public final class C56914e {

    /* renamed from: c */
    public static final C56915a f129617c = new C56915a((byte) 0);

    /* renamed from: a */
    public final List<C56862i> f129618a;

    /* renamed from: b */
    public final C56863j f129619b;

    static {
        Covode.recordClassIndex(66801);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56914e)) {
            return false;
        }
        C56914e eVar = (C56914e) obj;
        return C89219l.m154714a(this.f129618a, eVar.f129618a) && C89219l.m154714a(this.f129619b, eVar.f129619b);
    }

    public final int hashCode() {
        List<C56862i> list = this.f129618a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C56863j jVar = this.f129619b;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ValidatedContentLanguageData(contentLanguages=" + this.f129618a + ", contentLanguagesDialog=" + this.f129619b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.c.e$a */
    public static final class C56915a {
        static {
            Covode.recordClassIndex(66802);
        }

        private C56915a() {
        }

        public /* synthetic */ C56915a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C56914e m103233a(C56864k kVar) {
            C89219l.m154721d(kVar, "");
            List<C56862i> list = kVar.f129490a;
            C56863j jVar = kVar.f129491b;
            if (list == null || jVar == null) {
                return null;
            }
            return new C56914e(list, jVar);
        }
    }

    public C56914e(List<C56862i> list, C56863j jVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(jVar, "");
        this.f129618a = list;
        this.f129619b = jVar;
    }
}
