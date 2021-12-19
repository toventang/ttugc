package com.p2082ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.model.VEMusicWaveBean;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85615x;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttve.nativePort.TEVideoUtils */
public final class TEVideoUtils {
    private static long getFrameInterval = 1000;

    /* renamed from: com.ss.android.ttve.nativePort.TEVideoUtils$CompileProbeListener */
    public interface CompileProbeListener {
        static {
            Covode.recordClassIndex(37310);
        }

        void onCompileProbeResult(int i, int i2, float f, int i3, int i4, int i5, int i6, float f2);
    }

    /* renamed from: com.ss.android.ttve.nativePort.TEVideoUtils$CompileProbeListener2 */
    public interface CompileProbeListener2 {
        static {
            Covode.recordClassIndex(37311);
        }

        void onCompileProbeResult2(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, float f3);
    }

    /* renamed from: com.ss.android.ttve.nativePort.TEVideoUtils$ExecuteCommandAndDumpInfoListener */
    public interface ExecuteCommandAndDumpInfoListener {
        static {
            Covode.recordClassIndex(37312);
        }

        void updateFFmpegInfo(String str);
    }

    /* renamed from: com.ss.android.ttve.nativePort.TEVideoUtils$ExecuteCommandListener */
    public interface ExecuteCommandListener {
        static {
            Covode.recordClassIndex(37313);
        }

        void onProgressChanged(int i);
    }

    public static native void nativeCancelCompileProbe();

    private static native int nativeCheckAudioFile(String str);

    private static native int nativeCheckMVResourceIntegrity(String str);

    private static native int nativeCheckMp3File(String str);

    private static native int nativeClearWavSeg(String str, int i, int i2);

    public static native int nativeCompileProbe(String str, String str2, int i, int i2, long j, long j2, int i3, int i4, int i5, long j3, double d, CompileProbeListener compileProbeListener, CompileProbeListener2 compileProbeListener2, int i6);

    private static native int nativeConcat(String[] strArr, String str, int i);

