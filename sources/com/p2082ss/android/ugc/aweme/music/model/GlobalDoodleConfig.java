package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.GlobalDoodleConfig */
public final class GlobalDoodleConfig implements Serializable {
    @AbstractC27891c(mo46611a = "display_filter_bar")
    private int displayFilterBar = 1;

    static {
        Covode.recordClassIndex(71396);
    }

    public final int getDisplayFilterBar() {
        return this.displayFilterBar;
    }

    public final void setDisplayFilterBar(int i) {
        this.displayFilterBar = i;
    }
}
