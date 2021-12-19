package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.model.message.C9605ai;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.model.message.p579c.C9699c;
import com.bytedance.android.livesdk.model.message.p579c.C9700d;
import com.bytedance.android.livesdk.model.message.p579c.C9707i;
import com.bytedance.android.livesdkapi.p692h.EnumC11780d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collections;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.g */
public final class C6018g extends AbstractC5877k<C9605ai> {
    static {
        Covode.recordClassIndex(6629);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: h_ */
    public final int mo10712h_() {
        return 2131234690;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5871f
    /* renamed from: k */
    public final boolean mo11683k() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return ((C9605ai) this.f14737d).f23316h;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        String a;
        if (mo11702C()) {
            a = C3966y.m9657a((int) R.string.edp);
        } else {
            a = C3966y.m9657a((int) R.string.edq);
        }
        C9698b bVar = new C9698b();
        bVar.f23646b = a;
        C9699c cVar = new C9699c();
        cVar.f23649a = "#ffffff";
        bVar.f23647c = cVar;
        C9707i iVar = new C9707i();
        iVar.f23677a = ((C9605ai) this.f14737d).f23316h;
        C9700d dVar = new C9700d();
        dVar.f23660d = iVar;
        C9699c cVar2 = new C9699c();
        cVar2.f23649a = "#80FFFFFF";
        dVar.f23658b = cVar2;
        dVar.f23657a = EnumC11780d.USER.getPieceType();
        bVar.f23648d = Collections.singletonList(dVar);
        return C7557c.m15540a(a, bVar, this);
    }

    public C6018g(C9605ai aiVar) {
        super(aiVar);
    }
}
