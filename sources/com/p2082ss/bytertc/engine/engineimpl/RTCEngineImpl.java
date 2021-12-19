package com.p2082ss.bytertc.engine.engineimpl;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.bytertc.base.utils.NetworkConnectChangeReceiver;
import com.p2082ss.bytertc.base.utils.NetworkUtils;
import com.p2082ss.bytertc.base.utils.RtcContextUtils;
import com.p2082ss.bytertc.engine.IAudioFrameObserver;
import com.p2082ss.bytertc.engine.IMetadataObserver;
import com.p2082ss.bytertc.engine.IRTCAudioDeviceManager;
import com.p2082ss.bytertc.engine.IRTCRoom;
import com.p2082ss.bytertc.engine.InternalScreenSharingParams;
import com.p2082ss.bytertc.engine.InternalVideoStreamDescription;
import com.p2082ss.bytertc.engine.NativeFunctions;
import com.p2082ss.bytertc.engine.RTCAudioDeviceManager;
import com.p2082ss.bytertc.engine.RTCEngine;
import com.p2082ss.bytertc.engine.RTCEngineEx;
import com.p2082ss.bytertc.engine.RTCHttpClient;
import com.p2082ss.bytertc.engine.RTCRoom;
import com.p2082ss.bytertc.engine.SubscribeConfig;
import com.p2082ss.bytertc.engine.UserInfo;
import com.p2082ss.bytertc.engine.VideoCanvas;
import com.p2082ss.bytertc.engine.VideoStreamDescription;
import com.p2082ss.bytertc.engine.adapter.VideoSinkAdapter;
import com.p2082ss.bytertc.engine.adapter.VideoSinkTask;
import com.p2082ss.bytertc.engine.data.AudioFormat;
import com.p2082ss.bytertc.engine.data.AudioPerformanceProfile;
import com.p2082ss.bytertc.engine.data.AudioPlaybackDevice;
import com.p2082ss.bytertc.engine.data.CameraId;
import com.p2082ss.bytertc.engine.data.MediaInputType;
import com.p2082ss.bytertc.engine.data.MirrorMode;
import com.p2082ss.bytertc.engine.data.MuteState;
import com.p2082ss.bytertc.engine.data.RTCData;
import com.p2082ss.bytertc.engine.data.StreamIndex;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p2082ss.bytertc.engine.handler.IRTCEngineInternalEventHandler;
import com.p2082ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;
import com.p2082ss.bytertc.engine.handler.RTCAudioFrameObserver;
import com.p2082ss.bytertc.engine.handler.RTCEncryptHandler;
import com.p2082ss.bytertc.engine.handler.RTCEngineEventHandler;
import com.p2082ss.bytertc.engine.handler.RTCEngineInternalEventHandler;
import com.p2082ss.bytertc.engine.handler.RTCMetadataObserver;
import com.p2082ss.bytertc.engine.handler.RTCVideoFrameObserver;
import com.p2082ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.p2082ss.bytertc.engine.live.LiveTranscoding;
import com.p2082ss.bytertc.engine.live.LiveTranscodingObserver;
import com.p2082ss.bytertc.engine.loader.RTCNativeLibraryListenerImpl;
import com.p2082ss.bytertc.engine.loader.RTCNativeLibraryLoaderInfo;
import com.p2082ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener;
import com.p2082ss.bytertc.engine.mediaio.IVideoSink;
import com.p2082ss.bytertc.engine.mediaio.RTCVideoFrame;
import com.p2082ss.bytertc.engine.utils.AppMonitor;
import com.p2082ss.bytertc.engine.utils.AudioFrame;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import com.p2082ss.bytertc.engine.utils.VideoFrameConverter;
import com.p2082ss.bytertc.engine.video.ScreenSharingParameters;
import com.p2082ss.bytertc.engine.video.VideoEncoderConfiguration;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.bytertc.engine.engineimpl.RTCEngineImpl */
public class RTCEngineImpl extends RTCEngineEx {
    private static RTCAudioDeviceManager mAudioDeviceManager = null;
    private static WeakReference<IRTCAudioDeviceManager.IRTCAudioDeviceEventHandler> mAudioDeviceManagerEventHandler;
    private static String mDeviceId = "";
    private static boolean mLibraryLoaded;
    private static String mPackageName;
    private static RTCAudioDeviceEventHandler mRTCAudioDeviceManagerEventHandler = null;
    private static RTCNativeLibraryLoaderListener mRtcNativeLibraryListener = new RTCNativeLibraryListenerImpl();
    private static RTCHttpClient nativeHttpClient = null;
    private static RTCEngineImpl sRtcEngineInstance;
    private static RTCNativeLibraryLoaderInfo sRtcLoaderInfo = new RTCNativeLibraryLoaderInfo();
    private NetworkConnectChangeReceiver.Callback SetNetworkTypeCallback = new RTCEngineImpl$$Lambda$2(this);
    private AppMonitor.Callback appStateCallback = new RTCEngineImpl$$Lambda$1(this);
    private boolean isMultiRoom;
    private String mAppId;
    private boolean mAudioEnabled = true;
    private WeakReference<IAudioFrameObserver> mAudioFrameObserver;
    private BroadcastReceiver mBroadcastReceiver;
    private int mChannelProfile;
    private int mClientRole = 2;
    private Context mContext;
    private Handler mEglHandler;
    private HandlerThread mEglThread;
    private boolean mEnableTranscode;
    private RTCEngineEventHandler mEngineEventHandler;
    private RTCEngineInternalEventHandler mEngineInternalEventHandler;
    private boolean mIsFront = true;
    private boolean mIsUseCustomEglEnv;
    private boolean mIsVideoMirror = true;
    private LiveTranscoding mLiveTranscoding;
    private ILiveTranscodingObserver mLiveTranscodingObserver;
    private LogUtil.LoggerSink mLoggerSink = new RTCEngineImpl$$Lambda$0(this);
    private WeakReference<IMetadataObserver> mMetadataObserver;
    private long mNativeEngine = -1;
    private Runnable mOnDestroyCompletedCallback;
    private boolean mPushMode = true;
    private boolean mRequestSoftwareEncoder;
    private String mRoom;
    private EglBase mRootEglBase;
    private RTCAudioFrameObserver mRtcAudioFrameObserver;
    private WeakReference<IRTCEngineEventHandler> mRtcEngineHandler;
    private RTCMetadataObserver mRtcMetadataObserver;
    private RTCVideoFrameObserver mRtcVideoFrameObserver;
    private VideoFrameConverter mScreenFrameConverter;
    private String mSessionId;
    private State mState;
    private String mToken;
    private LiveTranscodingObserver mTranscodingObserver;
    private boolean mUseExtTexture;
    private boolean mUseExtVideoSource;
    private String mUser;
    private boolean mVideoEnabled = true;
    private VideoFrameConverter mVideoFrameConverter;
    private VideoSinkTask mVideoSinkTask;

    /* renamed from: com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m147870x962d1b30(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int replaceBackground(RTCEngine.BackgroundMode backgroundMode, RTCEngine.DivideModel divideModel) {
        return 0;
    }

    /* renamed from: com.ss.bytertc.engine.engineimpl.RTCEngineImpl$RtcHttpCallbackImpl */
    public static class RtcHttpCallbackImpl implements RTCHttpClient.RtcHttpCallback {
        private int callbackId;
        private int clientId;

        static {
            Covode.recordClassIndex(100999);
        }

        public int getCallbackId() {
            return this.callbackId;
        }

        public void setCallbackId(int i) {
            this.callbackId = i;
        }

        public void setClientId(int i) {
            this.clientId = i;
        }

        @Override // com.p2082ss.bytertc.engine.RTCHttpClient.RtcHttpCallback
        public void run(int i, String str) {
            MethodCollector.m26663i(2533);
            NativeFunctions.nativeHttpClientCallback(this.callbackId, this.clientId, i, str);
            MethodCollector.m26664o(2533);
        }
    }

    public ILiveTranscodingObserver getLiveTranscodingObserver() {
        return this.mLiveTranscodingObserver;
    }

    public String getLocalUser() {
        return this.mUser;
    }

    public String getRoomName() {
        return this.mRoom;
    }

    public VideoSinkTask getVideoSinkTask() {
        return this.mVideoSinkTask;
    }

    public static Context getApplicationContext() {
        return RtcContextUtils.getApplicationContext();
    }

    public static String getRtcPackageName() {
        String str = mPackageName;
        if (str != null) {
            return str;
        }
        return "";
    }

