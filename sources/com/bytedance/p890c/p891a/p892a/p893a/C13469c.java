package com.bytedance.p890c.p891a.p892a.p893a;

import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12603v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p890c.p891a.p892a.p893a.C13473f;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.c.a.a.a.c */
public final class C13469c implements C12560b.AbstractC12565b {

    /* renamed from: a */
    public static String f32804a = "https://i.isnssdk.com/monitor/collect/c/exception";

    /* renamed from: d */
    public static final Object f32805d = new Object();

    /* renamed from: i */
    private static volatile C13469c f32806i;

    /* renamed from: b */
    public volatile int f32807b;

    /* renamed from: c */
    public volatile JSONObject f32808c;

    /* renamed from: e */
    public final LinkedList<C13476h> f32809e = new LinkedList<>();

    /* renamed from: f */
    private volatile long f32810f;

    /* renamed from: g */
    private volatile boolean f32811g;

    /* renamed from: h */
    private volatile long f32812h;

    /* renamed from: j */
    private volatile C13466a f32813j;

    static {
        Covode.recordClassIndex(15477);
    }

    private C13469c() {
        C12560b.C12564a.f30567a.mo20384a(this);
        this.f32813j = new C13466a();
    }

    /* renamed from: b */
    public static boolean m24221b() {
        if (!ApmDelegate.C12507a.f30372a.f30340h || ApmDelegate.C12507a.f30372a.mo20329a("exception_filter_network")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m24222c() {
        this.f32810f = System.currentTimeMillis();
        C12560b.C12564a.f30567a.mo20391b(new Runnable() {
            /* class com.bytedance.p890c.p891a.p892a.p893a.C13469c.RunnableC134701 */

            static {
                Covode.recordClassIndex(15478);
            }

            public final void run() {
                MethodCollector.m26663i(10944);
                try {
                    LinkedList linkedList = new LinkedList();
                    synchronized (C13469c.f32805d) {
                        try {
                            linkedList.addAll(C13469c.this.f32809e);
                            C13469c.this.f32809e.clear();
                            C13469c.this.f32807b = 0;
                        } catch (Throwable th) {
                            MethodCollector.m26664o(10944);
                            throw th;
                        }
                    }
                    if (linkedList.isEmpty()) {
                        MethodCollector.m26664o(10944);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    while (!linkedList.isEmpty()) {
                        C13476h hVar = (C13476h) linkedList.poll();
                        if (hVar != null) {
                            jSONArray.put(new JSONObject(hVar.f32818b));
                        }
                    }
                    jSONObject.put("data", jSONArray);
                    if (C13469c.this.f32808c == null) {
                        C13469c.this.f32808c = C12397c.f29936f;
                    }
                    jSONObject.put("header", C13469c.this.f32808c);
                    C13469c.this.mo21749a(C13469c.f32804a, jSONObject.toString());
                    MethodCollector.m26664o(10944);
                } catch (Throwable unused) {
                    MethodCollector.m26664o(10944);
                }
            }
        });
    }

    /* renamed from: a */
    public static C13469c m24220a() {
        MethodCollector.m26663i(13543);
        if (f32806i == null) {
            synchronized (f32805d) {
                try {
                    if (f32806i == null) {
                        f32806i = new C13469c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13543);
                    throw th;
                }
            }
        }
        C13469c cVar = f32806i;
        MethodCollector.m26664o(13543);
        return cVar;
    }

    @Override // com.bytedance.apm.p788p.C12560b.AbstractC12565b
    /* renamed from: a */
    public final void mo20219a(long j) {
        try {
            if (this.f32813j != null) {
                this.f32813j.mo21746a();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - this.f32810f > 1200000 && this.f32807b > 0) || this.f32807b > 20) {
                m24222c();
            }
            if (this.f32811g && currentTimeMillis - this.f32812h > 1800000) {
                this.f32811g = false;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo21749a(String str, String str2) {
        int statusCode;
        try {
            if (ApmDelegate.C12507a.f30372a.f30340h) {
                C13473f.m24228a(C12603v.m22730a(str, C12397c.m22291h()), str2.getBytes(), C13473f.EnumC13474a.GZIP, "application/json; charset=utf-8");
            }
        } catch (Throwable th) {
            if ((th instanceof C13472e) && (statusCode = th.getStatusCode()) >= 500 && statusCode <= 600) {
                this.f32812h = System.currentTimeMillis();
                this.f32811g = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo21750a(String str, String str2, String str3, boolean z) {
        MethodCollector.m26663i(13598);
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    boolean z2 = false;
                    if (z) {
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.put("log_type", "log_exception");
                        if (str3 != null) {
                            if (str3.length() > 10240) {
                                jSONObject.put("extraMessage", str3.substring(0, 10240));
                            } else {
                                jSONObject.put("extraMessage", str3);
                            }
                        }
                    }
                    if (!ApmDelegate.C12507a.f30372a.f30340h) {
                        if (this.f32813j != null) {
                            this.f32813j.mo21747a(str, str2);
                        }
                        MethodCollector.m26664o(13598);
                        return;
                    }
                    boolean a = ApmDelegate.C12507a.f30372a.mo20329a(str);
                    boolean b = ApmDelegate.C12507a.f30372a.mo20331b(str3);
                    if ((a || b) && !this.f32811g) {
                        synchronized (f32805d) {
                            try {
                                int size = this.f32809e.size();
                                if (size >= 20) {
                                    z2 = true;
                                }
                                this.f32809e.add(new C13476h(str, str2));
                                this.f32807b = size + 1;
                            } finally {
                                MethodCollector.m26664o(13598);
                            }
                        }
                        if (z2) {
                            m24222c();
                        }
                        return;
                    }
                    MethodCollector.m26664o(13598);
                    return;
                }
            }
            MethodCollector.m26664o(13598);
        } catch (Throwable unused) {
            MethodCollector.m26664o(13598);
        }
    }
}
