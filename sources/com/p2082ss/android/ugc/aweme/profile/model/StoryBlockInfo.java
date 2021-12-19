package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.StoryBlockInfo */
public class StoryBlockInfo implements Serializable {
    @AbstractC27891c(mo46611a = "life_story_block")
    public boolean isBlock;
    @AbstractC27891c(mo46611a = "life_story_blocked")
    public boolean isBlocked;

    static {
        Covode.recordClassIndex(75210);
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }
}
