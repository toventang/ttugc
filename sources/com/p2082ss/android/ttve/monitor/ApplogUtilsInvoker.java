package com.p2082ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.ApplogUtilsInvoker */
public class ApplogUtilsInvoker {
    static {
        Covode.recordClassIndex(37248);
    }

    public static native void nativeInit();

    public static void onNativeCallback_onAppLogJson(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        C30683b.m63032a(str, jSONObject, str3);
    }

    public static void onNativeCallback_onAppLogClientJson(String str, String str2, String str3, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        C30683b.m63033a(str, jSONObject, str3, z, true);
    }
}
