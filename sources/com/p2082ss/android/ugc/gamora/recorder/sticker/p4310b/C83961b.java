package com.p2082ss.android.ugc.gamora.recorder.sticker.p4310b;

import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.sticker.C75404l;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.AbstractC75495c;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.b.b */
public final class C83961b implements AbstractC21566a, AbstractC75495c {

    /* renamed from: a */
    private final C21582f f187436a;

    static {
        Covode.recordClassIndex(97854);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f187436a;
    }

    public C83961b(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f187436a = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.AbstractC75495c
    /* renamed from: a */
    public final AbstractC75573i mo119151a(ActivityC0218d dVar, FrameLayout frameLayout, AbstractC1204m mVar, AbstractC0952i iVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(iVar, "");
        AbstractC84089j jVar = (AbstractC84089j) getDiContainer().mo35249a(AbstractC84089j.class, (String) null);
        return C75404l.m132236a((C75574j) getDiContainer().mo35249a(C75574j.class, (String) null), jVar.mo23167t(), jVar.mo23168u(), (AbstractC84398d) getDiContainer().mo35249a(AbstractC84398d.class, (String) null), (AbstractC75429h) getDiContainer().mo35249a(AbstractC75429h.class, (String) null), getDiContainer()).mo119151a(dVar, frameLayout, mVar, iVar);
    }
}
