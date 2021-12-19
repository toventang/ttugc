package com.bytedance.geckox.statistic.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class EventMessageModel {
    @AbstractC27891c(mo46611a = "duration")
    private long duration;
    @AbstractC27891c(mo46611a = "err_msg")
    private String errMsg;
    @AbstractC27891c(mo46611a = "event_type")
    private int eventType;
    @AbstractC27891c(mo46611a = "extra")
    private String extra;
    @AbstractC27891c(mo46611a = "sub_type")
    private int subType;

    static {
        Covode.recordClassIndex(17202);
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setEventType(int i) {
        this.eventType = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public EventMessageModel(int i, int i2) {
        this.eventType = i;
        this.subType = i2;
    }
}
