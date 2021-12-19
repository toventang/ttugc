package com.p2082ss.avframework.livestreamv2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.livestreamv2.core.DummyLiveCoreImpl;
import com.p2082ss.avframework.livestreamv2.log.ILogUploader;
import com.p2082ss.avframework.opengl.GLThreadManager;
import com.p2082ss.avframework.transport.ContextUtils;
import com.p2082ss.avframework.transport.JNIUtils;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.TEBundle;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.LiveStreamBuilder */
public class LiveStreamBuilder {
    public static final int AUDIO_CAPTURE_DEVICE_AUDIORECORD = 1;
    public static final int AUDIO_CAPTURE_DEVICE_OPENSL = 2;
    private int adaptedQuirks = 1;
    private Object assetManager;
    private int audioBitrate = 32000;
    private int audioBitwidth = 16;
    private int audioCaptureBitwidth = 16;
    private int audioCaptureChannel = 1;
    private int audioCaptureChannelOnVoIP = 1;
    private int audioCaptureDevice = 5;
    private int audioCaptureSampleHZ = 44100;
    private int audioCaptureSampleHZOnVoIP = 16000;
    private int audioChannel = 2;
    private int audioEncoder = 1;
    private int audioProfile = 1;
    private int audioQuantizeGapPeriod;
    private int audioSampleHZ = 44100;
    private int bgMode = 1;
    private int bitrateAdaptStrategy;
    private int captureAdaptedHeight;
    private int captureAdaptedWidth;
    private int changeEncodeFpsThreshold;
    private int checkEncodeFpsInterval;
    private boolean disable2DTrans;
    private boolean disableCropScale;
    private boolean disableDropFrames;
    private boolean disableEffect;
    private JSONObject dumpFrameParams;
    private boolean effectAlgorithmAB;
    private String effectModePath;
    private String effectPlatformConfig;
    private Object effectResourceFinder;
    private boolean enableAecAutoSwitch;
    private boolean enableAudioEncodeAccelera;
    private boolean enableAudioHighQuality;
    private boolean enableAutoVolume;
    private boolean enableConstantTimePeriodGop;
    private double enableMaxTimePeriodGopSec;
    protected boolean enablePSNR;
    private boolean enablePitchShift = true;
    private boolean enableProtocolDegrade = true;
    private boolean enableRtmpStopPoll = true;
    protected boolean enableTcpCork;
    private boolean enableVideoBFrame = true;
    private boolean enableVideoEncodeAccelera = true;
    private boolean enableVideoFrameStatistics;
    private boolean enableVideoNtp;
    private String encryptedLiveAuth;
    private boolean fixHardwareEncodeDts;
    private boolean forceAlignTo16 = true;
    private int frameRateMode;
    private boolean gameOptTest = true;
    private boolean hwEncodeOesDirectly;
    private boolean isAddCropSeiInfo = true;
    protected boolean isEnableSiti;
    private boolean mAdjustStreamResolutionOnInteract = true;
    boolean mAllowMicCaptureOnBackground = false;
    private boolean mAudioFilterAsyncReportError = false;
    private boolean mBgPushWithAdaptedResolution = true;
    private boolean mByteAudioInternalAutoVolume = true;
    private boolean mByteAudioInternalMixBGM = true;
    private int mByteVC1MosaicIssueOptimizeLevel;
    private boolean mCameraEnableFaceAE;
    private boolean mCameraEnableFallback;
    private boolean mCameraEnableWideAngle;
    private boolean mCameraEnableWideFov = true;
    private int mCameraFrameFormat;
    private int mCameraLogLevel;
    private int mCameraOpenRetryCnt;
    private boolean mCameraResetFpsRange;
    private int mCameraRetryStartPreviewCnt;
    private Context mContext;
    private boolean mEnableEdgeRender;
    private boolean mEnableFindContour = true;
    private boolean mEnableGlobalGlSharedContextRecycler;
    private boolean mEnableKTV;
    private boolean mEnableKaraokeRegulator = true;
    private boolean mEnableRenderStallStats = true;
    private boolean mEnableSeiShift = true;
    private boolean mEnableSendContourInfoToRtc;
    private int mEnableStabilization = -1;
    private boolean mEncoderDowngradeOptimize;
    private boolean mInteractVideoSinkUseGlFinish = true;
    private boolean mIsCameraOpenCloseSync;
    private boolean mIsForceCloseCamera;
    private boolean mIsScreenRecordDisableMixer = true;
    private JSONObject mKcpParams;
    protected ILogUploader mLogUploader;
    private boolean mNeedChangeModeWhenTriggetEncoder = true;
    private boolean mNeedUpdateByteAudioConfig = true;
    private JSONObject mNodeOptParams;
    public String mProjectKey;
    private String mPushUrlPrefix = "";
    private String mQosId = "";
    private JSONObject mQuicParams;
    private JSONObject mRtmpCacheCfgParams;
    private int mRtmpPort = -1;
    private JSONObject mSandboxParams;
    protected JSONObject mSdkParams;
    private boolean mSendCacheNewConfig = true;
    private boolean mSettinsByteAudioConfigLevel = true;
    private int mSoftwareEncoderMinMaxBitrateAdjust;
    private boolean mUseShareRecorder = true;
    private int maxChangeEncodeFpsTimes;
    private double noiseSuppress = -15.0d;
    private String[] ntpServers;
    protected int psnrPeriodSeconds = 30;
    protected int psnrStatisticsFrames = 20;
    private boolean renderOffInFMMode = true;
    private int rmtpTimeRotation = 100;
    private final ConcurrentHashMap<String, Object> roiSettings = new ConcurrentHashMap<>();
    private int rtmpReconnectCounts = 10;
    private int rtmpReconnectIntervalSeconds = 3;
    private boolean rtsSupportVideoRtx;
    private Intent screenCaptureIntent;
    protected boolean seiNeedSource = true;
    private boolean supportCameraSwitchInternal = true;
    private int transportAudioStallThreshold = 200;
    private int transportVideoStallThreshold = 500;
    public long uploadLogInterval = 5000;
    private boolean useNewEffectEngine;
    private boolean useSelfDevelopedRtmp = true;
    private boolean useSelfInnovateSoftEncode = true;
    private boolean useTTFaceDetect;
    private boolean usingVECamera2API;
    private int videoBitrate = 800000;
    private int videoBitrateMode = 1;
    private int videoCaptureDevice = 4;
    private int videoCaptureFps = 30;
    private int videoCaptureHeight = 1280;
    private int videoCaptureWidth = 720;
    private int videoEncoder = 1;
    private String[] videoEncoderNames = {"hardH264", "x264", "bytevc0", "hardBytevc1", "bytevc1"};
    private int videoFps = 25;
    private int videoGop;
    private float videoGopSec;
    private int videoHeight = 1280;
    private int videoLevel = 2;
    private int videoMaxBitrate;
    private int videoMinBitrate;
    private int videoProfile = 1;
    private int videoWidth = 720;
    private int vsyncModuleMaxIntevalOnFrameMs = 3000;
    private int vsyncModuleMaxIntevalOnNowMs = 500;
    private int yuvConverterColorRange = -1;

