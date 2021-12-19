package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Position */
public class Position implements Serializable {
    @AbstractC27891c(mo46611a = "begin")
    public int begin;
    @AbstractC27891c(mo46611a = "end")
    public int end;

    static {
        Covode.recordClassIndex(50472);
    }

    public Position() {
    }

    public int getBegin() {
        return this.begin;
    }

    public int getEnd() {
        return this.end;
    }

    public void setBegin(int i) {
        this.begin = i;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public Position(int i, int i2) {
        setBegin(i);
        setEnd(i2);
    }
}
