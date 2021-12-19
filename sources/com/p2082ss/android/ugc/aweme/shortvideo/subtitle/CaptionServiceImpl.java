package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.sticker.ICaptionService;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.CaptionServiceImpl */
public final class CaptionServiceImpl implements ICaptionService {

    /* renamed from: a */
    private boolean f164269a = true;

    static {
        Covode.recordClassIndex(85876);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.sticker.ICaptionService
    public final boolean getAlwaysShowCaptionStatus() {
        return this.f164269a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.sticker.ICaptionService
    public final boolean isConsumptionEnableAutoCaption() {
        if (C16048b.m29633a().mo25412a(true, "studio_consumption_enable_auto_captions", 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.sticker.ICaptionService
    public final String getCaptionCacheDir() {
        return C63244g.m114602a().mo73279g().mo69470c().mo69478d("caption");
    }

    /* renamed from: a */
    public static ICaptionService m129181a() {
        MethodCollector.m26663i(12484);
        Object a = C81908b.m141854a(ICaptionService.class, false);
        if (a != null) {
            ICaptionService iCaptionService = (ICaptionService) a;
            MethodCollector.m26664o(12484);
            return iCaptionService;
        }
        if (C81908b.f183374ed == null) {
            synchronized (ICaptionService.class) {
                try {
                    if (C81908b.f183374ed == null) {
                        C81908b.f183374ed = new CaptionServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12484);
                    throw th;
                }
            }
        }
        CaptionServiceImpl captionServiceImpl = (CaptionServiceImpl) C81908b.f183374ed;
        MethodCollector.m26664o(12484);
        return captionServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.sticker.ICaptionService
    public final void setAlwaysShowCaptionStatus(boolean z) {
        this.f164269a = z;
    }
}
