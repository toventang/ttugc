package com.p2082ss.avframework.livestreamv2.core;

import android.opengl.EGLContext;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.MediaSource;
import com.p2082ss.avframework.engine.MediaTrack;
import com.p2082ss.avframework.engine.VideoSink;
import com.p2082ss.avframework.engine.VsyncModule;
import com.p2082ss.avframework.livestreamv2.IDualGameEngine;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import com.p2082ss.avframework.livestreamv2.ktv.IKaraokeMovie;
import com.p2082ss.avframework.livestreamv2.log.ILogUploader;
import com.p2082ss.avframework.opengl.GLThreadManager;
import com.p2082ss.avframework.opengl.GLTracer;
import com.p2082ss.avframework.player.IAVPlayer;
import com.p2082ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.LiveCore */
public abstract class LiveCore implements ILiveStream {
    protected ILiveCoreWarningListener mWarningListener;

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$ILiveCoreTextureFrameAvailableListener */
    public interface ILiveCoreTextureFrameAvailableListener extends ILiveStream.ITextureFrameAvailableListener {
        static {
            Covode.recordClassIndex(100238);
        }

        void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$ILiveCoreWarningListener */
    public interface ILiveCoreWarningListener {
        static {
            Covode.recordClassIndex(100239);
        }

        void onWarning(int i, int i2, Exception exc);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$ILiveForInteractListener */
    public interface ILiveForInteractListener {
        static {
            Covode.recordClassIndex(100240);
        }

        void onDispose();

        void onPause();

        void onResume();

        void stopInteract();

        void updateAuthInfo(JSONObject jSONObject, Client.FrameType frameType);

        void updateOriginUrl(String str);

        void updateSei(String str, Object obj);

        void updateStreamUrl(String str);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$IPushFrameAfterCapture */
    public interface IPushFrameAfterCapture {
        static {
            Covode.recordClassIndex(100241);
        }

        void release();

        void start(Surface surface);

        void stop();

        void toAddSurfaceViewCallback();

        void toRemoveSurfaceViewCallback();
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$RtcExtraDataListener */
    public interface RtcExtraDataListener {
        static {
            Covode.recordClassIndex(100244);
        }

        void onRtcData(String str, String str2);

        void onRtcData(String str, ByteBuffer byteBuffer);
    }

    static {
        Covode.recordClassIndex(100233);
    }

    public abstract void addAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener);

    public abstract void addTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener);

    public void changeToKTVMode(boolean z, IKaraokeMovie iKaraokeMovie) {
    }

    public abstract Client create(InteractConfig interactConfig);

    public abstract IPushFrameAfterCapture createControlPushFrameAfterCapture(int i, int i2);

    public abstract IAVPlayer createPlayer();

    public abstract MediaTrack createTrack(MediaSource mediaSource, String str);

    public abstract AudioDeviceModule getADM();

    public abstract IAudioDeviceControl getAudioDeviceControl();

    public abstract View getCurrentDisplay();

    public abstract IDualGameEngine getDualGameEngine();

    public abstract IGameEngine getGameEngine();

    /* access modifiers changed from: protected */
    public abstract Builder getInternalBuilder();

    public abstract ILayerControl getLayerControl();

    public abstract boolean getPreviewFitMode();

    public abstract boolean getPreviewMirror(boolean z);

    public abstract List<String> getUrls();

    public abstract VsyncModule getVsyncModule();

    /* access modifiers changed from: protected */
    public abstract Handler getWorkThreadHandler();

    public void interactInfoReport(String str, Object obj, int i, long j, String str2, Object... objArr) {
    }

    public void interactStart() {
    }

    public void interactStop() {
    }

    public void notifyLiveStreamAdjustResolution(boolean z, int i, int i2) {
    }

    public void pause(Object obj) {
    }

    public void pushMixedAudio() {
    }

    public void pushMixedMetaData() {
    }

    public void pushMixedVideo() {
    }

    public void pushSeiData(int i, String str, int i2, int i3, int i4, float[] fArr, int i5, long j, ByteBuffer byteBuffer) {
    }

    public void registerInteractListener(ILiveForInteractListener iLiveForInteractListener) {
    }

    public void release(Object obj) {
    }

    public abstract void removeAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener);

    public abstract void removeTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener);