    public EglBase getEGLContext() {
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            return eglBase;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doDestroy$3$RTCEngineImpl() {
        Runnable runnable = this.mOnDestroyCompletedCallback;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static IRTCAudioDeviceManager.IRTCAudioDeviceEventHandler getAudioDeviceManagerEvent() {
        return mAudioDeviceManagerEventHandler.get();
    }

    public IAudioFrameObserver getAudioFrameObserver() {
        return this.mAudioFrameObserver.get();
    }

    public IMetadataObserver getMetadataObserver() {
        return this.mMetadataObserver.get();
    }

    public IRTCEngineEventHandler getRtcEngineHandler() {
        return this.mRtcEngineHandler.get();
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public boolean isLocalVideoMirrorOn() {
        MethodCollector.m26663i(5160);
        boolean nativeIsMirror = NativeFunctions.nativeIsMirror(this.mNativeEngine);
        MethodCollector.m26664o(5160);
        return nativeIsMirror;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doDestroy$4$RTCEngineImpl() {
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.mRootEglBase = null;
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int stopScreenSharing() {
        MethodCollector.m26663i(8774);
        int nativeStopScreenSharing = NativeFunctions.nativeStopScreenSharing(this.mNativeEngine);
        MethodCollector.m26664o(8774);
        return nativeStopScreenSharing;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void disableExternalAudioDevice() {
        MethodCollector.m26663i(7566);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, disableExternalAudioDevice failed.");
            MethodCollector.m26664o(7566);
            return;
        }
        NativeFunctions.nativeDisableExternalAudioDevice(j);
        MethodCollector.m26664o(7566);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public boolean isSpeakerphoneEnabled() {
        Context context = this.mContext;
        if (context == null) {
            return false;
        }
        return ((AudioManager) m147868xe4665a54(context, DataType.AUDIO)).isSpeakerphoneOn();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bytertc.engine.engineimpl.RTCEngineImpl$State */
    public enum State {
        IDLE,
        IN_ROOM,
        DESTORY;

        static {
            Covode.recordClassIndex(101000);
        }
    }

    static {
        Covode.recordClassIndex(100991);
        loadSoFile();
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int getAudioMixingCurrentPosition() {
        MethodCollector.m26663i(4519);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, getAudioMixingCurrentPosition failed.");
            MethodCollector.m26664o(4519);
            return -1;
        }
        int nativeGetAudioMixingCurrentPosition = NativeFunctions.nativeGetAudioMixingCurrentPosition(j);
        MethodCollector.m26664o(4519);
        return nativeGetAudioMixingCurrentPosition;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int getAudioMixingDuration() {
        MethodCollector.m26663i(4395);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, getAudioMixingDuration failed.");
            MethodCollector.m26664o(4395);
            return -1;
        }
        int nativeGetAudioMixingDuration = NativeFunctions.nativeGetAudioMixingDuration(j);
        MethodCollector.m26664o(4395);
        return nativeGetAudioMixingDuration;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int getAudioMixingStreamCachedFrameNum() {
        MethodCollector.m26663i(160);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, getAudioMixingStreamCachedFrameNum failed.");
            MethodCollector.m26664o(160);
            return -1;
        }
        int nativeGetAudioMixingStreamCachedFrameNum = NativeFunctions.nativeGetAudioMixingStreamCachedFrameNum(j);
        MethodCollector.m26664o(160);
        return nativeGetAudioMixingStreamCachedFrameNum;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int pauseAllEffects() {
        MethodCollector.m26663i(4955);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, pauseAllEffects failed.");
            MethodCollector.m26664o(4955);
            return -1;
        }
        int nativePauseAllEffects = NativeFunctions.nativePauseAllEffects(j);
        MethodCollector.m26664o(4955);
        return nativePauseAllEffects;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int pauseAudioMixing() {
        MethodCollector.m26663i(4339);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, pauseAudioMixing failed.");
            MethodCollector.m26664o(4339);
            return -1;
        }
        int nativePauseAudioMixing = NativeFunctions.nativePauseAudioMixing(j);
        MethodCollector.m26664o(4339);
        return nativePauseAudioMixing;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int publishScreen() {
        MethodCollector.m26663i(8045);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, publishScreen failed.");
            MethodCollector.m26664o(8045);
            return -1;
        }
        int nativePublishScreen = NativeFunctions.nativePublishScreen(j);
        MethodCollector.m26664o(8045);
        return nativePublishScreen;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int resumeAllEffects() {
        MethodCollector.m26663i(5018);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, resumeAllEffects failed.");
            MethodCollector.m26664o(5018);
            return -1;
        }
        int nativeResumeAllEffects = NativeFunctions.nativeResumeAllEffects(j);
        MethodCollector.m26664o(5018);
        return nativeResumeAllEffects;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int resumeAudioMixing() {
        MethodCollector.m26663i(4344);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, resumeAudioMixing failed.");
            MethodCollector.m26664o(4344);
            return -1;
        }
        int nativeResumeAudioMixing = NativeFunctions.nativeResumeAudioMixing(j);
        MethodCollector.m26664o(4344);
        return nativeResumeAudioMixing;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void startAudioCapture() {
        MethodCollector.m26663i(4007);
        LogUtil.m147885d("RtcEngineImpl", "startAudioCapture");
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, startAudioCapture failed.");
            MethodCollector.m26664o(4007);
            return;
        }
        NativeFunctions.nativeStartAudioCapture(j);
        MethodCollector.m26664o(4007);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void startVideoCapture() {
        MethodCollector.m26663i(3994);
        LogUtil.m147885d("RtcEngineImpl", "startVideoCapture");
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, startVideoCapture failed.");
            MethodCollector.m26664o(3994);
            return;
        }
        NativeFunctions.nativeStartVideoCapture(j);
        MethodCollector.m26664o(3994);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int stopAllEffects() {
        MethodCollector.m26663i(4946);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, stopAllEffects failed.");
            MethodCollector.m26664o(4946);
            return -1;
        }
        int nativeStopAllEffects = NativeFunctions.nativeStopAllEffects(j);
        MethodCollector.m26664o(4946);
        return nativeStopAllEffects;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void stopAudioCapture() {
        MethodCollector.m26663i(4074);
        LogUtil.m147885d("RtcEngineImpl", "stopAudioCapture");
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, stopAudioCapture failed.");
            MethodCollector.m26664o(4074);
            return;
        }
        NativeFunctions.nativeStopAudioCapture(j);
        MethodCollector.m26664o(4074);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int stopAudioMixing() {
        MethodCollector.m26663i(4119);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, stopAudioMixing failed.");
            MethodCollector.m26664o(4119);
            return -1;
        }
        NativeFunctions.nativeStopAudioMixing(j);
        MethodCollector.m26664o(4119);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void stopCloudRendering() {
        MethodCollector.m26663i(667);
        if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, stopCloudRendering failed.");
            MethodCollector.m26664o(667);
            return;
        }
        String cloudRenderingInfo = getCloudRenderingInfo("stopped", "");
        if (cloudRenderingInfo == null) {
            MethodCollector.m26664o(667);
            return;
        }
        NativeFunctions.nativeUpdateCloudRending(this.mNativeEngine, cloudRenderingInfo);
        MethodCollector.m26664o(667);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void stopLiveTranscoding() {
        MethodCollector.m26663i(6523);
        LogUtil.m147885d("RtcEngineImpl", "disableLiveTranscoding...");
        this.mEnableTranscode = false;
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, disableLiveTranscoding failed.");
            MethodCollector.m26664o(6523);
            return;
        }
        NativeFunctions.nativeStopLiveTranscoding(j);
        MethodCollector.m26664o(6523);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void stopVideoCapture() {
        MethodCollector.m26663i(3999);
        LogUtil.m147885d("RtcEngineImpl", "stopVideoCapture");
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, stopVideoCapture failed.");
            MethodCollector.m26664o(3999);
            return;
        }
        NativeFunctions.nativeStopVideoCapture(j);
        MethodCollector.m26664o(3999);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int unloadAllEffects() {
        MethodCollector.m26663i(4953);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, unloadAllEffects failed.");
            MethodCollector.m26664o(4953);
            return -1;
        }
        int nativeUnloadAllEffects = NativeFunctions.nativeUnloadAllEffects(j);
        MethodCollector.m26664o(4953);
        return nativeUnloadAllEffects;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int unpublishScreen() {
        MethodCollector.m26663i(8180);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, unpublishScreen failed.");
            MethodCollector.m26664o(8180);
            return -1;
        }
        int nativeUnpublishScreen = NativeFunctions.nativeUnpublishScreen(j);
        MethodCollector.m26664o(8180);
        return nativeUnpublishScreen;
    }

    public static String getSdkVersion() {
        MethodCollector.m26663i(5240);
        if (!mLibraryLoaded) {
            MethodCollector.m26664o(5240);
            return "";
        }
        try {
            NativeFunctions.nativeGetSDKVersion();
            String nativeGetSDKVersion = NativeFunctions.nativeGetSDKVersion();
            MethodCollector.m26664o(5240);
            return nativeGetSDKVersion;
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("rtc loader info:" + sRtcLoaderInfo.toString() + " exception info:" + e.getStackTrace().toString());
            MethodCollector.m26664o(5240);
            throw unsatisfiedLinkError;
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int leaveRoom() {
        IRTCEngineEventHandler iRTCEngineEventHandler;
        MethodCollector.m26663i(5230);
        LogUtil.m147885d("RtcEngineImpl", "leaveChannel");
        if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, leaveChannel failed.");
            MethodCollector.m26664o(5230);
            return -1;
        }
        this.mState = State.IDLE;
        this.mRoom = "";
        this.mUser = "";
        this.mSessionId = "";
        this.mToken = "";
        WeakReference<IRTCEngineEventHandler> weakReference = this.mRtcEngineHandler;
        if (!(weakReference == null || (iRTCEngineEventHandler = weakReference.get()) == null)) {
            iRTCEngineEventHandler.onLeaveRoom(null);
        }
        NativeFunctions.nativeLeaveRoom(this.mNativeEngine);
        MethodCollector.m26664o(5230);
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bytertc.engine.engineimpl.RTCEngineImpl$1 */
    public static /* synthetic */ class C860951 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$AudioScenarioType;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$ClientRole;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$Env;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|(2:15|16)|17|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|42) */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0055 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a9 */
        static {
            /*
            // Method dump skipped, instructions count: 180
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl.C860951.<clinit>():void");
        }
    }

    private static void loadSoFile() {
        if (mLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready("volcenginertc");
        } else {
            if (mRtcNativeLibraryLoader != null) {
                mLibraryLoaded = true;
                boolean load = mRtcNativeLibraryLoader.load("byteaudio") & true;
                mLibraryLoaded = load;
                boolean load2 = load & mRtcNativeLibraryLoader.load("volcenginertc");
                mLibraryLoaded = load2;
                if (load2) {
                    mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
                } else {
                    mRtcNativeLibraryListener.onLoadError("volcenginertc");
                }
                sRtcLoaderInfo.setLoaderClassName(mRtcNativeLibraryLoader.getClass().getSimpleName());
            } else {
                try {
                    mLibraryLoaded &= mRtcNativeLibraryLoader.load("byteaudio");
                    m147869x70927003("volcenginertc");
                    mLibraryLoaded = true;
                    mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
                    sRtcLoaderInfo.setLoaderClassName("System.loader");
                } catch (UnsatisfiedLinkError e) {
                    LogUtil.m147887e("RtcEngineImpl", "Failed to load native library: volcenginertc", e);
                }
                mRtcNativeLibraryListener.onLoadError("volcenginertc");
            }
            sRtcLoaderInfo.setLoadResult(mLibraryLoaded);
            sRtcLoaderInfo.setLoadTimeStamp(System.currentTimeMillis());
            sRtcLoaderInfo.setSdkVersion(RTCEngine.getSdkVersion());
        }
        sRtcLoaderInfo.loadLibrary();
    }

    public void doDestroy() {
        MethodCollector.m26663i(3800);
        LogUtil.m147885d("RtcEngineImpl", "destroy RtcEngineImpl.");
        if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, no need to destroy now.");
            MethodCollector.m26664o(3800);
            return;
        }
        this.mState = State.DESTORY;
        NetworkUtils.unregisterReceiver(this.mContext, this.mBroadcastReceiver);
        this.mBroadcastReceiver = null;
        NativeFunctions.nativeDestroyEngine(this.mNativeEngine);
        this.mNativeEngine = -1;
        this.mIsFront = true;
        this.mIsVideoMirror = true;
        this.mVideoFrameConverter.dispose();
        this.mVideoFrameConverter = null;
        this.mScreenFrameConverter.dispose();
        this.mScreenFrameConverter = null;
        new Handler(Looper.getMainLooper()).post(new RTCEngineImpl$$Lambda$4(this));
        AppMonitor.get(this.mContext).unRegister(this.appStateCallback).release(this.mContext);
        ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, new RTCEngineImpl$$Lambda$5(this));
        HandlerThread handlerThread = this.mEglThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        VideoSinkTask videoSinkTask = this.mVideoSinkTask;
        if (videoSinkTask != null) {
            videoSinkTask.exit();
        }
        LogUtil.setLoggerSink(null);
        MethodCollector.m26664o(3800);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setOnDestroyCompletedCallback(Runnable runnable) {
        this.mOnDestroyCompletedCallback = runnable;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public boolean pushExternalVideoFrame(RTCVideoFrame rTCVideoFrame) {
        return pushExternalVideoFrame(rTCVideoFrame, this.mIsUseCustomEglEnv);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setInternalEventHandler(IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler) {
        this.mEngineInternalEventHandler.setInternalEventHandler(iRTCEngineInternalEventHandler);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setVideoEncoderConfig(List<VideoStreamDescription> list) {
        return setVideoEncoderConfig(list, VideoEncoderConfiguration.OrientationMode.ORIENTATION_MODE_ADAPTIVE);
    }

    /* renamed from: com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147869x70927003(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    /* renamed from: com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m147871xb2625d48(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setRtcEngineEventHandler(IRTCEngineEventHandler iRTCEngineEventHandler) {
        LogUtil.m147885d("RtcEngineImpl", "setRtcEngineEventHandler");
        this.mRtcEngineHandler = new WeakReference<>(iRTCEngineEventHandler);
    }

    /* renamed from: com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m147867x180c6a83(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    public static IRTCAudioDeviceManager createAudioDeviceManager(IRTCAudioDeviceManager.IRTCAudioDeviceEventHandler iRTCAudioDeviceEventHandler) {
        mAudioDeviceManagerEventHandler = new WeakReference<>(iRTCAudioDeviceEventHandler);
        RTCAudioDeviceManager rTCAudioDeviceManager = mAudioDeviceManager;
        if (rTCAudioDeviceManager != null) {
            return rTCAudioDeviceManager;
        }
        mRTCAudioDeviceManagerEventHandler = new RTCAudioDeviceEventHandler();
        RTCAudioDeviceManager rTCAudioDeviceManager2 = new RTCAudioDeviceManager(mRTCAudioDeviceManagerEventHandler);
        mAudioDeviceManager = rTCAudioDeviceManager2;
        return rTCAudioDeviceManager2;
    }

    public static String getErrorDescription(int i) {
        String str;
        MethodCollector.m26663i(5297);
        if (i != -1072) {
            str = NativeFunctions.nativeGetErrorDescription(i);
        } else {
            str = "Failed to load library.";
        }
        MethodCollector.m26664o(5297);
        return str;
    }

    public static int setDeviceId(String str) {
        MethodCollector.m26663i(3814);
        if (str == null) {
            MethodCollector.m26664o(3814);
            return -1;
        }
        mDeviceId = str;
        if (!mLibraryLoaded) {
            MethodCollector.m26664o(3814);
            return -1;
        }
        int nativeSetDeviceId = NativeFunctions.nativeSetDeviceId(str);
        MethodCollector.m26664o(3814);
        return nativeSetDeviceId;
    }

    public static void setRtcHttpClient(RTCHttpClient rTCHttpClient) {
        MethodCollector.m26663i(189);
        if (mLibraryLoaded) {
            nativeHttpClient = rTCHttpClient;
            NativeFunctions.nativeSetUpperHttpClient(true);
        }
        MethodCollector.m26664o(189);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$1$RTCEngineImpl(int i) {
        String str;
        MethodCollector.m26663i(732);
        long j = this.mNativeEngine;
        if (i == 1) {
            str = "active";
        } else {
            str = "background";
        }
        NativeFunctions.nativeSetAppState(j, str);
        MethodCollector.m26664o(732);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$5$RTCEngineImpl(int i) {
        MethodCollector.m26663i(721);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, SetNetworkType failed.");
            MethodCollector.m26664o(721);
            return;
        }
        NativeFunctions.nativeSetNetworkType(j, i);
        MethodCollector.m26664o(721);
    }

    public void setAudioMode(int i) {
        AudioManager audioManager;
        Context context = this.mContext;
        if (context != null && (audioManager = (AudioManager) m147868xe4665a54(context, DataType.AUDIO)) != null && audioManager.getMode() != i) {
            audioManager.setMode(i);
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setCustomizeEncryptHandler(RTCEncryptHandler rTCEncryptHandler) {
        MethodCollector.m26663i(397);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setCustomizeEncryptHandler failed.");
            MethodCollector.m26664o(397);
            return;
        }
        NativeFunctions.nativeSetCustomizeEncryptHandler(j, rTCEncryptHandler);
        MethodCollector.m26664o(397);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setLocalVideoMirrorMode(MirrorMode mirrorMode) {
        boolean z;
        MethodCollector.m26663i(5159);
        if (mirrorMode != MirrorMode.MIRROR_MODE_OFF) {
            z = true;
        } else {
            z = false;
        }
        this.mIsVideoMirror = z;
        NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeEngine, mirrorMode.value());
        MethodCollector.m26664o(5159);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setPlaybackVolume(int i) {
        MethodCollector.m26663i(4335);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setPlaybackVolume failed.");
            MethodCollector.m26664o(4335);
            return;
        }
        NativeFunctions.nativeSetPlaybackVolume(j, i);
        MethodCollector.m26664o(4335);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setRecordingVolume(int i) {
        MethodCollector.m26663i(4121);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setRecordingVolume failed.");
            MethodCollector.m26664o(4121);
            return;
        }
        NativeFunctions.nativeSetRecordingVolume(j, i);
        MethodCollector.m26664o(4121);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setVideoEffectAlgoModelPath(String str) {
        MethodCollector.m26663i(438);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setVideoEffectAlgoModelPath failed.");
            MethodCollector.m26664o(438);
            return;
        }
        NativeFunctions.nativeInitVideoEffect(j, str);
        MethodCollector.m26664o(438);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setVideoEffectColorFilter(String str) {
        MethodCollector.m26663i(408);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setVideoEffectColorFilter failed.");
            MethodCollector.m26664o(408);
            return;
        }
        NativeFunctions.nativeSetVideoEffectColorFilter(j, str);
        MethodCollector.m26664o(408);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setVideoEffectColorFilterIntensity(float f) {
        MethodCollector.m26663i(419);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setVideoEffectColorFilterIntensity failed.");
            MethodCollector.m26664o(419);
            return;
        }
        NativeFunctions.nativeSetVideoEffectColorFilterIntensity(j, f);
        MethodCollector.m26664o(419);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int updateScreenSharingParameters(ScreenSharingParameters screenSharingParameters) {
        MethodCollector.m26663i(8622);
        int nativeUpdateScreenSharingParameters = NativeFunctions.nativeUpdateScreenSharingParameters(this.mNativeEngine, new InternalScreenSharingParams(screenSharingParameters));
        MethodCollector.m26664o(8622);
        return nativeUpdateScreenSharingParameters;
    }

    private long getNativeEglHandle(RTCVideoFrame rTCVideoFrame) {
        if (rTCVideoFrame == null || rTCVideoFrame.eglContext14 == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return rTCVideoFrame.eglContext14.getNativeHandle();
        }
        int i = Build.VERSION.SDK_INT;
        return (long) rTCVideoFrame.eglContext14.getHandle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r3 != 3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int setEnv(com.p2082ss.bytertc.engine.RTCEngine.Env r5) {
        /*
            r4 = 3867(0xf1b, float:5.419E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            boolean r0 = com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl.mLibraryLoaded
            if (r0 != 0) goto L_0x000e
            r0 = -1
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        L_0x000e:
            int[] r1 = com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl.C860951.$SwitchMap$com$ss$bytertc$engine$RTCEngine$Env
            int r0 = r5.ordinal()
            r3 = r1[r0]
            r2 = 2
            r1 = 1
            r0 = 0
            if (r3 == r1) goto L_0x0020
            if (r3 == r2) goto L_0x0029
            r0 = 3
            if (r3 == r0) goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            int r0 = com.p2082ss.bytertc.engine.NativeFunctions.nativeSetEnv(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        L_0x0029:
            r2 = 1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl.setEnv(com.ss.bytertc.engine.RTCEngine$Env):int");
    }

    public static int setParameters(String str) {
        MethodCollector.m26663i(4106);
        if (!mLibraryLoaded) {
            MethodCollector.m26664o(4106);
            return -1;
        } else if (str == null || str.isEmpty()) {
            MethodCollector.m26664o(4106);
            return -1;
        } else {
            int nativeSetParameters = NativeFunctions.nativeSetParameters(str);
            MethodCollector.m26664o(4106);
            return nativeSetParameters;
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int EnableRangeAudio(boolean z) {
        MethodCollector.m26663i(349);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, EnableRangeAudio failed.");
            MethodCollector.m26664o(349);
            return -1;
        }
        int nativeEnableRangeAudio = NativeFunctions.nativeEnableRangeAudio(j, z);
        MethodCollector.m26664o(349);
        return nativeEnableRangeAudio;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int SetAudioRecvMode(RTCEngine.RangeAudioMode rangeAudioMode) {
        MethodCollector.m26663i(340);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, SetAudioRecvMode failed.");
            MethodCollector.m26664o(340);
            return -1;
        }
        int nativeSetAudioRecvMode = NativeFunctions.nativeSetAudioRecvMode(j, rangeAudioMode.value());
        MethodCollector.m26664o(340);
        return nativeSetAudioRecvMode;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int SetAudioSendMode(RTCEngine.RangeAudioMode rangeAudioMode) {
        MethodCollector.m26663i(332);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, SetAudioSendMode failed.");
            MethodCollector.m26664o(332);
            return -1;
        }
        int nativeSetAudioSendMode = NativeFunctions.nativeSetAudioSendMode(j, rangeAudioMode.value());
        MethodCollector.m26664o(332);
        return nativeSetAudioSendMode;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int SetRtcMode(RTCEngine.RtcMode rtcMode) {
        MethodCollector.m26663i(328);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, SetRtcMode failed.");
            MethodCollector.m26664o(328);
            return -1;
        }
        int nativeSetRtcMode = NativeFunctions.nativeSetRtcMode(j, rtcMode.value());
        MethodCollector.m26664o(328);
        return nativeSetRtcMode;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int SetTeamId(String str) {
        MethodCollector.m26663i(342);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, SetTeamId failed.");
            MethodCollector.m26664o(342);
            return -1;
        }
        int nativeSetTeamId = NativeFunctions.nativeSetTeamId(j, str);
        MethodCollector.m26664o(342);
        return nativeSetTeamId;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void addVideoEffectPath(List<String> list) {
        MethodCollector.m26663i(468);
        if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, addVideoEffectPath failed.");
            MethodCollector.m26664o(468);
            return;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        NativeFunctions.nativeAddVideoEffectPath(this.mNativeEngine, strArr);
        MethodCollector.m26664o(468);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int adjustAudioMixingPlayoutVolume(int i) {
        MethodCollector.m26663i(4530);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingPlayoutVolume failed.");
            MethodCollector.m26664o(4530);
            return -1;
        }
        int nativeAdjustAudioMixingPlayoutVolume = NativeFunctions.nativeAdjustAudioMixingPlayoutVolume(j, i);
        MethodCollector.m26664o(4530);
        return nativeAdjustAudioMixingPlayoutVolume;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int adjustAudioMixingPublishVolume(int i) {
        MethodCollector.m26663i(4581);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingPublishVolume failed.");
            MethodCollector.m26664o(4581);
            return -1;
        }
        int nativeAdjustAudioMixingPublishVolume = NativeFunctions.nativeAdjustAudioMixingPublishVolume(j, i);
        MethodCollector.m26664o(4581);
        return nativeAdjustAudioMixingPublishVolume;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int adjustAudioMixingVolume(int i) {
        MethodCollector.m26663i(4349);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingVolume failed.");
            MethodCollector.m26664o(4349);
            return -1;
        }
        int nativeAdjustAudioMixingVolume = NativeFunctions.nativeAdjustAudioMixingVolume(j, i);
        MethodCollector.m26664o(4349);
        return nativeAdjustAudioMixingVolume;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public IRTCRoom createRoom(String str) {
        MethodCollector.m26663i(321);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, createRoom failed.");
            MethodCollector.m26664o(321);
            return null;
        }
        long nativeCreateRtcRoom = NativeFunctions.nativeCreateRtcRoom(j, str);
        if (nativeCreateRtcRoom == 0) {
            LogUtil.m147886e("RtcEngineImpl", "createRoom faildd, native room is invalid");
            MethodCollector.m26664o(321);
            return null;
        }
        RTCRoom rTCRoom = new RTCRoom(str, nativeCreateRtcRoom, this);
        this.isMultiRoom = true;
        MethodCollector.m26664o(321);
        return rTCRoom;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void enableSubscribeLocalStream(boolean z) {
        MethodCollector.m26663i(6955);
        LogUtil.m147885d("RtcEngineImpl", "enableSubscribeLocalStream: ".concat(String.valueOf(z)));
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, enableSubscribeLocalStream failed.");
            MethodCollector.m26664o(6955);
            return;
        }
        NativeFunctions.nativeEnableSubscribeLocalStream(j, z);
        MethodCollector.m26664o(6955);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int enableVideoEffect(boolean z) {
        MethodCollector.m26663i(452);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, enableVideoEffect failed.");
            MethodCollector.m26664o(452);
            return -1;
        }
        int nativeEnableVideoEffect = NativeFunctions.nativeEnableVideoEffect(j, z);
        MethodCollector.m26664o(452);
        return nativeEnableVideoEffect;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int getEffectVolume(int i) {
        MethodCollector.m26663i(4594);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, getEffectVolume failed.");
            MethodCollector.m26664o(4594);
            return -1;
        }
        int nativeGetEffectVolume = NativeFunctions.nativeGetEffectVolume(j, i);
        MethodCollector.m26664o(4594);
        return nativeGetEffectVolume;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void muteAllRemoteAudio(MuteState muteState) {
        MethodCollector.m26663i(5534);
        LogUtil.m147885d("RtcEngineImpl", "muteAllRemoteAudio: " + muteState.value());
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, muteAllRemoteAudio failed.");
            MethodCollector.m26664o(5534);
            return;
        }
        NativeFunctions.nativeMuteAllRemoteAudio(j, muteState.value());
        MethodCollector.m26664o(5534);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int muteAllRemoteVideo(MuteState muteState) {
        boolean z;
        MethodCollector.m26663i(6222);
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.m147885d("RtcEngineImpl", "muteAllRemoteVideoStreams: ".concat(String.valueOf(z)));
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, muteAllRemoteVideoStreams failed.");
            MethodCollector.m26664o(6222);
            return -1;
        }
        NativeFunctions.nativeMuteAllRemoteVideo(j, muteState.value());
        MethodCollector.m26664o(6222);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void muteLocalAudio(MuteState muteState) {
        MethodCollector.m26663i(5419);
        LogUtil.m147885d("RtcEngineImpl", "muteLocalAudio " + muteState.value());
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, muteLocalAudio failed.");
            MethodCollector.m26664o(5419);
            return;
        }
        NativeFunctions.nativeMuteLocalAudio(j, muteState.value());
        MethodCollector.m26664o(5419);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int muteLocalVideo(MuteState muteState) {
        boolean z;
        MethodCollector.m26663i(6071);
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.m147885d("RtcEngineImpl", "muteLocalVideoStream: ".concat(String.valueOf(z)));
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, muteLocalVideoStream failed.");
            MethodCollector.m26664o(6071);
            return -1;
        }
        NativeFunctions.nativeMuteLocalVideo(j, muteState.value());
        MethodCollector.m26664o(6071);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int pauseEffect(int i) {
        MethodCollector.m26663i(4822);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, pauseEffect failed.");
            MethodCollector.m26664o(4822);
            return -1;
        }
        int nativePauseEffect = NativeFunctions.nativePauseEffect(j, i);
        MethodCollector.m26664o(4822);
        return nativePauseEffect;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int pullExternalAudioFrame(AudioFrame audioFrame) {
        MethodCollector.m26663i(7888);
        if (this.mNativeEngine == -1 || this.mState == State.DESTORY) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, pullExternalAudioFrame failed.");
            MethodCollector.m26664o(7888);
            return -1;
        } else if (NativeFunctions.nativePullExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples)) {
            MethodCollector.m26664o(7888);
            return 0;
        } else {
            MethodCollector.m26664o(7888);
            return -2;
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int pushExternalAudioFrame(AudioFrame audioFrame) {
        MethodCollector.m26663i(7744);
        if (this.mNativeEngine == -1 || this.mState == State.DESTORY) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, pushExternalAudioFrame failed.");
            MethodCollector.m26664o(7744);
            return -1;
        } else if (NativeFunctions.nativePushExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples)) {
            MethodCollector.m26664o(7744);
            return 0;
        } else {
            MethodCollector.m26664o(7744);
            return -2;
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public boolean pushScreenFrame(RTCVideoFrame rTCVideoFrame) {
        MethodCollector.m26663i(8326);
        VideoFrameConverter videoFrameConverter = this.mScreenFrameConverter;
        if (videoFrameConverter != null) {
            VideoFrame convert2I420Frame = videoFrameConverter.convert2I420Frame(rTCVideoFrame);
            if (convert2I420Frame != null) {
                long j = this.mNativeEngine;
                if (j == -1) {
                    LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, pushScreenFrame failed.");
                    MethodCollector.m26664o(8326);
                    return false;
                }
                boolean nativePushScreenFrame = NativeFunctions.nativePushScreenFrame(j, convert2I420Frame);
                convert2I420Frame.release();
                MethodCollector.m26664o(8326);
                return nativePushScreenFrame;
            }
            MethodCollector.m26664o(8326);
            return false;
        }
        MethodCollector.m26664o(8326);
        return false;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        MethodCollector.m26663i(5122);
        this.mAudioFrameObserver = new WeakReference<>(iAudioFrameObserver);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, registerAudioFrameObserver failed.");
            MethodCollector.m26664o(5122);
            return -1;
        }
        if (iAudioFrameObserver == null) {
            NativeFunctions.nativeSetAudioFrameObserver(j, null);
        } else {
            NativeFunctions.nativeSetAudioFrameObserver(j, this.mRtcAudioFrameObserver);
        }
        MethodCollector.m26664o(5122);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void registerMetadataObserver(IMetadataObserver iMetadataObserver) {
        MethodCollector.m26663i(379);
        this.mMetadataObserver = new WeakReference<>(iMetadataObserver);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, registerMetadataObserver failed.");
            MethodCollector.m26664o(379);
        } else if (iMetadataObserver == null) {
            NativeFunctions.nativeSetMetadataObserver(j, null);
            MethodCollector.m26664o(379);
        } else {
            NativeFunctions.nativeSetMetadataObserver(j, this.mRtcMetadataObserver);
            MethodCollector.m26664o(379);
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void removeVideoEffectPath(List<String> list) {
        MethodCollector.m26663i(475);
        if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, removeVideoEffectPath failed.");
            MethodCollector.m26664o(475);
            return;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        NativeFunctions.nativeRemoveVideoEffectPath(this.mNativeEngine, strArr);
        MethodCollector.m26664o(475);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int resumeEffect(int i) {
        MethodCollector.m26663i(4887);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, resumeEffect failed.");
            MethodCollector.m26664o(4887);
            return -1;
        }
        int nativeResumeEffect = NativeFunctions.nativeResumeEffect(j, i);
        MethodCollector.m26664o(4887);
        return nativeResumeEffect;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public long sendRoomBinaryMessage(byte[] bArr) {
        MethodCollector.m26663i(97);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, sendCustomMessage failed.");
            MethodCollector.m26664o(97);
            return -1;
        }
        long nativeSendRoomBinaryMessage = (long) NativeFunctions.nativeSendRoomBinaryMessage(j, bArr);
        MethodCollector.m26664o(97);
        return nativeSendRoomBinaryMessage;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public long sendRoomMessage(String str) {
        MethodCollector.m26663i(90);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, sendCustomMessage failed.");
            MethodCollector.m26664o(90);
            return -1;
        }
        long nativeSendRoomMessage = (long) NativeFunctions.nativeSendRoomMessage(j, str);
        MethodCollector.m26664o(90);
        return nativeSendRoomMessage;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setAudioMixingPosition(int i) {
        MethodCollector.m26663i(4526);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setAudioMixingPosition failed.");
            MethodCollector.m26664o(4526);
            return -1;
        }
        int nativeSetAudioMixingPosition = NativeFunctions.nativeSetAudioMixingPosition(j, i);
        MethodCollector.m26664o(4526);
        return nativeSetAudioMixingPosition;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setAudioPerformanceProfile(AudioPerformanceProfile audioPerformanceProfile) {
        MethodCollector.m26663i(388);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setAudioPerformanceProfile failed.");
            MethodCollector.m26664o(388);
        } else if (audioPerformanceProfile == null) {
            LogUtil.m147886e("RtcEngineImpl", "parameter is invalid, setAudioPerformanceProfile failed.");
            MethodCollector.m26664o(388);
        } else {
            NativeFunctions.nativeSetAudioPerformanceProfile(j, audioPerformanceProfile.value());
            MethodCollector.m26664o(388);
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setAudioPlaybackDevice(AudioPlaybackDevice audioPlaybackDevice) {
        MethodCollector.m26663i(6811);
        LogUtil.m147885d("RtcEngineImpl", "setAudioPlaybackDevice: " + audioPlaybackDevice.value());
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setAudioPlaybackDevice failed.");
            MethodCollector.m26664o(6811);
            return -1;
        }
        int nativeSetAudioPlaybackDevice = NativeFunctions.nativeSetAudioPlaybackDevice(j, audioPlaybackDevice.value());
        MethodCollector.m26664o(6811);
        return nativeSetAudioPlaybackDevice;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setAudioVolumeIndicationInterval(int i) {
        MethodCollector.m26663i(6223);
        LogUtil.m147885d("RtcEngineImpl", "setAudioVolumeIndicationInterval interval: ".concat(String.valueOf(i)));
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setAudioVolumeIndicationInterval failed.");
            MethodCollector.m26664o(6223);
            return;
        }
        NativeFunctions.nativeSetAudioVolumeIndicationInterval(j, i);
        MethodCollector.m26664o(6223);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setBusinessId(String str) {
        MethodCollector.m26663i(381);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setBusinessId failed.");
            MethodCollector.m26664o(381);
            return -1;
        }
        int nativeSetBusinessId = NativeFunctions.nativeSetBusinessId(j, str);
        MethodCollector.m26664o(381);
        return nativeSetBusinessId;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setEffectsVolume(int i) {
        MethodCollector.m26663i(4673);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setEffectsVolume failed.");
            MethodCollector.m26664o(4673);
            return -1;
        }
        int nativeSetEffectsVolume = NativeFunctions.nativeSetEffectsVolume(j, i);
        MethodCollector.m26664o(4673);
        return nativeSetEffectsVolume;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setPublishFallbackOption(RTCEngine.PublishFallbackOption publishFallbackOption) {
        MethodCollector.m26663i(358);
        LogUtil.m147885d("RtcEngineImpl", "setPublishFallbackOption: option: ".concat(String.valueOf(publishFallbackOption)));
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setPublishFallbackOption failed.");
            MethodCollector.m26664o(358);
            return -1;
        }
        NativeFunctions.nativeSetPublishFallbackOption(j, publishFallbackOption.value());
        MethodCollector.m26664o(358);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setRemoteSubscribeFallbackOption(RTCEngine.SubscribeFallbackOptions subscribeFallbackOptions) {
        MethodCollector.m26663i(360);
        LogUtil.m147885d("RtcEngineImpl", "setRemoteSubscribeFallbackOption: option: ".concat(String.valueOf(subscribeFallbackOptions)));
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setRemoteSubscribeFallbackOption failed.");
            MethodCollector.m26664o(360);
            return -1;
        }
        NativeFunctions.nativeSetRemoteSubscribeFallbackOption(j, subscribeFallbackOptions.value());
        MethodCollector.m26664o(360);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setRuntimeParameters(JSONObject jSONObject) {
        String jSONObject2;
        MethodCollector.m26663i(696);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, SetRuntimeParameters failed.");
            MethodCollector.m26664o(696);
            return;
        }
        if (jSONObject == null) {
            jSONObject2 = "";
        } else {
            jSONObject2 = jSONObject.toString();
        }
        NativeFunctions.nativeSetRuntimeParameters(j, jSONObject2);
        MethodCollector.m26664o(696);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setUserRole(RTCEngine.ClientRole clientRole) {
        MethodCollector.m26663i(4111);
        LogUtil.m147885d("RtcEngineImpl", "setUserRole. role : ".concat(String.valueOf(clientRole)));
        if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setUserRole failed.");
            MethodCollector.m26664o(4111);
            return -1;
        }
        int i = 1;
        if (C860951.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ClientRole[clientRole.ordinal()] != 1) {
            i = 2;
        }
        NativeFunctions.nativeSetUserRole(this.mNativeEngine, i);
        MethodCollector.m26664o(4111);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setVideoEffectPath(List<String> list) {
        MethodCollector.m26663i(463);
        if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setVideoEffectPath failed.");
            MethodCollector.m26664o(463);
            return;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        NativeFunctions.nativeSetVideoEffectPath(this.mNativeEngine, strArr);
        MethodCollector.m26664o(463);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void startCloudRendering(String str) {
        MethodCollector.m26663i(504);
        if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, startCloudRendering failed.");
            MethodCollector.m26664o(504);
            return;
        }
        String cloudRenderingInfo = getCloudRenderingInfo("started", str);
        if (cloudRenderingInfo == null) {
            MethodCollector.m26664o(504);
            return;
        }
        NativeFunctions.nativeUpdateCloudRending(this.mNativeEngine, cloudRenderingInfo);
        MethodCollector.m26664o(504);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int stopEffect(int i) {
        MethodCollector.m26663i(4772);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, stopEffect failed.");
            MethodCollector.m26664o(4772);
            return -1;
        }
        int nativeStopEffect = NativeFunctions.nativeStopEffect(j, i);
        MethodCollector.m26664o(4772);
        return nativeStopEffect;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int unloadEffect(int i) {
        MethodCollector.m26663i(4765);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, unloadEffect failed.");
            MethodCollector.m26664o(4765);
            return -1;
        }
        int nativeUnloadEffect = NativeFunctions.nativeUnloadEffect(j, i);
        MethodCollector.m26664o(4765);
        return nativeUnloadEffect;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void updateCloudRendering(String str) {
        MethodCollector.m26663i(584);
        if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, updateCloudRendering failed.");
            MethodCollector.m26664o(584);
            return;
        }
        String cloudRenderingInfo = getCloudRenderingInfo("changed", str);
        if (cloudRenderingInfo == null) {
            MethodCollector.m26664o(584);
            return;
        }
        NativeFunctions.nativeUpdateCloudRending(this.mNativeEngine, cloudRenderingInfo);
        MethodCollector.m26664o(584);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int updateToken(String str) {
        MethodCollector.m26663i(5917);
        LogUtil.m147885d("RtcEngineImpl", "updateToken: ".concat(String.valueOf(str)));
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, updateToken failed.");
            MethodCollector.m26664o(5917);
            return -1;
        }
        NativeFunctions.nativeUpdateToken(j, str);
        MethodCollector.m26664o(5917);
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: initEglContext */
    public void lambda$new$2$RTCEngineImpl(Object obj) {
        if (obj == null) {
            this.mRootEglBase = EglBase$$CC.create$$STATIC$$();
            this.mIsUseCustomEglEnv = false;
            return;
        }
        if (obj instanceof EGLContext) {
            this.mRootEglBase = EglBase$$CC.createEgl10$$STATIC$$((EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof android.opengl.EGLContext) {
            this.mRootEglBase = EglBase$$CC.createEgl14$$STATIC$$((android.opengl.EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof EglBase) {
            this.mRootEglBase = EglBase$$CC.create$$STATIC$$(((EglBase) obj).getEglBaseContext(), EglBase.CONFIG_PLAIN);
        } else {
            this.mRootEglBase = EglBase$$CC.create$$STATIC$$();
        }
        this.mIsUseCustomEglEnv = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r4 != 4) goto L_0x0036;
     */
    @Override // com.p2082ss.bytertc.engine.RTCEngine
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAudioScenario(com.p2082ss.bytertc.engine.RTCEngine.AudioScenarioType r8) {
        /*
            r7 = this;
            r6 = 4084(0xff4, float:5.723E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "setAudioScenario...audioScenario: "
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r5 = "RtcEngineImpl"
            com.p2082ss.bytertc.engine.utils.LogUtil.m147885d(r5, r0)
            long r3 = r7.mNativeEngine
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "native engine is invalid, setAudioScenario failed."
            com.p2082ss.bytertc.engine.utils.LogUtil.m147886e(r5, r0)
        L_0x0021:
            int[] r1 = com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl.C860951.$SwitchMap$com$ss$bytertc$engine$RTCEngine$AudioScenarioType
            int r0 = r8.ordinal()
            r4 = r1[r0]
            r3 = 3
            r2 = 2
            r1 = 1
            r0 = 0
            if (r4 == r1) goto L_0x0036
            if (r4 == r2) goto L_0x0042
            if (r4 == r3) goto L_0x0040
            r0 = 4
            if (r4 == r0) goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            long r0 = r7.mNativeEngine
            com.p2082ss.bytertc.engine.NativeFunctions.nativeSetAudioScenario(r0, r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return
        L_0x0040:
            r3 = 2
            goto L_0x0037
        L_0x0042:
            r3 = 1
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl.setAudioScenario(com.ss.bytertc.engine.RTCEngine$AudioScenarioType):void");
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setVideoInputType(MediaInputType mediaInputType) {
        boolean z;
        MethodCollector.m26663i(6378);
        if (mediaInputType == MediaInputType.MEDIA_INPUT_TYPE_EXTERNAL) {
            z = true;
        } else {
            z = false;
        }
        this.mUseExtVideoSource = z;
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setVideoInputType failed.");
            MethodCollector.m26664o(6378);
            return;
        }
        NativeFunctions.nativeSetVideoInputType(j, mediaInputType.value());
        if (this.mUseExtVideoSource) {
            NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeEngine, MirrorMode.MIRROR_MODE_OFF.value());
            MethodCollector.m26664o(6378);
            return;
        }
        MirrorMode mirrorMode = MirrorMode.MIRROR_MODE_OFF;
        if (this.mIsVideoMirror && this.mIsFront) {
            mirrorMode = MirrorMode.MIRROR_MODE_ON;
        }
        NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeEngine, mirrorMode.value());
        MethodCollector.m26664o(6378);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int switchCamera(CameraId cameraId) {
        MethodCollector.m26663i(6068);
        LogUtil.m147885d("RtcEngineImpl", "switchCamera");
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, switchCamera failed.");
            MethodCollector.m26664o(6068);
            return -1;
        }
        NativeFunctions.nativeSwitchCamera(j, cameraId.value());
        this.mIsFront = !this.mIsFront;
        MirrorMode mirrorMode = MirrorMode.MIRROR_MODE_OFF;
        if (this.mIsVideoMirror && this.mIsFront) {
            mirrorMode = MirrorMode.MIRROR_MODE_ON;
        }
        NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeEngine, mirrorMode.value());
        MethodCollector.m26664o(6068);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void updateLiveTranscoding(LiveTranscoding liveTranscoding) {
        MethodCollector.m26663i(6672);
        LogUtil.m147885d("RtcEngineImpl", "updateLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.m147885d("RtcEngineImpl", "updateLiveTranscoding...mLiveTranscoding is null, no effect, please check.");
            MethodCollector.m26664o(6672);
        } else if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, updateLiveTranscoding failed.");
            MethodCollector.m26664o(6672);
        } else {
            liveTranscoding.setAction("layoutChanged");
            String jSONObject = liveTranscoding.getTranscodeMessage().toString();
            LogUtil.m147885d("RtcEngineImpl", "updateLiveTranscoding...liveTranscodeJson: ".concat(String.valueOf(jSONObject)));
            NativeFunctions.nativeUpdateLiveTranscoding(this.mNativeEngine, jSONObject);
            MethodCollector.m26664o(6672);
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setupLocalScreenRender(IVideoSink iVideoSink, String str) {
        return setLocalRenderInternal(iVideoSink, str, true, false);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setupLocalVideoRender(IVideoSink iVideoSink, String str) {
        return setLocalRenderInternal(iVideoSink, str, false, false);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setupRemoteScreenRender(IVideoSink iVideoSink, String str) {
        return setupRemoteVideoRenderInternal(iVideoSink, null, str, true, false);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str) {
        return setupRemoteVideoRenderInternal(iVideoSink, null, str, false, false);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setEncryptInfo(int i, String str) {
        MethodCollector.m26663i(391);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setEncryptInfo failed.");
            MethodCollector.m26664o(391);
            return;
        }
        NativeFunctions.nativeSetEncryptInfo(j, i, str);
        MethodCollector.m26664o(391);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int startScreenSharing(Intent intent, ScreenSharingParameters screenSharingParameters) {
        MethodCollector.m26663i(8472);
        int nativeStartScreenSharing = NativeFunctions.nativeStartScreenSharing(this.mNativeEngine, intent, new InternalScreenSharingParams(screenSharingParameters));
        MethodCollector.m26664o(8472);
        return nativeStartScreenSharing;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int UpdateAudioRecvRange(int i, int i2) {
        MethodCollector.m26663i(343);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, UpdateAudioRecvRange failed.");
            MethodCollector.m26664o(343);
            return -1;
        }
        int nativeUpdateAudioRecvRange = NativeFunctions.nativeUpdateAudioRecvRange(j, i, i2);
        MethodCollector.m26664o(343);
        return nativeUpdateAudioRecvRange;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int checkVideoEffectLicense(Context context, String str) {
        MethodCollector.m26663i(427);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, checkVideoEffectLicense failed.");
            MethodCollector.m26664o(427);
            return -1;
        }
        int nativeCheckVideoEffectLicense = NativeFunctions.nativeCheckVideoEffectLicense(context, j, str);
        MethodCollector.m26664o(427);
        return nativeCheckVideoEffectLicense;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int preloadEffect(int i, String str) {
        MethodCollector.m26663i(4679);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, preloadEffect failed.");
            MethodCollector.m26664o(4679);
            return -1;
        }
        int nativePreloadEffect = NativeFunctions.nativePreloadEffect(j, i, str);
        MethodCollector.m26664o(4679);
        return nativePreloadEffect;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public boolean pushAudioMixingStreamData(byte[] bArr, int i) {
        MethodCollector.m26663i(172);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, pushAudioMixingStreamData failed.");
            MethodCollector.m26664o(172);
            return false;
        }
        boolean nativePushAudioMixingStreamData = NativeFunctions.nativePushAudioMixingStreamData(j, bArr, i);
        MethodCollector.m26664o(172);
        return nativePushAudioMixingStreamData;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public long sendUserBinaryMessage(String str, byte[] bArr) {
        MethodCollector.m26663i(135);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            MethodCollector.m26664o(135);
            return -1;
        } else if (str == null) {
            LogUtil.m147886e("RtcEngineImpl", "sendBinaryMessage: uid is null send failed");
            MethodCollector.m26664o(135);
            return -2;
        } else {
            long nativeSendUserBinaryMessage = NativeFunctions.nativeSendUserBinaryMessage(j, str, bArr);
            MethodCollector.m26664o(135);
            return nativeSendUserBinaryMessage;
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public long sendUserMessage(String str, String str2) {
        MethodCollector.m26663i(113);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, sendMessage failed.");
            MethodCollector.m26664o(113);
            return -1;
        } else if (str == null) {
            LogUtil.m147886e("RtcEngineImpl", "sendMessage: uid is null send failed");
            MethodCollector.m26664o(113);
            return -2;
        } else {
            long nativeSendUserMessage = NativeFunctions.nativeSendUserMessage(j, str, str2);
            MethodCollector.m26664o(113);
            return nativeSendUserMessage;
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas) {
        MethodCollector.m26663i(5197);
        if (videoCanvas == null) {
            LogUtil.m147888i("RtcEngineImpl", "EventType: setLocalVideoCanvas canvas is null");
            MethodCollector.m26664o(5197);
            return -1;
        }
        NativeFunctions.nativeSetLocalVideoCanvas(this.mNativeEngine, streamIndex.value(), videoCanvas.renderView, videoCanvas.renderMode);
        MethodCollector.m26664o(5197);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public boolean setMixedAudioFrameParameters(int i, int i2) {
        MethodCollector.m26663i(5117);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setMixedAudioFrameParameters failed.");
            MethodCollector.m26664o(5117);
            return false;
        }
        NativeFunctions.nativeSetMixedAudioFrameParameters(j, i, i2);
        MethodCollector.m26664o(5117);
        return true;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public boolean setPlaybackAudioFrameParameters(int i, int i2) {
        MethodCollector.m26663i(5114);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setPlaybackAudioFrameParameters failed.");
            MethodCollector.m26664o(5114);
            return false;
        }
        NativeFunctions.nativeSetPlaybackAudioFrameParameters(j, i, i2);
        MethodCollector.m26664o(5114);
        return true;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public boolean setRecordingAudioFrameParameters(int i, int i2) {
        MethodCollector.m26663i(5021);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setRecordingAudioFrameParameters failed.");
            MethodCollector.m26664o(5021);
            return false;
        }
        NativeFunctions.nativeSetRecordingAudioFrameParameters(j, i, i2);
        MethodCollector.m26664o(5021);
        return true;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setRemoteAudioPlaybackVolume(String str, int i) {
        MethodCollector.m26663i(178);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setRemoteAudioPlaybackVolume failed.");
            MethodCollector.m26664o(178);
        } else if (str == null) {
            LogUtil.m147886e("RtcEngineImpl", "setRemoteAudioPlaybackVolume: uid is null adjust failed");
            MethodCollector.m26664o(178);
        } else {
            NativeFunctions.nativeSetRemoteAudioPlaybackVolume(j, str, i);
            MethodCollector.m26664o(178);
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setVolumeOfEffect(int i, int i2) {
        MethodCollector.m26663i(4600);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setVolumeOfEffect failed.");
            MethodCollector.m26664o(4600);
            return -1;
        }
        int nativeSetVolumeOfEffect = NativeFunctions.nativeSetVolumeOfEffect(j, i, i2);
        MethodCollector.m26664o(4600);
        return nativeSetVolumeOfEffect;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void unSubscribe(String str, boolean z) {
        MethodCollector.m26663i(7262);
        LogUtil.m147885d("RtcEngineImpl", "unSubscribe: ".concat(String.valueOf(str)));
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, unSubscribe failed.");
            MethodCollector.m26664o(7262);
            return;
        }
        NativeFunctions.nativeUnSubscribe(j, str, z);
        MethodCollector.m26664o(7262);
    }

    private JSONObject AddParameters(JSONObject jSONObject, Context context) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String path = m147867x180c6a83(context).getPath();
        if (path == null || path.isEmpty()) {
            path = "/data/data/" + context.getPackageName() + "/files";
        }
        try {
            jSONObject.put("rtc.log_location", path + "/rtc_log");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m147868xe4665a54(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5417);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(5417);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static String getCloudRenderingInfo(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject.put("action", str);
            jSONObject.put(StringSet.type, "render");
            jSONObject2.put("effect", str2);
            jSONObject3.put("layout", jSONObject2);
            jSONObject.put("renderMeta", jSONObject3);
            return jSONObject.toString();
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineImpl", "getCloudRenderingInfo catch exception , e : " + e.getMessage());
            return null;
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void enableAutoSubscribe(RTCEngine.SubscribeMode subscribeMode, RTCEngine.SubscribeMode subscribeMode2) {
        MethodCollector.m26663i(7112);
        LogUtil.m147885d("RtcEngineImpl", "enableAutoSubscribe: audio:" + subscribeMode + ", video: " + subscribeMode2);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, enableAutoSubscribe failed.");
            MethodCollector.m26664o(7112);
            return;
        }
        NativeFunctions.nativeEnableAutoSubscribe(j, subscribeMode.value(), subscribeMode2.value());
        MethodCollector.m26664o(7112);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void enableExternalAudioDevice(AudioFormat audioFormat, AudioFormat audioFormat2) {
        MethodCollector.m26663i(7407);
        if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, enableExternalAudioDevice failed.");
            MethodCollector.m26664o(7407);
        } else if (audioFormat.sampleRate == null || audioFormat.channel == null || audioFormat2.sampleRate == null || audioFormat2.channel == null) {
            LogUtil.m147886e("RtcEngineImpl", "parameter is invalid, EnableExternalAudioDevice failed.");
            MethodCollector.m26664o(7407);
        } else {
            NativeFunctions.nativeEnableExternalAudioDevice(this.mNativeEngine, audioFormat.sampleRate.value(), audioFormat.channel.value(), audioFormat2.sampleRate.value(), audioFormat2.channel.value());
            MethodCollector.m26664o(7407);
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void muteRemoteAudio(String str, MuteState muteState) {
        MethodCollector.m26663i(5648);
        LogUtil.m147885d("RtcEngineImpl", "muteRemoteAudio, uid: " + str + " , muted: " + muteState.value());
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, muteRemoteAudio failed.");
            MethodCollector.m26664o(5648);
        } else if (str == null) {
            LogUtil.m147886e("RtcEngineImpl", "muteRemoteAudio, uid is null mute failed.");
            MethodCollector.m26664o(5648);
        } else {
            NativeFunctions.nativeMuteRemoteAudio(j, str, muteState.value());
            MethodCollector.m26664o(5648);
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int muteRemoteVideo(String str, MuteState muteState) {
        boolean z;
        MethodCollector.m26663i(5774);
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.m147885d("RtcEngineImpl", "muteRemoteVideoStream, uid: " + str + " , muted: " + z);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, muteRemoteVideo failed.");
            MethodCollector.m26664o(5774);
            return -1;
        } else if (str == null) {
            LogUtil.m147886e("RtcEngineImpl", "muteRemoteVideoStream, uid is null mute failed");
            MethodCollector.m26664o(5774);
            return -2;
        } else {
            NativeFunctions.nativeMuteRemoteVideo(j, str, muteState.value());
            MethodCollector.m26664o(5774);
            return 0;
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setRemoteUserPriority(String str, RTCEngine.RemoteUserPriority remoteUserPriority) {
        MethodCollector.m26663i(372);
        LogUtil.m147885d("RtcEngineImpl", "setRemoteUserPriority: uid: " + str + ", priority: " + remoteUserPriority);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setRemoteUserPriority failed.");
            MethodCollector.m26664o(372);
            return -1;
        } else if (str == null) {
            LogUtil.m147886e("RtcEngineImpl", "setRemoteUserPriority: uid is null set failed");
            MethodCollector.m26664o(372);
            return -2;
        } else {
            NativeFunctions.nativeSetRemoteUserPriority(j, str, remoteUserPriority.value());
            MethodCollector.m26664o(372);
            return 0;
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setVideoEncoderConfig(List<VideoStreamDescription> list, VideoEncoderConfiguration.OrientationMode orientationMode) {
        MethodCollector.m26663i(6958);
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setVideoResolutions failed.");
            MethodCollector.m26664o(6958);
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoStreamDescription videoStreamDescription : list) {
            if (!videoStreamDescription.isValid()) {
                LogUtil.m147886e("RtcEngineImpl", "setVideoResolutions with illegal params");
                MethodCollector.m26664o(6958);
                return -2;
            }
            arrayList.add(new InternalVideoStreamDescription(videoStreamDescription));
        }
        RTCData.instance().setOrientationMode(orientationMode);
        NativeFunctions.nativeSetVideoEncoderConfig(this.mNativeEngine, arrayList);
        MethodCollector.m26664o(6958);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void startLiveTranscoding(LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver) {
        MethodCollector.m26663i(6380);
        this.mLiveTranscodingObserver = iLiveTranscodingObserver;
        LogUtil.m147885d("RtcEngineImpl", "enableLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.m147885d("RtcEngineImpl", "enableLiveTranscoding...liveTranscode is null, no effect, please check.");
            MethodCollector.m26664o(6380);
        } else if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, enableLiveTranscoding failed.");
            MethodCollector.m26664o(6380);
        } else {
            this.mEnableTranscode = true;
            this.mLiveTranscoding = liveTranscoding;
            liveTranscoding.setAction("started");
            JSONObject transcodeMessage = this.mLiveTranscoding.getTranscodeMessage();
            if (transcodeMessage == null) {
                MethodCollector.m26664o(6380);
                return;
            }
            String jSONObject = transcodeMessage.toString();
            LogUtil.m147885d("RtcEngineImpl", "enableLiveTranscoding...liveTranscodeJson: ".concat(String.valueOf(jSONObject)));
            NativeFunctions.nativeStartLiveTranscoding(this.mNativeEngine, jSONObject, this.mTranscodingObserver);
            MethodCollector.m26664o(6380);
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void subscribeStream(String str, SubscribeConfig subscribeConfig) {
        String subscribeConfig2;
        MethodCollector.m26663i(7260);
        StringBuilder append = new StringBuilder("subscribeStream: ").append(str).append(", info:");
        if (subscribeConfig == null) {
            subscribeConfig2 = "null";
        } else {
            subscribeConfig2 = subscribeConfig.toString();
        }
        LogUtil.m147885d("RtcEngineImpl", append.append(subscribeConfig2).toString());
        if (subscribeConfig != null) {
            long j = this.mNativeEngine;
            if (j == -1) {
                LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, subscribeStream failed.");
                MethodCollector.m26664o(7260);
                return;
            }
            NativeFunctions.nativeSubscribeStream(j, str, subscribeConfig.isScreen, subscribeConfig.subVideo, subscribeConfig.subAudio, subscribeConfig.videoIndex);
        }
        MethodCollector.m26664o(7260);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public boolean pushExternalVideoFrame(RTCVideoFrame rTCVideoFrame, boolean z) {
        VideoFrame convert2I420Frame;
        RTCVideoFrame rTCVideoFrame2 = rTCVideoFrame;
        MethodCollector.m26663i(8043);
        if (!rTCVideoFrame2.hasReleaseCallback()) {
            rTCVideoFrame2 = RTCVideoFrame.shallowCopy(rTCVideoFrame2);
        }
        if (this.mNativeEngine == -1 || this.mState == State.DESTORY) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, pushExternalVideoFrame failed.");
            MethodCollector.m26664o(8043);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        VideoFrameConverter videoFrameConverter = this.mVideoFrameConverter;
        if (videoFrameConverter == null || !this.mUseExtVideoSource) {
            LogUtil.m147886e("RtcEngineImpl", "pushExternalVideoFrame failed videoFrameConverter:" + this.mVideoFrameConverter + " useExtVideoSource:" + this.mUseExtVideoSource);
            MethodCollector.m26664o(8043);
            return false;
        }
        if (z) {
            convert2I420Frame = videoFrameConverter.convert2VideoFrame(rTCVideoFrame2);
        } else {
            convert2I420Frame = videoFrameConverter.convert2I420Frame(rTCVideoFrame2);
        }
        if (convert2I420Frame != null) {
            if (z) {
                NativeFunctions.nativePushExternalVideoFrame(this.mNativeEngine, convert2I420Frame, VideoFrameConverter.getExtendedData(rTCVideoFrame2), VideoFrameConverter.getSupplementaryInfo(rTCVideoFrame2), currentTimeMillis);
                convert2I420Frame.release();
            } else {
                NativeFunctions.nativePushExternalVideoFrame(this.mNativeEngine, convert2I420Frame, VideoFrameConverter.getExtendedData(rTCVideoFrame2), VideoFrameConverter.getSupplementaryInfo(rTCVideoFrame2), currentTimeMillis);
                convert2I420Frame.release();
            }
            MethodCollector.m26664o(8043);
            return true;
        }
        LogUtil.m147886e("RtcEngineImpl", "pushExternalVideoFrame convert video frame is null");
        MethodCollector.m26664o(8043);
        return false;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setupLocalVideoRender(IVideoSink iVideoSink, String str, boolean z) {
        return setLocalRenderInternal(iVideoSink, str, false, z);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void setAudioPlayoutMixStream(boolean z, int i, int i2) {
        MethodCollector.m26663i(142);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, setAudioPlayoutMixStream failed.");
            MethodCollector.m26664o(142);
            return;
        }
        NativeFunctions.nativeSetAudioPlayoutMixStream(j, z, i, i2);
        MethodCollector.m26664o(142);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setupRemoteScreenRender(IVideoSink iVideoSink, String str, String str2) {
        return setupRemoteVideoRenderInternal(iVideoSink, str, str2, true, false);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str, String str2) {
        return setupRemoteVideoRenderInternal(iVideoSink, str, str2, false, false);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public void updateVideoEffect(String str, String str2, float f) {
        MethodCollector.m26663i(496);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, updateVideoEffect failed.");
            MethodCollector.m26664o(496);
            return;
        }
        NativeFunctions.nativeUpdateVideoEffect(j, str, str2, f);
        MethodCollector.m26664o(496);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int UpdateSelfPosition(int i, int i2, int i3) {
        MethodCollector.m26663i(345);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, UpdateSelfPosition failed.");
            MethodCollector.m26664o(345);
            return -1;
        }
        int nativeUpdateSelfPosition = NativeFunctions.nativeUpdateSelfPosition(j, i, i2, i3);
        MethodCollector.m26664o(345);
        return nativeUpdateSelfPosition;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$0$RTCEngineImpl(IRTCEngineEventHandler.LogLevel logLevel, String str, Throwable th) {
        IRTCEngineEventHandler rtcEngineHandler = getRtcEngineHandler();
        if (rtcEngineHandler != null) {
            try {
                rtcEngineHandler.onLoggerMessage(logLevel, str, th);
            } catch (Exception e) {
                LogUtil.m147886e("RtcEngineImpl", "Exception in App thread when handler onLoggerMessage , e : " + e.getMessage());
            }
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setRemoteVideoCanvas(String str, StreamIndex streamIndex, VideoCanvas videoCanvas) {
        MethodCollector.m26663i(5126);
        if (videoCanvas == null || videoCanvas.uid == null) {
            LogUtil.m147888i("RtcEngineImpl", "EventType: setupRemoteVideo canvas or uid is null");
            MethodCollector.m26664o(5126);
            return -1;
        }
        NativeFunctions.nativeSetRemoteVideoCanvas(this.mNativeEngine, videoCanvas.uid, streamIndex.value(), videoCanvas.renderView, videoCanvas.renderMode);
        MethodCollector.m26664o(5126);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str, boolean z) {
        return setupRemoteVideoRenderInternal(iVideoSink, null, str, false, z);
    }

    public static void httpGetAsync(String str, int i, int i2, int i3) {
        if (nativeHttpClient == null) {
            m147870x962d1b30("bytertc", "native http client has not been init!");
            return;
        }
        RtcHttpCallbackImpl rtcHttpCallbackImpl = new RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i2);
        rtcHttpCallbackImpl.setClientId(i3);
        nativeHttpClient.GetAsync(str, rtcHttpCallbackImpl, i);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str, String str2, boolean z) {
        return setupRemoteVideoRenderInternal(iVideoSink, str, str2, false, z);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int startAudioMixing(String str, boolean z, boolean z2, int i) {
        MethodCollector.m26663i(4115);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, startAudioMixing failed.");
            MethodCollector.m26664o(4115);
            return -1;
        }
        int nativeStartAudioMixing = NativeFunctions.nativeStartAudioMixing(j, str, z, z2, i);
        MethodCollector.m26664o(4115);
        return nativeStartAudioMixing;
    }

    public static int feedback(Context context, int i, int i2, String str) {
        MethodCollector.m26663i(715);
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("grade", i);
            jSONObject.put(StringSet.type, i2);
            jSONObject.put("problem_desc", str);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("network_type", NetworkUtils.getNetworkAccessType(context));
            int nativeReportFeedback = NativeFunctions.nativeReportFeedback(jSONObject.toString());
            MethodCollector.m26664o(715);
            return nativeReportFeedback;
        } catch (JSONException e) {
            e.printStackTrace();
            MethodCollector.m26664o(715);
            return -1;
        }
    }

    private int setLocalRenderInternal(IVideoSink iVideoSink, String str, boolean z, boolean z2) {
        VideoSinkAdapter videoSinkAdapter;
        MethodCollector.m26663i(5214);
        if (str == null) {
            LogUtil.m147886e("RtcEngineImpl", "setLocalRenderInternal, uid is null set failed.");
            MethodCollector.m26664o(5214);
            return -2;
        }
        if (iVideoSink == null) {
            LogUtil.m147888i("RtcEngineImpl", "EventType: setLocalRenderInternal videoSink is null, ThreadPool  workthreadID" + Thread.currentThread().getId());
            videoSinkAdapter = null;
        } else {
            LogUtil.m147888i("RtcEngineImpl", "EventType: setLocalRenderInternal videoSink:" + iVideoSink.hashCode() + ", ThreadPool  workthreadID" + Thread.currentThread().getId());
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
        }
        if (!z) {
            NativeFunctions.nativeSetupLocalVideoSink(this.mNativeEngine, videoSinkAdapter, str);
        } else {
            NativeFunctions.nativeSetupLocalScreenSink(this.mNativeEngine, videoSinkAdapter, str);
        }
        MethodCollector.m26664o(5214);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int joinRoom(String str, String str2, UserInfo userInfo, RTCEngine.ChannelProfile channelProfile) {
        String uid;
        MethodCollector.m26663i(5226);
        StringBuilder append = new StringBuilder("joinChannel with token: ").append(str).append(" , roomId: ").append(str2).append(" and uid: ");
        if (userInfo == null) {
            uid = "";
        } else {
            uid = userInfo.getUid();
        }
        LogUtil.m147885d("RtcEngineImpl", append.append(uid).toString());
        if (this.mState != State.IDLE) {
            MethodCollector.m26664o(5226);
            return -4;
        } else if (this.mNativeEngine == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, joinChannel failed.");
            MethodCollector.m26664o(5226);
            return -3;
        } else if (userInfo == null) {
            LogUtil.m147886e("RtcEngineImpl", "userInfo is null, joinChannel failed");
            MethodCollector.m26664o(5226);
            return -2;
        } else if (userInfo.getUid() == null || userInfo.getUid().isEmpty()) {
            LogUtil.m147886e("RtcEngineImpl", "uid is invalid, joinChannel failed.");
            MethodCollector.m26664o(5226);
            return -2;
        } else if (str2 == null || str2.isEmpty()) {
            LogUtil.m147886e("RtcEngineImpl", "channel is invalid, joinChannel failed.");
            MethodCollector.m26664o(5226);
            return -1;
        } else {
            this.mState = State.IN_ROOM;
            this.mRoom = str2;
            this.mUser = userInfo.getUid();
            int i = C860951.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile[channelProfile.ordinal()];
            int i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            i2 = 1;
                        } else if (i == 5) {
                            i2 = 4;
                        }
                    }
                    i2 = 0;
                } else {
                    i2 = 3;
                }
            }
            int min = Math.min(NativeFunctions.nativeJoinRoom(this.mNativeEngine, str, str2, userInfo, i2), 0);
            MethodCollector.m26664o(5226);
            return min;
        }
    }

    public static void httpPostAsync(String str, String str2, int i, int i2, int i3) {
        if (nativeHttpClient == null) {
            m147870x962d1b30("bytertc", "native http client has not been init!");
            return;
        }
        m147870x962d1b30("bytertc", "http in java called, callback Id: ".concat(String.valueOf(i2)));
        RtcHttpCallbackImpl rtcHttpCallbackImpl = new RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i2);
        rtcHttpCallbackImpl.setClientId(i3);
        nativeHttpClient.PostAsync(str, str2, rtcHttpCallbackImpl, i);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine
    public int playEffect(int i, String str, boolean z, int i2, int i3) {
        MethodCollector.m26663i(4676);
        long j = this.mNativeEngine;
        if (j == -1) {
            LogUtil.m147886e("RtcEngineImpl", "native engine is invalid, playEffect failed.");
            MethodCollector.m26664o(4676);
            return -1;
        }
        int nativePlayEffect = NativeFunctions.nativePlayEffect(j, i, str, z, i2, i3);
        MethodCollector.m26664o(4676);
        return nativePlayEffect;
    }

    private int setupRemoteVideoRenderInternal(IVideoSink iVideoSink, String str, String str2, boolean z, boolean z2) {
        VideoSinkAdapter videoSinkAdapter;
        MethodCollector.m26663i(5157);
        if (str2 == null) {
            LogUtil.m147886e("RtcEngineImpl", "EventType: setupRemoteRenderInternal, uid is null");
            MethodCollector.m26664o(5157);
            return -2;
        }
        if (iVideoSink == null) {
            LogUtil.m147888i("RtcEngineImpl", "EventType: setupRemoteRenderInternal videoSink is null");
            videoSinkAdapter = null;
        } else {
            LogUtil.m147888i("RtcEngineImpl", "EventType: setupRemoteRenderInternal canvas:" + iVideoSink.hashCode());
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
        }
        NativeFunctions.nativeSetupRemoteVideoSink(this.mNativeEngine, videoSinkAdapter, str2, z);
        MethodCollector.m26664o(5157);
        return 0;
    }

    public RTCEngineImpl(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Object obj, JSONObject jSONObject) {
        int i;
        String str2;
        String jSONObject2;
        MethodCollector.m26663i(3644);
        LogUtil.m147885d("RtcEngineImpl", "create RtcEngineImpl with appId: ".concat(String.valueOf(str)));
        if (!mLibraryLoaded || str == null) {
            JSONObject jSONObject3 = new JSONObject();
            if (!mLibraryLoaded) {
                i = -1072;
                str2 = "rtc sdk load so failed";
            } else {
                i = -1005;
                str2 = "app id is null";
            }
            try {
                jSONObject3.put("event_key", "rtc_error");
                jSONObject3.put("rtc_app_id", str);
                jSONObject3.put("device_id", mDeviceId);
                jSONObject3.put("error_code", i);
                jSONObject3.put("message", str2);
                jSONObject3.put("timestamp", System.currentTimeMillis());
                jSONObject3.put("rtc_timestamp", System.currentTimeMillis());
                jSONObject3.put("os", "android");
                jSONObject3.put("product_line", "rtc");
                jSONObject3.put("report_version", 5);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (iRTCEngineEventHandler != null) {
                iRTCEngineEventHandler.onLogReport("live_webrtc_monitor_log", jSONObject3);
                iRTCEngineEventHandler.onError(i);
            }
            LogUtil.m147886e("RtcEngineImpl", str2);
            IllegalStateException illegalStateException = new IllegalStateException("Create engine failed ".concat(str2));
            MethodCollector.m26664o(3644);
            throw illegalStateException;
        }
        sRtcEngineInstance = this;
        HandlerThread handlerThread = new HandlerThread("rtc_egl_thread");
        this.mEglThread = handlerThread;
        handlerThread.start();
        VideoSinkTask videoSinkTask = new VideoSinkTask();
        this.mVideoSinkTask = videoSinkTask;
        videoSinkTask.init();
        Handler handler = new Handler(this.mEglThread.getLooper());
        this.mEglHandler = handler;
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new RTCEngineImpl$$Lambda$3(this, obj));
        EglBase.Context eglBaseContext = this.mRootEglBase.getEglBaseContext();
        Context com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m147871xb2625d48(context);
        this.mContext = com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
        mPackageName = com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext.getPackageName();
        RtcContextUtils.initialize(this.mContext);
        this.mAppId = str;
        this.mState = State.IDLE;
        this.mRtcEngineHandler = new WeakReference<>(iRTCEngineEventHandler);
        LogUtil.setLoggerSink(this.mLoggerSink);
        JSONObject AddParameters = AddParameters(jSONObject, context);
        this.mEngineEventHandler = new RTCEngineEventHandler(this);
        this.mEngineInternalEventHandler = new RTCEngineInternalEventHandler(this);
        this.mVideoFrameConverter = new VideoFrameConverter();
        this.mScreenFrameConverter = new VideoFrameConverter();
        this.mRtcVideoFrameObserver = new RTCVideoFrameObserver();
        this.mRtcAudioFrameObserver = new RTCAudioFrameObserver(this);
        this.mRtcMetadataObserver = new RTCMetadataObserver(this);
        this.mTranscodingObserver = new LiveTranscodingObserver(this);
        try {
            Context com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext2 = m147871xb2625d48(this.mContext);
            RTCEngineEventHandler rTCEngineEventHandler = this.mEngineEventHandler;
            if (AddParameters == null) {
                jSONObject2 = "";
            } else {
                jSONObject2 = AddParameters.toString();
            }
            long nativeCreateEngine = NativeFunctions.nativeCreateEngine(com_ss_bytertc_engine_engineimpl_RTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext2, str, rTCEngineEventHandler, eglBaseContext, jSONObject2);
            this.mNativeEngine = nativeCreateEngine;
            if (nativeCreateEngine == -1) {
                LogUtil.m147886e("RtcEngineImpl", "create native engine error, native engine is invalid.");
            } else {
                NativeFunctions.nativeRegisterInternalEventObserver(nativeCreateEngine, this.mEngineInternalEventHandler);
            }
            NetworkConnectChangeReceiver networkConnectChangeReceiver = new NetworkConnectChangeReceiver(this.SetNetworkTypeCallback);
            this.mBroadcastReceiver = networkConnectChangeReceiver;
            NetworkUtils.registerReceiver(context, networkConnectChangeReceiver);
            AppMonitor.get(context).register(context, this.appStateCallback);
            MethodCollector.m26664o(3644);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("rtc loader info:" + sRtcLoaderInfo.toString() + " exception info:" + e2.getStackTrace().toString());
            MethodCollector.m26664o(3644);
            throw unsatisfiedLinkError;
        }
    }
}
