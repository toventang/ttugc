package org.webrtc;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface VideoCapturer {
    static {
        Covode.recordClassIndex(106736);
    }

    void changeCaptureFormat(int i, int i2, int i3);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i, int i2, int i3);

    void startCapture(int i, int i2, int i3, int i4);

    void stopCapture();
}
