package com.p2082ss.android.ugc.aweme.discover.model.suicide;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.SearchOperation;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suicide.SearchSuicideInfo */
public final class SearchSuicideInfo {
    public static final Companion Companion = new Companion(null);
    public Aweme aweme;
    public GlobalDoodleConfig globalDoodleConfig;
    public PleaseNotice pleaseNotice;
    public SearchDialInfo searchDialInfo;
    public SearchOperation searchOperation;
    public int type = -1;

    static {
        Covode.recordClassIndex(50553);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.suicide.SearchSuicideInfo$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(50554);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }
}
