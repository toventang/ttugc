package com.p2082ss.avframework.livestreamv2.core.interact.statistic;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.LocalUserInteractConnectionStatisticInfo */
public class LocalUserInteractConnectionStatisticInfo {
    public long receivedOnLeaveChannelTime;
    public long startIneractTime;
    public long stopInteractTime;
    public long streamMixedSuccessTime;
    public long switchFromInteractToLive;
    public long switchFromLiveToInteract;

    static {
        Covode.recordClassIndex(100442);
    }

    public void setInteractStartTime() {
        if (this.startIneractTime == 0) {
            this.startIneractTime = System.currentTimeMillis();
        }
    }

    public void setInteractStopTime() {
        if (this.stopInteractTime == 0) {
            this.stopInteractTime = System.currentTimeMillis();
        }
    }

    public long calcDurationFromInteractToLive() {
        if (this.receivedOnLeaveChannelTime == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.receivedOnLeaveChannelTime = currentTimeMillis;
            long j = this.stopInteractTime;
            if (j != 0) {
                this.switchFromInteractToLive = currentTimeMillis - j;
            }
        }
        return this.switchFromInteractToLive;
    }

    public long calcDurationFromLiveToInteract() {
        if (this.streamMixedSuccessTime == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.streamMixedSuccessTime = currentTimeMillis;
            long j = this.startIneractTime;
            if (j != 0) {
                this.switchFromLiveToInteract = currentTimeMillis - j;
            }
        }
        return this.switchFromLiveToInteract;
    }
}
