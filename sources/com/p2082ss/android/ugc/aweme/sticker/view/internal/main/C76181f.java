package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76139a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.f */
public final class C76181f implements AbstractC76139a {

    /* renamed from: a */
    private final List<AbstractC75498c> f171139a = new ArrayList();

    /* renamed from: b */
    private final List<AbstractC75498c> f171140b = new ArrayList();

    static {
        Covode.recordClassIndex(89131);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75521f
    /* renamed from: a */
    public final void mo119133a(AbstractC75498c cVar) {
        C89219l.m154721d(cVar, "");
        if (!this.f171139a.contains(cVar)) {
            this.f171139a.add(cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76139a
    /* renamed from: a */
    public final void mo119898a(boolean z) {
        if (z) {
            if (!this.f171139a.isEmpty()) {
                for (AbstractC75498c cVar : this.f171139a) {
                    if (cVar.mo118933b()) {
                        cVar.mo118935d();
                        this.f171140b.add(cVar);
                    }
                }
            }
        } else if (!this.f171140b.isEmpty()) {
            for (AbstractC75498c cVar2 : this.f171140b) {
                cVar2.mo118934c();
            }
            this.f171140b.clear();
        }
    }
}
