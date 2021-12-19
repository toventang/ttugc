package com.p2082ss.android.ttve.log;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.ttve.log.TELog2ClientInvoker */
public class TELog2ClientInvoker {
    public static native void nativeInit();

    public static native void nativeSetIsToLogcat(boolean z);

    static {
        Covode.recordClassIndex(37201);
        C30731d.m63117b();
    }

    public static void onNativeCallback_logToLocal(int i, String str) {
        C30653a.m63007a(i, str);
    }
}
