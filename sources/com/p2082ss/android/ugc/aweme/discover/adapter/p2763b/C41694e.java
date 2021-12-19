package com.p2082ss.android.ugc.aweme.discover.adapter.p2763b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41695f;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.e */
final /* synthetic */ class C41694e implements C41695f.AbstractC41697b {

    /* renamed from: a */
    private final C41690d f97263a;

    static {
        Covode.recordClassIndex(49607);
    }

    C41694e(C41690d dVar) {
        this.f97263a = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41695f.AbstractC41697b
    /* renamed from: a */
    public final void mo70895a(int i) {
        C41690d dVar = this.f97263a;
        if (i >= 0 && i < dVar.getItemCount()) {
            dVar.f97246a.remove(i);
            dVar.notifyItemRemoved(i);
        }
    }
}
