package com.bytedance.android.live.liveinteract.multiguest.p316a.p322f;

import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.f.c */
final /* synthetic */ class C5184c implements AbstractC88433f {

    /* renamed from: a */
    private final C5182a f13416a;

    static {
        Covode.recordClassIndex(5776);
    }

    C5184c(C5182a aVar) {
        this.f13416a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C5182a aVar = this.f13416a;
        Throwable th = (Throwable) obj;
        aVar.f13404c = false;
        if (aVar.f14407f != null) {
            C5702a.m12449a("LinkIn_Guest_Apply_Failed", "throwable:".concat(String.valueOf(th)));
            JSONObject jSONObject = new JSONObject();
            C5714i.m12488a(jSONObject, th);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14493i);
            C5714i.m12550a(false, "apply_failed", jSONObject, 1);
            ((C5134a.AbstractC5136b) aVar.f14407f).mo10879a(th);
        }
    }
}
