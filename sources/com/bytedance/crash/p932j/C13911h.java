package com.bytedance.crash.p932j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C13865c;
import com.bytedance.crash.entity.C13866d;
import com.bytedance.crash.nativecrash.C13973h;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14007g;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.runtime.p933a.C13989e;
import com.bytedance.crash.runtime.p934b.C13996a;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14075v;
import com.bytedance.crash.util.NativeTools;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.h */
public final class C13911h {

    /* renamed from: a */
    private static int f33888a;

    static {
        Covode.recordClassIndex(15971);
    }

    /* renamed from: a */
    public static String m25180a(StackTraceElement[] stackTraceElementArr, int i) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < stackTraceElementArr.length) {
            C14042ab.m25492a(stackTraceElementArr[i], sb);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m25186a(Map<String, String> map, C13866d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                dVar.mo22346a("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m25183a(Throwable th, String str, boolean z) {
        m25184a(th, str, z, "core_exception_monitor");
    }

    /* renamed from: a */
    private static void m25184a(Throwable th, String str, boolean z, String str2) {
        m25185a(th, str, z, null, str2);
    }

    /* renamed from: a */
    public static void m25185a(Throwable th, String str, boolean z, Map<String, String> map, String str2) {
        try {
            m25182a((Object) null, th, (StackTraceElement[]) null, 0, str, z, map, Thread.currentThread(), "EnsureNotReachHere", str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m25182a(Object obj, Throwable th, StackTraceElement[] stackTraceElementArr, int i, String str, boolean z, Map<String, String> map, Thread thread, String str2, String str3) {
        m25181a(obj, th, stackTraceElementArr, i, str, z, map, thread.getName(), str2, str3);
    }

    /* renamed from: a */
    private static void m25181a(final Object obj, final Throwable th, final StackTraceElement[] stackTraceElementArr, final int i, final String str, final boolean z, final Map<String, String> map, final String str2, final String str3, String str4) {
        final String str5 = str4;
        if (TextUtils.isEmpty(str5)) {
            str5 = "core_exception_monitor";
        }
        if (C13934n.f33955a || f33888a < 100) {
            f33888a++;
            if (C13996a.m25352a(C13865c.m25083c(obj)) && !C13994b.m25334a(obj, str5)) {
                C14075v.m25650a("exception has been discard due to not sampled: ".concat(String.valueOf(str5)));
            } else if (!C13934n.f33955a || C14007g.m25388a().mo22528d()) {
                C14019n.m25421b().mo22551a(new Runnable() {
                    /* class com.bytedance.crash.p932j.C13911h.RunnableC139121 */

                    /* renamed from: a */
                    final /* synthetic */ String f33889a = null;

                    /* renamed from: b */
                    final /* synthetic */ String f33890b = null;

                    static {
                        Covode.recordClassIndex(15972);
                    }

                    public final void run() {
                        C13866d dVar;
                        String a;
                        StackTraceElement[] stackTraceElementArr;
                        if (!C13934n.f33955a) {
                            C14019n.m25421b().mo22552a(this, 500);
                            return;
                        }
                        try {
                            String str = this.f33889a;
                            if (str != null) {
                                String str2 = this.f33890b;
                                C13866d a2 = C13866d.m25085a(new StackTraceElement("Native", "Native", "Native.java", -1), str, str, str2, true, "EnsureNotReachHere", str5);
                                a2.mo22346a("event_type", (Object) "native_exception");
                                a2.mo22346a("java_data", (Object) str2);
                                JSONArray jSONArray = new JSONArray();
                                HashSet hashSet = new HashSet();
                                for (String str3 : str.split("\n")) {
                                    String a3 = C13973h.m25296a(str3);
                                    if (a3 != null) {
                                        NativeTools.m25458a();
                                        String str4 = NativeTools.f34207b.get(a3);
                                        if (TextUtils.isEmpty(str4)) {
                                            NativeTools.m25458a();
                                            str4 = NativeTools.m25460f(NativeTools.m25461g(a3));
                                            NativeTools.f34207b.put(a3, str4);
                                        }
                                        if (!TextUtils.isEmpty(str4) && !hashSet.contains(a3)) {
                                            hashSet.add(a3);
                                            JSONObject jSONObject = new JSONObject();
                                            C14062n.m25593a(jSONObject, "lib_name", a3);
                                            C14062n.m25593a(jSONObject, "lib_uuid", str4);
                                            jSONArray.put(jSONObject);
                                        }
                                    }
                                }
                                a2.mo22346a("crash_lib_uuid", (Object) jSONArray);
                                dVar = a2;
                            } else {
                                Throwable th = th;
                                if (th != null || ((stackTraceElementArr = stackTraceElementArr) != null && stackTraceElementArr.length > i + 1)) {
                                    StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
                                    if (stackTraceElementArr2 == null) {
                                        stackTraceElementArr2 = th.getStackTrace();
                                    }
                                    int i = i;
                                    StackTraceElement stackTraceElement = stackTraceElementArr2[i];
                                    if (stackTraceElement != null) {
                                        Throwable th2 = th;
                                        if (th2 != null) {
                                            a = C14042ab.m25488a(th2);
                                        } else {
                                            a = C13911h.m25180a(stackTraceElementArr2, i);
                                        }
                                        if (!TextUtils.isEmpty(a)) {
                                            C13866d a4 = C13866d.m25085a(stackTraceElement, a, str, str2, z, str3, str5);
                                            dVar = a4;
                                            if (obj != null) {
                                                a4.mo22346a("exception_line_num", (Object) null);
                                                dVar = a4;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            C13911h.m25186a(map, dVar);
                            C13989e.m25320a().mo22510a(CrashType.ENSURE, dVar);
                            C13913i.m25189a(obj, dVar);
                            C14075v.m25651b("[reportException] " + str);
                        } catch (Throwable unused) {
                            C13933m.f33942g.isDebugMode();
                        }
                    }
                });
            } else {
                C13933m.f33942g.isDebugMode();
            }
        } else {
            C14075v.m25650a("exception has been discard due to exceed limit before Npth.init: ".concat(String.valueOf(str5)));
        }
    }
}
