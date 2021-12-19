package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4484g;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.z */
public final class C4591z implements C4484g.AbstractC4485a {

    /* renamed from: a */
    public C4484g.AbstractC4486b f12222a;

    /* renamed from: b */
    public final DataChannel f12223b;

    static {
        Covode.recordClassIndex(5167);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4484g.AbstractC4485a
    /* renamed from: a */
    public final void mo10269a() {
        C4384b.C4385a.m10496a().f11927Q = true;
        C4502a.m10578a(C4502a.EnumC4505b.DISCONNECT);
        C4484g.AbstractC4486b bVar = this.f12222a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4484g.AbstractC4485a
    /* renamed from: b */
    public final void mo10270b() {
        C4384b.C4385a.m10496a().f11927Q = true;
        C4502a.m10578a(C4502a.EnumC4505b.CHANGE_PAIRING);
        C4484g.AbstractC4486b bVar = this.f12222a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public C4591z(DataChannel dataChannel) {
        this.f12223b = dataChannel;
    }
}