    static {
        Covode.recordClassIndex(100090);
    }

    private void parseVideoDumpSdkParams() {
    }

    public int getVideoMixerOutHeight() {
        return 0;
    }

    public int getVideoMixerOutWidth() {
        return 0;
    }

    public boolean isUsingLiveStreamAudioCapture() {
        return true;
    }

    public LiveStreamBuilder setUsingLiveStreamAudioCapture(boolean z) {
        return this;
    }

    public LiveStreamBuilder setVideoMixerOutHeight(int i) {
        return this;
    }

    public LiveStreamBuilder setVideoMixerOutWidth(int i) {
        return this;
    }

    public boolean enableKaraokeRegulator() {
        return this.mEnableKaraokeRegulator;
    }

    public boolean enableProtocolDegrade() {
        return this.enableProtocolDegrade;
    }

    public boolean getAdjustStreamResolutionOnInteract() {
        return this.mAdjustStreamResolutionOnInteract;
    }

    public Object getAssetManager() {
        return this.assetManager;
    }

    public int getAudioBitrate() {
        return this.audioBitrate;
    }

    public int getAudioBitwidth() {
        return this.audioBitwidth;
    }

    public int getAudioCaptureBitwidth() {
        return this.audioCaptureBitwidth;
    }

    public int getAudioCaptureChannel() {
        return this.audioCaptureChannel;
    }

    public int getAudioCaptureChannelOnVoIP() {
        return this.audioCaptureChannelOnVoIP;
    }

    public int getAudioCaptureDevice() {
        return this.audioCaptureDevice;
    }

    public int getAudioCaptureSampleHZ() {
        return this.audioCaptureSampleHZ;
    }

    public int getAudioCaptureSampleHZOnVoIP() {
        return this.audioCaptureSampleHZOnVoIP;
    }

    public int getAudioChannel() {
        return this.audioChannel;
    }

    public int getAudioEncoder() {
        return this.audioEncoder;
    }

    public int getAudioProfile() {
        return this.audioProfile;
    }

    public int getAudioQuantizeGapPeriod() {
        return this.audioQuantizeGapPeriod;
    }

    public int getAudioSampleHZ() {
        return this.audioSampleHZ;
    }

    public boolean getAutoGlRecycler() {
        return this.mEnableGlobalGlSharedContextRecycler;
    }

    public int getBgMode() {
        return this.bgMode;
    }

    public int getBitrateAdaptStrategy() {
        return this.bitrateAdaptStrategy;
    }

    public int getByteVC1MosaicIssueOptimize() {
        return this.mByteVC1MosaicIssueOptimizeLevel;
    }

    public int getCameraFrameFormat() {
        return this.mCameraFrameFormat;
    }

    public int getCameraLogLevel() {
        return this.mCameraLogLevel;
    }

    public boolean getCameraOpenCloseSync() {
        return this.mIsCameraOpenCloseSync;
    }

    public int getCameraOpenRetryCnt() {
        return this.mCameraOpenRetryCnt;
    }

    public int getCameraRetryStartPreviewCnt() {
        return this.mCameraRetryStartPreviewCnt;
    }

    public int getCaptureAdaptedHeight() {
        return this.captureAdaptedHeight;
    }

    public int getCaptureAdaptedWidth() {
        return this.captureAdaptedWidth;
    }

    public int getChangeEncodeFpsThreshold() {
        return this.changeEncodeFpsThreshold;
    }

    public int getCheckEncodeFpsInterval() {
        return this.checkEncodeFpsInterval;
    }

    public Context getContext() {
        return this.mContext;
    }

    public JSONObject getDumpFrameParams() {
        return this.dumpFrameParams;
    }

    public boolean getEdgeRender() {
        return this.mEnableEdgeRender;
    }

    public boolean getEffectAlgorithmAB() {
        return this.effectAlgorithmAB;
    }

    public String getEffectModePath() {
        return this.effectModePath;
    }

    public String getEffectPlatformConfig() {
        return this.effectPlatformConfig;
    }

    public Object getEffectResourceFinder() {
        return this.effectResourceFinder;
    }

    public double getEnableMaxTimePeriodGopSec() {
        return this.enableMaxTimePeriodGopSec;
    }

    public boolean getEnableRtmpStopPoll() {
        return this.enableRtmpStopPoll;
    }

    public boolean getEncoderDowngradeOptimize() {
        return this.mEncoderDowngradeOptimize;
    }

