package com.benchmark.presenter;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.benchmark.p119c.C2436b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SensorInfoBridge {
    static {
        Covode.recordClassIndex(2868);
    }

    /* renamed from: com_benchmark_presenter_SensorInfoBridge_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m7371x9fca721(String str, String str2) {
        return 0;
    }

    private String keyToString(int i) {
        if (i == 12) {
            return "relative_humidity";
        }
        if (i == 13) {
            return "temperature";
        }
        if (i == 18) {
            return "step_detector";
        }
        if (i == 19) {
            return "step_counter";
        }
        switch (i) {
            case 1:
                return "accelerometer";
            case 2:
                return "magnetic_field";
            case 3:
                return "orientation";
            case 4:
                return "gyroscope";
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return "light";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return "pressure";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return "temperature";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return "proximity";
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return "gravity";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return "linear_acceleration";
            default:
                return "other";
        }
    }

    public String getSensorInfo() {
        SensorManager sensorManager;
        Context context = C2436b.f7319m.f7320a;
        if (context == null || (sensorManager = (SensorManager) m7370x126e0c40(context, "sensor")) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Sensor sensor : sensorManager.getSensorList(-1)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(StringSet.name, sensor.getName());
                jSONObject2.put("maxRange", (double) sensor.getMaximumRange());
                jSONObject2.put("minDelay", sensor.getMinDelay());
                jSONObject2.put("power", (double) sensor.getPower());
                jSONObject2.put("resolution", (double) sensor.getResolution());
                jSONObject2.put(StringSet.type, sensor.getType());
                jSONObject2.put("vendor", sensor.getVendor());
                jSONObject2.put("version", sensor.getVersion());
                String valueOf = String.valueOf(sensor.getType());
                if (!jSONObject.has(valueOf)) {
                    jSONObject.put(valueOf, new JSONArray());
                }
                jSONObject.getJSONArray(valueOf).put(jSONObject2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m7371x9fca721("SensorInfoBridge", "getSensorInfo: " + jSONObject.toString());
        return jSONObject.toString();
    }

    /* renamed from: com_benchmark_presenter_SensorInfoBridge_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m7370x126e0c40(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6784);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(6784);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
