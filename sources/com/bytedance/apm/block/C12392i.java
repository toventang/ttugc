package com.bytedance.apm.block;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.C12478h;
import com.bytedance.apm.PerfConfig;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12410d;
import com.bytedance.apm.p776h.C12490f;
import com.bytedance.apm.p779k.C12537f;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p788p.C12569d;
import com.bytedance.common.p900c.C13504c;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.monitor.collector.AbstractC21470a;
import com.bytedance.monitor.collector.C21483g;
import com.bytedance.monitor.collector.C21498i;
import com.bytedance.monitor.collector.C21501k;
import com.bytedance.monitor.collector.C21508m;
import com.bytedance.monitor.collector.C21512o;
import com.bytedance.p802b.p831i.p832a.C13099c;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.block.i */
public class C12392i {

    /* renamed from: e */
    public static long f29901e = 1000;

    /* renamed from: f */
    static boolean f29902f;

    /* renamed from: u */
    private static boolean f29903u;

    /* renamed from: v */
    private static volatile C12392i f29904v;

    /* renamed from: a */
    public C12569d f29905a;

    /* renamed from: b */
    public volatile boolean f29906b;

    /* renamed from: c */
    public long f29907c = 2500;

    /* renamed from: d */
    public long f29908d = 5000;

    /* renamed from: g */
    boolean f29909g;

    /* renamed from: h */
    public boolean f29910h = true;

    /* renamed from: i */
    public final String f29911i = C12392i.class.getName();

    /* renamed from: j */
    public final StringBuilder f29912j = new StringBuilder(1200);

    /* renamed from: k */
    final StringBuilder f29913k = new StringBuilder(1200);

    /* renamed from: l */
    public C12385c f29914l;

    /* renamed from: m */
    C12385c f29915m = null;

    /* renamed from: n */
    public volatile boolean f29916n = false;

    /* renamed from: o */
    public volatile boolean f29917o = false;

    /* renamed from: p */
    public boolean f29918p = true;

    /* renamed from: q */
    public boolean f29919q = true;

    /* renamed from: r */
    public LinkedList<C12410d> f29920r = new LinkedList<>();

    /* renamed from: s */
    final Runnable f29921s = new Runnable() {
        /* class com.bytedance.apm.block.C12392i.RunnableC123931 */

        static {
            Covode.recordClassIndex(14200);
        }

        public final void run() {
            if (C12392i.this.f29914l != null) {
                try {
                    C12392i.this.f29914l.mo20167b();
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    if (!stackTrace[0].getClassName().startsWith(C12392i.this.f29911i)) {
                        C12392i.this.f29914l.f29883n = System.currentTimeMillis();
                        C12392i.this.f29914l.f29885p = stackTrace;
                        if (C12397c.m22288e()) {
                            new TimeoutException("main thread task execute more than " + C12392i.this.f29907c + "ms").setStackTrace(stackTrace);
                        }
                        C12392i.this.f29912j.setLength(0);
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            C12392i.this.f29912j.append("\tat " + stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
                        }
                        C12392i.this.f29914l.f29887r = C12392i.this.f29912j.toString();
                    }
                } catch (Throwable th) {
                    C12478h.C12481b.f30317a.mo20296a(th, "block_deal_exception");
                }
            }
        }
    };

