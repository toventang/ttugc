package com.p2082ss.avframework.livestreamv2.core.interact.statistic;

import android.os.Handler;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.LocalUserStatistics;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.ProcInfoStatistics;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.RemoteUserStatistics;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.bytertc.engine.livertc.LiveRTCExtInfo;
import com.p2082ss.ugc.live.sdk.message.BuildConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService */
public class InteractLogService {
    private boolean isFirstLocalExternalAudioFrame = true;
    private boolean isFirstLocalExternalVideoFrame = true;
    private String mByteRtcVersion = "";
    public Config mConfig;
    public boolean mFirstJoin = true;
    private long mFirstRemoteUserJoinedTs;
    private LogCallback mLogCallback;
    private Handler mLogUploadThreadHandler;
    public int mPushedAudioFramesAbNormal = 0;
    public int mPushedAudioFramesNormal = 0;
    public int mPushedVideoFramesAbNormal = 0;
    public int mPushedVideoFramesNormal = 0;
    private long mRtcAudioFirstFrameTimeCost = 0;
    public LiveRTCExtInfo mRtcExtInfo;
    private long mRtcJoinChannelTimeCost = 0;
    private long mRtcSubscribeAudioTimeCost = 0;
    private long mRtcSubscribeVideoTimeCost = 0;
    private long mRtcVideoFirstFrameTimeCost = 0;
    private long mStartJoiningTs;
    private long mStartReconnectTs;
    private String mThirdPartySdkVersion = "";
    public ConcurrentHashMap<String, Boolean> mUserFirstAudioFrameChecker;
    public ConcurrentHashMap<String, Boolean> mUserFirstVideoFrameChecker;
    private boolean mbStreamPublished;
    private final AtomicLong sLogId = new AtomicLong(0);

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService$LogCallback */
    public interface LogCallback {
        static {
            Covode.recordClassIndex(100440);
        }

        void onLogReport(String str, JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(100409);
    }

