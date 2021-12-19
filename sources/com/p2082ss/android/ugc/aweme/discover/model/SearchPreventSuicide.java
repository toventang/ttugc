package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.model.suicide.PleaseNotice;
import com.p2082ss.android.ugc.aweme.discover.model.suicide.Tools;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchPreventSuicide */
public final class SearchPreventSuicide implements AbstractC81914b {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "notices")
    public PleaseNotice pleaseNotice;
    @AbstractC27891c(mo46611a = "top_banner")
    public SearchOperation searchOperation;
    @AbstractC27891c(mo46611a = "show_results_type")
    public String showResultsType;
    @AbstractC27891c(mo46611a = "tools")
    public Tools tools;

    static {
        Covode.recordClassIndex(50511);
    }

    public final AbstractC81914b post() {
        return AbstractC81915c.m141874a(this);
    }

    public final AbstractC81914b postSticky() {
        return AbstractC81915c.m141875b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.SearchPreventSuicide$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(50512);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }
}
