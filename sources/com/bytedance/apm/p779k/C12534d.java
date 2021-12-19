package com.bytedance.apm.p779k;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import com.bytedance.apm.p779k.p780a.C12515b;
import com.bytedance.apm.p789q.C12576b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.k.d */
public final class C12534d {
    static {
        Covode.recordClassIndex(14350);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038 A[Catch:{ Exception -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[Catch:{ Exception -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.apm.p779k.p780a.C12514a m22529a() {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p779k.C12534d.m22529a():com.bytedance.apm.k.a.a");
    }

    /* renamed from: a */
    public static C12515b m22530a(Context context) {
        C12515b bVar = new C12515b();
        try {
            long j = Runtime.getRuntime().totalMemory();
            long freeMemory = Runtime.getRuntime().freeMemory();
            bVar.f30395a = j;
            bVar.f30396b = freeMemory;
            bVar.f30397c = j - freeMemory;
            Debug.MemoryInfo a = C12576b.m22629a(Process.myPid(), context);
            if (a != null) {
                int i = a.dalvikPss;
                int i2 = a.nativePss;
                int totalPss = a.getTotalPss();
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        bVar.f30401g = ((long) Integer.parseInt(a.getMemoryStat("summary.graphics"))) * 1024;
                        bVar.f30413s = ((long) Integer.parseInt(a.getMemoryStat("summary.java-heap"))) * 1024;
                        bVar.f30414t = ((long) Integer.parseInt(a.getMemoryStat("summary.native-heap"))) * 1024;
                        bVar.f30415u = ((long) Integer.parseInt(a.getMemoryStat("summary.code"))) * 1024;
                        bVar.f30416v = ((long) Integer.parseInt(a.getMemoryStat("summary.stack"))) * 1024;
                        bVar.f30417w = ((long) Integer.parseInt(a.getMemoryStat("summary.private-other"))) * 1024;
                        bVar.f30418x = ((long) Integer.parseInt(a.getMemoryStat("summary.system"))) * 1024;
                        bVar.f30412r = ((long) Integer.parseInt(a.getMemoryStat("summary.total-pss"))) * 1024;
                        bVar.f30411q = ((long) Integer.parseInt(a.getMemoryStat("summary.total-swap"))) * 1024;
                    } catch (Exception unused) {
                    }
                }
                bVar.f30398d = ((long) i) * 1024;
                bVar.f30399e = ((long) i2) * 1024;
                bVar.f30400f = ((long) totalPss) * 1024;
                bVar.f30403i = ((long) a.dalvikPrivateDirty) * 1024;
                bVar.f30404j = ((long) a.dalvikSharedDirty) * 1024;
                bVar.f30405k = ((long) a.otherPss) * 1024;
                bVar.f30406l = ((long) a.otherPrivateDirty) * 1024;
                bVar.f30407m = ((long) a.otherSharedDirty) * 1024;
                bVar.f30408n = ((long) a.getTotalSwappablePss()) * 1024;
                bVar.f30409o = ((long) a.getTotalPrivateDirty()) * 1024;
                bVar.f30410p = ((long) a.getTotalSharedClean()) * 1024;
            }
            bVar.f30402h = C12576b.m22638e() * 1024;
        } catch (Exception unused2) {
        }
        return bVar;
    }
}
