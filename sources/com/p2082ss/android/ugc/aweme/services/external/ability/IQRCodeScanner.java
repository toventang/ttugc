package com.p2082ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.p2082ss.android.ugc.aweme.services.external.ability.p3711qr.AVEnigmaResult;
import com.p2082ss.android.ugc.aweme.services.external.ability.p3711qr.AVScanSettings;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner */
public interface IQRCodeScanner {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner$OnEnigmaScanListener */
    public interface OnEnigmaScanListener {
        static {
            Covode.recordClassIndex(79835);
        }

        void onFail(int i);

        void onSuccess(AVEnigmaResult aVEnigmaResult);
    }

    static {
        Covode.recordClassIndex(79833);
    }

    void closeLight();

    void enableCameraScan(boolean z, long j);

    void openLight();

    void pauseEffectAudio(boolean z);

    void processTouchEvent(float f, float f2);

    void release();

    void setScanListener(OnEnigmaScanListener onEnigmaScanListener);

    void startPicScan(String str, AVScanSettings aVScanSettings, long j);

    void startScan(Context context, AVCameraParams aVCameraParams, SurfaceHolder surfaceHolder, AVScanSettings aVScanSettings);

    void stop();

    void stopPicScan();

    void switchEffectWithTag(String str, int i, int i2, String str2);

    void zoomByRatio(float f);

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79834);
        }
    }
}
