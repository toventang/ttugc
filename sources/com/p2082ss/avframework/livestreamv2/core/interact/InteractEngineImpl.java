package com.p2082ss.avframework.livestreamv2.core.interact;

import android.opengl.EGLContext;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.livestreamv2.IInputVideoStream;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.InteractEngine;
import com.p2082ss.avframework.livestreamv2.core.InteractEngineBuilder;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import com.p2082ss.avframework.livestreamv2.utils.UrlUtils;
import com.p2082ss.avframework.mixer.VideoMixer;
import com.p2082ss.avframework.opengl.GLThreadManager;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.LibraryLoader;
import com.p2082ss.avframework.utils.ThreadUtils;
import com.p2082ss.bytertc.engine.RTCEngine;
import com.p2082ss.bytertc.engine.livertc.LiveRTCEngine;
import com.p2082ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl */
public class InteractEngineImpl implements InteractEngine {
    private static AtomicInteger mAtomicInteger = new AtomicInteger(0);
    private boolean hasRegisterListener;
    private String m1stAddClientStack;
    public InteractAudioClientFactory mAudioClientFactory;
    private List<ILiveStream.IAudioFrameAvailableListener> mAudioFrameListeners = new ArrayList();
    private final Object mAudioFrameListenersFence = new Object();
    public InteractAudioSinkFactory mAudioSinkFactory;
    private long mCameraTimestampNs;
    protected ArrayList<Client> mClientsList;
    private LiveCore.InteractConfig mConfig;
    public boolean mEnableGameMode;
    private InteractEngineBuilder mEngineBuilder;
    public IInputVideoStream mGameInputVideoStream;
    private long mGameLastTimestampNs;
    private String mInteractId = "";
    private boolean mIsInteracting;
    public LiveCore.Builder.ILogMonitor mLogMonitor;
    private JSONObject mMixOnClientParams = null;
    private boolean mNeedChangeInteractModeWhenSwitchMode = false;
    private IInputVideoStream mOrigInputVideoStream;
    private VideoMixer.VideoMixerDescription mOriginVideoDescription;
    private int mRegionCount;
    private String mRtcAppid = "";
    private LiveRTCEngine mRtcEngine;
    private Map<String, Integer> mRtcMaps;
    private Runnable mTaskAfterPushStream;
    private final Object mTaskFence = new Object();
    private List<ILiveStream.ITextureFrameAvailableListener> mTextureFrameListeners = new ArrayList();
    private final Object mTextureFrameListenersFence = new Object();
    public InteractVideoClientFactory mVideoClientFactory;
    public InteractVideoSinkFactory mVideoSinkFactory;
    public boolean mWPublishLeftRightWindow;
    private Handler mWorkThreadHandler;
    public String originUrl;
    public String streamUrl;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl$RtcEglContextCheckerInvocationHandler */
    public static class RtcEglContextCheckerInvocationHandler implements InvocationHandler {
        static {
            Covode.recordClassIndex(100371);
        }

        private RtcEglContextCheckerInvocationHandler() {
        }

