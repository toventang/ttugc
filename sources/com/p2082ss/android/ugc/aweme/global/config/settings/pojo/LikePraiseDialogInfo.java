package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LikePraiseDialogInfo */
public class LikePraiseDialogInfo {
    @AbstractC27891c(mo46611a = "new_like_num")
    private Integer newLikeNum;
    @AbstractC27891c(mo46611a = "two_dialog_interval")
    private Integer twoDialogInterval;

    static {
        Covode.recordClassIndex(62369);
    }

    public Integer getNewLikeNum() {
        Integer num = this.newLikeNum;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getTwoDialogInterval() {
        Integer num = this.twoDialogInterval;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
