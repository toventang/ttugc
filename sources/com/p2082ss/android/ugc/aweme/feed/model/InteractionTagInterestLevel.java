package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel */
public enum InteractionTagInterestLevel {
    UNDEFINED(0),
    LOW(1),
    HIGH(2);
    
    private final int level;

    public final int getLevel() {
        return this.level;
    }

    static {
        Covode.recordClassIndex(58714);
    }

    private InteractionTagInterestLevel(int i) {
        this.level = i;
    }
}
