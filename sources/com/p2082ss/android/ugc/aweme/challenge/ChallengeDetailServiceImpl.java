package com.p2082ss.android.ugc.aweme.challenge;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.challenge.api.IChallengeDetailService;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p2082ss.android.ugc.aweme.challenge.p2451g.C35520a;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35612j;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl */
public final class ChallengeDetailServiceImpl implements IChallengeDetailService {
    static {
        Covode.recordClassIndex(42671);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    /* renamed from: a */
    public final AbstractC39100a<Aweme, ?> mo62371a() {
        return new C35520a();
    }

    /* renamed from: b */
    public static IChallengeDetailService m72554b() {
        MethodCollector.m26663i(1311);
        Object a = C81908b.m141854a(IChallengeDetailService.class, false);
        if (a != null) {
            IChallengeDetailService iChallengeDetailService = (IChallengeDetailService) a;
            MethodCollector.m26664o(1311);
            return iChallengeDetailService;
        }
        if (C81908b.f183142Y == null) {
            synchronized (IChallengeDetailService.class) {
                try {
                    if (C81908b.f183142Y == null) {
                        C81908b.f183142Y = new ChallengeDetailServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1311);
                    throw th;
                }
            }
        }
        ChallengeDetailServiceImpl challengeDetailServiceImpl = (ChallengeDetailServiceImpl) C81908b.f183142Y;
        MethodCollector.m26664o(1311);
        return challengeDetailServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    /* renamed from: a */
    public final Fragment mo62370a(Intent intent) {
        C89219l.m154721d(intent, "");
        if (!MSAdaptionService.m97895c().mo89372a(C17867d.m33078a())) {
            return null;
        }
        C89219l.m154721d(intent, "");
        C35612j jVar = new C35612j();
        jVar.setArguments(C35612j.C35622d.m72748a(intent));
        return jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    /* renamed from: a */
    public final void mo62372a(AbstractC39100a<Aweme, ?> aVar, List<? extends Aweme> list) {
        if (aVar instanceof C35520a) {
            C35520a aVar2 = (C35520a) aVar;
            aVar2.setItems(new ArrayList(list));
            ((ChallengeAwemeList) aVar2.mData).cursor = (long) list.size();
        }
    }
}
