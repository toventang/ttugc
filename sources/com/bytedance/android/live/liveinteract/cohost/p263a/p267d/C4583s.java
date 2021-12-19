package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4617b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5710e;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5721p;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.s */
final /* synthetic */ class C4583s implements AbstractC88433f {

    /* renamed from: a */
    private final C4566e f12212a;

    /* renamed from: b */
    private final long f12213b;

    static {
        Covode.recordClassIndex(5159);
    }

    C4583s(C4566e eVar, long j) {
        this.f12212a = eVar;
        this.f12213b = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C4566e eVar = this.f12212a;
        long j = this.f12213b;
        C5702a.m12449a("LinkCross_TurnOnEngine_Timeout", "timeout:".concat(String.valueOf(j)));
        if (!eVar.f12176d.mo10150a(EnumC4440k.CONNECTION_SUCCEED)) {
            C5721p.m12579a(C5721p.f14514b, j);
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "error_code", 103L);
            C3866a.m9474a(jSONObject, "error_msg", 103000 + j);
            C3866a.m9475a(jSONObject, "error_detail", "time_out:".concat(String.valueOf(j)));
            C4617b bVar = C4617b.f12263e;
            C4617b.m10742a((C4617b) "rtc_time_out", (String) jSONObject, (JSONObject) 0);
            C5736v.m12592a(C5710e.m12494a(jSONObject));
            ((C4566e.AbstractC4569a) eVar.f38654y).mo10328a(208);
        }
    }
}
