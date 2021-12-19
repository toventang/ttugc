package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.model.AgeGateInfo */
public final class AgeGateInfo implements Serializable {
    @AbstractC27891c(mo46611a = "content")
    private final String content;
    @AbstractC27891c(mo46611a = "option_list")
    private final List<AgeGateOption> optionList;
    @AbstractC27891c(mo46611a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(75149);
    }

    public final String getContent() {
        return this.content;
    }

    public final List<AgeGateOption> getOptionList() {
        return this.optionList;
    }

    public final String getTitle() {
        return this.title;
    }
}
