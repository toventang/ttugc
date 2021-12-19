package com.p2082ss.android.ugc.aweme.internal;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.OnActivityResultCallback;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36410g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.internal.AVCommentServiceImpl */
public final class AVCommentServiceImpl implements IAVCommentService {
    static {
        Covode.recordClassIndex(66672);
    }

    /* renamed from: a */
    public static IAVCommentService m102984a() {
        MethodCollector.m26663i(7250);
        Object a = C81908b.m141854a(IAVCommentService.class, false);
        if (a != null) {
            IAVCommentService iAVCommentService = (IAVCommentService) a;
            MethodCollector.m26664o(7250);
            return iAVCommentService;
        }
        if (C81908b.f183203bF == null) {
            synchronized (IAVCommentService.class) {
                try {
                    if (C81908b.f183203bF == null) {
                        C81908b.f183203bF = new AVCommentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7250);
                    throw th;
                }
            }
        }
        AVCommentServiceImpl aVCommentServiceImpl = (AVCommentServiceImpl) C81908b.f183203bF;
        MethodCollector.m26664o(7250);
        return aVCommentServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IAVCommentService
    /* renamed from: a */
    public final boolean mo93958a(boolean z) {
        if (!z || !C36410g.m74112c()) {
            if (!z) {
                if (C89070n.m154525d(1, 3, 5).contains(Integer.valueOf(C36410g.m74110a()))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IAVCommentService
    /* renamed from: a */
    public final void mo93957a(ActivityC0945e eVar, boolean z, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        CommentServiceImpl.m73664e().mo63291a(eVar, z, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IAVCommentService
    /* renamed from: a */
    public final void mo93956a(Context context, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(onActivityResultCallback, "");
        CommentServiceImpl.m73664e().mo63289a(context, str, aweme, i, list, onActivityResultCallback);
    }
}
