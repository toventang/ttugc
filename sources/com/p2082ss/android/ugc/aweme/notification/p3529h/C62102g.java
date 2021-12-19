package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.util.NoticeCommentHelperServiceImpl;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.g */
public final class C62102g {
    static {
        Covode.recordClassIndex(72856);
    }

    /* renamed from: a */
    public static final String m112296a(Comment comment) {
        if (comment == null || TextUtils.isEmpty(comment.getCid())) {
            return "";
        }
        if (comment.getUser() == null) {
            return NoticeCommentHelperServiceImpl.m75149a().mo64747a(comment);
        }
        StringBuilder sb = new StringBuilder();
        User user = comment.getUser();
        C89219l.m154716b(user, "");
        return sb.append(C62266j.m112643a(user)).append(": ").append(NoticeCommentHelperServiceImpl.m75149a().mo64747a(comment)).toString();
    }
}
