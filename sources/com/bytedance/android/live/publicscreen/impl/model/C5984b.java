package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.C9879j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.b */
public final class C5984b extends AbstractC5877k<C9879j> {
    static {
        Covode.recordClassIndex(6594);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return ((C9879j) this.f14737d).f23859a;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        User user = ((C9879j) this.f14737d).f23859a;
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
        return C6022k.m13209b(user, "", " ", R.color.xy, R.color.a07);
    }

    public C5984b(C9879j jVar) {
        super(jVar);
    }
}
