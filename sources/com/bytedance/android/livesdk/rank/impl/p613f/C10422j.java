package com.bytedance.android.livesdk.rank.impl.p613f;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.rank.api.model.C10348b;
import com.bytedance.android.livesdk.rank.impl.p613f.C10414c;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.rank.impl.f.j */
public final /* synthetic */ class C10422j implements AbstractC88433f {

    /* renamed from: a */
    private final C10414c.AbstractC10415a f25135a;

    static {
        Covode.recordClassIndex(11996);
    }

    C10422j(C10414c.AbstractC10415a aVar) {
        this.f25135a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C10414c.AbstractC10415a aVar = this.f25135a;
        C11625a aVar2 = (C11625a) obj;
        aVar.mo17285c().f25001a.setFollowStatus(aVar2.f27775a.f27934e);
        if (aVar2.f27775a.mo18452b()) {
            aVar.mo17283a();
            C10348b c = aVar.mo17285c();
            C89219l.m154721d(c, "");
            C6501b.C6502a.m13948a("follow").mo12639a().mo12652a(C10424l.m18944a(c)).mo12655b();
            return;
        }
        aVar.mo17284b();
    }
}
