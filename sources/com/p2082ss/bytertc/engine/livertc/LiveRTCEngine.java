package com.p2082ss.bytertc.engine.livertc;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.bytertc.engine.RTCEngine;
import com.p2082ss.bytertc.engine.RTCStream;
import com.p2082ss.bytertc.engine.SubscribeConfig;
import com.p2082ss.bytertc.engine.UserInfo;
import com.p2082ss.bytertc.engine.VideoStreamDescription;
import com.p2082ss.bytertc.engine.data.MuteState;
import com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p2082ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.p2082ss.bytertc.engine.live.LiveTranscoding;
import com.p2082ss.bytertc.engine.livertc.RTCChannelState;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine */
public class LiveRTCEngine extends RTCEngineImpl implements ILiveRtcEventObserver {
    private String mAppId;
    private VideoStreamDescription mClientMixVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
    private Context mContext;
    private VideoStreamDescription mCustomVideoPreset = null;
    private boolean mDualStreamMode = false;
    private int mEnableAutoSwitchDualStreamMode = 0;
    private boolean mEnableRecvDualStream = false;
    private VideoStreamDescription mHDLiveVideoPreset = LiveVideoPreset.HD_LIVE_VIDEO_PRESET;
    private RTCHandlerProxy mHandlerProxy = null;
    private LiveRTCExtInfo mLiveRtcExtInfo = new LiveRTCExtInfo();
    private LiveTranscoding mLiveTransCoding;
    private ScheduledFuture<?> mLiveTransCodingFuture = null;
    private int mLiveVideoMode = 0;
    private VideoStreamDescription mLiveVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
    private int mMaxTransCodingCbIntervalSecond = 5;
    private int mMixStreamType = 0;
    private MuteState mMuteLocalAudioStream = MuteState.MUTE_STATE_OFF;
    private MuteState mMuteRemoteAllAudioStreams = MuteState.MUTE_STATE_OFF;
    private Map<String, RTCStream> mRTCStreamMap = new ConcurrentHashMap();
    private int mRemoteDefaultStreamType = 0;
    private Set<String> mRemoteUserSet = new ConcurrentSkipListSet();
    private RTCChannelState mRtcChannelState = new RTCChannelState();
    private RTCPhoneStateListener mRtcPhoneStateListener;
    private VideoStreamDescription mSDLiveVideoPreset = LiveVideoPreset.SD_LIVE_VIDEO_PRESET;
    private VideoStreamDescription mServerMixVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
    private int mSwitchDualStreamModeThreshold = 2;
    private int mTransCodeCnt = 0;
    private ScheduledExecutorService mWorkExecutor;
    private Thread mWorkerThread;

    /* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$RtcErrorCode */
    public static class RtcErrorCode {
        static {
            Covode.recordClassIndex(101095);
        }
    }

    static {
        Covode.recordClassIndex(101082);
    }

    public MuteState getMuteLocalAudioStream() {
        return this.mMuteLocalAudioStream;
    }

    public MuteState getMuteRemoteAllAudioStreams() {
        return this.mMuteRemoteAllAudioStreams;
    }

    public LiveRTCExtInfo getRtcExtInfo() {
        return this.mLiveRtcExtInfo;
    }

    public boolean isDualStream() {
        return this.mDualStreamMode;
    }

    public String getAppId() {
        String str = this.mAppId;
        if (str != null) {
            return str;
        }
        return null;
    }

    public String getBusinessId() {
        return this.mLiveRtcExtInfo.businessId;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$parseRTCExtInfo$5$LiveRTCEngine() {
        IRTCEngineEventHandler handler;
        RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
        if (rTCHandlerProxy != null && (handler = rTCHandlerProxy.getHandler()) != null) {
            handler.onError(1217);
        }
    }

    private void stopLiveTranscodingTimer() {
        ScheduledFuture<?> scheduledFuture = this.mLiveTransCodingFuture;
        if (scheduledFuture != null) {
            if (scheduledFuture.isDone() || this.mLiveTransCodingFuture.isCancelled()) {
                this.mLiveTransCodingFuture = null;
                return;
            }
            this.mLiveTransCodingFuture.cancel(false);
            this.mLiveTransCodingFuture = null;
        }
    }

    public void disableRtcPhoneListener() {
        ScheduledExecutorService scheduledExecutorService = this.mWorkExecutor;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.mWorkExecutor.execute(new LiveRTCEngine$$Lambda$2(this));
        }
    }

