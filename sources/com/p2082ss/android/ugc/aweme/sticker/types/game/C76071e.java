package com.p2082ss.android.ugc.aweme.sticker.types.game;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.e */
final /* synthetic */ class C76071e implements AbstractC1214u {

    /* renamed from: a */
    private final C76067b f170918a;

    /* renamed from: b */
    private final AbstractC76082o f170919b;

    static {
        Covode.recordClassIndex(89016);
    }

    C76071e(C76067b bVar, AbstractC76082o oVar) {
        this.f170918a = bVar;
        this.f170919b = oVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C76067b bVar = this.f170918a;
        AbstractC76082o oVar = this.f170919b;
        if (!C72847c.m128639e(bVar.f170898b)) {
            oVar.mo119813b();
        }
    }
}
