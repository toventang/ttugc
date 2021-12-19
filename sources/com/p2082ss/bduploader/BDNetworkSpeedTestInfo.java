package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDNetworkSpeedTestInfo */
public class BDNetworkSpeedTestInfo {
    public String mContext;
    public int mContextType;
    public int mSpeed;

    static {
        Covode.recordClassIndex(100792);
    }

    public BDNetworkSpeedTestInfo(String str, int i, int i2) {
        this.mContext = str;
        this.mContextType = i;
        this.mSpeed = i2;
    }
}
