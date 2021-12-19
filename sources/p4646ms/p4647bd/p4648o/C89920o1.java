package p4646ms.p4647bd.p4648o;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: ms.bd.o.o1 */
public final class C89920o1 implements SensorEventListener {

    /* renamed from: a */
    private static volatile C89920o1 f203805a = null;

    /* renamed from: b */
    private SensorManager f203806b = null;

    /* renamed from: c */
    private int f203807c;

    /* renamed from: d */
    private int f203808d = 0;

    /* renamed from: e */
    private float[] f203809e = new float[3];

    /* renamed from: f */
    private List<JSONArray> f203810f = new ArrayList();

    static {
        MethodCollector.m26663i(2585);
        Covode.recordClassIndex(106017);
        new DecimalFormat((String) C89889h.m155966a(16777217, 0, 0, "489194", new byte[]{117, 116, 26}));
        MethodCollector.m26664o(2585);
    }

    /* renamed from: a */
    public static C89920o1 m156026a(Context context) {
        MethodCollector.m26663i(2403);
        if (f203805a == null) {
            synchronized (C89920o1.class) {
                try {
                    if (f203805a == null) {
                        f203805a = new C89920o1(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2403);
                    throw th;
                }
            }
        }
        C89920o1 o1Var = f203805a;
        MethodCollector.m26664o(2403);
        return o1Var;
    }

    /* renamed from: c */
    private synchronized void m156027c() {
        MethodCollector.m26663i(2406);
        try {
            SensorManager sensorManager = this.f203806b;
            if (sensorManager != null) {
                if (this.f203807c == 0) {
                    if (!this.f203806b.registerListener(this, sensorManager.getDefaultSensor(1), 3)) {
                        MethodCollector.m26664o(2406);
                        return;
                    }
                }
                this.f203807c++;
                MethodCollector.m26664o(2406);
                return;
            }
        } catch (Exception unused) {
        }
        MethodCollector.m26664o(2406);
    }

    /* renamed from: d */
    private synchronized void m156028d() {
        MethodCollector.m26663i(2412);
        try {
            SensorManager sensorManager = this.f203806b;
            if (sensorManager != null) {
                int i = this.f203807c - 1;
                this.f203807c = i;
                if (i == 0) {
                    sensorManager.unregisterListener(this);
                    MethodCollector.m26664o(2412);
                    return;
                }
            }
        } catch (Exception unused) {
            C89889h.m155966a(16777217, 0, 0, "3b5c90", new byte[]{49, 115, 69, 40, 19});
        }
        MethodCollector.m26664o(2412);
    }

    /* renamed from: a */
    public final synchronized void mo144463a() {
        MethodCollector.m26663i(2548);
        JSONArray e = m156029e();
        if (e == null) {
            MethodCollector.m26664o(2548);
            return;
        }
        this.f203810f.add(e);
        try {
            int size = this.f203810f.size();
            if (size > 100) {
                ArrayList arrayList = new ArrayList(this.f203810f.subList(size - 50, size));
                this.f203810f.clear();
                this.f203810f = arrayList;
                MethodCollector.m26664o(2548);
                return;
            }
        } catch (Throwable unused) {
        }
        MethodCollector.m26664o(2548);
    }

    /* renamed from: b */
    public final synchronized String mo144464b() {
        MethodCollector.m26663i(2583);
        StringBuilder sb = new StringBuilder();
        int size = this.f203810f.size();
        if (size <= 0) {
            MethodCollector.m26664o(2583);
            return null;
        }
        try {
            List<JSONArray> list = this.f203810f;
            int i = size - 50;
            if (i <= 0) {
                i = 0;
            }
            List<JSONArray> subList = list.subList(i, size);
            if (subList.size() > 0) {
                for (JSONArray jSONArray : subList) {
                    if (jSONArray != null) {
                        sb.append(jSONArray.get(0).toString());
                        sb.append((String) C89889h.m155966a(16777217, 0, 0, "7c2f6e", new byte[]{106}));
                        sb.append(jSONArray.get(1).toString());
                        sb.append((String) C89889h.m155966a(16777217, 0, 0, "74c262", new byte[]{106}));
                        sb.append(jSONArray.get(2).toString());
                        sb.append((String) C89889h.m155966a(16777217, 0, 0, "f31e93", new byte[]{107}));
                    }
                }
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
        } catch (Throwable unused) {
        }
        String sb2 = sb.toString();
        MethodCollector.m26664o(2583);
        return sb2;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f203809e = sensorEvent.values;
        this.f203808d = 1;
    }

    /* renamed from: e */
    private JSONArray m156029e() {
        char c;
        BigDecimal bigDecimal;
        JSONArray jSONArray;
        MethodCollector.m26663i(2506);
        try {
            if (C89873c0.m155947a() != null) {
                c = 1;
            } else {
                c = 0;
            }
        } catch (Throwable unused) {
            c = 65535;
        }
        if (c != 1) {
            MethodCollector.m26664o(2506);
            return null;
        }
        m156027c();
        try {
            synchronized (this) {
                int i = 0;
                while (this.f203808d == 0 && i < 10) {
                    try {
                        i++;
                        wait(1000);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(2506);
                        throw th;
                    }
                }
            }
            jSONArray = new JSONArray();
            jSONArray.put(new BigDecimal((double) this.f203809e[0]).setScale(2, 4));
            jSONArray.put(new BigDecimal((double) this.f203809e[1]).setScale(2, 4));
            bigDecimal = new BigDecimal((double) this.f203809e[2]);
        } catch (Exception unused2) {
            C89889h.m155966a(16777217, 0, 0, "17a5e1", new byte[]{51, 38, 17, 126, 93});
            jSONArray = new JSONArray();
            jSONArray.put(new BigDecimal((double) this.f203809e[0]).setScale(2, 4));
            jSONArray.put(new BigDecimal((double) this.f203809e[1]).setScale(2, 4));
            bigDecimal = new BigDecimal((double) this.f203809e[2]);
        } catch (Throwable th2) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(new BigDecimal((double) this.f203809e[0]).setScale(2, 4));
            jSONArray2.put(new BigDecimal((double) this.f203809e[1]).setScale(2, 4));
            jSONArray2.put(new BigDecimal((double) this.f203809e[2]).setScale(2, 4));
            m156028d();
            this.f203808d = 0;
            MethodCollector.m26664o(2506);
            throw th2;
        }
        jSONArray.put(bigDecimal.setScale(2, 4));
        m156028d();
        this.f203808d = 0;
        MethodCollector.m26664o(2506);
        return jSONArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        if (r1 != null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C89920o1(android.content.Context r10) {
        /*
            r9 = this;
            r9.<init>()
            r2 = 2314(0x90a, float:3.243E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            r0 = 0
            r9.f203806b = r0
            r0 = 0
            r9.f203808d = r0
            r0 = 3
            float[] r0 = new float[r0]
            r9.f203809e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f203810f = r0
            android.content.Context r1 = r10.getApplicationContext()
            boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
            if (r0 != 0) goto L_0x0044
        L_0x0022:
            if (r1 == 0) goto L_0x0040
        L_0x0024:
            r0 = 6
            byte[] r8 = new byte[r0]
            r8 = {x004a: FILL_ARRAY_DATA  , data: [103, 50, 24, 3, 84, 97} // fill-array
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.String r7 = "e5eddd"
            java.lang.Object r0 = p4646ms.p4647bd.p4648o.C89889h.m155966a(r3, r4, r5, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = m156025a(r1, r0)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r9.f203806b = r0
        L_0x0040:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            goto L_0x0024
        L_0x0047:
            android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
            goto L_0x0022
            fill-array 0x004a: FILL_ARRAY_DATA  , data: [103, 50, 24, 3, 84, 97]
        */
        throw new UnsupportedOperationException("Method not decompiled: p4646ms.p4647bd.p4648o.C89920o1.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    private static Object m156025a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2400);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(2400);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
