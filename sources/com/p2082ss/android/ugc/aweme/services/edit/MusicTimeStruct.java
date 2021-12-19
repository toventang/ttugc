package com.p2082ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.services.edit.MusicTimeStruct */
public final class MusicTimeStruct {
    @AbstractC27891c(mo46611a = "end_time_in_ms")
    private long endTime;
    @AbstractC27891c(mo46611a = "start_time_in_ms")
    private long startTime;

    static {
        Covode.recordClassIndex(79770);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }
}
