package com.p2082ss.avframework.effect;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bef.effectsdk.EffectABConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.RoiInfo;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.NativeObject;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.effect.EffectWrapper */
public class EffectWrapper extends NativeObject implements IVideoEffectProcessor {
    private static IEffectEdgeRenderLoga mEffectEdgeLog;
    private AudioDeviceModule.AudioRenderSink mAudioRenderSink;
    public Long mDetectFlag = new Long(0);
    private IVideoEffectProcessor.EffectMsgListener mEffectMsgListener;
    private ExpressionBundleImpl[] mExpressionBundles;
    private IVideoEffectProcessor.ExpressionDetectListener mExpressionListener;
    private TEBundle[] mExpressionTEBundles;
    private IVideoEffectProcessor.FaceDetectListener mFaceListener;
    private int mFrameRate;
    private boolean mFromExtern;
    private IVideoEffectProcessor.IEffectInfoChangeListener mIEffectInfoChangeListener;
    private int mMaxKbps;
    private IVideoEffectProcessor.MicrophoneDetectListener mMicrophoneListener;
    private boolean mValid;

    /* renamed from: com.ss.avframework.effect.EffectWrapper$1 */
    static /* synthetic */ class C856761 {
        static {
            Covode.recordClassIndex(99922);
        }
    }

    /* renamed from: com.ss.avframework.effect.EffectWrapper$IEffectEdgeRenderLoga */
    public interface IEffectEdgeRenderLoga {
        static {
            Covode.recordClassIndex(99925);
        }

        void onEdgeRenderLog(String str, String str2);
    }

    static {
        Covode.recordClassIndex(99921);
    }

    private static String NonNull(String str) {
        return str == null ? "" : str;
    }

    public static native String nativeAlgorithmResultGameSizeCheck(long j);

    private native int nativeAudioStrangeVoiceProcess(Buffer buffer, int i, int i2, int i3, long j);

    public static native int nativeBuildBufferFromString(int i, String str, ByteBuffer byteBuffer);

    private native int nativeComposerAppendNodes(String[] strArr, int i);

    private native int nativeComposerAppendNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerCheckNodeExclusion(String str, String str2, int[] iArr);

    private native int nativeComposerExclusionCompare(String str, String str2, String str3, int[] iArr);

    private native int nativeComposerReloadNodes(String[] strArr, int i);

    private native int nativeComposerReloadNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerRemoveNodes(String[] strArr, int i);

    private native int nativeComposerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    private native int nativeComposerSetMode(int i, int i2);

    private native int nativeComposerSetNodes(String[] strArr, int i);

    private native int nativeComposerSetNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerUpdateNode(String str, String str2, float f);

    private static native int nativeConfigABBooleanValue(String str, boolean z);

    private static native int nativeConfigABFloatValue(String str, float f);

    private static native int nativeConfigABIntValue(String str, int i);

    private static native int nativeConfigABStringValue(String str, String str2);

