package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.am */
public final class C35893am implements Serializable {
    @AbstractC27891c(mo46611a = "query_id")

    /* renamed from: a */
    private String f84710a;
    @AbstractC27891c(mo46611a = "words_source")

    /* renamed from: b */
    private String f84711b;
    @AbstractC27891c(mo46611a = "info")

    /* renamed from: c */
    private String f84712c;

    static {
        Covode.recordClassIndex(43133);
    }

    public final String getInfo() {
        return this.f84712c;
    }

    public final String getQueryId() {
        return this.f84710a;
    }

    public final String getWordsSource() {
        return this.f84711b;
    }

    public final void setInfo(String str) {
        this.f84712c = str;
    }

    public final void setQueryId(String str) {
        this.f84710a = str;
    }

    public final void setWordsSource(String str) {
        this.f84711b = str;
    }
}
