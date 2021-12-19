package com.p2082ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.mediacodec.TEAvcEncoder;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.nativePort.NativeCallbacks;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85375aw;
import com.p2082ss.android.vesdk.C85376ax;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.C85392bf;
import com.p2082ss.android.vesdk.C85395bh;
import com.p2082ss.android.vesdk.C85568t;
import com.p2082ss.android.vesdk.EnumC85306ad;
import com.p2082ss.android.vesdk.EnumC85307ae;
import com.p2082ss.android.vesdk.LoudnessDetectResult;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import com.p2082ss.android.vesdk.VEEffectParams;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEMusicSRTEffectParam;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.VEStickerAnimator;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import com.p2082ss.android.vesdk.clipparam.VEAICutOutClipParam;
import com.p2082ss.android.vesdk.clipparam.VEClipAuxiliaryParam;
import com.p2082ss.android.vesdk.clipparam.VEClipParam;
import com.p2082ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p2082ss.android.vesdk.clipparam.VEClipVideoFileInfoParam;
import com.p2082ss.android.vesdk.clipparam.VECommonClipParam;
import com.p2082ss.android.vesdk.filterparam.VEAmazingFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEBeautyFilterParam;
import com.p2082ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEColorFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEColorHslFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEComposerFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEEffectHdrFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEImageAddFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.p2082ss.android.vesdk.filterparam.VELensHdrFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEMultiComposerFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEReshapeFilterParam;
import com.p2082ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEVideoCropFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEVideoLensOneKeyHdrParam;
import com.p2082ss.android.vesdk.filterparam.VEVideoStableFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ttve.nativePort.TEInterface */
public final class TEInterface extends TENativeServiceBase {
    public static boolean m_IsConfigedAB = false;
    private int mHostTrackIndex = -1;
    private long mNative;

    private native int nativeAddAudioTrack(long j, String str, int i, int i2, int i3, int i4, boolean z);

    private native int nativeAddAudioTrack2(long j, String str, int i, int i2, int i3, int i4, boolean z, int i5, int i6);

    private native int nativeAddAudioTrackForClips(long j, String[] strArr, int[] iArr, int[] iArr2, float[] fArr);

    private native int nativeAddAudioTrackWithNeedPrepare(long j, String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2);

    private native int nativeAddAudioTrackWithStruct(long j, VECommonClipParam vECommonClipParam, boolean z);

    private native int nativeAddClipAuxiliaryParam(long j, int i, int i2, VEClipAuxiliaryParam[] vEClipAuxiliaryParamArr);

    private native String nativeAddFileInfoCache(long j, String str);

    private native int[] nativeAddFilters(long j, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6);

    private native void nativeAddMetaData(long j, String str, String str2);

