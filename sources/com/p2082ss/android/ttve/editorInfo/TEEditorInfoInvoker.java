package com.p2082ss.android.ttve.editorInfo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.C30731d;
import java.util.HashMap;

/* renamed from: com.ss.android.ttve.editorInfo.TEEditorInfoInvoker */
public class TEEditorInfoInvoker {
    public static native void nativeInit();

    static {
        Covode.recordClassIndex(37194);
        C30731d.m63114a();
    }

    public static void onNativeCallback_onEditorInfoInt(String str, long j) {
        C30652a.m63004a(str, j);
    }

    public static void onNativeCallback_onEditorInfoJson(String str, String str2) {
        C30652a.m63005a(str, str2);
    }

    public static void onNativeCallback_onEditorInfoFloat(String str, float f) {
        if (C30652a.f73290a != null) {
            C30652a.f73290a.put(str, Float.valueOf(f));
        }
    }

    public static void onNativeCallback_onEditorInfoMap(String str, HashMap hashMap) {
        if (C30652a.f73290a != null) {
            C30652a.f73290a.put(str, hashMap);
        }
    }
}
