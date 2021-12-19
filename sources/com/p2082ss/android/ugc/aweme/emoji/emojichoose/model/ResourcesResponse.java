package com.p2082ss.android.ugc.aweme.emoji.emojichoose.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse */
public class ResourcesResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "resources")
    List<C46516b> resources;

    static {
        Covode.recordClassIndex(55101);
    }

    public List<C46516b> getResources() {
        return this.resources;
    }

    public void setResources(List<C46516b> list) {
        this.resources = list;
    }
}
