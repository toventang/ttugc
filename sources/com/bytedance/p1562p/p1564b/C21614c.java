package com.bytedance.p1562p.p1564b;

import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.block.AbstractC12350a;
import com.bytedance.apm.block.AbstractC12386d;
import com.bytedance.apm.block.C12387e;
import com.bytedance.apm.block.C12390g;
import com.bytedance.apm.block.p766a.C12364f;
import com.bytedance.apm.block.p766a.C12370g;
import com.bytedance.apm.block.p766a.C12377h;
import com.bytedance.apm.block.p766a.C12383l;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12409c;
import com.bytedance.apm.p767c.p769b.C12410d;
import com.bytedance.apm.p776h.C12490f;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.monitor.collector.AbstractC21470a;
import com.bytedance.monitor.collector.C21483g;
import com.bytedance.monitor.collector.C21501k;
import com.bytedance.monitor.collector.C21512o;
import com.bytedance.monitor.collector.LockMonitorManager;
import com.bytedance.p1562p.p1563a.C21608a;
import com.bytedance.p802b.p841k.C13133i;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.p.b.c */
public final class C21614c extends AbstractC12350a implements AbstractC12386d {

    /* renamed from: b */
    public static AbstractC21621d f51256b;

    /* renamed from: d */
    public static boolean f51257d;

    /* renamed from: e */
    public static boolean f51258e;

    /* renamed from: f */
    public static boolean f51259f;

    /* renamed from: g */
    public static volatile boolean f51260g;

    /* renamed from: h */
    private static C21614c f51261h;

    /* renamed from: n */
    private static long f51262n;

    /* renamed from: o */
    private static volatile boolean f51263o;

    /* renamed from: s */
    private static int f51264s;

    /* renamed from: c */
    public boolean f51265c;

    /* renamed from: i */
    private volatile boolean f51266i;

    /* renamed from: j */
    private C12370g.C12376a f51267j;

    /* renamed from: k */
    private C12370g.C12376a f51268k;

    /* renamed from: l */
    private volatile String f51269l;

    /* renamed from: m */
    private long[] f51270m;

    /* renamed from: p */
    private volatile long f51271p;

    /* renamed from: q */
    private RunnableC21619a f51272q;

    /* renamed from: r */
    private boolean f51273r;

    static {
        Covode.recordClassIndex(25255);
    }

    public C21614c() {
        this((byte) 0);
    }

