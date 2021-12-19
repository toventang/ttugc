package com.bytedance.android.livesdk.watch.chatroom;

import com.bytedance.covode.number.Covode;

public final class StackContext {
    private int activityHashCode;

    static {
        Covode.recordClassIndex(12961);
    }

    public final int getActivityHashCode() {
        return this.activityHashCode;
    }

    public final void setActivityHashCode(int i) {
        this.activityHashCode = i;
    }
}
