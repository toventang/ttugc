package com.p2082ss.android.medialib;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.p2082ss.android.medialib.C29974a;
import com.p2082ss.android.medialib.camera.ImageFrame;
import com.p2082ss.android.medialib.listener.AbstractC30011a;
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import com.p2082ss.android.medialib.listener.AbstractC30013c;
import com.p2082ss.android.medialib.listener.AbstractC30014d;
import com.p2082ss.android.medialib.listener.AudioManagerCallback;
import com.p2082ss.android.medialib.listener.DistortionInfoCallback;
import com.p2082ss.android.medialib.listener.SmallWindowSnapshotListener;
import com.p2082ss.android.medialib.log.C30015a;
import com.p2082ss.android.medialib.model.C30017b;
import com.p2082ss.android.medialib.model.EnigmaResult;
import com.p2082ss.android.medialib.model.FaceAttributeInfo;
import com.p2082ss.android.medialib.model.FaceDetectInfo;
import com.p2082ss.android.medialib.model.SceneDetectInfo;
import com.p2082ss.android.medialib.model.SkeletonInfo;
import com.p2082ss.android.medialib.p2155b.C29983a;
import com.p2082ss.android.medialib.p2155b.C29987b;
import com.p2082ss.android.medialib.p2156c.C29993a;
import com.p2082ss.android.medialib.p2158qr.ScanSettings;
import com.p2082ss.android.medialib.presenter.C30049i;
import com.p2082ss.android.medialib.presenter.IStickerRequestCallback;
import com.p2082ss.android.medialib.style.AbstractC30055a;
import com.p2082ss.android.medialib.style.AbstractC30056b;
import com.p2082ss.android.medialib.style.StyleActionListener;
import com.p2082ss.android.medialib.style.StylePathConvertCallback;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.vesdk.AbstractC85313aj;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85392bf;
import com.p2082ss.android.vesdk.C85568t;
import com.p2082ss.android.vesdk.EnumC85306ad;
import com.p2082ss.android.vesdk.LandMarkFrame;
import com.p2082ss.android.vesdk.VEARCoreParam;
import com.p2082ss.android.vesdk.VEDebugSettings;
import com.p2082ss.android.vesdk.VEEffectParams;
import com.p2082ss.android.vesdk.VESafeAreaParams;
import com.p2082ss.android.vesdk.lens.VEAdaptiveSharpenParams;
import com.p2082ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.p2082ss.android.vesdk.lens.VELumaDetectParams;
import com.p2082ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.p2082ss.android.vesdk.model.BefTextLayout;
import com.p2082ss.android.vesdk.model.BefTextLayoutResult;
import com.p2082ss.android.vesdk.runtime.VEMapBufferInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.medialib.RecordInvoker */
public class RecordInvoker implements MessageCenter.Listener {
    private static AbstractC29971a mRecordStopCallback;
    private static Runnable sDuetCompleteRunable = null;
    private static AbstractC30011a sFaceDetectListener;
    private static MessageCenter.Listener sMessageListener;
    private static AbstractC30012b sNativeInitListener;
    private static List<AbstractC30013c> sSlamDetectListeners = new ArrayList();
    public C29974a mAVCEncoder;
    private AbstractC29982b mAVCEncoderInterface;
    private Runnable mDuetCompleteRunable;
    private AbstractC29982b mEncoderCaller;
    private AbstractC30011a mFaceDetectListener;
    private C29983a.AbstractC29984a mGetTimestampCallback;
    public long mHandler;
    private boolean mIsDuringScreenshot;
    private boolean mIsRenderReady;
    private List<AbstractC85313aj> mLandmarkDetectListeners = new ArrayList();
    private MessageCenter.Listener mMessageListener;
    private AbstractC30012b mNativeInitListener;
    private C29983a.AbstractC29985b mOpenGLCallback;
    private C29983a.AbstractC29986c mShotScreenCallback;
    private List<AbstractC30013c> mSlamDetectListeners = new ArrayList();
    public C29972b mStyleAudioProxyImpl;
    private C29973c mStyleProxyImpl;
    private AbstractC30014d mTextureTimeListener;
    C30049i.AbstractC30050a onDuetProcessListener;
    C30049i.AbstractC30051b onVideoEOFListener;

    /* renamed from: com.ss.android.medialib.RecordInvoker$EffectAlgorithmCallback */
    public interface EffectAlgorithmCallback {
        static {
            Covode.recordClassIndex(36406);
        }

        void onResult(int[] iArr, long[] jArr, float f);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$FaceResultCallback */
    public interface FaceResultCallback {
        static {
            Covode.recordClassIndex(36407);
        }

        void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnARTextBitmapCallback */
    public interface OnARTextBitmapCallback {
        static {
            Covode.recordClassIndex(36408);
        }

        BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnARTextContentCallback */
    public interface OnARTextContentCallback {
        static {
            Covode.recordClassIndex(36409);
        }

        void onResult(String[] strArr);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnARTextCountCallback */
    public interface OnARTextCountCallback {
        static {
            Covode.recordClassIndex(36410);
        }

        void onResult(int i);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnCherEffectParmaCallback */
    public interface OnCherEffectParmaCallback {
        static {
            Covode.recordClassIndex(36411);
        }

        void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnFrameCallback */
    public interface OnFrameCallback {
        static {
            Covode.recordClassIndex(36412);
        }

        void onFrame(int i, double d);

        void onFrame(ByteBuffer byteBuffer, int i, int i2, int i3, double d);

        void onInit(EGLContext eGLContext, int i, int i2, int i3, long j);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnHandDetectCallback */
    public interface OnHandDetectCallback {
        static {
            Covode.recordClassIndex(36413);
        }

        void onResult(int[] iArr);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnLensResultCallback */
    public interface OnLensResultCallback {
        static {
            Covode.recordClassIndex(36414);
        }

        void onError(int i, int i2, String str);

        void onInfo(int i, int i2, int i3, String str);

        void onSuccess(int i, float f, int i2);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnPictureCallback */
    public interface OnPictureCallback {
        static {
            Covode.recordClassIndex(36415);
        }

        void onResult(int[] iArr, int i, int i2);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnPictureCallbackV2 */
    public interface OnPictureCallbackV2 {
        static {
            Covode.recordClassIndex(36416);
        }

        void onImage(int[] iArr, int i, int i2);

        void onResult(int i, int i2);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnPreviewRadioListener */
    public interface OnPreviewRadioListener {
        static {
            Covode.recordClassIndex(36417);
        }

        void onInfo(int i, int i2);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnRunningErrorCallback */
    public interface OnRunningErrorCallback {
        static {
            Covode.recordClassIndex(36418);
        }

        void onAccurateInfo(int i, double d);

        void onError(int i);

        void onInfo(int i, int i2);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnSceneDetectCallback */
    public interface OnSceneDetectCallback {
        static {
            Covode.recordClassIndex(36419);
        }

        void onResult(SceneDetectInfo sceneDetectInfo);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnSkeletonDetectCallback */
    public interface OnSkeletonDetectCallback {
        static {
            Covode.recordClassIndex(36420);
        }

        void onResult(SkeletonInfo skeletonInfo);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$OnSmartBeautyCallback */
    public interface OnSmartBeautyCallback {
        static {
            Covode.recordClassIndex(36421);
        }

        void onResult(C30017b bVar);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$a */
    public interface AbstractC29971a {
        static {
            Covode.recordClassIndex(36422);
        }

        /* renamed from: a */
        void mo52774a();
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$b */
    public static class C29972b implements AbstractC30055a {

        /* renamed from: a */
        public long f71483a = -1;

        /* renamed from: b */
        long f71484b = -1;

        /* renamed from: c */
        public String f71485c = "";

        /* renamed from: d */
        WeakReference<RecordInvoker> f71486d;

        static {
            Covode.recordClassIndex(36423);
        }
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$c */
    public static class C29973c implements AbstractC30056b {

        /* renamed from: a */
        long f71487a = -1;

        /* renamed from: b */
        WeakReference<RecordInvoker> f71488b;

        static {
            Covode.recordClassIndex(36424);
        }
    }

    private native int nativeAddMetadata(long j, String str, String str2);

    private native int nativeAddPCMData(long j, byte[] bArr, int i, long j2);

    private native int nativeAddPipRenderTargetSurface(long j, Surface surface, int i, int i2, Bitmap bitmap, boolean z);

    private native int nativeAddTrack(long j, int i, String str, long j2, long j3);

    private native int nativeAnimateImagesToPreview(long j, String[] strArr, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2);

    private native int nativeBindEffectAudioProcessor(long j, int i, int i2, boolean z);

    private native void nativeCancelAll(long j);

    private native int nativeChangeDuetVideo(long j, String str, String str2);

    private native int nativeChangeMusicPath(long j, String str);

    private native void nativeChangeOutputVideoSize(long j, int i, int i2);

    private native void nativeChangePreviewRadioMode(long j, int i);

    private native int nativeChangeSurface(long j, Surface surface);

    private native int[] nativeCheckComposerNodeExclusion(long j, String str, String str2, String str3);

    private native void nativeChooseAreaFromRatio34(long j, float f);

    private native void nativeChooseSlamFace(long j, int i);

    private native int nativeClearFragFile(long j);

    private native int nativeCloseWavFile(long j, boolean z);

    private native int nativeConcat(long j, String str, String str2, int i, String str3, String str4, boolean z, int i2);

    private native long nativeConfigStyleResourceFinder(long j, AssetManager assetManager);

    private native long nativeCreate();

    private native int nativeDeleteLastFrag(long j);

    private native void nativeDisableRender(long j, boolean z);

    private native void nativeEnableAbandonFirstFrame(long j, boolean z);

    private native int nativeEnableAudio(long j, int i);

    private native void nativeEnableAudioAlgorithmParam(long j, boolean z, String str, String str2);

    private native void nativeEnableAudioLoudnessBalanceFilter(long j, boolean z, double d);

    private native int nativeEnableAudioPlayerFromVE(long j, int i);

    private native int nativeEnableAutoTestLog(long j, boolean z);

    private native void nativeEnableBachAlgorithm(long j, boolean z, String str, String str2);

    private native void nativeEnableEffect(long j, boolean z);

    private native void nativeEnableEffectBGM(long j, boolean z);

    private native void nativeEnableFaceBeautifyDetect(long j, int i);

    private native void nativeEnableFaceExtInfo(int i);

    private native void nativeEnableLandMark(long j, boolean z);

    private native void nativeEnableLensProcess(long j, int i, boolean z);

    private native void nativeEnablePBO(boolean z);

    private native void nativeEnablePictureTestMode(long j, boolean z);

    private native void nativeEnablePreloadEffectResource(long j, boolean z);

    private native void nativeEnableRecordBGMToMp4(long j, boolean z);

    private native int nativeEnableRecordFlip(long j, int i);

    private native void nativeEnableRecordingMp4(long j, boolean z);

    private native void nativeEnableScan(long j, boolean z, long j2);

    private native void nativeEnableSceneRecognition(long j, boolean z);

    private native void nativeEnableShotScreenUseOesTexture(long j, boolean z);

    private native void nativeEnableSkeletonDetect(long j, boolean z);

    private native void nativeEnableSmartBeauty(long j, boolean z);

    private native void nativeEnableStickerRecognition(long j, boolean z);

    private native int nativeEnableTimestampCallback(long j, boolean z);

    private native void nativeEnableUse16BitAlign(long j, boolean z);

    private native void nativeEnableWaterMark(long j, boolean z);

    private native int nativeExpandPreviewAndRecordInterval(long j, boolean z);

    private native int nativeFetchDistortionInfo(long j, DistortionInfoCallback distortionInfoCallback);

    private native long nativeGetAudioEndTime(long j);

    private native long nativeGetEndFrameTime(long j);

    private native EnigmaResult nativeGetEnigmaResult(long j);

    private native float nativeGetFilterIntensity(long j, String str);

    private native String[] nativeGetFragVideoPaths(long j);

    private native long nativeGetLastAudioLength(long j);

    private native int nativeGetLastRecordFrameNum(long j);

    private native int nativeGetPreviewRenderRect(long j, int[] iArr);

    private native float nativeGetReactionCamRotation(long j);

    private native int[] nativeGetReactionCameraPosInRecordPixel(long j);

    private native int[] nativeGetReactionCameraPosInViewPixel(long j);

    private native int[] nativeGetReactionPosMarginInViewPixel(long j);

    private native String nativeGetResourceMultiViewTag(long j, String str);

    private native void nativeGetSequencePreviewFrame(long j, int i, int i2, boolean z, int i3, String str);

    private native int nativeGetSlamFaceCount(long j);

    private native int nativeGetSmallWindowSnapshot(long j, int i, int i2, Bitmap bitmap, SmallWindowSnapshotListener smallWindowSnapshotListener);

    private native void nativeHandleEffectAudio(long j, boolean z, long j2);

    private native int nativeHideSlamKeyBoard(long j, boolean z);

    private native int nativeInitAudioConfig(long j, int i, int i2, int i3, int i4, int i5);

    private native int nativeInitAudioPlayer(long j, String str, int i, int i2, long j2, boolean z, boolean z2, int i3);

    private native int nativeInitBeautyPlay(long j, int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z, boolean z2, boolean z3, boolean z4);

    private native int nativeInitBeautyPlayOnlyPreview(long j, ScanSettings scanSettings);

    private native int nativeInitDuet(long j, String str, float f, float f2, float f3, boolean z, boolean z2, int i);

    private native void nativeInitFaceBeautifyDetectExtParam(long j, boolean z, boolean z2, boolean z3);

    private native void nativeInitFaceBeautyDetectExtParam(long j, boolean z);

    private native void nativeInitFaceDetectExtParam(long j, int i, boolean z, boolean z2);

    private native void nativeInitHDRNetDetectExtParam(long j, boolean z, String str);

    private native void nativeInitHandDetectExtParam(long j, int i, int i2, int i3);

    private native int nativeInitImageDrawer(long j, int i);

    private native int nativeInitMediaCodecSurface(long j, Surface surface);

    private native int nativeInitReaction(long j, String str);

    private native int nativeInitWavFile(long j, int i, int i2, double d);

    private native boolean nativeIsQualcomm(long j);

    private native boolean nativeIsSmallWinCameraRender(long j);

    private native boolean nativeIsStickerEnabled(long j);

    private native int nativeMarkPlayDone(long j);

    private native int nativeOnAudioCallback(long j, byte[] bArr, int i);

    private native int nativeOnDrawFrameBuffer(long j, byte[] bArr, int i, int i2, int i3, boolean z);

    private native int nativeOnDrawFrameBuffer2(long j, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3, boolean z);

    private native int nativeOnDrawFrameBuffer3(long j, byte[] bArr, int i, int i2, int i3, int i4, boolean z);

    private native int nativeOnDrawFrameBuffer4(long j, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3, int i4, boolean z);

    private native int nativeOnFrameAvailable(long j, int i, float[] fArr, boolean z);

    private native int nativeOnFrameTime(long j, double d);

    private native int nativePauseEffectAudio(long j, boolean z);

    private native int nativePauseRender(long j);

    private native boolean nativePosInReactionRegion(long j, int i, int i2);

    private native int nativePostDuetAction(long j, int i, long j2);

    private native void nativePreviewVideoBg(long j);

    private native int nativeProcessTouchEvent(long j, float f, float f2);

    private native void nativeRecoverCherEffect(long j, String[] strArr, double[] dArr, boolean[] zArr);

    private native int nativeRegBachAlgorithmCallback(long j, List<Object> list);

    private native void nativeRegisterCherEffectParamCallback(long j, OnCherEffectParmaCallback onCherEffectParmaCallback);

    private native void nativeRegisterEffectAlgorithmCallback(long j, EffectAlgorithmCallback effectAlgorithmCallback);

    private native void nativeRegisterFaceResultCallback(long j, boolean z, FaceResultCallback faceResultCallback);

    private native void nativeRegisterHandDetectCallback(long j, int[] iArr, OnHandDetectCallback onHandDetectCallback);

    private native void nativeRegisterSceneDetectCallback(long j, OnSceneDetectCallback onSceneDetectCallback);

    private native void nativeRegisterSkeletonDetectCallback(long j, OnSkeletonDetectCallback onSkeletonDetectCallback);

    private native void nativeRegisterSmartBeautyCallback(long j, OnSmartBeautyCallback onSmartBeautyCallback);

    private native void nativeReleaseGPUResources(long j);

    private native int nativeRemoveTrack(long j, int i, int i2);

    private native boolean nativeRenderFrameForNightEnhance(long j, int i, int i2, int i3, int i4, String str, String str2, byte[] bArr, byte[] bArr2, boolean z);

    private native int nativeRenderPicture(long j, byte[] bArr, int i, int i2, int i3, OnPictureCallbackV2 onPictureCallbackV2);

    private native int nativeRenderPicture2(long j, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3, int i4, int i5, OnPictureCallbackV2 onPictureCallbackV2, Bitmap bitmap);

    private native int nativeRenderPicture3(long j, Bitmap bitmap, int i, int i2, OnPictureCallbackV2 onPictureCallbackV2);

    private native int nativeRenderPictureToBitmap(long j, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, OnPictureCallbackV2 onPictureCallbackV2, Bitmap bitmap);

    private native void nativeResetPerfStats(long j);

    private native int nativeResetStartTime(long j, long j2, long j3);

    private native float nativeRotateReactionWindow(long j, float f);

    private native int nativeSave(long j);

    private native int[] nativeScaleReactionWindow(long j, float f);

    private native int nativeSeekTrack(long j, int i, int i2, long j2);

    private native void nativeSendEffectMsg(long j, int i, long j2, long j3, String str, boolean z);

    private native void nativeSetARCoreParam(long j, VEARCoreParam vEARCoreParam);

    private native void nativeSetAdaptiveSharpenParams(long j, VEAdaptiveSharpenParams vEAdaptiveSharpenParams, OnLensResultCallback onLensResultCallback);

    private native void nativeSetAlgorithmChangeMsg(long j, int i, boolean z);

    private native int nativeSetBGMVolume(long j, float f, int i);

    private native int nativeSetBeautyFace(long j, int i, String str);

    private native int nativeSetBeautyFaceIntensity(long j, float f, float f2);

    private native int nativeSetBgmMute(long j, boolean z);

    private native void nativeSetCamPreviewSize(long j, int i, int i2);

    private native void nativeSetCameraClose(long j, boolean z);

    private native void nativeSetCameraFirstFrameOptimize(long j, boolean z, int i);

    private native void nativeSetCustomVideoBg(long j, String str, String str2, String str3, int i, int i2, long j2, boolean z, int i3);

    private native void nativeSetCustomVideoBgGif(long j, String str, String str2);

    private native int nativeSetDLEEnable(long j, boolean z);

    private native void nativeSetDebugSettings(long j, VEDebugSettings vEDebugSettings);

