package com.p2082ss.android.ugc.aweme.comment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.comment.services.ICommentStickerRecordService;
import com.p2082ss.android.ugc.aweme.comment.util.C37218u;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.CommentStickerRecordServiceImpl */
public final class CommentStickerRecordServiceImpl implements ICommentStickerRecordService {
    static {
        Covode.recordClassIndex(43419);
    }

    /* renamed from: a */
    public static ICommentStickerRecordService m73702a() {
        MethodCollector.m26663i(9564);
        Object a = C81908b.m141854a(ICommentStickerRecordService.class, false);
        if (a != null) {
            ICommentStickerRecordService iCommentStickerRecordService = (ICommentStickerRecordService) a;
            MethodCollector.m26664o(9564);
            return iCommentStickerRecordService;
        }
        if (C81908b.f183173ac == null) {
            synchronized (ICommentStickerRecordService.class) {
                try {
                    if (C81908b.f183173ac == null) {
                        C81908b.f183173ac = new CommentStickerRecordServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9564);
                    throw th;
                }
            }
        }
        CommentStickerRecordServiceImpl commentStickerRecordServiceImpl = (CommentStickerRecordServiceImpl) C81908b.f183173ac;
        MethodCollector.m26664o(9564);
        return commentStickerRecordServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.ICommentStickerRecordService
    /* renamed from: a */
    public final void mo63314a(Context context, CommentVideoModel commentVideoModel) {
        C89219l.m154721d(context, "");
        C37218u.m75212a(context, commentVideoModel);
    }
}
