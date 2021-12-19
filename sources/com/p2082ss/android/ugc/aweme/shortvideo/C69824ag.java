package com.p2082ss.android.ugc.aweme.shortvideo;

import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ag */
public final class C69824ag {

    /* renamed from: a */
    static final Set<String> f156045a = new LinkedHashSet();

    /* renamed from: b */
    public static final C69824ag f156046b = new C69824ag();

    private C69824ag() {
    }

    static {
        Covode.recordClassIndex(82230);
    }

    /* renamed from: a */
    public static final void m123390a(String str) {
        C89219l.m154721d(str, "");
        f156045a.remove(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ag$a */
    static final class C69825a<I, O> implements AbstractC0189a {

        /* renamed from: a */
        final /* synthetic */ Set f156047a;

        static {
            Covode.recordClassIndex(82231);
        }

        C69825a(Set set) {
            this.f156047a = set;
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            File file = (File) obj;
            Set set = this.f156047a;
            C89219l.m154716b(file, "");
            return Boolean.valueOf(!set.contains(file.getPath()));
        }
    }
}
