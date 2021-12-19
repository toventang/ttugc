package com.bytedance.apm.agent.tracing;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AutoLaunchTraceHelper {
    private static long sAttachBaseContextEndTime;
    private static long sAttachBaseContextStartTime;
    private static long sConstructorEndTime;
    private static long sConstructorStartTime;
    private static boolean sIsValid;
    private static long sLauncherActivityCreateEndTime;
    private static long sLauncherActivityCreateStartTime;
    public static String sLauncherActivityName;
    private static long sLauncherActivityOnWindowFocusChangedTime;
    private static long sLauncherActivityResumeEndTime;
    private static long sLauncherActivityResumeStartTime;
    private static long sLauncherActivityStartEndTime;
    private static long sLauncherActivityStartStartTime;
    private static long sMaxValidTimeMs = 15000;
    private static long sOnCreateEndTime;
    private static long sOnCreateStartTime;

    static {
        Covode.recordClassIndex(14073);
    }

    public static void launcherActivityOnCreateEnd() {
        if (sLauncherActivityCreateEndTime == 0 && sIsValid) {
            sLauncherActivityCreateEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnResumeEnd() {
        if (sLauncherActivityResumeEndTime == 0 && sIsValid) {
            sLauncherActivityResumeEndTime = System.currentTimeMillis();
        }
    }

    public static void reportStats() {
        try {
            if (C12397c.f29939i != -1) {
                long j = sLauncherActivityOnWindowFocusChangedTime - sConstructorStartTime;
                if (j <= 0) {
                    return;
                }
                if (j <= sMaxValidTimeMs) {
                    JSONArray assemblySpan = assemblySpan();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(StringSet.name, "launch_stats");
                    jSONObject.put("start", sConstructorStartTime);
                    jSONObject.put("end", sLauncherActivityOnWindowFocusChangedTime);
                    jSONObject.put("spans", assemblySpan);
                    jSONObject.put("collect_from", 1);
                    jSONObject.put("page_name", sLauncherActivityName);
                    jSONObject.put("launch_mode", C12397c.f29939i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trace", jSONObject);
                    C12401a.m22303b().mo20179a(new C12412f("start_trace", "", null, null, jSONObject2, (byte) 0));
                }
            }
        } catch (JSONException unused) {
        }
    }

    public static JSONArray assemblySpan() {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module_name", "base");
        jSONObject.put("span_name", "app_constructor");
        jSONObject.put("start", sConstructorStartTime);
        jSONObject.put("end", sConstructorEndTime);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("module_name", "base");
        jSONObject2.put("span_name", "app_attachBaseContext");
        jSONObject2.put("start", sAttachBaseContextStartTime);
        jSONObject2.put("end", sAttachBaseContextEndTime);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("module_name", "base");
        jSONObject3.put("span_name", "app_onCreate");
        jSONObject3.put("start", sOnCreateStartTime);
        jSONObject3.put("end", sOnCreateEndTime);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("module_name", "base");
        jSONObject4.put("span_name", "activity_onCreate");
        jSONObject4.put("start", sLauncherActivityCreateStartTime);
        jSONObject4.put("end", sLauncherActivityCreateEndTime);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("module_name", "base");
        jSONObject5.put("span_name", "activity_onResume");
        jSONObject5.put("start", sLauncherActivityResumeStartTime);
        jSONObject5.put("end", sLauncherActivityResumeEndTime);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("module_name", "base");
        jSONObject6.put("span_name", "activity_onStart");
        jSONObject6.put("start", sLauncherActivityStartStartTime);
        jSONObject6.put("end", sLauncherActivityStartEndTime);
        if (sLauncherActivityOnWindowFocusChangedTime > 0) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("module_name", "base");
            jSONObject7.put("span_name", "activity_onWindowFocusChanged");
            jSONObject7.put("start", sLauncherActivityOnWindowFocusChangedTime);
            jSONArray.put(jSONObject7);
        }
        jSONArray.put(jSONObject);
        jSONArray.put(jSONObject2);
        jSONArray.put(jSONObject3);
        jSONArray.put(jSONObject4);
        jSONArray.put(jSONObject5);
        jSONArray.put(jSONObject6);
        return jSONArray;
    }

    public static void setMaxValidTimeMs(long j) {
        sMaxValidTimeMs = j;
    }

    public static void launcherActivityOnCreateStart(String str) {
        if (sLauncherActivityCreateStartTime == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            sLauncherActivityCreateStartTime = currentTimeMillis;
            if (currentTimeMillis - sOnCreateEndTime < 800) {
                sIsValid = true;
                sLauncherActivityName = str;
            }
        }
    }

    public static void launcherActivityOnResumeStart(String str) {
        if (sLauncherActivityResumeStartTime == 0 && sIsValid) {
            sLauncherActivityResumeStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnStartEnd(String str) {
        if (sLauncherActivityStartEndTime == 0 && sIsValid) {
            sLauncherActivityStartEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnStartStart(String str) {
        if (sLauncherActivityStartStartTime == 0 && sIsValid) {
            sLauncherActivityStartStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnWindowFocusChangedStart(String str) {
        if (sLauncherActivityOnWindowFocusChangedTime == 0 && sOnCreateStartTime > 0 && sIsValid) {
            sLauncherActivityOnWindowFocusChangedTime = System.currentTimeMillis();
            sLauncherActivityName = str;
            sIsValid = false;
        }
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper.RunnableC122831 */

            static {
                Covode.recordClassIndex(14074);
            }

            public final void run() {
                AutoLaunchTraceHelper.reportStats();
            }
        });
    }

    public static void assignAppTime(long j, long j2, long j3, long j4, long j5, long j6) {
        sConstructorStartTime = j;
        sConstructorEndTime = j2;
        sAttachBaseContextStartTime = j3;
        sAttachBaseContextEndTime = j4;
        sOnCreateStartTime = j5;
        sOnCreateEndTime = j6;
        C12397c.m22284b(j);
    }
}
