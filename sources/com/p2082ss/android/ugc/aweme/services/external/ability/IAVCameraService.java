package com.p2082ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVCameraService */
public interface IAVCameraService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVCameraService$IAVCameraReadyCallback */
    public interface IAVCameraReadyCallback<T> {
        static {
            Covode.recordClassIndex(79812);
        }

        void finish(T t);
    }

    static {
        Covode.recordClassIndex(79811);
    }

    void getScanner(boolean z, Context context, SurfaceHolder surfaceHolder, IAVCameraReadyCallback<IQRCodeScanner> iAVCameraReadyCallback);
}
