package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Layout */
public final class Layout implements Serializable {
    @AbstractC27891c(mo46611a = "height")
    private int height = -1;
    @AbstractC27891c(mo46611a = "width")
    private int width = -1;

    static {
        Covode.recordClassIndex(50463);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
