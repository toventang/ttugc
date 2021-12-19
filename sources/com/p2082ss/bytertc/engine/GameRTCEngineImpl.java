package com.p2082ss.bytertc.engine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.bytertc.base.utils.NetworkConnectChangeReceiver;
import com.p2082ss.bytertc.base.utils.NetworkUtils;
import com.p2082ss.bytertc.engine.adapter.VideoSinkTask;
import com.p2082ss.bytertc.engine.data.AudioFormat;
import com.p2082ss.bytertc.engine.game.GameRTCPositionInfo;
import com.p2082ss.bytertc.engine.game.GameRTCReceiveRange;
import com.p2082ss.bytertc.engine.game.GameRTCRoomConfig;
import com.p2082ss.bytertc.engine.handler.GameRTCEventHandler;
import com.p2082ss.bytertc.engine.handler.IGameRTCEventHandler;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p2082ss.bytertc.engine.loader.RTCNativeLibraryListenerImpl;
import com.p2082ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener;
import com.p2082ss.bytertc.engine.utils.AppMonitor;
import com.p2082ss.bytertc.engine.utils.AudioFrame;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.io.File;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.ThreadUtils;

/* renamed from: com.ss.bytertc.engine.GameRTCEngineImpl */
public final class GameRTCEngineImpl extends GameRTCEngine {
    private static GameRTCEngineImpl mInstance;
    private static boolean mLibraryLoaded;
    private static EglBase mRootEglBase = null;
    private static RTCNativeLibraryLoaderListener mRtcNativeLibraryListener = new RTCNativeLibraryListenerImpl();
    private NetworkConnectChangeReceiver.Callback SetNetworkTypeCallback = new GameRTCEngineImpl$$Lambda$1(this);
    private AppMonitor.Callback appStateCallback = new GameRTCEngineImpl$$Lambda$0(this);
    private BroadcastReceiver mBroadcastReceiver;
    private Context mContext;
    private Handler mEglHandler;
    private HandlerThread mEglThread;
    private GameRTCEventHandler mEngineEventHandler;
    private boolean mIsUseCustomEglEnv;
    private LogUtil.LoggerSink mLoggerSink = new LogUtil.LoggerSink() {
        /* class com.p2082ss.bytertc.engine.GameRTCEngineImpl.C860781 */

        static {
            Covode.recordClassIndex(100885);
        }

        @Override // com.p2082ss.bytertc.engine.utils.LogUtil.LoggerSink
        public void onLoggerMessage(IRTCEngineEventHandler.LogLevel logLevel, String str, Throwable th) {
            IGameRTCEventHandler gameRTCEventHandler = GameRTCEngineImpl.getGameRTCEventHandler();
            if (gameRTCEventHandler != null) {
                try {
                    gameRTCEventHandler.onLoggerMessage(logLevel, str, th);
                } catch (Exception e) {
                    LogUtil.m147886e("GameRTCEngineImpl", "Exception in App thread when handler onLoggerMessage , e : " + e.getMessage());
                }
            }
        }
    };
    private long mNativeGameRtcEngine = -1;
    private IGameRTCEventHandler mRtcEngineHandler;
    private VideoSinkTask mVideoSinkTask;

