package com.p2082ss.avframework.livestreamv2.filter;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager */
public interface IFilterManager {

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$ContourDataCallBack */
    public interface ContourDataCallBack {
        static {
            Covode.recordClassIndex(100538);
        }

        void onReceivedLocalData(FindContourInfo findContourInfo);

        void onReceivedRemoteData(FindContourInfo findContourInfo);
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$ContourInfoListener */
    public interface ContourInfoListener {
        static {
            Covode.recordClassIndex(100539);
        }

        void onReceivedData(FindContourInfo findContourInfo, int i, int i2);
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$EffectMsgListener */
    public interface EffectMsgListener extends IVideoEffectProcessor.EffectMsgListener {
        static {
            Covode.recordClassIndex(100540);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$ErrorListener */
    public interface ErrorListener {
        static {
            Covode.recordClassIndex(100541);
        }

        void onError(int i, String str);
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$ExpressionDetectListener */
    public interface ExpressionDetectListener extends IVideoEffectProcessor.ExpressionDetectListener {
        static {
            Covode.recordClassIndex(100542);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$FaceDetectListener */
    public interface FaceDetectListener extends IVideoEffectProcessor.FaceDetectListener {
        static {
            Covode.recordClassIndex(100543);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$FindContourListener */
    public interface FindContourListener {
        static {
            Covode.recordClassIndex(100544);
        }

        void onSendFindContourSei(ByteBuffer byteBuffer, long j, int i);
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$MicrophoneDetectListener */
    public interface MicrophoneDetectListener extends IVideoEffectProcessor.MicrophoneDetectListener {
        static {
            Covode.recordClassIndex(100545);
        }
    }

    static {
        Covode.recordClassIndex(100537);
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

    IAudioStrangeVoice createAudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2);

    boolean detectFaceFromBitMap(Bitmap bitmap);

    void enable(boolean z);

    void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    int enableFindContour(boolean z, String str);

    int enableMockFace(boolean z);

    void forceOutput2DTex(boolean z);

    String getABDefaultInfoFromEffect(String str);

    long getEffectAudioQuirk();

    float getEffectAudioVolume();

    long getEffectNativeHandler();

    String getEffectVersion();

    float getFilterIntensity(String str);

    String getVersion();

    IVideoEffectProcessor getVideoEffectProcessor();

    boolean isEnable();

    boolean isValid();

    String name();

    int pauseEffect();

    void processDoubleClickEvent(float f, float f2);

    void processLongPressEvent(float f, float f2);

    void processPanEvent(float f, float f2, float f3, float f4, float f5);

    void processRotationEvent(float f, float f2);

    void processScaleEvent(float f, float f2);

    void processTouchDownEvent(float f, float f2, int i);

    void processTouchEvent(float f, float f2);

    void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2);

    void processTouchUpEvent(float f, float f2, int i);

    void releaseContetDetector();

    int resumeEffect();

    int sendEffectMsg(int i, int i2, int i3, String str);

    void setABInfoToEffect(JSONObject jSONObject, String str);

    int setAudioRecognizeDict(Map<String, String[]> map);

    int setBeautify(String str, float f, float f2);

    int setBeautify(String str, float f, float f2, float f3);

    void setContourDataCallBack(ContourDataCallBack contourDataCallBack);

    void setContourDataSendInterval(int i);

    int setCustomEffect(String str, String str2);

    int setCustomEffectOrientation(String str, int i);

    int setCustomEffectWithUri(String str, String str2, int i, int i2);

    void setDoubleViewRect(double d, double d2, double d3, double d4);

    int setEffect(String str);

    int setEffect(String str, boolean z);

    void setEffectAudioQuirk(long j);

    void setEffectAudioVolume(float f);

    void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener);

    void setEffectMsgListener(EffectMsgListener effectMsgListener);

    void setErrorListener(ErrorListener errorListener);

    void setExpressionDetectListener(ExpressionDetectListener expressionDetectListener);

    int setFaceAttribute(boolean z);

    void setFaceDetectListener(FaceDetectListener faceDetectListener);

    int setFilter(String str, float f);

    int setFilter(String str, float f, boolean z);

    int setFilter(String str, String str2, float f, float f2, float f3);

    int setFilter(String str, String str2, float f, float f2, float f3, boolean z);

    void setFindContourListener(FindContourListener findContourListener);

    void setLicenseToEffect(String str);

    void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener);

    void setMusicNodeFilePath(String str);

    void setRenderCacheString(String str, String str2);

    int setReshape(String str, float f, float f2);

    void setSendContourInfoType(int i);

    int startAudioRecognize();

    int startEffectAudio();

    int stopAudioRecognize();

    int stopEffectAudio();

    void updateEffAudioTimestampMs(long j);
}
