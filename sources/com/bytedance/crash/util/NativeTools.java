package com.bytedance.crash.util;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.nativecrash.C13964g;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NativeTools {

    /* renamed from: b */
    public static HashMap<String, String> f34207b = new HashMap<>();

    /* renamed from: c */
    private static NativeTools f34208c;

    /* renamed from: a */
    public volatile boolean f34209a;

    private static native void doSetNpthCatchAddr(long j);

    private static native int nativeAnrDump(String str);

    private static native int nativeAnrMonitorInit();

    private static native int nativeAnrMonitorLoop();

    private static native int nativeCloseFile(int i);

    private static native int nativeDumpCrashInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z);

    private static native int nativeDumpLogcat(String str, String str2);

    private static native int nativeDumpPthreadList(String str, String str2);

    private static native int nativeDumpThrowable(String str, Throwable th);

    private static native int nativeFillNativeHeapSize(NativeHeapSize nativeHeapSize);

    private static native String nativeGetBuildID(String str);

    private static native int nativeGetFDCount();

    private static native String[] nativeGetFdListForAPM();

    private static native int nativeGetMapsSize(String str);

    private static native String nativeGetOOMReason(String str, String str2);

    public static native long nativeGetPathSize(String str, int i);

    private static native int nativeGetResendSigquit();

    private static native long nativeGetSymbolAddress(String str, String str2, int i);

    private static native long nativeGetThreadCpuTimeMills(int i);

    private static native int nativeGetThreadInfoFromTombStone(String str, String str2);

    private static native boolean nativeIs64BitLibrary();

    private static native int nativeLockFile(String str);

    private static native int nativeOpenFile(String str);

    private static native boolean nativePidExists(int i);

    private static native void nativeSetMallocInfoFunctionAddress(long j);

    private static native void nativeSetResendSigquit(int i);

    private static native int nativeTerminateMonitorWait(long j, String str, String str2, String str3, boolean z, boolean z2, boolean z3);

    private static native int nativeToolsInit(int i, String str);

    private static native int nativeUnlockFile(int i);

    private static native int nativeUpdateEspInfoFromTombStone(String str, String str2);

    private static native int nativeWriteFile(int i, String str, int i2);

    private static void onClearExcept(int[] iArr) {
    }

    private static void onStartAllClear() {
        C13964g.m25293e();
    }

    /* renamed from: a */
    public final void mo22562a(boolean z) {
        MethodCollector.m26663i(394);
        if (!this.f34209a) {
            MethodCollector.m26664o(394);
            return;
        }
        try {
            nativeSetResendSigquit(z ? 1 : 0);
            MethodCollector.m26664o(394);
        } catch (Throwable unused) {
            MethodCollector.m26664o(394);
        }
    }

    static {
        Covode.recordClassIndex(16104);
    }

    /* renamed from: h */
    public static boolean m25462h() {
        if (Build.VERSION.SDK_INT < 21 || Header.m25042b()) {
            return false;
        }
        return true;
    }

    private static void onProcessBeWorker() {
        C14044b.m25520c(C13933m.f33936a);
        C13933m.f33942g.isDebugMode();
        C13964g.m25292d();
    }

    /* renamed from: b */
    public final int mo22563b() {
        MethodCollector.m26663i(335);
        if (!this.f34209a) {
            MethodCollector.m26664o(335);
            return -1;
        }
        try {
            int nativeGetFDCount = nativeGetFDCount();
            MethodCollector.m26664o(335);
            return nativeGetFDCount;
        } catch (Throwable unused) {
            MethodCollector.m26664o(335);
            return -1;
        }
    }

    /* renamed from: e */
    public final int mo22575e() {
        MethodCollector.m26663i(383);
        if (!this.f34209a) {
            MethodCollector.m26664o(383);
            return -1;
        }
        try {
            int nativeAnrMonitorInit = nativeAnrMonitorInit();
            MethodCollector.m26664o(383);
            return nativeAnrMonitorInit;
        } catch (Throwable unused) {
            MethodCollector.m26664o(383);
            return -1;
        }
    }

    /* renamed from: f */
    public final int mo22578f() {
        MethodCollector.m26663i(389);
        if (!this.f34209a) {
            MethodCollector.m26664o(389);
            return -1;
        }
        try {
            int nativeAnrMonitorLoop = nativeAnrMonitorLoop();
            MethodCollector.m26664o(389);
            return nativeAnrMonitorLoop;
        } catch (Throwable unused) {
            MethodCollector.m26664o(389);
            return -1;
        }
    }

    public class NativeHeapSize {
        public long allocate;
        public long free;
        public long total;

        static {
            Covode.recordClassIndex(16106);
        }

        public void print() {
            C14075v.m25650a("NativeHeapSize.total = " + this.total);
            C14075v.m25650a("NativeHeapSize.allocate = " + this.allocate);
            C14075v.m25650a("NativeHeapSize.free = " + this.free);
        }

        public NativeHeapSize() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        com.bytedance.librarian.Librarian.m38965b("npth_tools", true, com.bytedance.crash.C13933m.f33936a);
        r6.f34209a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private NativeTools() {
        /*
            r6 = this;
            java.lang.String r5 = "npth_tools"
            r6.<init>()
            boolean r0 = r6.f34209a
            if (r0 != 0) goto L_0x0027
            r4 = 1
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0020 }
            r1 = 0
            r0 = 0
            com.bytedance.librarian.Librarian.m38965b(r5, r1, r0)     // Catch:{ all -> 0x0020 }
            com.p2082ss.android.ugc.aweme.lancet.C58032m.m104852a(r2, r5)     // Catch:{ all -> 0x0020 }
            r6.f34209a = r4     // Catch:{ all -> 0x0020 }
            com.bytedance.crash.util.NativeTools$1 r0 = new com.bytedance.crash.util.NativeTools$1     // Catch:{ all -> 0x0020 }
            r0.<init>()     // Catch:{ all -> 0x0020 }
            com.bytedance.crash.util.C14070s.f34254a = r0     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            android.content.Context r0 = com.bytedance.crash.C13933m.f33936a     // Catch:{ all -> 0x0027 }
            com.bytedance.librarian.Librarian.m38965b(r5, r4, r0)     // Catch:{ all -> 0x0027 }
            r6.f34209a = r4     // Catch:{ all -> 0x0027 }
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.NativeTools.<init>():void");
    }

    /* renamed from: g */
    public final boolean mo22579g() {
        MethodCollector.m26663i(398);
        if (!this.f34209a) {
            MethodCollector.m26664o(398);
            return false;
        }
        try {
            if (nativeGetResendSigquit() != 0) {
                MethodCollector.m26664o(398);
                return true;
            }
            MethodCollector.m26664o(398);
            return false;
        } catch (Throwable unused) {
            MethodCollector.m26664o(398);
            return false;
        }
    }

    /* renamed from: a */
    public static NativeTools m25458a() {
        long j;
        MethodCollector.m26663i(248);
        if (f34208c == null) {
            synchronized (NativeTools.class) {
                try {
                    if (f34208c == null) {
                        NativeTools nativeTools = new NativeTools();
                        f34208c = nativeTools;
                        try {
                            if (nativeTools.f34209a) {
                                nativeToolsInit(Build.VERSION.SDK_INT, NativeImpl.m25247b(C13933m.f33936a));
                                if (!NativeImpl.f33976a) {
                                    j = 0;
                                } else {
                                    j = NativeImpl.doGetNpthCatchAddr();
                                }
                                doSetNpthCatchAddr(j);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(248);
                    throw th;
                }
            }
        }
        NativeTools nativeTools2 = f34208c;
        MethodCollector.m26664o(248);
        return nativeTools2;
    }

    /* renamed from: d */
    public final List<String> mo22573d() {
        MethodCollector.m26663i(347);
        if (!this.f34209a) {
            MethodCollector.m26664o(347);
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String[] nativeGetFdListForAPM = nativeGetFdListForAPM();
            if (nativeGetFdListForAPM != null) {
                arrayList.addAll(Arrays.asList(nativeGetFdListForAPM));
            }
            MethodCollector.m26664o(347);
            return arrayList;
        } catch (Throwable unused) {
            MethodCollector.m26664o(347);
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo22570c() {
        MethodCollector.m26663i(338);
        if (!this.f34209a) {
            MethodCollector.m26664o(338);
            return false;
        }
        try {
            boolean nativeIs64BitLibrary = nativeIs64BitLibrary();
            MethodCollector.m26664o(338);
            return nativeIs64BitLibrary;
        } catch (Throwable unused) {
            MethodCollector.m26664o(338);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0094, code lost:
        com.bytedance.crash.runtime.C14019n.m25421b().mo22553b(com.bytedance.crash.p924b.C13833g.f33683j);
        com.bytedance.crash.p924b.C13833g.m24994c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        monitor-enter(com.bytedance.crash.p924b.C13833g.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        com.bytedance.crash.p924b.C13833g.f33680g = false;
        com.bytedance.crash.p924b.C13833g.class.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        monitor-exit(com.bytedance.crash.p924b.C13833g.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ae, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(916);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b8, code lost:
        com.bytedance.crash.runtime.C14019n.m25421b().mo22552a(com.bytedance.crash.p924b.C13833g.f33683j, 35000);
        com.bytedance.crash.runtime.C14019n.m25421b().mo22552a(new com.bytedance.crash.p924b.C13833g.RunnableC138384(), com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting.DEFAULT);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void reportEventForAnrMonitor() {
        /*
        // Method dump skipped, instructions count: 377
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.NativeTools.reportEventForAnrMonitor():void");
    }

    /* renamed from: g */
    public static String m25461g(String str) {
        MethodCollector.m26663i(456);
        try {
            String nativeGetBuildID = nativeGetBuildID(str);
            MethodCollector.m26664o(456);
            return nativeGetBuildID;
        } catch (Throwable unused) {
            MethodCollector.m26664o(456);
            return null;
        }
    }

    /* renamed from: c */
    public final int mo22567c(String str) {
        MethodCollector.m26663i(319);
        if (!this.f34209a) {
            MethodCollector.m26664o(319);
            return -1;
        }
        try {
            int nativeOpenFile = nativeOpenFile(str);
            MethodCollector.m26664o(319);
            return nativeOpenFile;
        } catch (Throwable unused) {
            MethodCollector.m26664o(319);
            return -1;
        }
    }

    /* renamed from: d */
    public final int mo22571d(String str) {
        MethodCollector.m26663i(326);
        if (!this.f34209a) {
            MethodCollector.m26664o(326);
            return -1;
        }
        try {
            int nativeLockFile = nativeLockFile(str);
            MethodCollector.m26664o(326);
            return nativeLockFile;
        } catch (Throwable unused) {
            MethodCollector.m26664o(326);
            return -1;
        }
    }

    public void setMallocInfoFunc(long j) {
        MethodCollector.m26663i(669);
        if (!this.f34209a) {
            MethodCollector.m26664o(669);
            return;
        }
        try {
            nativeSetMallocInfoFunctionAddress(j);
            MethodCollector.m26664o(669);
        } catch (Throwable unused) {
            MethodCollector.m26664o(669);
        }
    }

    /* renamed from: a */
    public final int mo22557a(int i) {
        MethodCollector.m26663i(324);
        if (!this.f34209a) {
            MethodCollector.m26664o(324);
            return -1;
        }
        try {
            int nativeCloseFile = nativeCloseFile(i);
            MethodCollector.m26664o(324);
            return nativeCloseFile;
        } catch (Throwable unused) {
            MethodCollector.m26664o(324);
            return -1;
        }
    }

    /* renamed from: b */
    public final int mo22564b(int i) {
        MethodCollector.m26663i(329);
        if (!this.f34209a) {
            MethodCollector.m26664o(329);
            return -1;
        }
        try {
            int nativeUnlockFile = nativeUnlockFile(i);
            MethodCollector.m26664o(329);
            return nativeUnlockFile;
        } catch (Throwable unused) {
            MethodCollector.m26664o(329);
            return -1;
        }
    }

    /* renamed from: c */
    public final long mo22568c(int i) {
        MethodCollector.m26663i(341);
        if (!this.f34209a) {
            MethodCollector.m26664o(341);
            return -1;
        }
        try {
            long nativeGetThreadCpuTimeMills = nativeGetThreadCpuTimeMills(i);
            MethodCollector.m26664o(341);
            return nativeGetThreadCpuTimeMills;
        } catch (Throwable unused) {
            MethodCollector.m26664o(341);
            return 0;
        }
    }

    /* renamed from: b */
    public final int mo22565b(String str) {
        MethodCollector.m26663i(298);
        if (!this.f34209a) {
            MethodCollector.m26664o(298);
            return -1;
        }
        try {
            int nativeDumpCrashInfo = nativeDumpCrashInfo(null, null, null, null, null, str, null, false);
            MethodCollector.m26664o(298);
            return nativeDumpCrashInfo;
        } catch (Throwable unused) {
            MethodCollector.m26664o(298);
            return -1;
        }
    }

    /* renamed from: e */
    public final boolean mo22577e(String str) {
        MethodCollector.m26663i(401);
        if (!this.f34209a) {
            MethodCollector.m26664o(401);
            return false;
        }
        try {
            nativeAnrDump(str);
            MethodCollector.m26664o(401);
            return true;
        } catch (Throwable unused) {
            MethodCollector.m26664o(401);
            return false;
        }
    }

    /* renamed from: f */
    public static String m25460f(String str) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            return sb.toString();
        }
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString().toUpperCase();
    }

    /* renamed from: d */
    public final boolean mo22574d(int i) {
        MethodCollector.m26663i(651);
        if (!this.f34209a) {
            MethodCollector.m26664o(651);
            return false;
        }
        try {
            boolean nativePidExists = nativePidExists(i);
            MethodCollector.m26664o(651);
            return nativePidExists;
        } catch (Throwable unused) {
            MethodCollector.m26664o(651);
            return false;
        }
    }

    /* renamed from: a */
    public final int mo22560a(String str) {
        MethodCollector.m26663i(288);
        if (!this.f34209a) {
            MethodCollector.m26664o(288);
            return -1;
        }
        try {
            int nativeDumpCrashInfo = nativeDumpCrashInfo(null, null, null, null, null, null, str, false);
            MethodCollector.m26664o(288);
            return nativeDumpCrashInfo;
        } catch (Throwable unused) {
            MethodCollector.m26664o(288);
            return -1;
        }
    }

    private static void onFindOneDied(int i, String str) {
        C13964g.m25287a(i, str);
    }

    /* renamed from: d */
    public final int mo22572d(String str, String str2) {
        MethodCollector.m26663i(644);
        if (!this.f34209a) {
            MethodCollector.m26664o(644);
            return -1;
        }
        try {
            int nativeGetThreadInfoFromTombStone = nativeGetThreadInfoFromTombStone(str, str2);
            MethodCollector.m26664o(644);
            return nativeGetThreadInfoFromTombStone;
        } catch (Throwable unused) {
            MethodCollector.m26664o(644);
            return -1;
        }
    }

    /* renamed from: e */
    public final int mo22576e(String str, String str2) {
        MethodCollector.m26663i(658);
        if (!this.f34209a) {
            MethodCollector.m26664o(658);
            return -1;
        }
        try {
            int nativeUpdateEspInfoFromTombStone = nativeUpdateEspInfoFromTombStone(str, str2);
            MethodCollector.m26664o(658);
            return nativeUpdateEspInfoFromTombStone;
        } catch (Throwable unused) {
            MethodCollector.m26664o(658);
            return -1;
        }
    }

    /* renamed from: c */
    public final String mo22569c(String str, String str2) {
        MethodCollector.m26663i(578);
        if (!this.f34209a) {
            MethodCollector.m26664o(578);
            return "UNKNOWN";
        }
        try {
            String nativeGetOOMReason = nativeGetOOMReason(str, str2);
            if (nativeGetOOMReason == null) {
                MethodCollector.m26664o(578);
                return "UNKNOWN";
            }
            MethodCollector.m26664o(578);
            return nativeGetOOMReason;
        } catch (Throwable unused) {
            MethodCollector.m26664o(578);
            return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public final int mo22558a(int i, String str) {
        MethodCollector.m26663i(322);
        if (!this.f34209a) {
            MethodCollector.m26664o(322);
            return -1;
        }
        try {
            int nativeWriteFile = nativeWriteFile(i, str, str.length());
            MethodCollector.m26664o(322);
            return nativeWriteFile;
        } catch (Throwable unused) {
            MethodCollector.m26664o(322);
            return -1;
        }
    }

    /* renamed from: b */
    public final void mo22566b(String str, String str2) {
        MethodCollector.m26663i(466);
        if (!this.f34209a) {
            MethodCollector.m26664o(466);
            return;
        }
        try {
            nativeDumpPthreadList(str, str2);
            MethodCollector.m26664o(466);
        } catch (Throwable unused) {
            MethodCollector.m26664o(466);
        }
    }

    /* renamed from: a */
    public final int mo22561a(String str, String str2) {
        MethodCollector.m26663i(294);
        if (!this.f34209a) {
            MethodCollector.m26664o(294);
            return -1;
        }
        try {
            int nativeDumpLogcat = nativeDumpLogcat(str, str2);
            MethodCollector.m26664o(294);
            return nativeDumpLogcat;
        } catch (Throwable unused) {
            MethodCollector.m26664o(294);
            return -1;
        }
    }

    public long getSymbolAddress(String str, String str2, boolean z) {
        int i;
        MethodCollector.m26663i(665);
        if (!this.f34209a) {
            MethodCollector.m26664o(665);
            return -1;
        }
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            long nativeGetSymbolAddress = nativeGetSymbolAddress(str, str2, i);
            MethodCollector.m26664o(665);
            return nativeGetSymbolAddress;
        } catch (Throwable unused) {
            MethodCollector.m26664o(665);
            return 0;
        }
    }

    /* renamed from: a */
    public final int mo22559a(long j, String str, String str2) {
        boolean z;
        boolean z2;
        MethodCollector.m26663i(506);
        if (!this.f34209a) {
            MethodCollector.m26664o(506);
            return -1;
        }
        try {
            String c = C14044b.m25520c(C13933m.f33936a);
            boolean b = C14044b.m25518b(C13933m.f33936a);
            if (C13994b.m25329a("custom_event_settings", "npth_simple_setting", "disable_kill_history_data") == 1) {
                z = false;
            } else {
                z = true;
            }
            if (C13994b.m25329a("custom_event_settings", "npth_simple_setting", "disable_kill_history_subprocess") == 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            int nativeTerminateMonitorWait = nativeTerminateMonitorWait(j, str, str2, c, b, z, z2);
            MethodCollector.m26664o(506);
            return nativeTerminateMonitorWait;
        } catch (Throwable unused) {
            C13933m.f33942g.isDebugMode();
            MethodCollector.m26664o(506);
            return -1;
        }
    }

    /* renamed from: a */
    public static void m25459a(String str, String str2, String str3, String str4, String str5) {
        MethodCollector.m26663i(273);
        nativeDumpCrashInfo(str, str2, str3, str4, str5, null, null, false);
        MethodCollector.m26664o(273);
    }
}
