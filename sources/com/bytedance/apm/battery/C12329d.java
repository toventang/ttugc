package com.bytedance.apm.battery;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p779k.AbstractC12513a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.d */
public final class C12329d extends AbstractC12513a {

    /* renamed from: a */
    private BroadcastReceiver f29705a;

    /* renamed from: b */
    private IntentFilter f29706b;

    /* renamed from: c */
    private boolean f29707c;

    static {
        Covode.recordClassIndex(14134);
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: b */
    public final boolean mo20036b() {
        return false;
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: c */
    public final long mo20037c() {
        return 0;
    }

    public C12329d() {
        this.f30391p = "battery";
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20032a() {
        this.f29705a = new BroadcastReceiver() {
            /* class com.bytedance.apm.battery.C12329d.C123301 */

            static {
                Covode.recordClassIndex(14135);
            }

            public final void onReceive(Context context, Intent intent) {
                final float intExtra = ((float) intent.getIntExtra("temperature", 0)) / 10.0f;
                final float intExtra2 = (((float) intent.getIntExtra("level", 0)) * 100.0f) / ((float) intent.getIntExtra("scale", 100));
                final String topActivityClassName = ActivityLifeObserver.getInstance().getTopActivityClassName();
                if (!TextUtils.isEmpty(topActivityClassName)) {
                    C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                        /* class com.bytedance.apm.battery.C12329d.C123301.RunnableC123311 */

                        static {
                            Covode.recordClassIndex(14136);
                        }

                        public final void run() {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("battery_temperature", (double) intExtra);
                                jSONObject.put("remaining_energy", (double) intExtra2);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("scene", topActivityClassName);
                                C12401a.m22303b().mo20179a(new C12412f("temperature", "", jSONObject, jSONObject2, null, (byte) 0));
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        };
        this.f29706b = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d, com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: b */
    public final void mo20035b(Activity activity) {
        super.mo20035b(activity);
        if (!this.f29707c) {
            try {
                m22116b(C12397c.f29931a, this.f29705a, this.f29706b);
                this.f29707c = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d, com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20033a(Activity activity) {
        super.mo20033a(activity);
        if (this.f29707c) {
            try {
                C12397c.f29931a.unregisterReceiver(this.f29705a);
                this.f29707c = false;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20034a(JSONObject jSONObject) {
        super.mo20034a(jSONObject);
        boolean z = false;
        if (jSONObject.optInt("temperature_enable_upload", 0) == 1) {
            z = true;
        }
        this.f30392q = z;
    }

    /* renamed from: a */
    private static Intent m22115a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m22116b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m22115a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.C12329d.m22116b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
