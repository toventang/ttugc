package com.p2082ss.android.ugc.aweme.p2282ad.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.api.HasCommentDesApi;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2286a.AbstractC33137b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.AdCommentService */
public final class AdCommentService implements IAdCommentService {
    static {
        Covode.recordClassIndex(39948);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.IAdCommentService
    /* renamed from: a */
    public final void mo58993a() {
        HasCommentDesApi.f78727a = null;
    }

    /* renamed from: b */
    public static IAdCommentService m67912b() {
        MethodCollector.m26663i(12861);
        Object a = C81908b.m141854a(IAdCommentService.class, false);
        if (a != null) {
            IAdCommentService iAdCommentService = (IAdCommentService) a;
            MethodCollector.m26664o(12861);
            return iAdCommentService;
        }
        if (C81908b.f183125H == null) {
            synchronized (IAdCommentService.class) {
                try {
                    if (C81908b.f183125H == null) {
                        C81908b.f183125H = new AdCommentService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12861);
                    throw th;
                }
            }
        }
        AdCommentService adCommentService = (AdCommentService) C81908b.f183125H;
        MethodCollector.m26664o(12861);
        return adCommentService;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.IAdCommentService
    /* renamed from: a */
    public final void mo58994a(String str, AbstractC33137b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        HasCommentDesApi.f78727a = bVar;
        ((HasCommentDesApi.Api) HasCommentDesApi.f78728b.getValue()).getResponse(str).enqueue(new HasCommentDesApi.C33140b());
    }
}
