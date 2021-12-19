package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.music.model.SearchCardType */
public enum SearchCardType {
    TYPE_NORMAL(1);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(71417);
    }

    private SearchCardType(int i) {
        this.value = i;
    }
}