    public static native int nativeConcatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4);

    public static native int nativeConverBitmapToRGBA(Bitmap bitmap, String str);

    public static native int nativeConverRGBAToIMG(String str, String str2, int i, int i2);

    public static native int nativeConvertJpegToMp4(String str, String str2, int i, boolean z);

    public static native long nativeCreateCurveSpeedUtils(float[] fArr, float[] fArr2);

    private static native long nativeCreateGetFrameHandler(String str);

    private static native long nativeCreateRTAudioWaveformMgr(int i, int i2, float f, int i3);

    public static native void nativeCurveSpeedDestroy(long j);

    private static native int nativeDeleteRTAudioWaveformMgr(long j);

    public static native int nativeDetachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3, int i4);

    private static native int nativeExecuteFFmpegCommand(String str, ExecuteCommandListener executeCommandListener);

    private static native int nativeExecuteFFmpegCommandAndDumpInfo(String str, ExecuteCommandListener executeCommandListener, ExecuteCommandAndDumpInfoListener executeCommandAndDumpInfoListener);

    private static native int nativeExtractVideo(String str, String str2);

    public static native int nativeFindAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3);

    private static native String nativeFindBestRemuxSuffix(String str);

    private static native int nativeGenerateMuteWav(String str, int i, int i2, int i3);

    private static native int nativeGetAVFileInfoFromXml(String str, int[] iArr);

    private static native Object nativeGetAudioAlgorithmResult(String str, String str2, int i, int i2);

    private static native int nativeGetAudioFileInfo(String str, int[] iArr);

    private static native int nativeGetAudioFileInfoForAllTracks(String str, int[][] iArr);

    private static native double nativeGetAudioVolume(byte[] bArr, int i, int i2, int i3);

    private static native VEMusicWaveBean nativeGetAudioWaveData(String str, int i, int i2, int i3, int i4, int i5);

    public static native double nativeGetAveCurveSpeed(long j);

    public static native double nativeGetCurveSpeedWithSeqDelta(long j, long j2);

    private static native void nativeGetDstBitmapSize(long j, int i, int i2, int[] iArr);

    private static native int nativeGetFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z);

    private static native Object nativeGetFileInfo(String str, int[] iArr);

    private static native int nativeGetFileType(String str);

    private static native int nativeGetFrameWithHandler(long j, Bitmap bitmap, int i, int i2, int i3, boolean z);

    private static native String nativeGetInfostickerConvertTotemplate(String str);

    private static native Object nativeGetMVAlgorithmConfigs(String str, String[] strArr, int i);

    private static native int nativeGetMusicDefaultAlgorithm(String str, String str2);

    private static native VEMusicWaveBean nativeGetResampleMusicWaveData(float[] fArr, int i, int i2);

    private static native Object nativeGetVEFileInfo(String str);

    private static native int nativeGetVideoFrame(String str, int[] iArr, int i, int i2, boolean z, Object obj, int i3);

    private static native int nativeGetVideoFrame2(String str, int[] iArr, int i, int i2, boolean z, Object obj);

    private static native int nativeGetVideoFrame3(String str, int[] iArr, int i, int i2, boolean z, Object obj);

    private static native int nativeGetVideoFrameData(String str, int i, int i2, int i3, int i4, int i5, Object obj);

    private static native int nativeGetVideoFrameMore(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, Object obj);

    private static native int nativeGetVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4);

    private static native long nativeInitResampleContext(int i, int i2, int i3, int i4);

    private static native int nativeIsByteVC110Bit(byte[] bArr);

    private static native int nativeIsCanImport(String str);

    private static native int nativeIsCanImportFd(int i, long j, long j2);

    private static native int nativeIsCanTransCode(String str, int i, int i2);

    private static native int nativeIsCanTransCodeWithResult(String str, int i, int i2, String[] strArr);

    private static native boolean nativeIsFrameCanDrop(ByteBuffer byteBuffer, int i, boolean z);

    private static native boolean nativeIsSupportGLES3();

    private static native long nativeLoadModel(int i, String str);

    public static native long nativeMapSeqDeltaToTrimDelta(long j, long j2);

    public static native long nativeMapTrimDeltaToSeqDelta(long j, long j2);

    private static native int nativeMixAudio(ArrayList<String> arrayList, String str, Object obj);

    private static native int nativeMux(String str, String str2, String str3);

    private static native int nativePcmResampleFilter(long j, byte[] bArr, byte[] bArr2, int i, int i2);

    private static native int nativeProcessAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f, float f2, String str, String str2);

    private static native int nativeRTAudioWaveformFinish(long j);

    private static native int nativeRTAudioWaveformGetPoints(long j, float[] fArr, int i, int i2);

    private static native int nativeRTAudioWaveformProcess(long j, float[][] fArr, int i, int i2);

    private static native int nativeRTAudioWaveformReset(long j);

    private static native void nativeReleaseGetFrameHandler(long j);

    private static native int nativeReleaseGetFramesReader();

    private static native void nativeReleaseResampleContext(long j);

    private static native void nativeResetModel(long j);

    private static native int nativeReverseAllIFrameVideoAndMuxAudio(String str, String str2, String str3);

    private static native int nativeReverseAllIFrameVideoAndMuxAudio2(String str, String str2, String str3, TEReverseCallback tEReverseCallback);

    private static native int nativeReverseAllIVideo(String str, String str2);

    private static native int nativeReverseAllIVideo2(String str, String str2, TEReverseCallback tEReverseCallback);

    private static native int nativeSaveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, int i3, int i4);

    public static native int nativeSetCurveSpeedData(long j, float[] fArr, float[] fArr2);

    public static native void nativeSetSeqDuration(long j, long j2);

    private static native int nativeSplitVideo(String str, String[] strArr, int[] iArr, boolean z);

    private static native int nativeTransCodecAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5);

    private static native int nativeTrimFile(String str, String str2, int[] iArr, int[] iArr2);

    private static native double nativeVoiceActivityDetection(byte[] bArr, long j, int i, int i2);

    /* renamed from: com.ss.android.ttve.nativePort.TEVideoUtils$a */
    public enum EnumC30710a {
        YUV(0),
        Y(1),
        U(2),
        V(3);
        

        /* renamed from: a */
        private final int f73443a;

        public final int getValue() {
            return this.f73443a;
        }

        static {
            Covode.recordClassIndex(37314);
        }

        private EnumC30710a(int i) {
            this.f73443a = i;
        }
    }

    static {
        Covode.recordClassIndex(37309);
        C30731d.m63114a();
    }

    public static boolean isSupportGLES3() {
        MethodCollector.m26663i(9269);
        boolean nativeIsSupportGLES3 = nativeIsSupportGLES3();
        MethodCollector.m26664o(9269);
        return nativeIsSupportGLES3;
    }

    public static int releaseGetFramesReader() {
        MethodCollector.m26663i(10485);
        int nativeReleaseGetFramesReader = nativeReleaseGetFramesReader();
        MethodCollector.m26664o(10485);
        return nativeReleaseGetFramesReader;
    }

    public static int checkAudioFile(String str) {
        MethodCollector.m26663i(8206);
        int nativeCheckAudioFile = nativeCheckAudioFile(str);
        MethodCollector.m26664o(8206);
        return nativeCheckAudioFile;
    }

    public static int checkMVResourceIntegrity(String str) {
        MethodCollector.m26663i(5119);
        int nativeCheckMVResourceIntegrity = nativeCheckMVResourceIntegrity(str);
        MethodCollector.m26664o(5119);
        return nativeCheckMVResourceIntegrity;
    }

    public static int checkMp3File(String str) {
        MethodCollector.m26663i(8205);
        int nativeCheckMp3File = nativeCheckMp3File(str);
        MethodCollector.m26664o(8205);
        return nativeCheckMp3File;
    }

    public static long createGetFrameHandler(String str) {
        MethodCollector.m26663i(4100);
        long nativeCreateGetFrameHandler = nativeCreateGetFrameHandler(str);
        MethodCollector.m26664o(4100);
        return nativeCreateGetFrameHandler;
    }

    public static int deleteRTAudioWaveformMgr(long j) {
        MethodCollector.m26663i(9113);
        int nativeDeleteRTAudioWaveformMgr = nativeDeleteRTAudioWaveformMgr(j);
        MethodCollector.m26664o(9113);
        return nativeDeleteRTAudioWaveformMgr;
    }

    public static int getFileType(String str) {
        MethodCollector.m26663i(4085);
        int nativeGetFileType = nativeGetFileType(str);
        MethodCollector.m26664o(4085);
        return nativeGetFileType;
    }

    public static String getInfostickerConvertTotemplate(String str) {
        MethodCollector.m26663i(5054);
        String nativeGetInfostickerConvertTotemplate = nativeGetInfostickerConvertTotemplate(str);
        MethodCollector.m26664o(5054);
        return nativeGetInfostickerConvertTotemplate;
    }

    public static Object getVEVideoFileInfo(String str) {
        MethodCollector.m26663i(7609);
        Object nativeGetVEFileInfo = nativeGetVEFileInfo(str);
        MethodCollector.m26664o(7609);
        return nativeGetVEFileInfo;
    }

    public static int isByteVC110Bit(byte[] bArr) {
        MethodCollector.m26663i(9271);
        int nativeIsByteVC110Bit = nativeIsByteVC110Bit(bArr);
        MethodCollector.m26664o(9271);
        return nativeIsByteVC110Bit;
    }

    public static void releaseGetFrameHandler(long j) {
        MethodCollector.m26663i(4198);
        nativeReleaseGetFrameHandler(j);
        MethodCollector.m26664o(4198);
    }

    public static void releaseResampleContext(long j) {
        MethodCollector.m26663i(4873);
        nativeReleaseResampleContext(j);
        MethodCollector.m26664o(4873);
    }

    public static void resetModel(long j) {
        MethodCollector.m26663i(8494);
        nativeResetModel(j);
        MethodCollector.m26664o(8494);
    }

    public static int rtAudioWaveformFinish(long j) {
        MethodCollector.m26663i(9268);
        int nativeRTAudioWaveformFinish = nativeRTAudioWaveformFinish(j);
        MethodCollector.m26664o(9268);
        return nativeRTAudioWaveformFinish;
    }

    public static int rtAudioWaveformReset(long j) {
        MethodCollector.m26663i(9267);
        int nativeRTAudioWaveformReset = nativeRTAudioWaveformReset(j);
        MethodCollector.m26664o(9267);
        return nativeRTAudioWaveformReset;
    }

    public static int isCanImport(String str) {
        MethodCollector.m26663i(9270);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(9270);
            return -100;
        }
        int nativeIsCanImport = nativeIsCanImport(str);
        MethodCollector.m26664o(9270);
        return nativeIsCanImport;
    }

    public static String findBestRemuxSuffix(String str) {
        MethodCollector.m26663i(9576);
        if (str.length() > 0) {
            String nativeFindBestRemuxSuffix = nativeFindBestRemuxSuffix(str);
            if (nativeFindBestRemuxSuffix.length() > 0) {
                MethodCollector.m26664o(9576);
                return nativeFindBestRemuxSuffix;
            }
            C85615x xVar = new C85615x(-205, "This file does not support re-packaging for the time being!");
            MethodCollector.m26664o(9576);
            throw xVar;
        }
        C85615x xVar2 = new C85615x(-100, "Please check the input parameters!");
        MethodCollector.m26664o(9576);
        throw xVar2;
    }

    public static int ConverBitmapToRGBA(Bitmap bitmap, String str) {
        MethodCollector.m26663i(4998);
        int nativeConverBitmapToRGBA = nativeConverBitmapToRGBA(bitmap, str);
        MethodCollector.m26664o(4998);
        return nativeConverBitmapToRGBA;
    }

    public static int concat(String[] strArr, String str) {
        MethodCollector.m26663i(7302);
        int nativeConcat = nativeConcat(strArr, str, 0);
        MethodCollector.m26664o(7302);
        return nativeConcat;
    }

    public static long createCurveSpeedUtils(float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(8807);
        long nativeCreateCurveSpeedUtils = nativeCreateCurveSpeedUtils(fArr, fArr2);
        MethodCollector.m26664o(8807);
        return nativeCreateCurveSpeedUtils;
    }

    public static int executeFFmpegCommand(String str, ExecuteCommandListener executeCommandListener) {
        MethodCollector.m26663i(4615);
        int nativeExecuteFFmpegCommand = nativeExecuteFFmpegCommand(str, executeCommandListener);
        MethodCollector.m26664o(4615);
        return nativeExecuteFFmpegCommand;
    }

    public static int extractVideo(String str, String str2) {
        MethodCollector.m26663i(9871);
        int nativeExtractVideo = nativeExtractVideo(str, str2);
        MethodCollector.m26664o(9871);
        return nativeExtractVideo;
    }

    public static int getAVFileInfoFromXml(String str, int[] iArr) {
        MethodCollector.m26663i(7912);
        int nativeGetAVFileInfoFromXml = nativeGetAVFileInfoFromXml(str, iArr);
        MethodCollector.m26664o(7912);
        return nativeGetAVFileInfoFromXml;
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        MethodCollector.m26663i(8068);
        int nativeGetAudioFileInfo = nativeGetAudioFileInfo(str, iArr);
        MethodCollector.m26664o(8068);
        return nativeGetAudioFileInfo;
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        MethodCollector.m26663i(8496);
        int nativeGetAudioFileInfoForAllTracks = nativeGetAudioFileInfoForAllTracks(str, iArr);
        MethodCollector.m26664o(8496);
        return nativeGetAudioFileInfoForAllTracks;
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        MethodCollector.m26663i(4992);
        int nativeGetMusicDefaultAlgorithm = nativeGetMusicDefaultAlgorithm(str, str2);
        MethodCollector.m26664o(4992);
        return nativeGetMusicDefaultAlgorithm;
    }

    public static Object getVideoFileInfo(String str, int[] iArr) {
        MethodCollector.m26663i(7776);
        Object nativeGetFileInfo = nativeGetFileInfo(str, iArr);
        MethodCollector.m26664o(7776);
        return nativeGetFileInfo;
    }

    public static long loadModel(int i, String str) {
        MethodCollector.m26663i(8345);
        long nativeLoadModel = nativeLoadModel(i, str);
        MethodCollector.m26664o(8345);
        return nativeLoadModel;
    }

    public static int reverseAllIVideo(String str, String str2) {
        MethodCollector.m26663i(4876);
        int nativeReverseAllIVideo = nativeReverseAllIVideo(str, str2);
        MethodCollector.m26664o(4876);
        return nativeReverseAllIVideo;
    }

    public static Object getMVAlgorithmConfigs(String str, List<String> list) {
        MethodCollector.m26663i(5057);
        int size = list.size();
        String[] strArr = new String[size];
        list.toArray(strArr);
        Object nativeGetMVAlgorithmConfigs = nativeGetMVAlgorithmConfigs(str, strArr, size);
        MethodCollector.m26664o(5057);
        return nativeGetMVAlgorithmConfigs;
    }

    public static int clearWavSeg(String str, int i, int i2) {
        MethodCollector.m26663i(10029);
        int nativeClearWavSeg = nativeClearWavSeg(str, i, i2);
        MethodCollector.m26664o(10029);
        return nativeClearWavSeg;
    }

    public static int executeFFmpegCommandAndDumpInfo(String str, ExecuteCommandListener executeCommandListener, ExecuteCommandAndDumpInfoListener executeCommandAndDumpInfoListener) {
        MethodCollector.m26663i(4701);
        int nativeExecuteFFmpegCommandAndDumpInfo = nativeExecuteFFmpegCommandAndDumpInfo(str, executeCommandListener, executeCommandAndDumpInfoListener);
        MethodCollector.m26664o(4701);
        return nativeExecuteFFmpegCommandAndDumpInfo;
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
        MethodCollector.m26663i(8651);
        VEMusicWaveBean nativeGetResampleMusicWaveData = nativeGetResampleMusicWaveData(fArr, i, i2);
        MethodCollector.m26664o(8651);
        return nativeGetResampleMusicWaveData;
    }

    public static int isCanTransCode(String str, int i, int i2) {
        MethodCollector.m26663i(4856);
        int nativeIsCanTransCode = nativeIsCanTransCode(str, i, i2);
        MethodCollector.m26664o(4856);
        return nativeIsCanTransCode;
    }

    public static boolean isFrameCanDrop(ByteBuffer byteBuffer, int i, boolean z) {
        MethodCollector.m26663i(9423);
        boolean nativeIsFrameCanDrop = nativeIsFrameCanDrop(byteBuffer, i, z);
        MethodCollector.m26664o(9423);
        return nativeIsFrameCanDrop;
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, Object obj) {
        MethodCollector.m26663i(9872);
        int nativeMixAudio = nativeMixAudio(arrayList, str, obj);
        MethodCollector.m26664o(9872);
        return nativeMixAudio;
    }

    public static int mux(String str, String str2, String str3) {
        MethodCollector.m26663i(7449);
        int nativeMux = nativeMux(str, str2, str3);
        MethodCollector.m26664o(7449);
        return nativeMux;
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3) {
        MethodCollector.m26663i(4907);
        int nativeReverseAllIFrameVideoAndMuxAudio = nativeReverseAllIFrameVideoAndMuxAudio(str, str2, str3);
        MethodCollector.m26664o(4907);
        return nativeReverseAllIFrameVideoAndMuxAudio;
    }

    public static int concat(String[] strArr, String str, int i) {
        MethodCollector.m26663i(7157);
        int nativeConcat = nativeConcat(strArr, str, i);
        MethodCollector.m26664o(7157);
        return nativeConcat;
    }

    public static int isCanImportFd(int i, long j, long j2) {
        MethodCollector.m26663i(9422);
        if (i <= 0) {
            MethodCollector.m26664o(9422);
            return -100;
        }
        int nativeIsCanImportFd = nativeIsCanImportFd(i, j, j2);
        MethodCollector.m26664o(9422);
        return nativeIsCanImportFd;
    }

    public static int reverseAllIVideo(String str, String str2, TEReverseCallback tEReverseCallback) {
        MethodCollector.m26663i(4954);
        int nativeReverseAllIVideo2 = nativeReverseAllIVideo2(str, str2, tEReverseCallback);
        MethodCollector.m26664o(4954);
        return nativeReverseAllIVideo2;
    }

    public static int ConverRGBAToIMG(String str, String str2, int i, int i2) {
        MethodCollector.m26663i(4997);
        int nativeConverRGBAToIMG = nativeConverRGBAToIMG(str, str2, i, i2);
        MethodCollector.m26664o(4997);
        return nativeConverRGBAToIMG;
    }

    public static int convertJpegToMp4(String str, String str2, int i, boolean z) {
        MethodCollector.m26663i(5001);
        int nativeConvertJpegToMp4 = nativeConvertJpegToMp4(str, str2, i, z);
        MethodCollector.m26664o(5001);
        return nativeConvertJpegToMp4;
    }

    public static long createRTAudioWaveformMgr(int i, int i2, float f, int i3) {
        MethodCollector.m26663i(8956);
        long nativeCreateRTAudioWaveformMgr = nativeCreateRTAudioWaveformMgr(i, i2, f, i3);
        MethodCollector.m26664o(8956);
        return nativeCreateRTAudioWaveformMgr;
    }

    public static int generateMuteWav(String str, int i, int i2, int i3) {
        MethodCollector.m26663i(10028);
        int nativeGenerateMuteWav = nativeGenerateMuteWav(str, i, i2, i3);
        MethodCollector.m26664o(10028);
        return nativeGenerateMuteWav;
    }

    public static Object getAudioAlgorithmResult(String str, String str2, int i, int i2) {
        MethodCollector.m26663i(4994);
        Object nativeGetAudioAlgorithmResult = nativeGetAudioAlgorithmResult(str, str2, i, i2);
        MethodCollector.m26664o(4994);
        return nativeGetAudioAlgorithmResult;
    }

    public static double getAudioVolume(byte[] bArr, int i, int i2, int i3) {
        MethodCollector.m26663i(8344);
        double nativeGetAudioVolume = nativeGetAudioVolume(bArr, i, i2, i3);
        MethodCollector.m26664o(8344);
        return nativeGetAudioVolume;
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z) {
        MethodCollector.m26663i(9870);
        int nativeGetFileAudio = nativeGetFileAudio(str, str2, arrayList, z);
        MethodCollector.m26664o(9870);
        return nativeGetFileAudio;
    }

    public static long initResampleContext(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(4865);
        long nativeInitResampleContext = nativeInitResampleContext(i, i2, i3, i4);
        MethodCollector.m26664o(4865);
        return nativeInitResampleContext;
    }

    public static int isCanTransCodeWithResult(String str, int i, int i2, String[] strArr) {
        MethodCollector.m26663i(4862);
        int nativeIsCanTransCodeWithResult = nativeIsCanTransCodeWithResult(str, i, i2, strArr);
        MethodCollector.m26664o(4862);
        return nativeIsCanTransCodeWithResult;
    }

    public static int rtAudioWaveformGetPoints(long j, float[] fArr, int i, int i2) {
        MethodCollector.m26663i(9115);
        int nativeRTAudioWaveformGetPoints = nativeRTAudioWaveformGetPoints(j, fArr, i, i2);
        MethodCollector.m26664o(9115);
        return nativeRTAudioWaveformGetPoints;
    }

    public static int rtAudioWaveformProcess(long j, float[][] fArr, int i, int i2) {
        MethodCollector.m26663i(9114);
        int nativeRTAudioWaveformProcess = nativeRTAudioWaveformProcess(j, fArr, i, i2);
        MethodCollector.m26664o(9114);
        return nativeRTAudioWaveformProcess;
    }

    public static int splitVideo(String str, String[] strArr, int[] iArr, boolean z) {
        MethodCollector.m26663i(7608);
        int nativeSplitVideo = nativeSplitVideo(str, strArr, iArr, z);
        MethodCollector.m26664o(7608);
        return nativeSplitVideo;
    }

    public static int trimVideoFile(String str, int[] iArr, String str2, int[] iArr2) {
        MethodCollector.m26663i(4990);
        int nativeTrimFile = nativeTrimFile(str, str2, iArr, iArr2);
        MethodCollector.m26664o(4990);
        return nativeTrimFile;
    }

    public static double voiceActivityDetection(byte[] bArr, long j, int i, int i2) {
        MethodCollector.m26663i(8493);
        double nativeVoiceActivityDetection = nativeVoiceActivityDetection(bArr, j, i, i2);
        MethodCollector.m26664o(8493);
        return nativeVoiceActivityDetection;
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3, TEReverseCallback tEReverseCallback) {
        MethodCollector.m26663i(4988);
        int nativeReverseAllIFrameVideoAndMuxAudio2 = nativeReverseAllIFrameVideoAndMuxAudio2(str, str2, str3, tEReverseCallback);
        MethodCollector.m26664o(4988);
        return nativeReverseAllIFrameVideoAndMuxAudio2;
    }

    public static int findAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3) {
        MethodCollector.m26663i(4995);
        int nativeFindAudioSegmentStartTimeInOrigin = nativeFindAudioSegmentStartTimeInOrigin(str, i, str2, i2, i3);
        MethodCollector.m26664o(4995);
        return nativeFindAudioSegmentStartTimeInOrigin;
    }

    public static int pcmResampleFilter(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        MethodCollector.m26663i(4871);
        int nativePcmResampleFilter = nativePcmResampleFilter(j, bArr, bArr2, i, i2);
        MethodCollector.m26664o(4871);
        return nativePcmResampleFilter;
    }

    public static Bitmap getFrameWithHandler(long j, int i, int i2, int i3, boolean z) {
        MethodCollector.m26663i(4117);
        int[] iArr = new int[2];
        nativeGetDstBitmapSize(j, i2, i3, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            MethodCollector.m26664o(4117);
            return null;
        }
        if (nativeGetFrameWithHandler(j, createBitmap, i, iArr[0], iArr[1], z) != 0) {
            if (!createBitmap.isRecycled()) {
                createBitmap.recycle();
            }
            createBitmap = null;
        }
        MethodCollector.m26664o(4117);
        return createBitmap;
    }

    public static VEMusicWaveBean getAudioWaveData(String str, int i, int i2, int i3, int i4, int i5) {
        MethodCollector.m26663i(8498);
        VEMusicWaveBean nativeGetAudioWaveData = nativeGetAudioWaveData(str, i, i2, i3, i4, i5);
        MethodCollector.m26664o(8498);
        return nativeGetAudioWaveData;
    }

    public static int getVideoFrames2(String str, int[] iArr, int i, int i2, boolean z, Object obj) {
        MethodCollector.m26663i(10344);
        int nativeGetVideoFrame2 = nativeGetVideoFrame2(str, iArr, i, i2, z, obj);
        MethodCollector.m26664o(10344);
        return nativeGetVideoFrame2;
    }

    public static int getVideoFrames3(String str, int[] iArr, int i, int i2, boolean z, Object obj) {
        MethodCollector.m26663i(10345);
        int nativeGetVideoFrame3 = nativeGetVideoFrame3(str, iArr, i, i2, z, obj);
        MethodCollector.m26664o(10345);
        return nativeGetVideoFrame3;
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, Object obj, int i3) {
        MethodCollector.m26663i(10187);
        int nativeGetVideoFrame = nativeGetVideoFrame(str, iArr, i, i2, z, obj, i3);
        MethodCollector.m26664o(10187);
        return nativeGetVideoFrame;
    }

    public static int processAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f, float f2, String str, String str2) {
        MethodCollector.m26663i(9725);
        int nativeProcessAudioTuning = nativeProcessAudioTuning(strArr, iArr, iArr2, f, f2, str, str2);
        MethodCollector.m26664o(9725);
        return nativeProcessAudioTuning;
    }

    public static int getVideoFrameData(String str, int i, int i2, int i3, int i4, EnumC30710a aVar, Object obj) {
        MethodCollector.m26663i(10186);
        int nativeGetVideoFrameData = nativeGetVideoFrameData(str, i, i2, i3, i4, aVar.getValue(), obj);
        MethodCollector.m26664o(10186);
        return nativeGetVideoFrameData;
    }

    public static int transCodeAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5) {
        MethodCollector.m26663i(9577);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(9577);
            return -100;
        } else if (TextUtils.isEmpty(str2)) {
            MethodCollector.m26664o(9577);
            return -100;
        } else {
            int nativeTransCodecAudioFile = nativeTransCodecAudioFile(str, i, i2, str2, i3, i4, i5);
            MethodCollector.m26664o(9577);
            return nativeTransCodecAudioFile;
        }
    }

    public static int getVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4) {
        MethodCollector.m26663i(4319);
        int nativeGetVideoThumb = nativeGetVideoThumb(str, i, obj, z, i2, i3, j, i4);
        MethodCollector.m26664o(4319);
        return nativeGetVideoThumb;
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, int i3, int i4) {
        MethodCollector.m26663i(10486);
        int nativeSaveVideoFrames = nativeSaveVideoFrames(str, iArr, i, i2, z, str2, i3, i4);
        MethodCollector.m26664o(10486);
        return nativeSaveVideoFrames;
    }

    public static int getVideoFramesMore(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, Object obj) {
        MethodCollector.m26663i(4088);
        int nativeGetVideoFrameMore = nativeGetVideoFrameMore(str, iArr, i, i2, z, z2, i3, z3, obj);
        MethodCollector.m26664o(4088);
        return nativeGetVideoFrameMore;
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3) {
        MethodCollector.m26663i(4385);
        int nativeDetachAudioFromVideos = nativeDetachAudioFromVideos(str, strArr, jArr, jArr2, j, j2, fArr, i, i2, i3, 0);
        MethodCollector.m26664o(4385);
        return nativeDetachAudioFromVideos;
    }

    public static int concatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        MethodCollector.m26663i(5187);
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || strArr.length == 0 || jArr.length != strArr.length || strArr.length != strArr2.length || strArr.length != jArr2.length) {
            C85315al.m146642d("TEVideoUtils", "ConmatRecordFrag parameter error!");
            MethodCollector.m26664o(5187);
            return -100;
        }
        File file = new File(str3.substring(0, str3.lastIndexOf("/")));
        if (file.exists() || file.mkdirs()) {
            File file2 = new File(str4.substring(0, str4.lastIndexOf("/")));
            if (file2.exists() || file2.mkdirs()) {
                int nativeConcatRecordFrag = nativeConcatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
                MethodCollector.m26664o(5187);
                return nativeConcatRecordFrag;
            }
            C85315al.m146642d("TEVideoUtils", "create audio output dir failed. Output audio Directory: ".concat(String.valueOf(str4)));
            MethodCollector.m26664o(5187);
            return -114;
        }
        C85315al.m146642d("TEVideoUtils", "create video output dir failed. Output Video Directory: ".concat(String.valueOf(str3)));
        MethodCollector.m26664o(5187);
        return -114;
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(4518);
        int nativeDetachAudioFromVideos = nativeDetachAudioFromVideos(str, strArr, jArr, jArr2, j, j2, fArr, i, i2, i3, i4);
        MethodCollector.m26664o(4518);
        return nativeDetachAudioFromVideos;
    }
}
