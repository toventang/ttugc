package com.bytedance.apm.p773f;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.apm.f.e */
public final class C12468e {
    static {
        Covode.recordClassIndex(14278);
    }

    /* renamed from: com.bytedance.apm.f.e$a */
    public static class C12469a {

        /* renamed from: a */
        public long f30297a = -1;

        /* renamed from: b */
        public long f30298b = -1;

        /* renamed from: c */
        public long f30299c = -1;

        /* renamed from: d */
        public long f30300d = -1;

        /* renamed from: e */
        public double f30301e = -1.0d;

        /* renamed from: f */
        public long f30302f = -1;

        /* renamed from: g */
        public long f30303g = -1;

        /* renamed from: h */
        public double f30304h = -1.0d;

        /* renamed from: i */
        public double f30305i = -1.0d;

        /* renamed from: j */
        public double f30306j = -1.0d;

        /* renamed from: k */
        public long f30307k = -1;

        /* renamed from: l */
        public long f30308l = -1;

        /* renamed from: m */
        public long f30309m = -1;

        /* renamed from: n */
        public long f30310n = -1;

        /* renamed from: o */
        public long f30311o = -1;

        /* renamed from: p */
        public List<String> f30312p;

        static {
            Covode.recordClassIndex(14279);
        }

        public final String toString() {
            return "LaunchTraceData{gcCount=" + this.f30297a + ", gcTime=" + this.f30298b + ", blockGcCount=" + this.f30299c + ", blockGcTime=" + this.f30300d + ", cpuTime=" + this.f30301e + ", voluntarySwitches=" + this.f30302f + ", inVoluntarySwitches=" + this.f30303g + ", iowaitTime=" + this.f30304h + ", runnableTime=" + this.f30305i + ", sleepTime=" + this.f30306j + ", minorFault=" + this.f30309m + ", majorFault=" + this.f30310n + ", allThreadCount=" + this.f30311o + ", javaThreadNameList=" + this.f30312p + ", lockTime=" + this.f30307k + ", binderTime=" + this.f30308l + '}';
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:5|6|(3:8|(2:10|54)(2:11|(2:13|55)(2:14|(2:16|56)(2:17|(2:19|57)(2:20|(2:22|58)(2:23|(2:25|60)(1:59))))))|53)|(3:28|29|(2:30|31))|36|37|(1:39)|40|41|(2:44|45)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00d5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x014f */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011f A[Catch:{ all -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0154 A[SYNTHETIC, Splitter:B:44:0x0154] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.apm.p773f.C12468e.C12469a m22431a() {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p773f.C12468e.m22431a():com.bytedance.apm.f.e$a");
    }

    /* renamed from: a */
    private static void m22432a(C12469a aVar) {
        try {
            int length = new File("/proc/self/task/").listFiles().length;
            if (length != 0) {
                ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup != null) {
                    while (threadGroup.getParent() != null) {
                        threadGroup = threadGroup.getParent();
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[(activeCount + (activeCount / 2))];
                    int enumerate = threadGroup.enumerate(threadArr);
                    LinkedList linkedList = new LinkedList();
                    for (int i = 0; i < enumerate; i++) {
                        String name = threadArr[i].getName();
                        if (!TextUtils.isEmpty(name)) {
                            linkedList.add(name);
                        }
                    }
                    aVar.f30311o = (long) length;
                    aVar.f30312p = linkedList;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
