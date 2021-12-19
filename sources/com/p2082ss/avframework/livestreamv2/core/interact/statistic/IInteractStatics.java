package com.p2082ss.avframework.livestreamv2.core.interact.statistic;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.LocalUserStatistics;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.ProcInfoStatistics;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.RemoteUserStatistics;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import java.util.Map;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics */
public interface IInteractStatics {
    static {
        Covode.recordClassIndex(100408);
    }

    void addRemoteUser(String str);

    void calcDurationFromInteractToLive();

    void calcDurationFromLiveToInteract();

    void getInteractConnectDurationInfo(long[] jArr);

    LocalUserStatistics.LocalUserStatisticInfo getLocalStatisticResult(LiveCore liveCore);

    ProcInfoStatistics.ProcInfo getProcInfo();

    Map<String, RemoteUserStatistics.RemoteUserInfo> getRemoteStatisticResult();

    void onLocalAudioStats(IRTCEngineEventHandler.LocalAudioStats localAudioStats);

    void onLocalNetworkQuality(int i);

    void onLocalRtcStats(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats);

    void onLocalVideoSourceFrame(int i, int i2);

    void onLocalVideoStats(IRTCEngineEventHandler.LocalVideoStats localVideoStats);

    void onRemoteAudioStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats);

    void onRemoteAudioVolumeIndication(IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i);

    void onRemoteVideoRendered(String str);

    void onRemoteVideoStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats);

    void removeRemoteUser(String str);

    void setInteractStartTime();

    void setInteractStopTime();
}
