package com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2469a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36055u;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.a.b */
final /* synthetic */ class C35845b implements C36055u.AbstractC36057b {

    /* renamed from: a */
    private final C35843a f84616a;

    static {
        Covode.recordClassIndex(43084);
    }

    C35845b(C35843a aVar) {
        this.f84616a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36055u.AbstractC36057b
    /* renamed from: a */
    public final void mo62954a(int i) {
        C35843a aVar = this.f84616a;
        if (i >= 0 && i < aVar.getItemCount()) {
            aVar.f84612a.remove(i);
            aVar.notifyItemRemoved(i);
        }
    }
}
