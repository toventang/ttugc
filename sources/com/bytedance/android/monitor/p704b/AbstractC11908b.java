package com.bytedance.android.monitor.p704b;

import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.b.b */
public abstract class AbstractC11908b extends AbstractC11907a {

    /* renamed from: a */
    public String f28462a;

    static {
        Covode.recordClassIndex(13634);
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a, com.bytedance.android.monitor.p704b.AbstractC11912f
    /* renamed from: a */
    public final JSONObject mo19116a() {
        JSONObject a = super.mo19116a();
        C11950d.m21101a(a, "event_type", this.f28462a);
        return a;
    }

    public AbstractC11908b(String str) {
        this.f28462a = str;
    }
}
