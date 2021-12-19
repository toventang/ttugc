package com.bytedance.apm.battery.p762d;

import com.bytedance.apm.battery.p759a.C12313a;
import com.bytedance.apm.battery.p760b.AbstractC12322d;
import com.bytedance.apm.battery.p761c.C12328b;
import com.bytedance.apm.battery.p762d.p763a.C12336c;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12410d;
import com.bytedance.apm.p772e.C12447a;
import com.bytedance.apm.p779k.C12516b;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.d.f */
public final class C12342f extends AbstractC12332a<C12336c> implements AbstractC12322d {
    static {
        Covode.recordClassIndex(14147);
    }

    @Override // com.bytedance.apm.battery.p760b.AbstractC12322d
    /* renamed from: a */
    public final String mo20049a() {
        return "android.os.IPowerManager";
    }

    public C12342f() {
        super("power");
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g
    /* renamed from: a */
    public final void mo20083a(C12328b bVar, C12447a aVar) {
        if (!this.f29734a.equals(aVar.f30227d)) {
            return;
        }
        if (aVar.f30225b) {
            bVar.f29683e += aVar.f30230g;
            return;
        }
        bVar.f29688j += aVar.f30230g;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.apm.battery.d.a.b, long] */
    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p762d.AbstractC12332a
    /* renamed from: a */
    public final /* synthetic */ void mo20066a(C12336c cVar, long j) {
        C12336c cVar2 = cVar;
        if (j >= C12313a.f29627a) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", "battery_trace");
                jSONObject.put("issue_type", 16).put("single_hold_time", j).put("wake_lock_info", cVar2.toString());
                C12516b.m22504a(jSONObject, "battery_trace");
                C12401a.m22303b().mo20179a(new C12410d("battery_trace", jSONObject));
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p762d.AbstractC12332a
    /* renamed from: a */
    public final void mo20064a(double d, double d2) {
        int i;
        if (d >= ((double) C12313a.f29629c)) {
            i = 17;
        } else {
            i = 0;
        }
        if (d2 >= ((double) C12313a.f29628b)) {
            i |= 18;
        }
        if (i != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", i).put("total_hold_time", d).put("total_acquire_count", d2);
                if (this.f29737d != null && this.f29737d.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (C12336c cVar : this.f29737d.values()) {
                        jSONArray.put(cVar.mo20076a());
                    }
                    jSONObject.put("detail", jSONArray);
                }
                C12516b.m22504a(jSONObject, "battery_trace");
                C12401a.m22303b().mo20179a(new C12410d("battery_trace", jSONObject));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f3, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @Override // com.bytedance.apm.battery.p760b.AbstractC12322d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20050a(java.lang.reflect.Method r6, java.lang.Object[] r7) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.p762d.C12342f.mo20050a(java.lang.reflect.Method, java.lang.Object[]):void");
    }
}
