package com.p2082ss.android.ugc.aweme.services.external.ability;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAbilityService */
public interface IAbilityService {
    static {
        Covode.recordClassIndex(79830);
    }

    IAVCameraService cameraService();

    IAVEffectService effectService();

    IAVInfoService infoService();

    IAVLoaderService libraryLoaderService();

    IAVProcessService processService();

    IAVTransformService transformService();
}
