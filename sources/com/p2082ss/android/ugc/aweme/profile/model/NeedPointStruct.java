package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.NeedPointStruct */
public final class NeedPointStruct implements Serializable {
    @AbstractC27891c(mo46611a = "point_type")
    private int pointType;
    @AbstractC27891c(mo46611a = "time_stamp")
    private long timeStamp;

    static {
        Covode.recordClassIndex(75191);
    }

    public final int getPointType() {
        return this.pointType;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setPointType(int i) {
        this.pointType = i;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }
}
