package com.p2082ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.util.NoticeCommentHelperServiceImpl */
public final class NoticeCommentHelperServiceImpl implements NoticeCommentHelperService {
    static {
        Covode.recordClassIndex(44541);
    }

    /* renamed from: a */
    public static NoticeCommentHelperService m75149a() {
        MethodCollector.m26663i(8740);
        Object a = C81908b.m141854a(NoticeCommentHelperService.class, false);
        if (a != null) {
            NoticeCommentHelperService noticeCommentHelperService = (NoticeCommentHelperService) a;
            MethodCollector.m26664o(8740);
            return noticeCommentHelperService;
        }
        if (C81908b.f183174ad == null) {
            synchronized (NoticeCommentHelperService.class) {
                try {
                    if (C81908b.f183174ad == null) {
                        C81908b.f183174ad = new NoticeCommentHelperServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8740);
                    throw th;
                }
            }
        }
        NoticeCommentHelperServiceImpl noticeCommentHelperServiceImpl = (NoticeCommentHelperServiceImpl) C81908b.f183174ad;
        MethodCollector.m26664o(8740);
        return noticeCommentHelperServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService
    /* renamed from: a */
    public final String mo64747a(Comment comment) {
        C89219l.m154721d(comment, "");
        return C37194f.m75163a(comment, false);
    }
}
