package com.p2082ss.android.ugc.aweme.social.widget.card;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.AbstractC17654e;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74765i;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74834f;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74839g;
import com.p2082ss.android.ugc.aweme.social.widget.card.view.C74891b;
import com.p2082ss.android.ugc.aweme.social.widget.card.view.LegacyPermissionLayout;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.SocialCardServiceImp */
public final class SocialCardServiceImp implements ISocialCardService {
    static {
        Covode.recordClassIndex(87596);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.ISocialCardService
    /* renamed from: a */
    public final AbstractC74785g mo117805a() {
        return C74786h.f168101a;
    }

    /* renamed from: b */
    public static ISocialCardService m131250b() {
        MethodCollector.m26663i(7303);
        Object a = C81908b.m141854a(ISocialCardService.class, false);
        if (a != null) {
            ISocialCardService iSocialCardService = (ISocialCardService) a;
            MethodCollector.m26664o(7303);
            return iSocialCardService;
        }
        if (C81908b.f183379ei == null) {
            synchronized (ISocialCardService.class) {
                try {
                    if (C81908b.f183379ei == null) {
                        C81908b.f183379ei = new SocialCardServiceImp();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7303);
                    throw th;
                }
            }
        }
        SocialCardServiceImp socialCardServiceImp = (SocialCardServiceImp) C81908b.f183379ei;
        MethodCollector.m26664o(7303);
        return socialCardServiceImp;
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.ISocialCardService
    /* renamed from: b */
    public final RecyclerView.AbstractC1350a<?> mo117806b(C74743a aVar, C74765i iVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        return new C74834f(aVar, iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.ISocialCardService
    /* renamed from: a */
    public final AbstractC17654e mo117803a(C74743a aVar, C74765i iVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        return new C74839g(aVar, iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.ISocialCardService
    /* renamed from: a */
    public final AbstractC74782d mo117804a(C74743a aVar, int i) {
        C89219l.m154721d(aVar, "");
        return new C74891b(aVar, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.ISocialCardService
    /* renamed from: a */
    public final LinearLayout mo117802a(C74743a aVar, int i, C74765i iVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        return new LegacyPermissionLayout(aVar, iVar, i, (byte) 0);
    }
}
