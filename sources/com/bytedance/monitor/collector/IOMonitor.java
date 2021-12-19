package com.bytedance.monitor.collector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class IOMonitor extends AbstractC21475b {

    /* renamed from: f */
    private static List<C21461a> f50876f = new ArrayList(100);

    /* renamed from: g */
    private static final Object f50877g = new Object();

    /* renamed from: h */
    private static volatile int f50878h = 0;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: b */
    public final void mo35058b(int i) {
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: c */
    public final Pair<String, ?> mo35059c() {
        try {
            return new Pair<>(this.f50912a, f50876f.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(25085);
    }

    /* renamed from: d */
    private static List<C21461a> m40320d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f50877g) {
            int i = 0;
            if (f50876f.size() >= 100) {
                while (i < 100) {
                    arrayList.add(f50876f.get(((f50878h + i) + 1) % 100));
                    i++;
                }
            } else {
                while (i < f50876f.size()) {
                    arrayList.add(f50876f.get(i));
                    i++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: com.bytedance.monitor.collector.IOMonitor$a */
    public static class C21461a {

        /* renamed from: a */
        public long f50879a;

        /* renamed from: b */
        public long f50880b;

        /* renamed from: c */
        public long f50881c;

        /* renamed from: d */
        public long f50882d;

        /* renamed from: e */
        public String f50883e;

        /* renamed from: f */
        public String f50884f;

        static {
            Covode.recordClassIndex(25086);
        }

        public final String toString() {
            return "{\"start\":" + this.f50879a + ",\"end\":" + this.f50880b + ",\"function:\":" + this.f50884f + ",\"file_size\":" + this.f50882d + ",\"cost_millis\":" + (this.f50880b - this.f50879a) + ",\"file_name\":\"" + this.f50883e + "\"}";
        }
    }

    public IOMonitor(int i) {
        super(i, "io_monitor");
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: a */
    public final Pair<String, ?> mo35057a(long j, long j2) {
        try {
            return new Pair<>(this.f50912a, m40319b(j, j2));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m40319b(long j, long j2) {
        List<C21461a> d = m40320d();
        ArrayList arrayList = new ArrayList();
        for (int size = d.size() - 1; size >= 0; size--) {
            C21461a aVar = d.get(size);
            if (aVar.f50879a < j2 || aVar.f50880b > j) {
                arrayList.add(aVar);
            }
            if (aVar.f50880b < j) {
                break;
            }
        }
        return arrayList.toString();
    }

    public static void saveIOInfo(long j, long j2, long j3, long j4, String str, String str2) {
        synchronized (f50877g) {
            if (f50878h >= 100) {
                f50878h -= 100;
            }
            if (f50876f.size() >= 100) {
                C21461a aVar = f50876f.get(f50878h);
                aVar.f50879a = j;
                aVar.f50880b = j2;
                aVar.f50881c = j3;
                aVar.f50882d = j4;
                aVar.f50883e = str;
                aVar.f50884f = str2;
            } else {
                C21461a aVar2 = new C21461a();
                aVar2.f50879a = j;
                aVar2.f50880b = j2;
                aVar2.f50881c = j3;
                aVar2.f50882d = j4;
                aVar2.f50883e = str;
                aVar2.f50884f = str2;
                f50876f.add(aVar2);
            }
            f50878h++;
        }
    }
}
