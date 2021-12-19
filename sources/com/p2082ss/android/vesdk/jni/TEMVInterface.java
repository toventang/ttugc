package com.p2082ss.android.vesdk.jni;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.VESize;
import java.util.Arrays;

/* renamed from: com.ss.android.vesdk.jni.TEMVInterface */
public class TEMVInterface {
    private int mHostTrackIndex = -1;
    private long mNative;

    static {
        Covode.recordClassIndex(99675);
    }

    private native int nativeAddAudioTrackMV(long j, String str, int i, int i2, int i3, int i4, int i5, boolean z, float f);

    private native int nativeAddVideoTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, VESize[] vESizeArr, int i2, int i3, boolean[] zArr, float f);

    private native Object nativeGetMVOriginalBackgroundAudio(long j);

    private native Object nativeGetServerAlgorithmConfig(long j);

    private native Object nativeInitMVResources(long j, String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4, int i5, int i6);

    private native int nativeInitVideoEditorMV(long j, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean z);

    private native int nativeInitVideoEditorMVLoadCache(long j, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean[] zArr, String[] strArr5);

    private native int nativeSetAudioBeatAlgorithmResult(long j, VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult);

    private native int nativeSetExternalAlgorithmResult(long j, String str, String str2, String str3, int i);

    private native int nativeSetMVDataJson(long j, String str);

    public void clearNative() {
        this.mNative = 0;
    }

    public Object getMVOriginalBackgroundAudio() {
        MethodCollector.m26663i(14270);
        long j = this.mNative;
        if (j == 0) {
            C85315al.m146642d("TEMVInterface", "getMVOriginalBackgroundAudio error, mNative == 0");
            MethodCollector.m26664o(14270);
            return null;
        }
        Object nativeGetMVOriginalBackgroundAudio = nativeGetMVOriginalBackgroundAudio(j);
        MethodCollector.m26664o(14270);
        return nativeGetMVOriginalBackgroundAudio;
    }

    public Object getServerAlgorithmConfig() {
        MethodCollector.m26663i(14295);
        long j = this.mNative;
        if (j == 0) {
            C85315al.m146642d("TEMVInterface", "getServerAlgorithmConfig error, mNative == 0");
            MethodCollector.m26664o(14295);
            return null;
        }
        Object nativeGetServerAlgorithmConfig = nativeGetServerAlgorithmConfig(j);
        MethodCollector.m26664o(14295);
        return nativeGetServerAlgorithmConfig;
    }

    public TEMVInterface(long j) {
        this.mNative = j;
    }

    public int setMVAudioBeatAlgorithmResult(VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult) {
        MethodCollector.m26663i(14269);
        long j = this.mNative;
        if (j == 0) {
            C85315al.m146642d("TEMVInterface", "setExternalAlgorithmResult error, mNative == 0");
            MethodCollector.m26664o(14269);
            return -112;
        }
        int nativeSetAudioBeatAlgorithmResult = nativeSetAudioBeatAlgorithmResult(j, vEMVAudioAlgorithmResult);
        MethodCollector.m26664o(14269);
        return nativeSetAudioBeatAlgorithmResult;
    }

    public int setMVDataJson(String str) {
        MethodCollector.m26663i(14158);
        long j = this.mNative;
        if (j == 0) {
            C85315al.m146642d("TEMVInterface", "setExternalAlgorithmResult error, mNative == 0");
            MethodCollector.m26664o(14158);
            return -112;
        }
        int nativeSetMVDataJson = nativeSetMVDataJson(j, str);
        MethodCollector.m26664o(14158);
        return nativeSetMVDataJson;
    }

    public int setExternalAlgorithmResult(String str, String str2, String str3, int i) {
        MethodCollector.m26663i(14279);
        long j = this.mNative;
        if (j == 0) {
            C85315al.m146642d("TEMVInterface", "setExternalAlgorithmResult error, mNative == 0");
            MethodCollector.m26664o(14279);
            return -112;
        }
        int nativeSetExternalAlgorithmResult = nativeSetExternalAlgorithmResult(j, str, str2, str3, i);
        MethodCollector.m26664o(14279);
        return nativeSetExternalAlgorithmResult;
    }

    public int addAudioTrackForMV(String str, int i, int i2, int i3, int i4, int i5, boolean z, float f) {
        MethodCollector.m26663i(14164);
        if (this.mNative == 0) {
            MethodCollector.m26664o(14164);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(14164);
            return -100;
        } else {
            int nativeAddAudioTrackMV = nativeAddAudioTrackMV(this.mNative, str, i, i2, i3, i4, i5, z, f);
            MethodCollector.m26664o(14164);
            return nativeAddAudioTrackMV;
        }
    }

    public int addVideoTrackForMV(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, VESize[] vESizeArr, int i2, boolean[] zArr, float f) {
        MethodCollector.m26663i(14133);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14133);
            return -1;
        }
        int i3 = this.mHostTrackIndex;
        if (i3 < 0) {
            MethodCollector.m26664o(14133);
            return -105;
        }
        int nativeAddVideoTrack = nativeAddVideoTrack(j, strArr, strArr2, iArr, iArr2, iArr3, iArr4, iArr5, i, vESizeArr, i3, i2, zArr, f);
        MethodCollector.m26664o(14133);
        return nativeAddVideoTrack;
    }

    public Object initMVResources(String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4, int i5, int i6) {
        MethodCollector.m26663i(13920);
        Object nativeInitMVResources = nativeInitMVResources(this.mNative, str, strArr, strArr2, iArr, str2, i, i2, z, z2, z3, i3, i4, i5, i6);
        MethodCollector.m26664o(13920);
        return nativeInitMVResources;
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean z) {
        float[] fArr2 = fArr;
        MethodCollector.m26663i(13882);
        if (this.mNative == 0) {
            MethodCollector.m26664o(13882);
            return -112;
        }
        if (fArr2 == null) {
            fArr2 = new float[strArr.length];
            Arrays.fill(fArr2, 1.0f);
        }
        int nativeInitVideoEditorMV = nativeInitVideoEditorMV(this.mNative, strArr, iArr, iArr2, iArr3, iArr4, strArr2, iArr5, iArr6, iArr7, iArr8, iArr9, strArr3, strArr4, fArr2, i, z);
        if (nativeInitVideoEditorMV < 0) {
            MethodCollector.m26664o(13882);
            return nativeInitVideoEditorMV;
        }
        this.mHostTrackIndex = nativeInitVideoEditorMV;
        MethodCollector.m26664o(13882);
        return 0;
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean[] zArr, String[] strArr5) {
        float[] fArr2 = fArr;
        MethodCollector.m26663i(13919);
        if (this.mNative == 0) {
            MethodCollector.m26664o(13919);
            return -112;
        }
        if (fArr2 == null) {
            fArr2 = new float[strArr.length];
            Arrays.fill(fArr2, 1.0f);
        }
        int nativeInitVideoEditorMVLoadCache = nativeInitVideoEditorMVLoadCache(this.mNative, strArr, iArr, iArr2, iArr3, iArr4, strArr2, iArr5, iArr6, iArr7, iArr8, iArr9, strArr3, strArr4, fArr2, i, zArr, strArr5);
        if (nativeInitVideoEditorMVLoadCache < 0) {
            MethodCollector.m26664o(13919);
            return nativeInitVideoEditorMVLoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditorMVLoadCache;
        MethodCollector.m26664o(13919);
        return 0;
    }
}
