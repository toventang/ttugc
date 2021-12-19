package com.bytedance.android.livesdk.p604qa;

import android.text.SpannableString;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.C9676bi;
import com.bytedance.android.livesdk.model.message.C9678bk;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.al */
public final class C10194al extends AbstractC5877k<C9678bk> {
    static {
        Covode.recordClassIndex(11760);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        C9676bi biVar = ((C9678bk) this.f14737d).f23554a;
        C89219l.m154716b(biVar, "");
        return biVar.f23550e;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        C9676bi biVar = ((C9678bk) this.f14737d).f23554a;
        C89219l.m154716b(biVar, "");
        return new SpannableString(biVar.f23547b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10194al(C9678bk bkVar) {
        super(bkVar);
        C89219l.m154721d(bkVar, "");
    }
}
