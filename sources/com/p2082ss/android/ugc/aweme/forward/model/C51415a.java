package com.p2082ss.android.ugc.aweme.forward.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.model.a */
public final class C51415a implements Serializable {
    @AbstractC27891c(mo46611a = "aweme")

    /* renamed from: a */
    Aweme f118481a;

    /* renamed from: b */
    String f118482b;
    @AbstractC27891c(mo46611a = "comment_list")

    /* renamed from: c */
    List<Comment> f118483c;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: d */
    int f118484d;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: e */
    int f118485e;
    @AbstractC27891c(mo46611a = "favorite_list")

    /* renamed from: f */
    List<Aweme> f118486f;
    @AbstractC27891c(mo46611a = "time")

    /* renamed from: g */
    long f118487g;
    @AbstractC27891c(mo46611a = "favorite_ids")

    /* renamed from: h */
    List<String> f118488h;

    static {
        Covode.recordClassIndex(60634);
    }

    public final Aweme getAweme() {
        return this.f118481a;
    }

    public final long getBlockFavoriteTime() {
        return this.f118487g;
    }

    public final List<Comment> getComments() {
        return this.f118483c;
    }

    public final List<String> getFavoriteIds() {
        return this.f118488h;
    }

    public final List<Aweme> getFavorites() {
        return this.f118486f;
    }

    public final int getItemType() {
        return this.f118484d;
    }

    public final int getLikeCount() {
        return this.f118485e;
    }

    public final void setAweme(Aweme aweme) {
        this.f118481a = aweme;
    }

    public final void setBlockFavoriteTime(long j) {
        this.f118487g = j;
    }

    public final void setComments(List<Comment> list) {
        this.f118483c = list;
    }

    public final void setFavoriteIds(List<String> list) {
        this.f118488h = list;
    }

    public final void setFavorites(List<Aweme> list) {
        this.f118486f = list;
    }

    public final void setItemType(int i) {
        this.f118484d = i;
    }

    public final void setLikeCount(int i) {
        this.f118485e = i;
    }

    public final void setRequestId(String str) {
        this.f118482b = str;
        Aweme aweme = this.f118481a;
        if (aweme != null) {
            aweme.setRequestId(str);
        }
    }
}