    public int getFrameRateMode() {
        return this.frameRateMode;
    }

    public boolean getIsForceCloseCamera() {
        return this.mIsForceCloseCamera;
    }

    public JSONObject getKcpParams() {
        return this.mKcpParams;
    }

    public String getLiveAuthString() {
        return this.encryptedLiveAuth;
    }

    public ILogUploader getLogUploader() {
        return this.mLogUploader;
    }

    public int getMaxChangeEncodeFpsTimes() {
        return this.maxChangeEncodeFpsTimes;
    }

    public JSONObject getNodeOptParams() {
        return this.mNodeOptParams;
    }

    public double getNoiseSuppress() {
        return this.noiseSuppress;
    }

    public String[] getNtpServers() {
        return this.ntpServers;
    }

    public int getPSNRPeriodSeconds() {
        return this.psnrPeriodSeconds;
    }

    public int getPSNRStatisticsFrames() {
        return this.psnrStatisticsFrames;
    }

    public String getPushUrlPrefix() {
        return this.mPushUrlPrefix;
    }

    public String getQosId() {
        return this.mQosId;
    }

    public JSONObject getQuicParams() {
        return this.mQuicParams;
    }

    public int getResolutionAdaptedQuirks() {
        return this.adaptedQuirks;
    }

    public int getRmtpTimeRotation() {
        return this.rmtpTimeRotation;
    }

    public JSONObject getRtmpCacheCfgParams() {
        return this.mRtmpCacheCfgParams;
    }

    public int getRtmpPort() {
        return this.mRtmpPort;
    }

    public int getRtmpReconnectCounts() {
        return this.rtmpReconnectCounts;
    }

    public int getRtmpReconnectIntervalSeconds() {
        return this.rtmpReconnectIntervalSeconds;
    }

    public JSONObject getSandboxParams() {
        return this.mSandboxParams;
    }

    public Intent getScreenCaptureIntent() {
        return this.screenCaptureIntent;
    }

    public JSONObject getSdkParams() {
        return this.mSdkParams;
    }

    public int getSoftwareEncoderMinMaxBitrateAdjust() {
        return this.mSoftwareEncoderMinMaxBitrateAdjust;
    }

    public int getTransportAudioStallThreshold() {
        return this.transportAudioStallThreshold;
    }

    public int getTransportVideoStallThreshold() {
        return this.transportVideoStallThreshold;
    }

    public long getUploadLogInterval() {
        return this.uploadLogInterval;
    }

    public int getVideoBitrate() {
        return this.videoBitrate;
    }

    public int getVideoBitrateMode() {
        return this.videoBitrateMode;
    }

    public int getVideoCaptureDevice() {
        return this.videoCaptureDevice;
    }

    public int getVideoCaptureFps() {
        return this.videoCaptureFps;
    }

    public int getVideoCaptureHeight() {
        return this.videoCaptureHeight;
    }

    public int getVideoCaptureWidth() {
        return this.videoCaptureWidth;
    }

    public int getVideoEncoder() {
        return this.videoEncoder;
    }

    public int getVideoFps() {
        return this.videoFps;
    }

    public int getVideoGop() {
        return this.videoGop;
    }

