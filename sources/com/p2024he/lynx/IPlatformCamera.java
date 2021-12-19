package com.p2024he.lynx;

import android.graphics.SurfaceTexture;
import android.util.Size;
import com.bytedance.covode.number.Covode;
import com.p2024he.lynx.HeliumApp;

/* renamed from: com.he.lynx.IPlatformCamera */
public interface IPlatformCamera extends HeliumApp.StateCallback {

    /* renamed from: com.he.lynx.IPlatformCamera$CameraEventCallback */
    public interface CameraEventCallback {
        static {
            Covode.recordClassIndex(33784);
        }

        void onPause();

        void onResume(boolean z, String str);
    }

    static {
        Covode.recordClassIndex(33783);
    }

    void autoFocus();

    void dispose();

    Size getCameraResolution();

    void onSurfaceTextureReady(SurfaceTexture surfaceTexture);

    void request(boolean z, boolean z2, boolean z3, int i, int i2);

    void setCameraEventCallback(CameraEventCallback cameraEventCallback);

    void setZoom(float f);
}
