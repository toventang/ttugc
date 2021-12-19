package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FollowTabGuideStruct */
public class FollowTabGuideStruct {
    @AbstractC27891c(mo46611a = "follow_tab_guide_times")
    private Integer followTabGuideTimes;
    @AbstractC27891c(mo46611a = "follow_tab_guide_word")
    private String followTabGuideWord;

    static {
        Covode.recordClassIndex(62354);
    }

    public Integer getFollowTabGuideTimes() {
        Integer num = this.followTabGuideTimes;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getFollowTabGuideWord() {
        String str = this.followTabGuideWord;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
