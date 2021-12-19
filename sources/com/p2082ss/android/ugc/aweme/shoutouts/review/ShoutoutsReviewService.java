package com.p2082ss.android.ugc.aweme.shoutouts.review;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.shoutouts.api.AbstractC74385a;
import com.p2082ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewService */
public final class ShoutoutsReviewService implements IShoutoutsReviewService {
    static {
        Covode.recordClassIndex(87326);
    }

    /* renamed from: a */
    public static IShoutoutsReviewService m130953a() {
        MethodCollector.m26663i(386);
        Object a = C81908b.m141854a(IShoutoutsReviewService.class, false);
        if (a != null) {
            IShoutoutsReviewService iShoutoutsReviewService = (IShoutoutsReviewService) a;
            MethodCollector.m26664o(386);
            return iShoutoutsReviewService;
        }
        if (C81908b.f183375ee == null) {
            synchronized (IShoutoutsReviewService.class) {
                try {
                    if (C81908b.f183375ee == null) {
                        C81908b.f183375ee = new ShoutoutsReviewService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(386);
                    throw th;
                }
            }
        }
        ShoutoutsReviewService shoutoutsReviewService = (ShoutoutsReviewService) C81908b.f183375ee;
        MethodCollector.m26664o(386);
        return shoutoutsReviewService;
    }

    @Override // com.p2082ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService
    /* renamed from: a */
    public final void mo117002a(Context context, String str, Integer num, Float f, String str2) {
        C89219l.m154721d(context, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//shoutouts/detail");
        if (str != null) {
            buildRoute.withParam("description", str);
        }
        if (num != null) {
            buildRoute.withParam("coin", String.valueOf(num.intValue()));
        }
        if (f != null) {
            buildRoute.withParam("standardMoney", String.valueOf(f.floatValue()));
        }
        if (str2 != null) {
            buildRoute.withParam("currencyCharacter", str2);
        }
        buildRoute.withParam("enter_from", "tools_preview");
        buildRoute.open();
    }

    @Override // com.p2082ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService
    /* renamed from: a */
    public final void mo117003a(ViewGroup viewGroup, int i, float f, String str, String str2, AbstractC74385a aVar) {
        MethodCollector.m26663i(367);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(str, "");
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        C74544c cVar = new C74544c(context, (byte) 0);
        viewGroup.addView(cVar, new ViewGroup.LayoutParams(-1, -1));
        cVar.setDescription(str2);
        cVar.mo117205a(i, (int) f, str, 0.0f, 0, true, false);
        cVar.mo117203a();
        cVar.setBottomSheetCallback(aVar);
        MethodCollector.m26664o(367);
    }
}
