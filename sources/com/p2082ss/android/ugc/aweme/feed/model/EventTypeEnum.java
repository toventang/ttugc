package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.model.EventTypeEnum */
public enum EventTypeEnum {
    Live_Event(1);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(58680);
    }

    private EventTypeEnum(int i) {
        this.type = i;
    }
}
