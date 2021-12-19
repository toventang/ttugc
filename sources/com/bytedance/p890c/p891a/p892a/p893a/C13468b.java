package com.bytedance.p890c.p891a.p892a.p893a;

import android.text.TextUtils;
import com.bytedance.apm.p789q.C12598r;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22708a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.c.a.a.a.b */
public final class C13468b {
    static {
        Covode.recordClassIndex(15476);
    }

    /* renamed from: a */
    public static void m24209a(String str) {
        if (C22708a.f53665a != null) {
            C22708a.m42800a(str);
        } else {
            m24216b(str);
        }
    }

    /* renamed from: b */
    private static void m24216b(String str) {
        m24214a(Thread.currentThread().getStackTrace(), str);
    }

    /* renamed from: a */
    public static void m24210a(Throwable th) {
        if (C22708a.f53665a != null) {
            C22708a.m42802a(th);
        } else {
            m24217b(th);
        }
    }

    /* renamed from: b */
    private static void m24217b(Throwable th) {
        if (m24219c(th)) {
            m24215a(Thread.currentThread().getStackTrace(), th, null, true, null);
        }
    }

    /* renamed from: c */
    private static boolean m24219c(Throwable th) {
        C13469c.m24220a();
        if (!C13469c.m24221b() || !C13471d.m24226a(th)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m24211a(Throwable th, String str) {
        if (C22708a.f53665a != null) {
            C22708a.m42803a(th, str);
        } else {
            m24218b(th, str);
        }
    }

    /* renamed from: b */
    private static void m24218b(Throwable th, String str) {
        if (m24219c(th)) {
            m24215a(Thread.currentThread().getStackTrace(), th, str, true, null);
        }
    }

    /* renamed from: a */
    private static void m24213a(Map<String, String> map, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject2.put(str, map.get(str));
                }
                jSONObject.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m24214a(StackTraceElement[] stackTraceElementArr, String str) {
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > 4) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[3];
                    if (stackTraceElement != null) {
                        String className = stackTraceElement.getClassName();
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        String a = C12598r.m22722a(stackTraceElementArr);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("event_type", "exception");
                        jSONObject.put("timestamp", System.currentTimeMillis());
                        jSONObject.put("class_ref", className);
                        jSONObject.put("method", methodName);
                        jSONObject.put("line_num", lineNumber);
                        jSONObject.put("stack", a);
                        jSONObject.put("exception_type", 1);
                        jSONObject.put("is_core", 1);
                        if (!TextUtils.isEmpty(str)) {
                            if (str.length() > 1024) {
                                jSONObject.put("message", str.substring(0, 1024));
                            } else {
                                jSONObject.put("message", str);
                            }
                        }
                        m24213a((Map<String, String>) null, jSONObject);
                        C13469c.m24220a().mo21750a("core_exception_monitor", jSONObject.toString(), str, true);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m24212a(Throwable th, String str, Map<String, String> map) {
        if (C22708a.f53665a != null) {
            if (C22708a.f53665a != null) {
                C22708a.f53665a.ensureNotReachHere(th, str, map);
            }
        } else if (m24219c(th)) {
            m24215a(Thread.currentThread().getStackTrace(), th, str, false, map);
        }
    }

    /* renamed from: a */
    private static void m24215a(StackTraceElement[] stackTraceElementArr, Throwable th, String str, boolean z, Map<String, String> map) {
        if (th != null) {
            try {
                StackTraceElement stackTraceElement = stackTraceElementArr[3];
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                String a = C12598r.m22720a(th);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", "exception");
                jSONObject.put("timestamp", System.currentTimeMillis());
                jSONObject.put("class_ref", className);
                jSONObject.put("method", methodName);
                jSONObject.put("line_num", lineNumber);
                jSONObject.put("stack", a);
                jSONObject.put("exception_type", 0);
                if (z) {
                    jSONObject.put("is_core", 1);
                } else {
                    jSONObject.put("is_core", 0);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (str.length() > 1024) {
                        jSONObject.put("message", str.substring(0, 1024));
                    } else {
                        jSONObject.put("message", str);
                    }
                }
                m24213a(map, jSONObject);
                C13469c.m24220a().mo21750a("core_exception_monitor", jSONObject.toString(), str, true);
            } catch (Throwable unused) {
            }
        }
    }
}
