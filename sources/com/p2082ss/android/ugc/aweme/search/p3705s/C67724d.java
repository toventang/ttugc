package com.p2082ss.android.ugc.aweme.search.p3705s;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.s.d */
public final class C67724d {

    /* renamed from: a */
    public static final C67724d f151786a = new C67724d();

    private C67724d() {
    }

    static {
        Covode.recordClassIndex(79369);
    }

    /* renamed from: a */
    public static int m119891a(Word word) {
        C89219l.m154721d(word, "");
        String wordType = word.getWordType();
        if (wordType == null) {
            return -1;
        }
        int hashCode = wordType.hashCode();
        if (hashCode != 50) {
            if (hashCode != 54) {
                if (hashCode == 1567 && wordType.equals("10")) {
                    return 2131233667;
                }
                return -1;
            } else if (wordType.equals("6")) {
                return 2131233668;
            } else {
                return -1;
            }
        } else if (wordType.equals("2")) {
            return 2131233666;
        } else {
            return -1;
        }
    }
}
