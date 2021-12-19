package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.TagBAUser */
public final class TagBAUser implements Serializable {
    @AbstractC27891c(mo46611a = "handle_name")
    private final String handleName;
    @AbstractC27891c(mo46611a = "uid")
    private final String uid;

    static {
        Covode.recordClassIndex(75212);
    }

    public final String getHandleName() {
        return this.handleName;
    }

    public final String getUid() {
        return this.uid;
    }
}
