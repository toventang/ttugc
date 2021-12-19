package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4577m;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4578n;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.g */
final /* synthetic */ class View$OnClickListenerC4818g implements View.OnClickListener {

    /* renamed from: a */
    private final LinkCrossRoomWidget f12669a;

    static {
        Covode.recordClassIndex(5400);
    }

    View$OnClickListenerC4818g(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f12669a = linkCrossRoomWidget;
    }

    public final void onClick(View view) {
        C4566e eVar = this.f12669a.f12643g;
        C11115u.m19743a().mo17915b().mo13150a(((C6865d.AbstractC6866a) new C6865d.C6867b().mo13134a(eVar.f12176d.f11958f)).mo13138b(eVar.f12173a.getId()).mo13141c()).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C4577m(eVar), C4578n.f12207a);
    }
}
