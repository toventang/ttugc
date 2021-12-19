package com.bytedance.p802b.p806b.p807a.p809b;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p841k.C13129e;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.b.a.b.d */
public final class C12936d {

    /* renamed from: a */
    private static long f31507a = -1;

    static {
        Covode.recordClassIndex(14772);
    }

    /* renamed from: a */
    public static long m23214a() {
        if (f31507a == -1) {
            f31507a = (C13037a.m23432a() << 16) | ((long) Process.myPid());
        }
        return f31507a;
    }

    /* renamed from: a */
    public static C12931a m23215a(byte[] bArr) {
        try {
            C12931a aVar = new C12931a();
            JSONObject jSONObject = new JSONObject(new String(bArr));
            aVar.f31480g = C13129e.m23600a(jSONObject, "version_code");
            aVar.f31481h = C13129e.m23600a(jSONObject, "version_name");
            aVar.f31479f = C13129e.m23600a(jSONObject, "manifest_version_code");
            aVar.f31477d = C13129e.m23600a(jSONObject, "update_version_code");
            aVar.f31478e = C13129e.m23600a(jSONObject, "app_version");
            aVar.f31483j = C13129e.m23600a(jSONObject, "os");
            aVar.f31484k = C13129e.m23600a(jSONObject, "device_platform");
            aVar.f31485l = C13129e.m23600a(jSONObject, "os_version");
            aVar.f31486m = C13129e.m23603b(jSONObject, "os_api");
            aVar.f31487n = C13129e.m23600a(jSONObject, "device_model");
            aVar.f31488o = C13129e.m23600a(jSONObject, "device_brand");
            aVar.f31489p = C13129e.m23600a(jSONObject, "device_manufacturer");
            aVar.f31490q = C13129e.m23600a(jSONObject, "process_name");
            aVar.f31491r = C13129e.m23605c(jSONObject, "sid");
            aVar.f31492s = C13129e.m23600a(jSONObject, "rom_version");
            aVar.f31493t = C13129e.m23600a(jSONObject, "package");
            aVar.f31494u = C13129e.m23600a(jSONObject, "monitor_version");
            aVar.f31476c = C13129e.m23600a(jSONObject, "channel");
            aVar.f31474a = C13129e.m23603b(jSONObject, "aid");
            aVar.f31475b = C13129e.m23600a(jSONObject, "device_id");
            aVar.f31496w = C13129e.m23605c(jSONObject, "phone_startup_time");
            aVar.f31482i = C13129e.m23600a(jSONObject, "release_build");
            aVar.f31495v = C13129e.m23605c(jSONObject, "uid");
            aVar.f31497x = C13129e.m23600a(jSONObject, "verify_info");
            aVar.f31472B = C13129e.m23600a(jSONObject, "current_update_version_code");
            if (jSONObject.has("config_time")) {
                aVar.f31473C = (long) C13129e.m23603b(jSONObject, "config_time");
            }
            try {
                aVar.f31471A = new JSONObject((String) jSONObject.remove("filters"));
            } catch (Exception unused) {
            }
            aVar.f31499z = jSONObject;
            return aVar;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m23216a(C12931a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (aVar.f31499z != null) {
                jSONObject = C13129e.m23601a(jSONObject, aVar.f31499z);
            }
            if (aVar.f31498y != null) {
                jSONObject = C13129e.m23601a(jSONObject, aVar.f31498y);
            }
            jSONObject.put("version_code", aVar.f31480g);
            jSONObject.put("version_name", aVar.f31481h);
            jSONObject.put("manifest_version_code", aVar.f31479f);
            jSONObject.put("update_version_code", aVar.f31477d);
            jSONObject.put("app_version", aVar.f31478e);
            jSONObject.put("os", aVar.f31483j);
            jSONObject.put("device_platform", aVar.f31484k);
            jSONObject.put("os_version", aVar.f31485l);
            jSONObject.put("os_api", aVar.f31486m);
            jSONObject.put("device_model", aVar.f31487n);
            jSONObject.put("device_brand", aVar.f31488o);
            jSONObject.put("device_manufacturer", aVar.f31489p);
            jSONObject.put("process_name", aVar.f31490q);
            jSONObject.put("sid", aVar.f31491r);
            jSONObject.put("rom_version", aVar.f31492s);
            jSONObject.put("package", aVar.f31493t);
            jSONObject.put("monitor_version", aVar.f31494u);
            jSONObject.put("channel", aVar.f31476c);
            jSONObject.put("aid", aVar.f31474a);
            if (!TextUtils.isEmpty(aVar.f31475b)) {
                jSONObject.put("device_id", aVar.f31475b);
            }
            jSONObject.put("uid", aVar.f31495v);
            jSONObject.put("phone_startup_time", aVar.f31496w);
            jSONObject.put("release_build", aVar.f31482i);
            if (aVar.f31473C != -1) {
                jSONObject.put("config_time", String.valueOf(aVar.f31473C));
            }
            if (!TextUtils.isEmpty(aVar.f31497x)) {
                jSONObject.put("verify_info", aVar.f31497x);
            }
            jSONObject.put("current_update_version_code", aVar.f31472B);
            if (aVar.f31471A != null) {
                jSONObject.put("filters", aVar.f31471A);
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
