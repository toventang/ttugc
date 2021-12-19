package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ActionContent */
public final class ActionContent extends BaseContent {
    @AbstractC27891c(mo46611a = "event")
    private String event = "click";
    @AbstractC27891c(mo46611a = "menu_key")
    private String menuKey;

    static {
        Covode.recordClassIndex(63416);
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getMenuKey() {
        return this.menuKey;
    }

    public final void setEvent(String str) {
        this.event = str;
    }

    public final void setMenuKey(String str) {
        this.menuKey = str;
    }
}