    private native int nativeAddSubTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4, int i, int i2);

    private native int nativeAddSubVideoTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i);

    private native int nativeAdjustFilterInOut(long j, int i, int i2, int i3);

    private native int nativeAppendComposerNodes(long j, String[] strArr);

    private static native String nativeAudioExtend(String str, float f, float f2, float f3);

    private static native int nativeAudioHwEncoder(boolean z);

    private native int nativeBeginAudioExtendToFile(long j, String str, String str2, String str3, float f, float f2, float f3);

    private static native int nativeBingoRefactor(boolean z);

    private native int nativeCancelAudioExtendToFile(long j);

    private native int nativeCancelGetImages(long j);

    private native int nativeChangeResWithEffect(long j, boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, int[] iArr5);

    private native int nativeChangeTransitonAt(long j, int i, VETransitionFilterParam vETransitionFilterParam);

    private native int[] nativeCheckComposerNodeExclusion(long j, String str, String str2, String str3);

    private native void nativeClearDisplay(long j, int i);

    private native int nativeClearFilter(long j);

    private native int nativeConcatShootVideo(long j, String str, String[] strArr, long[] jArr, boolean z);

    private static native int nativeConfigMaxCacheFrameCount(int i);

    private native long nativeCreateEngine(String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeCreateTimeline(long j);

    private native int nativeDeleteAudioTrack(long j, int i, boolean z);

    private native int nativeDeleteClip(long j, int i, int i2, int i3);

    private native int nativeDeleteKeyFrameParam(long j, int i, int i2, int i3);

    private native int nativeDeleteSubVideoTrack(long j, int i);

    private native int nativeDestroyEngine(long j);

    private static native LoudnessDetectResult[] nativeDetectAudioLoudness(String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeDoLensOneKeyHdrDetect(long j);

    private static native int nativeEnableAGFXCtx(boolean z);

    private static native int nativeEnableAndroidHdr2SDRSupport(boolean z);

    private static native int nativeEnableAndroidHdrPreviewSupport(boolean z);

    private native int nativeEnableAudioDisplayCallBack(long j, boolean z);

    private static native int nativeEnableAudioGBU(boolean z);

    private static native int nativeEnableColorSpace2020(boolean z);

    private static native int nativeEnableCompileGLContextReuse(boolean z);

    private static native int nativeEnableConcurrentPreloadOpt(int i);

    private static native int nativeEnableCreateDecoderByName(boolean z);

    private static native int nativeEnableCrossplatformGLBaseFBO(boolean z);

    private static native int nativeEnableDecoderResourceScheduleOptHw(int i);

    private static native int nativeEnableDisplayP3ReEncode(boolean z);

    private static native int nativeEnableDisplayP3Render(boolean z);

    private native int nativeEnableEffect(long j, boolean z);

    private native int nativeEnableEffectAmazing(long j, boolean z);

    private static native int nativeEnableEffectAmazingMV(boolean z);

    private static native int nativeEnableEffectCanvas(boolean z);

    private static native int nativeEnableEffectRenderWithoutGlreadpixels(boolean z);

    private static native int nativeEnableEffectTransiton(boolean z);

    private static native int nativeEnableEngineResourceOpt(boolean z);

    private native int nativeEnableFaceDetect(long j, boolean z);

    private static native int nativeEnableFileInfoCache(boolean z);

    private static native int nativeEnableFirstFrameOpt(boolean z);

    private native int nativeEnableGenderDetect(long j, boolean z);

    private native int nativeEnableHDRSetting(long j, boolean z);

    private static native int nativeEnableHighSpeed(boolean z);

    private native int nativeEnableHighSpeedForSingle(long j, boolean z);

    private static native int nativeEnableImageAlgorithmReuseAndOptForAmazing(boolean z);

    private native int nativeEnableImageEditor(long j, boolean z);

    private static native int nativeEnableLensAsyncInitialize(boolean z);

    private static native int nativeEnableMultiThreadDecode(boolean z);

    private static native int nativeEnableNewAudioMixer(boolean z);

    private static native int nativeEnableOptGLFlush(boolean z);

    private static native int nativeEnableOptPlayBackDropFrame(boolean z);

    private static native int nativeEnableOutResolutionAlign4(boolean z);

    private static native int nativeEnableParallDecodeMatting(boolean z);

    private static native int nativeEnablePinRefactor(boolean z);

    private static native int nativeEnablePipResolutionOpt(boolean z);

    private native void nativeEnableReEncodeOpt(long j, boolean z);

    private static native int nativeEnableReaderManagerRefactor(boolean z);

    private static native int nativeEnableReaderRefactor(boolean z);

    private static native int nativeEnableRefaComposer(boolean z);

    private static native int nativeEnableRenderLib(boolean z);

    private static native int nativeEnableSeekAndPreloadOpt(boolean z);

    private static native int nativeEnableSmartTransDetect(boolean z);

    private static native int nativeEnableTitanUseReaderFactory(boolean z);

    private native int nativeExcAICutOutTask(long j);

    private native int nativeExpandTimeline(long j, int i);

    private native int nativeFaceCoverClear(long j, int i, String str, boolean z);

    private native int nativeFaceCoverClearCache(long j);

    private native int nativeFaceCoverLoad(long j, int i, String[] strArr, int i2, String str, boolean z);

    private native int nativeFaceCoverRestoreAll(long j);

    private native int nativeFaceCoverScale(long j, int i, double d, double d2, double d3, String str, boolean z);

    private native int nativeFaceCoverSet(long j, int i, double d, double d2, String str, boolean z);

    private native int nativeFaceCoverSetDir(long j, String str);

    private native int nativeFlushSeekCmd(long j);

    private static native int nativeForceCompileBytevc1SWdecode(boolean z);

    private static native int nativeForceEditBytevc1SWdecode(boolean z);

    private native int nativeFrameTrace(long j, String str, int i);

    private native long nativeGenEditorStatus(long j);

    private native List<VEClipParam> nativeGetAllClips(long j, int i, int i2);

    private native List<VEClipVideoFileInfoParam> nativeGetAllVideoFileInfos(long j);

    private native byte[] nativeGetAudioCommonFilterPreprocessResult(long j, long j2);

    private native String nativeGetClipInfoString(long j, int i, int i2, int i3);

    private native String nativeGetClipInfoStringWithPath(long j, int i, int i2, int i3, String str);

    private native float nativeGetClipProgress(long j, int i);

    private native long nativeGetClipSequenceOut(long j, int i, int i2, int i3);

    private native float nativeGetColorFilterIntensity(long j, String str);

    private native int nativeGetCurPosition(long j);

    private native int nativeGetCurState(long j);

    private native int[] nativeGetDecodeDumpInfo(long j, int i, int i2);

    private native int nativeGetDecodeImage(long j, Bitmap bitmap, int i, int i2);

    private native int[] nativeGetDisplayDumpSize(long j);

    private native int nativeGetDisplayImage(long j, Bitmap bitmap);

    private native int nativeGetDuration(long j);

    private native long nativeGetDurationUs(long j);

    private native int nativeGetImages(long j, int[] iArr, int i, int i2, int i3);

    private native int[] nativeGetInitResolution(long j);

    private static native Object nativeGetMVInfoStatic(String str);

    private native String nativeGetMetaData(long j, String str);

    private native long nativeGetPCMDeliverHandle(long j);

    private native int nativeGetProcessedImage(long j, Bitmap bitmap);

    private native float nativeGetProjectProgress(long j);

    private native int nativeGetRuntimeGLVersion(long j);

    private native int nativeGetSingleTrackProcessedImage(long j, int i, Bitmap bitmap);

    private native int nativeGetTimeEffectCurPosition(long j);

    private native int nativeGetTimeEffectDuration(long j);

    private native float nativeGetTrackVolume(long j, int i, int i2, int i3);

    private native int nativeGetTransparentImage(long j, Bitmap bitmap);

    private native int nativeInitAudioEditor(long j, String str, String[] strArr, int[] iArr, int[] iArr2, float[] fArr);

    private native int nativeInitAudioExtendToFile(long j);

    private native int nativeInitImageEditor(long j, Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i);

    private native int nativeInitVideoEditor(long j, String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i);

    private native int nativeInitVideoEditor2(long j, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z);

    private native int nativeInitVideoEditor2LoadCache(long j, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z, boolean[] zArr, String[] strArr5);

    private native int nativeInitVideoEditorLoadCache(long j, String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i, boolean[] zArr, String[] strArr5);

    private native int nativeInitVideoEditorWithCanvas(long j, String[] strArr, Bitmap[] bitmapArr, String[] strArr2, int[] iArr, int[] iArr2, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, String[] strArr5, int[] iArr5, int[] iArr6, String[][] strArr6, float[] fArr, int i, VESize[] vESizeArr);

    private native int nativeInitVideoEditorWithStruct(long j, VECommonClipParam[] vECommonClipParamArr, VECommonClipParam[] vECommonClipParamArr2, String[] strArr, int i);

    private native int nativeInsertClip(long j, int i, int i2, int i3, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native boolean nativeIsAudioExtendToFileProcessing(long j);

    private native int nativeIsCompileEncode(long j);

    private native boolean nativeIsGestureRegistered(long j, int i);

    private native int nativeIsWatermarkCompileEncode(long j);

    private native int nativeLockSeekVideoClip(long j, int i);

    private native int nativeMoveClip(long j, int i, int i2, int i3, boolean z);

    private static native int nativeOpenEditorFpsLog(boolean z);

    private static native int nativeOpenOutputCallback(boolean z);

    private native int nativePause(long j, int i);

    private native int nativePauseSync(long j);

    private native int nativePrepareEngine(long j, int i);

    private native int nativePreprocessAudioTrackForFilter(long j, int i, int i2, String str, byte[] bArr, long[] jArr);

    private native int nativeProcessDoubleClickEvent(long j, float f, float f2);

    private native int nativeProcessLongPressEvent(long j, float f, float f2);

    private native int nativeProcessPanEvent(long j, float f, float f2, float f3, float f4, float f5);

    private native int nativeProcessRotationEvent(long j, float f, float f2);

    private native int nativeProcessScaleEvent(long j, float f, float f2);

    private native int nativeProcessTouchDownEvent(long j, float f, float f2, int i);

    private native int nativeProcessTouchEvent(long j, float f, float f2);

    private native boolean nativeProcessTouchEvent2(long j, int i, float f, float f2, float f3, float f4, int i2, int i3);

    private native int nativeProcessTouchMoveEvent(long j, float f, float f2);

    private native int nativeProcessTouchUpEvent(long j, float f, float f2, int i);

    private native int nativePushImageToBuffer(long j, String str);

    private native int nativeRefreshCurrentFrame(long j, int i);

    private native int nativeReleaseEngine(long j);

    private native int nativeReleaseEngineAsync(long j);

    private native void nativeReleasePreviewSurface(long j);

    private native int nativeReloadComposerNodes(long j, String[] strArr);

    private native int nativeRemoveAICutOutClipParam(long j, int i);

    private native int nativeRemoveComposerNodes(long j, String[] strArr);

    private native int nativeRemoveEffectCallback(long j);

    private native int nativeRemoveFilter(long j, int[] iArr);

    private native int nativeReplaceClip(long j, int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native int nativeReplaceComposerNodesWithTag(long j, String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    private native void nativeResetCallback(long j);

    private native int nativeSeek(long j, int i, int i2, int i3, int i4);

    private static native int nativeSeekPredictOpt(boolean z);

    private native int nativeSeekWithResult(long j, int i);

    private native int nativeSeekWithTolerance(long j, int i, int i2, int i3, int i4, int i5);

    private native int nativeSetAlgorithmPreConfig(long j, int i, int i2);

    private native int nativeSetAlgorithmSyncAndNum(long j, boolean z, int i);

    private native void nativeSetBackGroundColor(long j, int i);

    private native int nativeSetClientState(long j, int i);

    private native int nativeSetClipAttr(long j, int i, int i2, int i3, String str, String str2);

    private native int nativeSetCompileAudioDriver(long j, String str, int i, int i2, String str2);

    private static native int nativeSetCompileReport(int i);

    private native int nativeSetComposerMode(long j, int i, int i2);

    private native int nativeSetComposerNodes(long j, String[] strArr);

    private native int nativeSetDestroyVersion(long j, boolean z);

    private native int nativeSetDeviceRotation(long j, float[] fArr, double d);

    private native void nativeSetDisplayState(long j, float f, float f2, float f3, float f4, int i, int i2, int i3);

    private native int nativeSetDldEnabled(long j, boolean z);

    private native int nativeSetDldThrVal(long j, int i);

    private native int nativeSetDleEnabled(long j, boolean z);

    private native int nativeSetDleEnabledPreview(long j, boolean z);

    private static native int nativeSetDropFrameParam(boolean z, long j, long j2);

    private static native int nativeSetEditorFirstFrameDelay(int i);

    private native int nativeSetEffectCacheInt(long j, String str, int i);

    private native int nativeSetEffectCallback(long j, VEListener.VEEditorEffectListener vEEditorEffectListener);

    private native int nativeSetEffectMaxMemoryCache(long j, int i);

    private native int nativeSetEffectParams(long j, VEEffectParams vEEffectParams);

    private native void nativeSetEnableMultipleAudioFilter(long j, boolean z);

    private native void nativeSetEnableRemuxVideo(long j, boolean z);

    private native void nativeSetEncoderParallel(long j, boolean z);

    private native void nativeSetExpandLastFrame(long j, boolean z);

    private native int nativeSetFilterParam(long j, int i, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam);

    private native int nativeSetFilterParam(long j, int i, String str, VEStickerAnimator vEStickerAnimator);

    private native int nativeSetFilterParam(long j, int i, String str, VEEffectFilterParam vEEffectFilterParam);

    private native int nativeSetFilterParam(long j, int i, String str, String str2);

    private native int nativeSetFilterParam2(long j, int i, String str, byte[] bArr);

    private static native int nativeSetForceDropFrameWithoutAudio(boolean z);

    private static native int nativeSetImageBufferLimit(int i, int i2, int i3);

    private static native int nativeSetInfoStickerTransEnable(boolean z);

    private native int nativeSetKeyFrameParam(long j, int i, int i2, int i3, String str);

    private native int nativeSetMaleMakeupState(long j, boolean z);

    private static native int nativeSetMaxAudioReaderCount(int i);

    private static native void nativeSetMaxDetectFrameCount(int i);

    private static native int nativeSetMaxSoftwareVideoReaderCount(int i, int i2, int i3, int i4);

    private static native int nativeSetOptVersion(int i);

    private native void nativeSetOption(long j, int i, String str, float f);

    private native void nativeSetOption(long j, int i, String str, long j2);

    private native void nativeSetOption(long j, int i, String str, String str2);

    private native void nativeSetOptionArray(long j, int i, String[] strArr, long[] jArr);

    private native void nativeSetOptionIntArray(long j, int i, String str, int[] iArr);

    private native void nativeSetOptionLongArray(long j, int i, String str, long[] jArr);

    private native void nativeSetPreviewFps(long j, int i);

    private native int nativeSetPreviewScaleMode(long j, int i);

    private native void nativeSetPreviewSurface(long j, Surface surface);

    private native void nativeSetPreviewSurfaceBitmap(long j, Bitmap bitmap);

    private native void nativeSetSpeedRatio(long j, float f);

    private native int nativeSetSubTrackSeqIn(long j, int i, int i2, int i3);

    private native void nativeSetSurfaceSize(long j, int i, int i2);

    private static native int nativeSetTexturePoolLimit(int i, int i2);

    private native int nativeSetTimeRange(long j, int i, int i2, int i3);

    private native int nativeSetTrackDurationType(long j, int i, int i2, int i3);

    private native int nativeSetTrackFilterEnable(long j, int i, boolean z, boolean z2);

    private native int nativeSetTrackLayer(long j, int i, int i2, int i3);

    private native int nativeSetTrackMinMaxDuration(long j, int i, int i2, int i3, int i4);

    private native boolean nativeSetTrackVolume(long j, int i, int i2, float f);

    private native int nativeSetTransitionAt(long j, int i, long j2, String str);

    private native void nativeSetVideoBackGroundColor(long j, int i);

    private native void nativeSetViewPort(long j, int i, int i2, int i3, int i4);

    private native void nativeSetWaterMark(long j, VEWatermarkParam.VEWatermarkEntity[] vEWatermarkEntityArr, VEWatermarkParam.VEWatermarkMask vEWatermarkMask);

    private native int nativeStart(long j);

    private native int nativeStartEffectMonitor(long j);

    private native int nativeStop(long j);

    private native int nativeStopEffectMonitor(long j);

    private native boolean nativeSuspendGestureRecognizer(long j, int i, boolean z);

    private native int nativeSwitchResourceLoadMode(long j, boolean z, int i);

    private native int nativeUninitAudioExtendToFile(long j);

    private native int nativeUpdateAICutOutClipParam(long j, int i, int i2, VEAICutOutClipParam vEAICutOutClipParam);

    private native int nativeUpdateAlgorithmRuntimeParam(long j, int i, float f);

    private native int nativeUpdateAmazingFilterParam(long j, int i, int i2, VEAmazingFilterParam vEAmazingFilterParam);

    private native int nativeUpdateAudioTrack(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    private native int nativeUpdateAudioTrack2(long j, int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7);

    private native int nativeUpdateBeautyFilterParam(long j, int i, int i2, VEBeautyFilterParam vEBeautyFilterParam);

    private native int nativeUpdateCanvasFilterParam(long j, int i, int i2, VECanvasFilterParam vECanvasFilterParam);

    private native int nativeUpdateCanvasResolution(long j, int i, int i2);

    private native int nativeUpdateClipsSourceParam(long j, int i, int i2, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr);

    private native int nativeUpdateClipsTimelineParam(long j, int i, int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr);

    private native int nativeUpdateColorAdjustHslFilterParam(long j, int i, int i2, VEColorHslFilterParam vEColorHslFilterParam);

    private native int nativeUpdateColorFilterParam(long j, int i, int i2, VEColorFilterParam vEColorFilterParam);

    private native int nativeUpdateComposerNode(long j, String str, String str2, float f);

    private native int nativeUpdateCropFilterParam(long j, int i, int i2, VEVideoCropFilterParam vEVideoCropFilterParam);

    private native int nativeUpdateEffectComposerParam(long j, int i, int i2, VEComposerFilterParam vEComposerFilterParam);

    private native int nativeUpdateEffectFilterParam(long j, int i, int i2, VEEffectFilterParam vEEffectFilterParam);

    private native int nativeUpdateEffectHdrFilterParam(long j, int i, int i2, VEEffectHdrFilterParam vEEffectHdrFilterParam);

    private native int nativeUpdateFilterTime(long j, int i, int i2, int i3, int i4);

    private native int nativeUpdateImageAddFilterParam(long j, int i, int i2, VEImageAddFilterParam vEImageAddFilterParam);

    private native int nativeUpdateImageTransformFilterParam(long j, int i, int i2, VEImageTransformFilterParam vEImageTransformFilterParam);

    private native int nativeUpdateLensHdrFilterParam(long j, int i, int i2, VELensHdrFilterParam vELensHdrFilterParam);

    private native int nativeUpdateLensOneKeyHdrFilterParam(long j, int i, int i2, VEVideoLensOneKeyHdrParam vEVideoLensOneKeyHdrParam);

    private native int nativeUpdateMultiComposerNodes(long j, int i, String[] strArr, String[] strArr2, float[] fArr);

    private native int nativeUpdateMultiEffectComposerParam(long j, int i, int i2, VEMultiComposerFilterParam vEMultiComposerFilterParam);

    private native int nativeUpdateQualityFilterParam(long j, int i, int i2, VEVideoAjustmentFilterParam vEVideoAjustmentFilterParam);

    private native int nativeUpdateReshapeFilterParam(long j, int i, int i2, VEReshapeFilterParam vEReshapeFilterParam);

    private native int nativeUpdateScene(long j, String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeUpdateSceneFileOrder(long j, int[] iArr);

    private native int nativeUpdateSceneLoadCache(long j, String[] strArr, int[] iArr, int[] iArr2, boolean[] zArr, String[] strArr2);

    private native int nativeUpdateSceneTime(long j, boolean[] zArr, int[] iArr, int[] iArr2, int[] iArr3, double[] dArr);

    private native int nativeUpdateTrackClip(long j, int i, int i2, String[] strArr);

    private native int nativeUpdateTrackFilter(long j, int i, int i2, boolean z);

    private native int nativeUpdateTrackFilterDuration(long j, int i, int i2, boolean z, long j2);

    private native int nativeUpdateVideoStabFilterParam(long j, int i, int i2, VEVideoStableFilterParam vEVideoStableFilterParam);

    private native int nativeUpdateVideoTransformFilterParam(long j, int i, int i2, VEVideoTransformFilterParam vEVideoTransformFilterParam);

    public final native int nativeSetAudioOffset(long j, int i, int i2);

    public final native String stringFromJNI();

    public final int getHostTrackIndex() {
        return this.mHostTrackIndex;
    }

    public final long getNativeHandler() {
        return this.mNative;
    }

    public static TEInterface createEngine() {
        return createEngine((C85395bh) null);
    }

    static {
        Covode.recordClassIndex(37299);
        C30731d.m63114a();
    }

    public final int cancelAudioExtendToFile() {
        MethodCollector.m26663i(12883);
        int nativeCancelAudioExtendToFile = nativeCancelAudioExtendToFile(this.mNative);
        MethodCollector.m26664o(12883);
        return nativeCancelAudioExtendToFile;
    }

    public final int cancelGetImages() {
        MethodCollector.m26663i(14145);
        int nativeCancelGetImages = nativeCancelGetImages(this.mNative);
        MethodCollector.m26664o(14145);
        return nativeCancelGetImages;
    }

    public final long genEditorStatus() {
        MethodCollector.m26663i(13136);
        long nativeGenEditorStatus = nativeGenEditorStatus(this.mNative);
        MethodCollector.m26664o(13136);
        return nativeGenEditorStatus;
    }

    public final boolean isAudioExtendToFileProcessing() {
        MethodCollector.m26663i(13061);
        boolean nativeIsAudioExtendToFileProcessing = nativeIsAudioExtendToFileProcessing(this.mNative);
        MethodCollector.m26664o(13061);
        return nativeIsAudioExtendToFileProcessing;
    }

    public final int uninitAudioExtendToFile() {
        MethodCollector.m26663i(12972);
        int nativeUninitAudioExtendToFile = nativeUninitAudioExtendToFile(this.mNative);
        MethodCollector.m26664o(12972);
        return nativeUninitAudioExtendToFile;
    }

    private TEInterface() {
        if (!m_IsConfigedAB) {
            configABforEditor();
            m_IsConfigedAB = true;
        }
    }

    public final int clearFilter() {
        MethodCollector.m26663i(13513);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13513);
            return -112;
        }
        int nativeClearFilter = nativeClearFilter(j);
        MethodCollector.m26664o(13513);
        return nativeClearFilter;
    }

    public final int createTimeline() {
        MethodCollector.m26663i(12691);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12691);
            return -112;
        }
        int nativeCreateTimeline = nativeCreateTimeline(j);
        MethodCollector.m26664o(12691);
        return nativeCreateTimeline;
    }

    public final int destroyEngine() {
        MethodCollector.m26663i(13657);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13657);
            return -112;
        }
        int nativeDestroyEngine = nativeDestroyEngine(j);
        this.mNative = 0;
        MethodCollector.m26664o(13657);
        return nativeDestroyEngine;
    }

    public final int doLensOneKeyHdrDetect() {
        MethodCollector.m26663i(13466);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13466);
            return -112;
        }
        int nativeDoLensOneKeyHdrDetect = nativeDoLensOneKeyHdrDetect(j);
        MethodCollector.m26664o(13466);
        return nativeDoLensOneKeyHdrDetect;
    }

    public final int excAICutOutTask() {
        MethodCollector.m26663i(13393);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13393);
            return -112;
        }
        int nativeExcAICutOutTask = nativeExcAICutOutTask(j);
        MethodCollector.m26664o(13393);
        return nativeExcAICutOutTask;
    }

    public final int faceCoverClearCache() {
        MethodCollector.m26663i(11249);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(11249);
            return -112;
        }
        int nativeFaceCoverClearCache = nativeFaceCoverClearCache(j);
        MethodCollector.m26664o(11249);
        return nativeFaceCoverClearCache;
    }

    public final int faceCoverRestoreAll() {
        MethodCollector.m26663i(11248);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(11248);
            return -112;
        }
        int nativeFaceCoverRestoreAll = nativeFaceCoverRestoreAll(j);
        MethodCollector.m26664o(11248);
        return nativeFaceCoverRestoreAll;
    }

    public final int flushSeekCmd() {
        MethodCollector.m26663i(14284);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14284);
            return -112;
        }
        int nativeFlushSeekCmd = nativeFlushSeekCmd(j);
        MethodCollector.m26664o(14284);
        return nativeFlushSeekCmd;
    }

    public final List<VEClipVideoFileInfoParam> getAllVideoFileInfos() {
        MethodCollector.m26663i(13850);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13850);
            return null;
        }
        List<VEClipVideoFileInfoParam> nativeGetAllVideoFileInfos = nativeGetAllVideoFileInfos(j);
        MethodCollector.m26664o(13850);
        return nativeGetAllVideoFileInfos;
    }

    public final int getCurPosition() {
        MethodCollector.m26663i(12080);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12080);
            return -1;
        }
        int nativeGetCurPosition = nativeGetCurPosition(j);
        MethodCollector.m26664o(12080);
        return nativeGetCurPosition;
    }

    public final int getCurState() {
        MethodCollector.m26663i(12082);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12082);
            return -1;
        }
        int nativeGetCurState = nativeGetCurState(j);
        MethodCollector.m26664o(12082);
        return nativeGetCurState;
    }

    public final int getDuration() {
        MethodCollector.m26663i(11290);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(11290);
            return -1;
        }
        int nativeGetDuration = nativeGetDuration(j);
        MethodCollector.m26664o(11290);
        return nativeGetDuration;
    }

    public final long getDurationUs() {
        MethodCollector.m26663i(11627);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(11627);
            return -1;
        }
        long nativeGetDurationUs = nativeGetDurationUs(j);
        MethodCollector.m26664o(11627);
        return nativeGetDurationUs;
    }

    public final long getPCMDeliverHandle() {
        MethodCollector.m26663i(13693);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13693);
            return -112;
        }
        long nativeGetPCMDeliverHandle = nativeGetPCMDeliverHandle(j);
        MethodCollector.m26664o(13693);
        return nativeGetPCMDeliverHandle;
    }

    public final float getProjectMattingProgress() {
        MethodCollector.m26663i(13465);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13465);
            return -112.0f;
        }
        float nativeGetProjectProgress = nativeGetProjectProgress(j);
        MethodCollector.m26664o(13465);
        return nativeGetProjectProgress;
    }

    public final int getRuntimeGLVersion() {
        MethodCollector.m26663i(13507);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13507);
            return -112;
        }
        int nativeGetRuntimeGLVersion = nativeGetRuntimeGLVersion(j);
        MethodCollector.m26664o(13507);
        return nativeGetRuntimeGLVersion;
    }

    public final int initAudioExtendToFile() {
        MethodCollector.m26663i(12676);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12676);
            return -112;
        }
        int nativeInitAudioExtendToFile = nativeInitAudioExtendToFile(j);
        MethodCollector.m26664o(12676);
        return nativeInitAudioExtendToFile;
    }

    public final int isCompileEncode() {
        MethodCollector.m26663i(11778);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(11778);
            return -1;
        }
        int nativeIsCompileEncode = nativeIsCompileEncode(j);
        MethodCollector.m26664o(11778);
        return nativeIsCompileEncode;
    }

    public final int isWatermarkCompileEncode() {
        MethodCollector.m26663i(11948);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(11948);
            return -1;
        }
        int nativeIsWatermarkCompileEncode = nativeIsWatermarkCompileEncode(j);
        MethodCollector.m26664o(11948);
        return nativeIsWatermarkCompileEncode;
    }

    public final int pauseSync() {
        MethodCollector.m26663i(10851);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(10851);
            return -112;
        }
        int nativePauseSync = nativePauseSync(j);
        MethodCollector.m26664o(10851);
        return nativePauseSync;
    }

    public final int releaseEngine() {
        MethodCollector.m26663i(13495);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13495);
            return -112;
        }
        int nativeReleaseEngine = nativeReleaseEngine(j);
        MethodCollector.m26664o(13495);
        return nativeReleaseEngine;
    }

    public final int releaseEngineAsync() {
        MethodCollector.m26663i(13608);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13608);
            return -112;
        }
        int nativeReleaseEngineAsync = nativeReleaseEngineAsync(j);
        MethodCollector.m26664o(13608);
        return nativeReleaseEngineAsync;
    }

    public final void releasePreviewSurface() {
        MethodCollector.m26663i(14291);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14291);
            return;
        }
        nativeReleasePreviewSurface(j);
        MethodCollector.m26664o(14291);
    }

    public final int removeEffectCallback() {
        MethodCollector.m26663i(13809);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13809);
            return -112;
        }
        int nativeRemoveEffectCallback = nativeRemoveEffectCallback(j);
        MethodCollector.m26664o(13809);
        return nativeRemoveEffectCallback;
    }

    public final int start() {
        MethodCollector.m26663i(10707);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(10707);
            return -112;
        }
        int nativeStart = nativeStart(j);
        MethodCollector.m26664o(10707);
        return nativeStart;
    }

    public final int startEffectMonitor() {
        MethodCollector.m26663i(13888);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13888);
            return -112;
        }
        nativeStartEffectMonitor(j);
        MethodCollector.m26664o(13888);
        return 0;
    }

    public final int stop() {
        MethodCollector.m26663i(11141);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(11141);
            return -112;
        }
        int nativeStop = nativeStop(j);
        MethodCollector.m26664o(11141);
        return nativeStop;
    }

    public final int stopEffectMonitor() {
        MethodCollector.m26663i(13889);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13889);
            return -112;
        }
        nativeStopEffectMonitor(j);
        MethodCollector.m26664o(13889);
        return 0;
    }

    public final C85375aw getDisplayRect() {
        MethodCollector.m26663i(9921);
        long j = this.mNative;
        if (j == 0) {
            C85375aw awVar = new C85375aw(0, 0, 0, 0);
            MethodCollector.m26664o(9921);
            return awVar;
        }
        int[] nativeGetDisplayDumpSize = nativeGetDisplayDumpSize(j);
        C85375aw awVar2 = new C85375aw(nativeGetDisplayDumpSize[0], nativeGetDisplayDumpSize[1], nativeGetDisplayDumpSize[2], nativeGetDisplayDumpSize[3]);
        MethodCollector.m26664o(9921);
        return awVar2;
    }

    public final int[] getInitResolution() {
        MethodCollector.m26663i(10566);
        int[] iArr = {-1, -1, -1, -1};
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(10566);
            return iArr;
        }
        int[] nativeGetInitResolution = nativeGetInitResolution(j);
        MethodCollector.m26664o(10566);
        return nativeGetInitResolution;
    }

    private void configABforEditor() {
        boolean booleanValue;
        boolean booleanValue2;
        boolean booleanValue3;
        boolean booleanValue4;
        boolean booleanValue5;
        boolean booleanValue6;
        boolean booleanValue7;
        boolean booleanValue8;
        boolean booleanValue9;
        int intValue;
        boolean booleanValue10;
        MethodCollector.m26663i(13094);
        C85568t.C85573d a = C85568t.m147473a().mo131556a("mv_use_amazing_engine");
        if (a != null && a.f191742b != null && (a.f191742b instanceof Boolean) && (booleanValue10 = ((Boolean) a.f191742b).booleanValue())) {
            enableEffectAmazingMV(booleanValue10);
        }
        C85568t.C85573d a2 = C85568t.m147473a().mo131556a("vesdk_max_cache_count");
        if (a2 != null && a2.f191742b != null && (a2.f191742b instanceof Integer) && (intValue = ((Integer) a2.f191742b).intValue()) > 0) {
            configMaxCacheFrameCount(intValue);
        }
        C85568t.C85573d a3 = C85568t.m147473a().mo131556a("vesdk_seek_predict_opt");
        if (a3 != null && a3.f191742b != null && (a3.f191742b instanceof Boolean) && (booleanValue9 = ((Boolean) a3.f191742b).booleanValue())) {
            enableSeekPredictOpt(booleanValue9);
        }
        C85568t.C85573d a4 = C85568t.m147473a().mo131556a("create_by_codec_name");
        if (a4 != null && a4.f191742b != null && (a4.f191742b instanceof Boolean) && (booleanValue8 = ((Boolean) a4.f191742b).booleanValue())) {
            enableCreateDecoderByName(booleanValue8);
        }
        C85568t.C85573d a5 = C85568t.m147473a().mo131556a("enable_android_hdr2sdr_support");
        if (!(a5 == null || a5.f191742b == null || !(a5.f191742b instanceof Boolean))) {
            boolean booleanValue11 = ((Boolean) a5.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "enableAndroidHdr2SdrSupport: ".concat(String.valueOf(booleanValue11)));
            if (booleanValue11) {
                enableAndroidHdr2SDRSupport(booleanValue11);
            }
        }
        C85568t.C85573d a6 = C85568t.m147473a().mo131556a("enable_android_hdr_preview_support");
        if (a6 != null && a6.f191742b != null && (a6.f191742b instanceof Boolean) && (booleanValue7 = ((Boolean) a6.f191742b).booleanValue())) {
            enableAndroidHdr2SDRSupport(booleanValue7);
        }
        C85568t.C85573d a7 = C85568t.m147473a().mo131556a("ve_force_edit_bytevc1_swdecode");
        if (!(a7 == null || a7.f191742b == null || !(a7.f191742b instanceof Boolean))) {
            boolean booleanValue12 = ((Boolean) a7.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "forceEditBytevc1SWdecode: ".concat(String.valueOf(booleanValue12)));
            if (booleanValue12) {
                forceEditBytevc1SWdecode(booleanValue12);
            }
        }
        C85568t.C85573d a8 = C85568t.m147473a().mo131556a("ve_force_compile_bytevc1_swdecode");
        if (!(a8 == null || a8.f191742b == null || !(a8.f191742b instanceof Boolean))) {
            boolean booleanValue13 = ((Boolean) a8.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "forceCompileBytevc1SWdecode: ".concat(String.valueOf(booleanValue13)));
            if (booleanValue13) {
                forceCompileBytevc1SWdecode(booleanValue13);
            }
        }
        C85568t.C85573d a9 = C85568t.m147473a().mo131556a("vesdk_audiomix_replace");
        if (a9 != null && a9.f191742b != null && (a9.f191742b instanceof Boolean) && (booleanValue6 = ((Boolean) a9.f191742b).booleanValue())) {
            enableNewAudioMixer(booleanValue6);
        }
        C85568t.C85573d a10 = C85568t.m147473a().mo131556a("ve_color_space_for_2020");
        if (a10 != null && a10.f191742b != null && (a10.f191742b instanceof Boolean) && (booleanValue5 = ((Boolean) a10.f191742b).booleanValue())) {
            enableColorSpace2020(booleanValue5);
        }
        C85568t.C85573d a11 = C85568t.m147473a().mo131556a("ve_enable_bingo_refactor");
        if (a11 != null && a11.f191742b != null && (a11.f191742b instanceof Boolean) && (booleanValue4 = ((Boolean) a11.f191742b).booleanValue())) {
            C85376ax.f191105f = true;
            enableBingoRefactor(booleanValue4);
        }
        C85568t.C85573d a12 = C85568t.m147473a().mo131556a("vesdk_audio_hw_encoder");
        if (a12 != null && a12.f191742b != null && (a12.f191742b instanceof Boolean) && (booleanValue3 = ((Boolean) a12.f191742b).booleanValue())) {
            enableAudioHwEncoder(booleanValue3);
        }
        C85568t.C85573d a13 = C85568t.m147473a().mo131556a("crossplat_glbase_fbo");
        if (!(a13 == null || a13.f191742b == null || !(a13.f191742b instanceof Boolean))) {
            boolean booleanValue14 = ((Boolean) a13.f191742b).booleanValue();
            C85315al.m146642d("TEInterface", "KEY_CROSSPLAT_GLBASE_FBO: ".concat(String.valueOf(booleanValue14)));
            if (booleanValue14) {
                enableCrossplatformGLBaseFBO(booleanValue14);
            }
        }
        C85568t.C85573d a14 = C85568t.m147473a().mo131556a("enable_render_lib");
        if (!(a14 == null || a14.f191742b == null || !(a14.f191742b instanceof Boolean))) {
            boolean booleanValue15 = ((Boolean) a14.f191742b).booleanValue();
            C85315al.m146642d("TEInterface", "KEY_ENABLE_RENDER_LIB: ".concat(String.valueOf(booleanValue15)));
            if (booleanValue15) {
                enableRenderLib(booleanValue15);
            }
        }
        C85568t.C85573d a15 = C85568t.m147473a().mo131556a("vesdk_use_agfxcontext");
        if (!(a15 == null || a15.f191742b == null || !(a15.f191742b instanceof Boolean))) {
            boolean booleanValue16 = ((Boolean) a15.f191742b).booleanValue();
            C85315al.m146642d("TEInterface", "KEY_ENABLE_AGFX_CTX: ".concat(String.valueOf(booleanValue16)));
            if (booleanValue16) {
                enableAGFXCtx(booleanValue16);
            }
        }
        C85568t.C85573d a16 = C85568t.m147473a().mo131556a("vesdk_enable_reader_refactor");
        if (a16 != null && a16.f191742b != null && (a16.f191742b instanceof Boolean) && (booleanValue2 = ((Boolean) a16.f191742b).booleanValue())) {
            enableReaderRefactor(booleanValue2);
        }
        C85568t.C85573d a17 = C85568t.m147473a().mo131556a("ve_enable_engine_resource_opt");
        if (!(a17 == null || a17.f191742b == null || !(a17.f191742b instanceof Boolean))) {
            enableEngineResourceOpt(((Boolean) a17.f191742b).booleanValue());
        }
        C85568t.C85573d a18 = C85568t.m147473a().mo131556a("ve_enable_concurrent_preload");
        if (!(a18 == null || a18.f191742b == null || !(a18.f191742b instanceof Integer))) {
            nativeEnableConcurrentPreloadOpt(((Integer) a18.f191742b).intValue());
        }
        C85568t.C85573d a19 = C85568t.m147473a().mo131556a("ve_enable_decoder_schedule_opt_hw");
        if (!(a19 == null || a19.f191742b == null || !(a19.f191742b instanceof Integer))) {
            Integer num = (Integer) a19.f191742b;
            if (num.intValue() > 0) {
                C85568t.m147473a().mo131559b("ve_enable_engine_resource_opt", (Object) true);
                enableEngineResourceOpt(true);
                C85568t.m147473a().mo131559b("vesdk_enable_reader_refactor", (Object) true);
                enableReaderRefactor(true);
                enableDecoderResourceScheduleOptHw(num.intValue());
            }
        }
        C85568t.C85573d a20 = C85568t.m147473a().mo131556a("ve_enable_readermanager_refactor");
        if (a20 != null && a20.f191742b != null && (a20.f191742b instanceof Boolean) && ((Boolean) a20.f191742b).booleanValue()) {
            C85315al.m146637a("TEInterface", "enable ReaderManager refactortrue");
            enableReaderManagerRefactor(true);
        }
        C85568t.m147473a().mo131556a("ve_enable_audio_gbu_refactor");
        enableAudioGBU(true);
        C85568t.C85573d a21 = C85568t.m147473a().mo131556a("ve_enable_render_encode_resolution_align4");
        if (a21 != null && a21.f191742b != null && (a21.f191742b instanceof Boolean) && ((Boolean) a21.f191742b).booleanValue() && Build.VERSION.SDK_INT >= 24) {
            C85315al.m146637a("TEInterface", "enableRenderEncodeAlign4: true");
            enableOutResolutionAlign4(true);
            TEAvcEncoder.setEncodeResolutionAlign(4);
        }
        C85568t.C85573d a22 = C85568t.m147473a().mo131556a("ve_enable_pin_refactor");
        if (a22 != null && a22.f191742b != null && (a22.f191742b instanceof Boolean) && (booleanValue = ((Boolean) a22.f191742b).booleanValue())) {
            enablePinRefactor(booleanValue);
        }
        C85568t.C85573d a23 = C85568t.m147473a().mo131556a("ve_enable_hwdecode_playback_dropframe_opt");
        if (!(a23 == null || a23.f191742b == null || !(a23.f191742b instanceof Boolean))) {
            boolean booleanValue17 = ((Boolean) a23.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "hwdecodePlaybackDropFrameOpt: ".concat(String.valueOf(booleanValue17)));
            if (booleanValue17) {
                enableOptPlayBackDropFrame(booleanValue17);
            }
        }
        C85568t.C85573d a24 = C85568t.m147473a().mo131556a("ve_enable_mpeg24vp89_hwdecoder2");
        if (!(a24 == null || a24.f191742b == null || !(a24.f191742b instanceof Boolean))) {
            boolean booleanValue18 = ((Boolean) a24.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "enableMpeg24VP89HWDecoder: ".concat(String.valueOf(booleanValue18)));
            if (booleanValue18) {
                VERuntime vERuntime = VERuntime.EnumC85549a.INSTANCE.f191667b;
                if (!vERuntime.f191652k) {
                    C85315al.m146642d("VERuntime", "runtime not init");
                } else {
                    vERuntime.nativeEnableHDMpeg24VP89HWDecoder(booleanValue18);
                }
            }
        }
        C85568t.C85573d a25 = C85568t.m147473a().mo131556a("ve_enable_glflush_opt");
        if (!(a25 == null || a25.f191742b == null || !(a25.f191742b instanceof Boolean))) {
            boolean booleanValue19 = ((Boolean) a25.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "glFlushOpt: ".concat(String.valueOf(booleanValue19)));
            if (booleanValue19) {
                enableOptGlFlush(booleanValue19);
            }
        }
        C85568t.C85573d a26 = C85568t.m147473a().mo131556a("vesdk_high_speed_change_opt");
        if (!(a26 == null || a26.f191742b == null || !(a26.f191742b instanceof Boolean))) {
            boolean booleanValue20 = ((Boolean) a26.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "highSpeedChangeOpt: ".concat(String.valueOf(booleanValue20)));
            if (booleanValue20) {
                enableHighSpeed(booleanValue20);
            }
        }
        C85568t.C85573d a27 = C85568t.m147473a().mo131556a("ve_enable_p3_re_encode");
        if (!(a27 == null || a27.f191742b == null || !(a27.f191742b instanceof Boolean))) {
            boolean booleanValue21 = ((Boolean) a27.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "p3ReEncodeOpt: ".concat(String.valueOf(booleanValue21)));
            if (booleanValue21) {
                enableDisplayP3ReEncode(booleanValue21);
            }
        }
        C85568t.C85573d a28 = C85568t.m147473a().mo131556a("ve_enable_imageAlgorithmReuseAndOptForAmazing");
        if (!(a28 == null || a28.f191742b == null || !(a28.f191742b instanceof Boolean))) {
            boolean booleanValue22 = ((Boolean) a28.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "imageAlgorithmReuseAndOptForAmazing: ".concat(String.valueOf(booleanValue22)));
            if (booleanValue22) {
                enableImageAlgorithmReuseAndOptForAmazing(booleanValue22);
            }
        }
        C85568t.C85573d a29 = C85568t.m147473a().mo131556a("ve_enable_parallelDecodeMatting");
        if (!(a29 == null || a29.f191742b == null || !(a29.f191742b instanceof Boolean))) {
            boolean booleanValue23 = ((Boolean) a29.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "parall Encode Matting: ".concat(String.valueOf(booleanValue23)));
            if (booleanValue23) {
                enableParallDecodeMatting(booleanValue23);
            }
        }
        C85568t.C85573d a30 = C85568t.m147473a().mo131556a("ve_enable_pip_resolution_opt");
        if (!(a30 == null || a30.f191742b == null || !(a30.f191742b instanceof Boolean))) {
            boolean booleanValue24 = ((Boolean) a30.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "pip resolution opt: ".concat(String.valueOf(booleanValue24)));
            if (booleanValue24) {
                enablePipResolutionOpt(booleanValue24);
            }
        }
        C85568t.C85573d a31 = C85568t.m147473a().mo131556a("ve_hardware_encode_fallback");
        if (!(a31 == null || a31.f191742b == null || !(a31.f191742b instanceof Integer))) {
            Integer num2 = (Integer) a31.f191742b;
            if (num2.intValue() != 0) {
                C85315al.m146641c("TEInterface", "ATTENTION!!! TESTING, HARDWARE ENCODE WILL FALLBACK TO SOFT, MODE = ".concat(String.valueOf(num2)));
                C85376ax.f191106g = num2.intValue();
            }
        }
        C85568t.C85573d a32 = C85568t.m147473a().mo131556a("ve_enable_effect_render_without_glreadpixels");
        if (!(a32 == null || a32.f191742b == null || !(a32.f191742b instanceof Boolean))) {
            boolean booleanValue25 = ((Boolean) a32.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "effect render without glreadpixels: ".concat(String.valueOf(booleanValue25)));
            if (booleanValue25) {
                enableEffectRenderWithoutGlreadpixels(booleanValue25);
            }
        }
        C85568t.C85573d a33 = C85568t.m147473a().mo131556a("ve_smart_trans_detect");
        if (!(a33 == null || a33.f191742b == null || !(a33.f191742b instanceof Boolean))) {
            boolean booleanValue26 = ((Boolean) a33.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "smart trans detect: ".concat(String.valueOf(booleanValue26)));
            if (booleanValue26) {
                enableSmartTransDetect(booleanValue26);
            }
        }
        C85568t.C85573d a34 = C85568t.m147473a().mo131556a("ve_enable_l_async_initialize");
        if (!(a34 == null || a34.f191742b == null || !(a34.f191742b instanceof Boolean))) {
            boolean booleanValue27 = ((Boolean) a34.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "lens async initialize: ".concat(String.valueOf(booleanValue27)));
            if (booleanValue27) {
                enableLensAsyncInitialize(booleanValue27);
            }
        }
        C85568t.C85573d a35 = C85568t.m147473a().mo131556a("ve_enable_tian_use_reader_factory");
        if (!(a35 == null || a35.f191742b == null || !(a35.f191742b instanceof Boolean))) {
            boolean booleanValue28 = ((Boolean) a35.f191742b).booleanValue();
            C85315al.m146637a("TEInterface", "titan use readerfactory: ".concat(String.valueOf(booleanValue28)));
            if (booleanValue28) {
                enableTitanUseReaderFactory(booleanValue28);
            }
        }
        MethodCollector.m26664o(13094);
    }

    public final void setHostTrackIndex(int i) {
        this.mHostTrackIndex = i;
    }

    public final void setCompileFps(int i) {
        setOption(0, "CompileFps", (long) i);
    }

    public final void setCompileHardwareEncodeOptions(int i) {
        setOption(0, "CompileHardwareBitrate", (long) i);
    }

    public final void setCompileType(int i) {
        setOption(0, "CompileType", (long) i);
    }

    public final void setEncGopSize(int i) {
        setOption(0, "video gop size", (long) i);
    }

    public final void setPageMode(int i) {
        setOption(0, "engine page mode", (long) i);
    }

    public final void setScaleMode(int i) {
        setOption(0, "filter mode", (long) i);
    }

    public static int configMaxCacheFrameCount(int i) {
        MethodCollector.m26663i(13844);
        int nativeConfigMaxCacheFrameCount = nativeConfigMaxCacheFrameCount(i);
        MethodCollector.m26664o(13844);
        return nativeConfigMaxCacheFrameCount;
    }

    public static int enableAGFXCtx(boolean z) {
        MethodCollector.m26663i(13966);
        int nativeEnableAGFXCtx = nativeEnableAGFXCtx(z);
        MethodCollector.m26664o(13966);
        return nativeEnableAGFXCtx;
    }

    public static int enableAndroidHdr2SDRSupport(boolean z) {
        MethodCollector.m26663i(13883);
        int nativeEnableAndroidHdr2SDRSupport = nativeEnableAndroidHdr2SDRSupport(z);
        MethodCollector.m26664o(13883);
        return nativeEnableAndroidHdr2SDRSupport;
    }

    public static int enableAndroidHdrPreviewSupport(boolean z) {
        MethodCollector.m26663i(13884);
        int nativeEnableAndroidHdrPreviewSupport = nativeEnableAndroidHdrPreviewSupport(z);
        MethodCollector.m26664o(13884);
        return nativeEnableAndroidHdrPreviewSupport;
    }

    public static int enableAudioGBU(boolean z) {
        MethodCollector.m26663i(13972);
        int nativeEnableAudioGBU = nativeEnableAudioGBU(z);
        MethodCollector.m26664o(13972);
        return nativeEnableAudioGBU;
    }

    public static int enableAudioHwEncoder(boolean z) {
        MethodCollector.m26663i(13923);
        int nativeAudioHwEncoder = nativeAudioHwEncoder(z);
        MethodCollector.m26664o(13923);
        return nativeAudioHwEncoder;
    }

    public static int enableBingoRefactor(boolean z) {
        MethodCollector.m26663i(13922);
        int nativeBingoRefactor = nativeBingoRefactor(z);
        MethodCollector.m26664o(13922);
        return nativeBingoRefactor;
    }

    public static int enableColorSpace2020(boolean z) {
        MethodCollector.m26663i(13921);
        int nativeEnableColorSpace2020 = nativeEnableColorSpace2020(z);
        MethodCollector.m26664o(13921);
        return nativeEnableColorSpace2020;
    }

    public static int enableCreateDecoderByName(boolean z) {
        MethodCollector.m26663i(13846);
        int nativeEnableCreateDecoderByName = nativeEnableCreateDecoderByName(z);
        MethodCollector.m26664o(13846);
        return nativeEnableCreateDecoderByName;
    }

    public static int enableCrossplatformGLBaseFBO(boolean z) {
        MethodCollector.m26663i(13971);
        int nativeEnableCrossplatformGLBaseFBO = nativeEnableCrossplatformGLBaseFBO(z);
        MethodCollector.m26664o(13971);
        return nativeEnableCrossplatformGLBaseFBO;
    }

    public static int enableDecoderResourceScheduleOptHw(int i) {
        MethodCollector.m26663i(13969);
        int nativeEnableDecoderResourceScheduleOptHw = nativeEnableDecoderResourceScheduleOptHw(i);
        MethodCollector.m26664o(13969);
        return nativeEnableDecoderResourceScheduleOptHw;
    }

    public static int enableDisplayP3ReEncode(boolean z) {
        MethodCollector.m26663i(14112);
        int nativeEnableDisplayP3ReEncode = nativeEnableDisplayP3ReEncode(z);
        MethodCollector.m26664o(14112);
        return nativeEnableDisplayP3ReEncode;
    }

    public static int enableDisplayP3Render(boolean z) {
        MethodCollector.m26663i(14113);
        int nativeEnableDisplayP3Render = nativeEnableDisplayP3Render(z);
        MethodCollector.m26664o(14113);
        return nativeEnableDisplayP3Render;
    }

    public static int enableEffectAmazingMV(boolean z) {
        MethodCollector.m26663i(13843);
        int nativeEnableEffectAmazingMV = nativeEnableEffectAmazingMV(z);
        MethodCollector.m26664o(13843);
        return nativeEnableEffectAmazingMV;
    }

    public static int enableEffectRenderWithoutGlreadpixels(boolean z) {
        MethodCollector.m26663i(14029);
        int nativeEnableEffectRenderWithoutGlreadpixels = nativeEnableEffectRenderWithoutGlreadpixels(z);
        MethodCollector.m26664o(14029);
        return nativeEnableEffectRenderWithoutGlreadpixels;
    }

    public static int enableEngineResourceOpt(boolean z) {
        MethodCollector.m26663i(13968);
        int nativeEnableEngineResourceOpt = nativeEnableEngineResourceOpt(z);
        MethodCollector.m26664o(13968);
        return nativeEnableEngineResourceOpt;
    }

    public static int enableFileInfoCache(boolean z) {
        MethodCollector.m26663i(13973);
        int nativeEnableFileInfoCache = nativeEnableFileInfoCache(z);
        MethodCollector.m26664o(13973);
        return nativeEnableFileInfoCache;
    }

    public static int enableFirstFrameOpt(boolean z) {
        MethodCollector.m26663i(14081);
        int nativeEnableFirstFrameOpt = nativeEnableFirstFrameOpt(z);
        MethodCollector.m26664o(14081);
        return nativeEnableFirstFrameOpt;
    }

    public static int enableHighSpeed(boolean z) {
        MethodCollector.m26663i(13842);
        int nativeEnableHighSpeed = nativeEnableHighSpeed(z);
        MethodCollector.m26664o(13842);
        return nativeEnableHighSpeed;
    }

    public static int enableImageAlgorithmReuseAndOptForAmazing(boolean z) {
        MethodCollector.m26663i(14005);
        int nativeEnableImageAlgorithmReuseAndOptForAmazing = nativeEnableImageAlgorithmReuseAndOptForAmazing(z);
        MethodCollector.m26664o(14005);
        return nativeEnableImageAlgorithmReuseAndOptForAmazing;
    }

    public static int enableLensAsyncInitialize(boolean z) {
        MethodCollector.m26663i(14139);
        int nativeEnableLensAsyncInitialize = nativeEnableLensAsyncInitialize(z);
        MethodCollector.m26664o(14139);
        return nativeEnableLensAsyncInitialize;
    }

    public static int enableMultiThreadDecode(boolean z) {
        MethodCollector.m26663i(13974);
        int nativeEnableMultiThreadDecode = nativeEnableMultiThreadDecode(z);
        MethodCollector.m26664o(13974);
        return nativeEnableMultiThreadDecode;
    }

    public static int enableNewAudioMixer(boolean z) {
        MethodCollector.m26663i(13963);
        int nativeEnableNewAudioMixer = nativeEnableNewAudioMixer(z);
        MethodCollector.m26664o(13963);
        return nativeEnableNewAudioMixer;
    }

    public static int enableOptGlFlush(boolean z) {
        MethodCollector.m26663i(14004);
        int nativeEnableOptGLFlush = nativeEnableOptGLFlush(z);
        MethodCollector.m26664o(14004);
        return nativeEnableOptGLFlush;
    }

    public static int enableOptPlayBackDropFrame(boolean z) {
        MethodCollector.m26663i(14003);
        int nativeEnableOptPlayBackDropFrame = nativeEnableOptPlayBackDropFrame(z);
        MethodCollector.m26664o(14003);
        return nativeEnableOptPlayBackDropFrame;
    }

    public static int enableOutResolutionAlign4(boolean z) {
        MethodCollector.m26663i(14075);
        int nativeEnableOutResolutionAlign4 = nativeEnableOutResolutionAlign4(z);
        MethodCollector.m26664o(14075);
        return nativeEnableOutResolutionAlign4;
    }

    public static int enableParallDecodeMatting(boolean z) {
        MethodCollector.m26663i(14027);
        int nativeEnableParallDecodeMatting = nativeEnableParallDecodeMatting(z);
        MethodCollector.m26664o(14027);
        return nativeEnableParallDecodeMatting;
    }

    public static int enablePinRefactor(boolean z) {
        MethodCollector.m26663i(13970);
        int nativeEnablePinRefactor = nativeEnablePinRefactor(z);
        MethodCollector.m26664o(13970);
        return nativeEnablePinRefactor;
    }

    public static int enablePipResolutionOpt(boolean z) {
        MethodCollector.m26663i(14028);
        int nativeEnablePipResolutionOpt = nativeEnablePipResolutionOpt(z);
        MethodCollector.m26664o(14028);
        return nativeEnablePipResolutionOpt;
    }

    public static int enableReaderManagerRefactor(boolean z) {
        MethodCollector.m26663i(13965);
        int nativeEnableReaderManagerRefactor = nativeEnableReaderManagerRefactor(z);
        MethodCollector.m26664o(13965);
        return nativeEnableReaderManagerRefactor;
    }

    public static int enableReaderRefactor(boolean z) {
        MethodCollector.m26663i(13967);
        int nativeEnableReaderRefactor = nativeEnableReaderRefactor(z);
        MethodCollector.m26664o(13967);
        return nativeEnableReaderRefactor;
    }

    public static int enableRenderLib(boolean z) {
        MethodCollector.m26663i(13964);
        int nativeEnableRenderLib = nativeEnableRenderLib(z);
        MethodCollector.m26664o(13964);
        return nativeEnableRenderLib;
    }

    public static int enableSeekAndPreloadOpt(boolean z) {
        MethodCollector.m26663i(13975);
        int nativeEnableSeekAndPreloadOpt = nativeEnableSeekAndPreloadOpt(z);
        MethodCollector.m26664o(13975);
        return nativeEnableSeekAndPreloadOpt;
    }

    public static int enableSeekPredictOpt(boolean z) {
        MethodCollector.m26663i(13845);
        int nativeSeekPredictOpt = nativeSeekPredictOpt(z);
        MethodCollector.m26664o(13845);
        return nativeSeekPredictOpt;
    }

    public static int enableSmartTransDetect(boolean z) {
        MethodCollector.m26663i(14045);
        int nativeEnableSmartTransDetect = nativeEnableSmartTransDetect(z);
        MethodCollector.m26664o(14045);
        return nativeEnableSmartTransDetect;
    }

    public static int enableTitanUseReaderFactory(boolean z) {
        MethodCollector.m26663i(14140);
        int nativeEnableTitanUseReaderFactory = nativeEnableTitanUseReaderFactory(z);
        MethodCollector.m26664o(14140);
        return nativeEnableTitanUseReaderFactory;
    }

    public static int forceCompileBytevc1SWdecode(boolean z) {
        MethodCollector.m26663i(13886);
        int nativeForceCompileBytevc1SWdecode = nativeForceCompileBytevc1SWdecode(z);
        MethodCollector.m26664o(13886);
        return nativeForceCompileBytevc1SWdecode;
    }

    public static int forceEditBytevc1SWdecode(boolean z) {
        MethodCollector.m26663i(13885);
        int nativeForceEditBytevc1SWdecode = nativeForceEditBytevc1SWdecode(z);
        MethodCollector.m26664o(13885);
        return nativeForceEditBytevc1SWdecode;
    }

    public static Object getMVInfoStatic(String str) {
        MethodCollector.m26663i(14087);
        Object nativeGetMVInfoStatic = nativeGetMVInfoStatic(str);
        MethodCollector.m26664o(14087);
        return nativeGetMVInfoStatic;
    }

    public static int openEditorFpsLog(boolean z) {
        MethodCollector.m26663i(14076);
        int nativeOpenEditorFpsLog = nativeOpenEditorFpsLog(z);
        MethodCollector.m26664o(14076);
        return nativeOpenEditorFpsLog;
    }

    public static int openOutputCallback(boolean z) {
        MethodCollector.m26663i(14077);
        int nativeOpenOutputCallback = nativeOpenOutputCallback(z);
        MethodCollector.m26664o(14077);
        return nativeOpenOutputCallback;
    }

    public static int setCompileGLContextReuse(boolean z) {
        MethodCollector.m26663i(14138);
        int nativeEnableCompileGLContextReuse = nativeEnableCompileGLContextReuse(z);
        MethodCollector.m26664o(14138);
        return nativeEnableCompileGLContextReuse;
    }

    public static int setCompileReportState(int i) {
        MethodCollector.m26663i(14137);
        int nativeSetCompileReport = nativeSetCompileReport(i);
        MethodCollector.m26664o(14137);
        return nativeSetCompileReport;
    }

    public static int setEnableEffectCanvas(boolean z) {
        MethodCollector.m26663i(14135);
        int nativeEnableEffectCanvas = nativeEnableEffectCanvas(z);
        MethodCollector.m26664o(14135);
        return nativeEnableEffectCanvas;
    }

    public static int setEnableEffectTransition(boolean z) {
        MethodCollector.m26663i(14116);
        int nativeEnableEffectTransiton = nativeEnableEffectTransiton(z);
        MethodCollector.m26664o(14116);
        return nativeEnableEffectTransiton;
    }

    public static int setEnableOpt(int i) {
        MethodCollector.m26663i(13840);
        int nativeSetOptVersion = nativeSetOptVersion(i);
        MethodCollector.m26664o(13840);
        return nativeSetOptVersion;
    }

    public static int setEnableRefaComposer(boolean z) {
        MethodCollector.m26663i(14136);
        int nativeEnableRefaComposer = nativeEnableRefaComposer(z);
        MethodCollector.m26664o(14136);
        return nativeEnableRefaComposer;
    }

    public static int setForceDropFrameWithoutAudio(boolean z) {
        MethodCollector.m26663i(14117);
        int nativeSetForceDropFrameWithoutAudio = nativeSetForceDropFrameWithoutAudio(z);
        MethodCollector.m26664o(14117);
        return nativeSetForceDropFrameWithoutAudio;
    }

    public static int setInfoStickerTransEnable(boolean z) {
        MethodCollector.m26663i(13852);
        int nativeSetInfoStickerTransEnable = nativeSetInfoStickerTransEnable(z);
        MethodCollector.m26664o(13852);
        return nativeSetInfoStickerTransEnable;
    }

    public static void setLensOneKeyHdrMaxCacheSize(int i) {
        MethodCollector.m26663i(13467);
        nativeSetMaxDetectFrameCount(i);
        MethodCollector.m26664o(13467);
    }

    public static int setMaxAudioReaderCount(int i) {
        MethodCollector.m26663i(14078);
        int nativeSetMaxAudioReaderCount = nativeSetMaxAudioReaderCount(i);
        MethodCollector.m26664o(14078);
        return nativeSetMaxAudioReaderCount;
    }

    public final void clearDisplay(int i) {
        MethodCollector.m26663i(10400);
        nativeClearDisplay(this.mNative, i);
        MethodCollector.m26664o(10400);
    }

    public final void enableSimpleProcessor(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "engine processor mode", j);
    }

    public final int expandTimeline(int i) {
        MethodCollector.m26663i(13568);
        int nativeExpandTimeline = nativeExpandTimeline(this.mNative, i);
        MethodCollector.m26664o(13568);
        return nativeExpandTimeline;
    }

    public final int setEditorFirstFrameDelay(int i) {
        MethodCollector.m26663i(14111);
        int nativeSetEditorFirstFrameDelay = nativeSetEditorFirstFrameDelay(i);
        MethodCollector.m26664o(14111);
        return nativeSetEditorFirstFrameDelay;
    }

    public final void setForceDetectForFirstFrameByClip(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "force detect for first frame by clip", j);
    }

    public final void setHeightWidthRatio(float f) {
        if (f > 0.0f) {
            setOption(0, "engine height width ratio", f);
        }
    }

    public final void setLooping(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(1, "engine loop play", j);
    }

    public final void setMultiComposer(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "is multi composer filter", j);
    }

    public final void setUseHwEnc(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "HardwareVideo", j);
    }

    public final void setUseLargeMattingModel(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "UseLargeMattingModel", j);
    }

    public final String addFileInfoCache(String str) {
        MethodCollector.m26663i(12085);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12085);
            return "";
        }
        String nativeAddFileInfoCache = nativeAddFileInfoCache(j, str);
        MethodCollector.m26664o(12085);
        return nativeAddFileInfoCache;
    }

    public final int appendComposerNodes(String[] strArr) {
        MethodCollector.m26663i(14050);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14050);
            return -112;
        }
        int nativeAppendComposerNodes = nativeAppendComposerNodes(j, strArr);
        MethodCollector.m26664o(14050);
        return nativeAppendComposerNodes;
    }

    public final int deleteAICutOutClipParam(int i) {
        MethodCollector.m26663i(13330);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13330);
            return -112;
        }
        int nativeRemoveAICutOutClipParam = nativeRemoveAICutOutClipParam(j, i);
        MethodCollector.m26664o(13330);
        return nativeRemoveAICutOutClipParam;
    }

    public final int deleteExternalVideoTrack(int i) {
        MethodCollector.m26663i(13506);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13506);
            return -1;
        }
        int nativeDeleteSubVideoTrack = nativeDeleteSubVideoTrack(j, i);
        MethodCollector.m26664o(13506);
        return nativeDeleteSubVideoTrack;
    }

    public final int enableAudioDisplayCallBack(boolean z) {
        MethodCollector.m26663i(13841);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13841);
            return -112;
        }
        int nativeEnableAudioDisplayCallBack = nativeEnableAudioDisplayCallBack(j, z);
        MethodCollector.m26664o(13841);
        return nativeEnableAudioDisplayCallBack;
    }

    public final int enableEffect(boolean z) {
        MethodCollector.m26663i(13976);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13976);
            return -112;
        }
        int nativeEnableEffect = nativeEnableEffect(j, z);
        MethodCollector.m26664o(13976);
        return nativeEnableEffect;
    }

    public final int enableEffectAmazing(boolean z) {
        MethodCollector.m26663i(13752);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13752);
            return -112;
        }
        int nativeEnableEffectAmazing = nativeEnableEffectAmazing(j, z);
        MethodCollector.m26664o(13752);
        return nativeEnableEffectAmazing;
    }

    public final int enableFaceDetect(boolean z) {
        MethodCollector.m26663i(9454);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(9454);
            return -112;
        }
        int nativeEnableFaceDetect = nativeEnableFaceDetect(j, z);
        MethodCollector.m26664o(9454);
        return nativeEnableFaceDetect;
    }

    public final int enableGenderDetect(boolean z) {
        MethodCollector.m26663i(9455);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(9455);
            return -112;
        }
        int nativeEnableGenderDetect = nativeEnableGenderDetect(j, z);
        MethodCollector.m26664o(9455);
        return nativeEnableGenderDetect;
    }

    public final int enableHighSpeedForSingle(boolean z) {
        MethodCollector.m26663i(9615);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(9615);
            return -112;
        }
        int nativeEnableHighSpeedForSingle = nativeEnableHighSpeedForSingle(j, z);
        MethodCollector.m26664o(9615);
        return nativeEnableHighSpeedForSingle;
    }

    public final int enableImageEditor(boolean z) {
        MethodCollector.m26663i(13890);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13890);
            return -112;
        }
        int nativeEnableImageEditor = nativeEnableImageEditor(j, z);
        MethodCollector.m26664o(13890);
        return nativeEnableImageEditor;
    }

    public final void enableReEncodeOpt(boolean z) {
        MethodCollector.m26663i(14307);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14307);
            return;
        }
        nativeEnableReEncodeOpt(j, z);
        MethodCollector.m26664o(14307);
    }

    public final int faceCoverSetDir(String str) {
        MethodCollector.m26663i(14387);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14387);
            return -112;
        }
        int nativeFaceCoverSetDir = nativeFaceCoverSetDir(j, str);
        MethodCollector.m26664o(14387);
        return nativeFaceCoverSetDir;
    }

    public final byte[] getAudioCommonFilterPreprocessResult(long j) {
        MethodCollector.m26663i(12694);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.m26664o(12694);
            return null;
        }
        byte[] nativeGetAudioCommonFilterPreprocessResult = nativeGetAudioCommonFilterPreprocessResult(j2, j);
        MethodCollector.m26664o(12694);
        return nativeGetAudioCommonFilterPreprocessResult;
    }

    public final float getClipMattingProgress(int i) {
        MethodCollector.m26663i(13464);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13464);
            return -112.0f;
        }
        float nativeGetClipProgress = nativeGetClipProgress(j, i);
        MethodCollector.m26664o(13464);
        return nativeGetClipProgress;
    }

    public final float getColorFilterIntensity(String str) {
        MethodCollector.m26663i(13810);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13810);
            return -112.0f;
        }
        float nativeGetColorFilterIntensity = nativeGetColorFilterIntensity(j, str);
        MethodCollector.m26664o(13810);
        return nativeGetColorFilterIntensity;
    }

    public final int getDisplayImage(Bitmap bitmap) {
        MethodCollector.m26663i(9761);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(9761);
            return -112;
        }
        int nativeGetDisplayImage = nativeGetDisplayImage(j, bitmap);
        MethodCollector.m26664o(9761);
        return nativeGetDisplayImage;
    }

    public final String getMetaData(String str) {
        MethodCollector.m26663i(12084);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12084);
            return "";
        }
        String nativeGetMetaData = nativeGetMetaData(j, str);
        MethodCollector.m26664o(12084);
        return nativeGetMetaData;
    }

    public final int getProcessedImage(Bitmap bitmap) {
        MethodCollector.m26663i(9923);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(9923);
            return -112;
        }
        int nativeGetProcessedImage = nativeGetProcessedImage(j, bitmap);
        MethodCollector.m26664o(9923);
        return nativeGetProcessedImage;
    }

    public final int getTransparentImage(Bitmap bitmap) {
        MethodCollector.m26663i(10084);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(10084);
            return -112;
        }
        int nativeGetTransparentImage = nativeGetTransparentImage(j, bitmap);
        MethodCollector.m26664o(10084);
        return nativeGetTransparentImage;
    }

    public final int lockSeekVideoClip(int i) {
        MethodCollector.m26663i(14286);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14286);
            return -112;
        }
        int nativeLockSeekVideoClip = nativeLockSeekVideoClip(j, i);
        MethodCollector.m26664o(14286);
        return nativeLockSeekVideoClip;
    }

    public final int pause(int i) {
        MethodCollector.m26663i(10995);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(10995);
            return -112;
        }
        int nativePause = nativePause(j, i);
        MethodCollector.m26664o(10995);
        return nativePause;
    }

    public final int prepareEngine(int i) {
        MethodCollector.m26663i(14143);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14143);
            return -112;
        }
        int nativePrepareEngine = nativePrepareEngine(j, i);
        MethodCollector.m26664o(14143);
        return nativePrepareEngine;
    }

    public final int pushImageToBuffer(String str) {
        MethodCollector.m26663i(14141);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14141);
            return -112;
        }
        int nativePushImageToBuffer = nativePushImageToBuffer(j, str);
        MethodCollector.m26664o(14141);
        return nativePushImageToBuffer;
    }

    public final int refreshCurrentFrame(int i) {
        MethodCollector.m26663i(11137);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(11137);
            return -112;
        }
        int nativeRefreshCurrentFrame = nativeRefreshCurrentFrame(j, i);
        MethodCollector.m26664o(11137);
        return nativeRefreshCurrentFrame;
    }

    public final int reloadComposerNodes(String[] strArr) {
        MethodCollector.m26663i(14048);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14048);
            return -112;
        }
        int nativeReloadComposerNodes = nativeReloadComposerNodes(j, strArr);
        MethodCollector.m26664o(14048);
        return nativeReloadComposerNodes;
    }

    public final int removeComposerNodes(String[] strArr) {
        MethodCollector.m26663i(14051);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14051);
            return -112;
        }
        int nativeRemoveComposerNodes = nativeRemoveComposerNodes(j, strArr);
        MethodCollector.m26664o(14051);
        return nativeRemoveComposerNodes;
    }

    public final int removeFilter(int[] iArr) {
        MethodCollector.m26663i(13674);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13674);
            return -112;
        }
        int nativeRemoveFilter = nativeRemoveFilter(j, iArr);
        MethodCollector.m26664o(13674);
        return nativeRemoveFilter;
    }

    public final int seekWithResult(int i) {
        MethodCollector.m26663i(14282);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14282);
            return -112;
        }
        int nativeSeekWithResult = nativeSeekWithResult(j, i);
        MethodCollector.m26664o(14282);
        return nativeSeekWithResult;
    }

    public final void setBackGroundColor(int i) {
        MethodCollector.m26663i(10398);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(10398);
            return;
        }
        nativeSetBackGroundColor(j, i);
        MethodCollector.m26664o(10398);
    }

    public final int setClientState(int i) {
        MethodCollector.m26663i(14055);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14055);
            return -112;
        }
        int nativeSetClientState = nativeSetClientState(j, i);
        MethodCollector.m26664o(14055);
        return nativeSetClientState;
    }

    public final void setCompileSoftInfo(boolean z) {
        long j = 0;
        if (this.mNative != 0) {
            if (z) {
                j = 1;
            }
            setOption(0, "CompileSoftInfo", j);
        }
    }

    public final int setComposerNodes(String[] strArr) {
        MethodCollector.m26663i(14011);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14011);
            return -112;
        }
        int nativeSetComposerNodes = nativeSetComposerNodes(j, strArr);
        MethodCollector.m26664o(14011);
        return nativeSetComposerNodes;
    }

    public final int setDestroyVersion(boolean z) {
        MethodCollector.m26663i(13839);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13839);
            return -112;
        }
        int nativeSetDestroyVersion = nativeSetDestroyVersion(j, z);
        MethodCollector.m26664o(13839);
        return nativeSetDestroyVersion;
    }

    public final int setDldEnabled(boolean z) {
        MethodCollector.m26663i(13691);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13691);
            return -112;
        }
        int nativeSetDldEnabled = nativeSetDldEnabled(j, z);
        MethodCollector.m26664o(13691);
        return nativeSetDldEnabled;
    }

    public final int setDldThrVal(int i) {
        MethodCollector.m26663i(13692);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13692);
            return -112;
        }
        int nativeSetDldThrVal = nativeSetDldThrVal(j, i);
        MethodCollector.m26664o(13692);
        return nativeSetDldThrVal;
    }

    public final int setDleEnabled(boolean z) {
        MethodCollector.m26663i(13629);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13629);
            return -112;
        }
        int nativeSetDleEnabled = nativeSetDleEnabled(j, z);
        MethodCollector.m26664o(13629);
        return nativeSetDleEnabled;
    }

    public final int setDleEnabledPreview(boolean z) {
        MethodCollector.m26663i(13690);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13690);
            return -112;
        }
        int nativeSetDleEnabledPreview = nativeSetDleEnabledPreview(j, z);
        MethodCollector.m26664o(13690);
        return nativeSetDleEnabledPreview;
    }

    public final int setEffectCallback(VEListener.VEEditorEffectListener vEEditorEffectListener) {
        MethodCollector.m26663i(13808);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13808);
            return -112;
        }
        int nativeSetEffectCallback = nativeSetEffectCallback(j, vEEditorEffectListener);
        MethodCollector.m26664o(13808);
        return nativeSetEffectCallback;
    }

    public final int setEffectMaxMemoryCache(int i) {
        MethodCollector.m26663i(13851);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13851);
            return -112;
        }
        int nativeSetEffectMaxMemoryCache = nativeSetEffectMaxMemoryCache(j, i);
        MethodCollector.m26664o(13851);
        return nativeSetEffectMaxMemoryCache;
    }

    public final int setEffectParams(VEEffectParams vEEffectParams) {
        MethodCollector.m26663i(14056);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14056);
            return -112;
        }
        int nativeSetEffectParams = nativeSetEffectParams(j, vEEffectParams);
        MethodCollector.m26664o(14056);
        return nativeSetEffectParams;
    }

    public final void setEnableCompileVboost(boolean z) {
        long j = 0;
        if (this.mNative != 0) {
            if (z) {
                j = 1;
            }
            setOption(0, "EnableCompileVboost", j);
        }
    }

    public final void setEnableInterLeave(boolean z) {
        long j = 0;
        if (this.mNative != 0) {
            if (z) {
                j = 1;
            }
            setOption(0, "CompileInterleave", j);
        }
    }

    public final void setEnableMultipleAudioFilter(boolean z) {
        MethodCollector.m26663i(13625);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13625);
            return;
        }
        nativeSetEnableMultipleAudioFilter(j, z);
        MethodCollector.m26664o(13625);
    }

    public final void setEnableRemuxVideo(boolean z) {
        MethodCollector.m26663i(14331);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14331);
            return;
        }
        nativeSetEnableRemuxVideo(j, z);
        MethodCollector.m26664o(14331);
    }

    public final void setEncoderParallel(boolean z) {
        MethodCollector.m26663i(14298);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14298);
            return;
        }
        nativeSetEncoderParallel(j, z);
        MethodCollector.m26664o(14298);
    }

    public final void setExpandLastFrame(boolean z) {
        MethodCollector.m26663i(14290);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14290);
            return;
        }
        nativeSetExpandLastFrame(j, z);
        MethodCollector.m26664o(14290);
    }

    public final int setMaleMakeupState(boolean z) {
        MethodCollector.m26663i(13924);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13924);
            return -112;
        }
        int nativeSetMaleMakeupState = nativeSetMaleMakeupState(j, z);
        MethodCollector.m26664o(13924);
        return nativeSetMaleMakeupState;
    }

    public final int setPreviewFps(int i) {
        MethodCollector.m26663i(14280);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14280);
            return -112;
        }
        nativeSetPreviewFps(j, i);
        MethodCollector.m26664o(14280);
        return 0;
    }

    public final int setPreviewScaleMode(int i) {
        MethodCollector.m26663i(14281);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14281);
            return -112;
        }
        int nativeSetPreviewScaleMode = nativeSetPreviewScaleMode(j, i);
        MethodCollector.m26664o(14281);
        return nativeSetPreviewScaleMode;
    }

    public final void setPreviewSurface(Surface surface) {
        MethodCollector.m26663i(14288);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14288);
            return;
        }
        nativeSetPreviewSurface(j, surface);
        MethodCollector.m26664o(14288);
    }

    public final void setPreviewSurfaceBitmap(Bitmap bitmap) {
        MethodCollector.m26663i(14289);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14289);
            return;
        }
        nativeSetPreviewSurfaceBitmap(j, bitmap);
        MethodCollector.m26664o(14289);
    }

    public final void setSpeedRatio(float f) {
        MethodCollector.m26663i(14324);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14324);
            return;
        }
        nativeSetSpeedRatio(j, f);
        MethodCollector.m26664o(14324);
    }

    public final void setVideoBackGroundColor(int i) {
        MethodCollector.m26663i(10399);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(10399);
            return;
        }
        nativeSetVideoBackGroundColor(j, i);
        MethodCollector.m26664o(10399);
    }

    public final int updateSceneFileOrder(C85391be beVar) {
        MethodCollector.m26663i(13200);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13200);
            return -112;
        }
        int nativeUpdateSceneFileOrder = nativeUpdateSceneFileOrder(j, beVar.f191149b);
        MethodCollector.m26664o(13200);
        return nativeUpdateSceneFileOrder;
    }

    public final boolean isGestureRegistered(EnumC85306ad adVar) {
        int ordinal;
        MethodCollector.m26663i(14085);
        if (this.mNative == 0) {
            MethodCollector.m26664o(14085);
            return false;
        }
        if (adVar.ordinal() == EnumC85306ad.ANY_SUPPORTED.ordinal()) {
            ordinal = -1;
        } else {
            ordinal = adVar.ordinal();
        }
        boolean nativeIsGestureRegistered = nativeIsGestureRegistered(this.mNative, ordinal);
        MethodCollector.m26664o(14085);
        return nativeIsGestureRegistered;
    }

    public final void setCompileWatermark(VEWatermarkParam vEWatermarkParam) {
        if (vEWatermarkParam.needExtFile) {
            setOption(0, "SingleWayCompileWithWatermark", 0L);
            setOption(0, "CompilePathWatermark", vEWatermarkParam.extFile);
        } else {
            setOption(0, "SingleWayCompileWithWatermark", 1L);
        }
        setOption(0, "CompilePathWavWatermark", "");
    }

    public final void setKeyFramePoints(int[] iArr) {
        if (this.mNative != 0) {
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) (iArr[i] * 1000);
            }
            setOption(0, "compileKeyFramePoints", jArr);
        }
    }

    public final void setUsrRotate(int i) {
        if (i == 0) {
            setOption(0, "usr rotate", 0L);
        } else if (i == 90) {
            setOption(0, "usr rotate", 1L);
        } else if (i == 180) {
            setOption(0, "usr rotate", 2L);
        } else if (i != 270) {
            setOption(0, "usr rotate", 0L);
        } else {
            setOption(0, "usr rotate", 3L);
        }
    }

    public final int updateSenceTime(C85391be beVar) {
        MethodCollector.m26663i(13133);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13133);
            return -112;
        }
        int nativeUpdateSceneTime = nativeUpdateSceneTime(j, beVar.f191157j, beVar.f191152e, beVar.f191153f, ROTATE_DEGREE.toIntArray(beVar.f191158k), beVar.f191156i);
        MethodCollector.m26664o(13133);
        return nativeUpdateSceneTime;
    }

    public static TEInterface createEngine(long j) {
        int i;
        MethodCollector.m26663i(13303);
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.EnumC85549a.INSTANCE.f191667b.f191646e) {
            i = 3;
        } else {
            i = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i);
        TEGLGlobalContext.nativeSetMaxRenderSize(VERuntime.EnumC85549a.INSTANCE.f191667b.f191648g.width, VERuntime.EnumC85549a.INSTANCE.f191667b.f191648g.height);
        if (j == 0) {
            MethodCollector.m26664o(13303);
            return null;
        }
        tEInterface.mNative = j;
        tEInterface.nativeResetCallback(j);
        C30683b.m63032a("vesdk_event_editor_init", null, "behavior");
        MethodCollector.m26664o(13303);
        return tEInterface;
    }

    public final int enableHDRSetting(boolean z) {
        MethodCollector.m26663i(13576);
        if (this.mNative == 0) {
            MethodCollector.m26664o(13576);
            return -112;
        }
        C85568t.C85573d a = C85568t.m147473a().mo131556a("enable_android_hdr_preview_support");
        if (a == null || a.f191742b == null || !(a.f191742b instanceof Boolean) || ((Boolean) a.f191742b).booleanValue()) {
            int i = Build.VERSION.SDK_INT;
            int nativeEnableHDRSetting = nativeEnableHDRSetting(this.mNative, z);
            MethodCollector.m26664o(13576);
            return nativeEnableHDRSetting;
        }
        MethodCollector.m26664o(13576);
        return -1;
    }

    public static TEInterface createEngine(C85395bh bhVar) {
        int[] iArr;
        String[] strArr;
        int[] iArr2;
        int i;
        int length;
        MethodCollector.m26663i(13235);
        if (bhVar == null || (length = bhVar.mo130885a().length) <= 0) {
            iArr2 = null;
            iArr = null;
            strArr = null;
        } else {
            iArr = new int[length];
            strArr = new String[length];
            iArr2 = new int[length];
            for (int i2 = 0; i2 < bhVar.mo130885a().length; i2++) {
                strArr[i2] = bhVar.mo130885a()[i2].f191175c.value();
                iArr2[i2] = bhVar.mo130885a()[i2].f191173a.value();
                if (iArr2[i2] == 0) {
                    iArr[i2] = bhVar.mo130885a()[i2].f191174b.booleanValue() ? 1 : 0;
                } else if (iArr2[i2] == 1) {
                    iArr[i2] = bhVar.mo130885a()[i2].f191174b.intValue();
                } else {
                    C85315al.m146642d("setUserConfig", "illegal type");
                    iArr[i2] = -1;
                }
            }
        }
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.EnumC85549a.INSTANCE.f191667b.f191646e) {
            i = 3;
        } else {
            i = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i);
        TEGLGlobalContext.nativeSetMaxRenderSize(VERuntime.EnumC85549a.INSTANCE.f191667b.f191648g.width, VERuntime.EnumC85549a.INSTANCE.f191667b.f191648g.height);
        long nativeCreateEngine = tEInterface.nativeCreateEngine(strArr, iArr2, iArr);
        if (nativeCreateEngine == 0) {
            MethodCollector.m26664o(13235);
            return null;
        }
        tEInterface.mNative = nativeCreateEngine;
        C30683b.m63032a("vesdk_event_editor_init", null, "behavior");
        MethodCollector.m26664o(13235);
        return tEInterface;
    }

    public static int setTexturePoolLimit(int i, int i2) {
        MethodCollector.m26663i(14115);
        int nativeSetTexturePoolLimit = nativeSetTexturePoolLimit(i, i2);
        MethodCollector.m26664o(14115);
        return nativeSetTexturePoolLimit;
    }

    public final void setCompileCommonEncodeOptions(int i, int i2) {
        setOption(0, "CompileBitrateMode", (long) i);
        setOption(0, "CompileEncodeProfile", (long) i2);
    }

    public final void setEngineCompilePath(String str, String str2) {
        setOption(0, "CompilePath", str);
        setOption(0, "CompilePathWav", str2);
    }

    public final void setVideoCompileBitrate(int i, int i2) {
        setOption(0, "CompileBitrateMode", (long) i);
        setOption(0, "CompileBitrateValue", (long) i2);
    }

    public final void addMetaData(String str, String str2) {
        MethodCollector.m26663i(12083);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12083);
            return;
        }
        nativeAddMetaData(j, str, str2);
        MethodCollector.m26664o(12083);
    }

    public final int changeTransitionAt(int i, VETransitionFilterParam vETransitionFilterParam) {
        MethodCollector.m26663i(13523);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13523);
            return -112;
        }
        int nativeChangeTransitonAt = nativeChangeTransitonAt(j, i, vETransitionFilterParam);
        MethodCollector.m26664o(13523);
        return nativeChangeTransitonAt;
    }

    public final int deleteAudioTrack(int i, boolean z) {
        MethodCollector.m26663i(13460);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13460);
            return -1;
        }
        int nativeDeleteAudioTrack = nativeDeleteAudioTrack(j, i, z);
        MethodCollector.m26664o(13460);
        return nativeDeleteAudioTrack;
    }

    public final List<VEClipParam> getAllClips(int i, int i2) {
        MethodCollector.m26663i(13849);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13849);
            return null;
        }
        List<VEClipParam> nativeGetAllClips = nativeGetAllClips(j, i, i2);
        MethodCollector.m26664o(13849);
        return nativeGetAllClips;
    }

    public final int[] getDecodeInfo(int i, int i2) {
        MethodCollector.m26663i(10397);
        int[] iArr = {0};
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(10397);
            return iArr;
        }
        int[] nativeGetDecodeDumpInfo = nativeGetDecodeDumpInfo(j, i, i2);
        MethodCollector.m26664o(10397);
        return nativeGetDecodeDumpInfo;
    }

    public final int getSingleTrackProcessedImage(int i, Bitmap bitmap) {
        MethodCollector.m26663i(9925);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(9925);
            return -112;
        }
        int nativeGetSingleTrackProcessedImage = nativeGetSingleTrackProcessedImage(j, i, bitmap);
        MethodCollector.m26664o(9925);
        return nativeGetSingleTrackProcessedImage;
    }

    public final int processDoubleClickEvent(float f, float f2) {
        MethodCollector.m26663i(12890);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12890);
            return -112;
        }
        int nativeProcessDoubleClickEvent = nativeProcessDoubleClickEvent(j, f, f2);
        MethodCollector.m26664o(12890);
        return nativeProcessDoubleClickEvent;
    }

    public final int processLongPressEvent(float f, float f2) {
        MethodCollector.m26663i(12889);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12889);
            return -112;
        }
        int nativeProcessLongPressEvent = nativeProcessLongPressEvent(j, f, f2);
        MethodCollector.m26664o(12889);
        return nativeProcessLongPressEvent;
    }

    public final int processRotationEvent(float f, float f2) {
        MethodCollector.m26663i(12805);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12805);
            return -112;
        }
        int nativeProcessRotationEvent = nativeProcessRotationEvent(j, f, f2);
        MethodCollector.m26664o(12805);
        return nativeProcessRotationEvent;
    }

    public final int processScaleEvent(float f, float f2) {
        MethodCollector.m26663i(12699);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12699);
            return -112;
        }
        int nativeProcessScaleEvent = nativeProcessScaleEvent(j, f, f2);
        MethodCollector.m26664o(12699);
        return nativeProcessScaleEvent;
    }

    public final int processTouchEvent(float f, float f2) {
        MethodCollector.m26663i(13979);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13979);
            return -112;
        }
        int nativeProcessTouchEvent = nativeProcessTouchEvent(j, f, f2);
        MethodCollector.m26664o(13979);
        return nativeProcessTouchEvent;
    }

    public final int processTouchMoveEvent(float f, float f2) {
        MethodCollector.m26663i(12696);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12696);
            return -112;
        }
        int nativeProcessTouchMoveEvent = nativeProcessTouchMoveEvent(j, f, f2);
        MethodCollector.m26664o(12696);
        return nativeProcessTouchMoveEvent;
    }

    public final int setAlgorithmPreConfig(int i, int i2) {
        MethodCollector.m26663i(14010);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14010);
            return -112;
        }
        int nativeSetAlgorithmPreConfig = nativeSetAlgorithmPreConfig(j, i, i2);
        MethodCollector.m26664o(14010);
        return nativeSetAlgorithmPreConfig;
    }

    public final void setAlgorithmReplay(int i, String str) {
        if (this.mNative != 0) {
            setOption(0, "AlgorithmReplayMode", (long) i);
            setOption(0, "AlgorithmReplayFilePath", str);
        }
    }

    public final int setAlgorithmSyncAndNum(boolean z, int i) {
        MethodCollector.m26663i(14008);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14008);
            return -112;
        }
        int nativeSetAlgorithmSyncAndNum = nativeSetAlgorithmSyncAndNum(j, z, i);
        MethodCollector.m26664o(14008);
        return nativeSetAlgorithmSyncAndNum;
    }

    public final int setAudioOffset(int i, int i2) {
        MethodCollector.m26663i(14287);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14287);
            return -112;
        }
        int nativeSetAudioOffset = nativeSetAudioOffset(j, i, i2);
        MethodCollector.m26664o(14287);
        return nativeSetAudioOffset;
    }

    public final int setComposerMode(int i, int i2) {
        MethodCollector.m26663i(14033);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14033);
            return -112;
        }
        int nativeSetComposerMode = nativeSetComposerMode(j, i, i2);
        MethodCollector.m26664o(14033);
        return nativeSetComposerMode;
    }

    public final int setDeviceRotation(float[] fArr, double d) {
        MethodCollector.m26663i(12891);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12891);
            return -112;
        }
        int nativeSetDeviceRotation = nativeSetDeviceRotation(j, fArr, d);
        MethodCollector.m26664o(12891);
        return nativeSetDeviceRotation;
    }

    public final int setEffectCacheInt(String str, int i) {
        MethodCollector.m26663i(13887);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13887);
            return -112;
        }
        int nativeSetEffectCacheInt = nativeSetEffectCacheInt(j, str, i);
        MethodCollector.m26664o(13887);
        return nativeSetEffectCacheInt;
    }

    public final void setMaxWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine max video width", (long) i);
        }
        if (i2 > 0) {
            setOption(0, "engine max video height", (long) i2);
        }
    }

    public final void setSurfaceSize(int i, int i2) {
        MethodCollector.m26663i(14316);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14316);
            return;
        }
        nativeSetSurfaceSize(j, i, i2);
        MethodCollector.m26664o(14316);
    }

    public final void setWaterMark(VEWatermarkParam.VEWatermarkEntity[] vEWatermarkEntityArr, VEWatermarkParam.VEWatermarkMask vEWatermarkMask) {
        MethodCollector.m26663i(14299);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14299);
            return;
        }
        nativeSetWaterMark(j, vEWatermarkEntityArr, vEWatermarkMask);
        MethodCollector.m26664o(14299);
    }

    public final void setWatermarkWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine watermark video width", (long) i);
        }
        if (i2 > 0) {
            setOption(0, "engine watermark video height", (long) i2);
        }
    }

    public final void setWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine video width", (long) i);
        }
        if (i2 > 0) {
            setOption(0, "engine video height", (long) i2);
        }
    }

    public final int switchResourceLoadMode(boolean z, int i) {
        MethodCollector.m26663i(14009);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14009);
            return -112;
        }
        int nativeSwitchResourceLoadMode = nativeSwitchResourceLoadMode(j, z, i);
        MethodCollector.m26664o(14009);
        return nativeSwitchResourceLoadMode;
    }

    public final int updateAlgorithmRuntimeParam(int i, float f) {
        MethodCollector.m26663i(13925);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13925);
            return -112;
        }
        int nativeUpdateAlgorithmRuntimeParam = nativeUpdateAlgorithmRuntimeParam(j, i, f);
        MethodCollector.m26664o(13925);
        return nativeUpdateAlgorithmRuntimeParam;
    }

    public final int updateCanvasResolution(int i, int i2) {
        MethodCollector.m26663i(13135);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13135);
            return -112;
        }
        int nativeUpdateCanvasResolution = nativeUpdateCanvasResolution(j, i, i2);
        MethodCollector.m26664o(13135);
        return nativeUpdateCanvasResolution;
    }

    public final int addAudioTrackWithStruct(VECommonClipParam vECommonClipParam, boolean z) {
        MethodCollector.m26663i(13386);
        if (this.mNative == 0) {
            MethodCollector.m26664o(13386);
            return -1;
        } else if (TextUtils.isEmpty(vECommonClipParam.path)) {
            MethodCollector.m26664o(13386);
            return -100;
        } else {
            int nativeAddAudioTrackWithStruct = nativeAddAudioTrackWithStruct(this.mNative, vECommonClipParam, z);
            MethodCollector.m26664o(13386);
            return nativeAddAudioTrackWithStruct;
        }
    }

    public final C85375aw getDecodeRect(int i, int i2) {
        MethodCollector.m26663i(10247);
        long j = this.mNative;
        if (j == 0) {
            C85375aw awVar = new C85375aw(0, 0, 0, 0);
            MethodCollector.m26664o(10247);
            return awVar;
        }
        int[] nativeGetDecodeDumpInfo = nativeGetDecodeDumpInfo(j, i, i2);
        C85375aw awVar2 = new C85375aw(nativeGetDecodeDumpInfo[0], nativeGetDecodeDumpInfo[1], nativeGetDecodeDumpInfo[2], nativeGetDecodeDumpInfo[3]);
        MethodCollector.m26664o(10247);
        return awVar2;
    }

    public final boolean processTouchEvent(C85392bf bfVar, int i) {
        MethodCollector.m26663i(14084);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14084);
            return false;
        }
        boolean nativeProcessTouchEvent2 = nativeProcessTouchEvent2(j, bfVar.f191160a, bfVar.f191162c, bfVar.f191163d, bfVar.f191164e, bfVar.f191165f, bfVar.f191161b.ordinal(), i);
        MethodCollector.m26664o(14084);
        return nativeProcessTouchEvent2;
    }

    public final boolean setFrameTrace(String str, int i) {
        MethodCollector.m26663i(9299);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(9299);
            return false;
        } else if (nativeFrameTrace(j, str, i) == 0) {
            MethodCollector.m26664o(9299);
            return true;
        } else {
            MethodCollector.m26664o(9299);
            return false;
        }
    }

    public final boolean suspendGestureRecognizer(EnumC85306ad adVar, boolean z) {
        int ordinal;
        MethodCollector.m26663i(14086);
        if (this.mNative == 0) {
            MethodCollector.m26664o(14086);
            return false;
        }
        if (adVar.ordinal() == EnumC85306ad.ANY_SUPPORTED.ordinal()) {
            ordinal = -1;
        } else {
            ordinal = adVar.ordinal();
        }
        boolean nativeSuspendGestureRecognizer = nativeSuspendGestureRecognizer(this.mNative, ordinal, z);
        MethodCollector.m26664o(14086);
        return nativeSuspendGestureRecognizer;
    }

    public static LoudnessDetectResult[] detectAudioLoudness(String[] strArr, int[] iArr, int[] iArr2) {
        MethodCollector.m26663i(13626);
        LoudnessDetectResult[] nativeDetectAudioLoudness = nativeDetectAudioLoudness(strArr, iArr, iArr2);
        MethodCollector.m26664o(13626);
        return nativeDetectAudioLoudness;
    }

    public static int setDropFrameParam(boolean z, long j, long j2) {
        MethodCollector.m26663i(14080);
        int nativeSetDropFrameParam = nativeSetDropFrameParam(z, j, j2);
        MethodCollector.m26664o(14080);
        return nativeSetDropFrameParam;
    }

    public static int setImageBufferLimit(int i, int i2, int i3) {
        MethodCollector.m26663i(14114);
        int nativeSetImageBufferLimit = nativeSetImageBufferLimit(i, i2, i3);
        MethodCollector.m26664o(14114);
        return nativeSetImageBufferLimit;
    }

    public final int addClipAuxiliaryParam(int i, int i2, VEClipAuxiliaryParam[] vEClipAuxiliaryParamArr) {
        MethodCollector.m26663i(13829);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13829);
            return -112;
        }
        int nativeAddClipAuxiliaryParam = nativeAddClipAuxiliaryParam(j, i, i2, vEClipAuxiliaryParamArr);
        MethodCollector.m26664o(13829);
        return nativeAddClipAuxiliaryParam;
    }

    public final int adjustFilterInOut(int i, int i2, int i3) {
        MethodCollector.m26663i(13804);
        int nativeAdjustFilterInOut = nativeAdjustFilterInOut(this.mNative, i, i2, i3);
        MethodCollector.m26664o(13804);
        return nativeAdjustFilterInOut;
    }

    public final int deleteClip(int i, int i2, int i3) {
        MethodCollector.m26663i(13066);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13066);
            return -112;
        }
        int nativeDeleteClip = nativeDeleteClip(j, i, i2, i3);
        MethodCollector.m26664o(13066);
        return nativeDeleteClip;
    }

    public final int deleteKeyFrameParam(int i, int i2, int i3) {
        MethodCollector.m26663i(13468);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13468);
            return -112;
        }
        int nativeDeleteKeyFrameParam = nativeDeleteKeyFrameParam(j, i, i2, i3);
        MethodCollector.m26664o(13468);
        return nativeDeleteKeyFrameParam;
    }

    public final int faceCoverClear(int i, String str, boolean z) {
        MethodCollector.m26663i(10659);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(10659);
            return -112;
        }
        int nativeFaceCoverClear = nativeFaceCoverClear(j, i, str, z);
        MethodCollector.m26664o(10659);
        return nativeFaceCoverClear;
    }

    public final String getClipInfoString(int i, int i2, int i3) {
        MethodCollector.m26663i(12086);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12086);
            return "";
        }
        String nativeGetClipInfoString = nativeGetClipInfoString(j, i, i2, i3);
        MethodCollector.m26664o(12086);
        return nativeGetClipInfoString;
    }

    public final long getClipSequenceOut(int i, int i2, int i3) {
        MethodCollector.m26663i(13525);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13525);
            return -112;
        }
        long nativeGetClipSequenceOut = nativeGetClipSequenceOut(j, i, i2, i3);
        MethodCollector.m26664o(13525);
        return nativeGetClipSequenceOut;
    }

    public final int getDecodeImage(Bitmap bitmap, int i, int i2) {
        MethodCollector.m26663i(9922);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(9922);
            return -112;
        }
        int nativeGetDecodeImage = nativeGetDecodeImage(j, bitmap, i, i2);
        MethodCollector.m26664o(9922);
        return nativeGetDecodeImage;
    }

    public final float getTrackVolume(int i, int i2, int i3) {
        MethodCollector.m26663i(12357);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12357);
            return 0.0f;
        }
        float nativeGetTrackVolume = nativeGetTrackVolume(j, i, i2, i3);
        MethodCollector.m26664o(12357);
        return nativeGetTrackVolume;
    }

    public final void setAudioCompileSetting(int i, int i2, int i3) {
        if (this.mNative != 0) {
            setOption(0, "AudioSampleRate", (long) i);
            setOption(0, "AudioChannels", (long) i2);
            setOption(0, "AudioBitrate", (long) i3);
        }
    }

    public final int setExtTrackSeqIn(int i, int i2, int i3) {
        MethodCollector.m26663i(13511);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13511);
            return -112;
        }
        int nativeSetSubTrackSeqIn = nativeSetSubTrackSeqIn(j, i, i2, i3);
        MethodCollector.m26664o(13511);
        return nativeSetSubTrackSeqIn;
    }

    public final int setFilterParam(int i, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam) {
        MethodCollector.m26663i(13746);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13746);
            return -112;
        }
        int nativeSetFilterParam = nativeSetFilterParam(j, i, str, vEMusicSRTEffectParam);
        MethodCollector.m26664o(13746);
        return nativeSetFilterParam;
    }

    public final void setOption(int i, String str, float f) {
        MethodCollector.m26663i(12218);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12218);
            return;
        }
        nativeSetOption(j, i, str, f);
        MethodCollector.m26664o(12218);
    }

    public final void setResizer(int i, float f, float f2) {
        setOption(0, "filter mode", (long) i);
        setOption(0, "resizer offset x percent", f);
        setOption(0, "resizer offset y percent", f2);
    }

    public final int setTimeRange(int i, int i2, int i3) {
        MethodCollector.m26663i(14142);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14142);
            return -112;
        }
        int nativeSetTimeRange = nativeSetTimeRange(j, i, i2, i3);
        MethodCollector.m26664o(14142);
        return nativeSetTimeRange;
    }

    public final int setTrackDurationType(int i, int i2, int i3) {
        MethodCollector.m26663i(13527);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13527);
            return -112;
        }
        int nativeSetTrackDurationType = nativeSetTrackDurationType(j, i, i2, i3);
        MethodCollector.m26664o(13527);
        return nativeSetTrackDurationType;
    }

    public final int setTrackFilterEnable(int i, boolean z, boolean z2) {
        MethodCollector.m26663i(13140);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13140);
            return -112;
        }
        int nativeSetTrackFilterEnable = nativeSetTrackFilterEnable(j, i, z, z2);
        MethodCollector.m26664o(13140);
        return nativeSetTrackFilterEnable;
    }

    public final int setTrackLayer(int i, int i2, int i3) {
        MethodCollector.m26663i(13510);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13510);
            return -112;
        }
        int nativeSetTrackLayer = nativeSetTrackLayer(j, i, i2, i3);
        MethodCollector.m26664o(13510);
        return nativeSetTrackLayer;
    }

    public final boolean setTrackVolume(int i, int i2, float f) {
        MethodCollector.m26663i(12221);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12221);
            return false;
        }
        boolean nativeSetTrackVolume = nativeSetTrackVolume(j, i, i2, f);
        MethodCollector.m26664o(12221);
        return nativeSetTrackVolume;
    }

    public final int setTransitionAt(int i, long j, String str) {
        MethodCollector.m26663i(13524);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.m26664o(13524);
            return -112;
        }
        int nativeSetTransitionAt = nativeSetTransitionAt(j2, i, j, str);
        MethodCollector.m26664o(13524);
        return nativeSetTransitionAt;
    }

    public final int updateAICutOutClipParam(int i, int i2, VEAICutOutClipParam vEAICutOutClipParam) {
        MethodCollector.m26663i(13271);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13271);
            return -112;
        }
        int nativeUpdateAICutOutClipParam = nativeUpdateAICutOutClipParam(j, i, i2, vEAICutOutClipParam);
        MethodCollector.m26664o(13271);
        return nativeUpdateAICutOutClipParam;
    }

    public final int updateComposerNode(String str, String str2, float f) {
        MethodCollector.m26663i(14049);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14049);
            return -112;
        }
        int nativeUpdateComposerNode = nativeUpdateComposerNode(j, str, str2, f);
        MethodCollector.m26664o(14049);
        return nativeUpdateComposerNode;
    }

    public final int updateTrackClips(int i, int i2, String[] strArr) {
        MethodCollector.m26663i(12479);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12479);
            return -112;
        }
        int nativeUpdateTrackClip = nativeUpdateTrackClip(j, i, i2, strArr);
        MethodCollector.m26664o(12479);
        return nativeUpdateTrackClip;
    }

    public final int updateTrackFilter(int i, int i2, boolean z) {
        MethodCollector.m26663i(12586);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12586);
            return -112;
        }
        int nativeUpdateTrackFilter = nativeUpdateTrackFilter(j, i, i2, z);
        MethodCollector.m26664o(12586);
        return nativeUpdateTrackFilter;
    }

    public final int[] checkComposerNodeExclusion(String str, String str2, String str3) {
        MethodCollector.m26663i(14053);
        long j = this.mNative;
        if (j == 0) {
            int[] iArr = {-1, 0};
            MethodCollector.m26664o(14053);
            return iArr;
        }
        int[] nativeCheckComposerNodeExclusion = nativeCheckComposerNodeExclusion(j, str, str2, str3);
        MethodCollector.m26664o(14053);
        return nativeCheckComposerNodeExclusion;
    }

    public final int processTouchDownEvent(float f, float f2, EnumC85307ae aeVar) {
        MethodCollector.m26663i(12695);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12695);
            return -112;
        }
        int nativeProcessTouchDownEvent = nativeProcessTouchDownEvent(j, f, f2, aeVar.ordinal());
        MethodCollector.m26664o(12695);
        return nativeProcessTouchDownEvent;
    }

    public final int processTouchUpEvent(float f, float f2, EnumC85307ae aeVar) {
        MethodCollector.m26663i(12697);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12697);
            return -112;
        }
        int nativeProcessTouchUpEvent = nativeProcessTouchUpEvent(j, f, f2, aeVar.ordinal());
        MethodCollector.m26664o(12697);
        return nativeProcessTouchUpEvent;
    }

    public final int setFilterParam(int i, String str, VEStickerAnimator vEStickerAnimator) {
        MethodCollector.m26663i(13678);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13678);
            return -112;
        }
        int nativeSetFilterParam = nativeSetFilterParam(j, i, str, vEStickerAnimator);
        MethodCollector.m26664o(13678);
        return nativeSetFilterParam;
    }

    public final void setOption(int i, String str, long j) {
        MethodCollector.m26663i(12217);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.m26664o(12217);
            return;
        }
        nativeSetOption(j2, i, str, j);
        MethodCollector.m26664o(12217);
    }

    public final int updateScene(String[] strArr, int[] iArr, int[] iArr2) {
        MethodCollector.m26663i(13062);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13062);
            return -112;
        }
        int nativeUpdateScene = nativeUpdateScene(j, strArr, iArr, iArr2);
        if (nativeUpdateScene < 0) {
            MethodCollector.m26664o(13062);
            return nativeUpdateScene;
        }
        this.mHostTrackIndex = nativeUpdateScene;
        MethodCollector.m26664o(13062);
        return 0;
    }

    public final int setFilterParam(int i, String str, VEEffectFilterParam vEEffectFilterParam) {
        MethodCollector.m26663i(13677);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13677);
            return -112;
        }
        int nativeSetFilterParam = nativeSetFilterParam(j, i, str, vEEffectFilterParam);
        MethodCollector.m26664o(13677);
        return nativeSetFilterParam;
    }

    public final void setOption(int i, String str, String str2) {
        MethodCollector.m26663i(12088);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12088);
            return;
        }
        nativeSetOption(j, i, str, str2);
        MethodCollector.m26664o(12088);
    }

    public final int setFilterParam(int i, String str, String str2) {
        MethodCollector.m26663i(13675);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13675);
            return -112;
        }
        int nativeSetFilterParam = nativeSetFilterParam(j, i, str, str2);
        MethodCollector.m26664o(13675);
        return nativeSetFilterParam;
    }

    public final void setOption(int i, String str, int[] iArr) {
        MethodCollector.m26663i(12089);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12089);
            return;
        }
        nativeSetOptionIntArray(j, i, str, iArr);
        MethodCollector.m26664o(12089);
    }

    public final int setFilterParam(int i, String str, byte[] bArr) {
        MethodCollector.m26663i(13676);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13676);
            return -112;
        }
        int nativeSetFilterParam2 = nativeSetFilterParam2(j, i, str, bArr);
        MethodCollector.m26664o(13676);
        return nativeSetFilterParam2;
    }

    public final void setOption(int i, String str, long[] jArr) {
        MethodCollector.m26663i(12220);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12220);
            return;
        }
        nativeSetOptionLongArray(j, i, str, jArr);
        MethodCollector.m26664o(12220);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final int updateFilterParam(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        MethodCollector.m26663i(13139);
        if (this.mNative == 0) {
            MethodCollector.m26664o(13139);
            return -112;
        }
        int i3 = vEBaseFilterParam.filterType;
        if (i3 == 7) {
            int nativeUpdateColorFilterParam = nativeUpdateColorFilterParam(this.mNative, i, i2, (VEColorFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(13139);
            return nativeUpdateColorFilterParam;
        } else if (i3 == 8) {
            int nativeUpdateEffectFilterParam = nativeUpdateEffectFilterParam(this.mNative, i, i2, (VEEffectFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(13139);
            return nativeUpdateEffectFilterParam;
        } else if (i3 == 12) {
            int nativeUpdateBeautyFilterParam = nativeUpdateBeautyFilterParam(this.mNative, i, i2, (VEBeautyFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(13139);
            return nativeUpdateBeautyFilterParam;
        } else if (i3 == 13) {
            int nativeUpdateReshapeFilterParam = nativeUpdateReshapeFilterParam(this.mNative, i, i2, (VEReshapeFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(13139);
            return nativeUpdateReshapeFilterParam;
        } else if (i3 == 27) {
            int nativeUpdateVideoStabFilterParam = nativeUpdateVideoStabFilterParam(this.mNative, i, i2, (VEVideoStableFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(13139);
            return nativeUpdateVideoStabFilterParam;
        } else if (i3 == 33) {
            int nativeUpdateLensHdrFilterParam = nativeUpdateLensHdrFilterParam(this.mNative, i, i2, (VELensHdrFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(13139);
            return nativeUpdateLensHdrFilterParam;
        } else if (i3 == 35) {
            int nativeUpdateLensOneKeyHdrFilterParam = nativeUpdateLensOneKeyHdrFilterParam(this.mNative, i, i2, (VEVideoLensOneKeyHdrParam) vEBaseFilterParam);
            MethodCollector.m26664o(13139);
            return nativeUpdateLensOneKeyHdrFilterParam;
        } else if (i3 != 36) {
            switch (i3) {
                case 15:
                    if (vEBaseFilterParam instanceof VEVideoTransformFilterParam) {
                        int nativeUpdateVideoTransformFilterParam = nativeUpdateVideoTransformFilterParam(this.mNative, i, i2, (VEVideoTransformFilterParam) vEBaseFilterParam);
                        MethodCollector.m26664o(13139);
                        return nativeUpdateVideoTransformFilterParam;
                    } else if (vEBaseFilterParam instanceof VECanvasFilterParam) {
                        int nativeUpdateCanvasFilterParam = nativeUpdateCanvasFilterParam(this.mNative, i, i2, (VECanvasFilterParam) vEBaseFilterParam);
                        MethodCollector.m26664o(13139);
                        return nativeUpdateCanvasFilterParam;
                    }
                    break;
                case 16:
                    int nativeUpdateEffectHdrFilterParam = nativeUpdateEffectHdrFilterParam(this.mNative, i, i2, (VEEffectHdrFilterParam) vEBaseFilterParam);
                    MethodCollector.m26664o(13139);
                    return nativeUpdateEffectHdrFilterParam;
                case 17:
                    int nativeUpdateQualityFilterParam = nativeUpdateQualityFilterParam(this.mNative, i, i2, (VEVideoAjustmentFilterParam) vEBaseFilterParam);
                    MethodCollector.m26664o(13139);
                    return nativeUpdateQualityFilterParam;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    break;
                case 19:
                    int nativeUpdateCropFilterParam = nativeUpdateCropFilterParam(this.mNative, i, i2, (VEVideoCropFilterParam) vEBaseFilterParam);
                    MethodCollector.m26664o(13139);
                    return nativeUpdateCropFilterParam;
                case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                    int nativeUpdateImageTransformFilterParam = nativeUpdateImageTransformFilterParam(this.mNative, i, i2, (VEImageTransformFilterParam) vEBaseFilterParam);
                    MethodCollector.m26664o(13139);
                    return nativeUpdateImageTransformFilterParam;
                case 21:
                    int nativeUpdateImageAddFilterParam = nativeUpdateImageAddFilterParam(this.mNative, i, i2, (VEImageAddFilterParam) vEBaseFilterParam);
                    MethodCollector.m26664o(13139);
                    return nativeUpdateImageAddFilterParam;
                case 22:
                    int nativeUpdateAmazingFilterParam = nativeUpdateAmazingFilterParam(this.mNative, i, i2, (VEAmazingFilterParam) vEBaseFilterParam);
                    MethodCollector.m26664o(13139);
                    return nativeUpdateAmazingFilterParam;
                default:
                    MethodCollector.m26664o(13139);
                    return -100;
            }
            VEComposerFilterParam vEComposerFilterParam = (VEComposerFilterParam) vEBaseFilterParam;
            if (!vEComposerFilterParam.isValid()) {
                MethodCollector.m26664o(13139);
                return -100;
            } else if (vEComposerFilterParam.isOverallComposer()) {
                int nativeUpdateEffectComposerParam = nativeUpdateEffectComposerParam(this.mNative, i, i2, vEComposerFilterParam);
                MethodCollector.m26664o(13139);
                return nativeUpdateEffectComposerParam;
            } else {
                int nativeUpdateMultiEffectComposerParam = nativeUpdateMultiEffectComposerParam(this.mNative, i, i2, (VEMultiComposerFilterParam) vEComposerFilterParam);
                MethodCollector.m26664o(13139);
                return nativeUpdateMultiEffectComposerParam;
            }
        } else {
            int nativeUpdateColorAdjustHslFilterParam = nativeUpdateColorAdjustHslFilterParam(this.mNative, i, i2, (VEColorHslFilterParam) vEBaseFilterParam);
            MethodCollector.m26664o(13139);
            return nativeUpdateColorAdjustHslFilterParam;
        }
    }

    public final void setOption(int i, String[] strArr, long[] jArr) {
        MethodCollector.m26663i(12219);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12219);
            return;
        }
        nativeSetOptionArray(j, i, strArr, jArr);
        MethodCollector.m26664o(12219);
    }

    public static String audioExtend(String str, float f, float f2, float f3) {
        MethodCollector.m26663i(11565);
        String nativeAudioExtend = nativeAudioExtend(str, f, f2, f3);
        MethodCollector.m26664o(11565);
        return nativeAudioExtend;
    }

    public static int setMaxSoftWareVideoReaderCount(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(14079);
        int nativeSetMaxSoftwareVideoReaderCount = nativeSetMaxSoftwareVideoReaderCount(i, i2, i3, i4);
        MethodCollector.m26664o(14079);
        return nativeSetMaxSoftwareVideoReaderCount;
    }

    public final int concatShootVideo(String str, String[] strArr, long[] jArr, boolean z) {
        MethodCollector.m26663i(13137);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13137);
            return -112;
        }
        int nativeConcatShootVideo = nativeConcatShootVideo(j, str, strArr, jArr, z);
        MethodCollector.m26664o(13137);
        return nativeConcatShootVideo;
    }

    public final String getClipInfoStringWithPath(int i, int i2, int i3, String str) {
        MethodCollector.m26663i(12087);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12087);
            return "";
        }
        String nativeGetClipInfoStringWithPath = nativeGetClipInfoStringWithPath(j, i, i2, i3, str);
        MethodCollector.m26664o(12087);
        return nativeGetClipInfoStringWithPath;
    }

    public final int getImages(int[] iArr, int i, int i2, int i3) {
        MethodCollector.m26663i(14144);
        int nativeGetImages = nativeGetImages(this.mNative, iArr, i, i2, i3);
        MethodCollector.m26664o(14144);
        return nativeGetImages;
    }

    public final int moveClip(int i, int i2, int i3, boolean z) {
        MethodCollector.m26663i(13064);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13064);
            return -112;
        }
        int nativeMoveClip = nativeMoveClip(j, i, i2, i3, z);
        MethodCollector.m26664o(13064);
        return nativeMoveClip;
    }

    public final int replaceClip(int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        MethodCollector.m26663i(13065);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13065);
            return -112;
        }
        int nativeReplaceClip = nativeReplaceClip(j, i, i2, vEClipSourceParam, vEClipTimelineParam);
        MethodCollector.m26664o(13065);
        return nativeReplaceClip;
    }

    public final int seek(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(14283);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14283);
            return -112;
        }
        int nativeSeek = nativeSeek(j, i, i2, i3, i4);
        MethodCollector.m26664o(14283);
        return nativeSeek;
    }

    public final int setCompileAudioDriver(String str, int i, int i2, String str2) {
        MethodCollector.m26663i(13694);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13694);
            return -112;
        }
        int nativeSetCompileAudioDriver = nativeSetCompileAudioDriver(j, str, i, i2, str2);
        MethodCollector.m26664o(13694);
        return nativeSetCompileAudioDriver;
    }

    public final void setCompileSoftwareEncodeOptions(int i, long j, int i2, int i3) {
        setOption(0, "CompileSoftwareCrf", (long) i);
        setOption(0, "CompileSoftwareMaxrate", j);
        setOption(0, "CompileSoftwarePreset", (long) i2);
        setOption(0, "CompileSoftwareQp", (long) i3);
    }

    public final int setKeyFrameParam(int i, int i2, int i3, String str) {
        MethodCollector.m26663i(13204);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13204);
            return -112;
        }
        int nativeSetKeyFrameParam = nativeSetKeyFrameParam(j, i, i2, i3, str);
        MethodCollector.m26664o(13204);
        return nativeSetKeyFrameParam;
    }

    public final int setTrackMinMaxDuration(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(13526);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13526);
            return -112;
        }
        int nativeSetTrackMinMaxDuration = nativeSetTrackMinMaxDuration(j, i, i2, i3, i4);
        MethodCollector.m26664o(13526);
        return nativeSetTrackMinMaxDuration;
    }

    public final void setViewPort(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(14315);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14315);
            return;
        }
        nativeSetViewPort(j, i, i2, i3, i4);
        MethodCollector.m26664o(14315);
    }

    public final int updateClipsSourceParam(int i, int i2, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr) {
        MethodCollector.m26663i(13068);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13068);
            return -112;
        }
        int nativeUpdateClipsSourceParam = nativeUpdateClipsSourceParam(j, i, i2, iArr, vEClipSourceParamArr);
        MethodCollector.m26664o(13068);
        return nativeUpdateClipsSourceParam;
    }

    public final int updateClipsTimelineParam(int i, int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        MethodCollector.m26663i(13067);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13067);
            return -112;
        }
        int nativeUpdateClipsTimelineParam = nativeUpdateClipsTimelineParam(j, i, i2, iArr, vEClipTimelineParamArr);
        MethodCollector.m26664o(13067);
        return nativeUpdateClipsTimelineParam;
    }

    public final int updateFilterTime(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(13522);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13522);
            return -112;
        }
        int nativeUpdateFilterTime = nativeUpdateFilterTime(j, i, i2, i3, i4);
        MethodCollector.m26664o(13522);
        return nativeUpdateFilterTime;
    }

    public final int updateMultiComposerNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        MethodCollector.m26663i(14052);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14052);
            return -112;
        }
        int nativeUpdateMultiComposerNodes = nativeUpdateMultiComposerNodes(j, i, strArr, strArr2, fArr);
        MethodCollector.m26664o(14052);
        return nativeUpdateMultiComposerNodes;
    }

    public final int addAudioTrackForClips(String[] strArr, int[] iArr, int[] iArr2, float[] fArr) {
        MethodCollector.m26663i(13388);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13388);
            return -1;
        } else if (strArr == null || strArr.length == 0) {
            MethodCollector.m26664o(13388);
            return -100;
        } else {
            int nativeAddAudioTrackForClips = nativeAddAudioTrackForClips(j, strArr, iArr, iArr2, fArr);
            MethodCollector.m26664o(13388);
            return nativeAddAudioTrackForClips;
        }
    }

    public final int initVideoEditorWithStruct(VECommonClipParam[] vECommonClipParamArr, VECommonClipParam[] vECommonClipParamArr2, String[] strArr, int i) {
        MethodCollector.m26663i(13871);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13871);
            return -112;
        }
        int nativeInitVideoEditorWithStruct = nativeInitVideoEditorWithStruct(j, vECommonClipParamArr, vECommonClipParamArr2, strArr, i);
        if (nativeInitVideoEditorWithStruct < 0) {
            MethodCollector.m26664o(13871);
            return nativeInitVideoEditorWithStruct;
        }
        this.mHostTrackIndex = nativeInitVideoEditorWithStruct;
        MethodCollector.m26664o(13871);
        return 0;
    }

    public final void setCrop(int i, int i2, int i3, int i4) {
        setOption(1, new String[]{"engine crop x", "engine crop y", "engine crop width", "engine crop height"}, new long[]{(long) i, (long) i2, (long) i3, (long) i4});
    }

    public final void updateResolution(int i, int i2, int i3, int i4) {
        setOption(1, new String[]{"engine preivew width", "engine preivew height", "engine preivew width percent", "engine preivew height percent"}, new long[]{(long) i, (long) i2, (long) i3, (long) i4});
    }

    public final int updateTrackFilterDuration(int i, int i2, boolean z, long j) {
        MethodCollector.m26663i(12690);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.m26664o(12690);
            return -112;
        }
        int nativeUpdateTrackFilterDuration = nativeUpdateTrackFilterDuration(j2, i, i2, z, j);
        MethodCollector.m26664o(12690);
        return nativeUpdateTrackFilterDuration;
    }

    public final int setClipAttr(int i, int i2, int i3, String str, String str2) {
        MethodCollector.m26663i(12692);
        int nativeSetClipAttr = nativeSetClipAttr(this.mNative, i, i2, i3, str, str2);
        MethodCollector.m26664o(12692);
        return nativeSetClipAttr;
    }

    public final int faceCoverLoad(int i, String[] strArr, int i2, String str, boolean z) {
        MethodCollector.m26663i(14388);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14388);
            return -112;
        }
        int nativeFaceCoverLoad = nativeFaceCoverLoad(j, i, strArr, i2, str, z);
        MethodCollector.m26664o(14388);
        return nativeFaceCoverLoad;
    }

    public final int faceCoverSet(int i, double d, double d2, String str, boolean z) {
        MethodCollector.m26663i(10950);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(10950);
            return -112;
        }
        int nativeFaceCoverSet = nativeFaceCoverSet(j, i, d, d2, str, z);
        MethodCollector.m26664o(10950);
        return nativeFaceCoverSet;
    }

    public final int initAudioEditor(String str, String[] strArr, int[] iArr, int[] iArr2, float[] fArr) {
        MethodCollector.m26663i(13793);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13793);
            return -112;
        }
        int nativeInitAudioEditor = nativeInitAudioEditor(j, str, strArr, iArr, iArr2, fArr);
        if (nativeInitAudioEditor < 0) {
            MethodCollector.m26664o(13793);
            return nativeInitAudioEditor;
        }
        this.mHostTrackIndex = nativeInitAudioEditor;
        MethodCollector.m26664o(13793);
        return 0;
    }

    public final int insertClip(int i, int i2, int i3, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        MethodCollector.m26663i(12975);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12975);
            return -112;
        }
        int nativeInsertClip = nativeInsertClip(j, i, i2, i3, vEClipSourceParam, vEClipTimelineParam);
        MethodCollector.m26664o(12975);
        return nativeInsertClip;
    }

    public final int preprocessAudioTrackForFilter(int i, int i2, String str, byte[] bArr, long[] jArr) {
        MethodCollector.m26663i(12693);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12693);
            return -112;
        }
        int nativePreprocessAudioTrackForFilter = nativePreprocessAudioTrackForFilter(j, i, i2, str, bArr, jArr);
        MethodCollector.m26664o(12693);
        return nativePreprocessAudioTrackForFilter;
    }

    public final int processPanEvent(float f, float f2, float f3, float f4, float f5) {
        MethodCollector.m26663i(12698);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(12698);
            return -112;
        }
        int nativeProcessPanEvent = nativeProcessPanEvent(j, f, f2, f3, f4, f5);
        MethodCollector.m26664o(12698);
        return nativeProcessPanEvent;
    }

    public final int replaceComposerNodesWithTag(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        MethodCollector.m26663i(14054);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14054);
            return -112;
        }
        int nativeReplaceComposerNodesWithTag = nativeReplaceComposerNodesWithTag(j, strArr, i, strArr2, i2, strArr3);
        MethodCollector.m26664o(14054);
        return nativeReplaceComposerNodesWithTag;
    }

    public final int seekWithTolerance(int i, int i2, int i3, int i4, int i5) {
        MethodCollector.m26663i(14285);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(14285);
            return -112;
        }
        int nativeSeekWithTolerance = nativeSeekWithTolerance(j, i, i2, i3, i4, i5);
        MethodCollector.m26664o(14285);
        return nativeSeekWithTolerance;
    }

    public final int updateScene(String[] strArr, int[] iArr, int[] iArr2, boolean[] zArr, String[] strArr2) {
        MethodCollector.m26663i(13063);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13063);
            return -112;
        }
        int nativeUpdateSceneLoadCache = nativeUpdateSceneLoadCache(j, strArr, iArr, iArr2, zArr, strArr2);
        if (nativeUpdateSceneLoadCache < 0) {
            MethodCollector.m26664o(13063);
            return nativeUpdateSceneLoadCache;
        }
        this.mHostTrackIndex = nativeUpdateSceneLoadCache;
        MethodCollector.m26664o(13063);
        return 0;
    }

    public final int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        return addFilters(iArr, strArr, iArr2, iArr3, iArr4, iArr5, null);
    }

    public final int addAudioTrack(String str, int i, int i2, int i3, int i4, boolean z) {
        MethodCollector.m26663i(13265);
        if (this.mNative == 0) {
            MethodCollector.m26664o(13265);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13265);
            return -100;
        } else {
            int nativeAddAudioTrack = nativeAddAudioTrack(this.mNative, str, i, i2, i3, i4, z);
            MethodCollector.m26664o(13265);
            return nativeAddAudioTrack;
        }
    }

    public final int faceCoverScale(int i, double d, double d2, double d3, String str, boolean z) {
        MethodCollector.m26663i(11097);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(11097);
            return -112;
        }
        int nativeFaceCoverScale = nativeFaceCoverScale(j, i, d, d2, d3, str, z);
        MethodCollector.m26664o(11097);
        return nativeFaceCoverScale;
    }

    public final int initVideoEditor(String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i) {
        MethodCollector.m26663i(13736);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13736);
            return -112;
        }
        int nativeInitVideoEditor = nativeInitVideoEditor(j, str, strArr, strArr2, strArr3, strArr4, i);
        if (nativeInitVideoEditor < 0) {
            MethodCollector.m26664o(13736);
            return nativeInitVideoEditor;
        }
        this.mHostTrackIndex = nativeInitVideoEditor;
        MethodCollector.m26664o(13736);
        return 0;
    }

    public final int addExternalVideoTrack(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        MethodCollector.m26663i(13509);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13509);
            return -112;
        }
        int nativeAddSubVideoTrack = nativeAddSubVideoTrack(j, strArr, strArr2, iArr, iArr2, iArr3, iArr4, i);
        MethodCollector.m26664o(13509);
        return nativeAddSubVideoTrack;
    }

    public final int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        MethodCollector.m26663i(13512);
        long j = this.mNative;
        if (j == 0) {
            int[] iArr7 = {-1};
            MethodCollector.m26664o(13512);
            return iArr7;
        }
        int[] nativeAddFilters = nativeAddFilters(j, iArr, strArr, iArr2, iArr3, iArr4, iArr5, iArr6);
        MethodCollector.m26664o(13512);
        return nativeAddFilters;
    }

    public final int beginAudioExtendToFile(String str, String str2, String str3, float f, float f2, float f3, final VEListener.AbstractC85226ae aeVar) {
        MethodCollector.m26663i(12792);
        if (this.mNative == 0) {
            MethodCollector.m26664o(12792);
            return -112;
        }
        setAudioExtendToFileCallback(new NativeCallbacks.AbstractC30701a() {
            /* class com.p2082ss.android.ttve.nativePort.TEInterface.C307091 */

            static {
                Covode.recordClassIndex(37300);
            }
        });
        int nativeBeginAudioExtendToFile = nativeBeginAudioExtendToFile(this.mNative, str, str2, str3, f, f2, f3);
        MethodCollector.m26664o(12792);
        return nativeBeginAudioExtendToFile;
    }

    public final void setDisplayState(float f, float f2, float f3, float f4, int i, int i2, int i3) {
        MethodCollector.m26663i(9617);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(9617);
            return;
        }
        nativeSetDisplayState(j, f, f2, f3, f4, i, i2, i3);
        MethodCollector.m26664o(9617);
    }

    public final int updateAudioTrack(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        MethodCollector.m26663i(13458);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13458);
            return -1;
        } else if (i < 0) {
            MethodCollector.m26664o(13458);
            return -100;
        } else {
            int nativeUpdateAudioTrack = nativeUpdateAudioTrack(j, i, i2, i3, i4, i5, z, z2);
            MethodCollector.m26664o(13458);
            return nativeUpdateAudioTrack;
        }
    }

    public final int addWaterMark(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, double d, double d2, double d3, double d4) {
        MethodCollector.m26663i(13508);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13508);
            return -112;
        }
        int i = this.mHostTrackIndex;
        if (i < 0) {
            MethodCollector.m26664o(13508);
            return -105;
        }
        int nativeAddSubTrack = nativeAddSubTrack(j, strArr, strArr2, iArr, iArr2, iArr, iArr2, d, d2, d3, d4, 5, i);
        MethodCollector.m26664o(13508);
        return nativeAddSubTrack;
    }

    public final int updateAudioTrack(int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        MethodCollector.m26663i(13459);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13459);
            return -1;
        } else if (i < 0) {
            MethodCollector.m26664o(13459);
            return -100;
        } else {
            int nativeUpdateAudioTrack2 = nativeUpdateAudioTrack2(j, i, i2, i3, i4, i5, z, i6, i7);
            MethodCollector.m26664o(13459);
            return nativeUpdateAudioTrack2;
        }
    }

    public final int addAudioTrack(String str, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        MethodCollector.m26663i(13457);
        if (this.mNative == 0) {
            MethodCollector.m26664o(13457);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13457);
            return -100;
        } else {
            int nativeAddAudioTrack2 = nativeAddAudioTrack2(this.mNative, str, i, i2, i3, i4, z, i5, i6);
            MethodCollector.m26664o(13457);
            return nativeAddAudioTrack2;
        }
    }

    public final int initVideoEditor(String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i, boolean[] zArr, String[] strArr5) {
        MethodCollector.m26663i(13791);
        long j = this.mNative;
        if (j == 0) {
            MethodCollector.m26664o(13791);
            return -112;
        }
        int nativeInitVideoEditorLoadCache = nativeInitVideoEditorLoadCache(j, str, strArr, strArr2, strArr3, strArr4, i, zArr, strArr5);
        if (nativeInitVideoEditorLoadCache < 0) {
            MethodCollector.m26664o(13791);
            return nativeInitVideoEditorLoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditorLoadCache;
        MethodCollector.m26664o(13791);
        return 0;
    }

    public final int addAudioTrack(String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        MethodCollector.m26663i(13323);
        if (this.mNative == 0) {
            MethodCollector.m26664o(13323);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13323);
            return -100;
        } else {
            int nativeAddAudioTrackWithNeedPrepare = nativeAddAudioTrackWithNeedPrepare(this.mNative, str, str2, i, i2, i3, i4, z, z2);
            MethodCollector.m26664o(13323);
            return nativeAddAudioTrackWithNeedPrepare;
        }
    }

    public final int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int i) {
        return initVideoEditor2(strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr, fArr, null, i, false);
    }

    public final int initImageEditor(Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i) {
        float[] fArr2 = fArr;
        MethodCollector.m26663i(14310);
        if (this.mNative == 0) {
            MethodCollector.m26664o(14310);
            return -112;
        }
        if (fArr2 == null) {
            fArr2 = new float[bitmapArr.length];
            Arrays.fill(fArr2, 1.0f);
        }
        int nativeInitImageEditor = nativeInitImageEditor(this.mNative, bitmapArr, iArr, iArr2, strArr, iArr3, iArr4, strArr2, strArr3, fArr2, iArr5, i);
        if (nativeInitImageEditor < 0) {
            MethodCollector.m26664o(14310);
            return nativeInitImageEditor;
        }
        this.mHostTrackIndex = nativeInitImageEditor;
        MethodCollector.m26664o(14310);
        return 0;
    }

    public final int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean[] zArr, String[] strArr5) {
        return initVideoEditor2(strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr, fArr, null, i, false, zArr, strArr5);
    }

    public final int changeResWithEffect(boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, int[] iArr5) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        MethodCollector.m26663i(14327);
        if (this.mNative == 0) {
            MethodCollector.m26664o(14327);
            return -112;
        }
        if (fArr3 == null) {
            fArr3 = new float[strArr.length];
            Arrays.fill(fArr3, 1.0f);
        }
        if (fArr4 == null && strArr3 != null) {
            fArr4 = new float[strArr3.length];
            Arrays.fill(fArr4, 1.0f);
        }
        int nativeChangeResWithEffect = nativeChangeResWithEffect(this.mNative, zArr, strArr, strArr2, iArr, iArr2, fArr3, strArr3, strArr4, iArr3, iArr4, fArr4, iArr5);
        MethodCollector.m26664o(14327);
        return nativeChangeResWithEffect;
    }

    public final int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z) {
        float[] fArr3 = fArr2;
        float[] fArr4 = fArr;
        MethodCollector.m26663i(13876);
        if (this.mNative == 0) {
            MethodCollector.m26664o(13876);
            return -112;
        }
        if (fArr4 == null) {
            fArr4 = new float[strArr.length];
            Arrays.fill(fArr4, 1.0f);
        }
        if (fArr3 == null && strArr2 != null) {
            fArr3 = new float[strArr2.length];
            Arrays.fill(fArr3, 1.0f);
        }
        int nativeInitVideoEditor2 = nativeInitVideoEditor2(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr4, fArr3, iArr5, i, z);
        if (nativeInitVideoEditor2 < 0) {
            MethodCollector.m26664o(13876);
            return nativeInitVideoEditor2;
        }
        this.mHostTrackIndex = nativeInitVideoEditor2;
        MethodCollector.m26664o(13876);
        return 0;
    }

    public final int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z, boolean[] zArr, String[] strArr5) {
        float[] fArr3 = fArr2;
        float[] fArr4 = fArr;
        MethodCollector.m26663i(14302);
        if (this.mNative == 0) {
            MethodCollector.m26664o(14302);
            return -112;
        }
        if (fArr4 == null) {
            fArr4 = new float[strArr.length];
            Arrays.fill(fArr4, 1.0f);
        }
        if (fArr3 == null && strArr2 != null) {
            fArr3 = new float[strArr2.length];
            Arrays.fill(fArr3, 1.0f);
        }
        int nativeInitVideoEditor2LoadCache = nativeInitVideoEditor2LoadCache(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr4, fArr3, iArr5, i, z, zArr, strArr5);
        if (nativeInitVideoEditor2LoadCache < 0) {
            MethodCollector.m26664o(14302);
            return nativeInitVideoEditor2LoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditor2LoadCache;
        MethodCollector.m26664o(14302);
        return 0;
    }

    public final int initVideoEditorWithCanvas(String[] strArr, Bitmap[] bitmapArr, int i, String[] strArr2, int[] iArr, int[] iArr2, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, String[] strArr5, int[] iArr5, int[] iArr6, String[][] strArr6, float[] fArr, int i2, VESize[] vESizeArr) {
        float[] fArr2 = fArr;
        MethodCollector.m26663i(14320);
        if (this.mNative == 0) {
            MethodCollector.m26664o(14320);
            return -112;
        } else if (i <= 0) {
            MethodCollector.m26664o(14320);
            return -100;
        } else {
            if (fArr2 == null) {
                fArr2 = new float[i];
                Arrays.fill(fArr2, 1.0f);
            }
            int nativeInitVideoEditorWithCanvas = nativeInitVideoEditorWithCanvas(this.mNative, strArr, bitmapArr, strArr2, iArr, iArr2, strArr3, strArr4, iArr3, iArr4, strArr5, iArr5, iArr6, strArr6, fArr2, i2, vESizeArr);
            if (nativeInitVideoEditorWithCanvas < 0) {
                MethodCollector.m26664o(14320);
                return nativeInitVideoEditorWithCanvas;
            }
            this.mHostTrackIndex = nativeInitVideoEditorWithCanvas;
            MethodCollector.m26664o(14320);
            return 0;
        }
    }
}
