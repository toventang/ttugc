package com.p2082ss.android.ugc.aweme.xsearch;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;

/* renamed from: com.ss.android.ugc.aweme.xsearch.e */
public final class C81690e implements AbstractC51044b {

    /* renamed from: a */
    public AbstractC51044b f182662a;

    /* renamed from: b */
    public final AbstractC34186b.AbstractC34192d f182663b;

    static {
        Covode.recordClassIndex(95094);
    }

    public C81690e(AbstractC34186b.AbstractC34192d dVar) {
        this.f182663b = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b
    /* renamed from: a */
    public final void mo60482a(Aweme aweme) {
        AbstractC34186b.AbstractC34192d dVar = this.f182663b;
        if (dVar != null) {
            C34181a.m69861d(dVar);
        }
        AbstractC51044b bVar = this.f182662a;
        if (bVar != null) {
            bVar.mo60482a(aweme);
        }
    }
}
