package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileTabGuide */
public class UgProfileTabGuide {
    @AbstractC27891c(mo46611a = "bubble")
    private UgBubble bubble;

    static {
        Covode.recordClassIndex(62414);
    }

    public UgBubble getBubble() {
        UgBubble ugBubble = this.bubble;
        if (ugBubble != null) {
            return ugBubble;
        }
        throw new C16041a();
    }
}
