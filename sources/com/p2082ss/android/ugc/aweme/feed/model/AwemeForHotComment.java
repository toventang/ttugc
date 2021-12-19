package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeForHotComment */
public class AwemeForHotComment {
    public Aweme mAweme;
    public int mEventType;
    public String mHotCommentTargetId;

    static {
        Covode.recordClassIndex(58627);
    }

    public AwemeForHotComment(int i, Aweme aweme) {
        this.mEventType = i;
        this.mAweme = aweme;
    }
}
