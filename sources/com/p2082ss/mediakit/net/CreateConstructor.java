package com.p2082ss.mediakit.net;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.net.CreateConstructor */
public interface CreateConstructor {
    static {
        Covode.recordClassIndex(101239);
    }

    BaseDNS createDns(String str, AVMDLNetClient aVMDLNetClient, int i, Handler handler);
}
