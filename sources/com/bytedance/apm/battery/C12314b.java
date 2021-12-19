package com.bytedance.apm.battery;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p779k.AbstractC12513a;
import com.bytedance.apm.p779k.p783c.C12532e;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12576b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1097d.C15418q;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.p4398b.AbstractC86058b;
import com.p2082ss.p4398b.C86056a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.b */
public final class C12314b extends AbstractC12513a {

    /* renamed from: a */
    public boolean f29635a;

    /* renamed from: b */
    public int f29636b;

    /* renamed from: c */
    public String f29637c;

    /* renamed from: d */
    public ConcurrentHashMap<String, C12316a> f29638d;

    /* renamed from: e */
    public final Object f29639e;

    /* renamed from: f */
    public long f29640f;

    /* renamed from: g */
    public float f29641g;

    /* renamed from: h */
    public long f29642h;

    /* renamed from: i */
    public long f29643i;

    /* renamed from: j */
    public boolean f29644j;

    /* renamed from: k */
    public C12532e f29645k;

    /* renamed from: l */
    public CopyOnWriteArrayList<Long> f29646l;

    /* renamed from: m */
    public AbstractC86058b f29647m;

    /* renamed from: r */
    private long f29648r;

    static {
        Covode.recordClassIndex(14119);
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: c */
    public final long mo20037c() {
        return this.f29648r;
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: b */
    public final boolean mo20036b() {
        if (!this.f30390o) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo20041g() {
        this.f29640f = 0;
        this.f29641g = 0.0f;
    }

    /* renamed from: com.bytedance.apm.battery.b$b */
    public static final class C12317b {

        /* renamed from: a */
        public static final C12314b f29656a = new C12314b((byte) 0);

        static {
            Covode.recordClassIndex(14122);
        }
    }

    /* renamed from: f */
    public final void mo20040f() {
        if (!TextUtils.isEmpty(this.f29637c)) {
            this.f29637c = null;
            C12560b.C12564a.f30567a.mo20390b(this);
            C86056a.m147813a();
            mo20041g();
        }
    }

    private C12314b() {
        boolean z;
        this.f29638d = new ConcurrentHashMap<>();
        this.f29639e = new Object();
        this.f29640f = 0;
        this.f29641g = 0.0f;
        this.f29642h = 0;
        this.f29643i = 0;
        this.f29645k = C12532e.C12533a.f30442a;
        this.f29646l = new CopyOnWriteArrayList<>();
        this.f29647m = new AbstractC86058b() {
            /* class com.bytedance.apm.battery.C12314b.C123151 */

            static {
                Covode.recordClassIndex(14120);
            }

            @Override // com.p2082ss.p4398b.AbstractC86058b
            /* renamed from: a */
            public final void mo20042a() {
                C12314b.this.mo20041g();
            }

            @Override // com.p2082ss.p4398b.AbstractC86058b
            /* renamed from: b */
            public final void mo20044b() {
                C12314b.this.mo20041g();
            }

            @Override // com.p2082ss.p4398b.AbstractC86058b
            /* renamed from: a */
            public final void mo20043a(float f, long j) {
                synchronized (C12314b.this.f29639e) {
                    if (!TextUtils.isEmpty(C12314b.this.f29637c)) {
                        if (C12314b.this.f30390o || C12314b.this.f29644j) {
                            C12314b.this.mo20040f();
                            return;
                        }
                        if (C12314b.this.f29640f == 0) {
                            C12314b.this.f29642h = C12576b.m22636c();
                            C12314b.this.f29643i = 0;
                            C12314b.this.f29646l.clear();
                        }
                        C12314b.this.f29640f++;
                        C12314b.this.f29641g += f;
                        if (C12314b.this.f29640f > 20) {
                            if (C12314b.this.f29641g > 200.0f) {
                                float f2 = C12314b.this.f29641g / ((float) C12314b.this.f29640f);
                                C12316a aVar = new C12316a();
                                aVar.f29650a = f2;
                                aVar.f29653d = j;
                                aVar.f29651b = C12576b.m22636c() - C12314b.this.f29642h;
                                aVar.f29652c = 0 - C12314b.this.f29643i;
                                CopyOnWriteArrayList<Long> copyOnWriteArrayList = C12314b.this.f29646l;
                                if (!(copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0)) {
                                    for (int i = 0; i < copyOnWriteArrayList.size() - 1; i++) {
                                        aVar.f29654e.append(copyOnWriteArrayList.get(i)).append(',');
                                    }
                                    aVar.f29654e.append(copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1));
                                }
                                C12314b.this.f29638d.put(C12314b.this.f29637c, aVar);
                            }
                            C12314b.this.mo20041g();
                        }
                    }
                }
            }
        };
        this.f30391p = "battery";
        Context context = C12397c.f29931a;
        try {
            Intent b = m22082b(context, new C12318c(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (b != null) {
                int intExtra = b.getIntExtra("status", -1);
                if (intExtra == 2 || intExtra == 5) {
                    z = true;
                } else {
                    z = false;
                }
                this.f29644j = z;
                return;
            }
        } catch (Throwable unused) {
        }
        this.f29644j = true;
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: e */
    public final void mo20039e() {
        super.mo20039e();
        for (Map.Entry<String, C12316a> entry : this.f29638d.entrySet()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("scene", entry.getKey());
                jSONObject.put("current", (double) entry.getValue().f29650a);
                jSONObject.put("capacity", entry.getValue().f29653d);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("cpu_time", entry.getValue().f29651b);
                jSONObject3.put("traffic", entry.getValue().f29652c);
                jSONObject3.put(C15418q.f37639a, entry.getValue().f29654e.toString());
                C12401a.m22303b().mo20179a(new C12412f("battery", "", jSONObject, jSONObject2, jSONObject3, (byte) 0));
            } catch (JSONException unused) {
            }
        }
    }

    /* synthetic */ C12314b(byte b) {
        this();
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d, com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: b */
    public final void mo20035b(Activity activity) {
        super.mo20035b(activity);
    }

    /* renamed from: com.bytedance.apm.battery.b$c */
    public class C12318c extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(14123);
        }

        public C12318c() {
        }

        public final void onReceive(Context context, Intent intent) {
            boolean z;
            int intExtra = intent.getIntExtra("status", -1);
            C12314b bVar = C12314b.this;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            } else {
                z = false;
            }
            bVar.f29644j = z;
            if (C12314b.this.f29644j) {
                synchronized (C12314b.this.f29639e) {
                    C12314b.this.mo20040f();
                }
            }
        }
    }

    /* renamed from: com.bytedance.apm.battery.b$a */
    public class C12316a {

        /* renamed from: a */
        public float f29650a;

        /* renamed from: b */
        public long f29651b;

        /* renamed from: c */
        public long f29652c;

        /* renamed from: d */
        public long f29653d;

        /* renamed from: e */
        StringBuilder f29654e = new StringBuilder();

        static {
            Covode.recordClassIndex(14121);
        }

        public C12316a() {
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d, com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20033a(Activity activity) {
        super.mo20033a(activity);
        C12560b.C12564a.f30567a.mo20390b(this);
        synchronized (this.f29639e) {
            mo20040f();
        }
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20034a(JSONObject jSONObject) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21 || jSONObject.optInt("energy_enable", 0) != 1) {
            z = false;
        }
        this.f29635a = z;
        if (z) {
            this.f29636b = jSONObject.optInt("battery_energy_sample_interval", 3000);
            this.f29648r = jSONObject.optLong("battery_energy_upload_interval", 120000);
            return;
        }
        ActivityLifeObserver.getInstance().unregister(this);
        C12560b.C12564a.f30567a.mo20390b(this);
    }

    /* renamed from: a */
    private static Intent m22081a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m22082b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m22081a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.C12314b.m22082b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
