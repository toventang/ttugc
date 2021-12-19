package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct */
public final class CommentLikeUsersStruct extends Comment implements Serializable {
    private Aweme aweme;
    private int dialogHeight;
    private String eventType = "";
    private List<? extends User> likeUsers;
    private long likeUsersCount;

    static {
        Covode.recordClassIndex(43859);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final int getDialogHeight() {
        return this.dialogHeight;
    }

    public final String getEventType() {
        return this.eventType;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> getLikeUsers() {
        return this.likeUsers;
    }

    public final long getLikeUsersCount() {
        return this.likeUsersCount;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setDialogHeight(int i) {
        this.dialogHeight = i;
    }

    public final void setLikeUsers(List<? extends User> list) {
        this.likeUsers = list;
    }

    public final void setLikeUsersCount(long j) {
        this.likeUsersCount = j;
    }

    public final void setEventType(String str) {
        C89219l.m154721d(str, "");
        this.eventType = str;
    }
}
