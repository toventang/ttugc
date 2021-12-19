package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.UserProfileInitInfo */
public class UserProfileInitInfo implements Serializable {
    @AbstractC27891c(mo46611a = "head_model_score")
    public double headModelScore;

    static {
        Covode.recordClassIndex(58767);
    }

    public double getHeadModelScore() {
        return this.headModelScore;
    }

    public void setHeadModelScore(double d) {
        this.headModelScore = d;
    }
}
