package com.bytedance.monitor.collector;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.p776h.C12482a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p788p.C12569d;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.p1551a.C21471a;
import com.bytedance.monitor.collector.p1551a.C21473c;
import com.bytedance.monitor.collector.p1551a.C21474d;
import com.bytedance.monitor.p1546a.C21429a;
import com.kakao.usermgmt.StringSet;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.monitor.collector.g */
public final class C21483g extends AbstractC21475b {

    /* renamed from: p */
    public static int f50925p = 2;

    /* renamed from: q */
    public static boolean f50926q;

    /* renamed from: f */
    AbstractC21490c f50927f;

    /* renamed from: g */
    public int f50928g;

    /* renamed from: h */
    public volatile int f50929h;

    /* renamed from: i */
    public C21493f f50930i;

    /* renamed from: j */
    public C21489b f50931j;

    /* renamed from: k */
    public String f50932k;

    /* renamed from: l */
    public String f50933l;

    /* renamed from: m */
    public boolean f50934m;

    /* renamed from: n */
    public final C12569d f50935n;

    /* renamed from: o */
    public volatile boolean f50936o;

    /* renamed from: r */
    public Runnable f50937r = new Runnable() {
        /* class com.bytedance.monitor.collector.C21483g.RunnableC214852 */

        /* renamed from: b */
        private long f50948b;

        /* renamed from: c */
        private long f50949c;

        /* renamed from: d */
        private int f50950d = -1;

        /* renamed from: e */
        private int f50951e;

        /* renamed from: f */
        private int f50952f;

        static {
            Covode.recordClassIndex(25112);
        }

        public final void run() {
            C21488a aVar;
            long uptimeMillis = SystemClock.uptimeMillis();
            C21489b bVar = C21483g.this.f50931j;
            if (bVar.f50967c != null) {
                aVar = bVar.f50967c;
                bVar.f50967c = null;
            } else {
                aVar = new C21488a((byte) 0);
            }
            if (this.f50950d == C21483g.this.f50929h) {
                this.f50951e++;
            } else {
                this.f50951e = 0;
                this.f50952f = 0;
                this.f50949c = uptimeMillis;
            }
            this.f50950d = C21483g.this.f50929h;
            int i = this.f50951e;
            if (i > 0 && i - this.f50952f >= C21483g.f50925p && this.f50948b != 0 && uptimeMillis - this.f50949c > 700 && C21483g.this.f50936o) {
                aVar.f50964f = Looper.getMainLooper().getThread().getStackTrace();
                this.f50952f = this.f50951e;
            }
            aVar.f50962d = C21483g.this.f50936o;
            aVar.f50961c = (uptimeMillis - this.f50948b) - 300;
            aVar.f50959a = uptimeMillis;
            long uptimeMillis2 = SystemClock.uptimeMillis();
            this.f50948b = uptimeMillis2;
            aVar.f50960b = uptimeMillis2 - uptimeMillis;
            aVar.f50963e = C21483g.this.f50929h;
            C21483g.this.f50935n.mo20399a(C21483g.this.f50937r, 300);
            C21489b bVar2 = C21483g.this.f50931j;
            if (bVar2.f50968d.size() < bVar2.f50965a) {
                bVar2.f50968d.add(aVar);
                bVar2.f50966b = bVar2.f50968d.size();
                return;
            }
            bVar2.f50966b %= bVar2.f50965a;
            C21488a aVar2 = bVar2.f50968d.set(bVar2.f50966b, aVar);
            aVar2.f50959a = -1;
            aVar2.f50960b = -1;
            aVar2.f50961c = -1;
            aVar2.f50963e = -1;
            aVar2.f50964f = null;
            bVar2.f50967c = aVar2;
            bVar2.f50966b++;
        }
    };

    /* renamed from: s */
    private int f50938s = 100;

    /* renamed from: t */
    private int f50939t = 200;

    /* renamed from: u */
    private long f50940u = -1;

    /* renamed from: v */
    private long f50941v = -1;

    /* renamed from: w */
    private int f50942w = -1;

    /* renamed from: x */
    private long f50943x = -1;

    /* renamed from: y */
    private AbstractC21470a f50944y;

    /* renamed from: z */
    private volatile boolean f50945z;

    /* renamed from: com.bytedance.monitor.collector.g$c */
    public interface AbstractC21490c {
        static {
            Covode.recordClassIndex(25117);
        }

        /* renamed from: a */
        void mo35084a(long[] jArr);
    }

