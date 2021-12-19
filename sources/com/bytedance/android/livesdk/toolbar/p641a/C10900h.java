package com.bytedance.android.livesdk.toolbar.p641a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.view.C4094h;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.gift.C4332h;
import com.bytedance.android.live.gift.C4333i;
import com.bytedance.android.livesdk.C11300w;
import com.bytedance.android.livesdk.guide.C8915c;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideBubbleDurationSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9064cc;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.toolbar.a.h */
public final /* synthetic */ class C10900h implements AbstractC88433f {

    /* renamed from: a */
    private final C10898f f26197a;

    static {
        Covode.recordClassIndex(12508);
    }

    C10900h(C10898f fVar) {
        this.f26197a = fVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C10898f fVar = this.f26197a;
        C4332h hVar = (C4332h) obj;
        if (fVar.f26190a != null && fVar.f26190a.getContext() != null && fVar.f26191b != null && C9064cc.m17355a(fVar.f26191b)) {
            View a = C2690b.m7784a(R.layout.bdf, null);
            ((TextView) a.findViewById(R.id.fai)).setText(C3966y.m9660a((int) R.string.e2e, C11115u.m19743a().mo17915b().mo13147a().getDisplayId()));
            ((TextView) a.findViewById(R.id.adm)).setText(C11300w.m20049a(hVar.f11878a));
            C4097j.m9925a(new C4094h.C4095a(fVar.f26190a).mo9529a(a).mo9555a(fVar.f26194e).mo9554a(((long) LiveGuideBubbleDurationSetting.INSTANCE.getValue()) * 1000).mo9530b());
            C8915c.f21976a = true;
            C6501b a2 = C6501b.C6502a.m13948a("gift_guide_bubble_show").mo12639a();
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            a2.mo12646a("user_id", b.mo13161c()).mo12655b();
            if (fVar.f26191b != null) {
                fVar.f26191b.mo28315b(C4333i.class, (Object) true);
            }
        }
    }
}