    public void onCallJoinChannel() {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC858942 */

            static {
                Covode.recordClassIndex(100421);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("call_join_channel", currentTimeMillis);
                if (createCommonLog != null) {
                    InteractLogService.this.reportLog(createCommonLog);
                }
            }
        });
    }

    public void onConnectionLost() {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8588511 */

            static {
                Covode.recordClassIndex(100412);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_connect_lost", currentTimeMillis);
                if (createCommonLog != null) {
                    InteractLogService.this.reportLog(createCommonLog);
                }
            }
        });
    }

    public void onReconnected() {
        final long j = 0;
        if (this.mStartReconnectTs != 0) {
            j = System.currentTimeMillis() - this.mStartReconnectTs;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8588915 */

            static {
                Covode.recordClassIndex(100416);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_reconnected", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("elapsed", j);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onReconnecting() {
        this.mStartReconnectTs = System.currentTimeMillis();
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8588814 */

            static {
                Covode.recordClassIndex(100415);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_reconnect", currentTimeMillis);
                if (createCommonLog != null) {
                    InteractLogService.this.reportLog(createCommonLog);
                }
            }
        });
    }

    public void onFirstLocalExternalAudioFrame() {
        if (this.mStartJoiningTs > 0 && this.isFirstLocalExternalAudioFrame) {
            this.isFirstLocalExternalAudioFrame = false;
            final long currentTimeMillis = System.currentTimeMillis();
            final long currentTimeMillis2 = System.currentTimeMillis() - this.mStartJoiningTs;
            this.mLogUploadThreadHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC859085 */

                static {
                    Covode.recordClassIndex(100435);
                }

                public void run() {
                    JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_first_local_audio", currentTimeMillis);
                    if (createCommonLog != null) {
                        try {
                            createCommonLog.put("elapsed", currentTimeMillis2);
                            InteractLogService.this.reportLog(createCommonLog);
                        } catch (JSONException e) {
                            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                        }
                    }
                }
            });
        }
    }

    public void onFirstLocalExternalVideoFrame() {
        if (this.mStartJoiningTs > 0 && this.isFirstLocalExternalVideoFrame) {
            this.isFirstLocalExternalVideoFrame = false;
            final long currentTimeMillis = System.currentTimeMillis();
            final long currentTimeMillis2 = System.currentTimeMillis() - this.mStartJoiningTs;
            this.mLogUploadThreadHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC859074 */

                static {
                    Covode.recordClassIndex(100434);
                }

                public void run() {
                    JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_first_local_video", currentTimeMillis);
                    if (createCommonLog != null) {
                        try {
                            createCommonLog.put("elapsed", currentTimeMillis2);
                            InteractLogService.this.reportLog(createCommonLog);
                        } catch (JSONException e) {
                            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                        }
                    }
                }
            });
        }
    }

    public void onJoinChannelSuccess() {
        final long j = 0;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
            this.mRtcJoinChannelTimeCost = j;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC859053 */

            static {
                Covode.recordClassIndex(100432);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_join_channel_success", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("elapsed", j).put("account", InteractLogService.this.mRtcExtInfo.userId).put("first_joined", InteractLogService.this.mFirstJoin);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
        this.mFirstJoin = false;
    }

    public void onLeaveChannelReturn() {
        final long j;
        this.isFirstLocalExternalAudioFrame = true;
        this.isFirstLocalExternalVideoFrame = true;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
            this.mStartJoiningTs = 0;
        } else {
            j = 0;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8588410 */

            static {
                Covode.recordClassIndex(100411);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_leave_channel_callback", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("elapsed", j);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService$30 */
    public static /* synthetic */ class C8590630 {

        /* renamed from: $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioProfile */
        static final /* synthetic */ int[] f191991xf675bb31;

        /* renamed from: $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Character */
        static final /* synthetic */ int[] f191992x8ed401ab;

        /* renamed from: $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Type */
        static final /* synthetic */ int[] f191993xdc48bf78;

        /* renamed from: $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$VideoCodec */
        static final /* synthetic */ int[] f191994x9f752a19;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|21|22|(3:23|24|26)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006a */
        static {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.C8590630.<clinit>():void");
        }
    }

    public JSONObject getStaticsMessage() {
        int i = this.mPushedAudioFramesAbNormal;
        int i2 = this.mPushedAudioFramesNormal;
        int i3 = this.mPushedVideoFramesAbNormal;
        int i4 = this.mPushedVideoFramesNormal;
        this.mPushedAudioFramesAbNormal = 0;
        this.mPushedAudioFramesNormal = 0;
        this.mPushedVideoFramesAbNormal = 0;
        this.mPushedVideoFramesNormal = 0;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("statics", i4 + "," + i3 + "," + i2 + "," + i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void onFirstRemoteVideoRender(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8589218 */

            static {
                Covode.recordClassIndex(100419);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_first_remote_video_render", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("remote_rtc_user_id", str);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onInteractConnectionTimeCount(final long[] jArr) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8589924 */

            static {
                Covode.recordClassIndex(100426);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("interact_connection_time", currentTimeMillis);
                if (createCommonLog != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("from_live_broadcast_to_interact", jArr[0]).put("from_interact_to_live_broadcast", jArr[1]);
                        createCommonLog.put("message", jSONObject.toString());
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onNetworkChanged(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8589117 */

            static {
                Covode.recordClassIndex(100418);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_network_changed", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("access", str);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onRtcUpdateLayout(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8590025 */

            static {
                Covode.recordClassIndex(100427);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_update_layout", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("message", str);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    private String getCharacterName(Config.Character character) {
        int i = C8590630.f191992x8ed401ab[character.ordinal()];
        if (i == 1) {
            return "host";
        }
        if (i != 2) {
            return "unknown";
        }
        return "guest";
    }

    private String parseInteractTypeString(Config.Type type) {
        int i = C8590630.f191993xdc48bf78[type.ordinal()];
        if (i == 1) {
            return "video";
        }
        if (i != 2) {
            return "unknown";
        }
        return DataType.AUDIO;
    }

    public String getAudioProfile(Config.AudioProfile audioProfile) {
        int i = C8590630.f191991xf675bb31[audioProfile.ordinal()];
        if (i == 1) {
            return "LC";
        }
        if (i != 2) {
            return "";
        }
        return "HE";
    }

    public String getVideoCodec(Config.VideoCodec videoCodec) {
        int i = C8590630.f191994x9f752a19[videoCodec.ordinal()];
        if (i == 1) {
            return "h264";
        }
        if (i != 2) {
            return "";
        }
        return "bytevc1";
    }

    public void onPublishStream(final int i) {
        if (!this.mbStreamPublished) {
            this.mbStreamPublished = true;
            final long currentTimeMillis = System.currentTimeMillis();
            this.mLogUploadThreadHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8589319 */

                static {
                    Covode.recordClassIndex(100420);
                }

                public void run() {
                    JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_publish_stream", currentTimeMillis);
                    if (createCommonLog != null) {
                        try {
                            createCommonLog.put("error_code", i);
                            if (InteractLogService.this.mConfig.getMixStreamConfig() != null) {
                                Config.MixStreamConfig mixStreamConfig = InteractLogService.this.mConfig.getMixStreamConfig();
                                createCommonLog.put("url", mixStreamConfig.getStreamUrl()).put("audio_profile", InteractLogService.this.getAudioProfile(mixStreamConfig.getAudioProfile())).put("meta_video_bitrate", mixStreamConfig.getVideoBitrate()).put("meta_video_framerate", mixStreamConfig.getVideoFrameRate()).put("width", mixStreamConfig.getVideoWidth()).put("height", mixStreamConfig.getVideoHeight()).put("video_codec", InteractLogService.this.getVideoCodec(mixStreamConfig.getVideoCodec())).put("live_stream_session_id", mixStreamConfig.getStreamUniqueId());
                            }
                            InteractLogService.this.reportLog(createCommonLog);
                        } catch (JSONException e) {
                            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                        }
                    }
                }
            });
        }
    }

    public String genMixAudioReportJson(Config.MixStreamConfig mixStreamConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("audio_sample_rate", mixStreamConfig.getAudioSampleRateValue());
            jSONObject.put("audio_channel", mixStreamConfig.getAudioChannels());
            jSONObject.put("audio_profile", mixStreamConfig.getAudioProfile().toString());
            jSONObject.put("audio_bitrate", mixStreamConfig.getAudioBitrate());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String getVideoQuality(Config.VideoQuality videoQuality) {
        return videoQuality.getOrigWidth() + "x" + videoQuality.getOrigHeight() + "x" + videoQuality.getFps() + "x" + videoQuality.getBitrate();
    }

    public void reportLog(JSONObject jSONObject) {
        AVLog.debugTrace(jSONObject);
        LogCallback logCallback = this.mLogCallback;
        if (logCallback != null) {
            try {
                if (!"rtc_push_stream".equals(jSONObject.getString("event_key"))) {
                    AVLog.ioi("live_client_monitor_log", jSONObject.toString());
                }
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
            logCallback.onLogReport("live_client_monitor_log", jSONObject);
        }
    }

    public String genMixVideoReportJson(Config.MixStreamConfig mixStreamConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", mixStreamConfig.getVideoWidth());
            jSONObject.put("height", mixStreamConfig.getVideoHeight());
            jSONObject.put("fps", mixStreamConfig.getVideoFrameRate());
            jSONObject.put("codec", mixStreamConfig.getVideoCodec());
            jSONObject.put("video_profile", mixStreamConfig.getVideoProfile().toString().toLowerCase());
            jSONObject.put("video_bitrate", mixStreamConfig.getVideoBitrate());
            jSONObject.put("gop", (double) mixStreamConfig.getVideoGop());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String getRemoteStaticsInfo(Map<String, RemoteUserStatistics.RemoteUserInfo> map) {
        if (map == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str : map.keySet()) {
                RemoteUserStatistics.RemoteUserInfo remoteUserInfo = map.get(str);
                if (remoteUserInfo != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("user_id", str).put("recv_video_bitrate", remoteUserInfo.videoBitrate).put("recv_vdecode_fps", remoteUserInfo.videoDecodeFps).put("recv_vrender_fps", remoteUserInfo.videoRenderFps).put("recv_video_loss", remoteUserInfo.videoLossRate).put("recv_audio_bitrate", remoteUserInfo.audioBitrate).put("recv_audio_delay", remoteUserInfo.audioDelay).put("recv_audio_loss", remoteUserInfo.audioLossRate).put("recv_audio_volume", remoteUserInfo.audioVoiceVolume);
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public void setRtcSdkVersions(String str, String str2) {
        this.mByteRtcVersion = str;
        this.mThirdPartySdkVersion = str2;
    }

    public void addVideoFramesReport(final boolean z, final boolean z2) {
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8590429 */

            static {
                Covode.recordClassIndex(100431);
            }

            public void run() {
                if (z) {
                    if (z2) {
                        InteractLogService.this.mPushedAudioFramesNormal++;
                        return;
                    }
                    InteractLogService.this.mPushedAudioFramesAbNormal++;
                } else if (z2) {
                    InteractLogService.this.mPushedVideoFramesNormal++;
                } else {
                    InteractLogService.this.mPushedVideoFramesAbNormal++;
                }
            }
        });
    }

    private void onReportRtcStat(final String str, final long j) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC859118 */

            static {
                Covode.recordClassIndex(100438);
            }

            public void run() {
                String str;
                JSONObject createCommonLog = InteractLogService.this.createCommonLog(str, currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        if (j > 0) {
                            str = "success";
                        } else {
                            str = "failed";
                        }
                        createCommonLog.put("result", str);
                        createCommonLog.put("stat_elapsed", j);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.iow("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onConnectFailed(final int i, final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8589016 */

            static {
                Covode.recordClassIndex(100417);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_connect_fail", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("error_code", i).put("message", str);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onEngineAPICall(final String str, final String str2) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8590126 */

            static {
                Covode.recordClassIndex(100428);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_engine_api_call", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("engine_api_name", str).put("api_parameter_info", str2);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onErrorOccurs(final int i, final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8588612 */

            static {
                Covode.recordClassIndex(100413);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_occur_error", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("error_code", i);
                        createCommonLog.put("message", str);
                        createCommonLog.put("rtc_token", InteractLogService.this.mRtcExtInfo.token);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onRemoteVideoFrozen(final String str, final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8589621 */

            static {
                Covode.recordClassIndex(100423);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_remote_video_frozen", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("remote_rtc_user_id", str).put("elapsed", i);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onWarningOccurs(final int i, final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8588713 */

            static {
                Covode.recordClassIndex(100414);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_occur_warning", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("error_code", i);
                        createCommonLog.put("message", str);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onFirstRemoteFrame(final boolean z, final String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.mStartJoiningTs;
        final long j2 = 0;
        if (j != 0) {
            j2 = currentTimeMillis - j;
        }
        if (z) {
            this.mRtcSubscribeAudioTimeCost = currentTimeMillis - this.mFirstRemoteUserJoinedTs;
            this.mRtcAudioFirstFrameTimeCost = currentTimeMillis - j;
        } else {
            this.mRtcSubscribeVideoTimeCost = currentTimeMillis - this.mFirstRemoteUserJoinedTs;
            this.mRtcVideoFirstFrameTimeCost = currentTimeMillis - j;
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC859096 */

            static {
                Covode.recordClassIndex(100436);
            }

            public void run() {
                String str;
                ConcurrentHashMap<String, Boolean> concurrentHashMap;
                InteractLogService interactLogService = InteractLogService.this;
                if (z) {
                    str = "rtc_first_remote_audio";
                } else {
                    str = "rtc_first_remote_video";
                }
                JSONObject createCommonLog = interactLogService.createCommonLog(str, currentTimeMillis2);
                if (createCommonLog != null) {
                    try {
                        if (z) {
                            concurrentHashMap = InteractLogService.this.mUserFirstAudioFrameChecker;
                        } else {
                            concurrentHashMap = InteractLogService.this.mUserFirstVideoFrameChecker;
                        }
                        boolean z = true;
                        if (concurrentHashMap.containsKey(str)) {
                            z = concurrentHashMap.get(str);
                        }
                        createCommonLog.put("remote_rtc_user_id", str).put("elapsed", j2).put("first_joined", z);
                        concurrentHashMap.put(str, false);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onRemoteUserOnlineOffline(final boolean z, final String str) {
        final long j;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
        } else {
            j = 0;
        }
        if (z) {
            this.mFirstRemoteUserJoinedTs = System.currentTimeMillis();
            this.mRtcSubscribeVideoTimeCost = 0;
            this.mRtcSubscribeAudioTimeCost = 0;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC859107 */

            static {
                Covode.recordClassIndex(100437);
            }

            public void run() {
                String str;
                InteractLogService interactLogService = InteractLogService.this;
                if (z) {
                    str = "rtc_remote_user_joined";
                } else {
                    str = "rtc_remote_user_offline";
                }
                JSONObject createCommonLog = interactLogService.createCommonLog(str, currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("remote_rtc_user_id", str).put("elapsed", j);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
        if (z) {
            if (!this.mUserFirstVideoFrameChecker.containsKey(str)) {
                this.mUserFirstVideoFrameChecker.put(str, true);
            }
            if (!this.mUserFirstAudioFrameChecker.containsKey(str)) {
                this.mUserFirstAudioFrameChecker.put(str, true);
            }
        }
    }

    public JSONObject createCommonLog(String str, long j) {
        String str2;
        try {
            JSONObject put = new JSONObject().put("version", BuildConfig.VERSION_NAME).put("event_key", str).put("mode", "rtc").put("timestamp", j).put("project_key", this.mConfig.getProjectKey()).put("report_version", 5).put("product_line", "live").put("sdkParams", this.mConfig.getRtcExtInfo()).put("rtc_channel_id", this.mRtcExtInfo.channelId).put("rtc_user_id", this.mRtcExtInfo.interactId).put("rtc_type", this.mConfig.getInteractMode().toString()).put("rtc_interact_type", parseInteractTypeString(this.mConfig.getType())).put("rtc_vendor", this.mRtcExtInfo.vendorName).put("rtc_role", getCharacterName(this.mConfig.getCharacter())).put("rtc_version", this.mThirdPartySdkVersion).put("rtc_sdk_version", this.mByteRtcVersion).put("live_sdk_version", "10.5.0.11-a").put("rtc_app_channel", this.mConfig.getAppChannel()).put("rtc_report_id", this.sLogId.incrementAndGet()).put("mix_type", this.mConfig.getMixStreamType().toString());
            if (this.mConfig.getMixStreamConfig() != null) {
                str2 = this.mConfig.getMixStreamConfig().getStreamName();
            } else {
                str2 = "";
            }
            return put.put("stream_name", str2);
        } catch (JSONException e) {
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            return null;
        }
    }

    public void onEngineCallBack(final String str, final String str2, final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8590227 */

            static {
                Covode.recordClassIndex(100429);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_engine_callback", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("engine_callback_name", str).put("callback_parameter_info", str2).put("callback_error_code", i);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onInteractStatus(final LocalUserStatistics.LocalUserStatisticInfo localUserStatisticInfo, final Map<String, RemoteUserStatistics.RemoteUserInfo> map, final ProcInfoStatistics.ProcInfo procInfo) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8589823 */

            static {
                Covode.recordClassIndex(100425);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_push_stream", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        LocalUserStatistics.LocalUserStatisticInfo localUserStatisticInfo = localUserStatisticInfo;
                        if (localUserStatisticInfo != null) {
                            createCommonLog.put("send_audio_bitrate", localUserStatisticInfo.mSendAudioBitrate).put("receive_audio_bitrate", localUserStatisticInfo.mReceiveAudioBitrate).put("send_video_bitrate", localUserStatisticInfo.mSendVideoBitrate).put("receive_video_bitrate", localUserStatisticInfo.mReceiveVideoBitrate).put("user_count", localUserStatisticInfo.mUserCount).put("real_video_framerate", localUserStatisticInfo.mSendVideoFrameRate).put("send_vencode_fps", localUserStatisticInfo.mSendVideoEncoderOutputFrameRate).put("send_encode_fps", localUserStatisticInfo.mSendVideoEncoderOutputFrameRate).put("rtc_tx_quality", localUserStatisticInfo.mNetWorkQuality).put("preview_fps", localUserStatisticInfo.mVideoSourceFrameRate).put("asource_fps", localUserStatisticInfo.mAudioSourceFrameRate).put("width", localUserStatisticInfo.mVideoSourceWidth).put("height", localUserStatisticInfo.mVideoSourceHeight).put("rms", localUserStatisticInfo.mRMS);
                        }
                        createCommonLog.put("remote_user_info", InteractLogService.this.getRemoteStaticsInfo(map));
                        ProcInfoStatistics.ProcInfo procInfo = procInfo;
                        if (procInfo != null) {
                            createCommonLog.put("rtc_app_cpu", (int) procInfo.appCpuUsed).put("rtc_sys_cpu", (int) procInfo.totalCpuUsed).put("rtc_app_memory", (int) procInfo.appUsedMemory).put("rtc_sys_memory", (int) procInfo.systemUsedMemory);
                        }
                        if (localUserStatisticInfo != null) {
                            JSONObject staticsMessage = InteractLogService.this.getStaticsMessage();
                            staticsMessage.put("local_mic_db", localUserStatisticInfo.mLocalMicVolumedB);
                            staticsMessage.put("adm_status", localUserStatisticInfo.mAdmStatus);
                            staticsMessage.put("in_cap_fps", (int) localUserStatisticInfo.mInCapFps);
                            staticsMessage.put("rtc_push_frame_elapse", localUserStatisticInfo.mRtcPushElapseMs);
                            staticsMessage.put("rtc_last_message", localUserStatisticInfo.mLastMessage);
                            createCommonLog.put("message", staticsMessage.toString());
                        }
                        Config config = InteractLogService.this.mConfig;
                        if (config != null) {
                            createCommonLog.put("video_codec", InteractLogService.this.getVideoCodec(config.getMixStreamConfig().getVideoCodec()));
                        }
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onMediaStateChanged(final String str, final int i, final String str2) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8590328 */

            static {
                Covode.recordClassIndex(100430);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_media_state_changed", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("message", str).put("state", i).put("remote_rtc_user_id", str2);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onProviderEvent(final String str, final String str2, final String str3) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8589722 */

            static {
                Covode.recordClassIndex(100424);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_provider_event", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_name", str).put("direction", str2).put("message", str3);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onStreamStateChange(final int i, final String str, final int i2) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC8589520 */

            static {
                Covode.recordClassIndex(100422);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_stream_state_changed", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("error_code", i).put("message", str).put("state", i2);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onLeavingChannel(final long j, final String str, final String str2) {
        final long j2;
        if (this.mStartJoiningTs != 0) {
            j2 = System.currentTimeMillis() - this.mStartJoiningTs;
        } else {
            j2 = 0;
        }
        onReportRtcStat("rtc_join_channel_stat", this.mRtcJoinChannelTimeCost);
        onReportRtcStat("rtc_subscribe_audio_stat", this.mRtcSubscribeAudioTimeCost);
        onReportRtcStat("rtc_subscribe_video_stat", this.mRtcSubscribeVideoTimeCost);
        onReportRtcStat("rtc_video_first_frame_stat", this.mRtcVideoFirstFrameTimeCost);
        onReportRtcStat("rtc_audio_first_frame_stat", this.mRtcAudioFirstFrameTimeCost);
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC859129 */

            static {
                Covode.recordClassIndex(100439);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_leave_channel", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("elapsed", j2).put("pull_streams_video_duration", j).put("remote_video_color_range", str).put("transform_color_range", str2);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public void onJoiningChannel(final int i, final String str, final String str2, final String str3) {
        this.mStartJoiningTs = System.currentTimeMillis();
        this.mRtcJoinChannelTimeCost = 0;
        this.mRtcSubscribeAudioTimeCost = 0;
        this.mRtcSubscribeVideoTimeCost = 0;
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.RunnableC858831 */

            static {
                Covode.recordClassIndex(100410);
            }

            public void run() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_join_channel", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        Config.VideoQuality videoQuality = InteractLogService.this.mConfig.getVideoQuality();
                        Config.MixStreamConfig mixStreamConfig = InteractLogService.this.mConfig.getMixStreamConfig();
                        JSONObject put = createCommonLog.put("error_code", i).put("rtc_video_profile", InteractLogService.this.getVideoQuality(videoQuality)).put("account", InteractLogService.this.mRtcExtInfo.userId);
                        String str = str;
                        String str2 = "";
                        if (str == null) {
                            str = str2;
                        }
                        JSONObject put2 = put.put("rtc_token", str).put("width", videoQuality.getWidth()).put("height", videoQuality.getHeight()).put("fps", videoQuality.getFps()).put("video_bitrate", videoQuality.getBitrate()).put("rtc_mix_audio_profile", InteractLogService.this.genMixAudioReportJson(mixStreamConfig)).put("mix_video_profile", InteractLogService.this.genMixVideoReportJson(mixStreamConfig));
                        String str3 = str2;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        put2.put("rtc_app_id", str2).put("message", str3);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.iow("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }
        });
    }

    public InteractLogService(LiveRTCExtInfo liveRTCExtInfo, Config config, LogCallback logCallback, Handler handler) {
        this.mRtcExtInfo = liveRTCExtInfo;
        this.mConfig = config;
        this.mLogCallback = logCallback;
        this.mUserFirstAudioFrameChecker = new ConcurrentHashMap<>();
        this.mUserFirstVideoFrameChecker = new ConcurrentHashMap<>();
        this.mLogUploadThreadHandler = handler;
    }
}
