package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.C9595a;
import com.bytedance.android.livesdk.model.message.p579c.C9700d;
import com.bytedance.android.livesdkapi.p692h.EnumC11780d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.a */
public final class C5983a extends AbstractC5877k<C9595a> {
    static {
        Covode.recordClassIndex(6593);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        if (this.f14737d.f28134O == null || this.f14737d.f28134O.f28144j == null) {
            return null;
        }
        for (C9700d dVar : this.f14737d.f28134O.f28144j.f23648d) {
            if (dVar.f23657a == EnumC11780d.USER.getPieceType() && dVar.f23660d != null) {
                return dVar.f23660d.f23677a;
            }
        }
        return null;
    }

    public C5983a(C9595a aVar) {
        super(aVar);
    }
}