    /* renamed from: com.bytedance.monitor.collector.g$d */
    public static class C21491d {

        /* renamed from: a */
        long f50969a;

        /* renamed from: b */
        long f50970b;

        /* renamed from: c */
        long f50971c;

        /* renamed from: d */
        long f50972d;

        /* renamed from: e */
        long f50973e;

        static {
            Covode.recordClassIndex(25118);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: b */
    public final void mo35058b(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.monitor.collector.g$a */
    public static class C21488a {

        /* renamed from: a */
        long f50959a;

        /* renamed from: b */
        long f50960b;

        /* renamed from: c */
        long f50961c;

        /* renamed from: d */
        boolean f50962d;

        /* renamed from: e */
        int f50963e;

        /* renamed from: f */
        StackTraceElement[] f50964f;

        static {
            Covode.recordClassIndex(25115);
        }

        private C21488a() {
        }

        /* renamed from: a */
        public final JSONObject mo35087a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("startTime", this.f50959a);
                jSONObject.put("cost", this.f50960b);
                jSONObject.put("delay", this.f50961c);
                jSONObject.put("isMessage", String.valueOf(this.f50962d));
                jSONObject.put("seqNum", this.f50963e);
                jSONObject.put("stack", C21512o.m40409a(this.f50964f));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* synthetic */ C21488a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(25110);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: c */
    public final Pair<String, ?> mo35059c() {
        return new Pair<>(this.f50912a, m40354e());
    }

    /* renamed from: com.bytedance.monitor.collector.g$e */
    public static class C21492e {

        /* renamed from: a */
        public long f50974a;

        /* renamed from: b */
        long f50975b;

        /* renamed from: c */
        long f50976c;

        /* renamed from: d */
        int f50977d;

        /* renamed from: e */
        int f50978e;

        /* renamed from: f */
        long f50979f;

        /* renamed from: g */
        long f50980g;

        /* renamed from: h */
        C21473c f50981h;

        /* renamed from: i */
        String f50982i;

        /* renamed from: j */
        public String f50983j;

        /* renamed from: k */
        StackTraceElement[] f50984k;

        /* renamed from: l */
        StackTraceElement[] f50985l;

        /* renamed from: m */
        String f50986m;

        /* renamed from: n */
        String f50987n;

        /* renamed from: o */
        C21491d f50988o;

        static {
            Covode.recordClassIndex(25119);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo35092c() {
            this.f50977d = -1;
            this.f50978e = -1;
            this.f50979f = -1;
            this.f50982i = null;
            this.f50984k = null;
            this.f50985l = null;
            this.f50986m = null;
            this.f50987n = null;
            this.f50988o = null;
            this.f50981h = null;
            this.f50983j = null;
        }

        /* renamed from: b */
        public final String mo35091b() {
            StringBuilder sb = new StringBuilder();
            sb.append("msg:").append(C21512o.m40408a(this.f50982i)).append(",cpuDuration:").append(this.f50980g).append(",duration:").append(this.f50979f).append(",type:").append(this.f50977d).append(",messageCount:").append(this.f50978e).append(",lastDuration:").append(this.f50975b - this.f50976c).append(",start:").append(this.f50974a).append(",end:").append(this.f50975b);
            return sb.toString();
        }

        /* renamed from: a */
        public final JSONObject mo35089a() {
            boolean z;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", C21512o.m40408a(this.f50982i));
                jSONObject.put("cpuDuration", this.f50980g);
                jSONObject.put("duration", this.f50979f);
                jSONObject.put(StringSet.type, this.f50977d);
                jSONObject.put("messageCount", this.f50978e);
                jSONObject.put("lastDuration", this.f50975b - this.f50976c);
                jSONObject.put("start", this.f50974a);
                jSONObject.put("end", this.f50975b);
                StackTraceElement[] stackTraceElementArr = this.f50984k;
                if (stackTraceElementArr != null) {
                    jSONObject.put("block_stack", C21512o.m40409a(stackTraceElementArr));
                }
                jSONObject.put("block_uuid", this.f50987n);
                StackTraceElement[] stackTraceElementArr2 = this.f50985l;
                if (stackTraceElementArr2 != null) {
                    jSONObject.put("sblock_stack", C21512o.m40409a(stackTraceElementArr2));
                }
                jSONObject.put("sblock_uuid", this.f50987n);
                if (TextUtils.isEmpty(this.f50986m)) {
                    jSONObject.put("evil_msg", this.f50986m);
                }
                if (this.f50988o != null) {
                    z = true;
                } else {
                    z = false;
                }
                jSONObject.put("belong_frame", z);
                C21491d dVar = this.f50988o;
                if (dVar != null) {
                    jSONObject.put("vsyncDelayTime", this.f50976c - (dVar.f50969a / 1000000));
                    jSONObject.put("doFrameTime", (this.f50988o.f50970b / 1000000) - this.f50976c);
                    jSONObject.put("inputHandlingTime", (this.f50988o.f50971c / 1000000) - (this.f50988o.f50970b / 1000000));
                    jSONObject.put("animationsTime", (this.f50988o.f50972d / 1000000) - (this.f50988o.f50971c / 1000000));
                    jSONObject.put("performTraversalsTime", (this.f50988o.f50973e / 1000000) - (this.f50988o.f50972d / 1000000));
                    jSONObject.put("drawTime", this.f50975b - (this.f50988o.f50973e / 1000000));
                }
                C21473c cVar = this.f50981h;
                if (cVar != null) {
                    jSONObject.put("service_name", cVar.f50903a);
                    jSONObject.put("service_what", this.f50981h.f50904b);
                    jSONObject.put("service_time", this.f50981h.f50905c);
                    jSONObject.put("service_thread", this.f50981h.f50907e);
                    jSONObject.put("service_token", this.f50981h.f50906d);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* renamed from: a */
        public final void mo35090a(String str, StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2, String str2) {
            if (!TextUtils.isEmpty(str)) {
                this.f50987n = str;
            }
            if (stackTraceElementArr != null) {
                this.f50984k = stackTraceElementArr;
            }
            if (stackTraceElementArr2 != null) {
                this.f50985l = stackTraceElementArr2;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f50986m = str2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.monitor.collector.g$f */
    public static class C21493f {

        /* renamed from: a */
        int f50989a;

        /* renamed from: b */
        int f50990b;

        /* renamed from: c */
        C21492e f50991c;

        /* renamed from: d */
        List<C21492e> f50992d = new ArrayList();

        static {
            Covode.recordClassIndex(25120);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C21492e mo35093a() {
            int i = this.f50990b;
            if (i <= 0) {
                return null;
            }
            return this.f50992d.get(i - 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final List<C21492e> mo35096b() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.f50992d.size() == this.f50989a) {
                for (int i2 = this.f50990b; i2 < this.f50992d.size(); i2++) {
                    arrayList.add(this.f50992d.get(i2));
                }
                while (i < this.f50990b - 1) {
                    arrayList.add(this.f50992d.get(i));
                    i++;
                }
            } else {
                while (i < this.f50992d.size()) {
                    arrayList.add(this.f50992d.get(i));
                    i++;
                }
            }
            return arrayList;
        }

        C21493f(int i) {
            this.f50989a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C21492e mo35094a(int i) {
            C21492e eVar = this.f50991c;
            if (eVar != null) {
                eVar.f50977d = i;
                C21492e eVar2 = this.f50991c;
                this.f50991c = null;
                return eVar2;
            }
            C21492e eVar3 = new C21492e();
            eVar3.f50977d = i;
            return eVar3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo35095a(C21492e eVar) {
            int size = this.f50992d.size();
            int i = this.f50989a;
            if (size < i) {
                this.f50992d.add(eVar);
                this.f50990b = this.f50992d.size();
            } else {
                int i2 = this.f50990b % i;
                this.f50990b = i2;
                C21492e eVar2 = this.f50992d.set(i2, eVar);
                eVar2.mo35092c();
                this.f50991c = eVar2;
                this.f50990b++;
            }
            if (C12482a.f30319b) {
                final String b = eVar.mo35091b();
                C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                    /* class com.bytedance.monitor.collector.C21483g.C21493f.RunnableC214941 */

                    static {
                        Covode.recordClassIndex(25121);
                    }

                    public final void run() {
                    }
                });
            }
        }
    }

    /* renamed from: d */
    public final C21492e mo35083d() {
        C21493f fVar = this.f50930i;
        if (fVar != null && this.f50934m && fVar.mo35093a().f50977d == 8) {
            return this.f50930i.mo35093a();
        }
        return null;
    }

    /* renamed from: e */
    private JSONObject m40354e() {
        JSONArray jSONArray;
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        JSONArray f = m40355f();
        JSONObject a = m40349a(uptimeMillis);
        JSONArray b = m40353b(uptimeMillis);
        try {
            jSONObject.put("history_message", f);
            jSONObject.put("current_message", a);
            jSONObject.put("pending_messages", b);
            C21489b bVar = this.f50931j;
            if (bVar != null) {
                jSONArray = bVar.mo35088a();
            } else {
                jSONArray = null;
            }
            jSONObject.put("check_time_info", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: f */
    private JSONArray m40355f() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i = 0;
            for (C21492e eVar : this.f50930i.mo35096b()) {
                if (eVar != null) {
                    i++;
                    jSONArray.put(eVar.mo35089a().put("id", i));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.monitor.collector.g$b */
    public static class C21489b {

        /* renamed from: a */
        final int f50965a = 300;

        /* renamed from: b */
        int f50966b;

        /* renamed from: c */
        C21488a f50967c;

        /* renamed from: d */
        final List<C21488a> f50968d = new ArrayList(300);

        static {
            Covode.recordClassIndex(25116);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final JSONArray mo35088a() {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            if (this.f50968d.size() == this.f50965a) {
                for (int i2 = this.f50966b - 1; i2 < this.f50968d.size(); i2++) {
                    jSONArray.put(this.f50968d.get(i2).mo35087a());
                }
                while (i < this.f50966b - 1) {
                    jSONArray.put(this.f50968d.get(i).mo35087a());
                    i++;
                }
            } else {
                while (i < this.f50968d.size()) {
                    jSONArray.put(this.f50968d.get(i).mo35087a());
                    i++;
                }
            }
            return jSONArray;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: a */
    public final void mo35073a() {
        super.mo35073a();
        if (!this.f50945z) {
            this.f50945z = true;
            int i = this.f50914c;
            if (i == 0 || i == 1) {
                this.f50938s = 100;
                this.f50939t = 300;
            } else if (i == 2 || i == 3) {
                this.f50938s = 300;
                this.f50939t = 200;
            }
            this.f50930i = new C21493f(this.f50938s);
            C214863 r0 = new AbstractC21470a() {
                /* class com.bytedance.monitor.collector.C21483g.C214863 */

                static {
                    Covode.recordClassIndex(25113);
                }

                @Override // com.bytedance.monitor.collector.AbstractC21470a
                /* renamed from: a */
                public final boolean mo20124a() {
                    return true;
                }

                @Override // com.bytedance.monitor.collector.AbstractC21470a
                /* renamed from: a */
                public final void mo20123a(String str) {
                    C21483g.this.f50936o = true;
                    C21483g.this.f50933l = str;
                    super.mo20123a(str);
                    C21483g.this.mo35082a(true, AbstractC21470a.f50893b);
                }

                @Override // com.bytedance.monitor.collector.AbstractC21470a
                /* renamed from: b */
                public final void mo20125b(String str) {
                    super.mo20125b(str);
                    C21483g.this.f50928g++;
                    C21483g.this.mo35082a(false, AbstractC21470a.f50893b);
                    C21483g gVar = C21483g.this;
                    gVar.f50932k = gVar.f50933l;
                    C21483g.this.f50933l = "no message running";
                    C21483g.this.f50936o = false;
                }
            };
            this.f50944y = r0;
            C21495h.m40378a(r0);
            C21498i.m40382a(C21498i.m40383a());
        }
    }

    /* renamed from: a */
    private JSONObject m40349a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", this.f50933l);
            jSONObject.put("currentMessageCost", j - this.f50941v);
            jSONObject.put("currentMessageCpu", C21506l.m40398c(this.f50942w) - this.f50943x);
            jSONObject.put("messageCount", this.f50928g);
            jSONObject.put("start", this.f50941v);
            jSONObject.put("end", j);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static JSONArray m40353b(long j) {
        MessageQueue a = C21498i.m40383a();
        JSONArray jSONArray = new JSONArray();
        if (a == null) {
            return jSONArray;
        }
        try {
            synchronized (a) {
                Message a2 = C21498i.m40382a(a);
                if (a2 == null) {
                    return jSONArray;
                }
                int i = 0;
                int i2 = 0;
                while (a2 != null && i < 100) {
                    i++;
                    i2++;
                    JSONObject a3 = m40350a(a2, j);
                    try {
                        a3.put("id", i2);
                    } catch (JSONException unused) {
                    }
                    jSONArray.put(a3);
                    a2 = C21498i.m40381a(a2);
                }
                return jSONArray;
            }
        } catch (Throwable unused2) {
            return jSONArray;
        }
    }

    public C21483g(int i) {
        super(i, "block_looper_info");
        C21474d dVar = C21474d.f50908a;
        try {
            Handler handler = (Handler) C21429a.m40228a();
            Field a = C21471a.m40330a((Class<?>) Handler.class, "mCallback");
            dVar.f50911c = (Handler.Callback) a.get(handler);
            a.set(handler, dVar);
        } catch (Throwable unused) {
        }
        this.f50927f = new AbstractC21490c() {
            /* class com.bytedance.monitor.collector.C21483g.C214841 */

            static {
                Covode.recordClassIndex(25111);
            }

            @Override // com.bytedance.monitor.collector.C21483g.AbstractC21490c
            /* renamed from: a */
            public final void mo35084a(long[] jArr) {
                C21492e a;
                if (C21483g.this.f50934m && C21483g.this.f50930i != null && (a = C21483g.this.f50930i.mo35093a()) != null && a.f50977d == 8) {
                    C21491d dVar = new C21491d();
                    if (jArr != null) {
                        dVar.f50969a = jArr[1];
                        dVar.f50970b = jArr[5];
                        dVar.f50971c = jArr[6];
                        dVar.f50972d = jArr[7];
                        dVar.f50973e = jArr[8];
                    }
                    a.f50988o = dVar;
                }
            }
        };
        if (f50926q) {
            C12569d dVar2 = new C12569d("looper_monitor");
            this.f50935n = dVar2;
            dVar2.f30573a.start();
            this.f50931j = new C21489b();
            dVar2.mo20399a(this.f50937r, 300);
            return;
        }
        this.f50935n = null;
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbstractC21475b
    /* renamed from: a */
    public final Pair<String, ?> mo35057a(long j, long j2) {
        return new Pair<>(this.f50912a, m40354e());
    }

    /* renamed from: a */
    private static JSONObject m40350a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
            jSONObject.put("start", message.getWhen());
            jSONObject.put("end", -1);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo35082a(final boolean z, final long j) {
        int i = this.f50929h + 1;
        this.f50929h = i;
        this.f50929h = i & 65535;
        this.f50934m = false;
        if (this.f50940u < 0) {
            this.f50940u = j;
        }
        if (this.f50941v < 0) {
            this.f50941v = j;
        }
        if (this.f50942w < 0) {
            this.f50942w = Process.myTid();
            this.f50943x = SystemClock.currentThreadTimeMillis();
        }
        C21473c cVar = C21474d.f50909b;
        C21474d.f50909b = null;
        int i2 = this.f50939t;
        if (j - this.f50940u > ((long) i2) || cVar != null) {
            long j2 = this.f50941v;
            if (j - j2 <= ((long) i2) && cVar == null) {
                m40351a(9, j, this.f50933l);
            } else if (z) {
                if (this.f50928g == 0) {
                    m40351a(1, j, "no message running");
                } else {
                    m40351a(9, j2, this.f50932k);
                    m40352a(1, j, "no message running", false, null);
                }
            } else if (this.f50928g == 0) {
                m40352a(8, j, this.f50933l, true, cVar);
            } else {
                m40352a(9, j2, this.f50932k, false, null);
                m40352a(8, j, this.f50933l, true, cVar);
            }
        }
        this.f50941v = j;
        final String str = this.f50933l;
        if (this.f50915d) {
            final long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            C21501k.m40384a().f51038p.mo20398a(new Runnable() {
                /* class com.bytedance.monitor.collector.C21483g.RunnableC214874 */

                static {
                    Covode.recordClassIndex(25114);
                }

                public final void run() {
                    if (C21501k.m40384a().mo35101b() != null && z) {
                        C21512o.m40408a(str);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m40351a(int i, long j, String str) {
        m40352a(i, j, str, true, null);
    }

    /* renamed from: a */
    private void m40352a(int i, long j, String str, boolean z, C21473c cVar) {
        this.f50934m = true;
        C21492e a = this.f50930i.mo35094a(i);
        a.f50979f = j - this.f50940u;
        if (z) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a.f50980g = currentThreadTimeMillis - this.f50943x;
            this.f50943x = currentThreadTimeMillis;
        } else {
            a.f50980g = -1;
        }
        a.f50978e = this.f50928g;
        a.f50982i = str;
        a.f50983j = this.f50932k;
        a.f50974a = this.f50940u;
        a.f50975b = j;
        a.f50976c = this.f50941v;
        if (cVar != null) {
            a.f50981h = cVar;
        }
        this.f50930i.mo35095a(a);
        this.f50928g = 0;
        this.f50940u = j;
    }
}