    @Override // com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void doDestroy() {
        this.mCustomVideoPreset = null;
        this.mLiveRtcExtInfo.reset();
        resetLiveRtcParam();
        disableRtcPhoneListener();
        this.mWorkExecutor.shutdown();
        this.mAppId = null;
        super.doDestroy();
    }

    public void enableRtcPhoneListener() {
        ScheduledExecutorService scheduledExecutorService = this.mWorkExecutor;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.mWorkExecutor.execute(new LiveRTCEngine$$Lambda$1(this));
        }
    }

    public VideoStreamDescription getRtcVideoResolution() {
        int i = this.mLiveVideoMode;
        if (i == 0) {
            VideoStreamDescription videoStreamDescription = this.mCustomVideoPreset;
            if (videoStreamDescription != null) {
                return videoStreamDescription;
            }
            return this.mLiveVideoPreset;
        } else if (i != 2) {
            return this.mLiveVideoPreset;
        } else {
            return this.mHDLiveVideoPreset;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$disableRtcPhoneListener$2$LiveRTCEngine() {
        TelephonyManager telephonyManager;
        Context context = this.mContext;
        if (context != null && this.mRtcPhoneStateListener != null && (telephonyManager = (TelephonyManager) m147873x77b037ef(context, "phone")) != null) {
            telephonyManager.listen(this.mRtcPhoneStateListener, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$enableRtcPhoneListener$1$LiveRTCEngine() {
        TelephonyManager telephonyManager;
        Context context = this.mContext;
        if (context != null && this.mRtcPhoneStateListener != null && (telephonyManager = (TelephonyManager) m147873x77b037ef(context, "phone")) != null) {
            telephonyManager.listen(this.mRtcPhoneStateListener, 32);
        }
    }

    private void resetLiveRtcParam() {
        this.mRemoteUserSet.clear();
        this.mLiveVideoMode = 0;
        this.mDualStreamMode = false;
        this.mRemoteDefaultStreamType = 0;
        this.mEnableAutoSwitchDualStreamMode = 0;
        this.mSwitchDualStreamModeThreshold = 2;
        this.mMixStreamType = 0;
        this.mClientMixVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
        this.mServerMixVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
        this.mLiveVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
        this.mHDLiveVideoPreset = LiveVideoPreset.HD_LIVE_VIDEO_PRESET;
        this.mSDLiveVideoPreset = LiveVideoPreset.SD_LIVE_VIDEO_PRESET;
        this.mLiveRtcExtInfo.reset();
        this.mRTCStreamMap.clear();
        this.mCustomVideoPreset = null;
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine, com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl
    public int leaveRoom() {
        if (this.mRtcChannelState.getChannelState() == RTCChannelState.ChannelState.CHANNEL_STATE_LEAVE_CHANNEL) {
            return -1;
        }
        int leaveRoom = super.leaveRoom();
        setBusinessId("");
        this.mRtcChannelState.leaveChannel();
        stopLiveTranscodingTimer();
        resetLiveRtcParam();
        return leaveRoom;
    }

    /* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$LiveVideoPreset */
    public static class LiveVideoPreset {
        public static final VideoStreamDescription DEFAULT_LIVE_VIDEO_PRESET = new VideoStreamDescription(368, 640, 15, 800, VideoStreamDescription.EncoderPreference.MaintainQuality.getValue());
        public static final VideoStreamDescription HD_LIVE_VIDEO_PRESET = new VideoStreamDescription(368, 640, 15, 800, VideoStreamDescription.EncoderPreference.MaintainQuality.getValue());
        public static final VideoStreamDescription SD_LIVE_VIDEO_PRESET = new VideoStreamDescription(272, 480, 15, 500, VideoStreamDescription.EncoderPreference.MaintainQuality.getValue());

        static {
            Covode.recordClassIndex(101094);
        }
    }

    private void configVideoParam() {
        IRTCEngineEventHandler handler;
        ArrayList arrayList = new ArrayList();
        int i = this.mLiveVideoMode;
        if (!(i == 0 || i == 1)) {
            if (i == 2) {
                VideoStreamDescription videoStreamDescription = this.mHDLiveVideoPreset;
                if (videoStreamDescription != null && this.mSDLiveVideoPreset != null) {
                    arrayList.add(videoStreamDescription);
                    arrayList.add(this.mSDLiveVideoPreset);
                    super.setVideoEncoderConfig(arrayList);
                    this.mEnableRecvDualStream = true;
                    RTCEngine.SubscribeMode subscribeMode = RTCEngine.SubscribeMode.MANUAL_SUBSCRIBE_MODE;
                    enableAutoSubscribe(subscribeMode, subscribeMode);
                    return;
                }
                return;
            } else if (i != 3) {
                LogUtil.m147886e("LiveRtcEngine", "live vieo mode is error, live mode: " + this.mLiveVideoMode);
                RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
                if (!(rTCHandlerProxy == null || (handler = rTCHandlerProxy.getHandler()) == null)) {
                    handler.onError(1215);
                }
                arrayList.add(this.mLiveVideoPreset);
                super.setVideoEncoderConfig(arrayList);
                return;
            }
        }
        VideoStreamDescription videoStreamDescription2 = this.mLiveVideoPreset;
        if (videoStreamDescription2 != null) {
            arrayList.add(videoStreamDescription2);
            super.setVideoEncoderConfig(arrayList);
        }
    }

    /* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$AutoDualStreamMode */
    public class AutoDualStreamMode {
        static {
            Covode.recordClassIndex(101090);
        }

        public AutoDualStreamMode() {
        }
    }

    /* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$DualStreamRemoteStreamType */
    public class DualStreamRemoteStreamType {
        static {
            Covode.recordClassIndex(101091);
        }

        public DualStreamRemoteStreamType() {
        }
    }

    /* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$LiveMixStreamMode */
    public class LiveMixStreamMode {
        static {
            Covode.recordClassIndex(101092);
        }

        public LiveMixStreamMode() {
        }
    }

    /* renamed from: com.ss.bytertc.engine.livertc.LiveRTCEngine$LiveRtcVideoMode */
    public class LiveRtcVideoMode {
        static {
            Covode.recordClassIndex(101093);
        }

        public LiveRtcVideoMode() {
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine, com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void muteAllRemoteAudio(MuteState muteState) {
        this.mMuteRemoteAllAudioStreams = muteState;
        super.muteAllRemoteAudio(muteState);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine, com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void muteLocalAudio(MuteState muteState) {
        this.mMuteLocalAudioStream = muteState;
        super.muteLocalAudio(muteState);
    }

    public int setRtcExtInfo(String str) {
        return parseRTCExtInfo(str);
    }

    private void parseRtcMixParam(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mLiveRtcExtInfo.mixMaxBitrateKbps = jSONObject.optInt("video_bitrate_kbps");
        }
    }

    private void updateRtcVideoParam(JSONObject jSONObject) {
        if (jSONObject != null) {
            parseLiveRtcVideoParam(jSONObject);
            configVideoParam();
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine, com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void setRtcEngineEventHandler(IRTCEngineEventHandler iRTCEngineEventHandler) {
        RTCHandlerProxy rTCHandlerProxy = new RTCHandlerProxy(iRTCEngineEventHandler, this);
        this.mHandlerProxy = rTCHandlerProxy;
        super.setRtcEngineEventHandler(rTCHandlerProxy);
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine, com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl
    public int setVideoEncoderConfig(List<VideoStreamDescription> list) {
        if (this.mLiveVideoMode == 0) {
            return super.setVideoEncoderConfig(list);
        }
        return 0;
    }

    /* renamed from: com_ss_bytertc_engine_livertc_LiveRTCEngine_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadScheduledExecutor */
    public static ScheduledExecutorService m147874x8874510(ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        a.f95509g = threadFactory;
        return (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
    }

    public static String getAppId(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("live_rtc_engine_config");
            if (optJSONObject != null) {
                return optJSONObject.optString("rtc_app_id");
            }
            return null;
        } catch (JSONException e) {
            LogUtil.m147887e("LiveRtcEngine", "get app id exception", e);
            return null;
        }
    }

    private void parseLiveRtcOther(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("max_transcoding_cb_interval_second")) {
            this.mMaxTransCodingCbIntervalSecond = jSONObject.optInt("max_transcoding_cb_interval_second");
        }
    }

    public int joinRoom(String str) {
        this.mRtcChannelState.joinChannel();
        return joinRoom(this.mLiveRtcExtInfo.token, this.mLiveRtcExtInfo.channelId, new UserInfo(this.mLiveRtcExtInfo.interactId, ""), RTCEngine.ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Thread lambda$new$0$LiveRTCEngine(Runnable runnable) {
        Thread thread = new Thread(runnable);
        this.mWorkerThread = thread;
        thread.setName("live-rtc-worker-thread");
        this.mWorkerThread.setDaemon(Thread.currentThread().isDaemon());
        return this.mWorkerThread;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$startLiveTranscoding$3$LiveRTCEngine(LiveTranscoding liveTranscoding) {
        IRTCEngineEventHandler handler = this.mHandlerProxy.getHandler();
        if (handler != null && this.mRtcChannelState.getChannelState() == RTCChannelState.ChannelState.CHANNEL_STATE_JOIN_CHANNEL_SUCCESS) {
            handler.onLiveTranscodingResult(liveTranscoding.getUrl(), 0);
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine, com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void updateLiveTranscoding(LiveTranscoding liveTranscoding) {
        if (!(this.mLiveRtcExtInfo.mixMaxBitrateKbps <= 0 || liveTranscoding == null || liveTranscoding.getVideo() == null)) {
            liveTranscoding.getVideo().setKBitRate(this.mLiveRtcExtInfo.mixMaxBitrateKbps);
        }
        this.mLiveTransCoding = liveTranscoding;
        super.updateLiveTranscoding(liveTranscoding);
    }

    public static int getMixType(String str) {
        try {
            int i = new JSONObject(str).getJSONObject("live_rtc_video_param").getInt("rtc_mix_type");
            if (i < 0 || i > 3) {
                return 2;
            }
            return i;
        } catch (JSONException e) {
            LogUtil.m147889w("LiveRtcEngine", "parseRTCExtInfo happen exception" + e.getStackTrace().toString());
            return 2;
        }
    }

    private VideoStreamDescription parseVideoPreset(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new VideoStreamDescription(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("fps"), jSONObject.optInt("bitrate_kbps"), VideoStreamDescription.EncoderPreference.MaintainQuality.getValue());
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$handleTransCodeError$6$LiveRTCEngine(int i) {
        IRTCEngineEventHandler handler;
        RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
        if (rTCHandlerProxy != null && (handler = rTCHandlerProxy.getHandler()) != null) {
            if (i != 2 && i != 3) {
                this.mTransCodeCnt = 0;
                if (this.mLiveTransCoding != null) {
                    handler.onError(1307);
                }
            } else if (this.mTransCodeCnt < 3 && this.mLiveTransCoding != null) {
                stopLiveTranscoding();
                startLiveTranscoding(this.mLiveTransCoding, null);
                this.mTransCodeCnt++;
            }
        }
    }

    public int updateRtcExtInfo(String str) {
        int i = -1;
        if (str == null) {
            return -1;
        }
        try {
            updateRtcVideoParam(new JSONObject(str).optJSONObject("live_rtc_video_param"));
            i = 0;
            return 0;
        } catch (JSONException e) {
            LogUtil.m147887e("LiveRtcEngine", "update rtc info happen exception rtcExtInfo:".concat(String.valueOf(str)), e);
            return i;
        }
    }

    private static JSONObject parseEngineParameters(String str) {
        JSONObject jSONObject = new JSONObject();
        LogUtil.m147888i("LiveRtcEngine", "rtcExtInfo:".concat(String.valueOf(str)));
        if (str != null && !str.equals("")) {
            try {
                String optString = new JSONObject(str).optString("rtc.ab_label");
                if (!optString.isEmpty()) {
                    jSONObject.put("rtc.ab_label", optString);
                }
            } catch (JSONException e) {
                LogUtil.m147889w("LiveRtcEngine", "parseRTCExtInfo happen exception" + e.getStackTrace().toString());
            }
        }
        return jSONObject;
    }

    private void parseRtcDualStreamParam(JSONObject jSONObject) {
        VideoStreamDescription videoStreamDescription;
        VideoStreamDescription videoStreamDescription2;
        if (jSONObject != null) {
            this.mRemoteDefaultStreamType = jSONObject.optInt("remote_default_stream_type");
            this.mEnableAutoSwitchDualStreamMode = jSONObject.optInt("is_auto_switch");
            this.mSwitchDualStreamModeThreshold = jSONObject.optInt("auto_switch_user_num");
            if (parseVideoPreset(jSONObject.optJSONObject("hd_video_param")) != null) {
                videoStreamDescription = parseVideoPreset(jSONObject.optJSONObject("hd_video_param"));
            } else {
                videoStreamDescription = LiveVideoPreset.HD_LIVE_VIDEO_PRESET;
            }
            this.mHDLiveVideoPreset = videoStreamDescription;
            if (parseVideoPreset(jSONObject.optJSONObject("sd_video_param")) != null) {
                videoStreamDescription2 = parseVideoPreset(jSONObject.optJSONObject("sd_video_param"));
            } else {
                videoStreamDescription2 = LiveVideoPreset.SD_LIVE_VIDEO_PRESET;
            }
            this.mSDLiveVideoPreset = videoStreamDescription2;
        }
    }

    @Override // com.p2082ss.bytertc.engine.livertc.ILiveRtcEventObserver
    public void onStreamAdd(RTCStream rTCStream) {
        if (rTCStream != null && rTCStream.userId != this.mLiveRtcExtInfo.interactId && this.mEnableRecvDualStream) {
            this.mRTCStreamMap.put(rTCStream.userId, rTCStream);
            if (this.mRTCStreamMap.size() >= this.mSwitchDualStreamModeThreshold && this.mEnableAutoSwitchDualStreamMode == 1) {
                for (RTCStream rTCStream2 : this.mRTCStreamMap.values()) {
                    subscribeRemoteStream(rTCStream2, 1);
                }
            } else if (this.mEnableAutoSwitchDualStreamMode == 1) {
                subscribeRemoteStream(rTCStream, this.mRemoteDefaultStreamType);
            }
        }
    }

    private void parseLiveRtcVideoParam(JSONObject jSONObject) {
        IRTCEngineEventHandler handler;
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("rtc_video_param_mode");
            this.mLiveVideoMode = optInt;
            if (optInt == 0) {
                this.mLiveVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
            } else if (optInt == 1) {
                JSONObject optJSONObject = jSONObject.optJSONObject("rtc_video_param_server_define");
                if (optJSONObject != null) {
                    this.mLiveVideoPreset = parseVideoPreset(optJSONObject);
                }
            } else if (optInt == 2) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("rtc_dual_stream_param");
                if (optJSONObject2 != null) {
                    parseRtcDualStreamParam(optJSONObject2);
                }
            } else if (optInt != 3) {
                LogUtil.m147886e("LiveRtcEngine", "sLiveVideoMode type error, sLiveVideoMode:" + this.mLiveVideoMode);
                RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
                if (!(rTCHandlerProxy == null || (handler = rTCHandlerProxy.getHandler()) == null)) {
                    handler.onError(1216);
                }
                this.mLiveVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
            } else {
                JSONObject optJSONObject3 = jSONObject.optJSONObject("rtc_video_param_1v1_client");
                if (optJSONObject3 != null) {
                    this.mClientMixVideoPreset = parseVideoPreset(optJSONObject3);
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("rtc_video_param_1v1_server");
                if (optJSONObject4 != null) {
                    this.mServerMixVideoPreset = parseVideoPreset(optJSONObject4);
                }
                if (this.mMixStreamType == 1) {
                    this.mLiveVideoPreset = this.mClientMixVideoPreset;
                } else {
                    this.mLiveVideoPreset = this.mServerMixVideoPreset;
                }
            }
            parseRtcMixParam(jSONObject.optJSONObject("rtc_mix_param"));
        }
    }

    private int parseRTCExtInfo(String str) {
        IRTCEngineEventHandler handler;
        LogUtil.m147888i("LiveRtcEngine", "rtcExtInfo:".concat(String.valueOf(str)));
        if (str == null || str.equals("")) {
            RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
            if (!(rTCHandlerProxy == null || (handler = rTCHandlerProxy.getHandler()) == null)) {
                this.mWorkExecutor.execute(new LiveRTCEngine$$Lambda$4(handler));
            }
            return -1;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("live_rtc_engine_config");
            if (optJSONObject != null) {
                String str2 = this.mAppId;
                if (str2 == null) {
                    this.mAppId = optJSONObject.optString("rtc_app_id");
                } else if (!str2.equals(optJSONObject.optString("rtc_app_id"))) {
                    this.mWorkExecutor.execute(new LiveRTCEngine$$Lambda$5(this));
                }
                this.mLiveRtcExtInfo.token = optJSONObject.optString("rtc_token");
                this.mLiveRtcExtInfo.vendor = optJSONObject.optInt("rtc_vendor");
                this.mLiveRtcExtInfo.appSignature = Base64.decode(optJSONObject.optString("rtc_app_sign"), 0);
                this.mLiveRtcExtInfo.channelId = optJSONObject.optString("rtc_channel_id");
                this.mLiveRtcExtInfo.interactId = optJSONObject.optString("rtc_user_id");
                this.mLiveRtcExtInfo.interactIdMode = optJSONObject.optInt("rtc_user_id_mode");
                this.mLiveRtcExtInfo.vendorName = "byte";
                this.mLiveRtcExtInfo.userId = optJSONObject.optString("user_id");
            }
            parseLiveRtcVideoParam(jSONObject.optJSONObject("live_rtc_video_param"));
            parseLiveRtcOther(jSONObject.optJSONObject("rtc_other"));
            this.mLiveRtcExtInfo.businessId = jSONObject.optString("rtc_business_id");
            LogUtil.m147888i("LiveRtcEngine", "rtcExtInfo:" + str + " sAppID:" + this.mAppId + " sToken:" + this.mLiveRtcExtInfo.token + " rtc_vendor" + this.mLiveRtcExtInfo.vendor + " rtc_app_sign:" + this.mLiveRtcExtInfo.appSignature + " mChannelId:" + this.mLiveRtcExtInfo.channelId + " mUserId" + this.mLiveRtcExtInfo.interactId + " mEnableInteractIdIntMode" + this.mLiveRtcExtInfo.interactIdMode + " mTraceId" + this.mLiveRtcExtInfo.userId);
            return 0;
        } catch (JSONException e) {
            LogUtil.m147889w("LiveRtcEngine", "parseRTCExtInfo happen exception" + e.getStackTrace().toString());
            return -1;
        }
    }

    @Override // com.p2082ss.bytertc.engine.livertc.ILiveRtcEventObserver
    public void onLiveTranscodingResult(String str, int i) {
        stopLiveTranscodingTimer();
        handleTransCodeError(str, i);
    }

    private int subscribeRemoteStream(RTCStream rTCStream, int i) {
        if (rTCStream == null) {
            return -1;
        }
        SubscribeConfig subscribeConfig = new SubscribeConfig();
        subscribeConfig.subAudio = true;
        subscribeConfig.subVideo = true;
        subscribeConfig.isScreen = rTCStream.isScreen;
        subscribeConfig.videoIndex = getStreamIndexFromRTCStream(rTCStream, i);
        subscribeStream(rTCStream.userId, subscribeConfig);
        return 0;
    }

    private void handleTransCodeError(String str, int i) {
        LogUtil.m147888i("LiveRtcEngine", "handleTransCodeError url:" + str + " errorCode:" + i);
        if (i != 0) {
            this.mWorkExecutor.execute(new LiveRTCEngine$$Lambda$6(this, i));
        }
    }

    public int configureEngine(LiveInfo liveInfo, IRTCEngineEventHandler iRTCEngineEventHandler) {
        int i = liveInfo.mixType;
        this.mMixStreamType = i;
        if (3 == this.mLiveVideoMode) {
            if (1 == i) {
                this.mLiveVideoPreset = this.mClientMixVideoPreset;
            } else {
                this.mLiveVideoPreset = this.mServerMixVideoPreset;
            }
        }
        if (!(this.mLiveRtcExtInfo.businessId == null || this.mLiveRtcExtInfo.businessId == "")) {
            setBusinessId(this.mLiveRtcExtInfo.businessId);
        }
        configVideoParam();
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.livertc.ILiveRtcEventObserver
    public void onStreamRemove(RTCStream rTCStream, IRTCEngineEventHandler.StreamRemoveReason streamRemoveReason) {
        this.mRTCStreamMap.remove(rTCStream.userId);
        if (rTCStream.userId != this.mLiveRtcExtInfo.interactId && this.mEnableRecvDualStream && this.mRTCStreamMap.size() < this.mSwitchDualStreamModeThreshold && this.mEnableAutoSwitchDualStreamMode == 1) {
            for (RTCStream rTCStream2 : this.mRTCStreamMap.values()) {
                subscribeRemoteStream(rTCStream2, this.mRemoteDefaultStreamType);
            }
        }
    }

    @Override // com.p2082ss.bytertc.engine.RTCEngine, com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void startLiveTranscoding(LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver) {
        if (!(this.mLiveRtcExtInfo.mixMaxBitrateKbps <= 0 || liveTranscoding == null || liveTranscoding.getVideo() == null)) {
            liveTranscoding.getVideo().setKBitRate(this.mLiveRtcExtInfo.mixMaxBitrateKbps);
        }
        this.mLiveTransCoding = liveTranscoding;
        this.mLiveTransCodingFuture = this.mWorkExecutor.schedule(new LiveRTCEngine$$Lambda$3(this, liveTranscoding), (long) this.mMaxTransCodingCbIntervalSecond, TimeUnit.SECONDS);
        super.startLiveTranscoding(liveTranscoding, iLiveTranscodingObserver);
    }

    /* renamed from: com_ss_bytertc_engine_livertc_LiveRTCEngine_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m147873x77b037ef(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1555);
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
                    MethodCollector.m26664o(1555);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private int getStreamIndexFromRTCStream(RTCStream rTCStream, int i) {
        int i2 = 0;
        int intValue = ((Integer) rTCStream.videoStreamDescriptions.get(0).videoSize.first).intValue() * ((Integer) rTCStream.videoStreamDescriptions.get(0).videoSize.second).intValue();
        if (i == 0) {
            for (VideoStreamDescription videoStreamDescription : rTCStream.videoStreamDescriptions) {
                if (((Integer) videoStreamDescription.videoSize.first).intValue() * ((Integer) videoStreamDescription.videoSize.second).intValue() > intValue) {
                    intValue = ((Integer) videoStreamDescription.videoSize.first).intValue() * ((Integer) videoStreamDescription.videoSize.second).intValue();
                    i2 = rTCStream.videoStreamDescriptions.indexOf(videoStreamDescription);
                }
            }
        } else if (i == 1) {
            for (VideoStreamDescription videoStreamDescription2 : rTCStream.videoStreamDescriptions) {
                if (((Integer) videoStreamDescription2.videoSize.first).intValue() * ((Integer) videoStreamDescription2.videoSize.second).intValue() < intValue) {
                    intValue = ((Integer) videoStreamDescription2.videoSize.first).intValue() * ((Integer) videoStreamDescription2.videoSize.second).intValue();
                    i2 = rTCStream.videoStreamDescriptions.indexOf(videoStreamDescription2);
                }
            }
        }
        return i2;
    }

    public LiveRTCEngine(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Object obj, JSONObject jSONObject) {
        super(context, getAppId(str), iRTCEngineEventHandler, obj, parseEngineParameters(str));
        setRtcEngineEventHandler(iRTCEngineEventHandler);
        setRtcExtInfo(str);
        this.mContext = context;
        this.mRtcPhoneStateListener = new RTCPhoneStateListener(context, this);
        this.mWorkExecutor = m147874x8874510(new LiveRTCEngine$$Lambda$0(this));
    }
}
