package com.bytedance.crash;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13865c;
import com.bytedance.crash.p932j.C13924m;
import com.bytedance.crash.runtime.p935c.C14002b;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.i */
public final class C13881i {

    /* renamed from: b */
    static MonitorCrash f33809b;

    /* renamed from: a */
    protected MonitorCrash f33810a;

    static {
        Covode.recordClassIndex(15941);
    }

    /* renamed from: b */
    public final String mo22363b() {
        return this.f33810a.mConfig.mAid;
    }

    /* renamed from: c */
    private JSONObject m25109c() {
        return new JSONObject(this.f33810a.mTagMap);
    }

    /* renamed from: a */
    public final JSONObject mo22360a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f33810a.mConfig.mPackageName == null) {
                Context context = C13933m.f33936a;
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
                if (packageInfo != null) {
                    if (this.f33810a.mConfig.mVersionInt == -1) {
                        this.f33810a.mConfig.mVersionInt = (long) packageInfo.versionCode;
                    }
                    if (this.f33810a.mConfig.mVersionStr == null) {
                        this.f33810a.mConfig.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f33810a.mConfig.mDeviceId)) {
            this.f33810a.mConfig.mDeviceId = C13933m.m25226b().mo22549a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f33810a.mConfig.mAid));
            jSONObject.put("update_version_code", this.f33810a.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f33810a.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f33810a.mConfig.mVersionStr);
            jSONObject.put("channel", this.f33810a.mConfig.mChannel);
            jSONObject.put("package", this.f33810a.mConfig.mPackageName);
            jSONObject.put("device_id", this.f33810a.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f33810a.mConfig.mUID);
            jSONObject.put("os", "Android");
            if (this.f33810a.mConfig.mSoList != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.f33810a.mConfig.mSoList) {
                    jSONArray.put(str);
                }
                jSONObject.put("so_list", jSONArray);
            }
            jSONObject.put("single_upload", 0);
        } catch (JSONException unused2) {
            C13933m.f33942g.isDebugMode();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final boolean mo22362a(Object obj) {
        if (this.f33810a == obj) {
            return true;
        }
        return false;
    }

    C13881i(MonitorCrash monitorCrash) {
        this.f33810a = monitorCrash;
        C13865c.f33759a.add(this);
        C14002b.m25372a();
        C13924m.m25207a(0);
    }

    /* renamed from: c */
    private JSONObject m25110c(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        if (this.f33810a.mCustomData == null || (userData = this.f33810a.mCustomData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    /* renamed from: a */
    public final JSONObject mo22361a(CrashType crashType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", mo22360a());
            if (crashType != null) {
                jSONObject.put("custom", m25110c(crashType));
                jSONObject.put("filters", m25109c());
            }
            jSONObject.put("line_num", (Object) null);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final JSONObject mo22364b(CrashType crashType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", mo22360a());
            if (crashType != null) {
                jSONObject.put("custom", m25110c(crashType));
                jSONObject.put("filters", m25109c());
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
