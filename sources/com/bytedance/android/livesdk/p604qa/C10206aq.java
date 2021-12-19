package com.bytedance.android.livesdk.p604qa;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.C9681bn;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.aq */
public final class C10206aq extends AbstractC5877k<C9681bn> {
    static {
        Covode.recordClassIndex(11772);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        int i;
        Boolean valueOf = Boolean.valueOf(((C9681bn) this.f14737d).f23557a);
        C89219l.m154716b(valueOf, "");
        if (valueOf.booleanValue()) {
            i = R.string.emv;
        } else {
            i = R.string.els;
        }
        return C3966y.m9657a(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10206aq(C9681bn bnVar) {
        super(bnVar);
        C89219l.m154721d(bnVar, "");
    }
}