    private native void nativeSetDetectInterval(long j, int i);

    private native void nativeSetDetectionMode(long j, boolean z);

    private native int nativeSetDeviceRotationWithStamp(long j, float[] fArr, double d);

    private native int nativeSetDoubleFilterNew(long j, String str, String str2, float f, float f2, float f3);

    private native void nativeSetDuetCameraPaused(long j, boolean z);

    private native void nativeSetEffectAlgorithmRequirement(long j, long j2);

    private native boolean nativeSetEffectAudioManagerCallback(long j, int i, int i2, AudioManagerCallback audioManagerCallback);

    private native void nativeSetEffectBuildChainType(long j, int i);

    private native int nativeSetEnableDuetV2(long j, boolean z);

    private native int nativeSetEnableEffCtrl(long j, boolean z);

    private native void nativeSetEnigmaDetectParams(long j, boolean z, float f, float f2, float f3, float f4, boolean z2, int i, long j2, int i2, boolean z3, boolean z4, boolean z5);

    private native int nativeSetFaceMakeUp(long j, String str, float f, float f2);

    private native int nativeSetFaceMakeUp2(long j, String str);

    private native int nativeSetFilter(long j, String str, String str2, float f);

    private native int nativeSetFilterIntensity(long j, float f);

    private native int nativeSetFilterNew(long j, String str, float f);

    private native void nativeSetForceAlgorithmEnableCount(long j, int i);

    private native int nativeSetFrameCallback(long j, OnFrameCallback onFrameCallback, boolean z, int i);

    private native int nativeSetHandDetectLowpower(long j, boolean z);

    private native int nativeSetHardEncoderStatus(long j, boolean z);

    private native int nativeSetInitHardEncodeRet(long j, int i);

    private native int nativeSetIntensityByType(long j, int i, float f);

    private native int nativeSetKaraoke(long j, boolean z, boolean z2);

    private native void nativeSetLandMarkInfo(long j, LandMarkFrame landMarkFrame);

    private native void nativeSetLumaDetectParams(long j, VELumaDetectParams vELumaDetectParams, OnLensResultCallback onLensResultCallback);

    private native void nativeSetMemoryOpt(long j, boolean z);

    private native void nativeSetModeChangeState(long j, int i);

    private native int nativeSetMusicNodes(long j, String str);

    private native int nativeSetMusicTime(long j, long j2, long j3, long j4);

    private native void nativeSetNativeLibraryDir(String str);

    private native void nativeSetPaddingBottomInRatio34(long j, float f);

    private native int nativeSetPlayLength(long j, long j2);

    private native void nativeSetPreviewSizeRatio(long j, float f, int i, int i2);

    private native void nativeSetReactionBorderParam(long j, int i, int i2);

    private native boolean nativeSetReactionMaskImage(long j, String str, boolean z);

    private native void nativeSetReactionPosMargin(long j, int i, int i2, int i3, int i4);

    private native int nativeSetRecordMode(long j, int i);

    private native int nativeSetRecordPrepareTime(long j, long j2);

    private native void nativeSetRenderCacheString(long j, String str, String str2);

    private native void nativeSetRenderCacheTexture(long j, String str, String str2);

    private native int nativeSetReshape(long j, String str, float f, float f2);

    private native int nativeSetReshapeResource(long j, String str);

    private native int nativeSetRunningErrorCallback(long j, OnRunningErrorCallback onRunningErrorCallback);

    private native int nativeSetSafeArea(long j, int i, VESafeAreaParams[] vESafeAreaParamsArr, int i2);

    private native void nativeSetScale(long j, float f);

    private native boolean nativeSetSharedTextureStatus(boolean z);

    private native int nativeSetSkinTone(long j, String str);

    private native int nativeSetSlamFace(long j, Bitmap bitmap);

    private native int nativeSetSlamInputText(long j, String str, int i, int i2, String str2);

    private native int nativeSetSticker(long j, Bitmap bitmap, int i, int i2);

    private native int nativeSetStickerPathWithTag(long j, int i, String str, int i2, int i3, String str2, String[] strArr, float[] fArr, boolean z, boolean z2);

    private native int nativeSetSwapDuetRegion(long j, boolean z);

    private native int nativeSetSwapReactionRegion(long j, boolean z);

    private native void nativeSetTaintSceneDetectParams(long j, VETaintSceneDetectParams vETaintSceneDetectParams, OnLensResultCallback onLensResultCallback);

    private native void nativeSetUseMultiPreviewRatio(long j, boolean z);

    private native int nativeSetUseMusic(long j, int i);

    private native void nativeSetVideoBgSpeed(long j, double d);

    private native void nativeSetVideoEncodeRotation(long j, int i);

    private native int nativeSetVideoQuality(long j, int i, int i2);

    private native void nativeSetWaterMark(long j, String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    private native void nativeSetWaterMark2(long j, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    private native int nativeShotHDScreen(long j, String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, boolean z2, OnPictureCallback onPictureCallback2, Bitmap bitmap, boolean z3);

    private native int nativeShotScreen(long j, String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, boolean z2);

    private native int nativeSlamDeviceConfig(long j, boolean z, boolean z2, boolean z3, boolean z4);

    private native int nativeSlamGetTextBitmap(long j, OnARTextBitmapCallback onARTextBitmapCallback);

    private native int nativeSlamGetTextLimitCount(long j, OnARTextCountCallback onARTextCountCallback);

    private native int nativeSlamGetTextParagraphContent(long j, OnARTextContentCallback onARTextContentCallback);

    private native int nativeSlamProcessDoubleClickEvent(long j, float f, float f2);

    private native int nativeSlamProcessIngestAcc(long j, double d, double d2, double d3, double d4);

    private native int nativeSlamProcessIngestGra(long j, double d, double d2, double d3, double d4);

    private native int nativeSlamProcessIngestGyr(long j, double d, double d2, double d3, double d4);

    private native int nativeSlamProcessIngestOri(long j, double[] dArr, double d);

    private native int nativeSlamProcessPanEvent(long j, float f, float f2, float f3, float f4, float f5);

    private native int nativeSlamProcessRotationEvent(long j, float f, float f2);

    private native int nativeSlamProcessScaleEvent(long j, float f, float f2);

    private native int nativeSlamProcessTouchEvent(long j, float f, float f2);

    private native int nativeSlamProcessTouchEventByType(long j, int i, float f, float f2, int i2);

    private native int nativeSlamSetLanguge(long j, String str);

    private native int nativeStartPlay(long j, Surface surface, int i, int i2, String str);

    private native int nativeStartPlay2(long j, int i, int i2, int i3, int i4, String str);

    private native int nativeStartPrePlay(long j, boolean z, int i, boolean z2);

    private native int nativeStartRecord(long j, double d, boolean z, int i, int i2, int i3, String str, String str2, boolean z2);

    private native int nativeStartRender(long j);

    private native int nativeStopPlay(long j);

    private native int nativeStopPrePlay(long j);

    private native int nativeStopRecord(long j, boolean z);

    private native int nativeSwapMainAndPipRenderTarget(long j, boolean z);

    private native int nativeSwitchEffectInGLTask(long j, boolean z);

    private native int nativeTryRestore(long j, int i, String str);

    private native void nativeUnRegisterEffectAlgorithmCallback(long j);

    private native void nativeUnRegisterFaceResultCallback(long j);

    private native int nativeUninitAudioPlayer(long j);

    private native int nativeUninitBeautyPlay(long j);

    private native int nativeUnregBachAlgorithmCallback(long j);

    private native void nativeUpdateAlgorithmRuntimeParam(long j, int i, float f);

    private native void nativeUpdateReactionBGAlpha(long j, float f);

    private native int[] nativeUpdateReactionCameraPos(long j, int i, int i2, int i3, int i4);

    private native int[] nativeUpdateReactionCameraPosWithRotation(long j, int i, int i2, int i3, int i4, float f);

    private native void nativeUpdateRotation(long j, float f, float f2, float f3);

    private native void nativeUpdateRotationAndFront(long j, int i, boolean z, boolean z2);

    private native void nativeUseLargeMattingModel(long j, boolean z);

    private native int natvieEnableGetPropTrack(long j, boolean z);

    private native int natvieSetExternalFaceMakeupOpacity(long j, String str, float f, float f2);

    private native void setCaptureMirror(long j, boolean z);

    private native void setCaptureMirror2(long j, int i);

    private native void setCaptureResize(long j, boolean z, int[] iArr, int[] iArr2);

    private native void setImageExposure(long j, float f);

    public native long flushData(long j, long j2);

    public native long nativeAllocateStyleEngine(long j, int i, int i2, int i3, StyleActionListener styleActionListener);

    public native long nativeAllocateStyleManager(long j, long j2, StyleActionListener styleActionListener);

    public native int nativeAnimateImageToPreview(long j, String str, String str2, int i);

    public native int nativeAppendComposerNodes(long j, String[] strArr, int i);

    public native void nativeAttachExtFrameData(long j, Object obj);

    public native void nativeClearDisplayColor(long j, float f, float f2, float f3, float f4);

    public native int nativeDrawStyleToBitmap(long j, long j2, long j3, Bitmap bitmap, StyleActionListener styleActionListener);

    public native void nativeEnable3buffer(long j, boolean z);

    public native void nativeEnableClearColorAfterRender(long j, boolean z);

    public native int nativeEnableDuetGlFinish(long j, boolean z);

    public native void nativeEnableEffectRT(long j, boolean z);

    public native void nativeEnableMakeUpBackground(long j, boolean z);

    public native int nativeEnableRecordMaxDuration(long j, boolean z);

    public native void nativeForceFirstFrameHasEffect(long j, boolean z);

    public native float[] nativeGetAECSuggestVolume(long j);

    public native String nativeGetComposerNodePaths(long j);

    public native float nativeGetComposerNodeValue(long j, String str, String str2);

    public native long nativeGetEffectHandler(long j);

    public native String nativeGetEvents(long j, long j2);

    public native String nativeGetFeatureParam(long j, long j2, long j3, int i, boolean z);

    public native float nativeGetFeatureRotation(long j, long j2, long j3, int i);

    public native long[] nativeGetFeatures(long j, long j2);

    public native ImageFrame nativeGetFrameByKey(long j, String str);

    public native VEMapBufferInfo nativeGetMapBuffer(long j);

    public native String nativeGetStickerVersion(long j, long j2);

    public native String nativeGetStyleRenderRect(long j, long j2);

    public native boolean nativeIsGestureRegistered(long j, int i);

    public native void nativeOnSwapGlBuffers(long j);

    public native long nativeOperateFeature(long j, long j2, long j3, int i, String str, boolean z, boolean z2, StyleActionListener styleActionListener);

    public native String[] nativeOperateFeatureGroup(long j, long j2, long[] jArr, int[] iArr, String[] strArr, boolean z, boolean z2);

    public native void nativeOperateStyleAudio(long j, long j2, int i);

    public native long nativeOperateStyleManager(long j, long j2, int i, long j3, String str, String str2, String str3, boolean z, StyleActionListener styleActionListener);

    public native boolean nativePreviewDuetVideo(long j);

    public native boolean nativeProcessTouchEvent2(long j, int i, float f, float f2, float f3, float f4, int i2, int i3);

    public native int nativeRefreshEvent(long j, long j2);

    public native long nativeReleaseStyleEngine(long j, long j2, boolean z, StyleActionListener styleActionListener);

    public native long nativeReleaseStyleManager(long j, long j2, boolean z, StyleActionListener styleActionListener);

    public native int nativeReloadComposerNodes(long j, String[] strArr, int i);

    public native int nativeRemoveComposerNodes(long j, String[] strArr, int i);

    public native int nativeReplaceComposerNodes(long j, String[] strArr, int i, String[] strArr2, int i2);

    public native void nativeRestoreStyleContext(long j, long j2, String str);

    public native int nativeSetAlgorithmPreConfig(long j, int i, int i2);

    public native int nativeSetAudioDataInterface(long j, long j2);

    public native void nativeSetCaptureRenderWidth(long j, int i, int i2);

    public native void nativeSetClientState(long j, int i);

    public native int nativeSetCodecConfig(long j, ByteBuffer byteBuffer, int i);

    public native int nativeSetCodecType(long j, int i);

    public native int nativeSetColorFormat(long j, int i);

    public native int nativeSetComposerMode(long j, int i, int i2);

    public native int nativeSetComposerNodes(long j, String[] strArr, int i);

    public native int nativeSetComposerResourcePath(long j, String str);

    public native int nativeSetDisplaySettings(long j, int i, long j2, float f, int i2, int i3, int i4, int i5, float f2, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, int i12);

    public native void nativeSetDropFrames(long j, int i);

    public native int nativeSetEffectMaxMemoryCache(long j, int i);

    public native int nativeSetEnableAEC(long j, boolean z, String str);

    public native int nativeSetEnableEarBack(long j, boolean z);

    public native int nativeSetEventEnable(long j, long j2, boolean z);

    public native long nativeSetEvents(long j, long j2, String str);

    public native void nativeSetForceAlgorithmCnt(long j, int i);

    public native int nativeSetLoudness(long j, boolean z, int i);

    public native int nativeSetMaleMakeupState(long j, boolean z);

    public native void nativeSetPreviewDuetVideoPaused(long j, boolean z);

    public native int nativeSetPreviewRadioListener(long j, OnPreviewRadioListener onPreviewRadioListener);

    public native void nativeSetRecordContentType(long j, boolean z);

    public native int nativeSetRecordMaxDuration(long j, long j2);

    public native int nativeSetStickerRequestCallback(long j, IStickerRequestCallback iStickerRequestCallback);

    public native int nativeSetStylePictureOffset(long j, long j2, float f, float f2, float f3, float f4);

    public native int nativeSetVEEffectParams(long j, VEEffectParams vEEffectParams);

    public native void nativeStyleEnableAudioEncode(long j, long j2, boolean z);

    public native void nativeStyleEnableBGM(long j, long j2, boolean z);

    public native long nativeStyleMusicSeek(long j, long j2, long j3);

    public native long nativeStyleRenderEnable(long j, long j2, boolean z);

    public native void nativeStyleSetMute(long j, long j2, boolean z, int i);

    public native void nativeStyleSetVolume(long j, long j2, double d, int i);

    public native boolean nativeSuspendGestureRecognizer(long j, int i, boolean z);

    public native int nativeTurnToOffScreenRender(long j);

    public native int nativeUpdateComposerNode(long j, String str, String str2, float f);

    public native long nativeUpdateEvents(long j, long j2, String str);

    public native int nativeUpdateMultiComposerNodes(long j, int i, String[] strArr, String[] strArr2, float[] fArr);

    public native int nativeWriteFile(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    public native int nativeWriteFile2(long j, ByteBuffer byteBuffer, int i, long j2, long j3, int i2, boolean z);

    public void onDestroy() {
    }

    public void onNativeDuetProcess(long j, boolean z) {
    }

    public native long registerStylePathsConverter(long j, long j2, StylePathConvertCallback stylePathConvertCallback);

    public static AbstractC30012b getNativeInitListener() {
        return sNativeInitListener;
    }

    private boolean isRenderReady() {
        return this.mIsRenderReady;
    }

    public void destroyMessageCenter() {
        MessageCenter.removeListener(this);
    }

    public long getHandler() {
        return this.mHandler;
    }

    public AbstractC30055a getStyleAudioProxy() {
        return this.mStyleAudioProxyImpl;
    }

    public AbstractC30056b getStyleProxy() {
        return this.mStyleProxyImpl;
    }

    public void initMessageCenter() {
        MessageCenter.addListener(this);
    }

    public void onNativeRecordStop() {
        AbstractC29971a aVar = mRecordStopCallback;
        if (aVar != null) {
            aVar.mo52774a();
        }
    }

    public void onNativeVideoBgEOF() {
        C30049i.AbstractC30051b bVar = this.onVideoEOFListener;
        if (bVar != null) {
            bVar.mo53182a();
        }
    }

    public void releaseEncoder() {
        C29974a aVar = this.mAVCEncoder;
        if (aVar != null) {
            aVar.mo52781d();
        }
    }

    public void initHardEncoderInAdvance() {
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new C29974a();
        }
    }

    public void onDuetVideoComplete() {
        Runnable runnable = this.mDuetCompleteRunable;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = sDuetCompleteRunable;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public String onNativeCall_GenerateUUID() {
        return UUID.randomUUID().toString();
    }

    public void onNativeCallback_onOpenGLCreate() {
        C85315al.m146637a("RecordInvoker", "onNativeCallback_onOpenGLCreate");
        C29983a.AbstractC29985b bVar = this.mOpenGLCallback;
        if (bVar != null) {
            bVar.mo52797a();
        }
    }

    public void onNativeCallback_onOpenGLDestroy() {
        C85315al.m146637a("RecordInvoker", "onNativeCallback_onOpenGLDestroy");
        C29983a.AbstractC29985b bVar = this.mOpenGLCallback;
        if (bVar != null) {
            bVar.mo52798b();
        }
    }

    public void onPause() {
        C85315al.m146639b("RecordInvoker", "reset screenshot flag for next capture");
        this.mIsDuringScreenshot = false;
    }

    static {
        Covode.recordClassIndex(36403);
        C30731d.m63118c();
    }

    public RecordInvoker() {
        C299691 r0 = new AbstractC29982b() {
            /* class com.p2082ss.android.medialib.RecordInvoker.C299691 */

            static {
                Covode.recordClassIndex(36404);
            }

            @Override // com.p2082ss.android.medialib.AbstractC29982b
            public final int getProfile() {
                return RecordInvoker.this.mAVCEncoder.f71498i;
            }

            @Override // com.p2082ss.android.medialib.AbstractC29982b
            public final void onSwapGlBuffers() {
                MethodCollector.m26663i(144);
                if (RecordInvoker.this.mHandler == 0) {
                    MethodCollector.m26664o(144);
                    return;
                }
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.nativeOnSwapGlBuffers(recordInvoker.mHandler);
                MethodCollector.m26664o(144);
            }

            @Override // com.p2082ss.android.medialib.AbstractC29982b
            public final void onUninitHardEncoder() {
                C85315al.m146637a("RecordInvoker", "FaceBeautyManager onUninitHardEncoder == enter");
                if (RecordInvoker.this.mAVCEncoder != null) {
                    RecordInvoker.this.mAVCEncoder.mo52780c();
                    RecordInvoker.this.mAVCEncoder = null;
                    C85315al.m146637a("RecordInvoker", "====== uninitAVCEncoder ======");
                }
                C85315al.m146637a("RecordInvoker", "FaceBeautyManager onUninitHardEncoder == exit");
            }

            @Override // com.p2082ss.android.medialib.AbstractC29982b
            public final void setColorFormat(int i) {
                MethodCollector.m26663i(103);
                if (RecordInvoker.this.mHandler == 0) {
                    MethodCollector.m26664o(103);
                    return;
                }
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.nativeSetColorFormat(recordInvoker.mHandler, i);
                MethodCollector.m26664o(103);
            }

            @Override // com.p2082ss.android.medialib.AbstractC29982b
            public final void onSetCodecConfig(ByteBuffer byteBuffer) {
                MethodCollector.m26663i(150);
                C85315al.m146639b("RecordInvoker", "onSetCodecConfig: data size = " + byteBuffer.remaining());
                if (RecordInvoker.this.mHandler == 0) {
                    MethodCollector.m26664o(150);
                    return;
                }
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.nativeSetCodecConfig(recordInvoker.mHandler, byteBuffer, byteBuffer.remaining());
                MethodCollector.m26664o(150);
            }

            @Override // com.p2082ss.android.medialib.AbstractC29982b
            public final void onEncoderData(byte[] bArr, int i, boolean z) {
                C85315al.m146639b("RecordInvoker", "FaceBeautyManager onEncoderData == enter");
                if (RecordInvoker.this.mAVCEncoder != null) {
                    RecordInvoker.this.mAVCEncoder.mo52776a(bArr, i, z);
                }
                C85315al.m146639b("RecordInvoker", "FaceBeautyManager onEncoderData == exit");
            }

            @Override // com.p2082ss.android.medialib.AbstractC29982b
            public final int onEncoderData(int i, int i2, int i3, boolean z) {
                C85315al.m146639b("RecordInvoker", "onEncoderData: ...");
                if (RecordInvoker.this.mAVCEncoder != null) {
                    return RecordInvoker.this.mAVCEncoder.mo52775a(i, i2, i3, z);
                }
                return 0;
            }

            @Override // com.p2082ss.android.medialib.AbstractC29982b
            public final void onWriteFile(ByteBuffer byteBuffer, int i, int i2, int i3) {
                MethodCollector.m26663i(131);
                if (RecordInvoker.this.mHandler == 0) {
                    MethodCollector.m26664o(131);
                    return;
                }
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.nativeWriteFile(recordInvoker.mHandler, byteBuffer, byteBuffer.remaining(), i, i3);
                MethodCollector.m26664o(131);
            }

            @Override // com.p2082ss.android.medialib.AbstractC29982b
            public final void onWriteFile(ByteBuffer byteBuffer, long j, long j2, int i, boolean z) {
                MethodCollector.m26663i(140);
                if (RecordInvoker.this.mHandler == 0) {
                    MethodCollector.m26664o(140);
                    return;
                }
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.nativeWriteFile2(recordInvoker.mHandler, byteBuffer, byteBuffer.remaining(), j, j2, i, z);
                MethodCollector.m26664o(140);
            }

            @Override // com.p2082ss.android.medialib.AbstractC29982b
            public final Surface onInitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
                C85315al.m146637a("RecordInvoker", "FaceBeautyManager onInitHardEncoder == enter");
                C85315al.m146637a("RecordInvoker", "width = " + i + "\theight = " + i2 + "\tcodecType = " + i7);
                if (RecordInvoker.this.mAVCEncoder == null) {
                    RecordInvoker.this.mAVCEncoder = new C29974a();
                }
                RecordInvoker.this.mAVCEncoder.mo52778a(i7);
                C29974a.f71489a = this;
                Surface a = RecordInvoker.this.mAVCEncoder.mo52777a(i, i2, i3, i4, i5, i6, z);
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.setInitHardEncodeRet(recordInvoker.mAVCEncoder.f71500k);
                if (a == null) {
                    if (i7 == C29974a.EnumC29976a.ByteVC1.ordinal()) {
                        RecordInvoker.this.mAVCEncoder.mo52780c();
                        RecordInvoker.this.mAVCEncoder.mo52778a(C29974a.EnumC29976a.H264.ordinal());
                        a = RecordInvoker.this.mAVCEncoder.mo52777a(i, i2, i3, i4, i5, i6, z);
                        if (a != null) {
                            RecordInvoker.this.setCodecType(C29974a.EnumC29976a.H264.ordinal());
                            RecordInvoker.this.setHardEncoderStatus(true);
                        }
                    }
                    RecordInvoker.this.mAVCEncoder.mo52780c();
                    RecordInvoker.this.mAVCEncoder = null;
                    RecordInvoker.this.setHardEncoderStatus(false);
                    return null;
                }
                C85315al.m146642d("RecordInvoker", "====== initAVCEncoder succeed ======");
                RecordInvoker.this.setHardEncoderStatus(true);
                C85315al.m146637a("RecordInvoker", "FaceBeautyManager onInitHardEncoder == exit");
                return a;
            }
        };
        this.mAVCEncoderInterface = r0;
        this.mEncoderCaller = r0;
    }

    public static synchronized void clearSlamDetectListener() {
        synchronized (RecordInvoker.class) {
            MethodCollector.m26663i(2172);
            sSlamDetectListeners.clear();
            MethodCollector.m26664o(2172);
        }
    }

    private int onNativeCallback_GetHardEncoderProfile() {
        if (this.mEncoderCaller == null) {
            return -1;
        }
        C85315al.m146637a("RecordInvoker", "GetHardEncoderProfile");
        return this.mEncoderCaller.getProfile();
    }

    public void cancelAll() {
        MethodCollector.m26663i(1537);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1537);
            return;
        }
        nativeCancelAll(j);
        MethodCollector.m26664o(1537);
    }

