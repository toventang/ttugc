package com.p2082ss.avframework.livestreamv2.core.interact.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl;
import com.p2082ss.avframework.livestreamv2.core.InteractEngine;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.LocalUserStatistics */
public class LocalUserStatistics {
    private long mLastStatTimestamp;
    private LocalUserInteractConnectionStatisticInfo mLocalUserInteractConnectionStatisticInfo;
    private int mNetWorkQuality;
    private int mOnLocalVideoStatsCount;
    private int mOnRtcStatsCount;
    private float mReceiveAudioBitrate;
    private float mReceiveVideoBitrate;
    private float mSendAudioBitrate;
    private float mSendVideoBitrate;
    private float mSendVideoEncoderOutputFrameRate;
    private float mSendVideoFrameRate;
    private float mSendVideoRendererOutputFrameRate;
    private int mUserCount;
    private int mVideoSourceFrameCount;
    private int mVideoSourceHeight;
    private int mVideoSourceWidth;

    static {
        Covode.recordClassIndex(100443);
    }

    public LocalUserInteractConnectionStatisticInfo getInteractConnectionStatistic() {
        if (this.mLocalUserInteractConnectionStatisticInfo == null) {
            this.mLocalUserInteractConnectionStatisticInfo = new LocalUserInteractConnectionStatisticInfo();
        }
        return this.mLocalUserInteractConnectionStatisticInfo;
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.LocalUserStatistics$LocalUserStatisticInfo */
    public class LocalUserStatisticInfo {
        public JSONObject mAdmStatus;
        public int mAudioSourceFrameRate;
        public float mInCapFps;
        public String mLastMessage;
        public boolean mLiveCoreAecStatus;
        public boolean mLiveCoreHeadset;
        public String mLocalMicVolumedB;
        public int mNetWorkQuality;
        public String mRMS;
        public int mReceiveAudioBitrate;
        public int mReceiveVideoBitrate;
        public int mRtcPushElapseMs;
        public int mSendAudioBitrate;
        public int mSendVideoBitrate;
        public int mSendVideoEncoderOutputFrameRate;
        public int mSendVideoFrameRate;
        public int mSendVideoRendererOutputFrameRate;
        public int mUserCount;
        public int mVideoSourceFrameRate;
        public int mVideoSourceHeight;
        public int mVideoSourceWidth;

        static {
            Covode.recordClassIndex(100444);
        }

        public LocalUserStatisticInfo() {
        }
    }

    public synchronized void onLocalAudioStats(IRTCEngineEventHandler.LocalAudioStats localAudioStats) {
        MethodCollector.m26663i(2353);
        MethodCollector.m26664o(2353);
    }

    public synchronized void onLocalNetworkQuality(int i) {
        MethodCollector.m26663i(2458);
        this.mNetWorkQuality = i;
        MethodCollector.m26664o(2458);
    }

    public synchronized void onLocalVideoStats(IRTCEngineEventHandler.LocalVideoStats localVideoStats) {
        MethodCollector.m26663i(2351);
        float f = this.mSendVideoFrameRate;
        int i = this.mOnLocalVideoStatsCount;
        this.mSendVideoFrameRate = (((float) localVideoStats.sentFrameRate) + (f * ((float) i))) / ((float) (i + 1));
        float f2 = this.mSendVideoEncoderOutputFrameRate;
        int i2 = this.mOnLocalVideoStatsCount;
        this.mSendVideoEncoderOutputFrameRate = (((float) localVideoStats.encoderOutputFrameRate) + (f2 * ((float) i2))) / ((float) (i2 + 1));
        float f3 = this.mSendVideoRendererOutputFrameRate;
        int i3 = this.mOnLocalVideoStatsCount;
        this.mSendVideoRendererOutputFrameRate = (((float) localVideoStats.rendererOutputFrameRate) + (f3 * ((float) i3))) / ((float) (i3 + 1));
        this.mOnLocalVideoStatsCount = i3 + 1;
        MethodCollector.m26664o(2351);
    }

    public synchronized void onRtcStats(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats) {
        MethodCollector.m26663i(2350);
        float f = this.mSendAudioBitrate;
        int i = this.mOnRtcStatsCount;
        this.mSendAudioBitrate = (((float) rTCRoomStats.txAudioKBitRate) + (f * ((float) i))) / ((float) (i + 1));
        float f2 = this.mReceiveAudioBitrate;
        int i2 = this.mOnRtcStatsCount;
        this.mReceiveAudioBitrate = (((float) rTCRoomStats.rxAudioKBitRate) + (f2 * ((float) i2))) / ((float) (i2 + 1));
        float f3 = this.mSendVideoBitrate;
        int i3 = this.mOnRtcStatsCount;
        this.mSendVideoBitrate = (((float) rTCRoomStats.txVideoKBitRate) + (f3 * ((float) i3))) / ((float) (i3 + 1));
        float f4 = this.mReceiveVideoBitrate;
        int i4 = this.mOnRtcStatsCount;
        this.mReceiveVideoBitrate = (((float) rTCRoomStats.rxVideoKBitRate) + (f4 * ((float) i4))) / ((float) (i4 + 1));
        this.mUserCount = rTCRoomStats.users;
        this.mOnRtcStatsCount++;
        MethodCollector.m26664o(2350);
    }

    public synchronized LocalUserStatisticInfo getStatisticResult(LiveCore liveCore) {
        LocalUserStatisticInfo localUserStatisticInfo;
        long j;
        double d;
        IAudioDeviceControl.IAudioTrack track;
        MethodCollector.m26663i(2570);
        localUserStatisticInfo = new LocalUserStatisticInfo();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.mLastStatTimestamp;
        if (j2 <= 0 || currentTimeMillis <= j2) {
            j = 0;
        } else {
            j = currentTimeMillis - j2;
        }
        localUserStatisticInfo.mSendAudioBitrate = (int) this.mSendAudioBitrate;
        localUserStatisticInfo.mReceiveAudioBitrate = (int) this.mReceiveAudioBitrate;
        localUserStatisticInfo.mSendVideoBitrate = (int) this.mSendVideoBitrate;
        localUserStatisticInfo.mReceiveVideoBitrate = (int) this.mReceiveVideoBitrate;
        localUserStatisticInfo.mUserCount = this.mUserCount;
        localUserStatisticInfo.mSendVideoFrameRate = (int) this.mSendVideoFrameRate;
        localUserStatisticInfo.mSendVideoEncoderOutputFrameRate = (int) this.mSendVideoEncoderOutputFrameRate;
        localUserStatisticInfo.mSendVideoRendererOutputFrameRate = (int) this.mSendVideoRendererOutputFrameRate;
        localUserStatisticInfo.mNetWorkQuality = this.mNetWorkQuality;
        localUserStatisticInfo.mVideoSourceWidth = this.mVideoSourceWidth;
        localUserStatisticInfo.mVideoSourceHeight = this.mVideoSourceHeight;
        if (j > 0) {
            double d2 = (double) this.mVideoSourceFrameCount;
            Double.isNaN(d2);
            double d3 = (double) j;
            Double.isNaN(d3);
            d = (d2 * 1000.0d) / d3;
        } else {
            d = 0.0d;
        }
        localUserStatisticInfo.mVideoSourceFrameRate = (int) d;
        if (liveCore != null) {
            AudioDeviceModule adm = liveCore.getADM();
            if (adm != null) {
                int option = (int) adm.getOption(1);
                int option2 = (int) adm.getOption(2);
                int option3 = (int) adm.getOption(3);
                int option4 = (int) adm.getOption(8);
                int option5 = (int) adm.getOption(9);
                IAudioDeviceControl audioDeviceControl = liveCore.getAudioDeviceControl();
                if (!(audioDeviceControl == null || (track = audioDeviceControl.getTrack(InteractEngine.AUDIO_LAYER_NAME)) == null)) {
                    option5 = (int) track.getOption(1);
                }
                localUserStatisticInfo.mRMS = option + "," + option2 + "," + option3 + ",0," + option5 + "," + option4;
                localUserStatisticInfo.mLocalMicVolumedB = option + "," + option2 + "," + option3 + ",-";
                localUserStatisticInfo.mLiveCoreAecStatus = adm.isEnableBuiltInAEC();
                localUserStatisticInfo.mLiveCoreHeadset = adm.isHeadSet();
                localUserStatisticInfo.mAdmStatus = adm.getReportJsonStats();
            }
            IVideoCapturerControl videoCapturerControl = liveCore.getVideoCapturerControl();
            if (videoCapturerControl != null) {
                localUserStatisticInfo.mInCapFps = videoCapturerControl.getInCaptureRealFps();
            }
        }
        this.mLastStatTimestamp = currentTimeMillis;
        this.mOnRtcStatsCount = 0;
        this.mSendAudioBitrate = 0.0f;
        this.mReceiveAudioBitrate = 0.0f;
        this.mSendVideoBitrate = 0.0f;
        this.mReceiveVideoBitrate = 0.0f;
        this.mUserCount = 0;
        this.mOnLocalVideoStatsCount = 0;
        this.mSendVideoFrameRate = 0.0f;
        this.mSendVideoEncoderOutputFrameRate = 0.0f;
        this.mSendVideoRendererOutputFrameRate = 0.0f;
        this.mNetWorkQuality = 0;
        this.mVideoSourceWidth = 0;
        this.mVideoSourceHeight = 0;
        this.mVideoSourceFrameCount = 0;
        MethodCollector.m26664o(2570);
        return localUserStatisticInfo;
    }

    public synchronized void onVideoSourceFrame(int i, int i2, long j) {
        MethodCollector.m26663i(2496);
        this.mVideoSourceWidth = i;
        this.mVideoSourceHeight = i2;
        this.mVideoSourceFrameCount++;
        MethodCollector.m26664o(2496);
    }
}
