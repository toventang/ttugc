package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.p2216e.C31057a;
import com.p2082ss.android.ugc.asve.p2216e.C31058b;
import com.p2082ss.android.ugc.asve.p2216e.C31059c;
import com.p2082ss.android.ugc.aweme.record.AbstractC66809c;
import com.p2082ss.android.ugc.aweme.setting.C68061cj;
import com.p2082ss.android.ugc.aweme.setting.C68703v;

/* renamed from: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$getABService$1 */
public final class InternalRecordServiceImpl$getABService$1 implements AbstractC66809c {
    static {
        Covode.recordClassIndex(79667);
    }

    InternalRecordServiceImpl$getABService$1() {
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66809c
    public final int getCameraOpenRetryCount() {
        return C31057a.m63958a();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66809c
    public final int getCameraPreviewRetryCount() {
        return C31058b.m63959a();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66809c
    public final boolean getCloseCameraAsyncIsOpen() {
        return C31059c.m63960a();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66809c
    public final boolean getEnablePreReleaseGPUResource() {
        return C68703v.m121138a();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66809c
    public final boolean getEnableRenderPause() {
        return C68061cj.m120367a();
    }
}
