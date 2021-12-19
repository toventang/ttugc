package com.p2082ss.android.ugc.aweme.sticker.types.multi;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.g */
public final /* synthetic */ class C76103g implements AbstractC1214u {

    /* renamed from: a */
    private final C76100d f170993a;

    static {
        Covode.recordClassIndex(89050);
    }

    C76103g(C76100d dVar) {
        this.f170993a = dVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C76100d dVar = this.f170993a;
        C20391d dVar2 = (C20391d) obj;
        if (dVar2 != null) {
            dVar2.mo33724a(new C76104h(dVar));
        }
    }
}
