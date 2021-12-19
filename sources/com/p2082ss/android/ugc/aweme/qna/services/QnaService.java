package com.p2082ss.android.ugc.aweme.qna.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.question.api.C66501b;
import com.p2082ss.android.ugc.aweme.question.p3659a.C66497a;
import com.p2082ss.android.ugc.aweme.question.p3660b.C66503a;
import com.p2082ss.android.ugc.aweme.question.p3663e.C66520a;
import com.p2082ss.android.ugc.aweme.services.IQnaService;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.services.QnaService */
public final class QnaService implements IQnaService {
    static {
        Covode.recordClassIndex(77809);
    }

    /* renamed from: a */
    public static IQnaService m117969a() {
        Object a = C81908b.m141854a(IQnaService.class, false);
        if (a != null) {
            return (IQnaService) a;
        }
        return new QnaService();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IQnaService
    public final boolean enablePublicQna() {
        if (!C16048b.m29633a().mo25421a(true, "public_qna_enabled", false) || !C66503a.f149498a) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IQnaService
    public final void setQuestionAwemeListCacheCache(long j, int i, int i2, List<? extends Aweme> list) {
        C89219l.m154721d(list, "");
        C66520a.C66522a aVar = new C66520a.C66522a();
        aVar.f149576a = i2;
        aVar.f149577b = i;
        aVar.f149578c = j;
        C66501b bVar = new C66501b();
        bVar.setCursor(Integer.valueOf(i));
        bVar.setHasMore((Integer) 1);
        bVar.setVideos(list);
        C66497a.m118248a(aVar, bVar);
    }
}
