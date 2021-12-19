package com.p2082ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.TypeWords */
public final class TypeWords {
    public static final Companion Companion = new Companion(null);
    public boolean fromCache;
    public String imprId = "";
    public String logId;
    @AbstractC27891c(mo46611a = "source")
    public final String source;
    @AbstractC27891c(mo46611a = StringSet.type)
    public final String type;
    @AbstractC27891c(mo46611a = "params")
    public final TypeWordsParams typeWordsParams;
    @AbstractC27891c(mo46611a = "most_visit_users")
    public List<VisitedAccount> visitedAccount;
    @AbstractC27891c(mo46611a = "words")
    public List<Word> words;

    static {
        Covode.recordClassIndex(50545);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.TypeWords$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(50546);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final void setImprId(String str) {
        C89219l.m154721d(str, "");
        this.imprId = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeWords)) {
            return false;
        }
        if (C89361p.m154872a(this.source, "inbox", false)) {
            TypeWords typeWords = (TypeWords) obj;
            if (C89361p.m154872a(typeWords.source, "inbox", false)) {
                return C89219l.m154714a(this.words, typeWords.words);
            }
        }
        return super.equals(obj);
    }
}
