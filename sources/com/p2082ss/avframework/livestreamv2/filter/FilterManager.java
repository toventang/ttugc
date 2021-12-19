package com.p2082ss.avframework.livestreamv2.filter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.OrientationEventListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.avframework.buffer.GlTextureFrameBuffer;
import com.p2082ss.avframework.buffer.RoiInfo;
import com.p2082ss.avframework.buffer.TextureBufferImpl;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.effect.EffectWrapper;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.engine.VideoProcessor;
import com.p2082ss.avframework.livestreamv2.IInputAudioStream;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.filter.FilterVideoBufferPool;
import com.p2082ss.avframework.livestreamv2.filter.IFilterManager;
import com.p2082ss.avframework.livestreamv2.filter.VideoCatcher;
import com.p2082ss.avframework.livestreamv2.utils.ImageLoadUtils;
import com.p2082ss.avframework.livestreamv2.utils.VideoDumpProxy;
import com.p2082ss.avframework.mixer.AudioMixer;
import com.p2082ss.avframework.opengl.GLThread;
import com.p2082ss.avframework.opengl.GlRenderDrawer;
import com.p2082ss.avframework.opengl.GlUtil;
import com.p2082ss.avframework.opengl.YuvConverter;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager */
public class FilterManager extends VideoProcessor implements TextureBufferImpl.ToI420Interface, ILiveStream.IAudioFrameAvailableListener, IFilterManager, VideoCatcher.VideoCatcherCallback {
    private long effectAlgorithmRequirment;
    private long effectAlgorithmRequirmentParams;
    private boolean mAudioRecognizing;
    public IInputAudioStream mAudioStreamObserver;
    public FilterVideoBufferPool mBufferPool;
    private int mBufferPoolMaxSize = 4;
    public ILiveStream.CatchMediaDataCallback mCatchVideoCallback;
    public int mCatchVideoFrameCount;
    public int mCatchVideoFrameInterval;
    public final Context mContext;
    private IFilterManager.ContourDataCallBack mContourDataCallBack;
    private int mContourDataSendInterval = 1;
    private IFilterManager.ContourInfoListener mContourInfoListener;
    public IVideoEffectProcessor mEffect;
    private long mEffectAudioTimestampMs;
    public float mEffectAudioVolume = 1.0f;
    public EffectEdgeLog mEffectEdgeLog;
    public VideoCatcher mEffectFrameCatcher;
    private boolean mEnableFindContour;
    private boolean mEnabled;
    public IFilterManager.ErrorListener mErrorListener;
    private long mExtrDataFlags;
    private int mExtraDataGop;
    private IFilterManager.FindContourListener mFindContourListener;
    private boolean mForceOutput2DTex;
    public boolean mForceSticker;
    private GLThread mGLThread;
    private int mGetContourDataTime;
    public Handler mHandler;
    public boolean mIsEdgeRender;
    public boolean mKeepVideoCatcherAlive;
    private long mLastCatchTimestamp;
    public IVideoEffectProcessor.EffectMsgListener mMsgListener;
    private int mNoExtraSendFrameCounts;
    public GlRenderDrawer mOffscreenDraw;
    public int mOrientation;
    private AlbumOrientationEventListener mOrientationListener;
    public VideoCatcher mOriginFrameCatcher;
    public FilterVideoBufferPool.Recycle mOut2DTexRecycle;
    public ILiveStream.CatchPicCallback mPicCallback;
    private VideoDumpProxy.RawVideoDumperProxy[] mRawVideoDumpers = new VideoDumpProxy.RawVideoDumperProxy[2];
    private boolean mReleased;
    protected boolean mRoiEnabled;
    private int mSendContourInfoType = 1;
    private boolean mShouldCatch;
    private boolean mShowRoiRegion;
    private boolean mStretchRoi;
    public FilterVideoBufferPool.Recycle mTextureFrameBufferRecycle;
    private boolean mVpassEnableFindContour = true;
    private Handler mYuvConvertHandler;
    private GLThread mYuvConvertThread;
    private YuvConverter mYuvConverter;
    private int mYuvHeight;
    public int[] mYuvTexs;
    private int mYuvWidth;

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$IEffectLogUploader */
    public interface IEffectLogUploader {
        static {
            Covode.recordClassIndex(100528);
        }

        void upload(String str, JSONObject jSONObject);
    }

    private void dumpOriginFrame(VideoFrame.Buffer buffer) {
    }

    private String getCallInfo(Object... objArr) {
        return "";
    }

    private void onTextureFrame(VideoDumpProxy.RawVideoDumperProxy rawVideoDumperProxy, int i, boolean z, int i2, int i3, int i4, float[] fArr, String str) {
    }

    private void showRoiRegion(RoiInfo roiInfo, int i, int i2) {
    }

