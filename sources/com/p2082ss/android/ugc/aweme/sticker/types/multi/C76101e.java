package com.p2082ss.android.ugc.aweme.sticker.types.multi;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75652l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.e */
public final /* synthetic */ class C76101e implements AbstractC1214u {

    /* renamed from: a */
    private final C76100d f170990a;

    static {
        Covode.recordClassIndex(89048);
    }

    C76101e(C76100d dVar) {
        this.f170990a = dVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C76100d dVar = this.f170990a;
        C75652l lVar = (C75652l) obj;
        if (lVar != null) {
            int i = lVar.f170065a.f170064b;
            int i2 = lVar.f170066b.f170064b;
            if (i >= 0 && dVar.f170986c != null && i < dVar.f170986c.size()) {
                if (i2 != i) {
                    dVar.f170984a.f170962c = i2;
                    dVar.f170984a.notifyItemChanged(i, dVar.f170986c.get(i));
                }
                if (dVar.f170986c != null && i2 < dVar.f170986c.size()) {
                    dVar.f170984a.notifyItemChanged(i2, dVar.f170986c.get(i2));
                    return;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (dVar.f170986c != null) {
            }
        }
    }
}