        private boolean isProxyOfSameInterfaces(Object obj, Class<?> cls) {
            if (cls.isInstance(obj)) {
                return true;
            }
            if (!Proxy.isProxyClass(obj.getClass()) || !Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces())) {
                return false;
            }
            return true;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z = false;
            if (objArr == null) {
                objArr = new Object[0];
            }
            if (objArr.length == 0 && method.getName().equals("EglContextDestoryStart")) {
                AVLog.m147805d("InteractEngineImpl", "invoke method: " + method.getName());
                GLThreadManager.lockSharedGLContext();
                return obj;
            } else if (objArr.length == 0 && method.getName().equals("EglContextDestoryEnd")) {
                AVLog.m147805d("InteractEngineImpl", "invoke method: " + method.getName());
                GLThreadManager.unlockSharedGLContext();
                return obj;
            } else if (objArr.length == 0 && method.getName().equals("hashCode")) {
                return Integer.valueOf(hashCode());
            } else {
                if (objArr.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == Object.class) {
                    Object obj2 = objArr[0];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj == obj2) {
                        return true;
                    }
                    if (isProxyOfSameInterfaces(obj2, obj.getClass()) && equals(Proxy.getInvocationHandler(obj2))) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } else if (objArr.length != 0 || !method.getName().equals("toString")) {
                    return obj;
                } else {
                    return toString();
                }
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public InteractEngineBuilder getBuilder() {
        return this.mEngineBuilder;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public String getInteractId() {
        return this.mInteractId;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public boolean isInteracting() {
        return this.mIsInteracting;
    }

    private boolean isAudioCaptureStarted() {
        return this.mEngineBuilder.isStatusLiveStreamIsAudioCaptured();
    }

    private boolean isPushStreamStarted() {
        return this.mEngineBuilder.isStatusLiveStreamIsPushed();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$checkReleaseRtcEngine$1$InteractEngineImpl() {
        destroyLiveRTCEngine();
        this.mRtcEngine = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$dispose$2$InteractEngineImpl() {
        destroyLiveRTCEngine();
        this.mRtcEngine = null;
    }

    static {
        Covode.recordClassIndex(100358);
    }

    private void destroyLiveRTCEngine() {
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (liveRTCEngine != null) {
            liveRTCEngine.doDestroy();
            this.mRtcEngine = null;
        }
    }

    private void setByteRtcSoLoader() {
        RTCEngine.setRtcNativeLibraryLoader(new RTCNativeLibraryLoader() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.InteractEngineImpl.C858711 */

            static {
                Covode.recordClassIndex(100362);
            }

            @Override // com.p2082ss.bytertc.engine.loader.RTCNativeLibraryLoader, org.webrtc.NativeLibraryLoader
            public boolean load(String str) {
                try {
                    boolean loadLibrary = LibraryLoader.loadLibrary(str);
                    AVLog.ioi("InteractEngineImpl", "RtcNativeLibraryLoader load(" + str + "): " + loadLibrary);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("loadLibraryPath", str);
                    jSONObject.put("loadResult", loadLibrary);
                    jSONObject.put("LibraryLoaderName", LibraryLoader.class.getSimpleName());
                    if (InteractEngineImpl.this.mLogMonitor != null) {
                        InteractEngineImpl.this.mLogMonitor.onLogMonitor("live_client_monitor_log", jSONObject);
                    }
                    return loadLibrary;
                } catch (Exception e) {
                    e.printStackTrace();
                    AVLog.logToIODevice(6, "InteractEngineImpl", "RtcNativeLibraryLoader load(" + str + ") error", e);
                    return false;
                }
            }
        });
    }

    private void startRtcPublish() {
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.InteractEngineImpl.RunnableC858766 */

            static {
                Covode.recordClassIndex(100367);
            }

            public void run() {
                if (InteractEngineImpl.this.mEnableGameMode) {
                    InteractEngineImpl interactEngineImpl = InteractEngineImpl.this;
                    interactEngineImpl.enableGameModeOnWorkThread(true, interactEngineImpl.mWPublishLeftRightWindow);
                }
            }
        });
        startMixStream();
    }

    public void joinChannel() {
        AVLog.iod("InteractEngineImpl", "joinChannel");
        registerFrameAvailableListener();
    }

    private void registerFrameAvailableListener() {
        if (!this.hasRegisterListener) {
            InteractEngineBuilder interactEngineBuilder = this.mEngineBuilder;
            if (interactEngineBuilder != null) {
                interactEngineBuilder.getLiveCore().addTextureFrameAvailableListener(this);
                this.mEngineBuilder.getLiveCore().addAudioFrameAvailableListener(this);
            }
            this.hasRegisterListener = true;
        }
    }

    private void unRegisterFrameAvailableListener() {
        InteractEngineBuilder interactEngineBuilder = this.mEngineBuilder;
        if (interactEngineBuilder != null) {
            interactEngineBuilder.getLiveCore().removeTextureFrameAvailableListener(this);
            this.mEngineBuilder.getLiveCore().removeAudioFrameAvailableListener(this);
        }
        this.hasRegisterListener = false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public void checkReleaseRtcEngine() {
        if (this.mClientsList.size() == 0 && !this.mEngineBuilder.getWorkThreadHandler().post(new InteractEngineImpl$$Lambda$1(this))) {
            destroyLiveRTCEngine();
            this.mRtcEngine = null;
        }
    }

    public IInputVideoStream getOriginInputVideoStream() {
        if (getBuilder().getLiveCore() != null) {
            return getBuilder().getLiveCore().getOriginInputVideoStream();
        }
        return null;
    }

    public void interactStart() {
        if (getBuilder().getLiveCore() != null) {
            getBuilder().getLiveCore().interactStart();
        }
    }

    public void interactStop() {
        if (getBuilder().getLiveCore() != null) {
            getBuilder().getLiveCore().interactStop();
        }
    }

    public boolean needChangeInteractModeWhenSwitchMode() {
        try {
            JSONObject jSONObject = this.mMixOnClientParams;
            if (jSONObject == null || jSONObject.isNull("checkMixTypeOnSwitchMode") || !this.mMixOnClientParams.getBoolean("checkMixTypeOnSwitchMode")) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    public void stopInteractTask() {
        MethodCollector.m26663i(426);
        synchronized (this.mTaskFence) {
            try {
                Runnable runnable = this.mTaskAfterPushStream;
                if (runnable != null) {
                    runnable.run();
                }
                this.mTaskAfterPushStream = null;
            } finally {
                MethodCollector.m26664o(426);
            }
        }
    }

    private void setRtcEglContextChecker() {
        try {
            Class<?> cls = Class.forName("com.ss.video.rtc.engine.RtcEngine");
            Class<?> cls2 = Class.forName("com.ss.video.rtc.engine.utils.RtcEglContextChecker");
            Method method = cls.getMethod("setRtcEglContextChecker", cls2);
            if (method != null) {
                RtcEglContextCheckerInvocationHandler rtcEglContextCheckerInvocationHandler = new RtcEglContextCheckerInvocationHandler();
                method.invoke(null, Proxy.newProxyInstance(InteractEngineImpl.class.getClassLoader(), new Class[]{cls2}, rtcEglContextCheckerInvocationHandler));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startMixStream() {
        AVLog.iod("InteractEngineImpl", "Start RtcMixStream");
        this.mIsInteracting = true;
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (liveCore != null) {
            if (this.mEngineBuilder.mKeepLiveCoreCapture) {
                AVLog.iod("InteractEngineImpl", "livecore switch audio mode to MODE_VOICE_COMMUNICATION");
                liveCore.switchAudioMode(7);
            } else {
                AVLog.iod("InteractEngineImpl", "stop livecore audio capture");
                liveCore.stopInternalAudioCapture();
            }
            if (this.mEngineBuilder.getMixStreamType() == Config.MixStreamType.SERVER_MIX) {
                liveCore.stopInternal();
            }
        }
    }

    public boolean checkVendorClientMixPercentage() {
        int currentTimeMillis = (int) (System.currentTimeMillis() % 100);
        try {
            JSONObject jSONObject = this.mMixOnClientParams;
            if (jSONObject == null || jSONObject.isNull("byte") || this.mMixOnClientParams.getJSONObject("byte").getInt(this.mConfig.getInteractMode().toString()) <= currentTimeMillis) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
        }
    }

    public void dispose() {
        this.mClientsList.clear();
        if (!this.mEngineBuilder.getWorkThreadHandler().post(new InteractEngineImpl$$Lambda$2(this))) {
            destroyLiveRTCEngine();
            this.mRtcEngine = null;
        }
        unRegisterFrameAvailableListener();
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.InteractEngineImpl.RunnableC858744 */

            static {
                Covode.recordClassIndex(100365);
            }

            public void run() {
                if (InteractEngineImpl.this.mAudioClientFactory != null) {
                    InteractEngineImpl.this.mAudioClientFactory = null;
                }
                if (InteractEngineImpl.this.mVideoClientFactory != null) {
                    InteractEngineImpl.this.mVideoClientFactory = null;
                }
                if (InteractEngineImpl.this.mAudioSinkFactory != null) {
                    InteractEngineImpl.this.mAudioSinkFactory.release();
                    InteractEngineImpl.this.mAudioSinkFactory = null;
                }
                if (InteractEngineImpl.this.mVideoSinkFactory != null) {
                    InteractEngineImpl.this.mVideoSinkFactory.release();
                    InteractEngineImpl.this.mVideoSinkFactory = null;
                }
            }
        });
        enableGameMode(false, false);
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.InteractEngineImpl.RunnableC858755 */

            static {
                Covode.recordClassIndex(100366);
            }

            public void run() {
                if (InteractEngineImpl.this.mGameInputVideoStream != null) {
                    InteractEngineImpl.this.mGameInputVideoStream.release();
                    InteractEngineImpl.this.mGameInputVideoStream = null;
                }
            }
        });
    }

    private void checkMixOnClientParams() {
        Config.MixStreamType mixStreamType;
        Config.MixStreamType mixStreamType2;
        try {
            if (this.mMixOnClientParams != null) {
                AVLog.logKibana(5, "InteractEngineImpl", "mixOnClient Params:" + this.mMixOnClientParams.toString(), null);
                boolean checkVendorClientMixPercentage = checkVendorClientMixPercentage();
                if (this.mConfig.getMixStreamType() != Config.MixStreamType.NONE) {
                    LiveCore.InteractConfig interactConfig = this.mConfig;
                    if (checkVendorClientMixPercentage) {
                        mixStreamType2 = Config.MixStreamType.CLIENT_MIX;
                    } else {
                        mixStreamType2 = Config.MixStreamType.SERVER_MIX;
                    }
                    interactConfig.setMixStreamType(mixStreamType2);
                }
            }
        } catch (Exception unused) {
        }
        int mixType = LiveRTCEngine.getMixType(this.mConfig.getRtcExtInfo());
        if (mixType == 0 || mixType == 1) {
            LiveCore.InteractConfig interactConfig2 = this.mConfig;
            if (mixType == 1) {
                mixStreamType = Config.MixStreamType.CLIENT_MIX;
            } else {
                mixStreamType = Config.MixStreamType.SERVER_MIX;
            }
            interactConfig2.setMixStreamType(mixStreamType);
        }
    }

    private void checkInteractCfg() {
        boolean z;
        boolean z2;
        boolean z3;
        Config.VideoCodec videoCodec;
        Config.AudioProfile audioProfile;
        JSONObject optJSONObject;
        int optInt;
        LiveCore.Builder liveCoreBuilder = this.mEngineBuilder.getLiveCoreBuilder();
        LiveCore.InteractConfig interactConfig = this.mConfig;
        if (interactConfig != null) {
            if (interactConfig.getCharacter() == Config.Character.ANCHOR) {
                z = true;
            } else {
                z = false;
            }
            JSONObject sdkParams = liveCoreBuilder.getSdkParams();
            if (!(sdkParams == null || (optJSONObject = sdkParams.optJSONObject("PushBase")) == null)) {
                if (z && interactConfig.getMixStreamType() != Config.MixStreamType.NONE && interactConfig.isNeedCheckClientMixerParams()) {
                    try {
                        if (!optJSONObject.isNull("mixOnClient")) {
                            this.mMixOnClientParams = optJSONObject.getJSONObject("mixOnClient");
                        }
                    } catch (JSONException unused) {
                    }
                    checkMixOnClientParams();
                }
                if (!optJSONObject.isNull("uploadLogInterval") && (optInt = optJSONObject.optInt("uploadLogInterval")) > 0 && optInt < 180) {
                    interactConfig.setLogReportInterval(optInt);
                }
                if (!optJSONObject.isNull("rtcRoi")) {
                    interactConfig.setRoiOn(optJSONObject.optBoolean("rtcRoi"));
                }
                if (!optJSONObject.isNull("needVideoSinkRenderable")) {
                    interactConfig.setNeedToggleVideoSinkRenderable(optJSONObject.optBoolean("needVideoSinkRenderable"));
                }
                if (!optJSONObject.isNull("enable_interact_connection_statistics")) {
                    interactConfig.setEnableInteractConnectionStatics(optJSONObject.optBoolean("enable_interact_connection_statistics"));
                }
                if (!optJSONObject.isNull("enable_interact_proc_stat")) {
                    interactConfig.setEnabelProcStatics(optJSONObject.optBoolean("enable_interact_proc_stat"));
                }
                if (!optJSONObject.isNull("enable_interact_remote_statics")) {
                    interactConfig.setEnableRemoteUserStatics(optJSONObject.optBoolean("enable_interact_remote_statics"));
                }
                if (!optJSONObject.isNull("setCheckInvalidateSei")) {
                    interactConfig.setCheckInvalidateSei(optJSONObject.optBoolean("setCheckInvalidateSei"));
                }
            }
            if (z) {
                Config.MixStreamConfig mixStreamConfig = interactConfig.getMixStreamConfig();
                Config.MixStreamConfig videoBitrate = mixStreamConfig.setVideoSize(liveCoreBuilder.getVideoWidth(), liveCoreBuilder.getVideoHeight()).setBackgroundColor(interactConfig.getBackgroundColorValue()).setVideoFrameRate(liveCoreBuilder.getVideoFps()).setVideoBitrate(liveCoreBuilder.getVideoBitrate() / 1000);
                if (liveCoreBuilder.getVideoEncoder() == 2) {
                    videoCodec = Config.VideoCodec.BYTEVC1;
                } else {
                    videoCodec = Config.VideoCodec.H264;
                }
                Config.MixStreamConfig audioChannels = videoBitrate.setVideoCodec(videoCodec).setVideoProfile(getVideoProfile(liveCoreBuilder.getVideoEncoder(), liveCoreBuilder.getVideoProfile())).setVideoGop(liveCoreBuilder.getVideoGopSec()).setAudioSampleRate(liveCoreBuilder.getAudioSampleHZ()).setAudioChannels(liveCoreBuilder.getAudioChannel());
                if (liveCoreBuilder.getAudioProfile() == 2) {
                    audioProfile = Config.AudioProfile.HE;
                } else {
                    audioProfile = Config.AudioProfile.LC;
                }
                audioChannels.setAudioProfile(audioProfile).setAudioBitrate(liveCoreBuilder.getAudioBitrate() / 1000);
                String originUrl2 = this.mEngineBuilder.getOriginUrl();
                if (!TextUtils.isEmpty(interactConfig.getMixStreamRtmpUrl())) {
                    originUrl2 = interactConfig.getMixStreamRtmpUrl();
                }
                String DecodeUrl = UrlUtils.DecodeUrl(originUrl2);
                if (!TextUtils.isEmpty(DecodeUrl)) {
                    mixStreamConfig.setStreamUrl(DecodeUrl);
                    mixStreamConfig.setStreamUniqueIdentifier(this.mEngineBuilder.getUUID());
                } else {
                    AVLog.ioe("InteractEngineImpl", "Live stream url is null....");
                }
            } else if (interactConfig.getMixStreamType() != Config.MixStreamType.NONE) {
                AVLog.iow("InteractEngineImpl", "Guest doesn't need mix stream!");
                interactConfig.setMixStreamType(Config.MixStreamType.NONE);
            }
            this.mEngineBuilder.setMixStreamType(interactConfig.getMixStreamType());
            if (getBuilder().getLiveCore() != null) {
                getBuilder().getLiveCore().setMixStreamType(interactConfig.getMixStreamType());
            }
            InteractEngineBuilder interactEngineBuilder = this.mEngineBuilder;
            if (liveCoreBuilder.getAdmType() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            interactEngineBuilder.setByteAudioEnabled(z2);
            AVLog.m147809w("InteractEngineImpl", "AdmType: " + liveCoreBuilder.getAdmType());
            AVLog.iow("InteractEngineImpl", "AdmType: " + liveCoreBuilder.getAdmType());
            if (interactConfig.getMixStreamType() == Config.MixStreamType.CLIENT_MIX || liveCoreBuilder.isUsingExternAudioCaptureOnServerInteractMode()) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.mEngineBuilder.mUseInteractAudioClient = z3;
            this.mEngineBuilder.mUseInteractAudioSink = z3;
            this.mEngineBuilder.mKeepLiveCoreCapture = z3;
            boolean isByteAudioEnabled = this.mEngineBuilder.isByteAudioEnabled();
            if (isByteAudioEnabled) {
                this.mEngineBuilder.mUseInteractAudioClient = false;
                this.mEngineBuilder.mUseInteractAudioSink = false;
                this.mEngineBuilder.mKeepLiveCoreCapture = true;
            }
            if (this.mEngineBuilder.mKeepLiveCoreCapture && !isAudioCaptureStarted()) {
                AVLog.ioe("InteractEngineImpl", "Using livecore audio capture but livecore didn't start audio capture! " + "Rtc ext info: " + interactConfig.getRtcExtInfo() + ", interact mode: " + interactConfig.getInteractMode().toString() + ", character: " + interactConfig.getCharacter().toString() + ", mix type: " + interactConfig.getMixStreamType() + ", use ByteAudio: " + isByteAudioEnabled + ", support external audio source: true");
                this.mEngineBuilder.mKeepLiveCoreCapture = false;
                this.mEngineBuilder.mUseInteractAudioClient = false;
                this.mEngineBuilder.mUseInteractAudioSink = false;
                this.mEngineBuilder.setByteAudioEnabled(false);
            }
            interactConfig.setSharedEGLContext14(GLThreadManager.getEGLContext());
            if (interactConfig.getHandler() == null) {
                interactConfig.setHandler(this.mWorkThreadHandler);
            }
        }
    }

    public void setMixOnClientParams(JSONObject jSONObject) {
        this.mMixOnClientParams = jSONObject;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public Client create(LiveCore.InteractConfig interactConfig) {
        this.mConfig = interactConfig;
        checkInteractCfg();
        Client[] clientArr = new Client[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mEngineBuilder.getWorkThreadHandler(), new InteractEngineImpl$$Lambda$0(this, clientArr, interactConfig));
        return clientArr[0];
    }

    /* access modifiers changed from: package-private */
    public void onRegionChanged(int i) {
        LiveCore liveCore;
        int i2 = this.mRegionCount;
        if (((i2 <= 1 && i > 1) || (i2 > 1 && i <= 1)) && (liveCore = this.mEngineBuilder.getLiveCore()) != null) {
            liveCore.requestKeyFrame();
        }
        this.mRegionCount = i;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public void removeAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        MethodCollector.m26663i(3468);
        synchronized (this.mAudioFrameListenersFence) {
            if (iAudioFrameAvailableListener != null) {
                try {
                    this.mAudioFrameListeners.remove(iAudioFrameAvailableListener);
                } catch (Throwable th) {
                    MethodCollector.m26664o(3468);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(3468);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public boolean removeClient(Client client) {
        boolean remove;
        MethodCollector.m26663i(3674);
        synchronized (this.mClientsList) {
            try {
                remove = this.mClientsList.remove(client);
            } finally {
                MethodCollector.m26664o(3674);
            }
        }
        return remove;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public void removeTextureFrameAvailableListener(LiveCore.ILiveCoreTextureFrameAvailableListener iLiveCoreTextureFrameAvailableListener) {
        MethodCollector.m26663i(3593);
        synchronized (this.mTextureFrameListenersFence) {
            if (iLiveCoreTextureFrameAvailableListener != null) {
                try {
                    this.mTextureFrameListeners.remove(iLiveCoreTextureFrameAvailableListener);
                } catch (Throwable th) {
                    MethodCollector.m26664o(3593);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(3593);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public void start(Client client) {
        AVLog.iod("InteractEngineImpl", "Start client： ".concat(String.valueOf(client)));
        startRtcPublish();
        registerFrameAvailableListener();
    }

    public void startInteract(Client client) {
        AVLog.iod("InteractEngineImpl", "startInteract at client: ".concat(String.valueOf(client)));
        startMixStream();
    }

    public void startPushData(Client client) {
        AVLog.iod("InteractEngineImpl", "startPushData at client: ".concat(String.valueOf(client)));
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.InteractEngineImpl.RunnableC858777 */

            static {
                Covode.recordClassIndex(100368);
            }

            public void run() {
                if (InteractEngineImpl.this.mEnableGameMode) {
                    InteractEngineImpl interactEngineImpl = InteractEngineImpl.this;
                    interactEngineImpl.enableGameModeOnWorkThread(true, interactEngineImpl.mWPublishLeftRightWindow);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public void updateClientMixStreamDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        if (this.mEnableGameMode && this.mGameInputVideoStream != null && videoMixerDescription != null) {
            VideoMixer.VideoMixerDescription videoMixerDescription2 = new VideoMixer.VideoMixerDescription();
            videoMixerDescription2.copy(videoMixerDescription);
            videoMixerDescription2.setVisibility(true);
            this.mGameInputVideoStream.setMixerDescription(videoMixerDescription2);
        }
    }

    private String dealUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.contains("http://")) {
            return str.replace("http", "wss");
        }
        if (str.contains("https://")) {
            return str.replace("https", "wss");
        }
        return str;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public void addAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        MethodCollector.m26663i(3461);
        synchronized (this.mAudioFrameListenersFence) {
            if (iAudioFrameAvailableListener != null) {
                try {
                    if (!this.mAudioFrameListeners.contains(iAudioFrameAvailableListener)) {
                        this.mAudioFrameListeners.add(iAudioFrameAvailableListener);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3461);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(3461);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public void addTextureFrameAvailableListener(LiveCore.ILiveCoreTextureFrameAvailableListener iLiveCoreTextureFrameAvailableListener) {
        MethodCollector.m26663i(3477);
        synchronized (this.mTextureFrameListenersFence) {
            if (iLiveCoreTextureFrameAvailableListener != null) {
                try {
                    if (!this.mTextureFrameListeners.contains(iLiveCoreTextureFrameAvailableListener)) {
                        this.mTextureFrameListeners.add(iLiveCoreTextureFrameAvailableListener);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3477);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(3477);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public void switchMixType(boolean z) {
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (liveCore != null) {
            if (z) {
                this.mEngineBuilder.setMixStreamType(Config.MixStreamType.SERVER_MIX);
                liveCore.setMixStreamType(Config.MixStreamType.SERVER_MIX);
                liveCore.stopInternal();
                return;
            }
            this.mEngineBuilder.setMixStreamType(Config.MixStreamType.CLIENT_MIX);
            liveCore.setMixStreamType(Config.MixStreamType.CLIENT_MIX);
            List<String> urls = liveCore.getUrls();
            if (urls != null && !urls.isEmpty()) {
                liveCore.startInternal(urls);
            }
        }
    }

    public InteractEngineImpl(InteractEngineBuilder interactEngineBuilder) {
        this.mEngineBuilder = interactEngineBuilder;
        this.mLogMonitor = interactEngineBuilder.getLiveCoreBuilder().getLogMonitor();
        setByteRtcSoLoader();
        this.mVideoClientFactory = new InteractVideoClientFactory(this);
        this.mAudioClientFactory = new InteractAudioClientFactory(this);
        this.mVideoSinkFactory = new InteractVideoSinkFactory(this);
        this.mAudioSinkFactory = new InteractAudioSinkFactory(interactEngineBuilder);
        this.mWorkThreadHandler = interactEngineBuilder.getWorkThreadHandler();
        this.mRtcMaps = new HashMap();
        this.mClientsList = new ArrayList<>();
        registerFrameAvailableListener();
        setRtcEglContextChecker();
    }

    private void addClients(Client client) {
        MethodCollector.m26663i(3302);
        if (client == null) {
            MethodCollector.m26664o(3302);
            return;
        }
        client.setInteractEventListener(new Client.InteractEventListener() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.InteractEngineImpl.C858733 */

            static {
                Covode.recordClassIndex(100364);
            }

            @Override // com.p2082ss.avframework.livestreamv2.core.Client.InteractEventListener
            public void onInteractStart(Client client) {
                InteractEngineImpl.this.interactStart();
            }

            @Override // com.p2082ss.avframework.livestreamv2.core.Client.InteractEventListener
            public void onInteractStop(Client client) {
                InteractEngineImpl.this.interactStop();
            }

            @Override // com.p2082ss.avframework.livestreamv2.core.Client.InteractEventListener
            public void notifyLiveStreamAdjustResolution(Client client, boolean z, int i, int i2) {
                InteractEngineImpl.this.updateLiveStreamAdjustResolution(z, i, i2);
            }

            @Override // com.p2082ss.avframework.livestreamv2.core.Client.InteractEventListener
            public void onInteractInfoReport(Client client, String str, int i, long j, Object... objArr) {
                InteractEngineImpl.this.interactInfoReport(client.getRtcEngine().getRtcExtInfo().interactId, client.getConfig().getMixStreamType(), i, j, str, objArr);
            }
        });
        synchronized (this.mClientsList) {
            try {
                if (this.mClientsList.isEmpty()) {
                    this.m1stAddClientStack = Log.getStackTraceString(new Exception());
                } else {
                    AVLog.logKibana(6, "InteractEngineImpl", "Created more than 1 clients.\nstack 1: " + this.m1stAddClientStack + "\nstack 2: " + Log.getStackTraceString(new Exception()), null);
                }
                this.mClientsList.add(client);
            } finally {
                MethodCollector.m26664o(3302);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public int queryRtcId(String str) {
        MethodCollector.m26663i(4270);
        synchronized (this.mRtcMaps) {
            try {
                for (Map.Entry<String, Integer> entry : this.mRtcMaps.entrySet()) {
                    if (entry.getKey().equals(str)) {
                        return entry.getValue().intValue();
                    }
                }
                int incrementAndGet = mAtomicInteger.incrementAndGet();
                this.mRtcMaps.put(str, Integer.valueOf(incrementAndGet));
                MethodCollector.m26664o(4270);
                return incrementAndGet;
            } finally {
                MethodCollector.m26664o(4270);
            }
        }
    }

    private void setRtcParameters(LiveCore.InteractConfig interactConfig) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rtc.aid", interactConfig.getAppId());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_version", interactConfig.getAppVersion());
            jSONObject2.put("app_min_version", interactConfig.getAppMinVersion());
            jSONObject2.put("app_channel", interactConfig.getAppChannel());
            jSONObject.put("rtc.common_extra_info", jSONObject2.toString());
            LiveCore.InteractConfig.UrlDispatcher urlDispatcher = interactConfig.getUrlDispatcher();
            if (urlDispatcher != null) {
                JSONArray jSONArray = new JSONArray();
                String urlDispatch = urlDispatcher.urlDispatch("https://rtc-sg.tiktokv.com/");
                jSONArray.put(urlDispatch);
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject3.put("event_key", "rtc_url_dispatcher");
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("target_url", "https://rtc-sg.tiktokv.com/");
                jSONObject5.put("result_url", urlDispatch);
                jSONObject4.put("config_url", jSONObject5);
                JSONArray jSONArray2 = new JSONArray();
                String urlDispatch2 = urlDispatcher.urlDispatch("https://rtcpc-access-sg.tiktokv.com/");
                String urlDispatch3 = urlDispatcher.urlDispatch("https://rtc-access-sg.tiktokv.com/");
                jSONArray2.put(urlDispatch2);
                jSONArray2.put(urlDispatch3);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("target_url", "https://rtcpc-access-sg.tiktokv.com/");
                jSONObject6.put("result_url", urlDispatch2);
                jSONObject4.put("access_url_rtcpc", jSONObject6);
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("target_url", "https://rtc-access-sg.tiktokv.com/");
                jSONObject7.put("result_url", urlDispatch3);
                jSONObject4.put("access_url_rtc", jSONObject7);
                String str = dealUrl(urlDispatcher.urlDispatch("https://rtc-logger-va.tiktokv.com/")) + "report";
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("target_url", "https://rtc-logger-va.tiktokv.com/");
                jSONObject8.put("result_url", str);
                jSONObject4.put("log_report_url", jSONObject8);
                if (!TextUtils.isEmpty(jSONArray.toString())) {
                    jSONObject.put("config_hosts", jSONArray);
                }
                if (!TextUtils.isEmpty(jSONArray2.toString())) {
                    jSONObject.put("access_hosts", jSONArray2);
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("rtc.log_sdk_websocket_url", str);
                }
                jSONObject3.put("message", jSONObject4.toString());
                LiveCore.Builder.ILogMonitor iLogMonitor = this.mLogMonitor;
                if (iLogMonitor != null) {
                    iLogMonitor.onLogMonitor("live_client_monitor_log", jSONObject3);
                }
            }
            LiveRTCEngine.setParameters(jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public Client createClient(LiveCore.InteractConfig interactConfig) {
        InteractAudioClientFactory interactAudioClientFactory;
        if (this.mRtcEngine == null) {
            LiveRTCEngine.setEnv(interactConfig.getRtcEnv());
            LiveRTCEngine.setDeviceId(interactConfig.getDeviceId());
            setRtcParameters(interactConfig);
            LiveRTCEngine liveRTCEngine = new LiveRTCEngine(interactConfig.getContext(), interactConfig.getRtcExtInfo(), null, interactConfig.getSharedEGLContext14(), null);
            this.mRtcEngine = liveRTCEngine;
            this.mRtcAppid = liveRTCEngine.getAppId();
        }
        if (this.mRtcEngine != null && !this.mRtcAppid.equalsIgnoreCase(LiveRTCEngine.getAppId(interactConfig.getRtcExtInfo()))) {
            this.mRtcEngine.doDestroy();
            LiveRTCEngine.setDeviceId(interactConfig.getDeviceId());
            LiveRTCEngine liveRTCEngine2 = new LiveRTCEngine(interactConfig.getContext(), interactConfig.getRtcExtInfo(), null, interactConfig.getSharedEGLContext14(), null);
            this.mRtcEngine = liveRTCEngine2;
            this.mRtcAppid = liveRTCEngine2.getAppId();
        }
        InteractAudioSinkFactory interactAudioSinkFactory = null;
        if (this.mEngineBuilder.mUseInteractAudioClient) {
            interactAudioClientFactory = this.mAudioClientFactory;
        } else {
            interactAudioClientFactory = null;
        }
        if (this.mEngineBuilder.mUseInteractAudioSink) {
            interactAudioSinkFactory = this.mAudioSinkFactory;
        }
        ClientInternal clientInternal = new ClientInternal(this.mRtcEngine, interactConfig, this.mVideoClientFactory, this.mVideoSinkFactory, interactAudioClientFactory, interactAudioSinkFactory, this);
        if (getBuilder().getLiveCore() != null) {
            getBuilder().getLiveCore().registerInteractListener(new LiveCore.ILiveForInteractListener() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.InteractEngineImpl.C858799 */

                static {
                    Covode.recordClassIndex(100370);
                }

                @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.ILiveForInteractListener
                public void stopInteract() {
                    InteractEngineImpl.this.stopInteractTask();
                }

                @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.ILiveForInteractListener
                public void onPause() {
                    if (InteractEngineImpl.this.mClientsList != null) {
                        Iterator<Client> it = InteractEngineImpl.this.mClientsList.iterator();
                        while (it.hasNext()) {
                            it.next().pause();
                        }
                    }
                }

                @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.ILiveForInteractListener
                public void onResume() {
                    if (InteractEngineImpl.this.mClientsList != null) {
                        Iterator<Client> it = InteractEngineImpl.this.mClientsList.iterator();
                        while (it.hasNext()) {
                            it.next().resume();
                        }
                    }
                }

                @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.ILiveForInteractListener
                public void onDispose() {
                    if (InteractEngineImpl.this.mClientsList != null) {
                        Iterator<Client> it = InteractEngineImpl.this.mClientsList.iterator();
                        while (it.hasNext()) {
                            it.next().stop();
                        }
                    }
                    InteractEngineImpl.this.dispose();
                }

                @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.ILiveForInteractListener
                public void updateOriginUrl(String str) {
                    InteractEngineImpl.this.originUrl = str;
                }

                @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.ILiveForInteractListener
                public void updateStreamUrl(String str) {
                    InteractEngineImpl.this.streamUrl = str;
                }

                @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.ILiveForInteractListener
                public void updateSei(String str, Object obj) {
                    InteractVideoClientFactory interactVideoClientFactory = InteractEngineImpl.this.mVideoClientFactory;
                    if (interactVideoClientFactory != null) {
                        interactVideoClientFactory.needSaveSei(str, obj);
                    }
                }

                @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.ILiveForInteractListener
                public void updateAuthInfo(JSONObject jSONObject, Client.FrameType frameType) {
                    if (InteractEngineImpl.this.mClientsList != null) {
                        Iterator<Client> it = InteractEngineImpl.this.mClientsList.iterator();
                        while (it.hasNext()) {
                            it.next().updateAuthInfo(jSONObject, frameType);
                        }
                    }
                }
            });
        }
        this.mInteractId = this.mRtcEngine.getRtcExtInfo().interactId;
        AVLog.iod("InteractEngineImpl", "Create Interact Client " + clientInternal + " with mix type " + interactConfig.getMixStreamType() + ", VideoClientFactory " + this.mVideoClientFactory + ", VideoSinkFactory " + this.mVideoSinkFactory + ", AudioClientFactory " + interactAudioSinkFactory + ", AudioSinkFactory " + interactAudioClientFactory + ", keep LiveCore capture " + this.mEngineBuilder.mKeepLiveCoreCapture);
        return clientInternal;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public void enableGameMode(final boolean z, final boolean z2) {
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.InteractEngineImpl.RunnableC858722 */

            static {
                Covode.recordClassIndex(100363);
            }

            public void run() {
                InteractEngineImpl.this.enableGameModeOnWorkThread(z, z2);
            }
        });
    }

    private Config.VideoProfile getVideoProfile(int i, int i2) {
        if (i == 2) {
            return Config.VideoProfile.MAIN;
        }
        if (i2 == 2) {
            return Config.VideoProfile.MAIN;
        }
        if (i2 != 3) {
            return Config.VideoProfile.BASELINE;
        }
        return Config.VideoProfile.HIGH;
    }

    public void enableGameModeOnWorkThread(boolean z, boolean z2) {
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (liveCore != null) {
            if (z) {
                liveCore.removeTextureFrameAvailableListener(this);
                enableWPublish(liveCore, z2);
            } else {
                liveCore.addTextureFrameAvailableListener(this);
                disableWPublish(liveCore, z2);
            }
            this.mEnableGameMode = z;
            this.mWPublishLeftRightWindow = z2;
        }
    }

    private void disableWPublish(LiveCore liveCore, boolean z) {
        IInputVideoStream iInputVideoStream = this.mOrigInputVideoStream;
        if (iInputVideoStream != null) {
            AVLog.iow("InteractEngineImpl", "Set LiveCore Origin VideoTrack to Camera.");
            liveCore.setOriginVideoTrack(iInputVideoStream.name());
            iInputVideoStream.setMixerDescription(iInputVideoStream.getMixerDescription().setVisibility(true));
        }
        IInputVideoStream iInputVideoStream2 = this.mGameInputVideoStream;
        if (iInputVideoStream2 != null) {
            iInputVideoStream2.setMixerDescription(iInputVideoStream2.getMixerDescription().setEnableAlphaMode(true).setVisibility(false));
            iInputVideoStream2.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$create$0$InteractEngineImpl(Client[] clientArr, LiveCore.InteractConfig interactConfig) {
        boolean z;
        clientArr[0] = createClient(interactConfig);
        addClients(clientArr[0]);
        if (interactConfig.getViewType() == Config.ViewType.TEXTURE_VIEW) {
            z = true;
        } else {
            z = false;
        }
        AVLog.iod("InteractEngineImpl", "Create interact client(" + interactConfig.getCharacter() + "," + this.mEngineBuilder.getMixStreamType() + " mix with textureView " + z + ") " + clientArr[0]);
    }

    private void enableWPublish(LiveCore liveCore, boolean z) {
        if (this.mGameInputVideoStream == null) {
            this.mGameInputVideoStream = liveCore.createInputVideoStream();
        }
        if (this.mOrigInputVideoStream == null) {
            IInputVideoStream originInputVideoStream = liveCore.getOriginInputVideoStream();
            this.mOrigInputVideoStream = originInputVideoStream;
            this.mOriginVideoDescription = originInputVideoStream.getMixerDescription();
        }
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        videoMixerDescription.copy(this.mOriginVideoDescription);
        if (!isInteracting()) {
            VideoMixer.VideoMixerDescription FILL = VideoMixer.VideoMixerDescription.FILL();
            FILL.setzOrder(Integer.MAX_VALUE).setVisibility(true).setEnableAlphaMode(false).setMode(1);
            this.mGameInputVideoStream.setMixerDescription(FILL);
            videoMixerDescription.setVisibility(false).setzOrder(1);
            this.mOrigInputVideoStream.setMixerDescription(videoMixerDescription);
        } else if (this.mEngineBuilder.getMixStreamType() == Config.MixStreamType.CLIENT_MIX) {
            if (z) {
                VideoMixer.VideoMixerDescription videoMixerDescription2 = new VideoMixer.VideoMixerDescription();
                videoMixerDescription2.copy(videoMixerDescription);
                videoMixerDescription2.setVisibility(true).setEnableAlphaMode(false);
                videoMixerDescription2.setzOrder(Integer.MAX_VALUE);
                this.mGameInputVideoStream.setMixerDescription(videoMixerDescription2);
                videoMixerDescription2.setVisibility(false);
                this.mOrigInputVideoStream.setMixerDescription(videoMixerDescription2);
            } else {
                VideoMixer.VideoMixerDescription FILL2 = VideoMixer.VideoMixerDescription.FILL();
                FILL2.setVisibility(true).setEnableAlphaMode(false);
                FILL2.setzOrder(Integer.MAX_VALUE);
                this.mGameInputVideoStream.setMixerDescription(FILL2);
                videoMixerDescription.setVisibility(false);
                this.mOrigInputVideoStream.setMixerDescription(videoMixerDescription);
            }
        }
        this.mGameInputVideoStream.start();
        if (this.mGameInputVideoStream != null) {
            AVLog.iow("InteractEngineImpl", "Set LiveCore Origin VideoTrack to Game.");
            liveCore.setOriginVideoTrack(this.mGameInputVideoStream.name());
        }
    }

    public void updateLiveStreamAdjustResolution(boolean z, int i, int i2) {
        if (getBuilder().getLiveCore() != null) {
            getBuilder().getLiveCore().notifyLiveStreamAdjustResolution(z, i, i2);
        }
    }

    public void stop(Client client, LiveCore.InteractConfig interactConfig, Runnable runnable) {
        String str;
        List<String> urls;
        MethodCollector.m26663i(187);
        AVLog.iod("InteractEngineImpl", "Stop clientFactory at client: ".concat(String.valueOf(client)));
        this.mIsInteracting = false;
        if (getBuilder().getLiveCore() != null) {
            getBuilder().getLiveCore().setInteractStatus(false);
        }
        synchronized (this.mTaskFence) {
            try {
                this.mTaskAfterPushStream = runnable;
            } finally {
                MethodCollector.m26664o(187);
            }
        }
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.InteractEngineImpl.RunnableC858788 */

            static {
                Covode.recordClassIndex(100369);
            }

            public void run() {
                if (InteractEngineImpl.this.mEnableGameMode) {
                    InteractEngineImpl interactEngineImpl = InteractEngineImpl.this;
                    interactEngineImpl.enableGameModeOnWorkThread(true, interactEngineImpl.mWPublishLeftRightWindow);
                }
            }
        });
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (liveCore != null) {
            if (this.mEngineBuilder.mKeepLiveCoreCapture) {
                AVLog.iod("InteractEngineImpl", "livecore switch audio mode to MODE_MIC");
                liveCore.switchAudioMode(1);
            } else {
                StringBuilder sb = new StringBuilder();
                if (isAudioCaptureStarted()) {
                    str = "";
                } else {
                    str = "don't ";
                }
                AVLog.iod("InteractEngineImpl", sb.append(str).append("start livecore audio capture").toString());
                if (isAudioCaptureStarted()) {
                    liveCore.startInternalAudioCapture();
                }
            }
            if (this.mEngineBuilder.getMixStreamType() == Config.MixStreamType.SERVER_MIX && isPushStreamStarted() && (urls = liveCore.getUrls()) != null && !urls.isEmpty()) {
                liveCore.startInternal(liveCore.getUrls());
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        ArrayList<ILiveStream.IAudioFrameAvailableListener> arrayList;
        MethodCollector.m26663i(422);
        synchronized (this.mAudioFrameListenersFence) {
            try {
                arrayList = new ArrayList(this.mAudioFrameListeners);
            } finally {
                MethodCollector.m26664o(422);
            }
        }
        for (ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener : arrayList) {
            iAudioFrameAvailableListener.onAudioFrameAvailable(buffer, i, i2, i3, j);
        }
    }

    public void interactInfoReport(String str, Object obj, int i, long j, String str2, Object... objArr) {
        if (getBuilder().getLiveCore() != null) {
            getBuilder().getLiveCore().interactInfoReport(str, obj, i, j, str2, objArr);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.InteractEngine
    public void dealSeiInfo(int i, String str, int i2, int i3, int i4, long j, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (byteBuffer == null || byteBuffer.isDirect()) {
            byteBuffer2 = byteBuffer;
        } else {
            byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBuffer2.position(0);
            byteBuffer2.put(byteBuffer);
            byteBuffer.rewind();
            byteBuffer2.position(0);
        }
        if (getBuilder().getLiveCore() != null) {
            getBuilder().getLiveCore().pushSeiData(i, str, i2, i3, i4, null, 0, j, byteBuffer2);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.ILiveCoreTextureFrameAvailableListener
    public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        ArrayList<ILiveStream.ITextureFrameAvailableListener> arrayList;
        long j2;
        IInputVideoStream iInputVideoStream;
        MethodCollector.m26663i(488);
        synchronized (this.mTextureFrameListenersFence) {
            try {
                arrayList = new ArrayList(this.mTextureFrameListeners);
            } finally {
                MethodCollector.m26664o(488);
            }
        }
        if (this.mEnableGameMode) {
            if (this.mGameLastTimestampNs == 0) {
                this.mGameLastTimestampNs = j;
            }
            j2 = this.mCameraTimestampNs + (j - this.mGameLastTimestampNs);
            this.mGameLastTimestampNs = j;
            this.mCameraTimestampNs = j2;
            if ((!isInteracting() || this.mEngineBuilder.getMixStreamType() == Config.MixStreamType.CLIENT_MIX) && (iInputVideoStream = this.mGameInputVideoStream) != null) {
                iInputVideoStream.pushVideoFrame(i, z, i2, i3, 0, fArr, j2 / 1000);
            }
        } else {
            this.mCameraTimestampNs = j;
            this.mGameLastTimestampNs = 0;
            j2 = j;
        }
        for (ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener : arrayList) {
            if (iTextureFrameAvailableListener instanceof LiveCore.ILiveCoreTextureFrameAvailableListener) {
                ((LiveCore.ILiveCoreTextureFrameAvailableListener) iTextureFrameAvailableListener).onTextureFrameAvailable(GLThreadManager.getEGLContext(), i, z, i2, i3, j2, fArr, objArr);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public void onTextureFrameAvailable(javax.microedition.khronos.egl.EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        ArrayList<ILiveStream.ITextureFrameAvailableListener> arrayList;
        long j2;
        IInputVideoStream iInputVideoStream;
        MethodCollector.m26663i(503);
        synchronized (this.mTextureFrameListenersFence) {
            try {
                arrayList = new ArrayList(this.mTextureFrameListeners);
            } finally {
                MethodCollector.m26664o(503);
            }
        }
        int i4 = i2;
        boolean z2 = z;
        int i5 = i;
        float[] fArr2 = fArr;
        int i6 = i3;
        if (this.mEnableGameMode) {
            if (this.mGameLastTimestampNs == 0) {
                this.mGameLastTimestampNs = j;
            }
            j2 = this.mCameraTimestampNs + (j - this.mGameLastTimestampNs);
            this.mGameLastTimestampNs = j;
            this.mCameraTimestampNs = j2;
            if ((!isInteracting() || this.mEngineBuilder.getMixStreamType() == Config.MixStreamType.CLIENT_MIX) && (iInputVideoStream = this.mGameInputVideoStream) != null) {
                iInputVideoStream.pushVideoFrame(i5, z2, i4, i6, 0, fArr2, j2 / 1000);
            }
        } else {
            this.mCameraTimestampNs = j;
            this.mGameLastTimestampNs = 0;
            j2 = j;
        }
        for (ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener : arrayList) {
            if (iTextureFrameAvailableListener instanceof LiveCore.ILiveCoreTextureFrameAvailableListener) {
                ((LiveCore.ILiveCoreTextureFrameAvailableListener) iTextureFrameAvailableListener).onTextureFrameAvailable(GLThreadManager.getEGLContext(), i5, z2, i4, i6, j2, fArr2, objArr);
            } else {
                i5 = i5;
                z2 = z2;
                i4 = i4;
                i6 = i6;
                fArr2 = fArr2;
                iTextureFrameAvailableListener.onTextureFrameAvailable(eGLContext, i5, z2, i4, i6, j2, fArr2, objArr);
            }
        }
    }
}
