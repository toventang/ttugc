package com.p2082ss.android.ugc.aweme.commercialize;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38881ag;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38882ah;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38875ac;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38907p;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.CouponAdCardActionV2;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.DownloadAdCardActionV2;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.FeedLiveAdCardActionV2;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.FormAdCardActionV2;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.GeneralAdCardActionV2;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.ImageAdCardActionV2;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.InteractAdCardActionV2;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.LandingPageAdCardActionV2;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.PollAdCardActionV2;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardActionV2;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.ShopAdCardActionV2;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.SurveyAdCardActionV2;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.AdCardServiceImpl */
public final class AdCardServiceImpl implements IAdCardService {
    static {
        Covode.recordClassIndex(44992);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.IAdCardService
    /* renamed from: b */
    public final AbstractC38882ah mo65444b() {
        return C38875ac.f91817a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.IAdCardService
    /* renamed from: a */
    public final AbstractC38881ag mo65441a() {
        return new C38907p.C38914a();
    }

    /* renamed from: c */
    public static IAdCardService m75807c() {
        MethodCollector.m26663i(11965);
        Object a = C81908b.m141854a(IAdCardService.class, false);
        if (a != null) {
            IAdCardService iAdCardService = (IAdCardService) a;
            MethodCollector.m26664o(11965);
            return iAdCardService;
        }
        if (C81908b.f183177ag == null) {
            synchronized (IAdCardService.class) {
                try {
                    if (C81908b.f183177ag == null) {
                        C81908b.f183177ag = new AdCardServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11965);
                    throw th;
                }
            }
        }
        AdCardServiceImpl adCardServiceImpl = (AdCardServiceImpl) C81908b.f183177ag;
        MethodCollector.m26664o(11965);
        return adCardServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.IAdCardService
    /* renamed from: b */
    public final boolean mo65445b(CardStruct cardStruct) {
        if (cardStruct == null || 4 == cardStruct.getCardType()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.IAdCardService
    /* renamed from: a */
    public final boolean mo65443a(CardStruct cardStruct) {
        if (cardStruct == null || cardStruct.getCardType() != 4 || cardStruct.getCardStyle() == 2) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.IAdCardService
    /* renamed from: a */
    public final AbstractC38883ai mo65442a(Integer num, Context context, Aweme aweme, AbstractC38878ae aeVar) {
        C89219l.m154721d(aeVar, "");
        if (num != null) {
            if (num.intValue() == 2) {
                return new DownloadAdCardActionV2(context, aweme, aeVar);
            }
            if (num.intValue() == 3) {
                return new ShopAdCardActionV2(context, aweme, aeVar);
            }
            if (num != null) {
                if (num.intValue() == 1) {
                    return new FormAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 4) {
                    return new ImageAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 5) {
                    return new InteractAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 6) {
                    return new PollAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 7) {
                    return new SurveyAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 8 || num.intValue() == 9) {
                    return new CouponAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 11) {
                    return new SelectAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 12) {
                    if (aweme == null || !aweme.isLive()) {
                        return new GeneralAdCardActionV2(context, aweme, aeVar);
                    }
                    return new FeedLiveAdCardActionV2(context, aweme, aeVar);
                }
            }
        }
        return new LandingPageAdCardActionV2(context, aweme, aeVar);
    }
}
