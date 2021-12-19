package com.p2082ss.android.vesdk.jni;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.NativeCallbacks;
import com.p2082ss.android.ttve.nativePort.TEInterface;
import com.p2082ss.android.ttve.nativePort.TENativeServiceBase;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.ss.android.vesdk.jni.TEBingoInterface */
public class TEBingoInterface extends TENativeServiceBase {
    private int mHostTrackIndex = -1;
    private long mNative;
    private TEInterface mNativeEditor;

    static {
        Covode.recordClassIndex(99673);
    }

    private native int nativeAddVidoeClipWithAlgorithm(long j, String[] strArr);

    private native int nativeCancelExtractVideoFrames(long j, int i);

    private native int nativeCheckScoresFile(long j, String str);

    private native int nativeDeleteVideoClipWithAlgorithm(long j, int i);

    private native int nativeExtractVideoFrames(long j, int i, int i2, int i3, int i4, int i5);

    private native int nativeGenAISolve(long j);

    private native int nativeGenRandomSolve(long j);

    private native List<VEClipAlgorithmParam> nativeGetAllVideoRangeData(long j);

    private native String nativeGetClipPath(long j, int i);

    private native int nativeInitBingoAlgorithm(long j);

    private native int nativeInitVideoEditorWithAlgorithm(long j, String[] strArr, int i);

    private native int nativeInitVideoEditorWithAlgorithmLoadCache(long j, String[] strArr, int i, boolean[] zArr, String[] strArr2);

    private native int nativeMoveVideoClipWithAlgorithm(long j, int i, int i2);

    private native int nativeProcessBingoFrames(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, float f, String str);

    private native int nativeRemoveAllVideoSound(long j);

    private native int nativeRemoveMusic(long j, int i);

    private native int nativeRestoreAllVideoSound(long j);

    private native int nativeSetAIRotation(long j, int i, int i2);

    private native int nativeSetInterimScoresToFile(long j, String str);

    private native int nativeSetMusicAndResult(long j, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4);

    private native int nativeSetMusicAndResultLoadCache(long j, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4, boolean[] zArr, String[] strArr);

    private native int nativeSetMusicCropRatio(long j, int i);

    private native int nativeUpdateAlgorithmFromNormal(long j);

    public void clearNative() {
        this.mNative = 0;
    }

