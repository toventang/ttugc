package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

public class FeedRoomLabel implements Serializable {
    @AbstractC27891c(mo46611a = "icon")
    public ImageModel icon;
    @AbstractC27891c(mo46611a = "position")
    public long location;
    @AbstractC27891c(mo46611a = "log_extra")
    public String logExtra;
    @AbstractC27891c(mo46611a = "text")
    public C9698b text;

    static {
        Covode.recordClassIndex(13366);
    }
}
