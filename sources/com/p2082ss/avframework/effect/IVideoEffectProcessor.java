package com.p2082ss.avframework.effect;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.RoiInfo;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.effect.IVideoEffectProcessor */
public interface IVideoEffectProcessor {

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$EffectMsgListener */
    public interface EffectMsgListener {
        static {
            Covode.recordClassIndex(99927);
        }

        void onMessageReceived(int i, int i2, int i3, String str);
    }

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$ExpressionBundle */
    public interface ExpressionBundle {
        static {
            Covode.recordClassIndex(99928);
        }

        float getAngryScore();

        float getArousal();

        float getAttractive();

        float getBlurScore();

        float getBoyProb();

        float getEge();

        int getExpressionType();

        float getHappyScore();

        float getIllumination();

        float getLipstickProb();

        float getMaskProb();

        float getMustacheProb();

        float getQuality();

        float getRealFaceProb();

        float getSadScore();

        float getSurpriseScore();

        float getValence();

        float getWearGlassProb();

        float getWearHatProb();

        float getWearSunglassProb();
    }

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$ExpressionDetectListener */
    public interface ExpressionDetectListener {
        static {
            Covode.recordClassIndex(99929);
        }

        void onExpressionDetectResultCallback(ExpressionBundle[] expressionBundleArr);
    }

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$FaceDetectListener */
    public interface FaceDetectListener {
        static {
            Covode.recordClassIndex(99930);
        }

        void onFaceDetectResultCallback(int i);
    }

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$IEffectInfoChangeListener */
    public interface IEffectInfoChangeListener {
        static {
            Covode.recordClassIndex(99931);
        }

        void onEffectInfoChange(String str, String str2, int i, int i2);

        void onLicenseInfoChange(String str, int i);
    }

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$MicrophoneDetectListener */
    public interface MicrophoneDetectListener {
        static {
            Covode.recordClassIndex(99932);
        }

        void onMicrophoneDetectResultCallback(float f);
    }

    static {
        Covode.recordClassIndex(99926);
    }

    int composerAppendNodes(String[] strArr, int i);

    int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerCheckNodeExclusion(String str, String str2, int[] iArr);

    int composerExclusionCompare(String str, String str2, String str3, int[] iArr);

    int composerReloadNodes(String[] strArr, int i);

    int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerRemoveNodes(String[] strArr, int i);

    int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    int composerSetMode(int i, int i2);

    int composerSetNodes(String[] strArr, int i);

    int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerUpdateNode(String str, String str2, float f);

    void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3);

    boolean detectFaceFromBitMap(Bitmap bitmap);

    void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    int enableFindContour(boolean z, String str);

    int enableMockFace(boolean z);

    AudioDeviceModule.AudioRenderSink getEffectAudioRender();

    String getEffectVersion();

    float getFilterIntensity(String str);

    int getMattingResult(ByteBuffer byteBuffer);

    boolean isAudioRecognizeAvailable();

    String name();

    int pauseEffect();

    int process(int i, int i2, int i3, int i4, int i5, long j, boolean z);

    int process(int i, int i2, int i3, int i4, int i5, RoiInfo roiInfo, long j, boolean z, long j2);

    void processDoubleClickEvent(float f, float f2);

    void processLongPressEvent(float f, float f2);

    void processPanEvent(float f, float f2, float f3, float f4, float f5);

    void processRotationEvent(float f, float f2);

    void processScaleEvent(float f, float f2);

    void processTouchDownEvent(float f, float f2, int i);

    void processTouchEvent(float f, float f2);

    void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2);

    void processTouchUpEvent(float f, float f2, int i);

    void release();

    void releaseContetDetector();

    int resumeEffect();

    int sendEffectMsg(int i, int i2, int i3, String str);

    void setAlgorithmAB(boolean z);

    int setAssetManager(AssetManager assetManager);

    int setAudioRecognizeDict(Map<String, String[]> map);

    int setBeautify(String str, float f, float f2);

    int setBeautify(String str, float f, float f2, float f3);

    int setCustomEffect(String str, String str2);

    int setCustomEffectBitmap(String str, Bitmap bitmap);

    int setCustomEffectOrientation(String str, int i);

    void setDoubleViewRect(double d, double d2, double d3, double d4);

    int setEffect(String str);

    int setEffect(String str, boolean z);

    int setEffectABInfo(JSONObject jSONObject, String str);

    int setEffectLicense(String str);

    void setEffectMsgListener(EffectMsgListener effectMsgListener);

    void setExpressionDetectListener(ExpressionDetectListener expressionDetectListener);

    int setFaceAttribute(boolean z);

    void setFaceDetectListener(FaceDetectListener faceDetectListener);

    int setFilter(String str, float f);

    int setFilter(String str, float f, boolean z);

    int setFilter(String str, String str2, float f, float f2, float f3);

    int setFilter(String str, String str2, float f, float f2, float f3, boolean z);

    void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener);

    void setMusicNodeFilePath(String str);

    void setRenderCacheString(String str, String str2);

    int setReshape(String str, float f, float f2);

    int setResourceFinder(Object obj);

    int setSendContourInfoType(int i);

    int startAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3);

    int startEffectAudio();

    int stopEffectAudio();

    boolean valid();
}
