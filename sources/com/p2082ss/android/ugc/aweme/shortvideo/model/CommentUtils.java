package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.CommentUtils */
public final class CommentUtils {
    public static final CommentUtils INSTANCE = new CommentUtils();

    private CommentUtils() {
    }

    static {
        Covode.recordClassIndex(84562);
    }

    public static final boolean needMob(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null || !C89219l.m154714a((Object) "comment_reply", (Object) shortVideoContext.f155831p) || shortVideoContext.f155825j == null) {
            return false;
        }
        return true;
    }

    public static final boolean isDataValid(CommentVideoModel commentVideoModel) {
        if (commentVideoModel != null && !TextUtils.isEmpty(commentVideoModel.getUserName()) && !TextUtils.isEmpty(commentVideoModel.getCommentMsg()) && !TextUtils.isEmpty(commentVideoModel.getAwemeId()) && !TextUtils.isEmpty(commentVideoModel.getUserId())) {
            return true;
        }
        return false;
    }

    public static final boolean needMob(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !C89219l.m154714a((Object) "comment_reply", (Object) videoPublishEditModel.mShootWay) || videoPublishEditModel.commentVideoModel == null) {
            return false;
        }
        return true;
    }
}
