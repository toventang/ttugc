package com.p2082ss.android.vesdk.jni;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.vesdk.filterparam.VEAudioDspFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEAudioEffectFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEAudioFadeFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.p2082ss.android.vesdk.filterparam.VEAudioNoiseFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam;

/* renamed from: com.ss.android.vesdk.jni.TEAudioEffectInterface */
public class TEAudioEffectInterface {
    private long mNative;

    static {
        Covode.recordClassIndex(99672);
    }

    private native int nativeUpdateAudioDspFilterParam(long j, int i, int i2, VEAudioDspFilterParam vEAudioDspFilterParam);

    private native int nativeUpdateAudioEffectFilterParam(long j, int i, int i2, VEAudioEffectFilterParam vEAudioEffectFilterParam);

    private native int nativeUpdateAudioFadeFilterParam(long j, int i, int i2, VEAudioFadeFilterParam vEAudioFadeFilterParam);

    private native int nativeUpdateAudioLoudnessBalanceFilterParam(long j, int i, int i2, VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter);

    private native int nativeUpdateAudioNoiseFilterParam(long j, int i, int i2, VEAudioNoiseFilterParam vEAudioNoiseFilterParam);

    private native int nativeUpdateAudioSamiFilterParam(long j, int i, int i2, VEAudioSamiFilterParam vEAudioSamiFilterParam);

    private native int nativeUpdateAudioVolumeFilterParam(long j, int i, int i2, VEAudioVolumeFilterParam vEAudioVolumeFilterParam);

    public void clearNative() {
        this.mNative = 0;
    }

    public TEAudioEffectInterface(long j) {
        this.mNative = j;
    }

    public int updateAudioFilterParam(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        MethodCollector.m26663i(14006);
        if (this.mNative == 0) {
            MethodCollector.m26664o(14006);
            return -112;
        } else if (vEBaseFilterParam.filterName.equals("audio volume filter")) {
            int nativeUpdateAudioVolumeFilterParam = nativeUpdateAudioVolumeFilterParam(this.mNative, i, i2, (VEAudioVolumeFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(14006);
            return nativeUpdateAudioVolumeFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("audio fading")) {
            int nativeUpdateAudioFadeFilterParam = nativeUpdateAudioFadeFilterParam(this.mNative, i, i2, (VEAudioFadeFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(14006);
            return nativeUpdateAudioFadeFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("audio effect")) {
            int nativeUpdateAudioEffectFilterParam = nativeUpdateAudioEffectFilterParam(this.mNative, i, i2, (VEAudioEffectFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(14006);
            return nativeUpdateAudioEffectFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("audio noise")) {
            int nativeUpdateAudioNoiseFilterParam = nativeUpdateAudioNoiseFilterParam(this.mNative, i, i2, (VEAudioNoiseFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(14006);
            return nativeUpdateAudioNoiseFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("loudness balance")) {
            int nativeUpdateAudioLoudnessBalanceFilterParam = nativeUpdateAudioLoudnessBalanceFilterParam(this.mNative, i, i2, (VEAudioLoudnessBalanceFilter) vEBaseFilterParam);
            MethodCollector.m26664o(14006);
            return nativeUpdateAudioLoudnessBalanceFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("audio dsp filter")) {
            int nativeUpdateAudioDspFilterParam = nativeUpdateAudioDspFilterParam(this.mNative, i, i2, (VEAudioDspFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(14006);
            return nativeUpdateAudioDspFilterParam;
        } else if (vEBaseFilterParam.filterName.equals("audio sami filter")) {
            int nativeUpdateAudioSamiFilterParam = nativeUpdateAudioSamiFilterParam(this.mNative, i, i2, (VEAudioSamiFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(14006);
            return nativeUpdateAudioSamiFilterParam;
        } else {
            MethodCollector.m26664o(14006);
            return -1;
        }
    }
}
