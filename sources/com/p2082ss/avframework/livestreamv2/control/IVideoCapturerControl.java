package com.p2082ss.avframework.livestreamv2.control;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.control.IVideoCapturerControl */
public interface IVideoCapturerControl {

    /* renamed from: com.ss.avframework.livestreamv2.control.IVideoCapturerControl$Range */
    public static class Range {
        public float max;
        public float min;

        static {
            Covode.recordClassIndex(100177);
        }
    }

    static {
        Covode.recordClassIndex(100176);
    }

    void cancelAudioFocus();

    void cancelAutoFocus();

    boolean currentSupportISPControl();

    Range getExposureCompensationRange();

    float getInCaptureRealFps();

    JSONObject getRealCameraStatus();

    int queryZoomAbility(boolean z, boolean z2);

    int setExposureCompensation(float f);

    int setFocusAreas(int i, int i2, int i3, int i4);

    int startZoom(boolean z, float f);

    int toggleFlashLight(boolean z);
}
