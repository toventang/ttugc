package com.p2082ss.android.ugc.aweme.notification.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.g */
public final class C61848g {
    static {
        Covode.recordClassIndex(72584);
    }

    /* renamed from: a */
    public static final int m111971a(MusNotice musNotice) {
        C89219l.m154721d(musNotice, "");
        if (musNotice.templateNotice != null) {
            return -10000;
        }
        if ((musNotice.type == 1 || musNotice.type == 11) && musNotice.announcement != null) {
            AnnouncementNotice announcementNotice = musNotice.announcement;
            C89219l.m154716b(announcementNotice, "");
            if (announcementNotice.getChallenge() != null) {
                return 101;
            }
        }
        if (musNotice.type == 31 && musNotice.commentNotice != null) {
            CommentNotice commentNotice = musNotice.commentNotice;
            C89219l.m154716b(commentNotice, "");
            if (commentNotice.isReplyWithVideo()) {
                return 1003;
            }
        }
        return musNotice.type;
    }
}
