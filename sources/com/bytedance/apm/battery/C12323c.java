package com.bytedance.apm.battery;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.battery.p765e.C12349a;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p779k.AbstractC12513a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.p4398b.C86059c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.c */
public final class C12323c extends AbstractC12513a {

    /* renamed from: a */
    private static int f29667a = 10;

    /* renamed from: b */
    private boolean f29668b;

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: c */
    public final long mo20037c() {
        return 300000;
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: b */
    public final boolean mo20036b() {
        return this.f29668b;
    }

    public C12323c() {
        this.f30391p = "battery";
    }

    static {
        Covode.recordClassIndex(14128);
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: e */
    public final void mo20039e() {
        Intent a;
        int intExtra;
        super.mo20039e();
        if (this.f29668b && !this.f30390o && (a = C12349a.m22189a(C12397c.f29931a, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) != null && (intExtra = a.getIntExtra("status", -1)) != 2 && intExtra != 5) {
            float c = C86059c.m147822c(C12397c.f29931a);
            if (c >= ((float) f29667a)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timing_current", (double) c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
                    m22485a(new C12412f("battery", "", jSONObject, jSONObject2, null, (byte) 0));
                } catch (JSONException unused) {
                }
            }
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d, com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20033a(Activity activity) {
        super.mo20033a(activity);
        C12560b.C12564a.f30567a.mo20390b(this);
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d, com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: b */
    public final void mo20035b(Activity activity) {
        super.mo20035b(activity);
        if (this.f29668b) {
            C12560b.C12564a.f30567a.mo20384a(this);
        }
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20034a(JSONObject jSONObject) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21 || jSONObject.optInt("energy_enable", 0) != 1) {
            z = false;
        }
        this.f29668b = z;
    }
}
