package com.bytedance.android.livesdk.p424a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.a.k */
final /* synthetic */ class C6430k implements AbstractC88433f {

    /* renamed from: a */
    private final C6424f f16029a;

    /* renamed from: b */
    private final User f16030b;

    /* renamed from: c */
    private final String f16031c;

    static {
        Covode.recordClassIndex(7166);
    }

    C6430k(C6424f fVar, User user, String str) {
        this.f16029a = fVar;
        this.f16030b = user;
        this.f16031c = str;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C6424f fVar = this.f16029a;
        User user = this.f16030b;
        C6501b.C6502a.m13948a("livesdk_mute_click").mo12639a().mo12646a("default_mute_set", ((C3265j) obj).f9352a).mo12651a("to_user_id", user.getIdStr()).mo12651a("entry_point", "admin_pannel").mo12646a("anchor_id", fVar.f16017m).mo12646a("room_id", fVar.f16016l).mo12651a("admin_type", this.f16031c).mo12651a("action_type", "cancel").mo12655b();
    }
}
