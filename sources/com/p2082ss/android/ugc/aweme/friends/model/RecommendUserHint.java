package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.friends.model.RecommendUserHint */
public final class RecommendUserHint extends User {
    private int recDialogType;

    static {
        Covode.recordClassIndex(60918);
    }

    public final int getRecDialogType() {
        return this.recDialogType;
    }

    public final void setRecDialogType(int i) {
        this.recDialogType = i;
    }
}
