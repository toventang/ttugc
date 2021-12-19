package com.p2082ss.android.ugc.aweme.ftc.components.sticker.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.b */
public final class C52174b extends AbstractC23520b<FTCEditStickerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    private final AbstractC89171a<FTCEditStickerViewModel> f120200a = C52176b.f120205a;

    /* renamed from: b */
    private final AbstractC89244h f120201b;

    /* renamed from: c */
    private final C21582f f120202c;

    /* renamed from: d */
    private final AbstractC22186b f120203d;

    static {
        Covode.recordClassIndex(61557);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<FTCEditStickerViewModel> mo23031b() {
        return this.f120200a;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f120203d;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120202c;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.b$b */
    static final class C52176b extends AbstractC89220m implements AbstractC89171a<FTCEditStickerViewModel> {

        /* renamed from: a */
        public static final C52176b f120205a = new C52176b();

        static {
            Covode.recordClassIndex(61559);
        }

        C52176b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditStickerViewModel invoke() {
            return new FTCEditStickerViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.b$a */
    static final class C52175a extends AbstractC89220m implements AbstractC89171a<C52177c> {

        /* renamed from: a */
        final /* synthetic */ C52174b f120204a;

        static {
            Covode.recordClassIndex(61558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52175a(C52174b bVar) {
            super(0);
            this.f120204a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52177c invoke() {
            return new C52177c(this.f120204a.getDiContainer());
        }
    }

    public C52174b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f120202c = fVar;
        this.f120203d = bVar;
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) new C52175a(this));
        this.f120201b = a;
        C52177c cVar = (C52177c) a.getValue();
        AbstractC14552j jVar = (AbstractC14552j) getDiContainer().mo35249a(AbstractC14552j.class, (String) null);
        C89219l.m154721d(jVar, "");
        cVar.f120208b = jVar;
        AbstractC45899e eVar = (AbstractC45899e) getDiContainer().mo35249a(AbstractC45899e.class, (String) null);
        C89219l.m154721d(eVar, "");
        cVar.f120209c = eVar;
        AbstractC82035ab abVar = (AbstractC82035ab) getDiContainer().mo35249a(AbstractC82035ab.class, (String) null);
        C89219l.m154721d(abVar, "");
        cVar.f120214h = abVar;
        bVar.mo36387a(R.id.asd, cVar, "FTCEditStickerScene");
    }
}
