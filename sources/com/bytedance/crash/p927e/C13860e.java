package com.bytedance.crash.p927e;

import android.os.Process;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.nativecrash.C13964g;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p924b.C13820a;
import com.bytedance.crash.p924b.C13831f;
import com.bytedance.crash.p924b.C13840i;
import com.bytedance.crash.p929g.C13876a;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14006f;
import com.bytedance.crash.runtime.p933a.AbstractC13983b;
import com.bytedance.crash.runtime.p933a.C13978a;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.NativeTools;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.e.e */
final class C13860e implements AbstractC13983b.AbstractC13984a {

    /* renamed from: a */
    boolean f33739a;

    /* renamed from: b */
    Throwable f33740b;

    /* renamed from: c */
    long f33741c;

    /* renamed from: d */
    String f33742d;

    /* renamed from: e */
    boolean f33743e;

    /* renamed from: f */
    Thread f33744f;

    /* renamed from: g */
    String f33745g;

    /* renamed from: h */
    boolean f33746h;

    /* renamed from: i */
    File f33747i;

    static {
        Covode.recordClassIndex(15917);
    }

    @Override // com.bytedance.crash.runtime.p933a.AbstractC13983b.AbstractC13984a
    /* renamed from: b */
    public final C13864b mo22311b(int i, C13864b bVar) {
        try {
            C14056j.m25569a(new File(this.f33747i, this.f33747i.getName() + "." + i), bVar.f33757a);
        } catch (Throwable unused) {
        }
        return bVar;
    }

    @Override // com.bytedance.crash.runtime.p933a.AbstractC13983b.AbstractC13984a
    /* renamed from: a */
    public final C13864b mo22310a(int i, C13864b bVar) {
        String str;
        String str2;
        String str3;
        List<ICrashCallback> list;
        CrashType crashType;
        CrashType crashType2;
        Object obj;
        JSONArray jSONArray;
        int i2 = 2;
        if (i != 0) {
            String str4 = "true";
            if (i == 1) {
                if (this.f33746h) {
                    bVar.mo22346a("timestamp", Long.valueOf(this.f33741c));
                    bVar.mo22346a("main_process", Boolean.valueOf(C14044b.m25518b(C13933m.f33936a)));
                    bVar.mo22346a("crash_type", CrashType.JAVA);
                }
                Thread thread = this.f33744f;
                if (thread != null) {
                    str2 = thread.getName();
                } else {
                    str2 = "";
                }
                bVar.mo22346a("crash_thread_name", (Object) str2);
                bVar.mo22346a("tid", Integer.valueOf(Process.myTid()));
                if (C13934n.m25237b()) {
                    str3 = str4;
                } else {
                    str3 = "false";
                }
                bVar.mo22340a("crash_after_crash", str3);
                if (!NativeImpl.m25248b()) {
                    str4 = "false";
                }
                bVar.mo22340a("crash_after_native", str4);
                C13853a.m25018a();
                Thread thread2 = this.f33744f;
                Throwable th = this.f33740b;
                if (this.f33746h) {
                    list = C13934n.f33960f.f34131a.getList(CrashType.LAUNCH);
                    crashType = CrashType.LAUNCH;
                } else {
                    list = C13934n.f33960f.f34131a.getList(CrashType.JAVA);
                    crashType = CrashType.JAVA;
                }
                for (ICrashCallback iCrashCallback : list) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        iCrashCallback.onCrash(crashType, C14042ab.m25488a(th), thread2);
                        bVar.mo22350c("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                    } catch (Throwable unused) {
                        C13933m.f33942g.isDebugMode();
                        bVar.mo22350c("callback_err_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                    }
                }
                File g = C14069r.m25638g(C13933m.f33936a);
                if (this.f33746h) {
                    crashType2 = CrashType.LAUNCH;
                } else {
                    crashType2 = CrashType.JAVA;
                }
                C14006f.m25387a(g, crashType2);
            } else if (i == 2) {
                if (this.f33739a) {
                    C14044b.m25512a(C13933m.f33936a, bVar.f33757a);
                }
                if (this.f33746h) {
                    bVar.mo22346a("launch_did", (Object) C13876a.m25101a(C13933m.f33936a));
                }
                JSONArray b = C13840i.m25003b();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                JSONObject e = C13840i.m25006e();
                JSONArray a = C13840i.m25000a(uptimeMillis2);
                bVar.mo22346a("history_message", (Object) b);
                bVar.mo22346a("current_message", e);
                bVar.mo22346a("pending_messages", (Object) a);
                bVar.mo22340a("disable_looper_monitor", String.valueOf(C13994b.m25337c()));
                if (!this.f33739a && C13994b.m25329a("custom_event_settings", "npth_simple_setting", "enable_hprof_all_java_crash") == 1) {
                    bVar.mo22340a("may_have_hprof", str4);
                    C13853a.m25021a(this.f33744f, this.f33740b, this.f33746h, this.f33741c);
                }
                bVar.mo22346a("alive_pids", (Object) C13964g.m25294f());
            } else if (i == 3) {
                File file = new File(C14069r.m25620a(C13933m.f33936a, C13933m.m25229e()), "trace.txt");
                if (!NativeTools.m25462h() || C13994b.m25329a("custom_event_settings", "npth_simple_setting", "enable_anr_dump_for_java_crash") != 1) {
                    obj = C14042ab.m25501b(Thread.currentThread().getName());
                } else {
                    NativeTools.m25458a().mo22577e(file.getAbsolutePath());
                    try {
                        jSONArray = C14056j.m25563a(file.getAbsolutePath());
                    } catch (Throwable unused2) {
                        jSONArray = null;
                    }
                    obj = C13820a.m24941a(jSONArray, (C13831f) null, false).second;
                }
                if (obj != null) {
                    bVar.mo22346a("all_thread_stacks", obj);
                }
            } else if (i != 4) {
                if (i == 5) {
                    bVar.mo22346a("crash_uuid", (Object) this.f33745g);
                }
            } else if (!this.f33739a) {
                C14044b.m25512a(C13933m.f33936a, bVar.f33757a);
            }
        } else {
            if (this.f33746h) {
                str = "stack";
            } else {
                str = "data";
            }
            bVar.mo22346a(str, (Object) C14042ab.m25488a(this.f33740b));
            bVar.mo22346a("isOOM", Boolean.valueOf(this.f33739a));
            if (this.f33746h) {
                bVar.mo22346a("event_type", "start_crash");
            } else {
                bVar.mo22346a("isJava", (Object) 1);
            }
            bVar.mo22346a("crash_time", Long.valueOf(this.f33741c));
            if (C13978a.f34066d != 1) {
                i2 = C13978a.f34066d;
            } else if (!C13978a.f34067e) {
                i2 = 1;
            }
            bVar.mo22346a("launch_mode", Integer.valueOf(i2));
            bVar.mo22346a("launch_time", Long.valueOf(C13978a.f34068f));
            String str5 = this.f33742d;
            if (str5 != null) {
                bVar.mo22346a("crash_md5", (Object) str5);
                bVar.mo22340a("crash_md5", this.f33742d);
                boolean z = this.f33743e;
                if (z) {
                    bVar.mo22340a("has_ignore", String.valueOf(z));
                }
            }
        }
        return bVar;
    }

    public C13860e(boolean z, Throwable th, long j, String str, boolean z2, Thread thread, String str2, File file, boolean z3) {
        this.f33739a = z;
        this.f33744f = thread;
        this.f33740b = th;
        this.f33741c = j;
        this.f33742d = str;
        this.f33743e = z2;
        this.f33745g = str2;
        this.f33747i = file;
        this.f33746h = z3;
    }
}