    /* renamed from: t */
    final Runnable f29922t = new Runnable() {
        /* class com.bytedance.apm.block.C12392i.RunnableC123942 */

        static {
            Covode.recordClassIndex(14201);
        }

        public final void run() {
            try {
                if (C12392i.this.f29914l != null) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    if (!stackTrace[0].getClassName().startsWith(C12392i.this.f29911i)) {
                        C12392i.this.f29914l.f29884o = System.currentTimeMillis();
                        C12392i.this.f29914l.f29886q = stackTrace;
                        C12385c cVar = C12392i.this.f29914l;
                        C12537f.m22534a();
                        cVar.f29891v = C12537f.m22535b();
                        C12392i.this.f29914l.f29892w = C12392i.m22268b();
                        C12392i.this.f29914l.f29879j = true;
                    }
                }
            } catch (Throwable th) {
                C12478h.C12481b.f30317a.mo20296a(th, "serious_block_deal_exception");
            }
        }
    };

    /* renamed from: a */
    public final void mo20172a(boolean z) {
        Message a;
        try {
            if (this.f29905a.mo20397a()) {
                C12385c cVar = this.f29915m;
                if (cVar != null) {
                    if (z) {
                        cVar.f29875f = true;
                    }
                    m22270c(this.f29915m);
                    this.f29915m = null;
                }
                C12385c cVar2 = this.f29914l;
                if (cVar2 != null && cVar2.f29876g >= 0) {
                    if (this.f29914l.f29877h == -1) {
                        this.f29914l.f29877h = AbstractC21470a.f50893b;
                        if (this.f29910h) {
                            this.f29905a.mo20400b(this.f29921s);
                            this.f29905a.mo20400b(this.f29922t);
                        }
                        if (this.f29914l.f29877h - this.f29914l.f29876g > this.f29907c) {
                            m22271d(this.f29914l);
                            this.f29914l.f29878i = System.currentTimeMillis();
                            if (!this.f29910h) {
                                this.f29914l.f29882m = true;
                            }
                            this.f29914l.f29873d = z;
                            this.f29914l.f29872c = this.f29916n;
                            mo20170a(this.f29914l.mo20165a());
                            if (this.f29914l.f29877h - this.f29914l.f29876g > this.f29908d && z && this.f29917o) {
                                C12391h.m22261a();
                            }
                        }
                        if (f29903u && this.f29914l.f29877h - this.f29914l.f29876g > f29901e) {
                            if (TextUtils.isEmpty(this.f29914l.f29889t)) {
                                m22271d(this.f29914l);
                            }
                            if (this.f29914l.f29878i == 0) {
                                this.f29914l.f29878i = System.currentTimeMillis();
                            }
                            m22265a(z, this.f29914l.mo20165a());
                        }
                        if (f29902f && (a = C21498i.m40382a(C21498i.m40383a())) != null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            if (a.getTarget() != null && a.getWhen() < uptimeMillis) {
                                this.f29909g = true;
                                this.f29914l.mo20166a(uptimeMillis, null);
                                this.f29905a.mo20399a(this.f29921s, this.f29907c);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20171a(C12410d dVar) {
        while (this.f29920r.size() != 0) {
            if (dVar.f30004c - this.f29920r.getFirst().f30004c >= 0 && dVar.f30004c - this.f29920r.getFirst().f30004c <= 60000) {
                if (((long) this.f29920r.size()) <= 60) {
                    break;
                }
                this.f29920r.removeFirst();
            } else {
                this.f29920r.removeFirst();
            }
        }
        this.f29920r.addLast(dVar);
    }

    static {
        Covode.recordClassIndex(14199);
    }

    /* renamed from: a */
    static C12392i m22262a() {
        if (f29904v == null) {
            synchronized (C12392i.class) {
                if (f29904v == null) {
                    f29904v = new C12392i();
                }
            }
        }
        return f29904v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo20173c() {
        long j = this.f29908d;
        long j2 = this.f29907c;
        if (j < j2) {
            this.f29908d = j2 + 50;
        }
    }

    private C12392i() {
    }

    /* renamed from: b */
    public static JSONObject m22268b() {
        try {
            JSONObject jSONObject = new JSONObject();
            Context context = C12397c.f29931a;
            if (context != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) m22263a(context, "activity")).getMemoryInfo(memoryInfo);
                jSONObject.put("availMem", memoryInfo.availMem);
                jSONObject.put("lowMemory", memoryInfo.lowMemory);
                jSONObject.put("threshold", memoryInfo.threshold);
                jSONObject.put("totalMem", C13504c.f32888a.mo21777a(memoryInfo));
            }
            Runtime runtime = Runtime.getRuntime();
            jSONObject.put("max_memory", runtime.maxMemory());
            jSONObject.put("free_memory", runtime.freeMemory());
            jSONObject.put("total_memory", runtime.totalMemory());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private void m22270c(final C12385c cVar) {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.block.C12392i.RunnableC123953 */

            static {
                Covode.recordClassIndex(14202);
            }

            public final void run() {
                boolean z;
                String sb;
                if (cVar.f29877h - cVar.f29876g > C12392i.this.f29908d && C12556c.m22590e("serious_block_monitor")) {
                    C12392i.this.f29914l.f29893x = C21501k.m40384a().mo35099a(cVar.f29876g, cVar.f29877h);
                }
                if (cVar.f29881l || cVar.f29887r == null || cVar.f29882m) {
                    cVar.f29887r = "Invalid Stack\n";
                }
                if (cVar.f29877h - cVar.f29876g <= C12392i.this.f29908d || cVar.f29879j || !C12392i.this.f29910h) {
                    z = false;
                } else {
                    cVar.f29892w = C12392i.m22268b();
                    C12385c cVar = cVar;
                    C12537f.m22534a();
                    cVar.f29891v = C12537f.m22535b();
                    cVar.f29879j = true;
                    z = true;
                }
                try {
                    String a = C21512o.m40408a(cVar.f29871b);
                    C12392i iVar = C12392i.this;
                    boolean z2 = cVar.f29873d;
                    C12385c cVar2 = cVar;
                    if (iVar.f29918p) {
                        JSONObject b = C12392i.m22269b(cVar2);
                        b.put("stack", cVar2.f29887r);
                        b.put("message", a);
                        b.put("ignore_stack", iVar.f29914l.f29882m);
                        b.put("event_type", "lag");
                        b.put("filters", C12392i.m22264a(z2, cVar2, a));
                        C12410d dVar = new C12410d("block_monitor", b, cVar2.f29876g);
                        iVar.mo20171a(dVar);
                        C12401a.m22303b().mo20179a(dVar);
                    }
                    if (cVar.f29879j) {
                        try {
                            if (C12392i.this.f29906b && C12392i.this.f29910h) {
                                C12392i iVar2 = C12392i.this;
                                C12385c cVar3 = cVar;
                                if (iVar2.f29919q) {
                                    JSONObject a2 = C12392i.m22264a(cVar3.f29873d, cVar3, a);
                                    a2.put("sbuuid", "empty");
                                    JSONObject b2 = C12392i.m22269b(cVar3);
                                    b2.put("message", a);
                                    if (!(cVar3.f29885p == null || cVar3.f29886q == null)) {
                                        int length = cVar3.f29885p.length;
                                        int length2 = cVar3.f29886q.length;
                                        int i = 0;
                                        int i2 = 0;
                                        while (true) {
                                            if (i >= Math.min(length, length2)) {
                                                break;
                                            }
                                            int i3 = (length - i) - 1;
                                            int i4 = (length2 - i) - 1;
                                            if (!cVar3.f29885p[i3].equals(cVar3.f29886q[i4])) {
                                                StackTraceElement stackTraceElement = cVar3.f29885p[i3];
                                                StackTraceElement stackTraceElement2 = cVar3.f29886q[i4];
                                                if (stackTraceElement == stackTraceElement2 || (stackTraceElement != null && stackTraceElement2 != null && stackTraceElement.getClassName().equals(stackTraceElement2.getClassName()) && C12392i.m22266a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C12392i.m22266a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()))) {
                                                    i2++;
                                                }
                                            } else {
                                                i2++;
                                                i++;
                                            }
                                        }
                                        if (i2 == 0) {
                                            a2.put("serious_stack_coincide", "none");
                                        } else if (i2 == length && i2 == length2) {
                                            a2.put("serious_stack_coincide", "full");
                                        } else {
                                            a2.put("serious_stack_coincide", "part");
                                            iVar2.f29913k.setLength(0);
                                            for (int i5 = 0; i5 <= length - i2; i5++) {
                                                iVar2.f29913k.append("\tat ").append(cVar3.f29885p[i5].getClassName()).append(".").append(cVar3.f29885p[i5].getMethodName()).append("(").append(cVar3.f29885p[i5].getFileName()).append(":").append(cVar3.f29885p[i5].getLineNumber()).append(")\n");
                                            }
                                            b2.put("stack1", iVar2.f29913k.toString());
                                            iVar2.f29913k.setLength(0);
                                            for (int i6 = 0; i6 <= length2 - i2; i6++) {
                                                iVar2.f29913k.append("\tat ").append(cVar3.f29886q[i6].getClassName()).append(".").append(cVar3.f29886q[i6].getMethodName()).append("(").append(cVar3.f29886q[i6].getFileName()).append(":").append(cVar3.f29886q[i6].getLineNumber()).append(")\n");
                                            }
                                            b2.put("stack2", iVar2.f29913k.toString());
                                        }
                                        iVar2.f29913k.setLength(0);
                                        while (i2 > 0) {
                                            int i7 = length - i2;
                                            iVar2.f29913k.append("\tat ").append(cVar3.f29885p[i7].getClassName()).append(".").append(cVar3.f29885p[i7].getMethodName()).append("(").append(cVar3.f29885p[i7].getFileName()).append(":").append(cVar3.f29885p[i7].getLineNumber()).append(")\n");
                                            i2--;
                                        }
                                        if (iVar2.f29913k.length() == 0) {
                                            sb = cVar3.f29887r;
                                        } else {
                                            sb = iVar2.f29913k.toString();
                                        }
                                        b2.put("stack", sb);
                                        a2.put("sbuuid", cVar3.f29888s);
                                    }
                                    b2.put("stack_cost", cVar3.f29884o - cVar3.f29883n);
                                    b2.put("filters", a2);
                                    b2.put("event_type", "serious_lag");
                                    b2.put("block_looper_info", cVar3.f29890u);
                                    b2.put("block_cpu_info", cVar3.f29891v);
                                    b2.put("block_memory_info", cVar3.f29892w);
                                    b2.put("custom", cVar3.f29893x);
                                    b2.put("block_error_info", z);
                                    C12410d dVar2 = new C12410d("serious_block_monitor", b2, cVar3.f29876g);
                                    iVar2.mo20171a(dVar2);
                                    C12401a.m22303b().mo20179a(dVar2);
                                }
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    C12385c cVar4 = cVar;
                    if (PerfConfig.f29533a) {
                        JSONObject b3 = C12392i.m22269b(cVar4);
                        JSONObject a3 = C13099c.m23558a().mo20937a(true);
                        a3.put("crash_section", C12397c.m22279a(cVar4.f29878i));
                        a3.put("belong_frame", String.valueOf(cVar4.f29873d));
                        a3.put("belong_dump", String.valueOf(cVar4.f29872c));
                        a3.put("block_stack_type", "messageKey");
                        b3.put("filters", a3);
                        b3.put("event_type", "lag");
                        b3.put("stack", "at " + a + ".*(a.java:-1)");
                        C12410d dVar3 = new C12410d("block_monitor", b3);
                        dVar3.f30003b = true;
                        C12401a.m22303b().mo20179a(dVar3);
                    }
                } catch (Exception unused2) {
                }
            }
        });
    }

    /* renamed from: b */
    static JSONObject m22269b(C12385c cVar) {
        long j = cVar.f29877h - cVar.f29876g;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", cVar.f29878i);
            jSONObject.put("crash_time", cVar.f29878i);
            jSONObject.put("is_main_process", C12397c.m22285b());
            jSONObject.put("process_name", C12397c.m22278a());
            jSONObject.put("block_duration", j);
            jSONObject.put("last_scene", cVar.f29889t);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: d */
    private static void m22271d(C12385c cVar) {
        String a = C12390g.m22258a();
        if (TextUtils.isEmpty(a)) {
            cVar.f29889t = ActivityLifeObserver.getInstance().getTopActivityClassName();
        } else {
            cVar.f29889t = a + "," + ActivityLifeObserver.getInstance().getTopActivityClassName();
        }
    }

    /* renamed from: a */
    private static StackTraceElement[] m22267a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null) {
            return stackTraceElementArr;
        }
        return new StackTraceElement[]{new StackTraceElement("Invalid Stack\n", "a", "a.java", 1)};
    }

    /* renamed from: a */
    public final void mo20169a(long j) {
        if (j < 70) {
            j = 2500;
        }
        this.f29907c = j;
        mo20173c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20170a(C12385c cVar) {
        boolean z;
        StackTraceElement[] stackTraceElementArr;
        if (cVar != null) {
            if (!cVar.f29870a) {
                cVar.mo20167b();
            }
            if (cVar.f29877h - cVar.f29876g >= this.f29908d) {
                z = true;
            } else {
                z = false;
            }
            cVar.f29879j = z;
            C21483g.C21492e e = C21501k.m40384a().mo35104e();
            if (e != null) {
                StackTraceElement[] a = m22267a(cVar.f29885p);
                if (cVar.f29879j) {
                    stackTraceElementArr = m22267a(cVar.f29886q);
                } else {
                    stackTraceElementArr = null;
                }
                e.mo35090a("uuid", a, stackTraceElementArr, null);
            }
            if (cVar.f29880k) {
                m22270c(cVar);
            } else {
                this.f29915m = cVar;
            }
        }
    }

    /* renamed from: a */
    private void m22265a(final boolean z, final C12385c cVar) {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.block.C12392i.RunnableC123964 */

            static {
                Covode.recordClassIndex(14203);
            }

            public final void run() {
                String str;
                JSONObject jSONObject = new JSONObject();
                C21501k a = C21501k.m40384a();
                if (a.f51036n == null || a.f51028f) {
                    str = null;
                } else {
                    str = a.f51036n.mo35081a();
                }
                StringBuilder sb = new StringBuilder();
                long j = cVar.f29877h - cVar.f29876g;
                if (!TextUtils.isEmpty(str)) {
                    String a2 = C21508m.m40405a(str, sb, j);
                    if (C12397c.m22288e()) {
                        C12490f.m22457b("%s", str);
                    }
                    try {
                        jSONObject.put("stack", sb.toString());
                        jSONObject.put("stack_key", a2);
                        jSONObject.put("scene", cVar.f29889t);
                        jSONObject.put("cost_time", j);
                        jSONObject.put("method_time", j);
                        jSONObject.put("monitor_type", "sampling");
                        jSONObject.put("message", C21512o.m40408a(cVar.f29871b));
                        jSONObject.put("event_type", "lag_drop_frame");
                        JSONObject a3 = C13099c.m23558a().mo20937a(true);
                        a3.put("crash_section", C12397c.m22279a(C12392i.this.f29914l.f29878i));
                        a3.put("belong_frame", String.valueOf(z));
                        a3.put("monitor_type", "sample");
                        jSONObject.put("filters", a3);
                        C12401a.m22303b().mo20179a(new C12410d("drop_frame_stack", jSONObject));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    static boolean m22266a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Object m22263a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* renamed from: a */
    static JSONObject m22264a(boolean z, C12385c cVar, String str) {
        JSONObject a = C13099c.m23558a().mo20937a(true);
        a.put("crash_section", C12397c.m22279a(cVar.f29878i));
        a.put("belong_frame", String.valueOf(z));
        a.put("belong_dump", String.valueOf(cVar.f29872c));
        a.put("block_input", String.valueOf(cVar.f29874e));
        a.put("block_frame", String.valueOf(cVar.f29875f));
        a.put("block_message", str);
        a.put("block_stack_type", "stack");
        a.put("buuid", cVar.f29888s);
        a.put("belong_poll_once", String.valueOf(cVar.f29880k));
        return a;
    }
}