    public void resume(Object obj) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
    }

    public void setAudioMute(boolean z, Object obj) {
    }

    public abstract void setDisplay(View view);

    public abstract void setDisplay(View view, long j);

    public abstract void setDisplayPlanarRender(boolean z);

    public void setInteractStatus(boolean z) {
    }

    public void setMixStreamType(Config.MixStreamType mixStreamType) {
    }

    public abstract void setPreviewFitMode(boolean z);

    public abstract void setPreviewMirror(boolean z, boolean z2);

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setRenderSink(VideoSink videoSink) {
    }

    public void setRtcExtraDataListener(RtcExtraDataListener rtcExtraDataListener) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
    }

    public void startAudioCapture(Object obj) {
    }

    public abstract int startAudioPlayer();

    public abstract void startInternal(List<String> list);

    public abstract void startInternalAudioCapture();

    public void startVideoCapture(Object obj) {
    }

    public void stopAudioCapture(Object obj) {
    }

    public abstract int stopAudioPlayer();

    public abstract void stopInternal();

    public abstract void stopInternalAudioCapture();

    public void stopVideoCapture(Object obj) {
    }

    public void switchAudioCapture(int i, Object obj) {
    }

    public void switchVideoCapture(int i, Object obj) {
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$Builder */
    public static class Builder extends LiveStreamBuilder {
        private boolean enableAecOnHeadsetMode = true;
        private boolean enableRtcExtraDataPeriodSend;
        private boolean fixRemoteYuvProjection = true;
        private boolean getLiveStreamInfoSyncGetMicDB = true;
        private boolean mADMRenderMode = true;
        private boolean mAGCEnableOnAecV2Mode = false;
        private String mAdmPlayerType = null;
        private String mAdmRecordingType = null;
        private JSONObject mAdmServerCfg = null;
        private int mAdmType = 0;
        private String mHardwareAudioEffectTable = "";
        private boolean mInteractSingleViewMode;
        public ILogMonitor mLogMonitor = new ILogMonitor() {
            /* class com.p2082ss.avframework.livestreamv2.core.LiveCore.Builder.C857951 */

            static {
                Covode.recordClassIndex(100235);
            }

            @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.Builder.ILogMonitor
            public void onLogMonitor(String str, JSONObject jSONObject) {
            }
        };
        private boolean mMergeRtcExtraDataToLiveStream = false;
        private boolean mNeedChangeBitrateWhenClientMixer;
        private int mNsModeOnAecV2 = 0;
        private boolean mPkAudienceSetUpConnectionOptimize;
        private boolean mPushStreamSwitchAfterServerMixStream;
        private int mRtcOnLoggerMessageLevel;
        private int mSupportHardWareEarMonitor = 0;
        private boolean mUsingAecV2Algorithm = true;
        private boolean mUsingLiveCoreAudioCaptureOnServerInteractMode;
        private IVideoEffectProcessor mVideoEffectProcessor;
        private int videoClientMixerBitrate;
        private int videoClientMixerMaxBitrate;
        private int videoClientMixerMinBitrate;
        private boolean videoRangeModeInRtc = true;

        /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$Builder$ILogMonitor */
        public interface ILogMonitor {
            static {
                Covode.recordClassIndex(100237);
            }

            void onLogMonitor(String str, JSONObject jSONObject);
        }

        static {
            Covode.recordClassIndex(100234);
        }

        public void setInteractSingleViewMode(boolean z) {
        }

        @Override // com.p2082ss.avframework.livestreamv2.LiveStreamBuilder
        public Builder setLogUploader(ILogUploader iLogUploader) {
            return this;
        }

        public void setSupportHardWareEarMonitorFlag(int i) {
        }

        public JSONObject getAdmServerCfg() {
            return this.mAdmServerCfg;
        }

        public String getHardWareAudioEffectTable() {
            return this.mHardwareAudioEffectTable;
        }

        public ILogMonitor getLogMonitor() {
            return this.mLogMonitor;
        }

        public boolean getPkAudienceSetUpConnectionOptimize() {
            return this.mPkAudienceSetUpConnectionOptimize;
        }

        public boolean getPushStreamSwitchAfterServerMixStream() {
            return this.mPushStreamSwitchAfterServerMixStream;
        }

        public int getRtcOnLoggerMessageLevel() {
            return this.mRtcOnLoggerMessageLevel;
        }

        public int getSupportHardWareEarMonitorFlag() {
            return this.mSupportHardWareEarMonitor;
        }

        public int getVideoClientMixerBitrate() {
            return this.videoClientMixerBitrate;
        }

        public int getVideoClientMixerMaxBitrate() {
            return this.videoClientMixerMaxBitrate;
        }

        public int getVideoClientMixerMinBitrate() {
            return this.videoClientMixerMinBitrate;
        }

        public IVideoEffectProcessor getVideoEffectProcessor() {
            return this.mVideoEffectProcessor;
        }

        public boolean isEnableRtcExtraDataPeriodSend() {
            return this.enableRtcExtraDataPeriodSend;
        }

        public boolean isFixRemoteYuvProjection() {
            return this.fixRemoteYuvProjection;
        }

        public boolean isGameUseCameraMainMode() {
            return this.mInteractSingleViewMode;
        }

        public boolean isGetLiveStreamInfoSyncGetMicDB() {
            return this.getLiveStreamInfoSyncGetMicDB;
        }

        public boolean isNeedChangeBitrateWhenClientMixer() {
            return this.mNeedChangeBitrateWhenClientMixer;
        }

        public boolean isVideoRangeInRTC() {
            return this.videoRangeModeInRtc;
        }

        public boolean isXSGameFillMode() {
            return this.mInteractSingleViewMode;
        }

        public boolean needMergeRtcExtraDataToLiveStream() {
            return this.mMergeRtcExtraDataToLiveStream;
        }

        @Override // com.p2082ss.avframework.livestreamv2.LiveStreamBuilder
        public LiveCore createDummy() {
            return new DummyLiveCoreImpl(this);
        }

        public int getAdmType() {
            if (getAudioCaptureDevice() != 5) {
                return 0;
            }
            return this.mAdmType;
        }

        public boolean enableInteractPushFrameStatics() {
            JSONObject jSONObject = this.mSdkParams;
            if (jSONObject == null || jSONObject.isNull("enable_rtc_push_frame_statics")) {
                return true;
            }
            try {
                return jSONObject.getBoolean("enable_rtc_push_frame_statics");
            } catch (JSONException unused) {
                return false;
            }
        }

        public boolean isEnableADMRenderReadMode() {
            JSONObject jSONObject = this.mSdkParams;
            if (jSONObject == null || jSONObject.isNull("adm_render_mix_enable_read_mode")) {
                return this.mADMRenderMode;
            }
            try {
                return jSONObject.getBoolean("adm_render_mix_enable_read_mode");
            } catch (JSONException unused) {
                return this.mADMRenderMode;
            }
        }

        public boolean isEnableAecOnHeadsetMode() {
            JSONObject jSONObject = this.mSdkParams;
            if (jSONObject == null || jSONObject.isNull("adm_enable_aec_on_headset_mode")) {
                return this.enableAecOnHeadsetMode;
            }
            try {
                return jSONObject.getBoolean("adm_enable_aec_on_headset_mode");
            } catch (JSONException unused) {
                return this.enableAecOnHeadsetMode;
            }
        }

        public boolean isUsingExternAudioCaptureOnServerInteractMode() {
            AVLog.iow("LiveCore", "LiveCore.isUsingExternAudioCaptureOnServerInteractMode(): " + this.mUsingLiveCoreAudioCaptureOnServerInteractMode);
            return this.mUsingLiveCoreAudioCaptureOnServerInteractMode;
        }

        public boolean usingAecV2Algorithm() {
            JSONObject jSONObject = this.mSdkParams;
            if (jSONObject == null || jSONObject.isNull("enable_aec_v2")) {
                return this.mUsingAecV2Algorithm;
            }
            try {
                return jSONObject.getBoolean("enable_aec_v2");
            } catch (JSONException unused) {
                return this.mUsingAecV2Algorithm;
            }
        }

        public boolean usingAudioAgcOnAecV2Mode() {
            JSONObject jSONObject = this.mSdkParams;
            if (jSONObject == null || jSONObject.isNull("adm_enable_agc")) {
                return this.mAGCEnableOnAecV2Mode;
            }
            try {
                return jSONObject.getBoolean("adm_enable_agc");
            } catch (JSONException unused) {
                return this.mAGCEnableOnAecV2Mode;
            }
        }

        public int usingAudioRNNoise() {
            JSONObject jSONObject = this.mSdkParams;
            if (jSONObject == null || jSONObject.isNull("adm_enable_ns")) {
                return this.mNsModeOnAecV2;
            }
            try {
                return jSONObject.getInt("adm_enable_ns");
            } catch (JSONException unused) {
                return this.mNsModeOnAecV2;
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.LiveStreamBuilder
        public LiveCore create() {
            AVLog.logKibana(5, "SDK_PARAMS", "sdkParams Params:" + getSdkParams(), null);
            AVLog.iow("SDK_PARAMS", "sdkParams Params:" + getSdkParams());
            return new LiveCoreImpl(this);
        }

        private Builder setEnableRtcExtraDataPeriodSend(boolean z) {
            this.enableRtcExtraDataPeriodSend = z;
            return this;
        }

        public void enableAecOnHeadsetMode(boolean z) {
            this.enableAecOnHeadsetMode = z;
        }

        public void enableGameMode(boolean z) {
            this.mInteractSingleViewMode = z;
        }

        public void enableXSGameFillMode(boolean z) {
            this.mInteractSingleViewMode = z;
        }

        public void setHardWareAudioEffectTable(String str) {
            this.mHardwareAudioEffectTable = str;
        }

        public void setMergeRtcExtraDataToLiveStream(boolean z) {
            this.mMergeRtcExtraDataToLiveStream = z;
        }

        public void setUsingAecV2Algorithm(boolean z) {
            this.mUsingAecV2Algorithm = z;
        }

        public LiveStreamBuilder setVideoClientMixerBitrate(int i) {
            this.videoClientMixerBitrate = i;
            return this;
        }

        public LiveStreamBuilder setVideoClientMixerMaxBitrate(int i) {
            this.videoClientMixerMaxBitrate = i;
            return this;
        }

        public LiveStreamBuilder setVideoClientMixerMinBitrate(int i) {
            this.videoClientMixerMinBitrate = i;
            return this;
        }

        public Builder setVideoEffectProcessor(IVideoEffectProcessor iVideoEffectProcessor) {
            this.mVideoEffectProcessor = iVideoEffectProcessor;
            return this;
        }

        public Builder setLogMonitor(ILogMonitor iLogMonitor) {
            this.mLogMonitor = iLogMonitor;
            this.mLogUploader = new ILogUploader() {
                /* class com.p2082ss.avframework.livestreamv2.core.LiveCore.Builder.C857962 */

                static {
                    Covode.recordClassIndex(100236);
                }

                @Override // com.p2082ss.avframework.livestreamv2.log.ILogUploader
                public void uploadLog(JSONObject jSONObject) {
                    Builder.this.mLogMonitor.onLogMonitor("live_client_monitor_log", jSONObject);
                }
            };
            return this;
        }

        public String getAdmApiType(boolean z) {
            String str;
            JSONObject jSONObject = this.mSdkParams;
            if (jSONObject != null) {
                String str2 = "adm_recording_type";
                if (z) {
                    str = str2;
                } else {
                    str = "adm_player_type";
                }
                if (!jSONObject.isNull(str)) {
                    if (!z) {
                        str2 = "adm_player_type";
                    }
                    try {
                        String string = jSONObject.getString(str2);
                        if (AudioDeviceModule.isValidAdmApiType(string)) {
                            return string;
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            if (z) {
                return this.mAdmRecordingType;
            }
            return this.mAdmPlayerType;
        }

        public Builder setUsingExternAudioCaptureOnServerInteractMode(boolean z) {
            this.mUsingLiveCoreAudioCaptureOnServerInteractMode = z;
            AVLog.iow("LiveCore", "LiveCore.setUsingExternAudioCaptureOnServerInteractMode(" + z + ") stack: " + Log.getStackTraceString(new Exception()));
            return this;
        }

        @Override // com.p2082ss.avframework.livestreamv2.LiveStreamBuilder
        public Builder setupSdkParams(String str) {
            int i;
            JSONObject jSONObject;
            super.setupSdkParams(str);
            JSONObject jSONObject2 = null;
            try {
                if (this.mSdkParams != null && !this.mSdkParams.isNull("PushBase")) {
                    jSONObject2 = this.mSdkParams.getJSONObject("PushBase");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                JSONObject jSONObject3 = this.mSdkParams;
                if (jSONObject3 != null && !jSONObject3.isNull("enable_global_gl_shared_context_mutex")) {
                    GLThreadManager.enableGlobalGlContextMutex(jSONObject3.getBoolean("enable_global_gl_shared_context_mutex"));
                }
                if (!jSONObject3.isNull("videoRangeModeInRtc")) {
                    this.videoRangeModeInRtc = jSONObject3.getBoolean("videoRangeModeInRtc");
                }
                if (!jSONObject3.isNull("enable_gl_tracer")) {
                    GLTracer.setEnableGlTracer(jSONObject3.getBoolean("enable_gl_tracer"));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                JSONObject jSONObject4 = this.mSdkParams;
                if (jSONObject4 != null && !jSONObject4.isNull("live_gl_version")) {
                    GLThreadManager.setGLVersion(jSONObject4.getInt("live_gl_version"));
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            if (jSONObject2 != null) {
                try {
                    if (!jSONObject2.isNull("enable_push_stream_switch_after_server_mix_stream")) {
                        this.mPushStreamSwitchAfterServerMixStream = jSONObject2.getBoolean("enable_push_stream_switch_after_server_mix_stream");
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                try {
                    if (!jSONObject2.isNull("PK_audience_set_up_connection_optimize")) {
                        this.mPkAudienceSetUpConnectionOptimize = jSONObject2.getBoolean("PK_audience_set_up_connection_optimize");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                try {
                    if (!jSONObject2.isNull("RtcOnLoggerMessageLevel")) {
                        this.mRtcOnLoggerMessageLevel = jSONObject2.getInt("RtcOnLoggerMessageLevel");
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            try {
                if (!jSONObject2.isNull("mixOnClient")) {
                    JSONObject jSONObject5 = jSONObject2.getJSONObject("mixOnClient");
                    if (!jSONObject5.isNull("mixDefaultBitrate") && !jSONObject5.isNull("mixMinBitrate") && !jSONObject5.isNull("mixMaxBitrate")) {
                        this.videoClientMixerBitrate = jSONObject5.getInt("mixDefaultBitrate");
                        this.videoClientMixerMinBitrate = jSONObject5.getInt("mixMinBitrate");
                        this.videoClientMixerMaxBitrate = jSONObject5.getInt("mixMaxBitrate");
                        this.mNeedChangeBitrateWhenClientMixer = true;
                    }
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            try {
                if (!jSONObject2.isNull("getLiveStreamInfoSyncGetMicDB")) {
                    this.getLiveStreamInfoSyncGetMicDB = jSONObject2.getBoolean("getLiveStreamInfoSyncGetMicDB");
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            try {
                if (!jSONObject2.isNull("fixRemoteYuvProjection")) {
                    this.fixRemoteYuvProjection = jSONObject2.getBoolean("fixRemoteYuvProjection");
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            try {
                JSONObject jSONObject6 = this.mSdkParams;
                if (!(jSONObject6 == null || (jSONObject = jSONObject6.getJSONObject("psnr_statistics")) == null)) {
                    this.enablePSNR = true;
                    try {
                        if (!jSONObject.isNull("psnr_period_seconds")) {
                            this.psnrPeriodSeconds = jSONObject.getInt("psnr_period_seconds");
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    try {
                        if (!jSONObject.isNull("psnr_calc_frames")) {
                            this.psnrStatisticsFrames = jSONObject.getInt("psnr_calc_frames");
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (jSONObject2 != null) {
                try {
                    if (!jSONObject2.isNull("adm_type") && ((i = jSONObject2.getInt("adm_type")) == 0 || i == 1)) {
                        this.mAdmType = i;
                    }
                    if (!jSONObject2.isNull("adm_server_cfg")) {
                        this.mAdmServerCfg = jSONObject2.getJSONObject("adm_server_cfg");
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
            try {
                JSONObject jSONObject7 = this.mSdkParams;
                if (!jSONObject7.isNull("logLevel")) {
                    AVLog.setLevel(jSONObject7.getInt("logLevel"));
                }
            } catch (Exception e14) {
                e14.printStackTrace();
            }
            try {
                JSONObject jSONObject8 = this.mSdkParams;
                if (jSONObject8 != null && !jSONObject8.isNull("live_enable_karaoke_regulator")) {
                    setEnableKaraokeRegulator(jSONObject8.getBoolean("live_enable_karaoke_regulator"));
                }
            } catch (Exception e15) {
                e15.printStackTrace();
            }
            return this;
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2) {
            return createLiveStream(handler, handler2, null, null);
        }

        public void setUsingAecV2Algorithm(boolean z, int i) {
            this.mUsingAecV2Algorithm = z;
            this.mNsModeOnAecV2 = i;
        }

        public void setAdmApiType(String str, boolean z) {
            if (!AudioDeviceModule.isValidAdmApiType(str)) {
                return;
            }
            if (z) {
                this.mAdmRecordingType = str;
            } else {
                this.mAdmPlayerType = str;
            }
        }

        public void setAdmType(int i, JSONObject jSONObject) {
            if (i == 0 || i == 1) {
                this.mAdmType = i;
                this.mAdmServerCfg = jSONObject;
            }
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
            return createLiveStream(handler, handler2, audioDeviceModule, null);
        }

        public void setUsingAecV2Algorithm(boolean z, int i, boolean z2) {
            this.mUsingAecV2Algorithm = z;
            this.mNsModeOnAecV2 = i;
            this.mAGCEnableOnAecV2Mode = z2;
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
            return super.create(handler, handler2, audioDeviceModule, iVideoEffectProcessor);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$InteractConfig */
    public static class InteractConfig extends Config {
        private String mBackgroundColor;
        private boolean mCheckInvalidateSei = true;
        private String mCreateClientStack;
        private boolean mEnabelProcStatics;
        private boolean mEnableInteractConnectionStatics;
        private boolean mEnableRemoteUserStatics = true;
        private String mMixStreamUrl;
        private Client.StreamMixer mMixer;
        private boolean mNeedToggleVideoSinkRenderable;
        private String mRtcABTestConfig;
        private UrlDispatcher mUrlDispatcher;

        /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$InteractConfig$UrlDispatcher */
        public interface UrlDispatcher {
            static {
                Covode.recordClassIndex(100243);
            }

            String urlDispatch(String str);
        }

        static {
            Covode.recordClassIndex(100242);
        }

        public boolean checkInvalidateSei() {
            return this.mCheckInvalidateSei;
        }

        public String getBackgroundColor() {
            return this.mBackgroundColor;
        }

        public String getCreateClientStack() {
            return this.mCreateClientStack;
        }

        public String getMixStreamRtmpUrl() {
            return this.mMixStreamUrl;
        }

        public String getRtcABTestConfig() {
            return this.mRtcABTestConfig;
        }

        public Client.StreamMixer getStreamMixer() {
            return this.mMixer;
        }

        public UrlDispatcher getUrlDispatcher() {
            return this.mUrlDispatcher;
        }

        public boolean isEnabelProcStatics() {
            return this.mEnabelProcStatics;
        }

        public boolean isEnableInteractConnectionStatics() {
            return this.mEnableInteractConnectionStatics;
        }

        public boolean isEnableRemoteUserStatics() {
            return this.mEnableRemoteUserStatics;
        }

        public boolean isNeedToggleVideoSinkRenderable() {
            return this.mNeedToggleVideoSinkRenderable;
        }

        public int getBackgroundColorValue() {
            if (!TextUtils.isEmpty(this.mBackgroundColor)) {
                if (this.mBackgroundColor.startsWith("#")) {
                    this.mBackgroundColor = this.mBackgroundColor.substring(1);
                }
                try {
                    return Integer.valueOf(this.mBackgroundColor, 16).intValue();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return 0;
        }

        public InteractConfig setBackgroundColor(String str) {
            this.mBackgroundColor = str;
            return this;
        }

        public void setCheckInvalidateSei(boolean z) {
            this.mCheckInvalidateSei = z;
        }

        /* access modifiers changed from: package-private */
        public void setCreateClientStack(String str) {
            this.mCreateClientStack = str;
        }

        public void setEnabelProcStatics(boolean z) {
            this.mEnabelProcStatics = z;
        }

        public void setEnableInteractConnectionStatics(boolean z) {
            this.mEnableInteractConnectionStatics = z;
        }

        public void setEnableRemoteUserStatics(boolean z) {
            this.mEnableRemoteUserStatics = z;
        }

        public InteractConfig setMixStreamRtmpUrl(String str) {
            this.mMixStreamUrl = str;
            return this;
        }

        public InteractConfig setNeedToggleVideoSinkRenderable(boolean z) {
            this.mNeedToggleVideoSinkRenderable = z;
            return this;
        }

        public InteractConfig setRtcABTestConfig(String str) {
            this.mRtcABTestConfig = str;
            return this;
        }

        public InteractConfig setStreamMixer(Client.StreamMixer streamMixer) {
            this.mMixer = streamMixer;
            return this;
        }

        public void setUrlDispatcher(UrlDispatcher urlDispatcher) {
            this.mUrlDispatcher = urlDispatcher;
        }
    }

    public final Builder getBuilder() {
        return getInternalBuilder();
    }

    public void setWarningListener(ILiveCoreWarningListener iLiveCoreWarningListener) {
        this.mWarningListener = iLiveCoreWarningListener;
    }

    /* access modifiers changed from: protected */
    public void onWarning(int i, int i2, Exception exc) {
        ILiveCoreWarningListener iLiveCoreWarningListener = this.mWarningListener;
        if (iLiveCoreWarningListener != null) {
            iLiveCoreWarningListener.onWarning(i, i2, exc);
        }
    }
}
