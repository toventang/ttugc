package com.bytedance.android.live.broadcast.api.blockword.model;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class BlockWordGetExtra extends Extra {
    @AbstractC27891c(mo46611a = "max_count")
    public long maxCount = 50;
    @AbstractC27891c(mo46611a = "max_length")
    public long maxLength = 30;

    static {
        Covode.recordClassIndex(3520);
    }
}
