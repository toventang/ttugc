package com.p2082ss.android.ugc.aweme.sticker.types.multi;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import p4600h.C89386u;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.f */
public final /* synthetic */ class C76102f implements AbstractC1214u {

    /* renamed from: a */
    private final C76100d f170991a;

    /* renamed from: b */
    private final AbstractC76397b f170992b;

    static {
        Covode.recordClassIndex(89049);
    }

    C76102f(C76100d dVar, AbstractC76397b bVar) {
        this.f170991a = dVar;
        this.f170992b = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C76100d dVar = this.f170991a;
        AbstractC76397b bVar = this.f170992b;
        Object first = ((C89386u) obj).getFirst();
        int b = bVar.mo120097b(first);
        if (b >= 0) {
            dVar.f170984a.notifyItemChanged(b, first);
        }
    }
}
