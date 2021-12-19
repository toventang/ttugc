package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeBubbleType */
public enum AwemeBubbleType {
    LEFT(1);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(58625);
    }

    private AwemeBubbleType(int i) {
        this.value = i;
    }
}
