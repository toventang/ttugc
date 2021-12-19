package com.p2082ss.android.ugc.aweme.sticker.types.game;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.g */
final /* synthetic */ class C76073g implements AbstractC1729g {

    /* renamed from: a */
    private final C76067b f170921a;

    /* renamed from: b */
    private final Effect f170922b;

    /* renamed from: c */
    private final String f170923c;

    /* renamed from: d */
    private final AbstractC76082o f170924d;

    static {
        Covode.recordClassIndex(89018);
    }

    C76073g(C76067b bVar, Effect effect, String str, AbstractC76082o oVar) {
        this.f170921a = bVar;
        this.f170922b = effect;
        this.f170923c = str;
        this.f170924d = oVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        return this.f170921a.mo119798a(this.f170922b, this.f170923c, this.f170924d, iVar);
    }
}