    public int genAISolve() {
        MethodCollector.m26663i(12650);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12650);
            return -112;
        }
        int nativeGenAISolve = nativeGenAISolve(j);
        MethodCollector.m26664o(12650);
        return nativeGenAISolve;
    }

    public List<VEClipAlgorithmParam> getAllVideoRangeData() {
        MethodCollector.m26663i(12770);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12770);
            return null;
        }
        List<VEClipAlgorithmParam> nativeGetAllVideoRangeData = nativeGetAllVideoRangeData(j);
        MethodCollector.m26664o(12770);
        return nativeGetAllVideoRangeData;
    }

    public int getRandomSolve() {
        MethodCollector.m26663i(12651);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12651);
            return -112;
        }
        int nativeGenRandomSolve = nativeGenRandomSolve(j);
        MethodCollector.m26664o(12651);
        return nativeGenRandomSolve;
    }

    public int initBingoAlgorithm() {
        MethodCollector.m26663i(12167);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12167);
            return -112;
        }
        int nativeInitBingoAlgorithm = nativeInitBingoAlgorithm(j);
        MethodCollector.m26664o(12167);
        return nativeInitBingoAlgorithm;
    }

    public int removeAllVideoSound() {
        MethodCollector.m26663i(12648);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12648);
            return -112;
        }
        int nativeRemoveAllVideoSound = nativeRemoveAllVideoSound(j);
        MethodCollector.m26664o(12648);
        return nativeRemoveAllVideoSound;
    }

    public int restoreAllVideoSound() {
        MethodCollector.m26663i(12649);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12649);
            return -112;
        }
        int nativeRestoreAllVideoSound = nativeRestoreAllVideoSound(j);
        MethodCollector.m26664o(12649);
        return nativeRestoreAllVideoSound;
    }

    public int updateAlgorithmFromNormal() {
        MethodCollector.m26663i(12853);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12853);
            return -112;
        }
        int nativeUpdateAlgorithmFromNormal = nativeUpdateAlgorithmFromNormal(j);
        MethodCollector.m26664o(12853);
        return nativeUpdateAlgorithmFromNormal;
    }

    public TEBingoInterface(TEInterface tEInterface) {
        this.mNativeEditor = tEInterface;
        this.mNative = tEInterface.getNativeHandler();
    }

    public int addVidoeClipWithAlgorithm(String[] strArr) {
        MethodCollector.m26663i(12426);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12426);
            return -112;
        }
        int nativeAddVidoeClipWithAlgorithm = nativeAddVidoeClipWithAlgorithm(j, strArr);
        MethodCollector.m26664o(12426);
        return nativeAddVidoeClipWithAlgorithm;
    }

    public int cancelExtractVideoFrames(int i) {
        MethodCollector.m26663i(13043);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13043);
            return -112;
        }
        int nativeCancelExtractVideoFrames = nativeCancelExtractVideoFrames(j, i);
        MethodCollector.m26664o(13043);
        return nativeCancelExtractVideoFrames;
    }

    public int checkScoresFile(String str) {
        MethodCollector.m26663i(12952);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12952);
            return -112;
        }
        int nativeCheckScoresFile = nativeCheckScoresFile(j, str);
        MethodCollector.m26664o(12952);
        return nativeCheckScoresFile;
    }

    public int deleteVideoClipWithAlgorithm(int i) {
        MethodCollector.m26663i(12427);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12427);
            return -112;
        }
        int nativeDeleteVideoClipWithAlgorithm = nativeDeleteVideoClipWithAlgorithm(j, i);
        MethodCollector.m26664o(12427);
        return nativeDeleteVideoClipWithAlgorithm;
    }

    public String getClipPath(int i) {
        MethodCollector.m26663i(12953);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12953);
            return "";
        }
        String nativeGetClipPath = nativeGetClipPath(j, i);
        MethodCollector.m26664o(12953);
        return nativeGetClipPath;
    }

    public int removeMusic(int i) {
        MethodCollector.m26663i(12647);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12647);
            return -112;
        }
        int nativeRemoveMusic = nativeRemoveMusic(j, i);
        MethodCollector.m26664o(12647);
        return nativeRemoveMusic;
    }

    public int setInterimScoresToFile(String str) {
        MethodCollector.m26663i(12951);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12951);
            return -112;
        }
        int nativeSetInterimScoresToFile = nativeSetInterimScoresToFile(j, str);
        MethodCollector.m26664o(12951);
        return nativeSetInterimScoresToFile;
    }

    public int setMusicCropRatio(int i) {
        MethodCollector.m26663i(12950);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12950);
            return -112;
        }
        int nativeSetMusicCropRatio = nativeSetMusicCropRatio(j, i);
        MethodCollector.m26664o(12950);
        return nativeSetMusicCropRatio;
    }

    public int moveVideoClipWithAlgorithm(int i, int i2) {
        MethodCollector.m26663i(12428);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12428);
            return -112;
        }
        int nativeMoveVideoClipWithAlgorithm = nativeMoveVideoClipWithAlgorithm(j, i, i2);
        MethodCollector.m26664o(12428);
        return nativeMoveVideoClipWithAlgorithm;
    }

    public int setAIRotation(int i, int i2) {
        MethodCollector.m26663i(12854);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12854);
            return -112;
        }
        int nativeSetAIRotation = nativeSetAIRotation(j, i, i2);
        MethodCollector.m26664o(12854);
        return nativeSetAIRotation;
    }

    public int initVideoEditorWithAlgorithm(String[] strArr, int i) {
        MethodCollector.m26663i(12313);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12313);
            return -112;
        }
        int nativeInitVideoEditorWithAlgorithm = nativeInitVideoEditorWithAlgorithm(j, strArr, i);
        if (nativeInitVideoEditorWithAlgorithm < 0) {
            MethodCollector.m26664o(12313);
            return nativeInitVideoEditorWithAlgorithm;
        }
        this.mHostTrackIndex = nativeInitVideoEditorWithAlgorithm;
        MethodCollector.m26664o(12313);
        return 0;
    }

    public int initVideoEditorWithAlgorithm(String[] strArr, int i, boolean[] zArr, String[] strArr2) {
        MethodCollector.m26663i(12314);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12314);
            return -112;
        }
        int nativeInitVideoEditorWithAlgorithmLoadCache = nativeInitVideoEditorWithAlgorithmLoadCache(j, strArr, i, zArr, strArr2);
        if (nativeInitVideoEditorWithAlgorithmLoadCache < 0) {
            MethodCollector.m26664o(12314);
            return nativeInitVideoEditorWithAlgorithmLoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditorWithAlgorithmLoadCache;
        MethodCollector.m26664o(12314);
        return 0;
    }

    public int extractVideoFrames(int i, int i2, int i3, int i4, int i5, final VEListener.AbstractC85240i iVar) {
        MethodCollector.m26663i(13123);
        if (this.mNative == 0) {
            MethodCollector.m26664o(13123);
            return -112;
        }
        this.mNativeEditor.setExtractFrameProcessCallback(new NativeCallbacks.AbstractC30702b() {
            /* class com.p2082ss.android.vesdk.jni.TEBingoInterface.C855161 */

            static {
                Covode.recordClassIndex(99674);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30702b
            /* renamed from: a */
            public final void mo55086a(float f) {
                VEListener.AbstractC85240i iVar = iVar;
                if (iVar != null) {
                    iVar.mo111019a(f);
                }
            }
        });
        int nativeExtractVideoFrames = nativeExtractVideoFrames(this.mNative, i, i2, i3, i4, i5);
        MethodCollector.m26664o(13123);
        return nativeExtractVideoFrames;
    }

    public int processBingoFrames(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, float f, String str) {
        MethodCollector.m26663i(13202);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13202);
            return -112;
        }
        int nativeProcessBingoFrames = nativeProcessBingoFrames(j, byteBuffer, byteBuffer2, i, i2, f, str);
        MethodCollector.m26664o(13202);
        return nativeProcessBingoFrames;
    }

    public int setMusicAndResult(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4) {
        MethodCollector.m26663i(12540);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12540);
            return -112;
        }
        int nativeSetMusicAndResult = nativeSetMusicAndResult(j, i, i2, str, str2, str3, str4, str5, str6, i3, i4);
        MethodCollector.m26664o(12540);
        return nativeSetMusicAndResult;
    }

    public int setMusicAndResultLoadCache(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, boolean[] zArr, String[] strArr) {
        MethodCollector.m26663i(12646);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12646);
            return -112;
        }
        int nativeSetMusicAndResultLoadCache = nativeSetMusicAndResultLoadCache(j, i, i2, str, str2, str3, str4, str5, str6, i3, i4, zArr, strArr);
        MethodCollector.m26664o(12646);
        return nativeSetMusicAndResultLoadCache;
    }
}
