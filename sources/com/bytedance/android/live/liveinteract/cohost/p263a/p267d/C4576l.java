package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e;
import com.bytedance.android.live.liveinteract.match.p304c.C5009a;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.l */
final /* synthetic */ class C4576l implements AbstractC88433f {

    /* renamed from: a */
    private final C4566e f12205a;

    static {
        Covode.recordClassIndex(5152);
    }

    C4576l(C4566e eVar) {
        this.f12205a = eVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C4566e eVar = this.f12205a;
        Throwable th = (Throwable) obj;
        if (!(th instanceof C2912a) || ((C2908a) th).getErrorCode() != 0) {
            ((C4566e.AbstractC4569a) eVar.f38654y).mo10332b(false);
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "event_id", "battle_icon_show_error");
            C3866a.m9474a(jSONObject, "channel_id", C4384b.C4385a.m10496a().f11957e);
            C5009a.m12482a(th, jSONObject);
            C5009a.m11212a(jSONObject);
            return;
        }
        ((C4566e.AbstractC4569a) eVar.f38654y).mo10332b(true);
    }
}
