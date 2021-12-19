package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.als.dsl.C2553d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.C14395g;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.sticker.C76420x;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$attachStickerComponent$$inlined$apply$lambda$1 */
public final class C67866x6f1e9445 extends AbstractC21603p<C14395g> {
    final /* synthetic */ C2553d $builder$inlined;
    final /* synthetic */ C75972r.AbstractC75974b $listener$inlined;
    final /* synthetic */ AbstractC22186b $parentScene$inlined;
    final /* synthetic */ int $viewId$inlined;

    static {
        Covode.recordClassIndex(79665);
    }

    @Override // com.bytedance.p1559o.AbstractC21603p
    public final C14395g get(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        AbstractC22186b bVar = this.$parentScene$inlined;
        int i = this.$viewId$inlined;
        C75972r.AbstractC75974b bVar2 = this.$listener$inlined;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        return new C14395g(fVar, bVar, i, new C76420x.C76421a(fVar, bVar2));
    }

    public C67866x6f1e9445(C2553d dVar, AbstractC22186b bVar, int i, C75972r.AbstractC75974b bVar2) {
        this.$builder$inlined = dVar;
        this.$parentScene$inlined = bVar;
        this.$viewId$inlined = i;
        this.$listener$inlined = bVar2;
    }
}