    public int clearFragFile() {
        MethodCollector.m26663i(1319);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1319);
            return -100000;
        }
        int nativeClearFragFile = nativeClearFragFile(j);
        MethodCollector.m26664o(1319);
        return nativeClearFragFile;
    }

    public synchronized void clearLandMarkDetectListener() {
        MethodCollector.m26663i(2170);
        this.mLandmarkDetectListeners.clear();
        MethodCollector.m26664o(2170);
    }

    public synchronized void clearSlamDetectListener2() {
        MethodCollector.m26663i(2181);
        this.mSlamDetectListeners.clear();
        MethodCollector.m26664o(2181);
    }

    public void createEncoder() {
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new C29974a();
        }
        this.mAVCEncoder.mo52779b();
    }

    public int deleteLastFrag() {
        MethodCollector.m26663i(1315);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1315);
            return -100000;
        }
        int nativeDeleteLastFrag = nativeDeleteLastFrag(j);
        MethodCollector.m26664o(1315);
        return nativeDeleteLastFrag;
    }

    public long getAudioEndTime() {
        MethodCollector.m26663i(654);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(654);
            return -100000;
        }
        long nativeGetAudioEndTime = nativeGetAudioEndTime(j);
        MethodCollector.m26664o(654);
        return nativeGetAudioEndTime;
    }

    public long getEndFrameTime() {
        MethodCollector.m26663i(1152);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1152);
            return -100000;
        }
        long nativeGetEndFrameTime = nativeGetEndFrameTime(j);
        MethodCollector.m26664o(1152);
        return nativeGetEndFrameTime;
    }

    public long getLastAudioLength() {
        MethodCollector.m26663i(1154);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1154);
            return -100000;
        }
        long nativeGetLastAudioLength = nativeGetLastAudioLength(j);
        MethodCollector.m26664o(1154);
        return nativeGetLastAudioLength;
    }

    public int getLastRecordFrameNum() {
        MethodCollector.m26663i(1159);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1159);
            return -100000;
        }
        int nativeGetLastRecordFrameNum = nativeGetLastRecordFrameNum(j);
        MethodCollector.m26664o(1159);
        return nativeGetLastRecordFrameNum;
    }

    public int[] getPreviewRenderRect() {
        MethodCollector.m26663i(1316);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1316);
            return null;
        }
        int[] iArr = new int[4];
        int nativeGetPreviewRenderRect = nativeGetPreviewRenderRect(j, iArr);
        MethodCollector.m26664o(1316);
        if (nativeGetPreviewRenderRect == 0) {
            return iArr;
        }
        return null;
    }

    public float getReactionCamRotation() {
        MethodCollector.m26663i(2739);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2739);
            return -100000.0f;
        }
        float nativeGetReactionCamRotation = nativeGetReactionCamRotation(j);
        MethodCollector.m26664o(2739);
        return nativeGetReactionCamRotation;
    }

    public int[] getReactionCameraPosInRecordPixel() {
        MethodCollector.m26663i(2813);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2813);
            return null;
        }
        int[] nativeGetReactionCameraPosInRecordPixel = nativeGetReactionCameraPosInRecordPixel(j);
        MethodCollector.m26664o(2813);
        return nativeGetReactionCameraPosInRecordPixel;
    }

