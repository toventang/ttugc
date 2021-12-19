package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.C9717ca;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.o */
public final class C6029o extends AbstractC5877k<C9717ca> {
    static {
        Covode.recordClassIndex(6640);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return ((C9717ca) this.f14737d).f23681g;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
        return C6022k.m13209b(((C9717ca) this.f14737d).f23681g, "：", ((C9717ca) this.f14737d).f23680f, R.color.xy, R.color.a07);
    }

    public C6029o(C9717ca caVar) {
        super(caVar);
    }
}
