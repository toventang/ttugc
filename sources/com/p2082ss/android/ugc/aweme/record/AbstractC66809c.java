package com.p2082ss.android.ugc.aweme.record;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.record.c */
public interface AbstractC66809c {
    static {
        Covode.recordClassIndex(78381);
    }

    int getCameraOpenRetryCount();

    int getCameraPreviewRetryCount();

    boolean getCloseCameraAsyncIsOpen();

    boolean getEnablePreReleaseGPUResource();

    boolean getEnableRenderPause();
}
