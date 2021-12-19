package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.impl.model.chat.AbstractC5988a;
import com.bytedance.android.livesdk.model.message.C9620at;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.h */
public final class C6019h extends AbstractC5988a<C9620at> {

    /* renamed from: h */
    private long f15105h;

    static {
        Covode.recordClassIndex(6630);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.impl.model.chat.AbstractC5988a
    /* renamed from: B */
    public final boolean mo11701B() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        return ((C9620at) this.f14737d).f23421g;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return ((C9620at) this.f14737d).f23422h;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h
    /* renamed from: m */
    public final boolean mo11687m() {
        if (!mo11702C()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5869d
    /* renamed from: f */
    public final void mo11678f() {
        CharSequence z = mo11710z();
        if (z == null) {
            return;
        }
        if (mo11702C()) {
            C6501b.C6502a.m13948a("livesdk_anchor_room_detail_show").mo12639a().mo12651a("live_info_content", z.toString()).mo12655b();
            return;
        }
        C6501b.C6502a.m13948a("livesdk_room_detail_audience_show").mo12639a().mo12651a("live_info_content", z.toString()).mo12655b();
        this.f15105h = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5869d
    /* renamed from: g */
    public final void mo11679g() {
        CharSequence z = mo11710z();
        if (!mo11702C() && z != null) {
            C6501b.C6502a.m13948a("livesdk_room_detail_audience_show_duration").mo12639a().mo12651a("live_info_content", z.toString()).mo12645a("duration", (int) (System.currentTimeMillis() - this.f15105h)).mo12655b();
        }
    }

    public C6019h(C9620at atVar) {
        super(atVar);
    }
}
