package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.discover.ui.f */
public final /* synthetic */ class C42862f implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC42715b f99949a;

    static {
        Covode.recordClassIndex(50966);
    }

    C42862f(AbstractC42715b bVar) {
        this.f99949a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC42715b bVar = this.f99949a;
        AbstractC42715b.C42721b bVar2 = (AbstractC42715b.C42721b) obj;
        if (bVar2.f99658b && C17873f.f42636l) {
            bVar2.f99657a.mo68645h();
        }
        if (bVar.f99644s != null) {
            bVar.f99644s.dispose();
        }
    }
}
