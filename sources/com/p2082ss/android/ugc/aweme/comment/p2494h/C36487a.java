package com.p2082ss.android.ugc.aweme.comment.p2494h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;

/* renamed from: com.ss.android.ugc.aweme.comment.h.a */
public final class C36487a {
    static {
        Covode.recordClassIndex(43790);
    }

    /* renamed from: a */
    public static boolean m74277a(Comment comment) {
        if (comment != null && C31575b.m65865g().isLogin()) {
            return true;
        }
        return false;
    }
}
