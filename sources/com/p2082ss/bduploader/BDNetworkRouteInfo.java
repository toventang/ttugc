package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDNetworkRouteInfo */
public class BDNetworkRouteInfo {
    public String mContext;
    public int mContextType;
    public int mSpeed;

    static {
        Covode.recordClassIndex(100788);
    }

    public BDNetworkRouteInfo(String str, int i, int i2) {
        this.mContext = str;
        this.mContextType = i;
        this.mSpeed = i2;
    }
}
