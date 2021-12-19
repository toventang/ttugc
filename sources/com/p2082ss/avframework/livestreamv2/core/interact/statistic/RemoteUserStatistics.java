package com.p2082ss.avframework.livestreamv2.core.interact.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.RemoteUserStatistics */
public class RemoteUserStatistics extends HashMap<String, RemoteUserInfo> {
    static {
        Covode.recordClassIndex(100448);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.RemoteUserStatistics$RemoteUserInfo */
    public class RemoteUserInfo {
        public int audioBitrate;
        public int audioDelay;
        public int audioLossRate;
        public int audioVoiceVolume;
        public long lastStatTimestamp;
        public int videoBitrate;
        public int videoDecodeFps;
        public int videoLossRate;
        public int videoRenderFps;
        public int videoRenderFrameCount;

        static {
            Covode.recordClassIndex(100449);
        }

        /* access modifiers changed from: protected */
        public RemoteUserInfo clone() {
            RemoteUserInfo remoteUserInfo = new RemoteUserInfo();
            remoteUserInfo.videoBitrate = this.videoBitrate;
            remoteUserInfo.videoDecodeFps = this.videoDecodeFps;
            remoteUserInfo.videoRenderFps = this.videoRenderFps;
            remoteUserInfo.videoLossRate = this.videoLossRate;
            remoteUserInfo.audioBitrate = this.audioBitrate;
            remoteUserInfo.audioDelay = this.audioDelay;
            remoteUserInfo.audioLossRate = this.audioLossRate;
            remoteUserInfo.audioVoiceVolume = this.audioVoiceVolume;
            remoteUserInfo.lastStatTimestamp = this.lastStatTimestamp;
            remoteUserInfo.videoRenderFrameCount = this.videoRenderFrameCount;
            return remoteUserInfo;
        }

        public RemoteUserInfo() {
        }
    }

    public synchronized Map<String, RemoteUserInfo> getStatisticResult() {
        HashMap hashMap;
        long j;
        int i;
        MethodCollector.m26663i(3831);
        hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry entry : entrySet()) {
            String str = (String) entry.getKey();
            RemoteUserInfo remoteUserInfo = (RemoteUserInfo) entry.getValue();
            if (remoteUserInfo.lastStatTimestamp == 0 || currentTimeMillis <= remoteUserInfo.lastStatTimestamp) {
                j = 0;
            } else {
                j = currentTimeMillis - remoteUserInfo.lastStatTimestamp;
            }
            if (j > 0) {
                double d = (double) remoteUserInfo.videoRenderFrameCount;
                Double.isNaN(d);
                double d2 = (double) j;
                Double.isNaN(d2);
                i = (int) ((d * 1000.0d) / d2);
            } else {
                i = 0;
            }
            remoteUserInfo.videoRenderFps = i;
            hashMap.put(str, remoteUserInfo.clone());
            remoteUserInfo.videoBitrate = 0;
            remoteUserInfo.videoDecodeFps = 0;
            remoteUserInfo.videoRenderFps = 0;
            remoteUserInfo.videoLossRate = 0;
            remoteUserInfo.audioBitrate = 0;
            remoteUserInfo.audioDelay = 0;
            remoteUserInfo.audioLossRate = 0;
            remoteUserInfo.audioVoiceVolume = 0;
            remoteUserInfo.lastStatTimestamp = currentTimeMillis;
            remoteUserInfo.videoRenderFrameCount = 0;
        }
        MethodCollector.m26664o(3831);
        return hashMap;
    }

    public synchronized void addUser(String str) {
        MethodCollector.m26663i(3331);
        super.put(str, new RemoteUserInfo());
        MethodCollector.m26664o(3331);
    }

    public synchronized void onRemoteVideoRendered(String str) {
        MethodCollector.m26663i(3779);
        RemoteUserInfo remoteUserInfo = (RemoteUserInfo) get(str);
        if (remoteUserInfo != null) {
            remoteUserInfo.videoRenderFrameCount++;
        }
        MethodCollector.m26664o(3779);
    }

    public synchronized void removeUser(String str) {
        MethodCollector.m26663i(3333);
        super.remove(str);
        MethodCollector.m26664o(3333);
    }

    public synchronized void onRemoteAudioStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats) {
        RemoteUserInfo remoteUserInfo;
        MethodCollector.m26663i(3589);
        if (!(remoteStreamStats == null || (remoteUserInfo = (RemoteUserInfo) get(remoteStreamStats.uid)) == null)) {
            remoteUserInfo.audioBitrate = (int) remoteStreamStats.audioStats.receivedKBitrate;
            remoteUserInfo.audioDelay = (int) remoteStreamStats.audioStats.e2eDelay;
            remoteUserInfo.audioLossRate = (int) (remoteStreamStats.audioStats.audioLossRate * 100.0f);
        }
        MethodCollector.m26664o(3589);
    }

    public synchronized void onRemoteVideoStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats) {
        RemoteUserInfo remoteUserInfo;
        MethodCollector.m26663i(3475);
        if (!(remoteStreamStats == null || (remoteUserInfo = (RemoteUserInfo) get(remoteStreamStats.uid)) == null)) {
            remoteUserInfo.videoBitrate = (int) remoteStreamStats.videoStats.receivedKBitrate;
            remoteUserInfo.videoDecodeFps = remoteStreamStats.videoStats.decoderOutputFrameRate;
            remoteUserInfo.videoLossRate = (int) (remoteStreamStats.videoStats.videoLossRate * 100.0f);
        }
        MethodCollector.m26664o(3475);
    }

    public synchronized void onAudioVolumeIndication(IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
        MethodCollector.m26663i(3655);
        if (audioVolumeInfoArr != null) {
            for (IRTCEngineEventHandler.AudioVolumeInfo audioVolumeInfo : audioVolumeInfoArr) {
                RemoteUserInfo remoteUserInfo = (RemoteUserInfo) get(audioVolumeInfo.uid);
                if (remoteUserInfo != null) {
                    remoteUserInfo.audioVoiceVolume = audioVolumeInfo.volume;
                }
            }
        }
        MethodCollector.m26664o(3655);
    }

    public synchronized void onRemoteAudioTransportStats(String str, int i, int i2, int i3) {
        MethodCollector.m26663i(3590);
        MethodCollector.m26664o(3590);
    }

    public synchronized void onRemoteVideoTransportStats(String str, int i, int i2, int i3) {
        MethodCollector.m26663i(3592);
        MethodCollector.m26664o(3592);
    }
}
