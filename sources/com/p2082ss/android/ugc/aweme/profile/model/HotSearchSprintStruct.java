package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.model.HotSearchSprintStruct */
public class HotSearchSprintStruct implements Serializable {
    private static final long serialVersionUID = 1;
    @AbstractC27891c(mo46611a = "followers")
    public List<User> hitRankPeoples;
    @AbstractC27891c(mo46611a = "sprint")
    public int sprint;

    static {
        Covode.recordClassIndex(75179);
    }

    public List<User> getHitRankPeoples() {
        return this.hitRankPeoples;
    }

    public int getSprint() {
        return this.sprint;
    }

    public void setHitRankPeoples(List<User> list) {
        this.hitRankPeoples = list;
    }

    public void setSprint(int i) {
        this.sprint = i;
    }
}
