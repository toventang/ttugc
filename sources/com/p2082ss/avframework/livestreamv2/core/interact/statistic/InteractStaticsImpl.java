package com.p2082ss.avframework.livestreamv2.core.interact.statistic;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.LocalUserStatistics;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.ProcInfoStatistics;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.RemoteUserStatistics;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import java.util.Map;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.InteractStaticsImpl */
public class InteractStaticsImpl implements IInteractStatics {
    private final boolean mEnableInteractDurationCheck;
    private final boolean mEnableProcStatics;
    private final boolean mEnableRemoteUserStatics;
    private LocalUserStatistics mLocalUserStatistics = new LocalUserStatistics();
    private ProcInfoStatistics mProcInfoStatistics;
    private RemoteUserStatistics mRemoteUserStatistics;

    static {
        Covode.recordClassIndex(100441);
    }

    private LocalUserInteractConnectionStatisticInfo getInteractConnectionStatistic() {
        if (!this.mEnableInteractDurationCheck) {
            return null;
        }
        return this.mLocalUserStatistics.getInteractConnectionStatistic();
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void calcDurationFromInteractToLive() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.calcDurationFromInteractToLive();
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void calcDurationFromLiveToInteract() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.calcDurationFromLiveToInteract();
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public ProcInfoStatistics.ProcInfo getProcInfo() {
        ProcInfoStatistics procInfoStatistics = this.mProcInfoStatistics;
        if (procInfoStatistics != null) {
            return procInfoStatistics.getProcInfo();
        }
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public Map<String, RemoteUserStatistics.RemoteUserInfo> getRemoteStatisticResult() {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            return remoteUserStatistics.getStatisticResult();
        }
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void setInteractStartTime() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.setInteractStartTime();
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void setInteractStopTime() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.setInteractStopTime();
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void addRemoteUser(String str) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.addUser(str);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalAudioStats(IRTCEngineEventHandler.LocalAudioStats localAudioStats) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onLocalAudioStats(localAudioStats);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalNetworkQuality(int i) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onLocalNetworkQuality(i);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalRtcStats(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onRtcStats(rTCRoomStats);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalVideoStats(IRTCEngineEventHandler.LocalVideoStats localVideoStats) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onLocalVideoStats(localVideoStats);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteAudioStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onRemoteAudioStats(remoteStreamStats);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteVideoRendered(String str) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onRemoteVideoRendered(str);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteVideoStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onRemoteVideoStats(remoteStreamStats);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void removeRemoteUser(String str) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.removeUser(str);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public LocalUserStatistics.LocalUserStatisticInfo getLocalStatisticResult(LiveCore liveCore) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            return localUserStatistics.getStatisticResult(liveCore);
        }
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void getInteractConnectDurationInfo(long[] jArr) {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            jArr[0] = interactConnectionStatistic.switchFromLiveToInteract;
            jArr[1] = interactConnectionStatistic.switchFromInteractToLive;
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteAudioVolumeIndication(IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onAudioVolumeIndication(audioVolumeInfoArr, i);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalVideoSourceFrame(int i, int i2) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onVideoSourceFrame(i, i2, 0);
        }
    }

    public InteractStaticsImpl(Context context, LiveCore.InteractConfig interactConfig) {
        this.mEnableInteractDurationCheck = interactConfig.isEnableInteractConnectionStatics();
        boolean isEnableRemoteUserStatics = interactConfig.isEnableRemoteUserStatics();
        this.mEnableRemoteUserStatics = isEnableRemoteUserStatics;
        boolean isEnabelProcStatics = interactConfig.isEnabelProcStatics();
        this.mEnableProcStatics = isEnabelProcStatics;
        if (isEnableRemoteUserStatics) {
            this.mRemoteUserStatistics = new RemoteUserStatistics();
        }
        if (isEnabelProcStatics) {
            this.mProcInfoStatistics = new ProcInfoStatistics(context);
        }
    }
}
