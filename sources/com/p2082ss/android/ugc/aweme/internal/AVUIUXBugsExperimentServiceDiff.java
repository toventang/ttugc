package com.p2082ss.android.ugc.aweme.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IUIUXBugsExperimentService;
import com.p2082ss.android.ugc.aweme.UIUXBugsExperimentService;

/* renamed from: com.ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff */
public final class AVUIUXBugsExperimentServiceDiff implements IAVUIUXBugsExperimentService {

    /* renamed from: a */
    private final IUIUXBugsExperimentService f129373a = UIUXBugsExperimentService.m65442b();

    static {
        Covode.recordClassIndex(66674);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IAVUIUXBugsExperimentService
    /* renamed from: a */
    public final boolean mo93971a() {
        return this.f129373a.mo57250a();
    }

    /* renamed from: b */
    public static IAVUIUXBugsExperimentService m103001b() {
        MethodCollector.m26663i(6410);
        Object a = C81908b.m141854a(IAVUIUXBugsExperimentService.class, false);
        if (a != null) {
            IAVUIUXBugsExperimentService iAVUIUXBugsExperimentService = (IAVUIUXBugsExperimentService) a;
            MethodCollector.m26664o(6410);
            return iAVUIUXBugsExperimentService;
        }
        if (C81908b.f183205bH == null) {
            synchronized (IAVUIUXBugsExperimentService.class) {
                try {
                    if (C81908b.f183205bH == null) {
                        C81908b.f183205bH = new AVUIUXBugsExperimentServiceDiff();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6410);
                    throw th;
                }
            }
        }
        AVUIUXBugsExperimentServiceDiff aVUIUXBugsExperimentServiceDiff = (AVUIUXBugsExperimentServiceDiff) C81908b.f183205bH;
        MethodCollector.m26664o(6410);
        return aVUIUXBugsExperimentServiceDiff;
    }
}
