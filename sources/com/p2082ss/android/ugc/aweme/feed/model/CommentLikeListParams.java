package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CommentLikeListParams */
public class CommentLikeListParams {
    public Aweme aweme;
    public List<RelationLabelUser> userList;

    static {
        Covode.recordClassIndex(58668);
    }

    public CommentLikeListParams(Aweme aweme2, List<RelationLabelUser> list) {
        this.aweme = aweme2;
        this.userList = list;
    }
}
