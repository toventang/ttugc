package com.p2082ss.android.ugc.aweme.i18n.musically.cut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53497n;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.p */
final /* synthetic */ class RunnableC53502p implements Runnable {

    /* renamed from: a */
    private final C53497n f122823a;

    /* renamed from: b */
    private final C53497n.C53500b f122824b;

    /* renamed from: c */
    private final int f122825c;

    static {
        Covode.recordClassIndex(63075);
    }

    RunnableC53502p(C53497n nVar, C53497n.C53500b bVar, int i) {
        this.f122823a = nVar;
        this.f122824b = bVar;
        this.f122825c = i;
    }

    public final void run() {
        C53497n nVar = this.f122823a;
        C53497n.C53500b bVar = this.f122824b;
        int i = this.f122825c;
        bVar.f122818f.setVisibility(4);
        bVar.f122818f.setAlpha(1.0f);
        nVar.notifyItemChanged(i);
        nVar.f122794a = false;
    }
}
