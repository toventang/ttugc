package com.bytedance.p1399im.core.p1415g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.C19738a;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19586am;
import com.bytedance.p1399im.core.proto.ClientMetricType;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.im.core.g.c */
public class C19699c implements Handler.Callback {

    /* renamed from: a */
    public static boolean f46840a;

    /* renamed from: d */
    private static int f46841d;

    /* renamed from: e */
    private static volatile C19699c f46842e;

    /* renamed from: b */
    public Handler f46843b;

    /* renamed from: c */
    public List<C19586am> f46844c = new CopyOnWriteArrayList();

    /* renamed from: f */
    private C19695a f46845f = new C19695a();

    static {
        Covode.recordClassIndex(22543);
    }

    /* renamed from: d */
    private void m36834d() {
        if (!this.f46843b.hasMessages(0)) {
            this.f46843b.sendEmptyMessageDelayed(0, Math.max(C19483d.m36365a().mo31141b().f46236aa, 1000L));
        }
    }

    /* renamed from: e */
    private static double m36835e() {
        if (C19483d.m36365a().mo31141b().f46209R) {
            return 0.0d;
        }
        return C19738a.m36942h();
    }

    /* renamed from: b */
    public final void mo31655b() {
        if (!C19483d.m36365a().mo31141b().f46252aq) {
            m36830a(ClientMetricType.COUNTER, "db_op_start", 1, null, m36835e());
        }
    }

    private C19699c() {
        HandlerThread handlerThread = new HandlerThread("ReportManager-Thread");
        handlerThread.start();
        this.f46843b = new Handler(handlerThread.getLooper(), this);
        f46840a = true;
    }

    /* renamed from: a */
    public static C19699c m36829a() {
        MethodCollector.m26663i(8631);
        if (f46842e == null) {
            synchronized (C19699c.class) {
                try {
                    if (f46842e == null) {
                        f46842e = new C19699c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8631);
                    throw th;
                }
            }
        }
        C19699c cVar = f46842e;
        MethodCollector.m26664o(8631);
        return cVar;
    }

    /* renamed from: c */
    private void m36833c() {
        Integer valueOf;
        StringBuilder sb = new StringBuilder("ReportManager reportBatch:");
        List<C19586am> list = this.f46844c;
        if (list == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.size());
        }
        C19512f.m36457b("imsdk", sb.append(valueOf).toString(), (Throwable) null);
        List<C19586am> list2 = this.f46844c;
        if (list2 != null && !list2.isEmpty()) {
            this.f46845f.mo31648a(f46841d, this.f46844c);
            this.f46844c.clear();
        }
    }

    public boolean handleMessage(Message message) {
        if (message == null || message.what != 0) {
            return true;
        }
        m36833c();
        return true;
    }

    /* renamed from: a */
    public static void m36831a(String str) {
        if (C19483d.m36365a().mo31141b().f46252aq) {
            C19696b.m36823a(str, true, -1, (Throwable) null);
        }
    }

    /* renamed from: a */
    private static boolean m36832a(double d) {
        if (d == 1.0d || Math.random() < d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo31654a(List<C19586am> list) {
        if (list != null && !list.isEmpty() && m36832a(1.0d)) {
            this.f46844c.addAll(list);
            if (this.f46844c.size() >= 100) {
                m36833c();
                this.f46843b.removeMessages(0);
                return;
            }
            m36834d();
        }
    }

    /* renamed from: a */
    public final void mo31653a(String str, long j) {
        long j2 = 0;
        if (j > 0) {
            j2 = System.currentTimeMillis() - j;
        }
        HashMap hashMap = null;
        if (j2 > 1000) {
            C19512f.m36457b("ReportManager ", str + " cost " + j2 + "ms", (Throwable) null);
        }
        if (C19483d.m36365a().mo31141b().f46252aq) {
            C19696b.m36818a(str, j2);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
            hashMap.put("db_op_method", str);
        }
        m36830a(ClientMetricType.TIMER, "db_op_cost", j2, hashMap, m36835e());
    }

    /* renamed from: a */
    public final void mo31651a(ClientMetricType clientMetricType, String str, Map<String, String> map) {
        m36830a(clientMetricType, str, 1, map, 1.0d);
    }

    /* renamed from: a */
    public final void mo31652a(String str, int i, Throwable th) {
        if (C19483d.m36365a().mo31141b().f46252aq) {
            C19696b.m36823a(str, false, i, th);
        } else {
            m36830a(ClientMetricType.COUNTER, "db_op_fail", 1, null, m36835e());
        }
    }

    /* renamed from: a */
    private void m36830a(ClientMetricType clientMetricType, String str, long j, Map<String, String> map, double d) {
        if (m36832a(d)) {
            C19586am amVar = new C19586am(clientMetricType, str, j, map);
            if (!C19483d.m36365a().f46157b.mo27972m()) {
                mo31654a(Collections.singletonList(amVar));
            }
        }
    }
}
