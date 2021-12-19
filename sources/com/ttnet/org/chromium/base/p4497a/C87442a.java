package com.ttnet.org.chromium.base.p4497a;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;

/* renamed from: com.ttnet.org.chromium.base.a.a */
public final class C87442a {
    static {
        Covode.recordClassIndex(103371);
    }

    /* renamed from: a */
    public static long m151769a(Network network) {
        return network.getNetworkHandle();
    }

    /* renamed from: b */
    public static Network m151772b(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }

    /* renamed from: a */
    public static Network m151770a(ConnectivityManager connectivityManager) {
        return connectivityManager.getBoundNetworkForProcess();
    }

    /* renamed from: b */
    public static NetworkInfo m151773b(ConnectivityManager connectivityManager, Network network) {
        try {
            return connectivityManager.getNetworkInfo(network);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    public static NetworkInfo m151771a(ConnectivityManager connectivityManager, Network network) {
        return m151773b(connectivityManager, network);
    }
}
