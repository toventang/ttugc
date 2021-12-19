package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDNetworkRouterListener */
public interface BDNetworkRouterListener {
    static {
        Covode.recordClassIndex(100790);
    }

    int networkRouteCheckNetState(int i, int i2);

    void onRouteContext(int i, int i2, String str);
}
