package com.bytedance.android.livesdk.function;

import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.android.livesdk.event.C8453f;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.function.e */
final /* synthetic */ class C8760e implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f21615a = new C8760e();

    static {
        Covode.recordClassIndex(9637);
    }

    private C8760e() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C8453f fVar = (C8453f) obj;
        if (fVar != null && fVar.f20900a != null) {
            C8452e eVar = fVar.f20900a;
            C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_room_notify_widget", 1280, EnumC11866b.MessageReceived));
            eVar.f20899d.f28233c.f28307X = "live_detail";
            C6779a.m14563a().mo13053a(new C8452e(eVar.f20898c, eVar.f20899d));
        }
    }
}
