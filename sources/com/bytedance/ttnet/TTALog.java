package com.bytedance.ttnet;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h;
import com.p2082ss.android.agilelogger.ALog;

public class TTALog {
    private static volatile long sALogFuncAddr;

    static {
        Covode.recordClassIndex(26795);
    }

    /* renamed from: com_bytedance_ttnet_TTALog_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m43142xc9cdabd0(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_ttnet_TTALog_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m43143xc9cdabde(String str, String str2) {
        return 0;
    }

    public static long getALogFuncAddr() {
        return sALogFuncAddr;
    }

    public static void init() {
        ensureALogInitialized();
    }

    private static C14659h getCronetHttpClient() {
        if (C22932c.m43218a()) {
            return C14659h.m26802a(TTNetInit.getTTNetDepend().mo37259a());
        }
        return null;
    }

    private static void ensureALogInitialized() {
        sALogFuncAddr = ALog.getALogWriteFuncAddr();
        m43142xc9cdabd0("TTNET_ALog", "ALog function address is " + sALogFuncAddr);
        if (sALogFuncAddr == 0) {
            ALog.addNativeFuncAddrCallback(C22948e.f54253a);
        }
    }

    static final /* synthetic */ void lambda$ensureALogInitialized$0$TTALog(long j) {
        if (sALogFuncAddr != 0) {
            m43142xc9cdabd0("TTNET_ALog", "ALog function address has initialized.");
        } else if (j == 0) {
            m43143xc9cdabde("TTNET_ALog", "Cannot get ALog function address in init callback.");
        } else {
            sALogFuncAddr = j;
            m43142xc9cdabd0("TTNET_ALog", "ALog function address is " + sALogFuncAddr + " from callback.");
            try {
                if (getCronetHttpClient() != null) {
                    long j2 = sALogFuncAddr;
                    if (C14659h.f35584c != null) {
                        Reflect.m24529on(C14659h.f35584c).call("setAlogFuncAddr", new Class[]{Long.TYPE}, Long.valueOf(j2));
                        return;
                    }
                    throw new UnsupportedOperationException("CronetEngine has not been initialized.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
