package com.bytedance.push.p1596g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.C21767c;
import com.bytedance.push.p1590c.AbstractC21774e;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.message.p2159a.C30062a;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.g.d */
public final class C21828d implements AbstractC21774e {

    /* renamed from: a */
    private final C21767c f51722a;

    static {
        Covode.recordClassIndex(25480);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21774e
    /* renamed from: c */
    public final void mo35428c() {
        C21831g.m40905a(0, (JSONObject) null, "update sender success");
    }

    @Override // com.bytedance.push.p1590c.AbstractC21774e
    /* renamed from: d */
    public final void mo35429d() {
        C21831g.m40904a(0, "the out-app switcher upload success", (JSONObject) null);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21774e
    /* renamed from: a */
    public final void mo35420a() {
        C21767c cVar = this.f51722a;
        if (C30062a.m60803a(C30061a.f71748a)) {
            C21825c.f51719b = System.currentTimeMillis();
            C21825c.m40880a().sendEmptyMessageDelayed(2, cVar.f51606z);
        }
    }

    @Override // com.bytedance.push.p1590c.AbstractC21774e
    /* renamed from: b */
    public final void mo35425b() {
        if (C21825c.f51718a.compareAndSet(false, true)) {
            if (C21825c.m40880a().hasMessages(2)) {
                C21825c.m40880a().removeMessages(2);
            }
            C21825c.m40881a(0, System.currentTimeMillis() - C21825c.f51719b);
        }
    }

    public C21828d(C21767c cVar) {
        this.f51722a = cVar;
        C21830f.f51723a = cVar.f51600t;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21774e
    /* renamed from: a */
    public final void mo35421a(int i) {
        MethodCollector.m26663i(5713);
        synchronized (C21831g.f51725b) {
            try {
                if (C21831g.f51725b.get(Integer.valueOf(i)) == null) {
                    C21831g.f51725b.put(Integer.valueOf(i), true);
                    C21831g.f51724a.sendMessageDelayed(C21831g.f51724a.obtainMessage(1001, Integer.valueOf(i)), TimeUnit.MINUTES.toMillis(1));
                    MethodCollector.m26664o(5713);
                }
            } finally {
                MethodCollector.m26664o(5713);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        com.bytedance.push.p1596g.C21831g.m40903a(r7);
        r3 = com.bytedance.push.third.C21922f.m41214a(com.p2082ss.android.message.C30061a.f71748a).mo35678d(r7) + " register success";
        r2 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.put("status", 0);
        r2.put("pushType", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r0.printStackTrace();
     */
    @Override // com.bytedance.push.p1590c.AbstractC21774e
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35426b(int r7) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.p1596g.C21828d.mo35426b(int):void");
    }

    @Override // com.bytedance.push.p1590c.AbstractC21774e
    /* renamed from: a */
    public final void mo35423a(int i, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        switch (i) {
            case 301:
                str2 = "network error";
                break;
            case 302:
                str2 = "server return error";
                break;
            case 303:
                str2 = "server return empty allow_push_list";
                break;
            default:
                str2 = "update_sender api return empty";
                break;
        }
        C21831g.m40905a(i, jSONObject, str2);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21774e
    /* renamed from: b */
    public final void mo35427b(int i, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (i == 301) {
            str2 = "network error";
        } else if (i != 302) {
            str2 = "Server return empty response";
        } else {
            str2 = "Server return not success";
        }
        C21831g.m40904a(i, str2, jSONObject);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21774e
    /* renamed from: a */
    public final void mo35424a(boolean z, String str) {
        if (!z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", 107);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("sender", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            C21830f.m40902a("push_monitor_register_result", jSONObject, null, jSONObject2);
            C21823a.m40878a("1004", 107, "This device does not support the sender/channel delivered by the server", jSONObject2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        com.bytedance.push.p1596g.C21831g.m40903a(r7);
        r3 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.put("pushType", r7);
        r3.put("status", r8);
        r3.put("3rd_code", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r0.printStackTrace();
     */
    @Override // com.bytedance.push.p1590c.AbstractC21774e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35422a(int r7, int r8, java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.p1596g.C21828d.mo35422a(int, int, java.lang.String, java.lang.String):void");
    }
}