    private native int nativeConfigEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3);

    private native AlgorithmResult nativeCreateAlgorithmResult();

    private native void nativeCreateEffectWrapper(AudioDeviceModule audioDeviceModule, AudioDeviceModule.AudioRenderSink audioRenderSink, boolean z);

    private native int nativeDetectFaceFromBitMap(Bitmap bitmap);

    private native long nativeEffectNativeHandler();

    private native void nativeEnableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    private native int nativeEnableFindContour(boolean z, String str);

    private native long nativeGetAlgorithmRequirment();

    private native long nativeGetAlgorithmRequirmentParams();

    private native long nativeGetAlgorithmResult(AlgorithmResult algorithmResult, long j);

    private native boolean nativeGetAudioRecognizeStatus();

    private static native String nativeGetEffectVersion();

    private native boolean nativeGetExpressionDetectResult(TEBundle[] tEBundleArr, int i);

    private native float nativeGetFilterIntensity(String str);

    private native int nativeGetMattingResult(ByteBuffer byteBuffer);

    private native String nativeName();

    public static native AlgorithmResult nativeParseParcelBuffer(AlgorithmResult algorithmResult, long j, ByteBuffer byteBuffer, int i, int i2);

    public static native String nativeParseStringFromByteBuffer(int i, ByteBuffer byteBuffer);

    private native int nativePauseEffect();

    public static native int nativePeekParcelSize();

    private native int nativeProcess(int i, int i2, int i3, int i4, long j, Long l, RoiInfo roiInfo, boolean z, int i5, long j2);

    private native void nativeProcessDoubleClickEvent(float f, float f2);

    private native void nativeProcessLongPressEvent(float f, float f2);

    private native void nativeProcessPanEvent(float f, float f2, float f3, float f4, float f5);

    private native void nativeProcessRotationEvent(float f, float f2);

    private native void nativeProcessScaleEvent(float f, float f2);

    private native void nativeProcessTouchDownEvent(float f, float f2, int i);

    private native void nativeProcessTouchEvent(float f, float f2);

    private native void nativeProcessTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2);

    private native void nativeProcessTouchUpEvent(float f, float f2, int i);

    public static native int nativeReadParcel(long j, ByteBuffer byteBuffer);

    private native int nativeRefreshAlgorithmRequirment(long j, long j2);

    private native void nativeReleaseContetDetector();

    private native int nativeRenderCacheBitmap(String str, Bitmap bitmap);

    private native int nativeRenderCacheString(String str, String str2);

    private native int nativeRenderCacheTexture(String str, String str2);

    private native int nativeResumeEffect();

    private native int nativeSendEffectMsg(int i, int i2, int i3, String str);

    private native int nativeSetABLicense(String str);

    private native void nativeSetAlgorithmAB(boolean z);

    private native int nativeSetAlgorithmRequirment(long j);

    private native int nativeSetAssetManager(AssetManager assetManager);

    private native int nativeSetAudioRecognizeDict(String str);

    private native int nativeSetBeautify(String str, float f, float f2);

    private native int nativeSetBeautifyWithSharp(String str, float f, float f2, float f3);

    private native int nativeSetCustomEffectOrientation(String str, int i);

    private native void nativeSetDoubleViewRect(double d, double d2, double d3, double d4);

    private native int nativeSetEffect(String str);

    private native int nativeSetFaceAttribute(boolean z);

    private native int nativeSetFilter(String str, float f, boolean z);

    private native int nativeSetMusicNodeFilePath(String str);

    private native int nativeSetReshape(String str, float f, float f2);

    private native int nativeSetResourceFinder(Object obj);

    private native int nativeSetSendContourInfoType(int i);

    private native int nativeSetTwoFilters(String str, String str2, float f, float f2, float f3, boolean z);

    private native int nativeStartAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3);

    private native int nativeUpdateAudioConfig(String str);

    /* access modifiers changed from: protected */
    public void createEffectAudioSource(AudioDeviceModule audioDeviceModule) {
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int enableMockFace(boolean z) {
        return 0;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setEffect(String str, boolean z) {
        return 0;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int startEffectAudio() {
        return 0;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int stopEffectAudio() {
        return 0;
    }

    /* renamed from: com.ss.avframework.effect.EffectWrapper$AlgorithmResult */
    public static class AlgorithmResult extends NativeObject implements VideoFrame.IExtraData {
        public long mFlags;
        public long mMiniGameResult;
        public long mStRoiInfo;

        static {
            Covode.recordClassIndex(99923);
        }

        public long getMiniGameResult() {
            return this.mMiniGameResult;
        }

        public long mStRoiInfo() {
            return this.mStRoiInfo;
        }

        @Override // com.p2082ss.avframework.buffer.VideoFrame.IExtraData
        public int peekParcelSize() {
            MethodCollector.m26663i(3172);
            int nativePeekParcelSize = EffectWrapper.nativePeekParcelSize();
            MethodCollector.m26664o(3172);
            return nativePeekParcelSize;
        }

        private void setMiniGmeResult(long j) {
            this.mMiniGameResult = j;
        }

        private void setStRoiInfo(long j) {
            this.mStRoiInfo = j;
        }

        @Override // com.p2082ss.avframework.buffer.VideoFrame.IExtraData
        public void releaseExtraData(Object obj) {
            release();
        }

        public AlgorithmResult(long j) {
            setNativeObj(j);
        }

        public static String checkGameSize(long j) {
            MethodCollector.m26663i(3108);
            String nativeAlgorithmResultGameSizeCheck = EffectWrapper.nativeAlgorithmResultGameSizeCheck(j);
            MethodCollector.m26664o(3108);
            return nativeAlgorithmResultGameSizeCheck;
        }

        @Override // com.p2082ss.avframework.buffer.VideoFrame.IExtraData
        public int readParcel(ByteBuffer byteBuffer) {
            MethodCollector.m26663i(3215);
            int nativeReadParcel = EffectWrapper.nativeReadParcel(this.mNativeObj, byteBuffer);
            MethodCollector.m26664o(3215);
            return nativeReadParcel;
        }

        public static int buildBufferFromString(String str, ByteBuffer byteBuffer) {
            MethodCollector.m26663i(3458);
            int nativeBuildBufferFromString = EffectWrapper.nativeBuildBufferFromString(0, str, byteBuffer);
            MethodCollector.m26664o(3458);
            return nativeBuildBufferFromString;
        }

        public static String parseStringFromByteBuffer(int i, ByteBuffer byteBuffer) {
            MethodCollector.m26663i(3488);
            String nativeParseStringFromByteBuffer = EffectWrapper.nativeParseStringFromByteBuffer(i, byteBuffer);
            MethodCollector.m26664o(3488);
            return nativeParseStringFromByteBuffer;
        }

        public static AlgorithmResult parseParcel(int i, int i2, ByteBuffer byteBuffer, AlgorithmResult algorithmResult) {
            long j;
            MethodCollector.m26663i(3217);
            if (algorithmResult == null) {
                j = 0;
            } else {
                j = algorithmResult.mNativeObj;
            }
            AlgorithmResult nativeParseParcelBuffer = EffectWrapper.nativeParseParcelBuffer(algorithmResult, j, byteBuffer, i, i2);
            MethodCollector.m26664o(3217);
            return nativeParseParcelBuffer;
        }
    }

    /* renamed from: com.ss.avframework.effect.EffectWrapper$ExpressionBundleImpl */
    class ExpressionBundleImpl implements IVideoEffectProcessor.ExpressionBundle {
        float age;
        float angry_score;
        float arousal;
        float attractive;
        float blur_score;
        float boy_prob;
        int exp_type;
        float happy_score;
        float illumination;
        float lipstick_prob;
        float mask_prob;
        float mustache_prob;
        float quality;
        float real_face_prob;
        float sad_score;
        float surprise_score;
        float valence;
        float wear_glass_prob;
        float wear_hat_prob;
        float wear_sunglass_prob;

        static {
            Covode.recordClassIndex(99924);
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getAngryScore() {
            return this.angry_score;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getArousal() {
            return this.arousal;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getAttractive() {
            return this.attractive;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getBlurScore() {
            return this.blur_score;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getBoyProb() {
            return this.boy_prob;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getEge() {
            return this.age;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public int getExpressionType() {
            return this.exp_type;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getHappyScore() {
            return this.happy_score;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getIllumination() {
            return this.illumination;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getLipstickProb() {
            return this.lipstick_prob;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getMaskProb() {
            return this.mask_prob;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getMustacheProb() {
            return this.mustache_prob;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getQuality() {
            return this.quality;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getRealFaceProb() {
            return this.real_face_prob;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getSadScore() {
            return this.sad_score;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getSurpriseScore() {
            return this.surprise_score;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getValence() {
            return this.valence;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getWearGlassProb() {
            return this.wear_glass_prob;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getWearHatProb() {
            return this.wear_hat_prob;
        }

        @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getWearSunglassProb() {
            return this.wear_sunglass_prob;
        }

        private ExpressionBundleImpl() {
        }

        /* synthetic */ ExpressionBundleImpl(EffectWrapper effectWrapper, C856761 r2) {
            this();
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public AudioDeviceModule.AudioRenderSink getEffectAudioRender() {
        return this.mAudioRenderSink;
    }

    public int getFrameRate() {
        return this.mFrameRate;
    }

    public int getMaxKbps() {
        return this.mMaxKbps;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public boolean valid() {
        return this.mValid;
    }

    public long getAlgorithmRequirment() {
        MethodCollector.m26663i(3496);
        long nativeGetAlgorithmRequirment = nativeGetAlgorithmRequirment();
        MethodCollector.m26664o(3496);
        return nativeGetAlgorithmRequirment;
    }

    public long getAlgorithmRequirmentParams() {
        MethodCollector.m26663i(3500);
        long nativeGetAlgorithmRequirmentParams = nativeGetAlgorithmRequirmentParams();
        MethodCollector.m26664o(3500);
        return nativeGetAlgorithmRequirmentParams;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public String getEffectVersion() {
        MethodCollector.m26663i(4937);
        String nativeGetEffectVersion = nativeGetEffectVersion();
        MethodCollector.m26664o(4937);
        return nativeGetEffectVersion;
    }

    protected EffectWrapper() {
        if (!checkVersion()) {
            this.mFromExtern = false;
            return;
        }
        throw new AndroidRuntimeException("unsupport");
    }

    public long getEffectNativeHandler() {
        MethodCollector.m26663i(5028);
        if (this.mValid) {
            long nativeEffectNativeHandler = nativeEffectNativeHandler();
            MethodCollector.m26664o(5028);
            return nativeEffectNativeHandler;
        }
        MethodCollector.m26664o(5028);
        return 0;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public boolean isAudioRecognizeAvailable() {
        MethodCollector.m26663i(3992);
        if (!this.mValid) {
            MethodCollector.m26664o(3992);
            return false;
        }
        boolean nativeGetAudioRecognizeStatus = nativeGetAudioRecognizeStatus();
        MethodCollector.m26664o(3992);
        return nativeGetAudioRecognizeStatus;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public String name() {
        MethodCollector.m26663i(4882);
        if (!this.mValid) {
            MethodCollector.m26664o(4882);
            return "Dummy Effect";
        }
        String nativeName = nativeName();
        MethodCollector.m26664o(4882);
        return nativeName;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int pauseEffect() {
        MethodCollector.m26663i(4399);
        if (!this.mValid) {
            MethodCollector.m26664o(4399);
            return 0;
        }
        int nativePauseEffect = nativePauseEffect();
        MethodCollector.m26664o(4399);
        return nativePauseEffect;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void releaseContetDetector() {
        MethodCollector.m26663i(3670);
        if (!this.mValid) {
            MethodCollector.m26664o(3670);
            return;
        }
        nativeReleaseContetDetector();
        MethodCollector.m26664o(3670);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int resumeEffect() {
        MethodCollector.m26663i(4401);
        if (!this.mValid) {
            MethodCollector.m26664o(4401);
            return 0;
        }
        int nativeResumeEffect = nativeResumeEffect();
        MethodCollector.m26664o(4401);
        return nativeResumeEffect;
    }

    private boolean checkVersion() {
        boolean z;
        try {
            String effectVersion = getEffectVersion();
            if (!TextUtils.isEmpty(effectVersion)) {
                z = true;
            } else {
                z = false;
            }
            this.mValid = z;
            if (z) {
                AVLog.ioe("EffectWrapper", "Effect Version:".concat(String.valueOf(effectVersion)));
            }
        } catch (Throwable unused) {
            this.mValid = false;
        }
        return this.mValid;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor, com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(3425);
        mEffectEdgeLog = null;
        IVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mEffectMsgListener;
        if (effectMsgListener != null) {
            VideoEffectUtilsWrapper.removeMessageCenterListener(effectMsgListener);
            this.mEffectMsgListener = null;
        }
        this.mFaceListener = null;
        this.mExpressionListener = null;
        if (!this.mFromExtern) {
            super.release();
        }
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
        if (audioRenderSink != null) {
            audioRenderSink.setQuirks(0);
            this.mAudioRenderSink.setAudioTrack(null);
            this.mAudioRenderSink.release();
            this.mAudioRenderSink = null;
        }
        MethodCollector.m26664o(3425);
    }

    public static void setEffectEdgeLog(IEffectEdgeRenderLoga iEffectEdgeRenderLoga) {
        mEffectEdgeLog = iEffectEdgeRenderLoga;
    }

    public void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
        this.mIEffectInfoChangeListener = iEffectInfoChangeListener;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public void setNativeObj(long j) {
        super.setNativeObj(j);
    }

    public String getEffectABInfo(String str) {
        return EffectABConfig.requestABInfoWithLicense(str);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void setExpressionDetectListener(IVideoEffectProcessor.ExpressionDetectListener expressionDetectListener) {
        if (this.mValid) {
            this.mExpressionListener = expressionDetectListener;
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void setFaceDetectListener(IVideoEffectProcessor.FaceDetectListener faceDetectListener) {
        if (this.mValid) {
            this.mFaceListener = faceDetectListener;
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void setMicrophoneDetectListener(IVideoEffectProcessor.MicrophoneDetectListener microphoneDetectListener) {
        if (this.mValid) {
            this.mMicrophoneListener = microphoneDetectListener;
        }
    }

    public void onMicrophoneDetectResultCallback(float f) {
        IVideoEffectProcessor.MicrophoneDetectListener microphoneDetectListener;
        if (this.mValid && (microphoneDetectListener = this.mMicrophoneListener) != null) {
            microphoneDetectListener.onMicrophoneDetectResultCallback(f);
        }
    }

    public int setAlgorithmRequirment(long j) {
        MethodCollector.m26663i(3491);
        int nativeSetAlgorithmRequirment = nativeSetAlgorithmRequirment(j);
        MethodCollector.m26664o(3491);
        return nativeSetAlgorithmRequirment;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setAssetManager(AssetManager assetManager) {
        MethodCollector.m26663i(3429);
        int nativeSetAssetManager = nativeSetAssetManager(assetManager);
        MethodCollector.m26664o(3429);
        return nativeSetAssetManager;
    }

    public int setAudioEffectConfig(String str) {
        MethodCollector.m26663i(5022);
        int nativeUpdateAudioConfig = nativeUpdateAudioConfig(str);
        MethodCollector.m26664o(5022);
        return nativeUpdateAudioConfig;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setResourceFinder(Object obj) {
        MethodCollector.m26663i(3430);
        int nativeSetResourceFinder = nativeSetResourceFinder(obj);
        MethodCollector.m26664o(3430);
        return nativeSetResourceFinder;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public boolean detectFaceFromBitMap(Bitmap bitmap) {
        MethodCollector.m26663i(3667);
        if (!this.mValid) {
            MethodCollector.m26664o(3667);
            return false;
        } else if (nativeDetectFaceFromBitMap(bitmap) == 0) {
            MethodCollector.m26664o(3667);
            return true;
        } else {
            MethodCollector.m26664o(3667);
            return false;
        }
    }

    public AlgorithmResult getAlgorithmResult(long j) {
        MethodCollector.m26663i(4940);
        AlgorithmResult nativeCreateAlgorithmResult = nativeCreateAlgorithmResult();
        nativeCreateAlgorithmResult.mFlags = nativeGetAlgorithmResult(nativeCreateAlgorithmResult, j);
        MethodCollector.m26664o(4940);
        return nativeCreateAlgorithmResult;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public float getFilterIntensity(String str) {
        MethodCollector.m26663i(3713);
        if (!this.mValid) {
            MethodCollector.m26664o(3713);
            return -1.0f;
        }
        float nativeGetFilterIntensity = nativeGetFilterIntensity(str);
        MethodCollector.m26664o(3713);
        return nativeGetFilterIntensity;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int getMattingResult(ByteBuffer byteBuffer) {
        MethodCollector.m26663i(5015);
        if (!this.mValid) {
            MethodCollector.m26664o(5015);
            return 0;
        }
        int nativeGetMattingResult = nativeGetMattingResult(byteBuffer);
        MethodCollector.m26664o(5015);
        return nativeGetMattingResult;
    }

    public void onFaceDetectResultCallback(int i) {
        if (this.mValid) {
            try {
                IVideoEffectProcessor.FaceDetectListener faceDetectListener = this.mFaceListener;
                if (faceDetectListener != null) {
                    faceDetectListener.onFaceDetectResultCallback(i);
                }
            } catch (Throwable th) {
                AVLog.logToIODevice2(6, "EffectWrapper", "onFaceDetectResultCallback exception. ", th, "EffectWrapper.onFaceDetectResultCallback", 30000);
            }
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void setAlgorithmAB(boolean z) {
        MethodCollector.m26663i(3504);
        if (!this.mValid) {
            MethodCollector.m26664o(3504);
            return;
        }
        nativeSetAlgorithmAB(z);
        MethodCollector.m26664o(3504);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setEffect(String str) {
        MethodCollector.m26663i(3558);
        if (!this.mValid) {
            MethodCollector.m26664o(3558);
            return 0;
        }
        int nativeSetEffect = nativeSetEffect(NonNull(str));
        MethodCollector.m26664o(3558);
        return nativeSetEffect;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setEffectLicense(String str) {
        MethodCollector.m26663i(4993);
        if (str != null) {
            int nativeSetABLicense = nativeSetABLicense(str);
            IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener = this.mIEffectInfoChangeListener;
            if (iEffectInfoChangeListener != null) {
                iEffectInfoChangeListener.onLicenseInfoChange(str, nativeSetABLicense);
            }
        }
        MethodCollector.m26664o(4993);
        return 0;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void setEffectMsgListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        if (this.mValid) {
            IVideoEffectProcessor.EffectMsgListener effectMsgListener2 = this.mEffectMsgListener;
            if (effectMsgListener2 != null) {
                VideoEffectUtilsWrapper.removeMessageCenterListener(effectMsgListener2);
                this.mEffectMsgListener = null;
            }
            if (effectMsgListener != null) {
                this.mEffectMsgListener = effectMsgListener;
                VideoEffectUtilsWrapper.addMessageCenterListener(effectMsgListener);
            }
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setFaceAttribute(boolean z) {
        MethodCollector.m26663i(3508);
        if (!this.mValid) {
            MethodCollector.m26664o(3508);
            return 0;
        }
        int nativeSetFaceAttribute = nativeSetFaceAttribute(z);
        MethodCollector.m26664o(3508);
        return nativeSetFaceAttribute;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void setMusicNodeFilePath(String str) {
        MethodCollector.m26663i(4409);
        if (!this.mValid) {
            MethodCollector.m26664o(4409);
            return;
        }
        nativeSetMusicNodeFilePath(str);
        MethodCollector.m26664o(4409);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setSendContourInfoType(int i) {
        MethodCollector.m26663i(5017);
        if (!this.mValid) {
            MethodCollector.m26664o(5017);
            return -1;
        }
        int nativeSetSendContourInfoType = nativeSetSendContourInfoType(i);
        MethodCollector.m26664o(5017);
        return nativeSetSendContourInfoType;
    }

    protected EffectWrapper(long j) {
        this.mNativeObj = j;
        this.mFromExtern = true;
        if (checkVersion()) {
            createEffectAudioSource(null);
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setAudioRecognizeDict(Map<String, String[]> map) {
        String str;
        MethodCollector.m26663i(4012);
        if (!this.mValid) {
            MethodCollector.m26664o(4012);
            return 0;
        }
        String str2 = "";
        if (map != null) {
            String str3 = str2;
            for (Map.Entry<String, String[]> entry : map.entrySet()) {
                String[] value = entry.getValue();
                for (String str4 : value) {
                    StringBuilder append = new StringBuilder().append(str3);
                    if (str3.isEmpty()) {
                        str = str2;
                    } else {
                        str = ",";
                    }
                    str3 = append.append(str).append(entry.getKey()).append(":").append(str4).toString();
                }
            }
            str2 = str3;
        }
        int nativeSetAudioRecognizeDict = nativeSetAudioRecognizeDict(str2);
        MethodCollector.m26664o(4012);
        return nativeSetAudioRecognizeDict;
    }

    public void onExpressionDetectResultCallback(int i) {
        MethodCollector.m26663i(4878);
        if (!this.mValid) {
            MethodCollector.m26664o(4878);
            return;
        }
        if (this.mExpressionListener != null && i > 0) {
            TEBundle[] tEBundleArr = this.mExpressionTEBundles;
            int i2 = 0;
            if (tEBundleArr != null && tEBundleArr.length < i) {
                for (TEBundle tEBundle : tEBundleArr) {
                    tEBundle.release();
                }
                this.mExpressionTEBundles = null;
            }
            if (this.mExpressionTEBundles == null) {
                this.mExpressionTEBundles = new TEBundle[i];
                int i3 = 0;
                do {
                    this.mExpressionTEBundles[i3] = new TEBundle();
                    i3++;
                } while (i3 < i);
            }
            if (!nativeGetExpressionDetectResult(this.mExpressionTEBundles, i)) {
                MethodCollector.m26664o(4878);
                return;
            }
            ExpressionBundleImpl[] expressionBundleImplArr = this.mExpressionBundles;
            if (expressionBundleImplArr == null || expressionBundleImplArr.length != i) {
                this.mExpressionBundles = new ExpressionBundleImpl[i];
                int i4 = 0;
                do {
                    this.mExpressionBundles[i4] = new ExpressionBundleImpl(this, null);
                    i4++;
                } while (i4 < i);
                do {
                    this.mExpressionBundles[i2].age = (float) this.mExpressionTEBundles[i2].getDouble("age");
                    this.mExpressionBundles[i2].boy_prob = (float) this.mExpressionTEBundles[i2].getDouble("boy_prob");
                    this.mExpressionBundles[i2].attractive = (float) this.mExpressionTEBundles[i2].getDouble("attractive");
                    this.mExpressionBundles[i2].happy_score = (float) this.mExpressionTEBundles[i2].getDouble("happy_score");
                    this.mExpressionBundles[i2].exp_type = this.mExpressionTEBundles[i2].getInt("exp_type");
                    this.mExpressionBundles[i2].real_face_prob = (float) this.mExpressionTEBundles[i2].getDouble("real_face_prob");
                    this.mExpressionBundles[i2].quality = (float) this.mExpressionTEBundles[i2].getDouble("quality");
                    this.mExpressionBundles[i2].arousal = (float) this.mExpressionTEBundles[i2].getDouble("arousal");
                    this.mExpressionBundles[i2].valence = (float) this.mExpressionTEBundles[i2].getDouble("valence");
                    this.mExpressionBundles[i2].sad_score = (float) this.mExpressionTEBundles[i2].getDouble("sad_score");
                    this.mExpressionBundles[i2].angry_score = (float) this.mExpressionTEBundles[i2].getDouble("angry_score");
                    this.mExpressionBundles[i2].surprise_score = (float) this.mExpressionTEBundles[i2].getDouble("surprise_score");
                    this.mExpressionBundles[i2].mask_prob = (float) this.mExpressionTEBundles[i2].getDouble("mask_prob");
                    this.mExpressionBundles[i2].wear_hat_prob = (float) this.mExpressionTEBundles[i2].getDouble("wear_hat_prob");
                    this.mExpressionBundles[i2].mustache_prob = (float) this.mExpressionTEBundles[i2].getDouble("mustache_prob");
                    this.mExpressionBundles[i2].lipstick_prob = (float) this.mExpressionTEBundles[i2].getDouble("lipstick_prob");
                    this.mExpressionBundles[i2].wear_glass_prob = (float) this.mExpressionTEBundles[i2].getDouble("wear_glass_prob");
                    this.mExpressionBundles[i2].wear_sunglass_prob = (float) this.mExpressionTEBundles[i2].getDouble("wear_sunglass_prob");
                    this.mExpressionBundles[i2].blur_score = (float) this.mExpressionTEBundles[i2].getDouble("blur_score");
                    this.mExpressionBundles[i2].illumination = (float) this.mExpressionTEBundles[i2].getDouble("illumination");
                    i2++;
                } while (i2 < i);
                try {
                    this.mExpressionListener.onExpressionDetectResultCallback(this.mExpressionBundles);
                    MethodCollector.m26664o(4878);
                    return;
                } catch (Throwable th) {
                    AVLog.logToIODevice2(6, "EffectWrapper", "onExpressionDetectResultCallback exception. ", th, "EffectWrapper.onExpressionDetectResultCallback", 30000);
                }
            } else {
                do {
                    this.mExpressionBundles[i2].age = (float) this.mExpressionTEBundles[i2].getDouble("age");
                    this.mExpressionBundles[i2].boy_prob = (float) this.mExpressionTEBundles[i2].getDouble("boy_prob");
                    this.mExpressionBundles[i2].attractive = (float) this.mExpressionTEBundles[i2].getDouble("attractive");
                    this.mExpressionBundles[i2].happy_score = (float) this.mExpressionTEBundles[i2].getDouble("happy_score");
                    this.mExpressionBundles[i2].exp_type = this.mExpressionTEBundles[i2].getInt("exp_type");
                    this.mExpressionBundles[i2].real_face_prob = (float) this.mExpressionTEBundles[i2].getDouble("real_face_prob");
                    this.mExpressionBundles[i2].quality = (float) this.mExpressionTEBundles[i2].getDouble("quality");
                    this.mExpressionBundles[i2].arousal = (float) this.mExpressionTEBundles[i2].getDouble("arousal");
                    this.mExpressionBundles[i2].valence = (float) this.mExpressionTEBundles[i2].getDouble("valence");
                    this.mExpressionBundles[i2].sad_score = (float) this.mExpressionTEBundles[i2].getDouble("sad_score");
                    this.mExpressionBundles[i2].angry_score = (float) this.mExpressionTEBundles[i2].getDouble("angry_score");
                    this.mExpressionBundles[i2].surprise_score = (float) this.mExpressionTEBundles[i2].getDouble("surprise_score");
                    this.mExpressionBundles[i2].mask_prob = (float) this.mExpressionTEBundles[i2].getDouble("mask_prob");
                    this.mExpressionBundles[i2].wear_hat_prob = (float) this.mExpressionTEBundles[i2].getDouble("wear_hat_prob");
                    this.mExpressionBundles[i2].mustache_prob = (float) this.mExpressionTEBundles[i2].getDouble("mustache_prob");
                    this.mExpressionBundles[i2].lipstick_prob = (float) this.mExpressionTEBundles[i2].getDouble("lipstick_prob");
                    this.mExpressionBundles[i2].wear_glass_prob = (float) this.mExpressionTEBundles[i2].getDouble("wear_glass_prob");
                    this.mExpressionBundles[i2].wear_sunglass_prob = (float) this.mExpressionTEBundles[i2].getDouble("wear_sunglass_prob");
                    this.mExpressionBundles[i2].blur_score = (float) this.mExpressionTEBundles[i2].getDouble("blur_score");
                    this.mExpressionBundles[i2].illumination = (float) this.mExpressionTEBundles[i2].getDouble("illumination");
                    i2++;
                } while (i2 < i);
                this.mExpressionListener.onExpressionDetectResultCallback(this.mExpressionBundles);
                MethodCollector.m26664o(4878);
                return;
            }
        }
        MethodCollector.m26664o(4878);
    }

    public void setParamsForEdgeRender(int i, int i2) {
        this.mFrameRate = i;
        this.mMaxKbps = i2;
    }

    private static <T> boolean CheckCount(T[] tArr, int i) {
        int length;
        if (tArr == null) {
            length = 0;
        } else {
            length = tArr.length;
        }
        if (i == length) {
            return true;
        }
        return false;
    }

    public void getAlgorithmResult(AlgorithmResult algorithmResult, long j) {
        MethodCollector.m26663i(4942);
        algorithmResult.mFlags = nativeGetAlgorithmResult(algorithmResult, j);
        MethodCollector.m26664o(4942);
    }

    public int refreshAlgorithmRequirment(long j, long j2) {
        MethodCollector.m26663i(3493);
        int nativeRefreshAlgorithmRequirment = nativeRefreshAlgorithmRequirment(j, j2);
        MethodCollector.m26664o(3493);
        return nativeRefreshAlgorithmRequirment;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerSetMode(int i, int i2) {
        MethodCollector.m26663i(4013);
        if (!this.mValid) {
            MethodCollector.m26664o(4013);
            return 0;
        }
        int nativeComposerSetMode = nativeComposerSetMode(i, i2);
        MethodCollector.m26664o(4013);
        return nativeComposerSetMode;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int enableFindContour(boolean z, String str) {
        MethodCollector.m26663i(4408);
        if (!this.mValid) {
            MethodCollector.m26664o(4408);
            return 0;
        }
        int nativeEnableFindContour = nativeEnableFindContour(z, str);
        MethodCollector.m26664o(4408);
        return nativeEnableFindContour;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void processDoubleClickEvent(float f, float f2) {
        MethodCollector.m26663i(4261);
        if (!this.mValid) {
            MethodCollector.m26664o(4261);
            return;
        }
        nativeProcessDoubleClickEvent(f, f2);
        MethodCollector.m26664o(4261);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void processLongPressEvent(float f, float f2) {
        MethodCollector.m26663i(4258);
        if (!this.mValid) {
            MethodCollector.m26664o(4258);
            return;
        }
        nativeProcessLongPressEvent(f, f2);
        MethodCollector.m26664o(4258);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void processRotationEvent(float f, float f2) {
        MethodCollector.m26663i(4397);
        if (!this.mValid) {
            MethodCollector.m26664o(4397);
            return;
        }
        nativeProcessRotationEvent(f, f2);
        MethodCollector.m26664o(4397);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void processScaleEvent(float f, float f2) {
        MethodCollector.m26663i(4394);
        if (!this.mValid) {
            MethodCollector.m26664o(4394);
            return;
        }
        nativeProcessScaleEvent(f, f2);
        MethodCollector.m26664o(4394);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void processTouchEvent(float f, float f2) {
        MethodCollector.m26663i(4145);
        if (!this.mValid) {
            MethodCollector.m26664o(4145);
            return;
        }
        nativeProcessTouchEvent(f, f2);
        MethodCollector.m26664o(4145);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setCustomEffect(String str, String str2) {
        MethodCollector.m26663i(3637);
        if (!this.mValid) {
            MethodCollector.m26664o(3637);
            return 0;
        }
        int nativeRenderCacheTexture = nativeRenderCacheTexture(NonNull(str), NonNull(str2));
        MethodCollector.m26664o(3637);
        return nativeRenderCacheTexture;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setCustomEffectBitmap(String str, Bitmap bitmap) {
        MethodCollector.m26663i(3643);
        if (!this.mValid) {
            MethodCollector.m26664o(3643);
            return 0;
        }
        int nativeRenderCacheBitmap = nativeRenderCacheBitmap(NonNull(str), bitmap);
        MethodCollector.m26664o(3643);
        return nativeRenderCacheBitmap;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setCustomEffectOrientation(String str, int i) {
        MethodCollector.m26663i(3664);
        if (!this.mValid) {
            MethodCollector.m26664o(3664);
            return 0;
        }
        int nativeSetCustomEffectOrientation = nativeSetCustomEffectOrientation(NonNull(str), i);
        MethodCollector.m26664o(3664);
        return nativeSetCustomEffectOrientation;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setFilter(String str, float f) {
        MethodCollector.m26663i(3677);
        if (!this.mValid) {
            MethodCollector.m26664o(3677);
            return 0;
        }
        int nativeSetFilter = nativeSetFilter(NonNull(str), f, false);
        MethodCollector.m26664o(3677);
        return nativeSetFilter;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void setRenderCacheString(String str, String str2) {
        MethodCollector.m26663i(5012);
        if (!this.mValid) {
            MethodCollector.m26664o(5012);
            return;
        }
        nativeRenderCacheString(NonNull(str), NonNull(str2));
        MethodCollector.m26664o(5012);
    }

    public static void onEdgeRenderLog(String str, String str2) {
        IEffectEdgeRenderLoga iEffectEdgeRenderLoga = mEffectEdgeLog;
        if (iEffectEdgeRenderLoga == null) {
            return;
        }
        if (str.equals("live_webrtc_monitor_log")) {
            iEffectEdgeRenderLoga.onEdgeRenderLog(str, str2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            try {
                jSONObject.put("server", str);
                jSONObject.put("mode", "effect");
                iEffectEdgeRenderLoga.onEdgeRenderLog("live_client_monitor_log", jSONObject.toString());
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            AVLog.ioe("EffectWrapper", "exception occurs when change effect log to jsonObject: ".concat(String.valueOf(str2)));
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerAppendNodes(String[] strArr, int i) {
        MethodCollector.m26663i(4038);
        if (!this.mValid) {
            MethodCollector.m26664o(4038);
            return 0;
        } else if (!CheckCount(strArr, i)) {
            MethodCollector.m26664o(4038);
            return -1;
        } else {
            int nativeComposerAppendNodes = nativeComposerAppendNodes(strArr, i);
            MethodCollector.m26664o(4038);
            return nativeComposerAppendNodes;
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerReloadNodes(String[] strArr, int i) {
        MethodCollector.m26663i(4030);
        if (!this.mValid) {
            MethodCollector.m26664o(4030);
            return 0;
        } else if (!CheckCount(strArr, i)) {
            MethodCollector.m26664o(4030);
            return -1;
        } else {
            int nativeComposerReloadNodes = nativeComposerReloadNodes(strArr, i);
            MethodCollector.m26664o(4030);
            return nativeComposerReloadNodes;
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerRemoveNodes(String[] strArr, int i) {
        MethodCollector.m26663i(4039);
        if (!this.mValid) {
            MethodCollector.m26664o(4039);
            return 0;
        } else if (!CheckCount(strArr, i)) {
            MethodCollector.m26664o(4039);
            return -1;
        } else {
            int nativeComposerRemoveNodes = nativeComposerRemoveNodes(strArr, i);
            MethodCollector.m26664o(4039);
            return nativeComposerRemoveNodes;
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerSetNodes(String[] strArr, int i) {
        MethodCollector.m26663i(4019);
        if (!this.mValid) {
            MethodCollector.m26664o(4019);
            return 0;
        } else if (!CheckCount(strArr, i)) {
            MethodCollector.m26664o(4019);
            return -1;
        } else {
            int nativeComposerSetNodes = nativeComposerSetNodes(strArr, i);
            MethodCollector.m26664o(4019);
            return nativeComposerSetNodes;
        }
    }

    public EffectWrapper(AudioDeviceModule audioDeviceModule, boolean z) {
        MethodCollector.m26663i(3422);
        if (checkVersion()) {
            if (audioDeviceModule != null) {
                AudioDeviceModule.AudioRenderSink createRenderSink = audioDeviceModule.createRenderSink();
                this.mAudioRenderSink = createRenderSink;
                createRenderSink.setQuirks(0);
            }
            nativeCreateEffectWrapper(audioDeviceModule, this.mAudioRenderSink, z);
        }
        this.mFromExtern = false;
        MethodCollector.m26664o(3422);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setEffectABInfo(JSONObject jSONObject, String str) {
        String str2;
        MethodCollector.m26663i(4980);
        try {
            JSONArray jSONArray = new JSONArray(EffectABConfig.requestABInfoWithLicense(str));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("key");
                if (jSONObject.has(string)) {
                    int i2 = jSONObject2.getInt("dataType");
                    if (i2 == 0) {
                        int nativeConfigABBooleanValue = nativeConfigABBooleanValue(string, jSONObject.getBoolean(string));
                        IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener = this.mIEffectInfoChangeListener;
                        if (iEffectInfoChangeListener != null) {
                            if (jSONObject.getBoolean(string)) {
                                str2 = "TRUE";
                            } else {
                                str2 = "FALSE";
                            }
                            iEffectInfoChangeListener.onEffectInfoChange(string, str2, 0, nativeConfigABBooleanValue);
                        }
                    } else if (i2 == 1) {
                        int i3 = jSONObject.getInt(string);
                        int nativeConfigABIntValue = nativeConfigABIntValue(string, i3);
                        IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener2 = this.mIEffectInfoChangeListener;
                        if (iEffectInfoChangeListener2 != null) {
                            iEffectInfoChangeListener2.onEffectInfoChange(string, String.valueOf(i3), 1, nativeConfigABIntValue);
                        }
                    } else if (i2 == 2) {
                        float f = (float) jSONObject.getDouble(string);
                        int nativeConfigABFloatValue = nativeConfigABFloatValue(string, f);
                        IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener3 = this.mIEffectInfoChangeListener;
                        if (iEffectInfoChangeListener3 != null) {
                            iEffectInfoChangeListener3.onEffectInfoChange(string, String.valueOf(f), 2, nativeConfigABFloatValue);
                        }
                    } else if (i2 == 3) {
                        String string2 = jSONObject.getString(string);
                        int nativeConfigABStringValue = nativeConfigABStringValue(string, string2);
                        IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener4 = this.mIEffectInfoChangeListener;
                        if (iEffectInfoChangeListener4 != null) {
                            iEffectInfoChangeListener4.onEffectInfoChange(string, string2, 3, nativeConfigABStringValue);
                        }
                    }
                }
            }
            MethodCollector.m26664o(4980);
            return 0;
        } catch (JSONException unused) {
            MethodCollector.m26664o(4980);
            return -1;
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
        MethodCollector.m26663i(4075);
        if (!this.mValid) {
            MethodCollector.m26664o(4075);
            return 0;
        }
        int nativeComposerCheckNodeExclusion = nativeComposerCheckNodeExclusion(str, str2, iArr);
        MethodCollector.m26664o(4075);
        return nativeComposerCheckNodeExclusion;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerUpdateNode(String str, String str2, float f) {
        MethodCollector.m26663i(4025);
        if (!this.mValid) {
            MethodCollector.m26664o(4025);
            return 0;
        }
        int nativeComposerUpdateNode = nativeComposerUpdateNode(NonNull(str), NonNull(str2), f);
        MethodCollector.m26664o(4025);
        return nativeComposerUpdateNode;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void processTouchDownEvent(float f, float f2, int i) {
        MethodCollector.m26663i(4262);
        if (!this.mValid) {
            MethodCollector.m26664o(4262);
            return;
        }
        nativeProcessTouchDownEvent(f, f2, i);
        MethodCollector.m26664o(4262);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void processTouchUpEvent(float f, float f2, int i) {
        MethodCollector.m26663i(4340);
        if (!this.mValid) {
            MethodCollector.m26664o(4340);
            return;
        }
        nativeProcessTouchUpEvent(f, f2, i);
        MethodCollector.m26664o(4340);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setBeautify(String str, float f, float f2) {
        MethodCollector.m26663i(3513);
        if (!this.mValid) {
            MethodCollector.m26664o(3513);
            return 0;
        }
        int nativeSetBeautify = nativeSetBeautify(NonNull(str), f, f2);
        MethodCollector.m26664o(3513);
        return nativeSetBeautify;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setReshape(String str, float f, float f2) {
        MethodCollector.m26663i(3524);
        if (!this.mValid) {
            MethodCollector.m26664o(3524);
            return 0;
        }
        int nativeSetReshape = nativeSetReshape(NonNull(str), f, f2);
        MethodCollector.m26664o(3524);
        return nativeSetReshape;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
        MethodCollector.m26663i(4048);
        if (!this.mValid) {
            MethodCollector.m26664o(4048);
            return 0;
        } else if (!CheckCount(strArr, i) || !CheckCount(strArr2, i)) {
            MethodCollector.m26664o(4048);
            return -1;
        } else {
            int nativeComposerAppendNodesWithTags = nativeComposerAppendNodesWithTags(strArr, i, strArr2);
            MethodCollector.m26664o(4048);
            return nativeComposerAppendNodesWithTags;
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
        MethodCollector.m26663i(4046);
        if (!this.mValid) {
            MethodCollector.m26664o(4046);
            return 0;
        } else if (!CheckCount(strArr, i) || !CheckCount(strArr2, i)) {
            MethodCollector.m26664o(4046);
            return -1;
        } else {
            int nativeComposerReloadNodesWithTags = nativeComposerReloadNodesWithTags(strArr, i, strArr2);
            MethodCollector.m26664o(4046);
            return nativeComposerReloadNodesWithTags;
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
        MethodCollector.m26663i(4045);
        if (!this.mValid) {
            MethodCollector.m26664o(4045);
            return 0;
        } else if (!CheckCount(strArr, i) || !CheckCount(strArr2, i)) {
            MethodCollector.m26664o(4045);
            return -1;
        } else {
            int nativeComposerSetNodesWithTags = nativeComposerSetNodesWithTags(strArr, i, strArr2);
            MethodCollector.m26664o(4045);
            return nativeComposerSetNodesWithTags;
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setFilter(String str, float f, boolean z) {
        MethodCollector.m26663i(3703);
        if (!this.mValid) {
            MethodCollector.m26664o(3703);
            return 0;
        }
        int nativeSetFilter = nativeSetFilter(NonNull(str), f, z);
        MethodCollector.m26664o(3703);
        return nativeSetFilter;
    }

    public int onReceiveEffectMessage(int i, int i2, int i3, String str) {
        if (!this.mValid) {
            return -1;
        }
        return 0;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void setDoubleViewRect(double d, double d2, double d3, double d4) {
        MethodCollector.m26663i(4080);
        if (this.mValid) {
            nativeSetDoubleViewRect(d, d2, d3, d4);
        }
        MethodCollector.m26664o(4080);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerExclusionCompare(String str, String str2, String str3, int[] iArr) {
        MethodCollector.m26663i(4078);
        if (!this.mValid) {
            MethodCollector.m26664o(4078);
            return 0;
        }
        int nativeComposerExclusionCompare = nativeComposerExclusionCompare(str, str2, str3, iArr);
        MethodCollector.m26664o(4078);
        return nativeComposerExclusionCompare;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int sendEffectMsg(int i, int i2, int i3, String str) {
        MethodCollector.m26663i(4403);
        if (!this.mValid) {
            MethodCollector.m26664o(4403);
            return 0;
        }
        int nativeSendEffectMsg = nativeSendEffectMsg(i, i2, i3, NonNull(str));
        MethodCollector.m26664o(4403);
        return nativeSendEffectMsg;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int startAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3) {
        MethodCollector.m26663i(3716);
        if (!this.mValid) {
            MethodCollector.m26664o(3716);
            return 0;
        }
        int nativeStartAudioRecognize = nativeStartAudioRecognize(byteBuffer, i, i2, i3);
        MethodCollector.m26664o(3716);
        return nativeStartAudioRecognize;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setBeautify(String str, float f, float f2, float f3) {
        MethodCollector.m26663i(3519);
        if (!this.mValid) {
            MethodCollector.m26664o(3519);
            return 0;
        }
        int nativeSetBeautifyWithSharp = nativeSetBeautifyWithSharp(NonNull(str), f, f2, f3);
        MethodCollector.m26664o(3519);
        return nativeSetBeautifyWithSharp;
    }

    public int processStrangeVoice(Buffer buffer, int i, int i2, int i3, long j) {
        MethodCollector.m26663i(3413);
        int nativeAudioStrangeVoiceProcess = nativeAudioStrangeVoiceProcess(buffer, i, i2, i3, j);
        MethodCollector.m26664o(3413);
        return nativeAudioStrangeVoiceProcess;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        MethodCollector.m26663i(4254);
        if (!this.mValid) {
            MethodCollector.m26664o(4254);
            return;
        }
        nativeProcessPanEvent(f, f2, f3, f4, f5);
        MethodCollector.m26664o(4254);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        MethodCollector.m26663i(4070);
        if (!this.mValid) {
            MethodCollector.m26664o(4070);
            return 0;
        } else if (!CheckCount(strArr, i) || !CheckCount(strArr2, i2) || !CheckCount(strArr3, i2)) {
            MethodCollector.m26664o(4070);
            return -1;
        } else {
            int nativeComposerReplaceNodesWithTags = nativeComposerReplaceNodesWithTags(strArr, i, strArr2, i2, strArr3);
            MethodCollector.m26664o(4070);
            return nativeComposerReplaceNodesWithTags;
        }
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setFilter(String str, String str2, float f, float f2, float f3) {
        MethodCollector.m26663i(3706);
        if (!this.mValid) {
            MethodCollector.m26664o(3706);
            return 0;
        }
        int nativeSetTwoFilters = nativeSetTwoFilters(NonNull(str), NonNull(str2), f3, f, f2, false);
        MethodCollector.m26664o(3706);
        return nativeSetTwoFilters;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        MethodCollector.m26663i(4725);
        if (!this.mValid) {
            MethodCollector.m26664o(4725);
            return;
        }
        nativeEnableExpressionDetect(z, z2, z3, z4, z5, z6);
        MethodCollector.m26664o(4725);
    }

    public int process(int i, int i2, int i3, int i4, long j, boolean z) {
        MethodCollector.m26663i(4732);
        if (!this.mValid) {
            MethodCollector.m26664o(4732);
            return 0;
        }
        int nativeProcess = nativeProcess(i, i2, i3, i4, j, null, null, z, 0, 0);
        MethodCollector.m26664o(4732);
        return nativeProcess;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int setFilter(String str, String str2, float f, float f2, float f3, boolean z) {
        MethodCollector.m26663i(3707);
        if (!this.mValid) {
            MethodCollector.m26664o(3707);
            return 0;
        }
        int nativeSetTwoFilters = nativeSetTwoFilters(NonNull(str), NonNull(str2), f3, f, f2, z);
        MethodCollector.m26664o(3707);
        return nativeSetTwoFilters;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        MethodCollector.m26663i(4147);
        if (!this.mValid) {
            MethodCollector.m26664o(4147);
            return;
        }
        nativeProcessTouchEventWithTouchType(j, f, f2, f3, f4, i, i2);
        MethodCollector.m26664o(4147);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3) {
        MethodCollector.m26663i(3433);
        if (!this.mValid) {
            MethodCollector.m26664o(3433);
            return;
        }
        nativeConfigEffect(i, i2, NonNull(str), NonNull(str2), z, z2, NonNull(str3));
        MethodCollector.m26664o(3433);
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int process(int i, int i2, int i3, int i4, int i5, long j, boolean z) {
        MethodCollector.m26663i(4828);
        if (!this.mValid) {
            MethodCollector.m26664o(4828);
            return 0;
        }
        int nativeProcess = nativeProcess(i, i2, i3, i4, j, null, null, z, i5, 0);
        MethodCollector.m26664o(4828);
        return nativeProcess;
    }

    public int process(int i, int i2, int i3, int i4, long j, boolean z, long j2) {
        MethodCollector.m26663i(4751);
        if (!this.mValid) {
            MethodCollector.m26664o(4751);
            return 0;
        }
        int nativeProcess = nativeProcess(i, i2, i3, i4, j, null, null, z, 0, 0);
        MethodCollector.m26664o(4751);
        return nativeProcess;
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor
    public int process(int i, int i2, int i3, int i4, int i5, RoiInfo roiInfo, long j, boolean z, long j2) {
        MethodCollector.m26663i(4835);
        if (!this.mValid) {
            MethodCollector.m26664o(4835);
            return 0;
        }
        int nativeProcess = nativeProcess(i, i2, i3, i4, j, null, roiInfo, z, i5, j2);
        MethodCollector.m26664o(4835);
        return nativeProcess;
    }
}
