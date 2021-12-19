package com.p2082ss.android.ugc.aweme.video.bitrate;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81963b;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.BandwidthSet */
public class BandwidthSet implements AbstractC81963b {
    @AbstractC27891c(mo46611a = "bitrate")
    private double bitRate;
    @AbstractC27891c(mo46611a = "speed")
    private double speed;

    static {
        Covode.recordClassIndex(93990);
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81963b
    public double getBitrate() {
        return this.bitRate;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81963b
    public double getSpeed() {
        return this.speed;
    }

    public String toString() {
        return "BandwidthSet{speed=" + this.speed + ", bitRate=" + this.bitRate + '}';
    }

    public void setBitRate(long j) {
        this.bitRate = (double) j;
    }

    public void setSpeed(int i) {
        this.speed = (double) i;
    }
}
