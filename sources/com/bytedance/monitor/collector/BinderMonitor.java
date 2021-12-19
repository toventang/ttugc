package com.bytedance.monitor.collector;

import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinderMonitor extends AbstractC21475b {

    /* renamed from: f */
    private static final List<C21460a> f50869f = new ArrayList(200);

    /* renamed from: g */
    private static final Object f50870g = new Object();

    /* renamed from: h */
    private static volatile int f50871h = 0;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: b */
    public final void mo35058b(int i) {
    }

    private static String getStacktrace() {
        return Log.getStackTraceString(new Exception());
    }

    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: c */
    public final Pair<String, String> mo35059c() {
        try {
            return new Pair<>(this.f50912a, f50869f.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(25083);
    }

    /* renamed from: d */
    public static List<C21460a> m40315d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f50870g) {
            int i = 0;
            if (f50869f.size() < 200) {
                while (true) {
                    List<C21460a> list = f50869f;
                    if (i >= list.size()) {
                        break;
                    }
                    arrayList.add(list.get(i));
                    i++;
                }
            } else {
                while (i < 200) {
                    arrayList.add(f50869f.get(((f50871h + i) + 1) % 200));
                    i++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: com.bytedance.monitor.collector.BinderMonitor$a */
    public static class C21460a {

        /* renamed from: a */
        public long f50872a;

        /* renamed from: b */
        public long f50873b;

        /* renamed from: c */
        long f50874c;

        /* renamed from: d */
        public StackTraceElement[] f50875d;

        static {
            Covode.recordClassIndex(25084);
        }

        public final String toString() {
            return "{\"start\":" + this.f50872a + ",\"end\":" + this.f50873b + ",\"parcel_size\":" + this.f50874c + ",\"cost_millis\":" + (this.f50873b - this.f50872a) + ",\"java_stack\":\"" + C21512o.m40410b(BinderMonitor.m40313a(this.f50875d)) + "\"}";
        }
    }

    public BinderMonitor(int i) {
        super(i, "binder_monitor");
    }

    /* renamed from: a */
    public static StackTraceElement[] m40313a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return stackTraceElementArr;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= stackTraceElementArr.length) {
                break;
            } else if ("saveBinderInfo".equals(stackTraceElementArr[i2].getMethodName())) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        int i3 = i + 1;
        if (i3 <= stackTraceElementArr.length) {
            return (StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, i3, stackTraceElementArr.length);
        }
        return stackTraceElementArr;
    }

    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: a */
    public final Pair<String, String> mo35057a(long j, long j2) {
        try {
            return new Pair<>(this.f50912a, m40314b(j, j2));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m40314b(long j, long j2) {
        List<C21460a> d = m40315d();
        ArrayList arrayList = new ArrayList();
        for (int size = d.size() - 1; size >= 0; size--) {
            C21460a aVar = d.get(size);
            if (aVar.f50872a < j2 || aVar.f50873b > j) {
                arrayList.add(aVar);
            }
            if (aVar.f50873b < j) {
                break;
            }
        }
        return arrayList.toString();
    }

    public static void saveBinderInfo(long j, long j2, long j3) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        synchronized (f50870g) {
            if (f50871h >= 200) {
                f50871h -= 200;
            }
            List<C21460a> list = f50869f;
            if (list.size() >= 200) {
                C21460a aVar = list.get(f50871h);
                aVar.f50872a = j;
                aVar.f50873b = j2;
                aVar.f50874c = j3;
                aVar.f50875d = stackTrace;
            } else {
                C21460a aVar2 = new C21460a();
                aVar2.f50872a = j;
                aVar2.f50873b = j2;
                aVar2.f50874c = j3;
                aVar2.f50875d = stackTrace;
                list.add(aVar2);
            }
            f50871h++;
        }
    }
}
