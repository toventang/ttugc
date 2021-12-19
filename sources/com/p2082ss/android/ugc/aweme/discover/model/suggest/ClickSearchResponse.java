package com.p2082ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.ClickSearchResponse */
public final class ClickSearchResponse {
    @AbstractC27891c(mo46611a = "log_pb")
    public final LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = "sug_word_list")
    public final List<ClickSearchWord> wordsList;

    static {
        Covode.recordClassIndex(50540);
    }

    public ClickSearchResponse() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.model.suggest.ClickSearchResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClickSearchResponse copy$default(ClickSearchResponse clickSearchResponse, List list, LogPbBean logPbBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = clickSearchResponse.wordsList;
        }
        if ((i & 2) != 0) {
            logPbBean2 = clickSearchResponse.logPbBean;
        }
        return clickSearchResponse.copy(list, logPbBean2);
    }

    public final ClickSearchResponse copy(List<ClickSearchWord> list, LogPbBean logPbBean2) {
        return new ClickSearchResponse(list, logPbBean2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickSearchResponse)) {
            return false;
        }
        ClickSearchResponse clickSearchResponse = (ClickSearchResponse) obj;
        return C89219l.m154714a(this.wordsList, clickSearchResponse.wordsList) && C89219l.m154714a(this.logPbBean, clickSearchResponse.logPbBean);
    }

    public final int hashCode() {
        List<ClickSearchWord> list = this.wordsList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        LogPbBean logPbBean2 = this.logPbBean;
        if (logPbBean2 != null) {
            i = logPbBean2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ClickSearchResponse(wordsList=" + this.wordsList + ", logPbBean=" + this.logPbBean + ")";
    }

    public ClickSearchResponse(List<ClickSearchWord> list, LogPbBean logPbBean2) {
        this.wordsList = list;
        this.logPbBean = logPbBean2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClickSearchResponse(List list, LogPbBean logPbBean2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : logPbBean2);
    }
}
