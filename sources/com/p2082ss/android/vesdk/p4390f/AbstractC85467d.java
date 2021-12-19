package com.p2082ss.android.vesdk.p4390f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEMVAlgorithmConfig;
import com.p2082ss.android.vesdk.VEMVAudioInfo;
import com.p2082ss.android.vesdk.VEMVParams;
import com.p2082ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;

/* renamed from: com.ss.android.vesdk.f.d */
public interface AbstractC85467d {
    static {
        Covode.recordClassIndex(99588);
    }

    void addMVFilterInternal(int i);

    int changeMvUserVideoInfoInternal(int i, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr, VEClipSourceParam[] vEClipSourceParamArr);

    void clearNativeFromMV();

    int getMVBackgroundAudioTrackIndex();

    VEMVAudioInfo getMVOriginalBackgroundAudio();

    int initMV(VEMVParams vEMVParams);

    int initMV(String str, String[] strArr, String[] strArr2, String str2, int i, int i2);

    boolean isMVInitialedInternal();

    int setExternalAlgorithmResult(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type);

    void setListenerForMV(VEListener.AbstractC85222aa aaVar);

    int setMvOriginalAudio(boolean z, float f);

    int updateMVBackgroundAudioTrack(String str, int i, int i2);

    int updateMVResources(VEMVParams vEMVParams);

    int updateMVResources(String str, String[] strArr, String[] strArr2);
}
