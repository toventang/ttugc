package com.p2082ss.android.ugc.aweme.effect;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46355b;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.n */
public final class C46365n implements AbstractC46355b {

    /* renamed from: a */
    private AbstractC46415f f108062a;

    static {
        Covode.recordClassIndex(54942);
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46355b
    /* renamed from: a */
    public final void mo78863a() {
        AbstractC46415f fVar = this.f108062a;
        if (fVar != null) {
            fVar.destroy();
        }
        this.f108062a = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46355b
    /* renamed from: a */
    public final void mo78864a(IFetchEffectChannelListener iFetchEffectChannelListener) {
        C89219l.m154721d(iFetchEffectChannelListener, "");
        if (this.f108062a == null) {
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            this.f108062a = C46404c.m89554a(application, null);
        }
        AbstractC46415f fVar = this.f108062a;
        if (fVar != null) {
            fVar.mo78907a("editingeffect", false, iFetchEffectChannelListener);
        }
    }
}
