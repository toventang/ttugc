package com.p2082ss.android.ttve.monitor;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.vesdk.C85315al;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.h */
public final class C30695h {

    /* renamed from: a */
    public static int f73417a;

    /* renamed from: b */
    public static int f73418b = 1;

    /* renamed from: c */
    public static WeakReference<IMonitor> f73419c;

    /* renamed from: d */
    static boolean f73420d = true;

    /* renamed from: e */
    private static String f73421e = "";

    /* renamed from: a */
    public static boolean m63069a(String str, String str2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Long.valueOf(j));
        return m63070a(str, str2, hashMap);
    }

    /* renamed from: a */
    public static boolean m63068a(String str, String str2, float f) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Float.valueOf(f));
        return m63070a(str, str2, hashMap);
    }

    /* renamed from: a */
    private static boolean m63072a(WeakReference<IMonitor> weakReference, String str, Map map) {
        if (weakReference == null || weakReference.get() == null) {
            C85315al.m146642d("TEMonitor", "monitorEventToBusiness business monitor invalid");
            return false;
        } else if (TextUtils.isEmpty(str) || map == null) {
            C85315al.m146642d("TEMonitor", "monitorEventToBusiness param invalid");
            return false;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                m63067a(map, jSONObject);
                return m63073a(weakReference, str, jSONObject);
            } catch (JSONException e) {
                C85315al.m146642d("TEMonitor", "monitorEventToBusiness json err: ".concat(String.valueOf(e)));
                return false;
            }
        }
    }

    /* renamed from: a */
    static boolean m63073a(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        if (weakReference == null || weakReference.get() == null) {
            C85315al.m146642d("TEMonitor", "monitorEventJsonToBusiness business monitor invalid");
            return false;
        } else if (TextUtils.isEmpty(str) || jSONObject == null) {
            C85315al.m146642d("TEMonitor", "monitorEventJsonToBusiness param invalid");
            return false;
        } else {
            try {
                weakReference.get().monitorLog(str, jSONObject);
                return true;
            } catch (Exception e) {
                C85315al.m146642d("TEMonitor", "Something happened when monitor log: ".concat(String.valueOf(e)));
                return true;
            }
        }
    }

    /* renamed from: a */
    private static boolean m63071a(WeakReference<IMonitor> weakReference, String str, String str2, Map map) {
        if (!f73420d) {
            return m63072a(weakReference, str2, map);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
            if (str2.equals("iesve_veeditor_record_finish") || str2.equals("iesve_veeditor_composition_finish") || str2.equals("iesve_veeditor_edit") || str2.equals("iesve_veeditor_cut") || str2.equals("iesve_veeditor_frame_report")) {
                m63066a(str2, map, jSONObject);
            } else {
                m63067a(map, jSONObject);
            }
            m63074b(weakReference, str, jSONObject);
            return true;
        } catch (JSONException unused) {
            C85315al.m146639b("TEMonitor", "No monitor callback, skip");
            return false;
        }
    }

    /* renamed from: a */
    public static void m63067a(Map map, JSONObject jSONObject) {
        for (String str : map.keySet()) {
            str.startsWith("iesve_");
            int a = C30698j.m63081a(str);
            if (a == 1) {
                try {
                    jSONObject.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                } catch (Exception unused) {
                    C85315al.m146642d("TEMonitor", "Parse int error:" + map.get(str));
                }
            } else if (a == 2) {
                try {
                    jSONObject.put(str, (double) Float.parseFloat(String.valueOf(map.get(str))));
                } catch (Exception unused2) {
                    C85315al.m146642d("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str, map.get(str));
            }
        }
    }

    static {
        Covode.recordClassIndex(37265);
    }

    /* renamed from: a */
    private static int m63059a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("completed")) {
                return jSONObject.getInt("completed");
            }
            return 0;
        } catch (JSONException e) {
            C85315al.m146642d("TEMonitor", "get complete filed error!");
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static void m63060a(int i) {
        if (i == 0) {
            m63062a(0, "te_record_err_code", 0L);
        } else if (i == 1) {
            m63062a(1, "te_edit_err_code", 0L);
            m63062a(1, "te_composition_err_code", 0L);
        }
    }

    /* renamed from: a */
    public static void m63064a(String str, double d) {
        MethodCollector.m26663i(2802);
        if (TextUtils.isEmpty(str)) {
            C85315al.m146641c("TEMonitor", "perfDouble: key is null");
            MethodCollector.m26664o(2802);
            return;
        }
        TEMonitorInvoker.nativePerfDouble(str, d);
        MethodCollector.m26664o(2802);
    }

    /* renamed from: a */
    public static void m63065a(String str, long j) {
        MethodCollector.m26663i(2799);
        if (TextUtils.isEmpty(str)) {
            C85315al.m146641c("TEMonitor", "perfLong: key is null");
            MethodCollector.m26664o(2799);
            return;
        }
        TEMonitorInvoker.nativePerfLong(str, j);
        MethodCollector.m26664o(2799);
    }

    /* renamed from: a */
    public static boolean m63070a(String str, String str2, Map map) {
        return m63071a(f73419c, str, str2, map);
    }

    /* renamed from: a */
    public static void m63061a(int i, String str, double d) {
        MethodCollector.m26663i(2807);
        if (TextUtils.isEmpty(str)) {
            C85315al.m146641c("TEMonitor", "perfDouble: key is null");
            MethodCollector.m26664o(2807);
            return;
        }
        TEMonitorInvoker.nativePerfDouble(i, str, d);
        MethodCollector.m26664o(2807);
    }

    /* renamed from: b */
    static void m63074b(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        int i;
        String str2 = "sdk_video_edit_compose";
        if (jSONObject != null) {
            i = m63059a(jSONObject);
            try {
                if (jSONObject.has("service")) {
                    str2 = jSONObject.getString("service");
                }
                if (str2.equals("iesve_veeditor_record_finish") || str2.equals("iesve_veeditor_composition_finish")) {
                    if ("".equals(f73421e)) {
                        f73421e = C30689e.m63049a("device_id") + "_" + System.currentTimeMillis();
                    }
                    jSONObject.put("te_record_compose_vid", f73421e);
                }
                if (str2.equals("iesve_veeditor_composition_finish")) {
                    f73421e = "";
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            i = 0;
        }
        C30689e.m63053a(str2, i, jSONObject);
        if (weakReference != null && weakReference.get() != null) {
            try {
                weakReference.get().monitorLog(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m63062a(int i, String str, long j) {
        MethodCollector.m26663i(2805);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(2805);
            return;
        }
        TEMonitorInvoker.nativePerfLong(i, str, j);
        MethodCollector.m26664o(2805);
    }

    /* renamed from: a */
    public static void m63063a(int i, String str, String str2) {
        MethodCollector.m26663i(2810);
        if (TextUtils.isEmpty(str)) {
            C85315al.m146641c("TEMonitor", "perfString: key is null");
            MethodCollector.m26664o(2810);
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        TEMonitorInvoker.nativePerfString(i, str, str2);
        MethodCollector.m26664o(2810);
    }

    /* renamed from: a */
    private static void m63066a(String str, Map map, JSONObject jSONObject) {
        int i;
        for (String str2 : map.keySet()) {
            if (str.equals("iesve_veeditor_record_finish") || str.equals("iesve_veeditor_composition_finish") || str.equals("iesve_veeditor_edit") || str.equals("iesve_veeditor_cut")) {
                i = C30698j.m63081a(str2);
            } else {
                i = C30698j.m63081a(str2);
            }
            if (i == 1) {
                try {
                    jSONObject.put(str2, Integer.parseInt(String.valueOf(map.get(str2))));
                } catch (Exception unused) {
                    C85315al.m146642d("TEMonitor", "Parse int error:" + map.get(str2));
                }
            } else if (i == 2) {
                try {
                    jSONObject.put(str2, (double) Float.parseFloat(String.valueOf(map.get(str2))));
                } catch (Exception unused2) {
                    C85315al.m146642d("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str2, map.get(str2));
            }
        }
    }
}
