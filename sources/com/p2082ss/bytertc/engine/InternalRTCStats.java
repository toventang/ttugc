package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.InternalRTCStats */
public class InternalRTCStats {
    public double cpuAppUsage;
    public double cpuTotalUsage;
    public int rtt;
    public int rxAudioKBitRate;
    public int rxBytes;
    public int rxKBitRate;
    public double rxLostrate;
    public int rxVideoKBitRate;
    public int totalDuration;
    public int txAudioKBitRate;
    public int txBytes;
    public int txKBitRate;
    public double txLostrate;
    public int txVideoKBitRate;
    public int users;

    static {
        Covode.recordClassIndex(100896);
    }

    public InternalRTCStats() {
    }

    public void reset() {
        this.totalDuration = 0;
        this.txBytes = 0;
        this.rxBytes = 0;
        this.txKBitRate = 0;
        this.rxKBitRate = 0;
        this.txAudioKBitRate = 0;
        this.rxAudioKBitRate = 0;
        this.txVideoKBitRate = 0;
        this.rxVideoKBitRate = 0;
        this.users = 0;
        this.cpuTotalUsage = 0.0d;
        this.cpuAppUsage = 0.0d;
        this.rxLostrate = 0.0d;
        this.txLostrate = 0.0d;
        this.rtt = 0;
    }

    public String toString() {
        return "RtcStats{totalDuration=" + this.totalDuration + ", txBytes=" + this.txBytes + ", rxBytes=" + this.rxBytes + ", txKBitRate=" + this.txKBitRate + ", rxKBitRate=" + this.rxKBitRate + ", txAudioKBitRate=" + this.txAudioKBitRate + ", rxAudioKBitRate=" + this.rxAudioKBitRate + ", txVideoKBitRate=" + this.txVideoKBitRate + ", rxVideoKBitRate=" + this.rxVideoKBitRate + ", users=" + this.users + ", cpuTotalUsage=" + this.cpuTotalUsage + ", cpuAppUsage=" + this.cpuAppUsage + ", txLostrate=" + this.txLostrate + ", rxLostrate=" + this.rxLostrate + ", rtt=" + this.rtt + '}';
    }

    private static InternalRTCStats create(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, double d, double d2, int i11) {
        return new InternalRTCStats(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, d, d2, i11);
    }

    public InternalRTCStats(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, double d, double d2, int i11) {
        this.totalDuration = i;
        this.txBytes = i2;
        this.rxBytes = i3;
        this.txKBitRate = i4;
        this.rxKBitRate = i5;
        this.txAudioKBitRate = i6;
        this.rxAudioKBitRate = i7;
        this.txVideoKBitRate = i8;
        this.rxVideoKBitRate = i9;
        this.users = i10;
        this.rxLostrate = d2;
        this.txLostrate = d;
        this.rtt = i11;
    }
}
