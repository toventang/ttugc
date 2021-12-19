package com.p2082ss.android.ugc.aweme.video.bitrate;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81966e;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.GearSet */
public class GearSet implements AbstractC81966e {
    @AbstractC27891c(mo46611a = "bit_rate")
    private int bitRate;
    @AbstractC27891c(mo46611a = "network_lower")
    private int networkLower;
    @AbstractC27891c(mo46611a = "network_upper")
    private int networkUpper;

    static {
        Covode.recordClassIndex(93991);
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81966e
    public int getBitRate() {
        return this.bitRate;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81966e
    public int getNetworkLower() {
        return this.networkLower;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81966e
    public int getNetworkUpper() {
        return this.networkUpper;
    }

    public String toString() {
        return "GearSet{networkUpper=" + this.networkUpper + ", networkLower=" + this.networkLower + ", bitRate=" + this.bitRate + '}';
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setNetworkLower(int i) {
        this.networkLower = i;
    }

    public void setNetworkUpper(int i) {
        this.networkUpper = i;
    }
}
