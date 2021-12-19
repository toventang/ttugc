package com.bytedance.bdlocation.traceroute.data;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class HopInfo {
    private int hop;
    private List<HopData> hopData;

    static {
        Covode.recordClassIndex(15172);
    }

    public int getHop() {
        return this.hop;
    }

    public List<HopData> getHopData() {
        return this.hopData;
    }

    public void setHop(int i) {
        this.hop = i;
    }

    public void setHopData(List<HopData> list) {
        this.hopData = list;
    }
}
