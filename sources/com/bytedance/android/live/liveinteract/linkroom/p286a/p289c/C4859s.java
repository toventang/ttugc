package com.bytedance.android.live.liveinteract.linkroom.p286a.p289c;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7663b;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.c.s */
final /* synthetic */ class C4859s implements AbstractC88433f {

    /* renamed from: a */
    private final C4840b f12714a;

    /* renamed from: b */
    private final LinkApi.EnumC7287e f12715b;

    static {
        Covode.recordClassIndex(5441);
    }

    C4859s(C4840b bVar, LinkApi.EnumC7287e eVar) {
        this.f12714a = bVar;
        this.f12715b = eVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C4840b bVar = this.f12714a;
        LinkApi.EnumC7287e eVar = this.f12715b;
        C7663b bVar2 = (C7663b) ((C5832d) obj).data;
        if (!TextUtils.isEmpty(bVar2.f18983b)) {
            C6555i.m14021b();
            C6555i.m9463b("invite_issue_check", "initAndTurnOnMultiGuest -> " + bVar2.f18985d);
            bVar.f12688e = false;
            ((C4840b.AbstractC4842a) bVar.f38654y).mo10582a(eVar);
            return;
        }
        bVar.f12688e = false;
        ((C4840b.AbstractC4842a) bVar.f38654y).mo10583a(eVar, new Exception());
    }
}
