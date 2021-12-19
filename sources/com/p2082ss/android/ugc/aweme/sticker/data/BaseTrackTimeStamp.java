package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp */
public class BaseTrackTimeStamp implements Serializable {
    @AbstractC27891c(mo46611a = "p")
    private int pts = -1;

    static {
        Covode.recordClassIndex(88205);
    }

    public int getPts() {
        return this.pts;
    }

    public BaseTrackTimeStamp() {
    }

    public boolean isFullTrack() {
        if (-1 == this.pts) {
            return true;
        }
        return false;
    }

    public void setPts(int i) {
        this.pts = i;
    }

    public BaseTrackTimeStamp(int i) {
        this.pts = i;
    }
}
