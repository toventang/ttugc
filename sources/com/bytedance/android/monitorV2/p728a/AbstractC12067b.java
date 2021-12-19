package com.bytedance.android.monitorV2.p728a;

import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.a.b */
public abstract class AbstractC12067b extends AbstractC12066a {

    /* renamed from: a */
    public String f28927a;

    static {
        Covode.recordClassIndex(13796);
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12071f, com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final JSONObject mo19416a() {
        JSONObject a = super.mo19416a();
        C12130f.m21652a(a, "event_type", this.f28927a);
        return a;
    }

    public String toString() {
        return "BaseNativeInfo{eventType='" + this.f28927a + '\'' + '}';
    }

    public AbstractC12067b(String str) {
        this.f28927a = str;
    }
}
