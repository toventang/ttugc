package com.p2082ss.android.ugc.aweme.emoji.emojichoose.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.model.EmojiResourcesResponse */
public class EmojiResourcesResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "resources")
    private List<C46515a> resources;

    static {
        Covode.recordClassIndex(55100);
    }

    public List<C46515a> getResources() {
        return this.resources;
    }

    public void setResources(List<C46515a> list) {
        this.resources = list;
    }
}
