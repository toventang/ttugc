package com.p2082ss.mediakit.net;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.net.DefaultConstructor */
public class DefaultConstructor implements CreateConstructor {
    static {
        Covode.recordClassIndex(101246);
    }

    @Override // com.p2082ss.mediakit.net.CreateConstructor
    public BaseDNS createDns(String str, AVMDLNetClient aVMDLNetClient, int i, Handler handler) {
        try {
            return new HTTPDNS(str, aVMDLNetClient, i, handler);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
