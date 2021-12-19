package com.p2082ss.bytertc.base.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.bytertc.base.utils.JsonUtils;
import org.webrtc.ContextUtils;

/* renamed from: com.ss.bytertc.base.data.RtcPreferences */
public class RtcPreferences {
    private static volatile RtcPreferences sInstance;
    private final SharedPreferences mSharedPreferences;

    static {
        Covode.recordClassIndex(100850);
    }

    private static RtcPreferences getInstance() {
        return instance(ContextUtils.getApplicationContext());
    }

    private RtcPreferences(Context context) {
        this.mSharedPreferences = C34822d.m71158a(context, "rtc_preference", 0);
    }

    public void remove(String str) {
        if (str != null) {
            SharedPreferences.Editor edit = this.mSharedPreferences.edit();
            edit.remove(str);
            edit.apply();
        }
    }

    public static RtcPreferences instance(Context context) {
        MethodCollector.m26663i(1793);
        if (sInstance == null) {
            synchronized (RtcPreferences.class) {
                if (context != null) {
                    try {
                        sInstance = new RtcPreferences(context);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1793);
                        throw th;
                    }
                } else {
                    RuntimeException runtimeException = new RuntimeException("unable to init RtcPreferences without context");
                    MethodCollector.m26664o(1793);
                    throw runtimeException;
                }
            }
        }
        RtcPreferences rtcPreferences = sInstance;
        MethodCollector.m26664o(1793);
        return rtcPreferences;
    }

    public int getInt(String str, int i) {
        return this.mSharedPreferences.getInt(str, i);
    }

    public String getString(String str, String str2) {
        return this.mSharedPreferences.getString(str, str2);
    }

    public void put(String str, Object obj) {
        putString(str, JsonUtils.toJson(obj));
    }

    public <T> T get(String str, Class<T> cls) {
        String string = getString(str, null);
        if (string == null) {
            return null;
        }
        return (T) JsonUtils.fromJson(string, cls);
    }

    public void putInt(String str, int i) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public void putString(String str, String str2) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