    public int[] getReactionCameraPosInViewPixel() {
        MethodCollector.m26663i(2742);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2742);
            return null;
        }
        int[] nativeGetReactionCameraPosInViewPixel = nativeGetReactionCameraPosInViewPixel(j);
        MethodCollector.m26664o(2742);
        return nativeGetReactionCameraPosInViewPixel;
    }

    public int[] getReactionPosMarginInViewPixel() {
        MethodCollector.m26663i(2814);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2814);
            return null;
        }
        int[] nativeGetReactionPosMarginInViewPixel = nativeGetReactionPosMarginInViewPixel(j);
        MethodCollector.m26664o(2814);
        return nativeGetReactionPosMarginInViewPixel;
    }

    public String[] getRecordedVideoPaths() {
        MethodCollector.m26663i(80);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(80);
            return null;
        }
        String[] nativeGetFragVideoPaths = nativeGetFragVideoPaths(j);
        MethodCollector.m26664o(80);
        return nativeGetFragVideoPaths;
    }

    public boolean isSmallWinCameraRender() {
        MethodCollector.m26663i(1328);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1328);
            return false;
        }
        boolean nativeIsSmallWinCameraRender = nativeIsSmallWinCameraRender(j);
        MethodCollector.m26664o(1328);
        return nativeIsSmallWinCameraRender;
    }

    public int markPlayDone() {
        MethodCollector.m26663i(615);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(615);
            return -100000;
        }
        int nativeMarkPlayDone = nativeMarkPlayDone(j);
        MethodCollector.m26664o(615);
        return nativeMarkPlayDone;
    }

    public void onNativeCallback_UninitHardEncoder() {
        C85315al.m146637a("RecordInvoker", " onUninitHardEncoder == enter");
        AbstractC29982b bVar = this.mEncoderCaller;
        if (bVar != null) {
            bVar.onUninitHardEncoder();
        }
        C85315al.m146637a("RecordInvoker", " onUninitHardEncoder == exit");
    }

    public int onNativeCallback_onOpenGLRunning() {
        C85315al.m146639b("RecordInvoker", "onNativeCallback_onOpenGLRunning");
        C29983a.AbstractC29985b bVar = this.mOpenGLCallback;
        if (bVar != null) {
            return bVar.mo52799c();
        }
        return 0;
    }

    public boolean previewDuetVideo() {
        MethodCollector.m26663i(2567);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2567);
            return false;
        }
        boolean nativePreviewDuetVideo = nativePreviewDuetVideo(j);
        MethodCollector.m26664o(2567);
        return nativePreviewDuetVideo;
    }

    public void previewVideoBg() {
        MethodCollector.m26663i(2888);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2888);
            return;
        }
        nativePreviewVideoBg(j);
        MethodCollector.m26664o(2888);
    }

    public void releaseGPUResources() {
        MethodCollector.m26663i(610);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(610);
            return;
        }
        nativeReleaseGPUResources(j);
        MethodCollector.m26664o(610);
    }

    public void resetPerfStats() {
        MethodCollector.m26663i(1405);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1405);
            return;
        }
        nativeResetPerfStats(j);
        MethodCollector.m26664o(1405);
    }

    public int save() {
        MethodCollector.m26663i(609);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(609);
            return -100000;
        }
        int nativeSave = nativeSave(j);
        MethodCollector.m26664o(609);
        return nativeSave;
    }

    public int stopPrePlay() {
        MethodCollector.m26663i(608);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(608);
            return -100000;
        }
        int nativeStopPrePlay = nativeStopPrePlay(j);
        MethodCollector.m26664o(608);
        return nativeStopPrePlay;
    }

    public void unRegisterEffectAlgorithmCallback() {
        MethodCollector.m26663i(1248);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1248);
            return;
        }
        nativeUnRegisterEffectAlgorithmCallback(j);
        MethodCollector.m26664o(1248);
    }

    public void unRegisterFaceResultCallback() {
        MethodCollector.m26663i(1173);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1173);
            return;
        }
        nativeUnRegisterFaceResultCallback(j);
        MethodCollector.m26664o(1173);
    }

    public void uninitAudioPlayer() {
        MethodCollector.m26663i(1410);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1410);
            return;
        }
        nativeUninitAudioPlayer(j);
        MethodCollector.m26664o(1410);
    }

    public void unregBachAlgorithmCallback() {
        MethodCollector.m26663i(2980);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2980);
            return;
        }
        nativeUnregBachAlgorithmCallback(j);
        MethodCollector.m26664o(2980);
    }

    private int getOptFirstFrameBypassEffectFrameCnt() {
        int intValue;
        C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_opt_first_frame_bypass_effect_frame_cnt");
        if (a == null || a.f191742b == null || !(a.f191742b instanceof Integer) || (intValue = ((Integer) a.f191742b).intValue()) <= 0 || intValue >= 100) {
            return 3;
        }
        return intValue;
    }

    public float[] getAECSuggestVolume() {
        MethodCollector.m26663i(2122);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            float[] fArr = {0.0f, 0.0f};
            MethodCollector.m26664o(2122);
            return fArr;
        }
        float[] nativeGetAECSuggestVolume = nativeGetAECSuggestVolume(j);
        if (nativeGetAECSuggestVolume == null) {
            nativeGetAECSuggestVolume = new float[]{0.0f, 0.0f};
        }
        MethodCollector.m26664o(2122);
        return nativeGetAECSuggestVolume;
    }

    public String getComposerNodePaths() {
        MethodCollector.m26663i(1921);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1921);
            return "";
        }
        String nativeGetComposerNodePaths = nativeGetComposerNodePaths(j);
        MethodCollector.m26664o(1921);
        return nativeGetComposerNodePaths;
    }

    public long getEffectHandler() {
        MethodCollector.m26663i(2360);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2360);
            return -100000;
        }
        long nativeGetEffectHandler = nativeGetEffectHandler(j);
        MethodCollector.m26664o(2360);
        return nativeGetEffectHandler;
    }

    public EnigmaResult getEnigmaResult() {
        MethodCollector.m26663i(1424);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1424);
            return null;
        }
        EnigmaResult nativeGetEnigmaResult = nativeGetEnigmaResult(j);
        MethodCollector.m26664o(1424);
        return nativeGetEnigmaResult;
    }

    public VEMapBufferInfo getMapBuffer() {
        MethodCollector.m26663i(2381);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2381);
            return null;
        }
        VEMapBufferInfo nativeGetMapBuffer = nativeGetMapBuffer(j);
        MethodCollector.m26664o(2381);
        return nativeGetMapBuffer;
    }

    public int getSlamFaceCount() {
        MethodCollector.m26663i(1144);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1144);
            return -100000;
        }
        int nativeGetSlamFaceCount = nativeGetSlamFaceCount(j);
        MethodCollector.m26664o(1144);
        return nativeGetSlamFaceCount;
    }

    public boolean isStickerEnabled() {
        MethodCollector.m26663i(1164);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1164);
            return false;
        }
        boolean nativeIsStickerEnabled = nativeIsStickerEnabled(j);
        MethodCollector.m26664o(1164);
        return nativeIsStickerEnabled;
    }

    public int pauseRender() {
        MethodCollector.m26663i(2576);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2576);
            return -100000;
        }
        int nativePauseRender = nativePauseRender(j);
        MethodCollector.m26664o(2576);
        return nativePauseRender;
    }

    public int startRender() {
        MethodCollector.m26663i(2579);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2579);
            return -100000;
        }
        int nativeStartRender = nativeStartRender(j);
        MethodCollector.m26664o(2579);
        return nativeStartRender;
    }

    public int stopPlay() {
        MethodCollector.m26663i(613);
        this.mIsRenderReady = false;
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "exit stopPlay due to INVALID_HANDLE.");
            MethodCollector.m26664o(613);
            return -100000;
        }
        destroyMessageCenter();
        int nativeStopPlay = nativeStopPlay(this.mHandler);
        MethodCollector.m26664o(613);
        return nativeStopPlay;
    }

    public int turnToOffScreenRender() {
        MethodCollector.m26663i(2380);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2380);
            return -100000;
        }
        int nativeTurnToOffScreenRender = nativeTurnToOffScreenRender(j);
        MethodCollector.m26664o(2380);
        return nativeTurnToOffScreenRender;
    }

    public int uninitBeautyPlay() {
        int nativeUninitBeautyPlay;
        MethodCollector.m26663i(617);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(617);
            return -100000;
        }
        C85315al.m146637a("RecordInvoker", "uninitBeautyPlay...");
        synchronized (this) {
            try {
                long j = this.mHandler;
                this.mHandler = 0;
                this.mTextureTimeListener = null;
                this.mShotScreenCallback = null;
                mRecordStopCallback = null;
                this.mNativeInitListener = null;
                this.mFaceDetectListener = null;
                this.mMessageListener = null;
                sMessageListener = null;
                this.mGetTimestampCallback = null;
                nativeUninitBeautyPlay = nativeUninitBeautyPlay(j);
            } finally {
                MethodCollector.m26664o(617);
            }
        }
        return nativeUninitBeautyPlay;
    }

    public static void setDuetVideoCompleteCallback(Runnable runnable) {
        sDuetCompleteRunable = runnable;
    }

    public static void setFaceDetectListener(AbstractC30011a aVar) {
        sFaceDetectListener = aVar;
    }

    public static void setNativeInitListener(AbstractC30012b bVar) {
        sNativeInitListener = bVar;
    }

    public static void setRecordStopCallback(AbstractC29971a aVar) {
        mRecordStopCallback = aVar;
    }

    public void setDuetVideoCompleteCallback2(Runnable runnable) {
        this.mDuetCompleteRunable = runnable;
    }

    public void setFaceDetectListener2(AbstractC30011a aVar) {
        this.mFaceDetectListener = aVar;
    }

    public void setIsDuringScreenshot(boolean z) {
        this.mIsDuringScreenshot = z;
    }

    public void setMessageListenerV2(MessageCenter.Listener listener) {
        this.mMessageListener = listener;
    }

    public void setNativeInitListener2(AbstractC30012b bVar) {
        this.mNativeInitListener = bVar;
    }

    public void setOnDuetProcessListener(C30049i.AbstractC30050a aVar) {
        this.onDuetProcessListener = aVar;
    }

    public void setOnOpenGLCallback(C29983a.AbstractC29985b bVar) {
        this.mOpenGLCallback = bVar;
    }

    public void setTextureTimeListener(AbstractC30014d dVar) {
        this.mTextureTimeListener = dVar;
    }

    public void setVEOnVideoEOFListener(C30049i.AbstractC30051b bVar) {
        this.onVideoEOFListener = bVar;
    }

    public ByteBuffer allocateFrame(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public void enableFaceBeautifyDetect(int i) {
        MethodCollector.m26663i(28);
        nativeEnableFaceBeautifyDetect(this.mHandler, i);
        MethodCollector.m26664o(28);
    }

    public void enableFaceExtInfo(int i) {
        MethodCollector.m26663i(670);
        nativeEnableFaceExtInfo(i);
        MethodCollector.m26664o(670);
    }

    public void enablePreloadEffectRes(boolean z) {
        MethodCollector.m26663i(31);
        nativeEnablePreloadEffectResource(this.mHandler, z);
        MethodCollector.m26664o(31);
    }

    public void enableSceneRecognition(boolean z) {
        MethodCollector.m26663i(19);
        nativeEnableSceneRecognition(this.mHandler, z);
        MethodCollector.m26664o(19);
    }

    public void enableSkeletonDetect(boolean z) {
        MethodCollector.m26663i(21);
        nativeEnableSkeletonDetect(this.mHandler, z);
        MethodCollector.m26664o(21);
    }

    public void enableSmartBeauty(boolean z) {
        MethodCollector.m26663i(24);
        nativeEnableSmartBeauty(this.mHandler, z);
        MethodCollector.m26664o(24);
    }

    public void enableStickerRecognition(boolean z) {
        MethodCollector.m26663i(20);
        nativeEnableStickerRecognition(this.mHandler, z);
        MethodCollector.m26664o(20);
    }

    public long getTextureDeltaTime(boolean z) {
        AbstractC30014d dVar = this.mTextureTimeListener;
        if (dVar != null) {
            return dVar.mo52868a();
        }
        return 0;
    }

    public void setCaptureMirror(int i) {
        MethodCollector.m26663i(2454);
        setCaptureMirror2(this.mHandler, i);
        MethodCollector.m26664o(2454);
    }

    public void setDeviceRotation(float[] fArr) {
        if (isRenderReady()) {
            setDeviceRotation(fArr, -1.0d);
        }
    }

    public void setEffectAlgorithmRequirement(long j) {
        MethodCollector.m26663i(34);
        nativeSetEffectAlgorithmRequirement(this.mHandler, j);
        MethodCollector.m26664o(34);
    }

    public int setEnableEffCtrl(boolean z) {
        MethodCollector.m26663i(2977);
        int nativeSetEnableEffCtrl = nativeSetEnableEffCtrl(this.mHandler, z);
        MethodCollector.m26664o(2977);
        return nativeSetEnableEffCtrl;
    }

    public int setFilterPos(float f) {
        if (this.mHandler == 0) {
            return -100000;
        }
        return 0;
    }

    public void setImageExposure(float f) {
        MethodCollector.m26663i(2498);
        setImageExposure(this.mHandler, f);
        MethodCollector.m26664o(2498);
    }

    public static synchronized void addSlamDetectListener(AbstractC30013c cVar) {
        synchronized (RecordInvoker.class) {
            MethodCollector.m26663i(2154);
            if (cVar != null) {
                sSlamDetectListeners.add(cVar);
            }
            MethodCollector.m26664o(2154);
        }
    }

    public static synchronized void removeSlamDetectListener(AbstractC30013c cVar) {
        synchronized (RecordInvoker.class) {
            MethodCollector.m26663i(2171);
            sSlamDetectListeners.remove(cVar);
            MethodCollector.m26664o(2171);
        }
    }

    public static synchronized void setMessageListener(MessageCenter.Listener listener) {
        synchronized (RecordInvoker.class) {
            MethodCollector.m26663i(2271);
            sMessageListener = listener;
            MethodCollector.m26664o(2271);
        }
    }

    public static synchronized void setSlamDetectListener(AbstractC30013c cVar) {
        synchronized (RecordInvoker.class) {
            MethodCollector.m26663i(2176);
            addSlamDetectListener(cVar);
            MethodCollector.m26664o(2176);
        }
    }

    public synchronized void addLandMarkDetectListener(AbstractC85313aj ajVar) {
        MethodCollector.m26663i(2165);
        this.mLandmarkDetectListeners.add(ajVar);
        MethodCollector.m26664o(2165);
    }

    public synchronized void addSlamDetectListener2(AbstractC30013c cVar) {
        MethodCollector.m26663i(2178);
        if (cVar != null) {
            this.mSlamDetectListeners.add(cVar);
        }
        MethodCollector.m26664o(2178);
    }

    public void attachExtFrameData(Object obj) {
        MethodCollector.m26663i(2707);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2707);
            return;
        }
        nativeAttachExtFrameData(j, obj);
        MethodCollector.m26664o(2707);
    }

    public synchronized void changePreviewRadioMode(int i) {
        MethodCollector.m26663i(633);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(633);
            return;
        }
        nativeChangePreviewRadioMode(j, i);
        MethodCollector.m26664o(633);
    }

    public void chooseAreaFromRatio34(float f) {
        MethodCollector.m26663i(1547);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1547);
            return;
        }
        nativeChooseAreaFromRatio34(j, f);
        MethodCollector.m26664o(1547);
    }

    public void chooseSlamFace(int i) {
        MethodCollector.m26663i(1147);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1147);
            return;
        }
        nativeChooseSlamFace(j, i);
        MethodCollector.m26664o(1147);
    }

    public int closeWavFile(boolean z) {
        MethodCollector.m26663i(1149);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1149);
            return -100000;
        }
        int nativeCloseWavFile = nativeCloseWavFile(j, z);
        save();
        MethodCollector.m26664o(1149);
        return nativeCloseWavFile;
    }

    public int configStyleResourceFinder(AssetManager assetManager) {
        MethodCollector.m26663i(2286);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2286);
            return -100000;
        }
        int nativeConfigStyleResourceFinder = (int) nativeConfigStyleResourceFinder(j, assetManager);
        MethodCollector.m26664o(2286);
        return nativeConfigStyleResourceFinder;
    }

    public void disableRender(boolean z) {
        MethodCollector.m26663i(867);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(867);
            return;
        }
        nativeDisableRender(j, z);
        MethodCollector.m26664o(867);
    }

    public void enable3buffer(boolean z) {
        MethodCollector.m26663i(2209);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2209);
            return;
        }
        nativeEnable3buffer(j, z);
        MethodCollector.m26664o(2209);
    }

    public void enableAbandonFirstFrame(boolean z) {
        MethodCollector.m26663i(1005);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1005);
            return;
        }
        nativeEnableAbandonFirstFrame(j, z);
        MethodCollector.m26664o(1005);
    }

    public synchronized void enableAudio(int i) {
        MethodCollector.m26663i(623);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(623);
            return;
        }
        nativeEnableAudio(j, i);
        MethodCollector.m26664o(623);
    }

    public synchronized void enableAudioPlayerFromVE(int i) {
        MethodCollector.m26663i(626);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(626);
            return;
        }
        nativeEnableAudioPlayerFromVE(j, i);
        MethodCollector.m26664o(626);
    }

    public synchronized void enableAutoTestLog(boolean z) {
        MethodCollector.m26663i(628);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(628);
            return;
        }
        nativeEnableAutoTestLog(j, z);
        MethodCollector.m26664o(628);
    }

    public void enableClearColorAfterRender(boolean z) {
        MethodCollector.m26663i(2213);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2213);
            return;
        }
        nativeEnableClearColorAfterRender(j, z);
        MethodCollector.m26664o(2213);
    }

    public void enableEffect(boolean z) {
        MethodCollector.m26663i(801);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(801);
            return;
        }
        nativeEnableEffect(j, z);
        MethodCollector.m26664o(801);
    }

    public void enableEffectBGM(boolean z) {
        MethodCollector.m26663i(793);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(793);
            return;
        }
        nativeEnableEffectBGM(j, z);
        MethodCollector.m26664o(793);
    }

    public void enableEffectRT(boolean z) {
        MethodCollector.m26663i(2210);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2210);
            return;
        }
        nativeEnableEffectRT(j, z);
        MethodCollector.m26664o(2210);
    }

    public void enableLandMark(boolean z) {
        MethodCollector.m26663i(1443);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1443);
            return;
        }
        nativeEnableLandMark(j, z);
        MethodCollector.m26664o(1443);
    }

    public void enableMakeUpBackground(boolean z) {
        MethodCollector.m26663i(2211);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2211);
            return;
        }
        nativeEnableMakeUpBackground(j, z);
        MethodCollector.m26664o(2211);
    }

    public void enablePBO(boolean z) {
        MethodCollector.m26663i(71);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
        }
        nativeEnablePBO(z);
        MethodCollector.m26664o(71);
    }

    public void enablePictureTestModel(boolean z) {
        MethodCollector.m26663i(78);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(78);
            return;
        }
        nativeEnablePictureTestMode(j, z);
        MethodCollector.m26664o(78);
    }

    public void enableRecordBGMToMp4(boolean z) {
        MethodCollector.m26663i(96);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(96);
            return;
        }
        nativeEnableRecordBGMToMp4(j, z);
        MethodCollector.m26664o(96);
    }

    public synchronized void enableRecordFlip(int i) {
        MethodCollector.m26663i(625);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(625);
            return;
        }
        nativeEnableRecordFlip(j, i);
        MethodCollector.m26664o(625);
    }

    public void enableRecordingMp4(boolean z) {
        MethodCollector.m26663i(50);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(50);
            return;
        }
        nativeEnableRecordingMp4(j, z);
        MethodCollector.m26664o(50);
    }

    public void enableShotScreenUseOesTexture(boolean z) {
        MethodCollector.m26663i(52);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(52);
            return;
        }
        nativeEnableShotScreenUseOesTexture(j, z);
        MethodCollector.m26664o(52);
    }

    public synchronized void enableTimestampCallback(boolean z) {
        MethodCollector.m26663i(627);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(627);
            return;
        }
        nativeEnableTimestampCallback(j, z);
        MethodCollector.m26664o(627);
    }

    public void enableWaterMark(boolean z) {
        MethodCollector.m26663i(74);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(74);
            return;
        }
        nativeEnableWaterMark(j, z);
        MethodCollector.m26664o(74);
    }

    public void forceFirstFrameHasEffect(boolean z) {
        MethodCollector.m26663i(2206);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2206);
            return;
        }
        nativeForceFirstFrameHasEffect(j, z);
        MethodCollector.m26664o(2206);
    }

    public float getFilterIntensity(String str) {
        MethodCollector.m26663i(15);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(15);
            return -100000.0f;
        }
        float nativeGetFilterIntensity = nativeGetFilterIntensity(j, str);
        MethodCollector.m26664o(15);
        return nativeGetFilterIntensity;
    }

    public ImageFrame getFrameByKey(String str) {
        ImageFrame nativeGetFrameByKey;
        MethodCollector.m26663i(2255);
        long j = this.mHandler;
        if (j == 0) {
            nativeGetFrameByKey = null;
        } else {
            nativeGetFrameByKey = nativeGetFrameByKey(j, str);
        }
        MethodCollector.m26664o(2255);
        return nativeGetFrameByKey;
    }

    public int initBeautyPlayOnlyPreview(ScanSettings scanSettings) {
        MethodCollector.m26663i(2291);
        long nativeCreate = nativeCreate();
        this.mHandler = nativeCreate;
        if (nativeCreate == 0) {
            MethodCollector.m26664o(2291);
            return -100000;
        }
        int nativeInitBeautyPlayOnlyPreview = nativeInitBeautyPlayOnlyPreview(nativeCreate, scanSettings);
        MethodCollector.m26664o(2291);
        return nativeInitBeautyPlayOnlyPreview;
    }

    public void initFaceBeautyDetectExtParam(boolean z) {
        MethodCollector.m26663i(174);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(174);
            return;
        }
        nativeInitFaceBeautyDetectExtParam(j, z);
        MethodCollector.m26664o(174);
    }

    public int onDrawFrameTime(double d) {
        MethodCollector.m26663i(826);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(826);
            return -100000;
        }
        int nativeOnFrameTime = nativeOnFrameTime(j, d);
        MethodCollector.m26664o(826);
        return nativeOnFrameTime;
    }

    public void regBachAlgorithmCallback(List<Object> list) {
        MethodCollector.m26663i(2970);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2970);
            return;
        }
        nativeRegBachAlgorithmCallback(j, list);
        MethodCollector.m26664o(2970);
    }

    public void registerCherEffectParamCallback(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        MethodCollector.m26663i(1460);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1460);
            return;
        }
        nativeRegisterCherEffectParamCallback(j, onCherEffectParmaCallback);
        MethodCollector.m26664o(1460);
    }

    public void registerEffectAlgorithmCallback(EffectAlgorithmCallback effectAlgorithmCallback) {
        MethodCollector.m26663i(1180);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1180);
            return;
        }
        nativeRegisterEffectAlgorithmCallback(j, effectAlgorithmCallback);
        MethodCollector.m26664o(1180);
    }

    public void registerSceneDetectCallback(OnSceneDetectCallback onSceneDetectCallback) {
        MethodCollector.m26663i(1447);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1447);
            return;
        }
        nativeRegisterSceneDetectCallback(j, onSceneDetectCallback);
        MethodCollector.m26664o(1447);
    }

    public void registerSkeletonDetectCallback(OnSkeletonDetectCallback onSkeletonDetectCallback) {
        MethodCollector.m26663i(1452);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1452);
            return;
        }
        nativeRegisterSkeletonDetectCallback(j, onSkeletonDetectCallback);
        MethodCollector.m26664o(1452);
    }

    public void registerSmartBeautyCallback(OnSmartBeautyCallback onSmartBeautyCallback) {
        MethodCollector.m26663i(1457);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1457);
            return;
        }
        nativeRegisterSmartBeautyCallback(j, onSmartBeautyCallback);
        MethodCollector.m26664o(1457);
    }

    public synchronized void removeLandMarkDetectListener(AbstractC85313aj ajVar) {
        MethodCollector.m26663i(2169);
        this.mLandmarkDetectListeners.remove(ajVar);
        MethodCollector.m26664o(2169);
    }

    public synchronized void removeSlamDetectListener2(AbstractC30013c cVar) {
        MethodCollector.m26663i(2179);
        this.mSlamDetectListeners.remove(cVar);
        MethodCollector.m26664o(2179);
    }

    public float rotateReactionWindow(float f) {
        MethodCollector.m26663i(2735);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2735);
            return -100000.0f;
        }
        float nativeRotateReactionWindow = nativeRotateReactionWindow(j, f);
        MethodCollector.m26664o(2735);
        return nativeRotateReactionWindow;
    }

    public int[] scaleReactionWindow(float f) {
        MethodCollector.m26663i(2733);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2733);
            return null;
        }
        int[] nativeScaleReactionWindow = nativeScaleReactionWindow(j, f);
        MethodCollector.m26664o(2733);
        return nativeScaleReactionWindow;
    }

    public void setARCoreParam(VEARCoreParam vEARCoreParam) {
        MethodCollector.m26663i(2870);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2870);
            return;
        }
        nativeSetARCoreParam(j, vEARCoreParam);
        MethodCollector.m26664o(2870);
    }

    public void setBgmMute(boolean z) {
        MethodCollector.m26663i(2581);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2581);
            return;
        }
        nativeSetBgmMute(j, z);
        MethodCollector.m26664o(2581);
    }

    public void setCameraClose(boolean z) {
        MethodCollector.m26663i(631);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(631);
            return;
        }
        nativeSetCameraClose(j, z);
        MethodCollector.m26664o(631);
    }

    public void setCaptureMirror(boolean z) {
        MethodCollector.m26663i(2338);
        setCaptureMirror(this.mHandler, z);
        MethodCollector.m26664o(2338);
    }

    public void setClientState(int i) {
        MethodCollector.m26663i(872);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
        }
        nativeSetClientState(this.mHandler, i);
        MethodCollector.m26664o(872);
    }

    public void setDLEEnable(boolean z) {
        MethodCollector.m26663i(2517);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2517);
            return;
        }
        nativeSetDLEEnable(j, z);
        MethodCollector.m26664o(2517);
    }

    public void setDebugSettings(VEDebugSettings vEDebugSettings) {
        MethodCollector.m26663i(1421);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "setDebugSettings failed, handler is null");
            MethodCollector.m26664o(1421);
            return;
        }
        nativeSetDebugSettings(j, vEDebugSettings);
        MethodCollector.m26664o(1421);
    }

    public void setDetectInterval(int i) {
        MethodCollector.m26663i(778);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(778);
            return;
        }
        nativeSetDetectInterval(j, i);
        MethodCollector.m26664o(778);
    }

    public void setDetectionMode(boolean z) {
        MethodCollector.m26663i(2298);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2298);
            return;
        }
        nativeSetDetectionMode(j, z);
        MethodCollector.m26664o(2298);
    }

    public void setDropFrames(int i) {
        MethodCollector.m26663i(1009);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1009);
            return;
        }
        nativeSetDropFrames(j, i);
        MethodCollector.m26664o(1009);
    }

    public void setDuetCameraPaused(boolean z) {
        MethodCollector.m26663i(2580);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2580);
            return;
        }
        nativeSetDuetCameraPaused(j, z);
        MethodCollector.m26664o(2580);
    }

    public void setEffectBuildChainType(int i) {
        MethodCollector.m26663i(2984);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2984);
            return;
        }
        nativeSetEffectBuildChainType(j, i);
        MethodCollector.m26664o(2984);
    }

    public void setEnableDuetV2(boolean z) {
        MethodCollector.m26663i(1440);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1440);
            return;
        }
        nativeSetEnableDuetV2(j, z);
        MethodCollector.m26664o(1440);
    }

    public int setFilterIntensity(float f) {
        MethodCollector.m26663i(38);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(38);
            return -100000;
        }
        int nativeSetFilterIntensity = nativeSetFilterIntensity(j, f);
        MethodCollector.m26664o(38);
        return nativeSetFilterIntensity;
    }

    public void setForceAlgorithmCnt(int i) {
        MethodCollector.m26663i(1676);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1676);
            return;
        }
        nativeSetForceAlgorithmCnt(j, i);
        MethodCollector.m26664o(1676);
    }

    public void setForceAlgorithmEnableCount(int i) {
        MethodCollector.m26663i(1426);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "setForceAlgorithmEnableCount failed, handler is null");
            MethodCollector.m26664o(1426);
            return;
        }
        nativeSetForceAlgorithmEnableCount(j, i);
        MethodCollector.m26664o(1426);
    }

    public int setHardEncoderStatus(boolean z) {
        MethodCollector.m26663i(841);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(841);
            return -100000;
        }
        int nativeSetHardEncoderStatus = nativeSetHardEncoderStatus(j, z);
        MethodCollector.m26664o(841);
        return nativeSetHardEncoderStatus;
    }

    public int setInitHardEncodeRet(int i) {
        MethodCollector.m26663i(979);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(979);
            return -100000;
        }
        int nativeSetInitHardEncodeRet = nativeSetInitHardEncodeRet(j, i);
        MethodCollector.m26664o(979);
        return nativeSetInitHardEncodeRet;
    }

    public void setLandMarkInfo(LandMarkFrame landMarkFrame) {
        MethodCollector.m26663i(2994);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(2994);
            return;
        }
        if (isRenderReady()) {
            nativeSetLandMarkInfo(this.mHandler, landMarkFrame);
        }
        MethodCollector.m26664o(2994);
    }

    public int setMaleMakeupState(boolean z) {
        MethodCollector.m26663i(2218);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2218);
            return -100000;
        }
        int nativeSetMaleMakeupState = nativeSetMaleMakeupState(j, z);
        MethodCollector.m26664o(2218);
        return nativeSetMaleMakeupState;
    }

    public void setMemoryOpt(boolean z) {
        MethodCollector.m26663i(148);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(148);
            return;
        }
        nativeSetMemoryOpt(j, z);
        MethodCollector.m26664o(148);
    }

    public synchronized void setModeChangeState(int i) {
        MethodCollector.m26663i(630);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(630);
            return;
        }
        nativeSetModeChangeState(j, i);
        MethodCollector.m26664o(630);
    }

    public void setNativeLibraryDir(String str) {
        MethodCollector.m26663i(156);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(156);
            return;
        }
        nativeSetNativeLibraryDir(str);
        MethodCollector.m26664o(156);
    }

    public void setPaddingBottomInRatio34(float f) {
        MethodCollector.m26663i(1891);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1891);
            return;
        }
        nativeSetPaddingBottomInRatio34(j, f);
        MethodCollector.m26664o(1891);
    }

    public int setPlayLength(long j) {
        MethodCollector.m26663i(1408);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.m26664o(1408);
            return -100000;
        }
        int nativeSetPlayLength = nativeSetPlayLength(j2, j);
        MethodCollector.m26664o(1408);
        return nativeSetPlayLength;
    }

    public void setPreviewDuetVideoPaused(boolean z) {
        MethodCollector.m26663i(2575);
        long j = this.mHandler;
        if (j != 0) {
            nativeSetPreviewDuetVideoPaused(j, z);
        }
        MethodCollector.m26664o(2575);
    }

    public void setPreviewRadioListener(OnPreviewRadioListener onPreviewRadioListener) {
        MethodCollector.m26663i(2217);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2217);
            return;
        }
        nativeSetPreviewRadioListener(j, onPreviewRadioListener);
        MethodCollector.m26664o(2217);
    }

    public void setRecordContentType(boolean z) {
        MethodCollector.m26663i(2316);
        long j = this.mHandler;
        if (j != 0) {
            nativeSetRecordContentType(j, z);
        }
        MethodCollector.m26664o(2316);
    }

    public int setRecordMode(int i) {
        MethodCollector.m26663i(1719);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1719);
            return -1;
        }
        int nativeSetRecordMode = nativeSetRecordMode(j, i);
        MethodCollector.m26664o(1719);
        return nativeSetRecordMode;
    }

    public void setRunningErrorCallback(OnRunningErrorCallback onRunningErrorCallback) {
        MethodCollector.m26663i(2143);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2143);
            return;
        }
        nativeSetRunningErrorCallback(j, onRunningErrorCallback);
        MethodCollector.m26664o(2143);
    }

    public void setScale(float f) {
        MethodCollector.m26663i(661);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(661);
            return;
        }
        nativeSetScale(j, f);
        MethodCollector.m26664o(661);
    }

    public int setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
        MethodCollector.m26663i(2186);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2186);
            return -100000;
        }
        int nativeSetStickerRequestCallback = nativeSetStickerRequestCallback(j, iStickerRequestCallback);
        MethodCollector.m26664o(2186);
        return nativeSetStickerRequestCallback;
    }

    public void setSwapDuetRegion(boolean z) {
        MethodCollector.m26663i(2562);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2562);
            return;
        }
        nativeSetSwapDuetRegion(j, z);
        MethodCollector.m26664o(2562);
    }

    public void setSwapReactionRegion(boolean z) {
        MethodCollector.m26663i(2565);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2565);
            return;
        }
        nativeSetSwapReactionRegion(j, z);
        MethodCollector.m26664o(2565);
    }

    public void setSwitchEffectInGLTask(boolean z) {
        MethodCollector.m26663i(2321);
        long j = this.mHandler;
        if (j != 0) {
            nativeSwitchEffectInGLTask(j, z);
        }
        MethodCollector.m26664o(2321);
    }

    public void setUseMultiPreviewRatio(boolean z) {
        MethodCollector.m26663i(1586);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "setUseMultiPreviewRatio failed, handler is null");
            MethodCollector.m26664o(1586);
            return;
        }
        nativeSetUseMultiPreviewRatio(j, z);
        MethodCollector.m26664o(1586);
    }

    public synchronized void setUseMusic(int i) {
        MethodCollector.m26663i(621);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(621);
            return;
        }
        nativeSetUseMusic(j, i);
        MethodCollector.m26664o(621);
    }

    public void setVideoBgSpeed(double d) {
        MethodCollector.m26663i(2973);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2973);
            return;
        }
        nativeSetVideoBgSpeed(j, d);
        MethodCollector.m26664o(2973);
    }

    public int slamGetTextBitmap(OnARTextBitmapCallback onARTextBitmapCallback) {
        MethodCollector.m26663i(773);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(773);
            return -100000;
        }
        int nativeSlamGetTextBitmap = nativeSlamGetTextBitmap(j, onARTextBitmapCallback);
        MethodCollector.m26664o(773);
        return nativeSlamGetTextBitmap;
    }

    public int stopRecord(boolean z) {
        MethodCollector.m26663i(606);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(606);
            return -100000;
        }
        int nativeStopRecord = nativeStopRecord(j, z);
        MethodCollector.m26664o(606);
        return nativeStopRecord;
    }

    public void updateReactionBGAlpha(float f) {
        MethodCollector.m26663i(2878);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2878);
            return;
        }
        nativeUpdateReactionBGAlpha(j, f);
        MethodCollector.m26664o(2878);
    }

    public void useLargeMattingModel(boolean z) {
        MethodCollector.m26663i(1472);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1472);
            return;
        }
        nativeUseLargeMattingModel(j, z);
        MethodCollector.m26664o(1472);
    }

    private void onNativeCallback_Init(int i) {
        if (i < 0) {
            C85315al.m146642d("RecordInvoker", "onNativeCallback_Init error = ".concat(String.valueOf(i)));
        } else {
            this.mIsRenderReady = true;
            C85315al.m146637a("RecordInvoker", "onNativeCallback_Init success = ".concat(String.valueOf(i)));
        }
        AbstractC30012b bVar = this.mNativeInitListener;
        if (bVar != null) {
            bVar.mo52865a(i);
        }
        AbstractC30012b bVar2 = sNativeInitListener;
        if (bVar2 != null) {
            bVar2.mo52865a(i);
        }
        this.mIsRenderReady = true;
    }

    public synchronized int changeMusicPath(String str) {
        MethodCollector.m26663i(646);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(646);
            return -100000;
        }
        int nativeChangeMusicPath = nativeChangeMusicPath(j, str);
        MethodCollector.m26664o(646);
        return nativeChangeMusicPath;
    }

    public synchronized int changeSurface(Surface surface) {
        MethodCollector.m26663i(632);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(632);
            return -100000;
        }
        int nativeChangeSurface = nativeChangeSurface(j, surface);
        MethodCollector.m26664o(632);
        return nativeChangeSurface;
    }

    public int enableDuetGlFinish(boolean z) {
        MethodCollector.m26663i(2365);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2365);
            return -100000;
        }
        int nativeEnableDuetGlFinish = nativeEnableDuetGlFinish(j, z);
        MethodCollector.m26664o(2365);
        return nativeEnableDuetGlFinish;
    }

    public int enableGetPropTrack(boolean z) {
        MethodCollector.m26663i(2465);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2465);
            return -100000;
        }
        int natvieEnableGetPropTrack = natvieEnableGetPropTrack(j, z);
        MethodCollector.m26664o(2465);
        return natvieEnableGetPropTrack;
    }

    public int enableRecordMaxDuration(boolean z) {
        MethodCollector.m26663i(2356);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2356);
            return -100000;
        }
        int nativeEnableRecordMaxDuration = nativeEnableRecordMaxDuration(j, z);
        MethodCollector.m26664o(2356);
        return nativeEnableRecordMaxDuration;
    }

    public boolean fetchDistortionInfo(DistortionInfoCallback distortionInfoCallback) {
        MethodCollector.m26663i(1325);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1325);
            return false;
        } else if (nativeFetchDistortionInfo(j, distortionInfoCallback) == 0) {
            MethodCollector.m26664o(1325);
            return true;
        } else {
            MethodCollector.m26664o(1325);
            return false;
        }
    }

    public String getResourceMultiViewTag(String str) {
        MethodCollector.m26663i(781);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(781);
            return null;
        }
        String nativeGetResourceMultiViewTag = nativeGetResourceMultiViewTag(j, str);
        MethodCollector.m26664o(781);
        return nativeGetResourceMultiViewTag;
    }

    public int initImageDrawer(int i) {
        MethodCollector.m26663i(1475);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1475);
            return -100000;
        }
        int nativeInitImageDrawer = nativeInitImageDrawer(j, i);
        MethodCollector.m26664o(1475);
        return nativeInitImageDrawer;
    }

    public int initMediaCodecSurface(Surface surface) {
        MethodCollector.m26663i(2571);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(2571);
            return -100000;
        }
        int nativeInitMediaCodecSurface = nativeInitMediaCodecSurface(j, surface);
        MethodCollector.m26664o(2571);
        return nativeInitMediaCodecSurface;
    }

    public boolean isGestureRegistered(EnumC85306ad adVar) {
        int ordinal;
        MethodCollector.m26663i(2033);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2033);
            return false;
        }
        if (adVar.ordinal() == EnumC85306ad.ANY_SUPPORTED.ordinal()) {
            ordinal = -1;
        } else {
            ordinal = adVar.ordinal();
        }
        boolean nativeIsGestureRegistered = nativeIsGestureRegistered(this.mHandler, ordinal);
        MethodCollector.m26664o(2033);
        return nativeIsGestureRegistered;
    }

    public void pauseEffectAudio(boolean z) {
        MethodCollector.m26663i(784);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(784);
            return;
        }
        if (isRenderReady()) {
            nativePauseEffectAudio(this.mHandler, z);
        }
        MethodCollector.m26664o(784);
    }

    public int setAudioDataInterface(long j) {
        MethodCollector.m26663i(2253);
        long j2 = this.mHandler;
        if (j2 == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2253);
            return -100000;
        }
        int nativeSetAudioDataInterface = nativeSetAudioDataInterface(j2, j);
        MethodCollector.m26664o(2253);
        return nativeSetAudioDataInterface;
    }

    public void setCameraFirstFrameOptimize(boolean z) {
        int i;
        MethodCollector.m26663i(141);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(141);
            return;
        }
        if (z) {
            i = getOptFirstFrameBypassEffectFrameCnt();
        } else {
            i = 3;
        }
        nativeSetCameraFirstFrameOptimize(this.mHandler, z, i);
        MethodCollector.m26664o(141);
    }

    public int setCodecType(int i) {
        MethodCollector.m26663i(2258);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2258);
            return -100000;
        }
        int nativeSetCodecType = nativeSetCodecType(j, i);
        MethodCollector.m26664o(2258);
        return nativeSetCodecType;
    }

    public int setComposerResourcePath(String str) {
        MethodCollector.m26663i(1682);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1682);
            return -100000;
        }
        int nativeSetComposerResourcePath = nativeSetComposerResourcePath(j, str);
        MethodCollector.m26664o(1682);
        return nativeSetComposerResourcePath;
    }

    public int setEffectMaxMemoryCache(int i) {
        MethodCollector.m26663i(871);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(871);
            return -100000;
        }
        int nativeSetEffectMaxMemoryCache = nativeSetEffectMaxMemoryCache(j, i);
        MethodCollector.m26664o(871);
        return nativeSetEffectMaxMemoryCache;
    }

    public int setEnableEarBack(boolean z) {
        MethodCollector.m26663i(2250);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2250);
            return -100000;
        }
        int nativeSetEnableEarBack = nativeSetEnableEarBack(j, z);
        MethodCollector.m26664o(2250);
        return nativeSetEnableEarBack;
    }

    public int setFaceMakeUp(String str) {
        MethodCollector.m26663i(56);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(56);
            return -100000;
        }
        int nativeSetFaceMakeUp2 = nativeSetFaceMakeUp2(j, str);
        MethodCollector.m26664o(56);
        return nativeSetFaceMakeUp2;
    }

    public int setFilter(String str) {
        MethodCollector.m26663i(2999);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2999);
            return -100000;
        }
        int nativeSetFilter = nativeSetFilter(j, str, str, 1.0f);
        MethodCollector.m26664o(2999);
        return nativeSetFilter;
    }

    public int setHandDetectLowpower(boolean z) {
        MethodCollector.m26663i(1158);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1158);
            return -100000;
        }
        int nativeSetHandDetectLowpower = nativeSetHandDetectLowpower(j, z);
        MethodCollector.m26664o(1158);
        return nativeSetHandDetectLowpower;
    }

    public int setMusicNodes(String str) {
        MethodCollector.m26663i(1466);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1466);
            return -100000;
        }
        int nativeSetMusicNodes = nativeSetMusicNodes(j, str);
        MethodCollector.m26664o(1466);
        return nativeSetMusicNodes;
    }

    public int setRecordMaxDuration(long j) {
        MethodCollector.m26663i(2264);
        long j2 = this.mHandler;
        if (j2 == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2264);
            return -100000;
        }
        int nativeSetRecordMaxDuration = nativeSetRecordMaxDuration(j2, j);
        MethodCollector.m26664o(2264);
        return nativeSetRecordMaxDuration;
    }

    public int setRecordPrepareTime(long j) {
        MethodCollector.m26663i(1116);
        long j2 = this.mHandler;
        if (j2 == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1116);
            return -108;
        }
        int nativeSetRecordPrepareTime = nativeSetRecordPrepareTime(j2, j);
        MethodCollector.m26664o(1116);
        return nativeSetRecordPrepareTime;
    }

    public int setReshapeResource(String str) {
        MethodCollector.m26663i(53);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(53);
            return -100000;
        }
        int nativeSetReshapeResource = nativeSetReshapeResource(j, str);
        MethodCollector.m26664o(53);
        return nativeSetReshapeResource;
    }

    public boolean setSharedTextureStatus(boolean z) {
        MethodCollector.m26663i(68);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(68);
            return false;
        }
        boolean nativeSetSharedTextureStatus = nativeSetSharedTextureStatus(z);
        MethodCollector.m26664o(68);
        return nativeSetSharedTextureStatus;
    }

    public int setSkinTone(String str) {
        MethodCollector.m26663i(62);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(62);
            return -100000;
        }
        int nativeSetSkinTone = nativeSetSkinTone(j, str);
        MethodCollector.m26664o(62);
        return nativeSetSkinTone;
    }

    public int setSlamFace(Bitmap bitmap) {
        MethodCollector.m26663i(1129);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1129);
            return -100000;
        }
        int nativeSetSlamFace = nativeSetSlamFace(j, bitmap);
        MethodCollector.m26664o(1129);
        return nativeSetSlamFace;
    }

    public int setVEEffectParams(VEEffectParams vEEffectParams) {
        MethodCollector.m26663i(877);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(877);
            return -100000;
        }
        int nativeSetVEEffectParams = nativeSetVEEffectParams(j, vEEffectParams);
        MethodCollector.m26664o(877);
        return nativeSetVEEffectParams;
    }

    public void setVideoEncodeRotation(int i) {
        MethodCollector.m26663i(87);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(87);
            return;
        }
        C29974a.f71491c = i;
        nativeSetVideoEncodeRotation(this.mHandler, i);
        MethodCollector.m26664o(87);
    }

    public int slamGetTextLimitCount(OnARTextCountCallback onARTextCountCallback) {
        MethodCollector.m26663i(760);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(760);
            return -100000;
        }
        int nativeSlamGetTextLimitCount = nativeSlamGetTextLimitCount(j, onARTextCountCallback);
        MethodCollector.m26664o(760);
        return nativeSlamGetTextLimitCount;
    }

    public int slamGetTextParagraphContent(OnARTextContentCallback onARTextContentCallback) {
        MethodCollector.m26663i(770);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(770);
            return -100000;
        }
        int nativeSlamGetTextParagraphContent = nativeSlamGetTextParagraphContent(j, onARTextContentCallback);
        MethodCollector.m26664o(770);
        return nativeSlamGetTextParagraphContent;
    }

    public int slamNotifyHideKeyBoard(boolean z) {
        MethodCollector.m26663i(755);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(755);
            return -100000;
        }
        int nativeHideSlamKeyBoard = nativeHideSlamKeyBoard(j, z);
        MethodCollector.m26664o(755);
        return nativeHideSlamKeyBoard;
    }

    public int slamSetLanguge(String str) {
        MethodCollector.m26663i(757);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(757);
            return -100000;
        }
        int nativeSlamSetLanguge = nativeSlamSetLanguge(j, str);
        MethodCollector.m26664o(757);
        return nativeSlamSetLanguge;
    }

    public boolean swapMainAndPipRenderTarget(boolean z) {
        MethodCollector.m26663i(1337);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("ae_style", "ae_style, swap failed, no proxy");
            MethodCollector.m26664o(1337);
            return false;
        } else if (nativeSwapMainAndPipRenderTarget(j, z) == 0) {
            MethodCollector.m26664o(1337);
            return true;
        } else {
            MethodCollector.m26664o(1337);
            return false;
        }
    }

    public void onNativeCallback_onLandMarkDetect(boolean z) {
        MethodCollector.m26663i(1279);
        ArrayList<AbstractC85313aj> arrayList = new ArrayList();
        synchronized (RecordInvoker.class) {
            try {
                for (AbstractC85313aj ajVar : this.mLandmarkDetectListeners) {
                    arrayList.add(ajVar);
                }
            } finally {
                MethodCollector.m26664o(1279);
            }
        }
        for (AbstractC85313aj ajVar2 : arrayList) {
            if (ajVar2 != null) {
                ajVar2.mo128912a(z);
            }
        }
    }

    public void onNativeCallback_onSlamDetect(boolean z) {
        MethodCollector.m26663i(1250);
        ArrayList<AbstractC30013c> arrayList = new ArrayList();
        synchronized (RecordInvoker.class) {
            try {
                for (AbstractC30013c cVar : sSlamDetectListeners) {
                    arrayList.add(cVar);
                }
                for (AbstractC30013c cVar2 : this.mSlamDetectListeners) {
                    arrayList.add(cVar2);
                }
            } finally {
                MethodCollector.m26664o(1250);
            }
        }
        for (AbstractC30013c cVar3 : arrayList) {
            if (cVar3 != null) {
                cVar3.mo52867a();
            }
        }
    }

    public void setCustomVideoBg(String str, String str2) {
        MethodCollector.m26663i(2885);
        nativeSetCustomVideoBgGif(this.mHandler, str, str2);
        MethodCollector.m26664o(2885);
    }

    public void changeDuetVideo(String str, String str2) {
        MethodCollector.m26663i(2572);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2572);
            return;
        }
        nativeChangeDuetVideo(j, str, str2);
        MethodCollector.m26664o(2572);
    }

    public void changeOutputVideoSize(int i, int i2) {
        MethodCollector.m26663i(1541);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1541);
            return;
        }
        nativeChangeOutputVideoSize(j, i, i2);
        MethodCollector.m26664o(1541);
    }

    public void enableLensProcess(int i, boolean z) {
        MethodCollector.m26663i(2786);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2786);
            return;
        }
        nativeEnableLensProcess(j, i, z);
        MethodCollector.m26664o(2786);
    }

    public void initHDRNetDetectExtParam(boolean z, String str) {
        MethodCollector.m26663i(194);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(194);
            return;
        }
        nativeInitHDRNetDetectExtParam(j, z, str);
        MethodCollector.m26664o(194);
    }

    public void onAudioCallback(byte[] bArr, int i) {
        MethodCollector.m26663i(1413);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(1413);
            return;
        }
        if (isRenderReady()) {
            nativeOnAudioCallback(this.mHandler, bArr, i);
        }
        MethodCollector.m26664o(1413);
    }

    public void onNativeCallback_onFaceDetect(int i, int i2) {
        C85315al.m146639b("RecordInvoker", "BeautyInvoker onFaceDetect ".concat(String.valueOf(i2)));
        AbstractC30011a aVar = sFaceDetectListener;
        if (aVar != null) {
            aVar.mo52864a(i, i2);
        }
        AbstractC30011a aVar2 = this.mFaceDetectListener;
        if (aVar2 != null) {
            aVar2.mo52864a(i, i2);
        }
    }

    public boolean posInReactionRegion(int i, int i2) {
        MethodCollector.m26663i(2877);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2877);
            return false;
        }
        boolean nativePosInReactionRegion = nativePosInReactionRegion(j, i, i2);
        MethodCollector.m26664o(2877);
        return nativePosInReactionRegion;
    }

    public int postDuetAction(int i, long j) {
        MethodCollector.m26663i(2975);
        int nativePostDuetAction = nativePostDuetAction(this.mHandler, i, j);
        MethodCollector.m26664o(2975);
        return nativePostDuetAction;
    }

    public void registerFaceResultCallback(boolean z, FaceResultCallback faceResultCallback) {
        MethodCollector.m26663i(1168);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1168);
            return;
        }
        nativeRegisterFaceResultCallback(j, z, faceResultCallback);
        MethodCollector.m26664o(1168);
    }

    public void registerHandDetectCallback(int[] iArr, OnHandDetectCallback onHandDetectCallback) {
        MethodCollector.m26663i(1444);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1444);
            return;
        }
        nativeRegisterHandDetectCallback(j, iArr, onHandDetectCallback);
        MethodCollector.m26664o(1444);
    }

    public void setAlgorithmChangeMsg(int i, boolean z) {
        MethodCollector.m26663i(1153);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1153);
            return;
        }
        nativeSetAlgorithmChangeMsg(j, i, z);
        MethodCollector.m26664o(1153);
    }

    public int setBGMVolume(float f, int i) {
        MethodCollector.m26663i(835);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(835);
            return -100000;
        }
        int nativeSetBGMVolume = nativeSetBGMVolume(j, f, i);
        MethodCollector.m26664o(835);
        return nativeSetBGMVolume;
    }

    public void setCamPreviewSize(int i, int i2) {
        MethodCollector.m26663i(634);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(634);
            return;
        }
        try {
            nativeSetCamPreviewSize(j, i, i2);
            MethodCollector.m26664o(634);
        } catch (Throwable unused) {
            MethodCollector.m26664o(634);
        }
    }

    public void setCaptureRenderWidth(int i, int i2) {
        MethodCollector.m26663i(2214);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2214);
            return;
        }
        nativeSetCaptureRenderWidth(j, i, i2);
        MethodCollector.m26664o(2214);
    }

    public int setFilterNew(String str, float f) {
        MethodCollector.m26663i(2997);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2997);
            return -100000;
        }
        int nativeSetFilterNew = nativeSetFilterNew(j, str, f);
        MethodCollector.m26664o(2997);
        return nativeSetFilterNew;
    }

    public void setKaraoke(boolean z, boolean z2) {
        MethodCollector.m26663i(1120);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1120);
            return;
        }
        nativeSetKaraoke(j, z, z2);
        MethodCollector.m26664o(1120);
    }

    public void setReactionBorderParam(int i, int i2) {
        MethodCollector.m26663i(2817);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2817);
            return;
        }
        nativeSetReactionBorderParam(j, i, i2);
        MethodCollector.m26664o(2817);
    }

    public boolean setReactionMaskImage(String str, boolean z) {
        MethodCollector.m26663i(2874);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2874);
            return false;
        }
        boolean nativeSetReactionMaskImage = nativeSetReactionMaskImage(j, str, z);
        MethodCollector.m26664o(2874);
        return nativeSetReactionMaskImage;
    }

    public void setRenderCacheString(String str, String str2) {
        MethodCollector.m26663i(1674);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1674);
            return;
        }
        nativeSetRenderCacheString(j, str, str2);
        MethodCollector.m26664o(1674);
    }

    public void setRenderCacheTexture(String str, String str2) {
        MethodCollector.m26663i(1603);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1603);
            return;
        }
        nativeSetRenderCacheTexture(j, str, str2);
        MethodCollector.m26664o(1603);
    }

    public int setVideoQuality(int i, int i2) {
        MethodCollector.m26663i(834);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(834);
            return -100000;
        }
        int nativeSetVideoQuality = nativeSetVideoQuality(j, i, i2);
        MethodCollector.m26664o(834);
        return nativeSetVideoQuality;
    }

    public int tryRestore(int i, String str) {
        MethodCollector.m26663i(605);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(605);
            return -100000;
        }
        int nativeTryRestore = nativeTryRestore(j, i, str);
        MethodCollector.m26664o(605);
        return nativeTryRestore;
    }

    public void updateAlgorithmRuntimeParam(int i, float f) {
        MethodCollector.m26663i(165);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(165);
            return;
        }
        nativeUpdateAlgorithmRuntimeParam(j, i, f);
        MethodCollector.m26664o(165);
    }

    public boolean addMetadata(String str, String str2) {
        MethodCollector.m26663i(1323);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "recorder add metadata failed, no env...");
            MethodCollector.m26664o(1323);
            return false;
        } else if (nativeAddMetadata(j, str, str2) == 0) {
            MethodCollector.m26664o(1323);
            return true;
        } else {
            MethodCollector.m26664o(1323);
            return false;
        }
    }

    public synchronized int animateImageToPreview(String str, String str2) {
        MethodCollector.m26663i(1941);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1941);
            return -100000;
        }
        int nativeAnimateImageToPreview = nativeAnimateImageToPreview(this.mHandler, str, str2, C29987b.m60521a(str2));
        MethodCollector.m26664o(1941);
        return nativeAnimateImageToPreview;
    }

    public int appendComposerNodes(String[] strArr, int i) {
        MethodCollector.m26663i(1823);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1823);
            return -100000;
        }
        int nativeAppendComposerNodes = nativeAppendComposerNodes(j, strArr, i);
        MethodCollector.m26664o(1823);
        return nativeAppendComposerNodes;
    }

    public int[] checkComposerNodeExclusion(String str, String str2) {
        MethodCollector.m26663i(1928);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            int[] iArr = {-1, 0};
            MethodCollector.m26664o(1928);
            return iArr;
        }
        int[] nativeCheckComposerNodeExclusion = nativeCheckComposerNodeExclusion(j, str, null, str2);
        MethodCollector.m26664o(1928);
        return nativeCheckComposerNodeExclusion;
    }

    public void enableAudioLoudnessBalanceFilter(boolean z, double d) {
        MethodCollector.m26663i(2803);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2803);
            return;
        }
        nativeEnableAudioLoudnessBalanceFilter(j, z, d);
        MethodCollector.m26664o(2803);
    }

    public void enableScan(boolean z, long j) {
        MethodCollector.m26663i(1438);
        long j2 = this.mHandler;
        if (j2 == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1438);
            return;
        }
        nativeEnableScan(j2, z, j);
        MethodCollector.m26664o(1438);
    }

    public float getComposerNodeValue(String str, String str2) {
        MethodCollector.m26663i(1915);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1915);
            return -100000.0f;
        }
        float nativeGetComposerNodeValue = nativeGetComposerNodeValue(j, str, str2);
        MethodCollector.m26664o(1915);
        return nativeGetComposerNodeValue;
    }

    public void handleEffectAudio(boolean z, long j) {
        MethodCollector.m26663i(788);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(788);
            return;
        }
        if (isRenderReady()) {
            nativeHandleEffectAudio(this.mHandler, z, j);
        }
        MethodCollector.m26664o(788);
    }

    public void onNativeCallback_InitHardEncoderRet(int i, int i2) {
        C85315al.m146637a("RecordInvoker", "onInitHardEncoderRet");
        C85315al.m146637a("RecordInvoker", "isCPUEncode = ".concat(String.valueOf(i)));
        AbstractC30012b bVar = this.mNativeInitListener;
        if (bVar != null) {
            bVar.mo52866a(i, i2);
        }
        AbstractC30012b bVar2 = sNativeInitListener;
        if (bVar2 != null) {
            bVar2.mo52866a(i, i2);
        }
    }

    public synchronized void onNativeCallback_onShotScreen(int i, long j) {
        MethodCollector.m26663i(1305);
        C85315al.m146639b("RecordInvoker", "onNativeCallback_onShotScreen: ret = " + i + ", timeStamp = " + j);
        this.mIsDuringScreenshot = false;
        C29983a.AbstractC29986c cVar = this.mShotScreenCallback;
        if (cVar != null) {
            cVar.mo52800a(i);
        }
        MethodCollector.m26664o(1305);
    }

    public int processTouchEvent(float f, float f2) {
        MethodCollector.m26663i(723);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(723);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(723);
            return -100001;
        } else {
            int nativeProcessTouchEvent = nativeProcessTouchEvent(this.mHandler, f, f2);
            MethodCollector.m26664o(723);
            return nativeProcessTouchEvent;
        }
    }

    public int reloadComposerNodes(String[] strArr, int i) {
        MethodCollector.m26663i(1814);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1814);
            return -100000;
        }
        int nativeReloadComposerNodes = nativeReloadComposerNodes(j, strArr, i);
        MethodCollector.m26664o(1814);
        return nativeReloadComposerNodes;
    }

    public int removeComposerNodes(String[] strArr, int i) {
        MethodCollector.m26663i(1901);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1901);
            return -100000;
        }
        int nativeRemoveComposerNodes = nativeRemoveComposerNodes(j, strArr, i);
        MethodCollector.m26664o(1901);
        return nativeRemoveComposerNodes;
    }

    public int removeTrack(int i, int i2) {
        MethodCollector.m26663i(1108);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1108);
            return -108;
        }
        int nativeRemoveTrack = nativeRemoveTrack(j, i, i2);
        MethodCollector.m26664o(1108);
        return nativeRemoveTrack;
    }

    public int setAlgorithmPreConfig(int i, int i2) {
        MethodCollector.m26663i(1800);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1800);
            return -100000;
        }
        int nativeSetAlgorithmPreConfig = nativeSetAlgorithmPreConfig(j, i, i2);
        MethodCollector.m26664o(1800);
        return nativeSetAlgorithmPreConfig;
    }

    public int setBeautyFace(int i, String str) {
        MethodCollector.m26663i(44);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(44);
            return -100000;
        }
        int nativeSetBeautyFace = nativeSetBeautyFace(j, i, str);
        MethodCollector.m26664o(44);
        return nativeSetBeautyFace;
    }

    public int setBeautyFaceIntensity(float f, float f2) {
        MethodCollector.m26663i(47);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(47);
            return -100000;
        }
        int nativeSetBeautyFaceIntensity = nativeSetBeautyFaceIntensity(j, f, f2);
        MethodCollector.m26664o(47);
        return nativeSetBeautyFaceIntensity;
    }

    public int setComposerMode(int i, int i2) {
        MethodCollector.m26663i(1811);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1811);
            return -100000;
        }
        int nativeSetComposerMode = nativeSetComposerMode(j, i, i2);
        MethodCollector.m26664o(1811);
        return nativeSetComposerMode;
    }

    public int setComposerNodes(String[] strArr, int i) {
        MethodCollector.m26663i(1687);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1687);
            return -100000;
        }
        int nativeSetComposerNodes = nativeSetComposerNodes(j, strArr, i);
        MethodCollector.m26664o(1687);
        return nativeSetComposerNodes;
    }

    public void setDeviceRotation(float[] fArr, double d) {
        MethodCollector.m26663i(2992);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(2992);
            return;
        }
        if (isRenderReady()) {
            nativeSetDeviceRotationWithStamp(this.mHandler, fArr, d);
        }
        MethodCollector.m26664o(2992);
    }

    public int setEnableAEC(boolean z, String str) {
        MethodCollector.m26663i(2131);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2131);
            return -100000;
        }
        int nativeSetEnableAEC = nativeSetEnableAEC(j, z, str);
        MethodCollector.m26664o(2131);
        return nativeSetEnableAEC;
    }

    public int setIntensityByType(int i, float f) {
        MethodCollector.m26663i(674);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(674);
            return -100000;
        }
        int nativeSetIntensityByType = nativeSetIntensityByType(j, i, f);
        MethodCollector.m26664o(674);
        return nativeSetIntensityByType;
    }

    public int setLoudness(boolean z, int i) {
        MethodCollector.m26663i(2141);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2141);
            return -100000;
        }
        int nativeSetLoudness = nativeSetLoudness(j, z, i);
        MethodCollector.m26664o(2141);
        return nativeSetLoudness;
    }

    public int setSafeArea(int i, VESafeAreaParams[] vESafeAreaParamsArr) {
        MethodCollector.m26663i(2795);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "set safearea invalid handle");
            MethodCollector.m26664o(2795);
            return -100000;
        } else if (vESafeAreaParamsArr == null) {
            int nativeSetSafeArea = nativeSetSafeArea(j, i, null, 0);
            MethodCollector.m26664o(2795);
            return nativeSetSafeArea;
        } else {
            int nativeSetSafeArea2 = nativeSetSafeArea(j, i, vESafeAreaParamsArr, vESafeAreaParamsArr.length);
            MethodCollector.m26664o(2795);
            return nativeSetSafeArea2;
        }
    }

    public int slamProcessDoubleClickEvent(float f, float f2) {
        MethodCollector.m26663i(746);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(746);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(746);
            return -100001;
        } else {
            int nativeSlamProcessDoubleClickEvent = nativeSlamProcessDoubleClickEvent(this.mHandler, f, f2);
            MethodCollector.m26664o(746);
            return nativeSlamProcessDoubleClickEvent;
        }
    }

    public int slamProcessIngestOri(double[] dArr, double d) {
        MethodCollector.m26663i(710);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(710);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(710);
            return -100001;
        } else {
            int nativeSlamProcessIngestOri = nativeSlamProcessIngestOri(this.mHandler, dArr, d);
            MethodCollector.m26664o(710);
            return nativeSlamProcessIngestOri;
        }
    }

    public int slamProcessRotationEvent(float f, float f2) {
        MethodCollector.m26663i(743);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(743);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(743);
            return -100001;
        } else {
            int nativeSlamProcessRotationEvent = nativeSlamProcessRotationEvent(this.mHandler, f, f2);
            MethodCollector.m26664o(743);
            return nativeSlamProcessRotationEvent;
        }
    }

    public int slamProcessScaleEvent(float f, float f2) {
        MethodCollector.m26663i(736);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(736);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(736);
            return -100001;
        } else {
            int nativeSlamProcessScaleEvent = nativeSlamProcessScaleEvent(this.mHandler, f, f2);
            MethodCollector.m26664o(736);
            return nativeSlamProcessScaleEvent;
        }
    }

    public int slamProcessTouchEvent(float f, float f2) {
        MethodCollector.m26663i(719);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(719);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(719);
            return -100001;
        } else {
            int nativeSlamProcessTouchEvent = nativeSlamProcessTouchEvent(this.mHandler, f, f2);
            MethodCollector.m26664o(719);
            return nativeSlamProcessTouchEvent;
        }
    }

    public boolean suspendGestureRecognizer(EnumC85306ad adVar, boolean z) {
        int ordinal;
        MethodCollector.m26663i(2038);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2038);
            return false;
        }
        if (adVar.ordinal() == EnumC85306ad.ANY_SUPPORTED.ordinal()) {
            ordinal = -1;
        } else {
            ordinal = adVar.ordinal();
        }
        boolean nativeSuspendGestureRecognizer = nativeSuspendGestureRecognizer(this.mHandler, ordinal, z);
        MethodCollector.m26664o(2038);
        return nativeSuspendGestureRecognizer;
    }

    public boolean processTouchEvent(C85392bf bfVar, int i) {
        MethodCollector.m26663i(2026);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2026);
            return false;
        }
        boolean nativeProcessTouchEvent2 = nativeProcessTouchEvent2(j, bfVar.f191160a, bfVar.f191162c, bfVar.f191163d, bfVar.f191164e, bfVar.f191165f, bfVar.f191161b.ordinal(), i);
        MethodCollector.m26664o(2026);
        return nativeProcessTouchEvent2;
    }

    public void setLensParams(VEBaseRecorderLensParams vEBaseRecorderLensParams, OnLensResultCallback onLensResultCallback) {
        MethodCollector.m26663i(2721);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2721);
            return;
        }
        int i = vEBaseRecorderLensParams.algorithmFlag;
        if (i == 21) {
            nativeSetTaintSceneDetectParams(this.mHandler, (VETaintSceneDetectParams) vEBaseRecorderLensParams, onLensResultCallback);
            MethodCollector.m26664o(2721);
        } else if (i == 24) {
            nativeSetAdaptiveSharpenParams(this.mHandler, (VEAdaptiveSharpenParams) vEBaseRecorderLensParams, onLensResultCallback);
            MethodCollector.m26664o(2721);
        } else if (i != 27) {
            MethodCollector.m26664o(2721);
        } else {
            nativeSetLumaDetectParams(this.mHandler, (VELumaDetectParams) vEBaseRecorderLensParams, onLensResultCallback);
            MethodCollector.m26664o(2721);
        }
    }

    public int onDrawFrame(ImageFrame imageFrame, boolean z) {
        MethodCollector.m26663i(772);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(772);
            return -100000;
        }
        if (imageFrame.getBuf() != null) {
            nativeOnDrawFrameBuffer(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, imageFrame.getWidth(), imageFrame.getHeight(), z);
        } else {
            int i = Build.VERSION.SDK_INT;
            if (imageFrame.getFormat() == -2) {
                int[][] iArr = (int[][]) Array.newInstance(int.class, 3, 3);
                ByteBuffer[] byteBufferArr = new ByteBuffer[3];
                if (new C30007g(imageFrame).mo52833a(iArr, byteBufferArr)) {
                    int nativeOnDrawFrameBuffer2 = nativeOnDrawFrameBuffer2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), z);
                    MethodCollector.m26664o(772);
                    return nativeOnDrawFrameBuffer2;
                }
            }
        }
        MethodCollector.m26664o(772);
        return -1;
    }

    public static void onNativeCallback_onMonitorLogFloat(String str, String str2, float f) {
        C30695h.m63068a(str, str2, f);
    }

    public static void onNativeCallback_onMonitorLogInt(String str, String str2, int i) {
        C30695h.m63069a(str, str2, (long) i);
    }

    public void onNativeCallback_encodeData(byte[] bArr, int i, boolean z) {
        AbstractC29982b bVar = this.mEncoderCaller;
        if (bVar != null) {
            bVar.onEncoderData(bArr, i, z);
        }
    }

    public int initAudioPlayer(Context context, String str, long j) {
        return initAudioPlayer(context, str, j, false, false);
    }

    public int onNativeCallback_encodeTexture(int i, int i2, boolean z) {
        AbstractC29982b bVar = this.mEncoderCaller;
        if (bVar != null) {
            return bVar.onEncoderData(i, i2, 0, z);
        }
        return 0;
    }

    public void initFaceBeautifyDetectExtParam(boolean z, boolean z2, boolean z3) {
        MethodCollector.m26663i(BuildConfig.VERSION_CODE);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(BuildConfig.VERSION_CODE);
            return;
        }
        nativeInitFaceBeautifyDetectExtParam(j, z, z2, z3);
        MethodCollector.m26664o(BuildConfig.VERSION_CODE);
    }

    public void initFaceDetectExtParam(int i, boolean z, boolean z2) {
        MethodCollector.m26663i(168);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(168);
            return;
        }
        nativeInitFaceDetectExtParam(j, i, z, z2);
        MethodCollector.m26664o(168);
    }

    public void initHandDetectExtParam(int i, int i2, int i3) {
        MethodCollector.m26663i(170);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(170);
            return;
        }
        nativeInitHandDetectExtParam(j, i, i2, i3);
        MethodCollector.m26664o(170);
    }

    public void initReaction(Context context, String str, String str2) {
        MethodCollector.m26663i(2591);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2591);
            return;
        }
        nativeInitReaction(j, str);
        MethodCollector.m26664o(2591);
    }

    public int initWavFile(int i, int i2, double d) {
        MethodCollector.m26663i(1132);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1132);
            return -100000;
        }
        int nativeInitWavFile = nativeInitWavFile(j, i, i2, d);
        MethodCollector.m26664o(1132);
        return nativeInitWavFile;
    }

    public int onDrawFrame(int i, float[] fArr, boolean z) {
        MethodCollector.m26663i(659);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(659);
            return -100000;
        }
        int nativeOnFrameAvailable = nativeOnFrameAvailable(j, i, fArr, z);
        MethodCollector.m26664o(659);
        return nativeOnFrameAvailable;
    }

    public void setCaptureResize(boolean z, int[] iArr, int[] iArr2) {
        MethodCollector.m26663i(2494);
        setCaptureResize(this.mHandler, z, iArr, iArr2);
        MethodCollector.m26664o(2494);
    }

    public int setFilter(String str, String str2, float f) {
        MethodCollector.m26663i(3000);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(3000);
            return -100000;
        }
        int nativeSetFilter = nativeSetFilter(j, str, str2, f);
        MethodCollector.m26664o(3000);
        return nativeSetFilter;
    }

    public void setPreviewSizeRatio(float f, int i, int i2) {
        MethodCollector.m26663i(656);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(656);
            return;
        }
        nativeSetPreviewSizeRatio(j, f, i, i2);
        MethodCollector.m26664o(656);
    }

    public int setSticker(Bitmap bitmap, int i, int i2) {
        MethodCollector.m26663i(1993);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1993);
            return -100000;
        }
        int nativeSetSticker = nativeSetSticker(j, bitmap, i, i2);
        MethodCollector.m26664o(1993);
        return nativeSetSticker;
    }

    public int startPrePlay(boolean z, int i, boolean z2) {
        MethodCollector.m26663i(607);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(607);
            return -100000;
        }
        int nativeStartPrePlay = nativeStartPrePlay(j, z, i, z2);
        MethodCollector.m26664o(607);
        return nativeStartPrePlay;
    }

    public void updateRotation(float f, float f2, float f3) {
        MethodCollector.m26663i(2986);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2986);
            return;
        }
        nativeUpdateRotation(j, f, f2, f3);
        MethodCollector.m26664o(2986);
    }

    public int bindEffectAudioProcessor(int i, int i2, boolean z) {
        MethodCollector.m26663i(1478);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1478);
            return -100000;
        }
        int nativeBindEffectAudioProcessor = nativeBindEffectAudioProcessor(j, i, i2, z);
        MethodCollector.m26664o(1478);
        return nativeBindEffectAudioProcessor;
    }

    public void enableAudioAlgorithmParam(boolean z, String str, String str2) {
        MethodCollector.m26663i(2801);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2801);
            return;
        }
        nativeEnableAudioAlgorithmParam(j, z, str, str2);
        MethodCollector.m26664o(2801);
    }

    public void enableBachAlgorithm(boolean z, String str, String str2) {
        MethodCollector.m26663i(2875);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2875);
            return;
        }
        nativeEnableBachAlgorithm(j, z, str, str2);
        MethodCollector.m26664o(2875);
    }

    public void recoverCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
        MethodCollector.m26663i(1465);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1465);
            return;
        }
        nativeRecoverCherEffect(j, strArr, dArr, zArr);
        MethodCollector.m26664o(1465);
    }

    public int seekTrack(int i, int i2, long j) {
        MethodCollector.m26663i(1110);
        long j2 = this.mHandler;
        if (j2 == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1110);
            return -108;
        }
        int nativeSeekTrack = nativeSeekTrack(j2, i, i2, j);
        MethodCollector.m26664o(1110);
        return nativeSeekTrack;
    }

    public int setExternalFaceMakeupOpacity(String str, float f, float f2) {
        MethodCollector.m26663i(2514);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(2514);
            return -100000;
        }
        int natvieSetExternalFaceMakeupOpacity = natvieSetExternalFaceMakeupOpacity(j, str, f, f2);
        MethodCollector.m26664o(2514);
        return natvieSetExternalFaceMakeupOpacity;
    }

    public int setFrameCallback(OnFrameCallback onFrameCallback, boolean z, int i) {
        MethodCollector.m26663i(2019);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2019);
            return -100000;
        }
        try {
            int nativeSetFrameCallback = nativeSetFrameCallback(j, onFrameCallback, z, i);
            MethodCollector.m26664o(2019);
            return nativeSetFrameCallback;
        } catch (Throwable unused) {
            MethodCollector.m26664o(2019);
            return -1;
        }
    }

    public synchronized int setMusicTime(long j, long j2, long j3) {
        MethodCollector.m26663i(647);
        long j4 = this.mHandler;
        if (j4 == 0) {
            MethodCollector.m26664o(647);
            return -100000;
        }
        int nativeSetMusicTime = nativeSetMusicTime(j4, j, j2, j3);
        MethodCollector.m26664o(647);
        return nativeSetMusicTime;
    }

    public int setReshape(String str, float f, float f2) {
        MethodCollector.m26663i(51);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(51);
            return -100000;
        }
        int nativeSetReshape = nativeSetReshape(j, str, f, f2);
        MethodCollector.m26664o(51);
        return nativeSetReshape;
    }

    public int updateComposerNode(String str, String str2, float f) {
        MethodCollector.m26663i(1694);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1694);
            return -100000;
        }
        int nativeUpdateComposerNode = nativeUpdateComposerNode(j, str, str2, f);
        MethodCollector.m26664o(1694);
        return nativeUpdateComposerNode;
    }

    public void updateRotation(int i, boolean z, boolean z2) {
        MethodCollector.m26663i(660);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(660);
            return;
        }
        nativeUpdateRotationAndFront(j, i, z, z2);
        MethodCollector.m26664o(660);
    }

    public int addPCMData(byte[] bArr, int i, long j) {
        MethodCollector.m26663i(1145);
        long j2 = 0;
        if (this.mHandler == 0) {
            MethodCollector.m26664o(1145);
            return -100000;
        }
        if (j != 0) {
            long nanoTime = System.nanoTime() / 1000;
            j2 = nanoTime - j;
            C85315al.m146639b("RecordInvoker", "nativeAddPCMData: delay = " + j2 + ", sysTime = " + nanoTime);
        }
        int nativeAddPCMData = nativeAddPCMData(this.mHandler, bArr, i, j2);
        MethodCollector.m26664o(1145);
        return nativeAddPCMData;
    }

    public int[] checkComposerNodeExclusion(String str, String str2, String str3) {
        MethodCollector.m26663i(1935);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            int[] iArr = {-1, 0};
            MethodCollector.m26664o(1935);
            return iArr;
        }
        int[] nativeCheckComposerNodeExclusion = nativeCheckComposerNodeExclusion(j, str, str2, str3);
        MethodCollector.m26664o(1935);
        return nativeCheckComposerNodeExclusion;
    }

    public void onFirstFrameRenderInfo(int i, int i2, double d) {
        if (i == 0) {
            double d2 = (double) C30015a.f71627a;
            Double.isNaN(d2);
            C30695h.m63061a(0, "te_preview_first_frame_screen_time", d - d2);
            StringBuilder sb = new StringBuilder("Camera Preview First Frame Cost: ");
            double d3 = (double) C30015a.f71627a;
            Double.isNaN(d3);
            C85315al.m146637a("RecordInvoker", sb.append(d - d3).toString());
        } else if (i == 1) {
            double d4 = (double) C30015a.f71628b;
            Double.isNaN(d4);
            C30695h.m63061a(0, "te_preview_switch_camera_screen_time", d - d4);
            double d5 = (double) C30015a.f71628b;
            Double.isNaN(d5);
            Double.valueOf(d - d5);
        }
    }

    public int setFaceMakeUp(String str, float f, float f2) {
        MethodCollector.m26663i(57);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(57);
            return -100000;
        }
        int nativeSetFaceMakeUp = nativeSetFaceMakeUp(j, str, f, f2);
        MethodCollector.m26664o(57);
        return nativeSetFaceMakeUp;
    }

    public int onDrawFrame(ImageFrame imageFrame, int i, boolean z) {
        MethodCollector.m26663i(798);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(798);
            return -100000;
        }
        if (imageFrame.getBuf() != null) {
            nativeOnDrawFrameBuffer3(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, imageFrame.getWidth(), imageFrame.getHeight(), i, z);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            if (imageFrame.getFormat() == -2) {
                int[][] iArr = (int[][]) Array.newInstance(int.class, 3, 3);
                ByteBuffer[] byteBufferArr = new ByteBuffer[3];
                if (new C30007g(imageFrame).mo52833a(iArr, byteBufferArr)) {
                    int nativeOnDrawFrameBuffer4 = nativeOnDrawFrameBuffer4(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), i, z);
                    MethodCollector.m26664o(798);
                    return nativeOnDrawFrameBuffer4;
                }
            }
        }
        MethodCollector.m26664o(798);
        return -1;
    }

    public void sendEffectMsg(int i, long j, long j2, String str) {
        sendEffectMsg(i, j, j2, str, false);
    }

    public int slamSetTextBitmapResult(Bitmap bitmap, int i, int i2, int i3) {
        if (this.mHandler == 0) {
            return -100000;
        }
        return 0;
    }

    public void setReactionPosMargin(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(2876);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2876);
            return;
        }
        nativeSetReactionPosMargin(j, i, i2, i3, i4);
        MethodCollector.m26664o(2876);
    }

    public int[] updateReactionCameraPos(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(2732);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2732);
            return null;
        }
        int[] nativeUpdateReactionCameraPos = nativeUpdateReactionCameraPos(j, i, i2, i3, i4);
        MethodCollector.m26664o(2732);
        return nativeUpdateReactionCameraPos;
    }

    public int addTrack(int i, String str, long j, long j2) {
        MethodCollector.m26663i(1102);
        long j3 = this.mHandler;
        if (j3 == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1102);
            return -108;
        }
        int nativeAddTrack = nativeAddTrack(j3, i, str, j, j2);
        MethodCollector.m26664o(1102);
        return nativeAddTrack;
    }

    public synchronized int animateImagesToPreview(String[] strArr, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2) {
        MethodCollector.m26663i(1944);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1944);
            return -100000;
        }
        int nativeAnimateImagesToPreview = nativeAnimateImagesToPreview(j, strArr, byteBufferArr, iArr, iArr2);
        MethodCollector.m26664o(1944);
        return nativeAnimateImagesToPreview;
    }

    public void clearDisplayColor(float f, float f2, float f3, float f4) {
        MethodCollector.m26663i(2230);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "clearDisplayColor failed, no native layer");
            MethodCollector.m26664o(2230);
            return;
        }
        nativeClearDisplayColor(j, f, f2, f3, f4);
        MethodCollector.m26664o(2230);
    }

    public boolean getSmallWindowSnapshot(int i, int i2, Bitmap bitmap, SmallWindowSnapshotListener smallWindowSnapshotListener) {
        MethodCollector.m26663i(1329);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1329);
            return false;
        } else if (nativeGetSmallWindowSnapshot(j, i, i2, bitmap, smallWindowSnapshotListener) == 0) {
            MethodCollector.m26664o(1329);
            return true;
        } else {
            MethodCollector.m26664o(1329);
            return false;
        }
    }

    public int replaceComposerNodes(String[] strArr, int i, String[] strArr2, int i2) {
        MethodCollector.m26663i(1905);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1905);
            return -100000;
        }
        int nativeReplaceComposerNodes = nativeReplaceComposerNodes(j, strArr, i, strArr2, i2);
        MethodCollector.m26664o(1905);
        return nativeReplaceComposerNodes;
    }

    public boolean setEffectAudioManagerCallback(int i, int i2, final boolean z, final AudioManagerCallback audioManagerCallback) {
        MethodCollector.m26663i(1608);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(1608);
            return false;
        }
        if (this.mStyleAudioProxyImpl == null) {
            this.mStyleAudioProxyImpl = new C29972b();
        }
        C29972b bVar = this.mStyleAudioProxyImpl;
        bVar.f71484b = getHandler();
        bVar.f71486d = new WeakReference<>(this);
        boolean nativeSetEffectAudioManagerCallback = nativeSetEffectAudioManagerCallback(this.mHandler, i, i2, new AudioManagerCallback() {
            /* class com.p2082ss.android.medialib.RecordInvoker.C299702 */

            static {
                Covode.recordClassIndex(36405);
            }
        });
        MethodCollector.m26664o(1608);
        return nativeSetEffectAudioManagerCallback;
    }

    public int slamDeviceConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        MethodCollector.m26663i(684);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(684);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(684);
            return -100001;
        } else {
            int nativeSlamDeviceConfig = nativeSlamDeviceConfig(this.mHandler, z, z2, z3, z4);
            MethodCollector.m26664o(684);
            return nativeSlamDeviceConfig;
        }
    }

    public int slamProcessIngestAcc(double d, double d2, double d3, double d4) {
        MethodCollector.m26663i(692);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(692);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(692);
            return -100001;
        } else {
            int nativeSlamProcessIngestAcc = nativeSlamProcessIngestAcc(this.mHandler, d, d2, d3, d4);
            MethodCollector.m26664o(692);
            return nativeSlamProcessIngestAcc;
        }
    }

    public int slamProcessIngestGra(double d, double d2, double d3, double d4) {
        MethodCollector.m26663i(705);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(705);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(705);
            return -100001;
        } else {
            int nativeSlamProcessIngestGra = nativeSlamProcessIngestGra(this.mHandler, d, d2, d3, d4);
            MethodCollector.m26664o(705);
            return nativeSlamProcessIngestGra;
        }
    }

    public int slamProcessIngestGyr(double d, double d2, double d3, double d4) {
        MethodCollector.m26663i(701);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(701);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(701);
            return -100001;
        } else {
            int nativeSlamProcessIngestGyr = nativeSlamProcessIngestGyr(this.mHandler, d, d2, d3, d4);
            MethodCollector.m26664o(701);
            return nativeSlamProcessIngestGyr;
        }
    }

    public int slamProcessTouchEventByType(int i, float f, float f2, int i2) {
        MethodCollector.m26663i(726);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(726);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(726);
            return -100001;
        } else {
            int nativeSlamProcessTouchEventByType = nativeSlamProcessTouchEventByType(this.mHandler, i, f, f2, i2);
            MethodCollector.m26664o(726);
            return nativeSlamProcessTouchEventByType;
        }
    }

    public int slamSetInputText(String str, int i, int i2, String str2) {
        MethodCollector.m26663i(753);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(753);
            return -100000;
        }
        int nativeSetSlamInputText = nativeSetSlamInputText(j, str, i, i2, str2);
        MethodCollector.m26664o(753);
        return nativeSetSlamInputText;
    }

    public int updateMultiComposerNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        MethodCollector.m26663i(1709);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.m26664o(1709);
            return -100000;
        }
        int nativeUpdateMultiComposerNodes = nativeUpdateMultiComposerNodes(j, i, strArr, strArr2, fArr);
        MethodCollector.m26664o(1709);
        return nativeUpdateMultiComposerNodes;
    }

    public int writeFile(ByteBuffer byteBuffer, int i, int i2, int i3) {
        MethodCollector.m26663i(837);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(837);
            return -100000;
        }
        int nativeWriteFile = nativeWriteFile(j, byteBuffer, i, i2, i3);
        MethodCollector.m26664o(837);
        return nativeWriteFile;
    }

    public int concat(String str, String str2, String str3, String str4) {
        MethodCollector.m26663i(988);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(988);
            return -100000;
        }
        int nativeConcat = nativeConcat(j, str, str2, 0, str3, str4, false, -1);
        MethodCollector.m26664o(988);
        return nativeConcat;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public void onMessageReceived(int i, int i2, int i3, String str) {
        MethodCollector.m26663i(2201);
        synchronized (RecordInvoker.class) {
            try {
                MessageCenter.Listener listener = this.mMessageListener;
                if (listener != null) {
                    listener.onMessageReceived(i, i2, i3, str);
                }
                MessageCenter.Listener listener2 = sMessageListener;
                if (listener2 != null) {
                    listener2.onMessageReceived(i, i2, i3, str);
                }
                C85315al.m146639b("RecordInvoker", "msg:" + i + ",arg3:" + str);
                if (i == 72) {
                    try {
                        sendEffectMsg(i, (long) i2, (long) i3, String.valueOf(new JSONObject(str).getDouble("recordRate")), true);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (i == 58) {
                    sendEffectMsg(i, (long) i2, (long) i3, str, true);
                }
            } finally {
                MethodCollector.m26664o(2201);
            }
        }
    }

    public void setBeautyFace(int i, String str, float f, float f2) {
        MethodCollector.m26663i(42);
        C85315al.m146639b("RecordInvoker", "nativeSetBeautyFace: ".concat(String.valueOf(i)));
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(42);
        } else if (i != 3 || C30004e.m60552a(str)) {
            nativeSetBeautyFace(this.mHandler, i, str);
            nativeSetBeautyFaceIntensity(this.mHandler, f, f2);
            MethodCollector.m26664o(42);
        } else {
            nativeSetBeautyFace(this.mHandler, 0, "");
            nativeSetBeautyFaceIntensity(this.mHandler, 0.0f, 0.0f);
            MethodCollector.m26664o(42);
        }
    }

    public int startPlay(Surface surface, String str, int i, int i2) {
        MethodCollector.m26663i(26);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(26);
            return -100000;
        }
        initMessageCenter();
        int nativeStartPlay = nativeStartPlay(this.mHandler, surface, i, i2, str);
        MethodCollector.m26664o(26);
        return nativeStartPlay;
    }

    public int renderPicture(ImageFrame imageFrame, int i, int i2, OnPictureCallbackV2 onPictureCallbackV2) {
        MethodCollector.m26663i(2510);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(2510);
            return -100000;
        } else if (imageFrame.getBuf() != null) {
            int nativeRenderPicture = nativeRenderPicture(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, i, i2, onPictureCallbackV2);
            MethodCollector.m26664o(2510);
            return nativeRenderPicture;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            if (imageFrame.getFormat() == -2) {
                int[][] iArr = (int[][]) Array.newInstance(int.class, 3, 3);
                ByteBuffer[] byteBufferArr = new ByteBuffer[3];
                if (new C30007g(imageFrame).mo52833a(iArr, byteBufferArr)) {
                    int nativeRenderPicture2 = nativeRenderPicture2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), i, i2, onPictureCallbackV2, null);
                    MethodCollector.m26664o(2510);
                    return nativeRenderPicture2;
                }
                MethodCollector.m26664o(2510);
                return -1;
            } else if (imageFrame.getBitmap() != null) {
                int nativeRenderPicture3 = nativeRenderPicture3(this.mHandler, imageFrame.getBitmap(), i, i2, onPictureCallbackV2);
                MethodCollector.m26664o(2510);
                return nativeRenderPicture3;
            } else {
                int nativeRenderPicture4 = nativeRenderPicture(this.mHandler, null, 0, 0, 0, null);
                MethodCollector.m26664o(2510);
                return nativeRenderPicture4;
            }
        }
    }

    public int startPlay(Surface surface, String str, boolean z, int i, int i2) {
        int startPlay = startPlay(surface, str, i, i2);
        if (startPlay == 0 && z) {
            initHardEncoderInAdvance();
        }
        return startPlay;
    }

    public boolean addPipRenderTarget(Surface surface, int i, int i2, Bitmap bitmap, boolean z) {
        MethodCollector.m26663i(1332);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("ae_style", "ae_style, addPipRenderTarget failed, no proxy");
            MethodCollector.m26664o(1332);
            return false;
        } else if (nativeAddPipRenderTargetSurface(j, surface, i, i2, bitmap, z) == 0) {
            MethodCollector.m26664o(1332);
            return true;
        } else {
            MethodCollector.m26664o(1332);
            return false;
        }
    }

    public int initAudioConfig(int i, int i2, int i3, int i4, int i5) {
        MethodCollector.m26663i(1099);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(1099);
            return -100000;
        }
        int nativeInitAudioConfig = nativeInitAudioConfig(j, i, i2, i3, i4, i5);
        MethodCollector.m26664o(1099);
        return nativeInitAudioConfig;
    }

    public void sendEffectMsg(int i, long j, long j2, String str, boolean z) {
        MethodCollector.m26663i(1162);
        long j3 = this.mHandler;
        if (j3 == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1162);
            return;
        }
        nativeSendEffectMsg(j3, i, j, j2, str, z);
        MethodCollector.m26664o(1162);
    }

    public int setFilterNew(String str, String str2, float f, float f2, float f3) {
        MethodCollector.m26663i(3003);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(3003);
            return -100000;
        }
        int nativeSetDoubleFilterNew = nativeSetDoubleFilterNew(j, str, str2, f, f2, f3);
        MethodCollector.m26664o(3003);
        return nativeSetDoubleFilterNew;
    }

    public int slamProcessPanEvent(float f, float f2, float f3, float f4, float f5) {
        MethodCollector.m26663i(731);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(731);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(731);
            return -100001;
        } else {
            int nativeSlamProcessPanEvent = nativeSlamProcessPanEvent(this.mHandler, f, f2, f3, f4, f5);
            MethodCollector.m26664o(731);
            return nativeSlamProcessPanEvent;
        }
    }

    public int startPlay(int i, int i2, String str, int i3, int i4) {
        MethodCollector.m26663i(48);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(48);
            return -100000;
        }
        initMessageCenter();
        int nativeStartPlay2 = nativeStartPlay2(this.mHandler, i, i2, i3, i4, str);
        MethodCollector.m26664o(48);
        return nativeStartPlay2;
    }

    public int[] updateReactionCameraPosWithRotation(int i, int i2, int i3, int i4, float f) {
        MethodCollector.m26663i(2608);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2608);
            return null;
        }
        int[] nativeUpdateReactionCameraPosWithRotation = nativeUpdateReactionCameraPosWithRotation(j, i, i2, i3, i4, f);
        MethodCollector.m26664o(2608);
        return nativeUpdateReactionCameraPosWithRotation;
    }

    public int initAudioPlayer(Context context, String str, long j, boolean z, boolean z2) {
        Pair<Integer, Integer> a;
        int i;
        MethodCollector.m26663i(645);
        PackageManager packageManager = context.getPackageManager();
        boolean z3 = false;
        if (packageManager != null && packageManager.hasSystemFeature("android.hardware.audio.low_latency")) {
            z3 = true;
        }
        C85315al.m146639b("RecordInvoker", "has low latency ? ".concat(String.valueOf(z3)));
        if (z2) {
            a = new Pair<>(0, 0);
        } else {
            a = C29993a.m60538a(context);
        }
        C85315al.m146639b("RecordInvoker", "nativeSampleRate ? " + a.first + " nativeSamleBufferSize? " + a.second);
        boolean equals = "SM-A710F".equals(Build.MODEL);
        synchronized (this) {
            try {
                long j2 = this.mHandler;
                if (j2 == 0) {
                    return -100000;
                }
                int intValue = ((Integer) a.first).intValue();
                int intValue2 = ((Integer) a.second).intValue();
                if (z3) {
                    i = 45;
                } else {
                    i = -1;
                }
                int nativeInitAudioPlayer = nativeInitAudioPlayer(j2, str, intValue, intValue2, j, z, equals, i);
                MethodCollector.m26664o(645);
                return nativeInitAudioPlayer;
            } finally {
                MethodCollector.m26664o(645);
            }
        }
    }

    public int renderPictureToBitmap(ImageFrame imageFrame, int i, int i2, OnPictureCallbackV2 onPictureCallbackV2, Bitmap bitmap) {
        MethodCollector.m26663i(2522);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(2522);
            return -100000;
        } else if (imageFrame.getBuf() != null) {
            int nativeRenderPictureToBitmap = nativeRenderPictureToBitmap(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, imageFrame.getFormat(), imageFrame.width, imageFrame.height, i, i2, onPictureCallbackV2, bitmap);
            MethodCollector.m26664o(2522);
            return nativeRenderPictureToBitmap;
        } else {
            if (imageFrame.getFormat() == -2) {
                int[][] iArr = (int[][]) Array.newInstance(int.class, 3, 3);
                ByteBuffer[] byteBufferArr = new ByteBuffer[3];
                if (new C30007g(imageFrame).mo52833a(iArr, byteBufferArr)) {
                    int nativeRenderPicture2 = nativeRenderPicture2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), i, i2, onPictureCallbackV2, bitmap);
                    MethodCollector.m26664o(2522);
                    return nativeRenderPicture2;
                }
            }
            MethodCollector.m26664o(2522);
            return -1;
        }
    }

    public int getSequencePreviewFrame(int i, int i2, boolean z, int i3, String str, C29983a.AbstractC29984a aVar) {
        MethodCollector.m26663i(2334);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2334);
            return -100000;
        }
        this.mGetTimestampCallback = aVar;
        nativeGetSequencePreviewFrame(j, i, i2, z, i3, str);
        MethodCollector.m26664o(2334);
        return 0;
    }

    public int initBeautyPlay(int i, int i2, String str, int i3, int i4, String str2, int i5) {
        return initBeautyPlay(i, i2, str, i3, i4, str2, i5, false, false, false);
    }

    public int concat(String str, String str2, int i, String str3, String str4, boolean z, int i2) {
        MethodCollector.m26663i(1097);
        synchronized (this) {
            try {
                long j = this.mHandler;
                if (j == 0) {
                    return -100000;
                }
                int nativeConcat = nativeConcat(j, str, str2, i, str3, str4, z, i2);
                MethodCollector.m26664o(1097);
                return nativeConcat;
            } finally {
                MethodCollector.m26664o(1097);
            }
        }
    }

    public void initDuet(String str, float f, float f2, float f3, boolean z, boolean z2, int i) {
        MethodCollector.m26663i(2560);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(2560);
            return;
        }
        nativeInitDuet(j, str, f, f2, f3, z, z2, i);
        MethodCollector.m26664o(2560);
    }

    public synchronized int shotScreen(String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, C29983a.AbstractC29986c cVar, boolean z2) {
        MethodCollector.m26663i(2326);
        if (!this.mIsDuringScreenshot) {
            this.mIsDuringScreenshot = true;
            this.mShotScreenCallback = cVar;
            long j = this.mHandler;
            if (j == 0) {
                MethodCollector.m26664o(2326);
                return -100000;
            }
            int nativeShotScreen = nativeShotScreen(j, str, iArr, z, i, onPictureCallback, z2);
            MethodCollector.m26664o(2326);
            return nativeShotScreen;
        }
        C85315al.m146641c("RecordInvoker", "Last screenshot not complete");
        cVar.mo52800a(-1);
        MethodCollector.m26664o(2326);
        return -1;
    }

    public void setCustomVideoBg(Context context, String str, String str2, String str3, long j, boolean z, boolean z2) {
        boolean z3;
        Pair<Integer, Integer> a;
        int i;
        MethodCollector.m26663i(2884);
        if (this.mHandler == 0) {
            MethodCollector.m26664o(2884);
        } else if (TextUtils.isEmpty(str2)) {
            nativeSetCustomVideoBg(this.mHandler, null, null, null, 0, 0, 0, false, 0);
            MethodCollector.m26664o(2884);
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || !packageManager.hasSystemFeature("android.hardware.audio.low_latency")) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z2) {
                a = new Pair<>(0, 0);
            } else {
                a = C29993a.m60538a(context);
            }
            long j2 = this.mHandler;
            int intValue = ((Integer) a.first).intValue();
            int intValue2 = ((Integer) a.second).intValue();
            if (z3) {
                i = 45;
            } else {
                i = -1;
            }
            nativeSetCustomVideoBg(j2, str, str2, str3, intValue, intValue2, j, z, i);
            MethodCollector.m26664o(2884);
        }
    }

    public Surface onNativeCallback_InitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
        if (this.mEncoderCaller == null) {
            return null;
        }
        C85315al.m146637a("RecordInvoker", "InitHardEncoder");
        return this.mEncoderCaller.onInitHardEncoder(i, i2, i3, i4, i5, i6, z, i7);
    }

    public void setWaterMark(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        MethodCollector.m26663i(84);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(84);
            return;
        }
        nativeSetWaterMark2(j, bitmap, i, i2, i3, i4, i5, i6, i7);
        MethodCollector.m26664o(84);
    }

    public int startRecord(double d, boolean z, float f, int i, int i2, String str, String str2, boolean z2) {
        MethodCollector.m26663i(604);
        int i3 = (int) (4000000.0f * f);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(604);
            return -100000;
        }
        int nativeStartRecord = nativeStartRecord(j, d, z, i3, i, i2, str, str2, z2);
        MethodCollector.m26664o(604);
        return nativeStartRecord;
    }

    public byte[] renderFrameForNightEnhance(int i, int i2, int i3, int i4, String str, String str2, byte[] bArr, boolean z) {
        byte[] bArr2;
        MethodCollector.m26663i(1593);
        long j = this.mHandler;
        byte[] bArr3 = null;
        if (j == 0) {
            C85315al.m146642d("ae_style", "render frame for night enhance failed...");
            MethodCollector.m26664o(1593);
            return null;
        }
        if (z) {
            bArr2 = new byte[(((i * i2) * 3) / 2)];
        } else {
            bArr2 = null;
        }
        boolean nativeRenderFrameForNightEnhance = nativeRenderFrameForNightEnhance(j, i, i2, i3, i4, str, str2, bArr, bArr2, z);
        if (!z || nativeRenderFrameForNightEnhance) {
            bArr3 = bArr2;
        }
        MethodCollector.m26664o(1593);
        return bArr3;
    }

    public void setWaterMark(String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        MethodCollector.m26663i(81);
        long j = this.mHandler;
        if (j == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(81);
            return;
        }
        nativeSetWaterMark(j, strArr, i, i2, i3, i4, i5, i6, i7);
        MethodCollector.m26664o(81);
    }

    public int setStickerPathWithTag(int i, String str, int i2, int i3, String str2, String[] strArr, float[] fArr, boolean z, boolean z2) {
        MethodCollector.m26663i(677);
        if (this.mHandler == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(677);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.m26664o(677);
            return -100001;
        } else {
            int nativeSetStickerPathWithTag = nativeSetStickerPathWithTag(this.mHandler, i, str, i2, i3, str2, strArr, fArr, z, z2);
            MethodCollector.m26664o(677);
            return nativeSetStickerPathWithTag;
        }
    }

    public synchronized int shotHDScreen(String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, C29983a.AbstractC29986c cVar, boolean z2, OnPictureCallback onPictureCallback2, Bitmap bitmap, boolean z3) {
        MethodCollector.m26663i(2332);
        if (!this.mIsDuringScreenshot) {
            this.mIsDuringScreenshot = true;
            this.mShotScreenCallback = cVar;
            long j = this.mHandler;
            if (j == 0) {
                C85315al.m146642d("RecordInvoker", "shot hd screen failed, handle not ready...");
                onNativeCallback_onShotScreen(-1, -1);
                MethodCollector.m26664o(2332);
                return -100000;
            }
            int nativeShotHDScreen = nativeShotHDScreen(j, str, iArr, z, i, onPictureCallback, z2, onPictureCallback2, bitmap, z3);
            if (nativeShotHDScreen != 0) {
                C85315al.m146642d("RecordInvoker", "shot hd screen failed, rect = ".concat(String.valueOf(nativeShotHDScreen)));
                onNativeCallback_onShotScreen(nativeShotHDScreen, 0);
            }
            MethodCollector.m26664o(2332);
            return nativeShotHDScreen;
        }
        C85315al.m146641c("RecordInvoker", "Last screenshot not complete");
        cVar.mo52800a(-1);
        MethodCollector.m26664o(2332);
        return -1;
    }

    public int initBeautyPlay(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z, boolean z2, boolean z3) {
        MethodCollector.m26663i(2283);
        this.mHandler = nativeCreate();
        C29974a.f71490b = 5000;
        synchronized (this) {
            try {
                long j = this.mHandler;
                if (j == 0) {
                    return -100000;
                }
                int nativeInitBeautyPlay = nativeInitBeautyPlay(j, i, i2, str, i3, i4, str2, i5, false, z, z2, z3);
                if (nativeInitBeautyPlay == 0 && Build.MODEL.contains("OPPO R7")) {
                    nativeExpandPreviewAndRecordInterval(this.mHandler, true);
                }
                if (z3) {
                    if (this.mStyleProxyImpl == null) {
                        this.mStyleProxyImpl = new C29973c();
                    }
                    C29973c cVar = this.mStyleProxyImpl;
                    cVar.f71487a = getHandler();
                    cVar.f71488b = new WeakReference<>(this);
                    C85315al.m146637a("RecordInvoker", "[ae_style], attach native layer: " + cVar.f71487a + ", invoker: " + cVar.hashCode());
                }
                MethodCollector.m26664o(2283);
                return nativeInitBeautyPlay;
            } finally {
                MethodCollector.m26664o(2283);
            }
        }
    }

    public void setEnigmaDetectParams(boolean z, float f, float f2, float f3, float f4, boolean z2, int i, long j, int i2, boolean z3, boolean z4, boolean z5) {
        MethodCollector.m26663i(1262);
        long j2 = this.mHandler;
        if (j2 == 0) {
            C85315al.m146642d("RecordInvoker", "invalid handle");
            MethodCollector.m26664o(1262);
            return;
        }
        nativeSetEnigmaDetectParams(j2, z, f, f2, f3, f4, z2, i, j, i2, z3, z4, z5);
        MethodCollector.m26664o(1262);
    }

    public int setDisplaySettings(int i, long j, float f, int i2, int i3, int i4, int i5, float f2, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, int i12) {
        MethodCollector.m26663i(2226);
        long j2 = this.mHandler;
        if (j2 == 0) {
            C85315al.m146642d("RecordInvoker", "setDisplaySettings failed...");
            MethodCollector.m26664o(2226);
            return -100000;
        }
        int nativeSetDisplaySettings = nativeSetDisplaySettings(j2, i, j, f, i2, i3, i4, i5, f2, i6, i7, i8, i9, i10, i11, z, i12);
        MethodCollector.m26664o(2226);
        return nativeSetDisplaySettings;
    }
}