    public float getVideoGopSec() {
        return this.videoGopSec;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoLevel() {
        return this.videoLevel;
    }

    public int getVideoMaxBitrate() {
        return this.videoMaxBitrate;
    }

    public int getVideoMinBitrate() {
        return this.videoMinBitrate;
    }

    public int getVideoProfile() {
        return this.videoProfile;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public int getVsyncModuleMaxIntevalOnFrameMs() {
        return this.vsyncModuleMaxIntevalOnFrameMs;
    }

    public int getVsyncModuleMaxIntevalOnNowMs() {
        return this.vsyncModuleMaxIntevalOnNowMs;
    }

    public boolean is2DTransDisabled() {
        return this.disable2DTrans;
    }

    public boolean isAddCropSeiInfo() {
        return this.isAddCropSeiInfo;
    }

    public boolean isAlignTo16() {
        return this.forceAlignTo16;
    }

    public boolean isAllowMicCaptureOnBackground() {
        return this.mAllowMicCaptureOnBackground;
    }

    public boolean isAudioFilterAsyncReportError() {
        return this.mAudioFilterAsyncReportError;
    }

    public boolean isBgPushWithAdaptedResolution() {
        return this.mBgPushWithAdaptedResolution;
    }

    public boolean isByteAudioInternalMixBGM() {
        return this.mByteAudioInternalMixBGM;
    }

    public boolean isCameraEnableFaceAE() {
        return this.mCameraEnableFaceAE;
    }

    public boolean isCameraEnableFallback() {
        return this.mCameraEnableFallback;
    }

    public boolean isCameraEnableWideAngle() {
        return this.mCameraEnableWideAngle;
    }

    public boolean isCameraEnableWideFov() {
        return this.mCameraEnableWideFov;
    }

    public boolean isCropScaleDisabled() {
        return this.disableCropScale;
    }

    public boolean isDropFramesDisabled() {
        return this.disableDropFrames;
    }

    public boolean isEffectDisabled() {
        return this.disableEffect;
    }

    public boolean isEnableAecAutoSwitch() {
        return this.enableAecAutoSwitch;
    }

    public boolean isEnableAudioEncodeAccelera() {
        return this.enableAudioEncodeAccelera;
    }

    public boolean isEnableAudioHighQuality() {
        return this.enableAudioHighQuality;
    }

    public boolean isEnableAutoVolume() {
        return this.enableAutoVolume;
    }

    public boolean isEnableConstantTimePeriodGop() {
        return this.enableConstantTimePeriodGop;
    }

    public boolean isEnableFindContour() {
        return this.mEnableFindContour;
    }

    public boolean isEnableFixHardwareEncodeDts() {
        return this.fixHardwareEncodeDts;
    }

    public boolean isEnableKTV() {
        return this.mEnableKTV;
    }

    public boolean isEnablePSNR() {
        return this.enablePSNR;
    }

    public boolean isEnablePitchShift() {
        return this.enablePitchShift;
    }

    public boolean isEnableRenderStallStats() {
        return this.mEnableRenderStallStats;
    }

    public boolean isEnableResetFpsRange() {
        return this.mCameraResetFpsRange;
    }

    public boolean isEnableSITI() {
        return this.isEnableSiti;
    }

    /* access modifiers changed from: package-private */
    public boolean isEnableSeiShift() {
        return this.mEnableSeiShift;
    }

    public boolean isEnableSendContourInfoToRtc() {
        return this.mEnableSendContourInfoToRtc;
    }

    public int isEnableStabilization() {
        return this.mEnableStabilization;
    }

    public boolean isEnableVideoBFrame() {
        return this.enableVideoBFrame;
    }

    public boolean isEnableVideoEncodeAccelera() {
        return this.enableVideoEncodeAccelera;
    }

    public boolean isEnableVideoFrameStatistics() {
        return this.enableVideoFrameStatistics;
    }

    public boolean isEnableVideoNtp() {
        return this.enableVideoNtp;
    }

    public boolean isGameOptTest() {
        return this.gameOptTest;
    }

    /* access modifiers changed from: package-private */
    public boolean isHWEncodeOesDirectly() {
        return this.hwEncodeOesDirectly;
    }

    public boolean isInteractVideoSinkUseGlFinish() {
        return this.mInteractVideoSinkUseGlFinish;
    }

    public boolean isRenderOffInFMMode() {
        return this.renderOffInFMMode;
    }

    public boolean isScreenRecordDisableMixer() {
        return this.mIsScreenRecordDisableMixer;
    }

    public boolean isSeiNeedSource() {
        return this.seiNeedSource;
    }

    public boolean isSelfInnovateSoftEncode() {
        return this.useSelfInnovateSoftEncode;
    }

    public boolean isSendCacheNewConfig() {
        return this.mSendCacheNewConfig;
    }

    public boolean isSettinsByteAudioConfigLevel() {
        return this.mSettinsByteAudioConfigLevel;
    }

    public boolean isSupportCameraSwitchInternal() {
        return this.supportCameraSwitchInternal;
    }

    public boolean isUseNewEffectEngine() {
        return this.useNewEffectEngine;
    }

    public boolean isUseSelfDevelopedRtmp() {
        return this.useSelfDevelopedRtmp;
    }

    public boolean isUseShareRecorder() {
        return this.mUseShareRecorder;
    }

    public boolean isUseTTFaceDetect() {
        return this.useTTFaceDetect;
    }

    public boolean isVECamera2API() {
        return this.usingVECamera2API;
    }

    public boolean needChangeModeWhenTriggetEncoder() {
        return this.mNeedChangeModeWhenTriggetEncoder;
    }

    public boolean needUpdateByteAudioConfig() {
        return this.mNeedUpdateByteAudioConfig;
    }

    public boolean rtsSupportVideoRtx() {
        return this.rtsSupportVideoRtx;
    }

    public ILiveStream create() {
        return new LiveStream(this);
    }

    public ILiveStream createDummy() {
        return new DummyLiveCoreImpl(this);
    }

    public int getGlVersion() {
        return GLThreadManager.getConfigGLVersion();
    }

    public boolean isEnableForceGlFinish() {
        return GLThreadManager.isEnableForceGLFinish();
    }

    public boolean isEnableGlobalGlContextMutex() {
        return GLThreadManager.isEnableForceGLFinish();
    }

    public int getRoiOn() {
        return getRoiOn(this.videoEncoder, this.enableVideoEncodeAccelera, this.useSelfInnovateSoftEncode);
    }

    public TEBundle getRoiSettings() {
        return getRoiSettings(this.videoEncoder, this.enableVideoEncodeAccelera, this.useSelfInnovateSoftEncode);
    }

    public boolean isByteAudioInternalAutoVolume() {
        if (!this.mByteAudioInternalMixBGM || !this.mByteAudioInternalAutoVolume) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void releaseHandles() {
        this.mContext = null;
        this.assetManager = null;
        this.effectResourceFinder = null;
        this.mLogUploader = new ILogUploader() {
            /* class com.p2082ss.avframework.livestreamv2.LiveStreamBuilder.C857431 */

            static {
                Covode.recordClassIndex(100091);
            }

            @Override // com.p2082ss.avframework.livestreamv2.log.ILogUploader
            public void uploadLog(JSONObject jSONObject) {
            }
        };
        this.screenCaptureIntent = null;
    }

    public String getSessionID() {
        JSONObject jSONObject = this.mSdkParams;
        if (jSONObject == null || jSONObject.isNull("Common")) {
            return "";
        }
        try {
            JSONObject jSONObject2 = this.mSdkParams.getJSONObject("Common");
            if (!jSONObject2.isNull("sessionID")) {
                return jSONObject2.getString("sessionID");
            }
            return "";
        } catch (JSONException unused) {
            return "";
        }
    }

    public void enableAecAutoSwitchMode(boolean z) {
        this.enableAecAutoSwitch = z;
    }

    public void enableAudioHighQualityMode(boolean z) {
        this.enableAudioHighQuality = z;
    }

    public void setAddCropSeiInfo(boolean z) {
        this.isAddCropSeiInfo = z;
    }

    public LiveStreamBuilder setAlignTo16(boolean z) {
        this.forceAlignTo16 = z;
        return this;
    }

    public LiveStreamBuilder setAllowMicCaptureOnBackground(boolean z) {
        this.mAllowMicCaptureOnBackground = z;
        return this;
    }

    public LiveStreamBuilder setAssetManager(Object obj) {
        this.assetManager = obj;
        return this;
    }

    public LiveStreamBuilder setAudioBitrate(int i) {
        this.audioBitrate = i;
        return this;
    }

    public LiveStreamBuilder setAudioBitwidth(int i) {
        this.audioBitwidth = i;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureBitwidth(int i) {
        this.audioCaptureBitwidth = i;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureChannel(int i) {
        this.audioCaptureChannel = i;
        return this;
    }

    public void setAudioCaptureChannelOnVoIP(int i) {
        this.audioCaptureChannelOnVoIP = i;
    }

    public LiveStreamBuilder setAudioCaptureDevice(int i) {
        this.audioCaptureDevice = i;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureSampleHZ(int i) {
        this.audioCaptureSampleHZ = i;
        return this;
    }

    public void setAudioCaptureSampleHZOnVoIP(int i) {
        this.audioCaptureSampleHZOnVoIP = i;
    }

    public LiveStreamBuilder setAudioChannel(int i) {
        this.audioChannel = i;
        return this;
    }

    public LiveStreamBuilder setAudioEncoder(int i) {
        this.audioEncoder = i;
        return this;
    }

    public LiveStreamBuilder setAudioProfile(int i) {
        this.audioProfile = i;
        return this;
    }

    public LiveStreamBuilder setAudioQuantizeGapPeriod(int i) {
        this.audioQuantizeGapPeriod = i;
        return this;
    }

    public LiveStreamBuilder setAudioSampleHZ(int i) {
        this.audioSampleHZ = i;
        return this;
    }

    public void setAutoGlRecycler(boolean z) {
        this.mEnableGlobalGlSharedContextRecycler = z;
    }

    public LiveStreamBuilder setBgMode(int i) {
        this.bgMode = i;
        return this;
    }

    public void setBgPushWithAdaptedResolution(boolean z) {
        this.mBgPushWithAdaptedResolution = z;
    }

    public void setCameraEnableFaceAE(boolean z) {
        this.mCameraEnableFaceAE = z;
    }

    public void setCameraEnableFallback(boolean z) {
        this.mCameraEnableFallback = z;
    }

    public void setCameraEnableWideAngle(boolean z) {
        this.mCameraEnableWideAngle = z;
    }

    public void setCameraEnableWideFov(boolean z) {
        this.mCameraEnableWideFov = z;
    }

    public void setCameraLogLevel(int i) {
        this.mCameraLogLevel = i;
    }

    public void setCameraOpenCloseSync(boolean z) {
        this.mIsCameraOpenCloseSync = z;
    }

    public void setCameraOpenRetryCnt(int i) {
        this.mCameraOpenRetryCnt = i;
    }

    public void setCameraRetryStartPreviewCnt(int i) {
        this.mCameraRetryStartPreviewCnt = i;
    }

    public void setCaptureAdaptedHeight(int i) {
        this.captureAdaptedHeight = i;
    }

    public void setCaptureAdaptedWidth(int i) {
        this.captureAdaptedWidth = i;
    }

    public LiveStreamBuilder setEdgeRender(boolean z) {
        this.mEnableEdgeRender = z;
        return this;
    }

    public LiveStreamBuilder setEffectAlgorithmAB(boolean z) {
        this.effectAlgorithmAB = z;
        return this;
    }

    public LiveStreamBuilder setEffectModePath(String str) {
        this.effectModePath = str;
        return this;
    }

    public LiveStreamBuilder setEffectPlatformConfig(String str) {
        this.effectPlatformConfig = str;
        return this;
    }

    public LiveStreamBuilder setEffectResourceFinder(Object obj) {
        this.effectResourceFinder = obj;
        return this;
    }

    public LiveStreamBuilder setEnableAudioEncodeAccelera(boolean z) {
        this.enableAudioEncodeAccelera = z;
        return this;
    }

    public void setEnableAutoVolume(boolean z) {
        this.enableAutoVolume = z;
    }

    public void setEnableConstantTimePeriodGop(boolean z) {
        this.enableConstantTimePeriodGop = z;
    }

    public void setEnableFindContour(boolean z) {
        this.mEnableFindContour = z;
    }

    public void setEnableForceGlFinish(boolean z) {
        GLThreadManager.enableForceGLFinish(z);
    }

    public void setEnableGlobalGlContextMutex(boolean z) {
        GLThreadManager.enableGlobalGlContextMutex(z);
    }

    public void setEnableKTV(boolean z) {
        this.mEnableKTV = z;
    }

    public void setEnableKaraokeRegulator(boolean z) {
        this.mEnableKaraokeRegulator = z;
    }

    public void setEnableMaxTimePeriodGopSec(double d) {
        this.enableMaxTimePeriodGopSec = d;
    }

    public void setEnablePSNR(boolean z) {
        this.enablePSNR = z;
    }

    public void setEnablePitchShift(boolean z) {
        this.enablePitchShift = z;
    }

    public void setEnableResetFpsRange(boolean z) {
        this.mCameraResetFpsRange = z;
    }

    public void setEnableSendContourInfoToRtc(boolean z) {
        this.mEnableSendContourInfoToRtc = z;
    }

    public void setEnableStabilization(boolean z) {
        this.mEnableStabilization = z ? 1 : 0;
    }

    public void setEnableStopPoll(boolean z) {
        this.enableRtmpStopPoll = z;
    }

    public LiveStreamBuilder setEnableVideoBFrame(boolean z) {
        this.enableVideoBFrame = z;
        return this;
    }

    public LiveStreamBuilder setEnableVideoEncodeAccelera(boolean z) {
        this.enableVideoEncodeAccelera = z;
        return this;
    }

    public void setFrameRateMode(int i) {
        this.frameRateMode = i;
    }

    public void setGameOptTest(boolean z) {
        this.gameOptTest = z;
    }

    public void setGlVersion(int i) {
        GLThreadManager.setGLVersion(i);
    }

    public void setHWEncodeOesDirectly(boolean z) {
        this.hwEncodeOesDirectly = z;
    }

    public void setIsForceCloseCamera(boolean z) {
        this.mIsForceCloseCamera = z;
    }

    public LiveStreamBuilder setKcpParams(JSONObject jSONObject) {
        this.mKcpParams = jSONObject;
        return this;
    }

    public LiveStreamBuilder setLiveAuthString(String str) {
        this.encryptedLiveAuth = str;
        return this;
    }

    public LiveStreamBuilder setLogUploader(ILogUploader iLogUploader) {
        this.mLogUploader = iLogUploader;
        return this;
    }

    public void setNoiseSuppress(double d) {
        this.noiseSuppress = d;
    }

    public LiveStreamBuilder setProjectKey(String str) {
        this.mProjectKey = str;
        return this;
    }

    public LiveStreamBuilder setQuicParams(JSONObject jSONObject) {
        this.mQuicParams = jSONObject;
        return this;
    }

    public void setRenderOffInFMMode(boolean z) {
        this.renderOffInFMMode = z;
    }

    public void setResolutionAdaptedQuirks(int i) {
        this.adaptedQuirks = i;
    }

    public void setRmtpTimeRotation(int i) {
        this.rmtpTimeRotation = i;
    }

    public LiveStreamBuilder setRtmpReconnectCounts(int i) {
        this.rtmpReconnectCounts = i;
        return this;
    }

    public LiveStreamBuilder setRtmpReconnectIntervalSeconds(int i) {
        this.rtmpReconnectIntervalSeconds = i;
        return this;
    }

    public LiveStreamBuilder setScreenCaptureIntent(Intent intent) {
        this.screenCaptureIntent = intent;
        return this;
    }

    public void setSeiNeedSource(boolean z) {
        this.seiNeedSource = z;
    }

    public void setSoftwareEncoderMinMaxBitrateAdjust(int i) {
        this.mSoftwareEncoderMinMaxBitrateAdjust = i;
    }

    public void setSupportCameraSwitchInternal(boolean z) {
        this.supportCameraSwitchInternal = z;
    }

    public void setTransportAudioStallThreshold(int i) {
        this.transportAudioStallThreshold = i;
    }

    public void setTransportVideoStallThreshold(int i) {
        this.transportVideoStallThreshold = i;
    }

    public LiveStreamBuilder setUploadLogInterval(long j) {
        this.uploadLogInterval = j;
        return this;
    }

    public LiveStreamBuilder setUseNewEffectEngine(boolean z) {
        this.useNewEffectEngine = z;
        return this;
    }

    public LiveStreamBuilder setUseSelfDevelopedRtmp(boolean z) {
        this.useSelfDevelopedRtmp = z;
        return this;
    }

    public LiveStreamBuilder setUseSelfInnovateSoftEncode(boolean z) {
        this.useSelfInnovateSoftEncode = z;
        return this;
    }

    public void setUseShareRecorder(boolean z) {
        this.mUseShareRecorder = z;
    }

    public LiveStreamBuilder setUseTTFaceDetect(boolean z) {
        this.useTTFaceDetect = z;
        return this;
    }

    public void setUsingVECamera2API(boolean z) {
        this.usingVECamera2API = z;
    }

    public LiveStreamBuilder setVideoBitrate(int i) {
        this.videoBitrate = i;
        return this;
    }

    public void setVideoBitrateMode(int i) {
        this.videoBitrateMode = i;
    }

    public LiveStreamBuilder setVideoCaptureDevice(int i) {
        this.videoCaptureDevice = i;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureFps(int i) {
        this.videoCaptureFps = i;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureHeight(int i) {
        this.videoCaptureHeight = i;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureWidth(int i) {
        this.videoCaptureWidth = i;
        return this;
    }

    public LiveStreamBuilder setVideoEncoder(int i) {
        this.videoEncoder = i;
        return this;
    }

    public LiveStreamBuilder setVideoFps(int i) {
        this.videoFps = i;
        return this;
    }

    public LiveStreamBuilder setVideoGop(int i) {
        this.videoGop = i;
        return this;
    }

    public LiveStreamBuilder setVideoGopSec(float f) {
        this.videoGopSec = f;
        return this;
    }

    public LiveStreamBuilder setVideoHeight(int i) {
        this.videoHeight = i;
        return this;
    }

    public LiveStreamBuilder setVideoLevel(int i) {
        this.videoLevel = i;
        return this;
    }

    public LiveStreamBuilder setVideoMaxBitrate(int i) {
        this.videoMaxBitrate = i;
        return this;
    }

    public LiveStreamBuilder setVideoMinBitrate(int i) {
        this.videoMinBitrate = i;
        return this;
    }

    public LiveStreamBuilder setVideoProfile(int i) {
        this.videoProfile = i;
        return this;
    }

    public LiveStreamBuilder setVideoWidth(int i) {
        this.videoWidth = i;
        return this;
    }

    public LiveStreamBuilder setVsyncModuleMaxIntevalOnFrameMs(int i) {
        this.vsyncModuleMaxIntevalOnFrameMs = i;
        return this;
    }

    public LiveStreamBuilder setVsyncModuleMaxIntevalOnNowMs(int i) {
        this.vsyncModuleMaxIntevalOnNowMs = i;
        return this;
    }

    public int getRoiOn(boolean z) {
        return getRoiOn(1, z, false);
    }

    public LiveStreamBuilder setRoiAssetDir(String str) {
        return setRoiAssetDir(str, 1, false, false);
    }

    /* renamed from: com_ss_avframework_livestreamv2_LiveStreamBuilder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m147778x535efbb(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public LiveStreamBuilder setBitrateAdaptStrategy(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.bitrateAdaptStrategy = i;
        }
        return this;
    }

    public LiveStreamBuilder setRoiOn(int i) {
        return setRoiOn(i, this.videoEncoder, this.enableVideoEncodeAccelera, this.useSelfInnovateSoftEncode);
    }

    public LiveStreamBuilder setContext(Context context) {
        Context context2;
        if (context != null) {
            context2 = m147778x535efbb(context);
        } else {
            context2 = null;
        }
        this.mContext = context2;
        ContextUtils.initApplicationContext(m147778x535efbb(context));
        JNIUtils.setClassLoader(this.mContext.getClassLoader());
        return this;
    }

    private void setupThreadPoolMode(JSONObject jSONObject) {
        int i;
        boolean z;
        boolean z2 = false;
        JSONObject jSONObject2 = null;
        boolean z3 = true;
        try {
            if (!jSONObject.isNull("TPThreadAliveTimeMs")) {
                i = jSONObject.getInt("TPThreadAliveTimeMs");
            } else {
                i = 0;
            }
            try {
                if (!jSONObject.isNull("TPCrashLooperWhiteList")) {
                    jSONObject2 = jSONObject.getJSONObject("TPCrashLooperWhiteList");
                }
                if (!jSONObject.isNull("TPEnableThreadPoolMode")) {
                    z2 = jSONObject.getBoolean("TPEnableThreadPoolMode");
                }
                try {
                    if (!jSONObject.isNull("TPCheckLeakWhenRef0")) {
                        z3 = jSONObject.getBoolean("TPCheckLeakWhenRef0");
                    }
                } catch (Exception unused) {
                    z = z2;
                    z2 = i;
                    i = z2;
                    z2 = z;
                    SafeHandlerThreadPoolExecutor.setThreadPoolMode(z2, (long) i, jSONObject2, z3);
                }
            } catch (Exception unused2) {
                z2 = i;
                z = false;
                i = z2;
                z2 = z;
                SafeHandlerThreadPoolExecutor.setThreadPoolMode(z2, (long) i, jSONObject2, z3);
            }
        } catch (Exception unused3) {
            z = false;
            i = z2;
            z2 = z;
            SafeHandlerThreadPoolExecutor.setThreadPoolMode(z2, (long) i, jSONObject2, z3);
        }
        SafeHandlerThreadPoolExecutor.setThreadPoolMode(z2, (long) i, jSONObject2, z3);
    }

    /* access modifiers changed from: package-private */
    public boolean checkParamsForUpdate(TEBundle tEBundle) {
        Boolean[] boolArr = {false};
        Boolean[] boolArr2 = {false};
        this.videoWidth = checkParamsForUpdateInner(tEBundle, "width", this.videoWidth, boolArr);
        this.videoHeight = checkParamsForUpdateInner(tEBundle, "height", this.videoHeight, boolArr);
        this.captureAdaptedWidth = checkParamsForUpdateInner(tEBundle, "cap_adapted_width", this.captureAdaptedWidth, boolArr2);
        this.captureAdaptedHeight = checkParamsForUpdateInner(tEBundle, "cap_adapted_height", this.captureAdaptedHeight, boolArr2);
        this.adaptedQuirks = checkParamsForUpdateInner(tEBundle, "cap_adapted_quirks", this.adaptedQuirks, boolArr2);
        this.videoFps = checkParamsForUpdateInner(tEBundle, "fps", this.videoFps, boolArr);
        this.videoBitrate = checkParamsForUpdateInner(tEBundle, "defaultBitrate", this.videoBitrate, boolArr);
        this.videoMinBitrate = checkParamsForUpdateInner(tEBundle, "minBitrate", this.videoMinBitrate, boolArr);
        this.videoMaxBitrate = checkParamsForUpdateInner(tEBundle, "maxBitrate", this.videoMaxBitrate, boolArr);
        this.enableVideoEncodeAccelera = checkParamsForUpdateInner(tEBundle, "useHardware", this.enableVideoEncodeAccelera, boolArr);
        return boolArr[0].booleanValue();
    }

    private void convertRoiSettings(JSONObject jSONObject) {
        TEBundle tEBundle;
        if (jSONObject != null) {
            String[] strArr = this.videoEncoderNames;
            for (String str : strArr) {
                JSONObject optJSONObject = jSONObject.optJSONObject(str);
                if (this.roiSettings.get(str) instanceof TEBundle) {
                    tEBundle = (TEBundle) this.roiSettings.get(str);
                } else {
                    tEBundle = null;
                }
                if (optJSONObject != null) {
                    if (tEBundle == null) {
                        tEBundle = new TEBundle();
                    }
                    if (!optJSONObject.isNull("roi_on")) {
                        tEBundle.setInt("roi_on", optJSONObject.optInt("roi_on"));
                    }
                    if (!optJSONObject.isNull("roi_qp")) {
                        tEBundle.setInt("roi_qp", optJSONObject.optInt("roi_qp"));
                    }
                    if (!optJSONObject.isNull("roi_asset_dir")) {
                        tEBundle.setString("roi_asset_dir", optJSONObject.optString("roi_asset_dir"));
                    }
                    if (!optJSONObject.isNull("roi_bitrate_ratio")) {
                        tEBundle.setDouble("roi_bitrate_ratio", optJSONObject.optDouble("roi_bitrate_ratio"));
                    }
                    this.roiSettings.put(str, tEBundle);
                }
            }
            if (!jSONObject.isNull("roi_stretch")) {
                this.roiSettings.put("roi_stretch", Boolean.valueOf(jSONObject.optBoolean("roi_stretch")));
            }
        }
    }

    private void parseUrlPrefixAndPort(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("SuggestProtocol");
            char c = 65535;
            switch (string.hashCode()) {
                case 106008:
                    if (string.equals("kcp")) {
                        c = 1;
                        break;
                    }
                    break;
                case 114657:
                    if (string.equals("tcp")) {
                        c = 0;
                        break;
                    }
                    break;
                case 114939:
                    if (string.equals("tls")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3482174:
                    if (string.equals("quic")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.mPushUrlPrefix = "rtmp://";
                this.mRtmpPort = jSONObject.getJSONObject("RtmpPorts").getInt("tcp");
            } else if (c == 1) {
                this.mPushUrlPrefix = "rtmpk://";
                this.mRtmpPort = jSONObject.getJSONObject("RtmpPorts").getInt("kcp");
            } else if (c == 2) {
                this.mPushUrlPrefix = "rtmpq://";
                this.mRtmpPort = jSONObject.getJSONObject("RtmpPorts").getInt("quic");
            } else if (c == 3) {
                this.mPushUrlPrefix = "rtmps://";
                this.mRtmpPort = jSONObject.getJSONObject("RtmpPorts").getInt("tls");
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c1 A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01fd A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x020e A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x021e A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x022e A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x023e A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x024e A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x025e A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x026e A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x027e A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0285 A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0636  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0697  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0135 A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018f A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019f A[Catch:{ Exception -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b0 A[Catch:{ Exception -> 0x0858 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p2082ss.avframework.livestreamv2.LiveStreamBuilder setupSdkParams(java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 2141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.LiveStreamBuilder.setupSdkParams(java.lang.String):com.ss.avframework.livestreamv2.LiveStreamBuilder");
    }

    public ILiveStream create(Handler handler, Handler handler2) {
        return create(handler, handler2, null, null);
    }

    public LiveStreamBuilder setEnableVideoNtp(boolean z, String[] strArr) {
        if (!z || strArr == null || strArr.length <= 0) {
            this.enableVideoNtp = false;
            this.ntpServers = null;
        } else {
            this.enableVideoNtp = z;
            this.ntpServers = strArr;
        }
        return this;
    }

    public LiveStreamBuilder setRoiOn(int i, boolean z) {
        if (z) {
            setRoiOn(i, 1, true, false);
            setRoiOn(i, 2, true, false);
        } else {
            setRoiOn(i, 1, false, false);
            setRoiOn(i, 1, false, true);
            setRoiOn(i, 2, false, false);
        }
        return this;
    }

    private String getVideoEncoderNameForRoi(int i, boolean z, boolean z2) {
        if (i != 2) {
            String[] strArr = this.videoEncoderNames;
            if (z) {
                return strArr[0];
            }
            if (z2) {
                return strArr[2];
            }
            return strArr[1];
        }
        String[] strArr2 = this.videoEncoderNames;
        if (z) {
            return strArr2[3];
        }
        return strArr2[4];
    }

    public ILiveStream create(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
        return create(handler, handler2, audioDeviceModule, null);
    }

    public int getRoiOn(int i, boolean z, boolean z2) {
        try {
            return getRoiSettings().getInt("roi_on");
        } catch (Exception unused) {
            return 0;
        }
    }

    private TEBundle getRoiSettings(int i, boolean z, boolean z2) {
        String videoEncoderNameForRoi = getVideoEncoderNameForRoi(i, z, z2);
        TEBundle tEBundle = (TEBundle) this.roiSettings.get(videoEncoderNameForRoi);
        if (tEBundle == null) {
            tEBundle = new TEBundle();
            this.roiSettings.put(videoEncoderNameForRoi, tEBundle);
        }
        Boolean bool = (Boolean) this.roiSettings.get("roi_stretch");
        if (bool != null) {
            tEBundle.setBool("roi_stretch", bool.booleanValue());
        }
        return tEBundle;
    }

    private int checkParamsForUpdateInner(TEBundle tEBundle, String str, int i, Boolean[] boolArr) {
        int i2;
        if (!tEBundle.contains(str) || i == (i2 = tEBundle.getInt(str))) {
            return i;
        }
        boolArr[0] = Boolean.TRUE;
        return i2;
    }

    private boolean checkParamsForUpdateInner(TEBundle tEBundle, String str, boolean z, Boolean[] boolArr) {
        boolean bool;
        if (!tEBundle.contains(str) || z == (bool = tEBundle.getBool(str))) {
            return z;
        }
        boolArr[0] = Boolean.TRUE;
        return bool;
    }

    private LiveStreamBuilder setRoiAssetDir(String str, int i, boolean z, boolean z2) {
        String videoEncoderNameForRoi = getVideoEncoderNameForRoi(i, z, z2);
        TEBundle tEBundle = (TEBundle) this.roiSettings.get(videoEncoderNameForRoi);
        if (tEBundle == null) {
            tEBundle = new TEBundle();
        }
        try {
            tEBundle.setString("roi_asset_dir", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.roiSettings.put(videoEncoderNameForRoi, tEBundle);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return this;
    }

    private LiveStreamBuilder setRoiOn(int i, int i2, boolean z, boolean z2) {
        String videoEncoderNameForRoi = getVideoEncoderNameForRoi(i2, z, z2);
        TEBundle tEBundle = (TEBundle) this.roiSettings.get(videoEncoderNameForRoi);
        if (tEBundle == null) {
            tEBundle = new TEBundle();
        }
        try {
            tEBundle.setInt("roi_on", i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.roiSettings.put(videoEncoderNameForRoi, tEBundle);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return this;
    }

    public ILiveStream create(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
        return new LiveStream(this, handler, handler2, audioDeviceModule, iVideoEffectProcessor);
    }
}
