package com.bytedance.crash.nativecrash;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AbstractC13875g;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.p923a.C13815a;
import com.bytedance.crash.p924b.C13840i;
import com.bytedance.crash.p927e.C13853a;
import com.bytedance.crash.p932j.C13892b;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14006f;
import com.bytedance.crash.runtime.p933a.AbstractC13983b;
import com.bytedance.crash.runtime.p933a.C13989e;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14054h;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.C14075v;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public class NativeCrashCollector {

    /* renamed from: a */
    public static boolean f33972a;

    /* renamed from: b */
    public static AbstractC13875g f33973b;

    static {
        Covode.recordClassIndex(16006);
    }

    /* renamed from: a */
    private static void m25242a(String str) {
        for (ICrashCallback iCrashCallback : C13934n.f33960f.f34131a.getList(CrashType.NATIVE)) {
            try {
                iCrashCallback.onCrash(CrashType.NATIVE, str, null);
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }
    }

    public static void onNativeCrash(final String str) {
        C13973h hVar;
        C14075v.m25650a("[onNativeCrash] enter");
        File file = new File(C14069r.m25618a(), C13933m.m25229e());
        C14054h.m25544b(C14069r.m25638g(C13933m.f33936a));
        try {
            C13892b.m25129a().mo22374b();
            final File file2 = new File(file, file.getName());
            C13989e.m25320a().mo22511a(CrashType.NATIVE, null, new AbstractC13983b.AbstractC13984a() {
                /* class com.bytedance.crash.nativecrash.NativeCrashCollector.C139451 */

                static {
                    Covode.recordClassIndex(16007);
                }

                @Override // com.bytedance.crash.runtime.p933a.AbstractC13983b.AbstractC13984a
                /* renamed from: b */
                public final C13864b mo22311b(int i, C13864b bVar) {
                    C14056j.m25569a(new File(file2.getAbsolutePath() + '.' + i), bVar.f33757a);
                    if (i == 0) {
                        C13815a.m24932a().mo22258c();
                    }
                    return bVar;
                }

                @Override // com.bytedance.crash.runtime.p933a.AbstractC13983b.AbstractC13984a
                /* renamed from: a */
                public final C13864b mo22310a(int i, C13864b bVar) {
                    String str;
                    String str2;
                    String str3 = "true";
                    int i2 = 0;
                    if (i == 1) {
                        String str4 = str;
                        if (str4 != null && !str4.isEmpty()) {
                            String str5 = str;
                            if (!TextUtils.isEmpty(str5)) {
                                if ("main".equalsIgnoreCase(str5)) {
                                    str2 = C14042ab.m25491a(Looper.getMainLooper().getThread().getStackTrace());
                                } else {
                                    ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[(activeCount + (activeCount / 2))];
                                    int enumerate = threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i2 >= enumerate) {
                                            break;
                                        }
                                        String name = threadArr[i2].getName();
                                        if (TextUtils.isEmpty(name) || (!name.equals(str5) && !name.startsWith(str5) && !name.endsWith(str5))) {
                                            i2++;
                                        }
                                    }
                                    str2 = C14042ab.m25491a(threadArr[i2].getStackTrace());
                                }
                                bVar.mo22346a("java_data", (Object) str2);
                            }
                            str2 = "";
                            bVar.mo22346a("java_data", (Object) str2);
                        }
                        if (!C13853a.f33722d) {
                            str3 = "false";
                        }
                        bVar.mo22340a("crash_after_crash", str3);
                        if (NativeCrashCollector.f33973b != null) {
                            try {
                                str = NativeCrashCollector.f33973b.mo22356a();
                            } catch (Throwable unused) {
                                str = th.getClass().getName() + ":" + th.getMessage();
                            }
                            bVar.mo22346a("game_script_stack", (Object) str);
                        }
                        C14006f.m25387a(C14069r.m25638g(C13933m.f33936a), CrashType.NATIVE);
                    } else if (i == 2) {
                        JSONArray b = C13840i.m25003b();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        JSONObject e = C13840i.m25006e();
                        JSONArray a = C13840i.m25000a(uptimeMillis);
                        bVar.mo22346a("history_message", (Object) b);
                        bVar.mo22346a("current_message", e);
                        bVar.mo22346a("pending_messages", (Object) a);
                        bVar.mo22340a("disable_looper_monitor", String.valueOf(C13994b.m25337c()));
                        bVar.mo22346a("alive_pids", (Object) C13964g.m25294f());
                    } else if (i != 3) {
                        if (i == 4) {
                            C14044b.m25512a(C13933m.f33936a, bVar.f33757a);
                        }
                    } else if (C13994b.m25329a("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1) {
                        bVar.mo22346a("all_thread_stacks", C14042ab.m25501b(str));
                        bVar.mo22340a("has_all_thread_stack", str3);
                    }
                    return bVar;
                }
            }, true);
            if (f33972a) {
                hVar = new C13973h(file);
                hVar.mo22441a(file);
                m25242a(hVar.mo22440a());
                return;
            }
            m25242a("");
        } catch (Throwable th) {
            if (f33972a) {
                C13973h hVar2 = new C13973h(file);
                hVar2.mo22441a(file);
                m25242a(hVar2.mo22440a());
            } else {
                m25242a("");
            }
            throw th;
        }
    }
}
