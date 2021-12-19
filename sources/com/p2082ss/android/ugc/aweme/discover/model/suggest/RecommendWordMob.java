package com.p2082ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob */
public final class RecommendWordMob implements Serializable {
    @AbstractC27891c(mo46611a = "info")
    private String info;
    @AbstractC27891c(mo46611a = "query_id")
    private String queryId;
    @AbstractC27891c(mo46611a = "words_source")
    private String wordsSource;

    static {
        Covode.recordClassIndex(50542);
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final String getWordsSource() {
        return this.wordsSource;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public final void setQueryId(String str) {
        this.queryId = str;
    }

    public final void setWordsSource(String str) {
        this.wordsSource = str;
    }
}