    public void releaseRawVideoDumpers() {
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int startEffectAudio() {
        return -1;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int stopEffectAudio() {
        return -1;
    }

    public IFilterManager.ContourDataCallBack getContourDataCallBack() {
        return this.mContourDataCallBack;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public float getEffectAudioVolume() {
        return this.mEffectAudioVolume;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public IVideoEffectProcessor getVideoEffectProcessor() {
        return this.mEffect;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public boolean isEnable() {
        return this.mEnabled;
    }

    public boolean isEnableFindContour() {
        return this.mEnableFindContour;
    }

    public static IFilterManager createDummy() {
        return new IFilterManager() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.C859131 */

            static {
                Covode.recordClassIndex(100464);
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerAppendNodes(String[] strArr, int i) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerExclusionCompare(String str, String str2, String str3, int[] iArr) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerReloadNodes(String[] strArr, int i) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerRemoveNodes(String[] strArr, int i) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerSetMode(int i, int i2) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerSetNodes(String[] strArr, int i) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerUpdateNode(String str, String str2, float f) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final IAudioStrangeVoice createAudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2) {
                return null;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final boolean detectFaceFromBitMap(Bitmap bitmap) {
                return false;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void enable(boolean z) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int enableFindContour(boolean z, String str) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int enableMockFace(boolean z) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void forceOutput2DTex(boolean z) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final String getABDefaultInfoFromEffect(String str) {
                return null;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final long getEffectAudioQuirk() {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final float getEffectAudioVolume() {
                return 0.0f;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final long getEffectNativeHandler() {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final String getEffectVersion() {
                return null;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final float getFilterIntensity(String str) {
                return 0.0f;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final String getVersion() {
                return "";
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final IVideoEffectProcessor getVideoEffectProcessor() {
                return null;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final boolean isEnable() {
                return true;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final boolean isValid() {
                return false;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final String name() {
                return "DummyFilter";
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int pauseEffect() {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void processDoubleClickEvent(float f, float f2) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void processLongPressEvent(float f, float f2) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void processRotationEvent(float f, float f2) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void processScaleEvent(float f, float f2) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void processTouchDownEvent(float f, float f2, int i) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void processTouchEvent(float f, float f2) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void processTouchUpEvent(float f, float f2, int i) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void releaseContetDetector() {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int resumeEffect() {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int sendEffectMsg(int i, int i2, int i3, String str) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setABInfoToEffect(JSONObject jSONObject, String str) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setAudioRecognizeDict(Map<String, String[]> map) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setBeautify(String str, float f, float f2) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setBeautify(String str, float f, float f2, float f3) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setContourDataCallBack(IFilterManager.ContourDataCallBack contourDataCallBack) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setContourDataSendInterval(int i) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setCustomEffect(String str, String str2) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setCustomEffectOrientation(String str, int i) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setCustomEffectWithUri(String str, String str2, int i, int i2) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setDoubleViewRect(double d, double d2, double d3, double d4) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setEffect(String str) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setEffect(String str, boolean z) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setEffectAudioQuirk(long j) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setEffectAudioVolume(float f) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setEffectMsgListener(IFilterManager.EffectMsgListener effectMsgListener) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setErrorListener(IFilterManager.ErrorListener errorListener) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setExpressionDetectListener(IFilterManager.ExpressionDetectListener expressionDetectListener) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setFaceAttribute(boolean z) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setFaceDetectListener(IFilterManager.FaceDetectListener faceDetectListener) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setFilter(String str, float f) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setFilter(String str, float f, boolean z) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setFilter(String str, String str2, float f, float f2, float f3) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setFilter(String str, String str2, float f, float f2, float f3, boolean z) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setFindContourListener(IFilterManager.FindContourListener findContourListener) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setLicenseToEffect(String str) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setMicrophoneDetectListener(IFilterManager.MicrophoneDetectListener microphoneDetectListener) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setMusicNodeFilePath(String str) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setRenderCacheString(String str, String str2) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int setReshape(String str, float f, float f2) {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void setSendContourInfoType(int i) {
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int startAudioRecognize() {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int startEffectAudio() {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int stopAudioRecognize() {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final int stopEffectAudio() {
                return 0;
            }

            @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
            public final void updateEffAudioTimestampMs(long j) {
            }
        };
    }

    static {
        Covode.recordClassIndex(100458);
        try {
            m147784x34ffbd71("effect");
        } catch (Throwable unused) {
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public String getEffectVersion() {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null) {
            return "";
        }
        return iVideoEffectProcessor.getEffectVersion();
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public String getVersion() {
        if (isValid()) {
            return this.mEffect.getEffectVersion();
        }
        return "";
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public boolean isValid() {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null || !iVideoEffectProcessor.valid()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$releaseContetDetector$2$FilterManager() {
        if (isValid()) {
            this.mEffect.releaseContetDetector();
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public String name() {
        if (isValid()) {
            return this.mEffect.name();
        }
        return "";
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void releaseContetDetector() {
        this.mHandler.post(new FilterManager$$Lambda$2(this));
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public long getEffectAudioQuirk() {
        AudioDeviceModule.AudioRenderSink audioRenderSink;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null) {
            audioRenderSink = iVideoEffectProcessor.getEffectAudioRender();
        } else {
            audioRenderSink = null;
        }
        if (audioRenderSink != null) {
            return audioRenderSink.getQuirks() & 3;
        }
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public long getEffectNativeHandler() {
        IVideoEffectProcessor iVideoEffectProcessor;
        if (!isValid() || (iVideoEffectProcessor = this.mEffect) == null || !(iVideoEffectProcessor instanceof EffectWrapper)) {
            return 0;
        }
        return ((EffectWrapper) iVideoEffectProcessor).getEffectNativeHandler();
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int pauseEffect() {
        final String callInfo = getCallInfo(new Object[0]);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8595245 */

            static {
                Covode.recordClassIndex(100504);
            }

            public void run() {
                int pauseEffect;
                if (FilterManager.this.isValid() && (pauseEffect = FilterManager.this.mEffect.pauseEffect()) != 0) {
                    FilterManager.this.mErrorListener.onError(pauseEffect, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int resumeEffect() {
        final String callInfo = getCallInfo(new Object[0]);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8595346 */

            static {
                Covode.recordClassIndex(100505);
            }

            public void run() {
                int resumeEffect;
                if (FilterManager.this.isValid() && (resumeEffect = FilterManager.this.mEffect.resumeEffect()) != 0) {
                    FilterManager.this.mErrorListener.onError(resumeEffect, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int startAudioRecognize() {
        if (this.mAudioRecognizing) {
            return -1;
        }
        IVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mMsgListener;
        if (effectMsgListener != null) {
            effectMsgListener.onMessageReceived(20, 2139095043, 0, "");
        }
        this.mAudioRecognizing = true;
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int stopAudioRecognize() {
        if (!this.mAudioRecognizing) {
            return -1;
        }
        IVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mMsgListener;
        if (effectMsgListener != null) {
            effectMsgListener.onMessageReceived(20, 2139095044, 0, "");
        }
        this.mAudioRecognizing = false;
        return 0;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        Handler handler;
        MethodCollector.m26663i(807);
        if (this.mReleased) {
            MethodCollector.m26664o(807);
            return;
        }
        if (this.mEnableFindContour) {
            enableFindContour(false, null);
        }
        AVLog.ioi("FilterManager", "Release filterManager ".concat(String.valueOf(this)));
        this.mReleased = true;
        stopEffectAudio();
        YuvConverter yuvConverter = this.mYuvConverter;
        this.mYuvConverter = null;
        if (yuvConverter != null && ((handler = this.mYuvConvertHandler) == null || this.mYuvConvertThread == null || !handler.post(new FilterManager$$Lambda$1(yuvConverter)))) {
            AVLog.ioe("FilterManager", "YuvConverter mem leak!");
        }
        GLThread gLThread = this.mYuvConvertThread;
        if (gLThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(gLThread);
            this.mYuvConvertThread = null;
        }
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC859464 */

            static {
                Covode.recordClassIndex(100497);
            }

            public void run() {
                FilterManager.this.stopCatchTask(-100, "Video catching is interrupted.");
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.release();
                    FilterManager.this.mEffect.setEffectMsgListener(null);
                    FilterManager.this.mEffect = null;
                    IVideoEffectProcessor.EffectMsgListener effectMsgListener = FilterManager.this.mMsgListener;
                    if (effectMsgListener != null) {
                        effectMsgListener.onMessageReceived(2139095042, 0, 0, null);
                    }
                }
                FilterManager.this.mMsgListener = null;
                FilterManager.this.mErrorListener = FilterManager$4$$Lambda$0.$instance;
                if (FilterManager.this.mOffscreenDraw != null) {
                    FilterManager.this.mOffscreenDraw.release();
                    FilterManager.this.mOffscreenDraw = null;
                }
                if (FilterManager.this.mBufferPool != null) {
                    FilterVideoBufferPool.Recycle pop = FilterManager.this.mBufferPool.pop();
                    while (pop != null) {
                        if (pop.getRefCounts() != 0) {
                            AVLog.m147806e("FilterManager", "Texture buffer(" + pop.toString() + ") not release");
                        }
                        GlTextureFrameBuffer buffer = pop.getBuffer();
                        pop.release();
                        buffer.release();
                        if (pop.getExtraData() != null) {
                            pop.getExtraData().releaseExtraData(pop.getExtraData());
                        }
                        pop = FilterManager.this.mBufferPool.pop();
                    }
                }
                if (FilterManager.this.mYuvTexs != null) {
                    GLES20.glDeleteTextures(FilterManager.this.mYuvTexs.length, FilterManager.this.mYuvTexs, 0);
                    FilterManager.this.mYuvTexs = null;
                }
                FilterManager.this.releaseRawVideoDumpers();
            }
        });
        GLThread gLThread2 = this.mGLThread;
        if (gLThread2 != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(gLThread2);
            this.mGLThread = null;
        } else {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC859575 */

                static {
                    Covode.recordClassIndex(100509);
                }

                public void run() {
                }
            });
        }
        AlbumOrientationEventListener albumOrientationEventListener = this.mOrientationListener;
        if (albumOrientationEventListener != null) {
            albumOrientationEventListener.disable();
            this.mOrientationListener = null;
        }
        IInputAudioStream iInputAudioStream = this.mAudioStreamObserver;
        if (iInputAudioStream != null) {
            iInputAudioStream.release();
            this.mAudioStreamObserver = null;
        }
        if (this.mFindContourListener != null) {
            this.mFindContourListener = null;
        }
        if (this.mContourDataCallBack != null) {
            this.mContourDataCallBack = null;
        }
        super.release();
        MethodCollector.m26664o(807);
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int enableMockFace(boolean z) {
        this.mForceSticker = z;
        return 0;
    }

    public void enableRoi(boolean z) {
        this.mRoiEnabled = z;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void forceOutput2DTex(boolean z) {
        this.mForceOutput2DTex = z;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setContourDataCallBack(IFilterManager.ContourDataCallBack contourDataCallBack) {
        this.mContourDataCallBack = contourDataCallBack;
    }

    public void setContourInfoListener(IFilterManager.ContourInfoListener contourInfoListener) {
        this.mContourInfoListener = contourInfoListener;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setErrorListener(IFilterManager.ErrorListener errorListener) {
        this.mErrorListener = errorListener;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setFindContourListener(IFilterManager.FindContourListener findContourListener) {
        this.mFindContourListener = findContourListener;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void updateEffAudioTimestampMs(long j) {
        this.mEffectAudioTimestampMs = j;
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$EffectEdgeLog */
    static class EffectEdgeLog implements EffectWrapper.IEffectEdgeRenderLoga {
        private IEffectLogUploader mEffectLogUpLoader;

        static {
            Covode.recordClassIndex(100527);
        }

        EffectEdgeLog(IEffectLogUploader iEffectLogUploader) {
            this.mEffectLogUpLoader = iEffectLogUploader;
        }

        @Override // com.p2082ss.avframework.effect.EffectWrapper.IEffectEdgeRenderLoga
        public void onEdgeRenderLog(String str, String str2) {
            IEffectLogUploader iEffectLogUploader = this.mEffectLogUpLoader;
            if (iEffectLogUploader != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject = new JSONObject(str2);
                } catch (Exception unused) {
                }
                iEffectLogUploader.upload(str, jSONObject);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public boolean detectFaceFromBitMap(Bitmap bitmap) {
        return this.mEffect.detectFaceFromBitMap(bitmap);
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public float getFilterIntensity(String str) {
        return this.mEffect.getFilterIntensity(str);
    }

    public VideoFrame processOnJava(VideoFrame videoFrame) {
        return process(videoFrame);
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setContourDataSendInterval(int i) {
        this.mContourDataSendInterval = i;
        this.mGetContourDataTime = 0;
    }

    /* renamed from: com_ss_avframework_livestreamv2_filter_FilterManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147784x34ffbd71(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    static final /* synthetic */ void lambda$release$1$FilterManager(YuvConverter yuvConverter) {
        yuvConverter.release();
        AVLog.iow("FilterManager", "YuvConverter release");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setEffectInfoChangeListener$3$FilterManager(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (iVideoEffectProcessor instanceof EffectWrapper)) {
            ((EffectWrapper) iVideoEffectProcessor).setEffectInfoChangeListener(iEffectInfoChangeListener);
        }
    }

    public void setEffectAlgorithmAB(final boolean z) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC859717 */

            static {
                Covode.recordClassIndex(100523);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.setAlgorithmAB(z);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
        this.mHandler.post(new FilterManager$$Lambda$3(this, iEffectInfoChangeListener));
    }

    public void setEffectLogUploader(IEffectLogUploader iEffectLogUploader) {
        if (this.mEffectEdgeLog == null) {
            this.mEffectEdgeLog = new EffectEdgeLog(iEffectLogUploader);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setEffectMsgListener(final IFilterManager.EffectMsgListener effectMsgListener) {
        this.mMsgListener = effectMsgListener;
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8595548 */

            static {
                Covode.recordClassIndex(100507);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setEffectMsgListener(effectMsgListener);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setExpressionDetectListener(final IFilterManager.ExpressionDetectListener expressionDetectListener) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8595951 */

            static {
                Covode.recordClassIndex(100511);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setExpressionDetectListener(expressionDetectListener);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setFaceDetectListener(final IFilterManager.FaceDetectListener faceDetectListener) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8595649 */

            static {
                Covode.recordClassIndex(100508);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setFaceDetectListener(faceDetectListener);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setMicrophoneDetectListener(final IFilterManager.MicrophoneDetectListener microphoneDetectListener) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8596052 */

            static {
                Covode.recordClassIndex(100512);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setMicrophoneDetectListener(microphoneDetectListener);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setMusicNodeFilePath(final String str) {
        if (str == null) {
            str = "";
        }
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8596153 */

            static {
                Covode.recordClassIndex(100513);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setMusicNodeFilePath(str);
                }
            }
        });
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$AlbumOrientationEventListener */
    class AlbumOrientationEventListener extends OrientationEventListener {
        static {
            Covode.recordClassIndex(100526);
        }

        public void onOrientationChanged(int i) {
            int i2;
            if (i != -1 && (i2 = (((i + 45) / 90) * 90) % 360) != FilterManager.this.mOrientation) {
                FilterManager.this.mOrientation = i2;
            }
        }

        public AlbumOrientationEventListener(Context context) {
            super(context);
            try {
                if (canDetectOrientation()) {
                    enable();
                } else {
                    AVLog.m147806e("FilterManager", "Can't Detect Orientation");
                }
            } catch (Exception e) {
                AVLog.logKibana(6, "FilterManager", "AlbumOrientationEventListener register failed:", e);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public String getABDefaultInfoFromEffect(String str) {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null || !(iVideoEffectProcessor instanceof EffectWrapper)) {
            return null;
        }
        return ((EffectWrapper) iVideoEffectProcessor).getEffectABInfo(str);
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.VideoCatcher.VideoCatcherCallback
    public void onCatchedBuffer(VideoCatcher videoCatcher) {
        ILiveStream.CatchPicCallback catchPicCallback = this.mPicCallback;
        if (catchPicCallback == null) {
            return;
        }
        if (videoCatcher == this.mOriginFrameCatcher) {
            catchPicCallback.onCatchedPic(false, videoCatcher);
        } else if (videoCatcher == this.mEffectFrameCatcher) {
            catchPicCallback.onCatchedPic(true, videoCatcher);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setAudioRecognizeDict(final Map<String, String[]> map) {
        final String callInfo = getCallInfo(map);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8592621 */

            static {
                Covode.recordClassIndex(100477);
            }

            public void run() {
                int audioRecognizeDict;
                if (FilterManager.this.isValid() && (audioRecognizeDict = FilterManager.this.mEffect.setAudioRecognizeDict(map)) != 0) {
                    FilterManager.this.mErrorListener.onError(audioRecognizeDict, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setEffect(final String str) {
        final String callInfo = getCallInfo(str);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8591713 */

            static {
                Covode.recordClassIndex(100468);
            }

            public void run() {
                int effect;
                if (FilterManager.this.isValid() && (effect = FilterManager.this.mEffect.setEffect(str)) != 0) {
                    FilterManager.this.mErrorListener.onError(effect, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setEffectAudioQuirk(long j) {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (effectAudioRender = iVideoEffectProcessor.getEffectAudioRender()) != null) {
            effectAudioRender.setQuirks(j & 3);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setEffectAudioVolume(float f) {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (!(iVideoEffectProcessor == null || (effectAudioRender = iVideoEffectProcessor.getEffectAudioRender()) == null)) {
            this.mEffectAudioVolume = f;
            effectAudioRender.setVolume(f);
        }
        IInputAudioStream iInputAudioStream = this.mAudioStreamObserver;
        if (iInputAudioStream != null) {
            AudioMixer.AudioMixerDescription mixerDescription = iInputAudioStream.getMixerDescription();
            mixerDescription.volumeCoeff = f;
            iInputAudioStream.setMixerDescription(mixerDescription);
        }
    }

    public void setEnableVpassEnableFindContour(boolean z) {
        this.mVpassEnableFindContour = z;
        AVLog.ioi("FilterManager", "setEnableVpassEnableFindContour. enable = ".concat(String.valueOf(z)));
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setFaceAttribute(final boolean z) {
        final String callInfo = getCallInfo(Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8591511 */

            static {
                Covode.recordClassIndex(100466);
            }

            public void run() {
                int faceAttribute;
                if (FilterManager.this.isValid() && (faceAttribute = FilterManager.this.mEffect.setFaceAttribute(z)) != 0) {
                    FilterManager.this.mErrorListener.onError(faceAttribute, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setLicenseToEffect(final String str) {
        final String callInfo = getCallInfo(str);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8596355 */

            static {
                Covode.recordClassIndex(100515);
            }

            public void run() {
                int effectLicense;
                if (FilterManager.this.isValid() && (effectLicense = FilterManager.this.mEffect.setEffectLicense(str)) != 0) {
                    FilterManager.this.mErrorListener.onError(effectLicense, callInfo);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void enable(boolean z) {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        AVLog.iod("FilterManager", "enable " + this.mEnabled + " -> " + z);
        this.mEnabled = z;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (effectAudioRender = iVideoEffectProcessor.getEffectAudioRender()) != null) {
            effectAudioRender.setMute(!z);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setSendContourInfoType(int i) {
        if (i == 1 || i == 2) {
            this.mEffect.setSendContourInfoType(i);
            this.mSendContourInfoType = i;
            AVLog.ioi("FilterManager", "setSendContourInfoType success. type = ".concat(String.valueOf(i)));
        }
        AVLog.iow("FilterManager", "setSendContourInfoType fail. type = ".concat(String.valueOf(i)));
    }

    @Override // com.p2082ss.avframework.buffer.TextureBufferImpl.ToI420Interface
    public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
        VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        if (this.mYuvConvertThread == null && this.mYuvConvertHandler == null) {
            GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("YuvConvertThread");
            this.mYuvConvertThread = lockGLThread;
            lockGLThread.start();
            this.mYuvConvertHandler = this.mYuvConvertThread.getHandler();
        }
        Handler handler = this.mYuvConvertHandler;
        if (!(handler == null || this.mYuvConvertThread == null)) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new FilterManager$$Lambda$4(this, i420BufferArr, textureBuffer));
        }
        return i420BufferArr[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r0 == false) goto L_0x0055;
     */
    @Override // com.p2082ss.avframework.engine.VideoProcessor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p2082ss.avframework.buffer.VideoFrame process(final com.p2082ss.avframework.buffer.VideoFrame r11) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.filter.FilterManager.process(com.ss.avframework.buffer.VideoFrame):com.ss.avframework.buffer.VideoFrame");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p2082ss.avframework.buffer.VideoFrame onProcess(com.p2082ss.avframework.buffer.VideoFrame r27) {
        /*
        // Method dump skipped, instructions count: 1148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.filter.FilterManager.onProcess(com.ss.avframework.buffer.VideoFrame):com.ss.avframework.buffer.VideoFrame");
    }

    public void onCatchError(int i, String str) {
        stopCatchTask(i, str);
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.VideoCatcher.VideoCatcherCallback
    public void onError(int i, String str) {
        onCatchError(i, str);
    }

    public void catchPic(final Bundle bundle, final ILiveStream.CatchPicCallback catchPicCallback) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8596456 */

            static {
                Covode.recordClassIndex(100516);
            }

            public void run() {
                int i = bundle.getInt("width");
                int i2 = bundle.getInt("height");
                boolean z = bundle.getBoolean("outputPixelBufferOrigin");
                boolean z2 = bundle.getBoolean("outputPixelBufferWithEffect");
                FilterManager.this.mKeepVideoCatcherAlive = bundle.getBoolean("keepVideoCatcherAlive");
                FilterManager.this.mPicCallback = catchPicCallback;
                if (z) {
                    if (FilterManager.this.mOriginFrameCatcher == null) {
                        FilterManager.this.mOriginFrameCatcher = new VideoCatcher();
                        VideoCatcher videoCatcher = FilterManager.this.mOriginFrameCatcher;
                        FilterManager filterManager = FilterManager.this;
                        videoCatcher.start(i, i2, filterManager, filterManager.mHandler);
                    }
                } else if (FilterManager.this.mOriginFrameCatcher != null) {
                    FilterManager.this.mOriginFrameCatcher.stop(0);
                    FilterManager.this.mOriginFrameCatcher = null;
                }
                if (z2) {
                    if (FilterManager.this.mEffectFrameCatcher == null) {
                        FilterManager.this.mEffectFrameCatcher = new VideoCatcher();
                        VideoCatcher videoCatcher2 = FilterManager.this.mEffectFrameCatcher;
                        FilterManager filterManager2 = FilterManager.this;
                        videoCatcher2.start(i, i2, filterManager2, filterManager2.mHandler);
                    }
                } else if (FilterManager.this.mEffectFrameCatcher != null) {
                    FilterManager.this.mEffectFrameCatcher.stop(0);
                    FilterManager.this.mEffectFrameCatcher = null;
                }
                if (z || z2) {
                    FilterManager.this.mCatchVideoFrameCount = bundle.getInt("frameCount");
                    FilterManager.this.mCatchVideoFrameInterval = (int) (bundle.getFloat("interval") * 1000.0f);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void processDoubleClickEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8594740 */

            static {
                Covode.recordClassIndex(100499);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processDoubleClickEvent(f, f2);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void processLongPressEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8594539 */

            static {
                Covode.recordClassIndex(100496);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processLongPressEvent(f, f2);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void processRotationEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8595144 */

            static {
                Covode.recordClassIndex(100503);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processRotationEvent(f, f2);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void processScaleEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8595043 */

            static {
                Covode.recordClassIndex(100502);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processScaleEvent(f, f2);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void processTouchEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8594236 */

            static {
                Covode.recordClassIndex(100493);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchEvent(f, f2);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setRenderCacheString(String str, String str2) {
        if (isValid()) {
            this.mEffect.setRenderCacheString(str, str2);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerAppendNodes(final String[] strArr, final int i) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8593227 */

            static {
                Covode.recordClassIndex(100483);
            }

            public void run() {
                int composerAppendNodes;
                if (FilterManager.this.isValid() && (composerAppendNodes = FilterManager.this.mEffect.composerAppendNodes(strArr, i)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerAppendNodes, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerReloadNodes(final String[] strArr, final int i) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8593126 */

            static {
                Covode.recordClassIndex(100482);
            }

            public void run() {
                int composerReloadNodes;
                if (FilterManager.this.isValid() && (composerReloadNodes = FilterManager.this.mEffect.composerReloadNodes(strArr, i)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerReloadNodes, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerRemoveNodes(final String[] strArr, final int i) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8593328 */

            static {
                Covode.recordClassIndex(100484);
            }

            public void run() {
                int composerRemoveNodes;
                if (FilterManager.this.isValid() && (composerRemoveNodes = FilterManager.this.mEffect.composerRemoveNodes(strArr, i)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerRemoveNodes, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerSetMode(final int i, final int i2) {
        final String callInfo = getCallInfo(Integer.valueOf(i), Integer.valueOf(i2));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8592823 */

            static {
                Covode.recordClassIndex(100479);
            }

            public void run() {
                int composerSetMode;
                if (FilterManager.this.isValid() && (composerSetMode = FilterManager.this.mEffect.composerSetMode(i, i2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerSetMode, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerSetNodes(final String[] strArr, final int i) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8592924 */

            static {
                Covode.recordClassIndex(100480);
            }

            public void run() {
                int composerSetNodes;
                if (FilterManager.this.isValid() && (composerSetNodes = FilterManager.this.mEffect.composerSetNodes(strArr, i)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerSetNodes, callInfo);
                }
            }
        });
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$toI420$4$FilterManager(VideoFrame.I420Buffer[] i420BufferArr, VideoFrame.TextureBuffer textureBuffer) {
        if (this.mEffect != null && this.mYuvConverter == null) {
            this.mYuvConverter = new YuvConverter();
        }
        YuvConverter yuvConverter = this.mYuvConverter;
        if (yuvConverter != null) {
            i420BufferArr[0] = yuvConverter.convert(textureBuffer);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setABInfoToEffect(final JSONObject jSONObject, final String str) {
        final String callInfo = getCallInfo(jSONObject.toString(), str);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8596254 */

            static {
                Covode.recordClassIndex(100514);
            }

            public void run() {
                int effectABInfo;
                if (FilterManager.this.isValid() && (effectABInfo = FilterManager.this.mEffect.setEffectABInfo(jSONObject, str)) != 0) {
                    FilterManager.this.mErrorListener.onError(effectABInfo, callInfo);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setCustomEffect(final String str, final String str2) {
        final String callInfo = getCallInfo(str, str2);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8591814 */

            static {
                Covode.recordClassIndex(100469);
            }

            public void run() {
                int customEffect;
                if (FilterManager.this.isValid() && (customEffect = FilterManager.this.mEffect.setCustomEffect(str, str2)) != 0) {
                    FilterManager.this.mErrorListener.onError(customEffect, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setCustomEffectOrientation(final String str, final int i) {
        final String callInfo = getCallInfo(str, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8592016 */

            static {
                Covode.recordClassIndex(100471);
            }

            public void run() {
                int customEffectOrientation;
                if (FilterManager.this.isValid() && (customEffectOrientation = FilterManager.this.mEffect.setCustomEffectOrientation(str, i)) != 0) {
                    FilterManager.this.mErrorListener.onError(customEffectOrientation, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setFilter(final String str, final float f) {
        final String callInfo = getCallInfo(str, Float.valueOf(f));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8592117 */

            static {
                Covode.recordClassIndex(100472);
            }

            public void run() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(str, f)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, callInfo);
                }
            }
        });
        return 0;
    }

    public void enableExtData(long j, int i) {
        this.mExtrDataFlags = j;
        this.mExtraDataGop = i;
        AVLog.iod("FilterManager", "enableExtData " + j + " gop " + i);
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int enableFindContour(boolean z, String str) {
        if (!this.mVpassEnableFindContour) {
            return -2;
        }
        int i = -1;
        if (isValid() && (i = this.mEffect.enableFindContour(z, str)) == 0) {
            this.mEnableFindContour = z;
            AVLog.ioi("FilterManager", "enableFindContour. enable = ".concat(String.valueOf(z)));
        }
        return i;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setEffect(final String str, final boolean z) {
        final String callInfo = getCallInfo(str, Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8591612 */

            static {
                Covode.recordClassIndex(100467);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mForceSticker = z;
                    int effect = FilterManager.this.mEffect.setEffect(str);
                    if (effect != 0) {
                        FilterManager.this.mErrorListener.onError(effect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public void stopCatchTask(final int i, final String str) {
        if (Thread.currentThread() != this.mHandler.getLooper().getThread()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8596758 */

                static {
                    Covode.recordClassIndex(100519);
                }

                public void run() {
                    FilterManager.this.stopCatchTask(i, str);
                }
            });
            return;
        }
        VideoCatcher videoCatcher = this.mOriginFrameCatcher;
        if (videoCatcher != null) {
            videoCatcher.stop(i);
            this.mOriginFrameCatcher = null;
        }
        VideoCatcher videoCatcher2 = this.mEffectFrameCatcher;
        if (videoCatcher2 != null) {
            videoCatcher2.stop(i);
            this.mEffectFrameCatcher = null;
        }
        ILiveStream.CatchMediaDataCallback catchMediaDataCallback = this.mCatchVideoCallback;
        if (catchMediaDataCallback != null) {
            if (i == 0) {
                catchMediaDataCallback.onComplete();
            } else {
                catchMediaDataCallback.onError(i, str);
            }
            this.mCatchVideoCallback = null;
        }
        this.mCatchVideoFrameCount = 0;
    }

    public void catchVideo(MediaEngineFactory mediaEngineFactory, final Bundle bundle, final ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        final WeakReference weakReference = new WeakReference(mediaEngineFactory);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8596557 */

            static {
                Covode.recordClassIndex(100517);
            }

            public void run() {
                if (FilterManager.this.mOriginFrameCatcher == null && FilterManager.this.mEffectFrameCatcher == null) {
                    MediaEngineFactory mediaEngineFactory = (MediaEngineFactory) weakReference.get();
                    int i = bundle.getInt("mode", -1);
                    int i2 = bundle.getInt("width");
                    int i3 = bundle.getInt("height");
                    int i4 = bundle.getInt("fps");
                    boolean z = bundle.getBoolean("hardwareEncode", true);
                    String string = bundle.getString("outputPathOrigin");
                    String string2 = bundle.getString("outputPathWithEffect");
                    FilterManager.this.mCatchVideoFrameCount = bundle.getInt("frameCount");
                    if (i == 0 && bundle.containsKey("duration")) {
                        FilterManager.this.mCatchVideoFrameCount = (int) (bundle.getFloat("duration") * ((float) i4));
                    }
                    FilterManager.this.mCatchVideoFrameInterval = (int) (bundle.getFloat("interval") * 1000.0f);
                    FilterManager.this.mCatchVideoCallback = catchMediaDataCallback;
                    new ILiveStream.CatchMediaDataCallback() {
                        /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8596557.C859661 */

                        static {
                            Covode.recordClassIndex(100518);
                        }

                        @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
                        public void onComplete() {
                        }

                        @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
                        public void onError(int i, String str) {
                            FilterManager.this.onCatchError(i, str);
                        }
                    };
                    if (!TextUtils.isEmpty(string)) {
                        FilterManager.this.mOriginFrameCatcher = new VideoCatcher();
                        VideoCatcher videoCatcher = FilterManager.this.mOriginFrameCatcher;
                        FilterManager filterManager = FilterManager.this;
                        videoCatcher.start(i, i2, i3, i4, z, string, filterManager, mediaEngineFactory, filterManager.mHandler);
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        FilterManager.this.mEffectFrameCatcher = new VideoCatcher();
                        VideoCatcher videoCatcher2 = FilterManager.this.mEffectFrameCatcher;
                        FilterManager filterManager2 = FilterManager.this;
                        videoCatcher2.start(i, i2, i3, i4, z, string2, filterManager2, mediaEngineFactory, filterManager2.mHandler);
                        return;
                    }
                    return;
                }
                ILiveStream.CatchMediaDataCallback catchMediaDataCallback = catchMediaDataCallback;
                if (catchMediaDataCallback != null) {
                    catchMediaDataCallback.onError(-2, "Already started a catching task");
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void processTouchDownEvent(final float f, final float f2, final int i) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8594841 */

            static {
                Covode.recordClassIndex(100500);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchDownEvent(f, f2, i);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void processTouchUpEvent(final float f, final float f2, final int i) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8594942 */

            static {
                Covode.recordClassIndex(100501);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchUpEvent(f, f2, i);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerAppendNodesWithTags(final String[] strArr, final int i, final String[] strArr2) {
        final String callInfo = getCallInfo(strArr, strArr2);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8593731 */

            static {
                Covode.recordClassIndex(100488);
            }

            public void run() {
                int composerAppendNodesWithTags;
                if (FilterManager.this.isValid() && (composerAppendNodesWithTags = FilterManager.this.mEffect.composerAppendNodesWithTags(strArr, i, strArr2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerAppendNodesWithTags, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public IAudioStrangeVoice createAudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2) {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null || !(iVideoEffectProcessor instanceof EffectWrapper)) {
            return null;
        }
        return new AudioStrangeVoice(audioRenderSink, (EffectWrapper) this.mEffect, i, i2);
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerCheckNodeExclusion(final String str, final String str2, final int[] iArr) {
        final String callInfo = getCallInfo(str, str2, iArr);
        if (isValid() && iArr.length > 0) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8593933 */

                static {
                    Covode.recordClassIndex(100490);
                }

                public void run() {
                    int composerCheckNodeExclusion = FilterManager.this.mEffect.composerCheckNodeExclusion(str, str2, iArr);
                    if (composerCheckNodeExclusion != 0) {
                        FilterManager.this.mErrorListener.onError(composerCheckNodeExclusion, callInfo);
                    }
                }
            });
        }
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerReloadNodesWithTags(final String[] strArr, final int i, final String[] strArr2) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i), strArr2);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8593630 */

            static {
                Covode.recordClassIndex(100487);
            }

            public void run() {
                int composerReloadNodesWithTags;
                if (FilterManager.this.isValid() && (composerReloadNodesWithTags = FilterManager.this.mEffect.composerReloadNodesWithTags(strArr, i, strArr2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerReloadNodesWithTags, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerSetNodesWithTags(final String[] strArr, final int i, final String[] strArr2) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i), strArr2);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8593429 */

            static {
                Covode.recordClassIndex(100485);
            }

            public void run() {
                int composerSetNodesWithTags;
                if (FilterManager.this.isValid() && (composerSetNodesWithTags = FilterManager.this.mEffect.composerSetNodesWithTags(strArr, i, strArr2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerSetNodesWithTags, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerUpdateNode(final String str, final String str2, final float f) {
        final String callInfo = getCallInfo(str, str2, Float.valueOf(f));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8593025 */

            static {
                Covode.recordClassIndex(100481);
            }

            public void run() {
                int composerUpdateNode;
                if (FilterManager.this.isValid() && (composerUpdateNode = FilterManager.this.mEffect.composerUpdateNode(str, str2, f)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerUpdateNode, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setBeautify(final String str, final float f, final float f2) {
        final String callInfo = getCallInfo(str, Float.valueOf(f), Float.valueOf(f2));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC859728 */

            static {
                Covode.recordClassIndex(100524);
            }

            public void run() {
                int beautify;
                if (FilterManager.this.isValid() && (beautify = FilterManager.this.mEffect.setBeautify(str, f, f2)) != 0) {
                    FilterManager.this.mErrorListener.onError(beautify, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setFilter(final String str, final float f, final boolean z) {
        final String callInfo = getCallInfo(str, Float.valueOf(f), Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8592218 */

            static {
                Covode.recordClassIndex(100473);
            }

            public void run() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(str, f, z)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setReshape(final String str, final float f, final float f2) {
        final String callInfo = getCallInfo(str, Float.valueOf(f), Float.valueOf(f2));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8591410 */

            static {
                Covode.recordClassIndex(100465);
            }

            public void run() {
                int reshape;
                if (FilterManager.this.isValid() && (reshape = FilterManager.this.mEffect.setReshape(str, f, f2)) != 0) {
                    FilterManager.this.mErrorListener.onError(reshape, callInfo);
                }
            }
        });
        return 0;
    }

    public void setConfig(String[] strArr, boolean[] zArr, JSONObject jSONObject) {
        long j;
        long j2;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null) {
            if (iVideoEffectProcessor instanceof EffectWrapper) {
                if (strArr != null) {
                    if (zArr != null) {
                        long algorithmRequirment = ((EffectWrapper) iVideoEffectProcessor).getAlgorithmRequirment();
                        this.effectAlgorithmRequirment = algorithmRequirment;
                        long algorithmRequirmentParams = ((EffectWrapper) this.mEffect).getAlgorithmRequirmentParams();
                        this.effectAlgorithmRequirmentParams = algorithmRequirmentParams;
                        AVLog.iod("FilterManager", "Current requirment " + Long.toHexString(algorithmRequirment));
                        for (String str : strArr) {
                            for (boolean z : zArr) {
                                AVLog.ioi("FilterManager", "Requirment name " + str + " enable " + z);
                                if (str.equalsIgnoreCase("")) {
                                    if (z) {
                                        j2 = 17592186044416L;
                                    } else {
                                        j = -17592186044417L;
                                        algorithmRequirment &= j;
                                    }
                                } else if (!str.equalsIgnoreCase("faceinfo")) {
                                    if (str.equalsIgnoreCase("mouthPout")) {
                                        algorithmRequirmentParams |= 67108864;
                                    }
                                } else if (z) {
                                    j2 = 1;
                                } else {
                                    j = -2;
                                    algorithmRequirment &= j;
                                }
                                algorithmRequirment |= j2;
                            }
                        }
                        AVLog.iod("FilterManager", "update requirment " + Long.toHexString(algorithmRequirment) + ", flagsParams:" + Long.toHexString(algorithmRequirmentParams));
                        ((EffectWrapper) this.mEffect).refreshAlgorithmRequirment(algorithmRequirment, algorithmRequirmentParams);
                        AVLog.iod("FilterManager", "after requirment " + Long.toHexString(((EffectWrapper) this.mEffect).getAlgorithmRequirment()) + ", flagsParams:" + Long.toHexString(((EffectWrapper) this.mEffect).getAlgorithmRequirmentParams()));
                        return;
                    }
                    return;
                }
            } else if (strArr != null) {
                return;
            }
            AVLog.iod("FilterManager", "restore requirment " + Long.toHexString(this.effectAlgorithmRequirment) + ",flagsParams:" + Long.toHexString(this.effectAlgorithmRequirmentParams));
            ((EffectWrapper) this.mEffect).refreshAlgorithmRequirment(this.effectAlgorithmRequirment, this.effectAlgorithmRequirmentParams);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerExclusionCompare(final String str, final String str2, final String str3, final int[] iArr) {
        final String callInfo = getCallInfo(str, str2, str3, iArr);
        if (isValid() && iArr.length > 0) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8594034 */

                static {
                    Covode.recordClassIndex(100491);
                }

                public void run() {
                    int composerExclusionCompare = FilterManager.this.mEffect.composerExclusionCompare(str, str2, str3, iArr);
                    if (composerExclusionCompare != 0) {
                        FilterManager.this.mErrorListener.onError(composerExclusionCompare, callInfo);
                    }
                }
            });
        }
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int sendEffectMsg(final int i, final int i2, final int i3, final String str) {
        final String callInfo = getCallInfo(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8595447 */

            static {
                Covode.recordClassIndex(100506);
            }

            public void run() {
                int sendEffectMsg;
                if (FilterManager.this.isValid() && (sendEffectMsg = FilterManager.this.mEffect.sendEffectMsg(i, i2, i3, str)) != 0) {
                    FilterManager.this.mErrorListener.onError(sendEffectMsg, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setCustomEffectWithUri(final String str, final String str2, final int i, final int i2) {
        final String callInfo = getCallInfo(str, str2, Integer.valueOf(i), Integer.valueOf(i2));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8591915 */

            static {
                Covode.recordClassIndex(100470);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    Bitmap loadBitmapCompat = ImageLoadUtils.loadBitmapCompat(FilterManager.this.mContext, str2, i, i2);
                    if (loadBitmapCompat == null) {
                        AVLog.ioe("FilterManager", "loadBitmapCompat failed");
                        return;
                    }
                    int customEffectBitmap = FilterManager.this.mEffect.setCustomEffectBitmap(str, loadBitmapCompat);
                    if (customEffectBitmap != 0) {
                        FilterManager.this.mErrorListener.onError(customEffectBitmap, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void setDoubleViewRect(final double d, final double d2, final double d3, final double d4) {
        getCallInfo(Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8594135 */

            static {
                Covode.recordClassIndex(100492);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.setDoubleViewRect(d, d2, d3, d4);
                }
            }
        });
    }

    private VideoFrame wrapperFrame(int i, VideoFrame videoFrame, RoiInfo roiInfo, EffectWrapper.AlgorithmResult algorithmResult) {
        FilterVideoBufferPool.Recycle recycle;
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        FilterVideoBufferPool.Recycle recycle2 = this.mOut2DTexRecycle;
        if (recycle2 == null || i != recycle2.getBuffer().getTextureId()) {
            recycle = this.mTextureFrameBufferRecycle;
        } else {
            recycle = this.mOut2DTexRecycle;
        }
        recycle.addRef();
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), VideoFrame.TextureBuffer.Type.RGB, i, matrix, this, recycle, algorithmResult);
        textureBufferImpl.updateCaptureMs(videoFrame.getBuffer().getCaptureMs());
        textureBufferImpl.setROIInfo(roiInfo);
        return new VideoFrame(textureBufferImpl, 0, videoFrame.getTimestampNs());
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setBeautify(final String str, final float f, final float f2, final float f3) {
        final String callInfo = getCallInfo(str, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC859739 */

            static {
                Covode.recordClassIndex(100525);
            }

            public void run() {
                int beautify;
                if (FilterManager.this.isValid() && (beautify = FilterManager.this.mEffect.setBeautify(str, f, f2, f3)) != 0) {
                    FilterManager.this.mErrorListener.onError(beautify, callInfo);
                }
            }
        });
        return 0;
    }

    public static IFilterManager create(IInputAudioStream iInputAudioStream, Context context, Handler handler, IVideoEffectProcessor iVideoEffectProcessor, AudioDeviceModule audioDeviceModule) {
        return new FilterManager(iInputAudioStream, context, handler, iVideoEffectProcessor, audioDeviceModule, false);
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void processPanEvent(final float f, final float f2, final float f3, final float f4, final float f5) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8594438 */

            static {
                Covode.recordClassIndex(100495);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processPanEvent(f, f2, f3, f4, f5);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int composerReplaceNodesWithTags(final String[] strArr, final int i, final String[] strArr2, final int i2, final String[] strArr3) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i), strArr2, Integer.valueOf(i2), strArr3);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8593832 */

            static {
                Covode.recordClassIndex(100489);
            }

            public void run() {
                int composerReplaceNodesWithTags;
                if (FilterManager.this.isValid() && (composerReplaceNodesWithTags = FilterManager.this.mEffect.composerReplaceNodesWithTags(strArr, i, strArr2, i2, strArr3)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerReplaceNodesWithTags, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(final Buffer buffer, final int i, final int i2, final int i3, long j) {
        if (!(buffer instanceof ByteBuffer) || !buffer.isDirect()) {
            throw new AndroidRuntimeException("Audio buffer should be a direct byte buffer!");
        } else if (i * 100 != i2) {
            throw new AndroidRuntimeException("Audio data should be 10ms per frame!");
        } else if (this.mAudioRecognizing) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8592722 */

                static {
                    Covode.recordClassIndex(100478);
                }

                public void run() {
                    int startAudioRecognize;
                    if (FilterManager.this.isValid() && FilterManager.this.mEffect.isAudioRecognizeAvailable() && (startAudioRecognize = FilterManager.this.mEffect.startAudioRecognize((ByteBuffer) buffer, i, i2, i3)) != 0) {
                        FilterManager.this.mErrorListener.onError(startAudioRecognize, "startAudioRecognize(ByteBuffer, " + i + ", " + i2 + ", " + i3 + ")");
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setFilter(final String str, final String str2, final float f, final float f2, final float f3) {
        final String callInfo = getCallInfo(str, str2, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8592319 */

            static {
                Covode.recordClassIndex(100474);
            }

            public void run() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(str, str2, f2, f3, f)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, callInfo);
                }
            }
        });
        return 0;
    }

    public static IFilterManager create(IInputAudioStream iInputAudioStream, Context context, Handler handler, IVideoEffectProcessor iVideoEffectProcessor, AudioDeviceModule audioDeviceModule, boolean z) {
        return new FilterManager(iInputAudioStream, context, handler, iVideoEffectProcessor, audioDeviceModule, z);
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void enableExpressionDetect(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8595850 */

            static {
                Covode.recordClassIndex(100510);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.enableExpressionDetect(z, z2, z3, z4, z5, z6);
                }
            }
        });
    }

    public FilterManager(IInputAudioStream iInputAudioStream, Context context, Handler handler, final IVideoEffectProcessor iVideoEffectProcessor, final AudioDeviceModule audioDeviceModule, final boolean z) {
        this.mHandler = handler;
        this.mContext = context;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC859242 */

                static {
                    Covode.recordClassIndex(100475);
                }

                public void run() {
                    MethodCollector.m26663i(2734);
                    if (!GlUtil.nativeIsOpenGlThread()) {
                        FilterManager.this.mHandler = null;
                    }
                    MethodCollector.m26664o(2734);
                }
            });
        }
        if (this.mHandler == null) {
            GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("LiveFilterThread");
            this.mGLThread = lockGLThread;
            lockGLThread.start();
            this.mHandler = this.mGLThread.getHandler();
        }
        this.mAudioStreamObserver = iInputAudioStream;
        this.mOrientationListener = new AlbumOrientationEventListener(context);
        this.mErrorListener = FilterManager$$Lambda$0.$instance;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC859353 */

            static {
                Covode.recordClassIndex(100486);
            }

            public void run() {
                IVideoEffectProcessor iVideoEffectProcessor = iVideoEffectProcessor;
                if (iVideoEffectProcessor != null) {
                    FilterManager.this.mEffect = iVideoEffectProcessor;
                } else {
                    if (z) {
                        EffectWrapper.setEffectEdgeLog(FilterManager.this.mEffectEdgeLog);
                    }
                    FilterManager.this.mEffect = new EffectWrapper(audioDeviceModule, z);
                    FilterManager.this.mIsEdgeRender = z;
                }
                if (!FilterManager.this.mEffect.valid()) {
                    FilterManager.this.mEffect.release();
                    FilterManager.this.mEffect = null;
                    return;
                }
                AudioDeviceModule.AudioRenderSink effectAudioRender = FilterManager.this.mEffect.getEffectAudioRender();
                if (!(effectAudioRender == null || FilterManager.this.mAudioStreamObserver == null)) {
                    effectAudioRender.setAudioTrack(FilterManager.this.mAudioStreamObserver.getAudioTrack());
                    effectAudioRender.setVolume(FilterManager.this.mEffectAudioVolume);
                    FilterManager.this.mAudioStreamObserver.getMixerDescription().volumeCoeff = FilterManager.this.mEffectAudioVolume;
                    FilterManager.this.mAudioStreamObserver.start();
                }
                AVLog.iow("FilterManager", "Using Effect info " + FilterManager.this.mEffect.name() + " " + FilterManager.this.mEffect.getEffectVersion());
                FilterManager.this.mOffscreenDraw = new GlRenderDrawer();
            }
        });
        this.mBufferPool = new FilterVideoBufferPool(this.mBufferPoolMaxSize);
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public int setFilter(final String str, final String str2, final float f, final float f2, final float f3, final boolean z) {
        final String callInfo = getCallInfo(str, str2, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8592520 */

            static {
                Covode.recordClassIndex(100476);
            }

            public void run() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(str, str2, f2, f3, f, z)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IFilterManager
    public void processTouchEventWithTouchType(final long j, final float f, final float f2, final float f3, final float f4, final int i, final int i2) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC8594337 */

            static {
                Covode.recordClassIndex(100494);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchEventWithTouchType(j, f, f2, f3, f4, i, i2);
                }
            }
        });
    }

    public void configEffect(final int i, final int i2, final String str, final String str2, final boolean z, final boolean z2, final String str3, final AssetManager assetManager, final Object obj) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.FilterManager.RunnableC859696 */

            static {
                Covode.recordClassIndex(100521);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    if (obj != null) {
                        FilterManager.this.mEffect.setResourceFinder(obj);
                    }
                    if (assetManager != null) {
                        FilterManager.this.mEffect.setAssetManager(assetManager);
                    }
                    FilterManager.this.mEffect.configEffect(i, i2, str, str2, z, z2, str3);
                    IVideoEffectProcessor.EffectMsgListener effectMsgListener = FilterManager.this.mMsgListener;
                    if (effectMsgListener != null) {
                        effectMsgListener.onMessageReceived(2139095041, 0, 0, null);
                    }
                }
            }
        });
    }
}
