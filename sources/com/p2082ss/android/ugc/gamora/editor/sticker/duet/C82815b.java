package com.p2082ss.android.ugc.gamora.editor.sticker.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.b */
public final class C82815b extends AbstractC23520b<EditDuetStickerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final int f185111a = R.id.apz;

    /* renamed from: b */
    public final DuetEditStickerLayout f185112b;

    /* renamed from: c */
    private final AbstractC89244h f185113c;

    /* renamed from: d */
    private final AbstractC89171a<EditDuetStickerViewModel> f185114d;

    /* renamed from: e */
    private final C21582f f185115e;

    /* renamed from: f */
    private final AbstractC22186b f185116f;

    static {
        Covode.recordClassIndex(96669);
    }

    /* renamed from: a */
    public final C82818c mo127891a() {
        return (C82818c) this.f185113c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditDuetStickerViewModel> mo23031b() {
        return this.f185114d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f185116f;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185115e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.b$b */
    static final class C82817b extends AbstractC89220m implements AbstractC89171a<EditDuetStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82815b f185118a;

        static {
            Covode.recordClassIndex(96671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82817b(C82815b bVar) {
            super(0);
            this.f185118a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditDuetStickerViewModel invoke() {
            return new EditDuetStickerViewModel(this.f185118a);
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (!this.f185116f.mo36421f(mo127891a())) {
            this.f185116f.mo36387a(this.f185111a, mo127891a(), "EditDuetStickerScene");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.b$a */
    static final class C82816a extends AbstractC89220m implements AbstractC89171a<C82818c> {

        /* renamed from: a */
        final /* synthetic */ C82815b f185117a;

        static {
            Covode.recordClassIndex(96670);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82816a(C82815b bVar) {
            super(0);
            this.f185117a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82818c invoke() {
            C82818c cVar = new C82818c(this.f185117a.f185112b, this.f185117a.getDiContainer());
            Object a = cVar.getDiContainer().mo35249a((Type) AbstractC45899e.class, (String) null);
            C89219l.m154716b(a, "");
            AbstractC45899e eVar = (AbstractC45899e) a;
            C89219l.m154721d(eVar, "");
            cVar.mo127895d().f159176f = eVar;
            return cVar;
        }
    }

    public C82815b(C21582f fVar, AbstractC22186b bVar, DuetEditStickerLayout duetEditStickerLayout) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(duetEditStickerLayout, "");
        this.f185115e = fVar;
        this.f185116f = bVar;
        this.f185112b = duetEditStickerLayout;
        this.f185113c = C89250i.m154773a((AbstractC89171a) new C82816a(this));
        this.f185114d = new C82817b(this);
    }
}
