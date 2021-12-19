package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerProperties {

    /* renamed from: Ι */
    private static AppsFlyerProperties f6931 = new AppsFlyerProperties();

    /* renamed from: ı */
    private String f6932;

    /* renamed from: ǃ */
    private boolean f6933;

    /* renamed from: ɩ */
    private Map<String, Object> f6934 = new HashMap();

    /* renamed from: ɹ */
    private boolean f6935 = false;

    /* renamed from: ι */
    private boolean f6936;

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled() {
        this.f6936 = true;
    }

    /* access modifiers changed from: protected */
    public void setOnReceiveCalled() {
        this.f6933 = true;
    }

    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);
        

        /* renamed from: ǃ */
        private final int f6938;

        public final int getValue() {
            return this.f6938;
        }

        static {
            Covode.recordClassIndex(2518);
        }

        private EmailsCryptType(int i) {
            this.f6938 = i;
        }
    }

    public static AppsFlyerProperties getInstance() {
        return f6931;
    }

    /* renamed from: ι */
    private boolean m7030() {
        return this.f6935;
    }

    /* access modifiers changed from: protected */
    public boolean isFirstLaunchCalled() {
        return this.f6936;
    }

    /* access modifiers changed from: protected */
    public boolean isOnReceiveCalled() {
        return this.f6933;
    }

    public boolean isEnableLog() {
        return getBoolean("shouldLog", true);
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean("disableLogs", false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean("disableOtherSdk", false);
    }

    static {
        Covode.recordClassIndex(2517);
    }

    private AppsFlyerProperties() {
    }

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled(boolean z) {
        this.f6936 = z;
    }

    /* access modifiers changed from: protected */
    public void setReferrer(String str) {
        set("AF_REFERRER", str);
        this.f6932 = str;
    }

    public synchronized Object getObject(String str) {
        Object obj;
        MethodCollector.m26663i(2009);
        obj = this.f6934.get(str);
        MethodCollector.m26664o(2009);
        return obj;
    }

    public synchronized String getString(String str) {
        String str2;
        MethodCollector.m26663i(1932);
        str2 = (String) this.f6934.get(str);
        MethodCollector.m26664o(1932);
        return str2;
    }

    public synchronized void remove(String str) {
        MethodCollector.m26663i(1688);
        this.f6934.remove(str);
        MethodCollector.m26664o(1688);
    }

    public synchronized void setCustomData(String str) {
        MethodCollector.m26663i(1926);
        this.f6934.put("additionalCustomData", str);
        MethodCollector.m26664o(1926);
    }

    public synchronized void setUserEmails(String str) {
        MethodCollector.m26663i(1931);
        this.f6934.put("userEmails", str);
        MethodCollector.m26664o(1931);
    }

    public String getReferrer(Context context) {
        String str = this.f6932;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return AppsFlyerLibCore.getSharedPreferences(context).getString("referrer", null);
    }

    public synchronized void saveProperties(SharedPreferences sharedPreferences) {
        MethodCollector.m26663i(2158);
        sharedPreferences.edit().putString("savedProperties", new JSONObject(this.f6934).toString()).apply();
        MethodCollector.m26664o(2158);
    }

    public synchronized void loadProperties(Context context) {
        MethodCollector.m26663i(2175);
        if (m7030()) {
            MethodCollector.m26664o(2175);
            return;
        }
        String string = AppsFlyerLibCore.getSharedPreferences(context).getString("savedProperties", null);
        if (string != null) {
            AFLogger.afDebugLog("Loading properties..");
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.f6934.get(next) == null) {
                        this.f6934.put(next, jSONObject.getString(next));
                    }
                }
                this.f6935 = true;
            } catch (JSONException e) {
                AFLogger.afErrorLog("Failed loading properties", e);
            }
            AFLogger.afDebugLog(new StringBuilder("Done loading properties: ").append(this.f6935).toString());
        }
        MethodCollector.m26664o(2175);
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        if (string == null) {
            return z;
        }
        return Boolean.valueOf(string).booleanValue();
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        if (string == null) {
            return i;
        }
        return Integer.valueOf(string).intValue();
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        if (string == null) {
            return j;
        }
        return Long.valueOf(string).longValue();
    }

    public synchronized void set(String str, int i) {
        MethodCollector.m26663i(1723);
        this.f6934.put(str, Integer.toString(i));
        MethodCollector.m26664o(1723);
    }

    public synchronized void set(String str, long j) {
        MethodCollector.m26663i(1804);
        this.f6934.put(str, Long.toString(j));
        MethodCollector.m26664o(1804);
    }

    public synchronized void set(String str, String str2) {
        MethodCollector.m26663i(1691);
        this.f6934.put(str, str2);
        MethodCollector.m26664o(1691);
    }

    public synchronized void set(String str, boolean z) {
        MethodCollector.m26663i(1873);
        this.f6934.put(str, Boolean.toString(z));
        MethodCollector.m26664o(1873);
    }

    public synchronized void set(String str, String[] strArr) {
        MethodCollector.m26663i(1693);
        this.f6934.put(str, strArr);
        MethodCollector.m26664o(1693);
    }
}