    /* renamed from: com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147864xb1472c90(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$1$GameRTCEngineImpl() {
        initEglContext(null);
    }

    static final /* synthetic */ void lambda$doDestroy$2$GameRTCEngineImpl() {
        EglBase eglBase = mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            mRootEglBase = null;
        }
    }

    static {
        Covode.recordClassIndex(100880);
        loadSoFile();
    }

    public static String getSDKVersion() {
        MethodCollector.m26663i(1278);
        if (!mLibraryLoaded) {
            MethodCollector.m26664o(1278);
            return "";
        }
        String nativeGetSDKVersion = NativeGameFunctions.nativeGetSDKVersion();
        MethodCollector.m26664o(1278);
        return nativeGetSDKVersion;
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final void DisableExternalAudioDevice() {
        MethodCollector.m26663i(1614);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, DisableExternalAudioDevice failed.");
            MethodCollector.m26664o(1614);
            return;
        }
        NativeGameFunctions.nativeDisableExternalAudioDevice(j);
        MethodCollector.m26664o(1614);
    }

    public static IGameRTCEventHandler getGameRTCEventHandler() {
        MethodCollector.m26663i(1267);
        synchronized (GameRTCEngineImpl.class) {
            try {
                GameRTCEngineImpl gameRTCEngineImpl = mInstance;
                if (gameRTCEngineImpl == null) {
                    m147864xb1472c90("GameRTCEngineImpl", "mInstance == null");
                    return null;
                }
                IGameRTCEventHandler iGameRTCEventHandler = gameRTCEngineImpl.mRtcEngineHandler;
                if (iGameRTCEventHandler == null) {
                    m147864xb1472c90("GameRTCEngineImpl", "mInstance.mRtcEngineHandler == null");
                    MethodCollector.m26664o(1267);
                    return null;
                }
                MethodCollector.m26664o(1267);
                return iGameRTCEventHandler;
            } finally {
                MethodCollector.m26664o(1267);
            }
        }
    }

    private static void loadSoFile() {
        if (mLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready("volcenginertc");
        } else if (mRtcNativeLibraryLoader != null) {
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
        } else {
            try {
                m147863x3b69d104("byteaudio");
                m147863x3b69d104("volcenginertc");
                mLibraryLoaded = true;
                mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
            } catch (UnsatisfiedLinkError e) {
                LogUtil.m147887e("GameRTCEngineImpl", "Failed to load native library: volcenginertc", e);
                mRtcNativeLibraryListener.onLoadError("volcenginertc");
            }
        }
    }

    public final void doDestroy() {
        MethodCollector.m26663i(1276);
        LogUtil.m147885d("GameRTCEngineImpl", "destroy GameRTCEngineImpl.");
        if (this.mNativeGameRtcEngine == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, no need to destroy now.");
            MethodCollector.m26664o(1276);
            return;
        }
        NetworkUtils.unregisterReceiver(this.mContext, this.mBroadcastReceiver);
        this.mBroadcastReceiver = null;
        AppMonitor.get(this.mContext).unRegister(this.appStateCallback).release(this.mContext);
        NativeGameFunctions.nativeDestroyEngine(this.mNativeGameRtcEngine);
        this.mNativeGameRtcEngine = -1;
        mInstance = null;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, GameRTCEngineImpl$$Lambda$3.$instance);
        HandlerThread handlerThread = this.mEglThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        VideoSinkTask videoSinkTask = this.mVideoSinkTask;
        if (videoSinkTask != null) {
            videoSinkTask.exit();
        }
        MethodCollector.m26664o(1276);
    }

    /* renamed from: com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147863x3b69d104(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    /* renamed from: com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m147865xb89f47e7(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: com_ss_bytertc_engine_GameRTCEngineImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m147862xa82129a2(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$0$GameRTCEngineImpl(int i) {
        String str;
        MethodCollector.m26663i(1763);
        long j = this.mNativeGameRtcEngine;
        if (i == 1) {
            str = "active";
        } else {
            str = "background";
        }
        NativeGameFunctions.nativeSetAppState(j, str);
        MethodCollector.m26664o(1763);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$3$GameRTCEngineImpl(int i) {
        MethodCollector.m26663i(1648);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, SetNetworkType failed.");
            MethodCollector.m26664o(1648);
            return;
        }
        NativeGameFunctions.nativeSetNetworkType(j, i);
        MethodCollector.m26664o(1648);
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int leaveRoom(String str) {
        MethodCollector.m26663i(1296);
        LogUtil.m147885d("GameRTCEngineImpl", "leaveRoom");
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, leaveRoom failed.");
            MethodCollector.m26664o(1296);
            return -1;
        }
        NativeGameFunctions.nativeLeaveRoom(j, str);
        MethodCollector.m26664o(1296);
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int pullExternalAudioFrame(AudioFrame audioFrame) {
        MethodCollector.m26663i(1622);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, pullExternalAudioFrame failed.");
            MethodCollector.m26664o(1622);
            return -1;
        } else if (NativeGameFunctions.nativePullExternalAudioFrame(j, audioFrame.buffer, audioFrame.samples)) {
            MethodCollector.m26664o(1622);
            return 0;
        } else {
            MethodCollector.m26664o(1622);
            return -2;
        }
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int pushExternalAudioFrame(AudioFrame audioFrame) {
        MethodCollector.m26663i(1619);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, pushExternalAudioFrame failed.");
            MethodCollector.m26664o(1619);
            return -1;
        } else if (NativeGameFunctions.nativePushExternalAudioFrame(j, audioFrame.buffer, audioFrame.samples)) {
            MethodCollector.m26664o(1619);
            return 0;
        } else {
            MethodCollector.m26664o(1619);
            return -2;
        }
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int setPlaybackVolume(int i) {
        MethodCollector.m26663i(1523);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, setPlaybackVolume failed.");
            MethodCollector.m26664o(1523);
            return -1;
        }
        int nativeSetPlaybackVolume = NativeGameFunctions.nativeSetPlaybackVolume(j, i);
        MethodCollector.m26664o(1523);
        return nativeSetPlaybackVolume;
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int setRecordingVolume(int i) {
        MethodCollector.m26663i(1522);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, setRecordingVolume failed.");
            MethodCollector.m26664o(1522);
            return -1;
        }
        int nativeSetRecordingVolume = NativeGameFunctions.nativeSetRecordingVolume(j, i);
        MethodCollector.m26664o(1522);
        return nativeSetRecordingVolume;
    }

    private void initEglContext(Object obj) {
        if (obj == null) {
            mRootEglBase = EglBase$$CC.create$$STATIC$$();
            this.mIsUseCustomEglEnv = false;
            return;
        }
        if (obj instanceof EGLContext) {
            mRootEglBase = EglBase$$CC.createEgl10$$STATIC$$((EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof android.opengl.EGLContext) {
            mRootEglBase = EglBase$$CC.createEgl14$$STATIC$$((android.opengl.EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof EglBase) {
            mRootEglBase = EglBase$$CC.create$$STATIC$$(((EglBase) obj).getEglBaseContext(), EglBase.CONFIG_PLAIN);
        } else {
            mRootEglBase = EglBase$$CC.create$$STATIC$$();
        }
        this.mIsUseCustomEglEnv = true;
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int enableAudioSend(String str, boolean z) {
        MethodCollector.m26663i(1512);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, enableAudioSend failed.");
            MethodCollector.m26664o(1512);
            return -1;
        }
        int nativeEnableAudioSend = NativeGameFunctions.nativeEnableAudioSend(j, str, z);
        MethodCollector.m26664o(1512);
        return nativeEnableAudioSend;
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int enableMicrophone(String str, boolean z) {
        MethodCollector.m26663i(1400);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, enableMicrophone failed.");
            MethodCollector.m26664o(1400);
            return -1;
        }
        int nativeEnableMicrophone = NativeGameFunctions.nativeEnableMicrophone(j, str, z);
        MethodCollector.m26664o(1400);
        return nativeEnableMicrophone;
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int enableSpeakerphone(String str, boolean z) {
        MethodCollector.m26663i(1515);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, enableSpeakerphone failed.");
            MethodCollector.m26664o(1515);
            return -1;
        }
        int nativeEnableSpeakerphone = NativeGameFunctions.nativeEnableSpeakerphone(j, str, z);
        MethodCollector.m26664o(1515);
        return nativeEnableSpeakerphone;
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int updatePosition(String str, GameRTCPositionInfo gameRTCPositionInfo) {
        MethodCollector.m26663i(1397);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, updatePosition failed.");
            MethodCollector.m26664o(1397);
            return -1;
        }
        int nativeUpdatePosition = NativeGameFunctions.nativeUpdatePosition(j, str, gameRTCPositionInfo.f192021x, gameRTCPositionInfo.f192022y, gameRTCPositionInfo.f192023z);
        MethodCollector.m26664o(1397);
        return nativeUpdatePosition;
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int updateReceiveRange(String str, GameRTCReceiveRange gameRTCReceiveRange) {
        MethodCollector.m26663i(1306);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, updateReceiveRange failed.");
            MethodCollector.m26664o(1306);
            return -1;
        }
        int nativeUpdateReceiveRange = NativeGameFunctions.nativeUpdateReceiveRange(j, str, gameRTCReceiveRange.min, gameRTCReceiveRange.max);
        MethodCollector.m26664o(1306);
        return nativeUpdateReceiveRange;
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int updateToken(String str, String str2) {
        MethodCollector.m26663i(1303);
        LogUtil.m147885d("GameRTCEngineImpl", "updateToken");
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, leaveRoom failed.");
            MethodCollector.m26664o(1303);
            return -1;
        }
        int nativeUpdateToken = NativeGameFunctions.nativeUpdateToken(j, str, str2);
        MethodCollector.m26664o(1303);
        return nativeUpdateToken;
    }

    private JSONObject AddParameters(JSONObject jSONObject, Context context) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String path = m147862xa82129a2(context).getPath();
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

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final void EnableExternalAudioDevice(AudioFormat audioFormat, AudioFormat audioFormat2) {
        MethodCollector.m26663i(1609);
        if (this.mNativeGameRtcEngine == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, EnableExternalAudioDevice failed.");
            MethodCollector.m26664o(1609);
        } else if (audioFormat.sampleRate == null || audioFormat.channel == null || audioFormat2.sampleRate == null || audioFormat2.channel == null) {
            LogUtil.m147886e("GameRTCEngineImpl", "parameter is invalid, EnableExternalAudioDevice failed.");
            MethodCollector.m26664o(1609);
        } else {
            NativeGameFunctions.nativeEnableExternalAudioDevice(this.mNativeGameRtcEngine, audioFormat.sampleRate.value(), audioFormat.channel.value(), audioFormat2.sampleRate.value(), audioFormat2.channel.value());
            MethodCollector.m26664o(1609);
        }
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int enableAudioReceive(String str, String str2, boolean z) {
        MethodCollector.m26663i(1519);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, enableAudioReceive failed.");
            MethodCollector.m26664o(1519);
            return -1;
        }
        int nativeEnableAudioReceive = NativeGameFunctions.nativeEnableAudioReceive(j, str, str2, z);
        MethodCollector.m26664o(1519);
        return nativeEnableAudioReceive;
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int setRemoteAudioPlaybackVolume(String str, String str2, int i) {
        MethodCollector.m26663i(1527);
        long j = this.mNativeGameRtcEngine;
        if (j == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, setRemoteAudioPlaybackVolume failed.");
            MethodCollector.m26664o(1527);
            return -1;
        }
        int nativeSetRemoteAudioPlaybackVolume = NativeGameFunctions.nativeSetRemoteAudioPlaybackVolume(j, str, str2, i);
        MethodCollector.m26664o(1527);
        return nativeSetRemoteAudioPlaybackVolume;
    }

    @Override // com.p2082ss.bytertc.engine.GameRTCEngine
    public final int joinRoom(String str, String str2, String str3, GameRTCRoomConfig gameRTCRoomConfig) {
        MethodCollector.m26663i(1293);
        LogUtil.m147885d("GameRTCEngineImpl", "joinRoom with token: " + str3 + " , roomId: " + str + " and userId: " + str2);
        if (this.mNativeGameRtcEngine == -1) {
            LogUtil.m147886e("GameRTCEngineImpl", "native engine is invalid, joinRoom failed.");
            MethodCollector.m26664o(1293);
            return -3;
        } else if (str2 == null || str2.length() == 0) {
            LogUtil.m147886e("GameRTCEngineImpl", "userId is invalid, joinRoom failed.");
            MethodCollector.m26664o(1293);
            return -2;
        } else if (str == null || str.length() == 0) {
            LogUtil.m147886e("GameRTCEngineImpl", "roomId is invalid, joinRoom failed.");
            MethodCollector.m26664o(1293);
            return -1;
        } else {
            int nativeJoinRoom = NativeGameFunctions.nativeJoinRoom(this.mNativeGameRtcEngine, str, str2, str3, gameRTCRoomConfig.enableRangeAudio, gameRTCRoomConfig.audioVolumeIndicationInterval, gameRTCRoomConfig.roomType.value());
            if (nativeJoinRoom < 0) {
                MethodCollector.m26664o(1293);
                return nativeJoinRoom;
            }
            MethodCollector.m26664o(1293);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GameRTCEngineImpl(android.content.Context r21, com.p2082ss.bytertc.engine.game.GameRTCEngineConfig r22, com.p2082ss.bytertc.engine.handler.IGameRTCEventHandler r23, java.lang.String r24) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.GameRTCEngineImpl.<init>(android.content.Context, com.ss.bytertc.engine.game.GameRTCEngineConfig, com.ss.bytertc.engine.handler.IGameRTCEventHandler, java.lang.String):void");
    }
}
