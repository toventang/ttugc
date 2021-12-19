package com.bytedance.crash.p924b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AbstractC13871f;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.crash.util.C14044b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.c */
public final class C13826c {

    /* renamed from: a */
    public static String f33626a;

    /* renamed from: b */
    static boolean f33627b;

    /* renamed from: c */
    private static long f33628c = -1;

    /* renamed from: d */
    private static FileObserver f33629d;

    /* renamed from: e */
    private static ActivityManager.ProcessErrorStateInfo f33630e;

    static {
        Covode.recordClassIndex(15883);
    }

    /* renamed from: a */
    public static JSONObject m24960a() {
        try {
            return m24961a(C14042ab.m25491a(Looper.getMainLooper().getThread().getStackTrace()));
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m24961a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", str);
            return jSONObject;
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m24962a(final String str, final AbstractC13871f fVar) {
        FileObserver fileObserver = f33629d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserverC138271 r0 = new FileObserver(str) {
            /* class com.bytedance.crash.p924b.C13826c.FileObserverC138271 */

            static {
                Covode.recordClassIndex(15884);
            }

            public final void onEvent(int i, String str) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        C13826c.f33626a = fVar.mo22355a(str, str);
                    } catch (Throwable th) {
                        C13849d.m25014a("NPTH_CATCH", th);
                    }
                }
            }
        };
        f33629d = r0;
        r0.startWatching();
    }

    /* renamed from: a */
    static String m24959a(Context context, int[] iArr) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo;
        boolean z;
        if (SystemClock.uptimeMillis() - f33628c < 5000) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) C14044b.m25510a(context, "activity");
            if (activityManager != null) {
                Process.myPid();
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        processErrorStateInfo = it.next();
                        if (processErrorStateInfo.condition == 2) {
                            break;
                        }
                    }
                }
            }
            processErrorStateInfo = null;
            if (processErrorStateInfo != null && (Process.myPid() == processErrorStateInfo.pid || (iArr != null && processErrorStateInfo.processName.contains(context.getPackageName())))) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo2 = f33630e;
                if (processErrorStateInfo2 != null) {
                    if (!String.valueOf(processErrorStateInfo2.condition).equals(String.valueOf(processErrorStateInfo.condition)) || !String.valueOf(processErrorStateInfo2.processName).equals(String.valueOf(processErrorStateInfo.processName)) || !String.valueOf(processErrorStateInfo2.pid).equals(String.valueOf(processErrorStateInfo.pid)) || !String.valueOf(processErrorStateInfo2.uid).equals(String.valueOf(processErrorStateInfo.uid)) || !String.valueOf(processErrorStateInfo2.tag).equals(String.valueOf(processErrorStateInfo.tag)) || !String.valueOf(processErrorStateInfo2.shortMsg).equals(String.valueOf(processErrorStateInfo.shortMsg)) || !String.valueOf(processErrorStateInfo2.longMsg).equals(String.valueOf(processErrorStateInfo.longMsg))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        f33628c = SystemClock.uptimeMillis();
                        return null;
                    }
                }
                f33630e = processErrorStateInfo;
                f33626a = null;
                f33628c = SystemClock.uptimeMillis();
                f33627b = false;
                if (iArr != null) {
                    iArr[0] = processErrorStateInfo.pid;
                }
                return "|------------- processErrorStateInfo--------------|\ncondition: " + processErrorStateInfo.condition + "\nprocessName: " + processErrorStateInfo.processName + "\npid: " + processErrorStateInfo.pid + "\nuid: " + processErrorStateInfo.uid + "\ntag: " + processErrorStateInfo.tag + "\nshortMsg : " + processErrorStateInfo.shortMsg + "\nlongMsg : " + processErrorStateInfo.longMsg + "\n-----------------------end----------------------------";
            }
        } catch (Throwable unused) {
        }
        String str = f33626a;
        if (str == null) {
            return null;
        }
        f33627b = true;
        f33626a = null;
        f33628c = SystemClock.uptimeMillis();
        return str;
    }
}
