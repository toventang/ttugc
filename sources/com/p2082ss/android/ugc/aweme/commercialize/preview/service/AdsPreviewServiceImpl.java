package com.p2082ss.android.ugc.aweme.commercialize.preview.service;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.preview.experiment.C38317a;
import com.p2082ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.p2082ss.android.ugc.aweme.commercialize.preview.manager.C38324a;
import com.p2082ss.android.ugc.aweme.commercialize.preview.p2611d.C38313a;
import com.p2082ss.android.ugc.aweme.commercialize.preview.p2611d.p2612a.C38316a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.preview.service.AdsPreviewServiceImpl */
public final class AdsPreviewServiceImpl implements IAdsPreviewService {
    static {
        Covode.recordClassIndex(45819);
    }

    /* renamed from: a */
    public static IAdsPreviewService m77711a() {
        MethodCollector.m26663i(14189);
        Object a = C81908b.m141854a(IAdsPreviewService.class, false);
        if (a != null) {
            IAdsPreviewService iAdsPreviewService = (IAdsPreviewService) a;
            MethodCollector.m26664o(14189);
            return iAdsPreviewService;
        }
        if (C81908b.f183188ar == null) {
            synchronized (IAdsPreviewService.class) {
                try {
                    if (C81908b.f183188ar == null) {
                        C81908b.f183188ar = new AdsPreviewServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14189);
                    throw th;
                }
            }
        }
        AdsPreviewServiceImpl adsPreviewServiceImpl = (AdsPreviewServiceImpl) C81908b.f183188ar;
        MethodCollector.m26664o(14189);
        return adsPreviewServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    /* renamed from: b */
    public final void mo66935b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        C38313a.C38314a.m77704a(viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    /* renamed from: a */
    public final void mo66933a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(viewGroup, "");
        C23013a aVar = C38324a.f90568a;
        if (aVar != null) {
            aVar.dismiss();
        }
        C38324a.f90568a = null;
        C38313a.C38314a.m77704a(viewGroup);
    }

    /* renamed from: b */
    private static boolean m77712b(String str, String str2) {
        Keva repo = Keva.getRepo("ads_preview_keva");
        long j = repo.getLong("preview_timestamp", 0);
        if (j != 0 && TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - j) <= ((long) C38317a.m77706a().getValidationDurationInMinute())) {
            int hashCode = str.hashCode();
            if (hashCode != 98494) {
                if (hashCode == 2989182 && str.equals("adid")) {
                    String[] stringArray = repo.getStringArray("preview_adids", new String[0]);
                    C89219l.m154716b(stringArray, "");
                    if (C89064i.m154489a(stringArray, str2)) {
                        return true;
                    }
                }
            } else if (str.equals("cid")) {
                String[] stringArray2 = repo.getStringArray("preview_cids", new String[0]);
                C89219l.m154716b(stringArray2, "");
                if (C89064i.m154489a(stringArray2, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    /* renamed from: a */
    public final boolean mo66934a(String str, String str2) {
        List<String> list;
        List<String> list2;
        if (str != null && (list2 = AdsPreviewStateManager.f90554f) != null && list2.contains(str)) {
            return true;
        }
        if (str != null && (((list = AdsPreviewStateManager.f90554f) == null || list.isEmpty()) && m77712b("adid", str))) {
            return true;
        }
        if (str2 != null) {
            List<String> list3 = AdsPreviewStateManager.f90555g;
            if (list3 != null && list3.contains(str2)) {
                return true;
            }
            List<String> list4 = AdsPreviewStateManager.f90555g;
            if ((list4 == null || list4.isEmpty()) && m77712b("cid", str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    /* renamed from: a */
    public final void mo66931a(Context context, ViewGroup viewGroup, C38316a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        C38313a.C38314a.m77703a(context, viewGroup, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    /* renamed from: a */
    public final void mo66932a(Context context, ViewGroup viewGroup, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        C38313a.C38314a.m77703a(context, viewGroup, null);
        C23013a a = ((C23023b) C23028c.m43435a((C23023b) new C23023b(context).mo37479a(R.string.pt).mo37483b(R.string.ps), new C38324a.C38325a(aVar2)).mo37482a(false).mo37484b(new C38324a.C38327b(aVar))).mo37405a();
        C38324a.f90568a = a;
        a.mo37396b().show();
        C39162r.onEventV3("ads_interface_preview_ad_successfully");
    }
}
