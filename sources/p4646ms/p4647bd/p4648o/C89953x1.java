package p4646ms.p4647bd.p4648o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86745e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ms.bd.o.x1 */
public class C89953x1 {

    /* renamed from: c */
    private static C89953x1 f203836c;

    /* renamed from: a */
    Context f203837a = null;

    /* renamed from: b */
    List<Integer> f203838b = new ArrayList();

    static {
        Covode.recordClassIndex(106050);
    }

    private C89953x1(Context context) {
        this.f203837a = context;
    }

    /* renamed from: a */
    public static C89953x1 m156072a(Context context) {
        MethodCollector.m26663i(445);
        if (f203836c == null) {
            synchronized (C89953x1.class) {
                try {
                    if (f203836c == null) {
                        f203836c = new C89953x1(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(445);
                    throw th;
                }
            }
        }
        C89953x1 x1Var = f203836c;
        MethodCollector.m26664o(445);
        return x1Var;
    }

    /* renamed from: e */
    private int m156074e() {
        MethodCollector.m26663i(451);
        Intent a = m156071a(this.f203837a, new IntentFilter((String) C89889h.m155966a(16777217, 0, 0, "17bc9f", new byte[]{33, 59, 21, 5, 9, 120, 54, 88, 58, 61, 52, 48, 31, 3, 72, 112, 49, 2, 58, 60, 46, 123, 51, 54, 50, 69, 23, 36, 10, 12, 3, 29, 48, 57, 33, 84, 22})));
        if (a == null) {
            MethodCollector.m26664o(451);
            return -1;
        }
        int round = Math.round(((((float) a.getIntExtra((String) C89889h.m155966a(16777217, 0, 0, "e75799", new byte[]{120, 48, 80, 70, 10}), -1)) / ((float) a.getIntExtra((String) C89889h.m155966a(16777217, 0, 0, "b7db8f", new byte[]{96, 54, 22, 26, 2}), -1))) * 100.0f) * 10.0f) / 10;
        MethodCollector.m26664o(451);
        return round;
    }

    /* renamed from: a */
    public final String mo144477a() {
        int i;
        MethodCollector.m26663i(447);
        try {
            synchronized (this) {
                try {
                    i = m156074e();
                } catch (Throwable th) {
                    MethodCollector.m26664o(447);
                    throw th;
                }
            }
        } catch (Exception unused) {
            i = -1;
        } catch (Throwable th2) {
            MethodCollector.m26664o(447);
            throw th2;
        }
        String valueOf = String.valueOf(i);
        MethodCollector.m26664o(447);
        return valueOf;
    }

    /* renamed from: b */
    public final int mo144478b() {
        MethodCollector.m26663i(469);
        Intent a = m156071a(this.f203837a, new IntentFilter((String) C89889h.m155966a(16777217, 0, 0, "87ef26", new byte[]{40, 59, 18, 0, 2, 40, 63, 88, 61, 56, 61, 48, 24, 6, 67, 32, 56, 2, 61, 57, 39, 123, 52, 51, 57, 21, 30, 36, C86745e.f195623b, 9, 10, 29, 55, 60, 42, 4, 31})));
        if (a == null) {
            MethodCollector.m26664o(469);
            return -1;
        }
        int intExtra = a.getIntExtra((String) C89889h.m155966a(16777217, 0, 0, "183605", new byte[]{48, 54, 85, 69, 8, 39, 54}), -1);
        MethodCollector.m26664o(469);
        return intExtra;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r0 = -10001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(474);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r0 = java.lang.Integer.valueOf((r2 * 10000) + r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:1:0x0009] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer mo144479c() {
        /*
            r5 = this;
            r4 = 474(0x1da, float:6.64E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            r3 = -1
            java.lang.Integer.valueOf(r3)
            monitor-enter(r5)     // Catch:{ Exception -> 0x0032, all -> 0x0026 }
            int r2 = r5.mo144478b()     // Catch:{ all -> 0x001d }
            int r1 = r5.m156074e()     // Catch:{ all -> 0x001b }
            monitor-exit(r5)
            int r0 = r2 * 10000
            int r0 = r0 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0038
        L_0x001b:
            r0 = move-exception
            goto L_0x001f
        L_0x001d:
            r0 = move-exception
            r2 = -1
        L_0x001f:
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)     // Catch:{ Exception -> 0x0032, all -> 0x0024 }
            throw r0     // Catch:{ Exception -> 0x0032, all -> 0x0024 }
        L_0x0024:
            r1 = move-exception
            goto L_0x0028
        L_0x0026:
            r1 = move-exception
            r2 = -1
        L_0x0028:
            int r0 = r2 * 10000
            int r0 = r0 + r3
            java.lang.Integer.valueOf(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r1
        L_0x0032:
            r0 = -10001(0xffffffffffffd8ef, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0038:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4646ms.p4647bd.p4648o.C89953x1.mo144479c():java.lang.Integer");
    }

    /* renamed from: d */
    public final synchronized int[] mo144480d() {
        MethodCollector.m26663i(483);
        int size = this.f203838b.size();
        if (size <= 0) {
            int[] iArr = new int[0];
            MethodCollector.m26664o(483);
            return iArr;
        } else if (size == 1) {
            int[] iArr2 = {this.f203838b.get(0).intValue()};
            MethodCollector.m26664o(483);
            return iArr2;
        } else {
            try {
                List<Integer> list = this.f203838b;
                int i = size - 10;
                if (i <= 0) {
                    i = 0;
                }
                List<Integer> subList = list.subList(i, size);
                int[] iArr3 = new int[subList.size()];
                for (int i2 = 0; i2 < subList.size(); i2++) {
                    iArr3[i2] = subList.get(i2).intValue();
                }
                MethodCollector.m26664o(483);
                return iArr3;
            } catch (Throwable unused) {
                int[] iArr4 = new int[0];
                MethodCollector.m26664o(483);
                return iArr4;
            }
        }
    }

    /* renamed from: b */
    private static Intent m156073b(Context context, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(null, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Intent m156071a(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m156073b(context, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e) {
                securityException = e;
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e2) {
                String message = e2.getMessage();
                securityException = e2;
                if (message != null) {
                    boolean contains = e2.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e2;
                    if (contains) {
                        throw e2;
                    }
                }
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }
}
