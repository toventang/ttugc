package com.p2082ss.android.ugc.aweme.mediachoose;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.g */
public interface AbstractC59180g {
    static {
        Covode.recordClassIndex(69538);
    }

    /* renamed from: a */
    void mo96648a();

    /* renamed from: a */
    void mo96649a(MediaModel mediaModel, long j, long j2, AbstractC89172b<? super C59179f, C89391z> bVar, AbstractC89172b<? super C59179f, C89391z> bVar2);

    /* renamed from: a */
    void mo96650a(String str);

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.g$a */
    public static final class C59181a {
        static {
            Covode.recordClassIndex(69539);
        }

        /* renamed from: a */
        public static String m108676a(String str) {
            Integer valueOf;
            if (str == null || (valueOf = Integer.valueOf(C89361p.m154909b((CharSequence) str, '.'))) == null || valueOf.intValue() == -1) {
                return "empty_file_suffix";
            }
            int intValue = valueOf.intValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(intValue);
            C89219l.m154716b(substring, "");
            return substring;
        }
    }
}