    /* renamed from: b */
    public final void mo35281b() {
        if (!f51263o) {
            C12387e.m22254a(this);
            f51263o = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo35280a() {
        MethodCollector.m26663i(9197);
        if (this.f51273r) {
            MethodCollector.m26664o(9197);
            return;
        }
        if (f51258e && f51257d) {
            C12364f.f29788r.mo20120a(this);
            this.f51273r = true;
        }
        MethodCollector.m26664o(9197);
    }

    /* renamed from: com.bytedance.p.b.c$a */
    class RunnableC21619a implements Runnable {

        /* renamed from: a */
        public boolean f51280a;

        /* renamed from: b */
        public boolean f51281b;

        /* renamed from: c */
        long[] f51282c;

        /* renamed from: d */
        long[] f51283d;

        /* renamed from: e */
        long f51284e;

        /* renamed from: f */
        long f51285f;

        /* renamed from: g */
        long f51286g;

        /* renamed from: h */
        String f51287h;

        /* renamed from: i */
        boolean f51288i;

        /* renamed from: j */
        String f51289j;

        /* renamed from: k */
        String f51290k;

        /* renamed from: l */
        long f51291l;

        /* renamed from: m */
        C21483g.C21492e f51292m;

        /* renamed from: n */
        C12383l[] f51293n;

        static {
            Covode.recordClassIndex(25260);
        }

        public final void run() {
            boolean z;
            try {
                LinkedList linkedList = new LinkedList();
                long[] jArr = this.f51283d;
                if (jArr.length > 0) {
                    C21608a.m40549a(jArr, linkedList, this.f51286g);
                    C21608a.m40548a(linkedList, new C21608a.AbstractC21610a() {
                        /* class com.bytedance.p1562p.p1564b.C21614c.RunnableC21619a.C216201 */

                        static {
                            Covode.recordClassIndex(25261);
                        }

                        @Override // com.bytedance.p1562p.p1563a.C21608a.AbstractC21610a
                        /* renamed from: a */
                        public final boolean mo35274a(long j, int i) {
                            return j < ((long) (i * 5));
                        }

                        @Override // com.bytedance.p1562p.p1563a.C21608a.AbstractC21610a
                        /* renamed from: a */
                        public final void mo35273a(List<C12377h> list, int i) {
                            if (C12397c.m22288e()) {
                                C12490f.m22457b("[fallback] size:%s targetSize:%s stack:%s", Integer.valueOf(i), 30, list);
                            }
                            ListIterator<C12377h> listIterator = list.listIterator(Math.min(i, 30));
                            while (listIterator.hasNext()) {
                                listIterator.next();
                                listIterator.remove();
                            }
                        }
                    });
                }
                if (linkedList.size() > 2) {
                    StringBuilder sb = new StringBuilder();
                    long max = Math.max(this.f51285f, C21608a.m40545a(linkedList, sb));
                    String c = C21608a.m40554c(linkedList);
                    JSONObject jSONObject = new JSONObject();
                    String sb2 = sb.toString();
                    C21483g.C21492e eVar = this.f51292m;
                    if (eVar != null) {
                        eVar.mo35090a(this.f51290k, null, null, sb2);
                    }
                    jSONObject.put("stack", sb2);
                    jSONObject.put("stack_key", c);
                    jSONObject.put("scene", this.f51287h);
                    jSONObject.put("cost_time", max);
                    jSONObject.put("cpu_cost", this.f51284e);
                    jSONObject.put("method_time", max);
                    C21501k a = C21501k.m40384a();
                    long j = this.f51286g;
                    JSONObject a2 = a.mo35099a(j - this.f51285f, j);
                    long j2 = this.f51286g;
                    a2.put("lock_monitor", LockMonitorManager.dumpLockInfo(j2 - this.f51285f, j2));
                    long j3 = this.f51286g;
                    String a3 = C12370g.m22223a(j3 - this.f51285f, j3);
                    boolean z2 = false;
                    if (C21614c.f51260g) {
                        a3 = C21613b.m40560a(new C21612a(a3, max));
                        C21613b.f51255d.clear();
                        C21614c.f51260g = false;
                        z = true;
                    } else {
                        C21612a aVar = new C21612a(a3, max);
                        if (C21613b.f51255d == null) {
                            C21613b.f51255d = new LinkedBlockingQueue<>(C21613b.f51253b);
                        }
                        try {
                            if (C21613b.f51255d.size() == C21613b.f51253b) {
                                C21613b.f51255d.take();
                            }
                            C21613b.f51255d.put(aVar);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        z = false;
                    }
                    a2.put("evil_method", a3);
                    jSONObject.put("message", C21512o.m40408a(this.f51289j));
                    jSONObject.put("timestamp", this.f51286g);
                    jSONObject.put("event_type", "lag_drop_frame");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("crash_section", C12397c.m22279a(this.f51291l));
                    jSONObject2.put("block_frame", String.valueOf(this.f51281b));
                    jSONObject2.put("block_input", String.valueOf(this.f51280a));
                    jSONObject2.put("trace_type", "message");
                    if (C21614c.f51259f) {
                        List<String> a4 = C12383l.m22240a(this.f51293n);
                        a2.put("dmt_stack_completion", a4);
                        if (!a4.isEmpty()) {
                            z2 = true;
                        }
                        jSONObject2.put("has_dmt_stack_completion", String.valueOf(z2));
                    }
                    jSONObject.put("custom", a2);
                    jSONObject.put("filters", jSONObject2);
                    C12410d dVar = new C12410d("drop_frame_stack", jSONObject);
                    if (z) {
                        dVar.f30005d = true;
                    }
                    C12401a.m22303b().mo20179a(dVar);
                    C21614c.m40562b("evil_method_end");
                }
            } catch (Exception unused) {
                C21614c.m40562b("evil_method_analyse_exception");
            }
        }

        RunnableC21619a(boolean z, String str, long[] jArr, long[] jArr2, long j, long j2, long j3, String str2, long j4, String str3, C21483g.C21492e eVar, C12383l[] lVarArr) {
            this.f51288i = z;
            this.f51287h = str;
            this.f51285f = j2;
            this.f51284e = j;
            this.f51283d = jArr;
            this.f51282c = jArr2;
            this.f51286g = j3;
            this.f51289j = str2;
            this.f51291l = j4;
            this.f51290k = str3;
            this.f51292m = eVar;
            this.f51293n = lVarArr;
        }
    }

    public C21614c(byte b) {
        this(false, false);
    }

    /* renamed from: a */
    public static void m40561a(long j) {
        if (j < 70) {
            j = 1000;
        }
        f51262n = j;
    }

    /* renamed from: b */
    public static void m40562b(final String str) {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.p1562p.p1564b.C21614c.RunnableC216184 */

            static {
                Covode.recordClassIndex(25259);
            }

            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("evil_method_section", str);
                    C12401a.m22303b().mo20179a(new C12409c("evil_method_tracing", 0, (JSONObject) null, jSONObject, (JSONObject) null, (JSONObject) null));
                } catch (JSONException unused) {
                }
            }
        });
    }

    @Override // com.bytedance.apm.block.AbstractC12350a
    /* renamed from: a */
    public final void mo20106a(String str) {
        C12370g.C12376a aVar;
        super.mo20106a(str);
        C12370g.f29825l = 0;
        C12370g.m22226a(1048574, AbstractC21470a.f50893b);
        if (AbstractC21470a.f50893b - this.f51271p > 300) {
            this.f51268k = this.f51267j;
            this.f51271p = AbstractC21470a.f50893b;
            this.f51267j = C12370g.m22222a("EvilMethodTracer#dispatchBegin", 0);
            if (this.f51266i && (aVar = this.f51268k) != null) {
                try {
                    final long[] a = C12370g.m22228a(aVar);
                    final long j = AbstractC21470a.f50893b;
                    C21501k.m40384a().f51038p.mo20398a(new Runnable() {
                        /* class com.bytedance.p1562p.p1564b.C21614c.RunnableC216173 */

                        static {
                            Covode.recordClassIndex(25258);
                        }

                        public final void run() {
                            LinkedList linkedList = new LinkedList();
                            C21608a.m40549a(a, linkedList, AbstractC21470a.f50893b);
                            C21608a.m40552b(linkedList);
                            if (C21501k.m40384a().mo35101b() != null && linkedList.size() > 2) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }
        this.f51269l = str;
    }

    public C21614c(boolean z, boolean z2) {
        this.f51270m = new long[3];
        this.f51265c = z;
        if (!z2) {
            mo35281b();
        }
        if (f51261h == null) {
            f51261h = this;
        }
    }

    @Override // com.bytedance.apm.block.AbstractC12386d
    /* renamed from: a */
    public final void mo20168a(boolean z, long j, boolean z2) {
        MethodCollector.m26663i(9044);
        m40561a(j);
        f51258e = z;
        f51259f = z2;
        if (z) {
            C13133i.m23618a(new Runnable() {
                /* class com.bytedance.p1562p.p1564b.C21614c.RunnableC216151 */

                static {
                    Covode.recordClassIndex(25256);
                }

                public final void run() {
                    C21614c.this.mo35280a();
                }
            });
            C12370g.m22225a();
            MethodCollector.m26664o(9044);
            return;
        }
        C13133i.m23618a(new Runnable() {
            /* class com.bytedance.p1562p.p1564b.C21614c.RunnableC216162 */

            static {
                Covode.recordClassIndex(25257);
            }

            public final void run() {
                C12364f.f29788r.mo20122b(C21614c.this);
            }
        });
        synchronized (C12370g.f29817d) {
            try {
                if (C12370g.f29815b == 2) {
                    C12370g.f29815b = -1;
                    C12370g.f29816c = true;
                }
            } finally {
                MethodCollector.m26664o(9044);
            }
        }
    }

    @Override // com.bytedance.apm.block.AbstractC12350a
    /* renamed from: a */
    public final void mo20105a(long j, long j2, long j3, long j4, boolean z) {
        String str;
        super.mo20105a(j, j2, j3, j4, z);
        C12370g.m22230b(1048574, AbstractC21470a.f50893b);
        RunnableC21619a aVar = this.f51272q;
        if (aVar != null) {
            aVar.f51281b = z;
            this.f51272q.f51280a = C12364f.f29788r.f29790b.mo20118a();
            C12560b.C12564a.f30567a.mo20387a(this.f51272q);
            this.f51272q = null;
        }
        if (C12370g.f29815b >= 2) {
            int i = C12370g.f29825l;
            C12383l[] lVarArr = new C12383l[i];
            System.arraycopy(C12370g.f29824k, 0, lVarArr, 0, C12370g.f29825l);
            f51264s += i;
            long j5 = j3 - j;
            if (j5 >= f51262n) {
                AbstractC21621d dVar = f51256b;
                if (dVar != null) {
                    dVar.mo20338a(j5, z);
                }
                m40562b("evil_method_begin");
                long[] a = C12370g.m22228a(this.f51267j);
                if (a == null || a.length == 0) {
                    m40562b("evil_method_data_null");
                    return;
                }
                long[] jArr = new long[3];
                System.arraycopy(this.f51270m, 0, jArr, 0, 3);
                String a2 = C12390g.m22258a();
                if (TextUtils.isEmpty(a2)) {
                    str = ActivityLifeObserver.getInstance().getTopActivityClassName();
                } else {
                    str = a2 + "," + ActivityLifeObserver.getInstance().getTopActivityClassName();
                }
                this.f51272q = new RunnableC21619a(ActivityLifeObserver.getInstance().isForeground(), str, a, jArr, j4 - j2, j5, j3, this.f51269l, System.currentTimeMillis(), "uuid", C21501k.m40384a().mo35104e(), lVarArr);
            }
        }
    }
}
