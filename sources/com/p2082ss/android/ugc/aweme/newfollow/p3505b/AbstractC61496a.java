package com.p2082ss.android.ugc.aweme.newfollow.p3505b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.b.a */
public abstract class AbstractC61496a extends BaseResponse implements AbstractC33623d {
    private String requestId;

    static {
        Covode.recordClassIndex(72153);
    }

    public Aweme getAweme() {
        return null;
    }

    public List<Comment> getCommentList() {
        return null;
    }

    public abstract int getFeedType();

    public List<User> getLikeList() {
        return null;
    }

    public boolean needUpdateComment() {
        return false;
    }

    public void setAweme(Aweme aweme) {
    }

    public void setCommentList(List<Comment> list) {
    }

    public abstract void setFeedType(int i);

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.requestId;
    }

    public String getAwemeAuthorId() {
        if (getAweme() != null) {
            return getAweme().getAuthorUid();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        this.requestId = str;
    }
}
