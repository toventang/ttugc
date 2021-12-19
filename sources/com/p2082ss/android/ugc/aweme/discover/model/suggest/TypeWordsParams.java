package com.p2082ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.TypeWordsParams */
public final class TypeWordsParams implements Serializable {
    @AbstractC27891c(mo46611a = "channel_id")
    private String channelId;

    static {
        Covode.recordClassIndex(50547);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final void setChannelId(String str) {
        this.channelId = str;
    }
}
