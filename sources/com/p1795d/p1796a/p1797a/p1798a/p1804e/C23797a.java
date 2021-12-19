package com.p1795d.p1796a.p1797a.p1798a.p1804e;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.e.a */
public final class C23797a {
    static {
        Covode.recordClassIndex(27905);
    }

    /* renamed from: a */
    public static JSONObject m44980a() {
        JSONObject jSONObject = new JSONObject();
        C23798b.m44985a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        C23798b.m44985a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C23798b.m44985a(jSONObject, "os", "Android");
        return jSONObject;
    }
}
