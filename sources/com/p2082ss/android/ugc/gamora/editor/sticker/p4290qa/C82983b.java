package com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.qasticker.C65863a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa.QaStickerEditLayout;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.b */
public final class C82983b extends AbstractC23520b<EditPageQaStickerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final C65863a f185414a;

    /* renamed from: b */
    public final int f185415b = R.id.dbl;

    /* renamed from: c */
    public final QaStickerEditLayout f185416c;

    /* renamed from: d */
    private final AbstractC89244h f185417d;

    /* renamed from: e */
    private final AbstractC89171a<EditPageQaStickerViewModel> f185418e;

    /* renamed from: f */
    private final C21582f f185419f;

    /* renamed from: k */
    private final AbstractC22186b f185420k;

    static {
        Covode.recordClassIndex(96848);
    }

    /* renamed from: a */
    public final C82986c mo128065a() {
        return (C82986c) this.f185417d.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditPageQaStickerViewModel> mo23031b() {
        return this.f185418e;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f185420k;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185419f;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.b$b */
    static final class C82985b extends AbstractC89220m implements AbstractC89171a<EditPageQaStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82983b f185422a;

        static {
            Covode.recordClassIndex(96850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82985b(C82983b bVar) {
            super(0);
            this.f185422a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditPageQaStickerViewModel invoke() {
            C82983b bVar = this.f185422a;
            return new EditPageQaStickerViewModel(bVar, bVar.f185414a);
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (!this.f185420k.mo36421f(mo128065a())) {
            this.f185420k.mo36387a(this.f185415b, mo128065a(), "EditPageQaStickerScene");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.b$a */
    static final class C82984a extends AbstractC89220m implements AbstractC89171a<C82986c> {

        /* renamed from: a */
        final /* synthetic */ C82983b f185421a;

        static {
            Covode.recordClassIndex(96849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82984a(C82983b bVar) {
            super(0);
            this.f185421a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82986c invoke() {
            this.f185421a.f185416c.setMobHelper(this.f185421a.f185414a);
            C82986c cVar = new C82986c(this.f185421a.f185416c, this.f185421a.getDiContainer(), this.f185421a.f185414a);
            Object a = cVar.getDiContainer().mo35249a((Type) AbstractC45899e.class, (String) null);
            C89219l.m154716b(a, "");
            AbstractC45899e eVar = (AbstractC45899e) a;
            C89219l.m154721d(eVar, "");
            cVar.mo128071d().f159176f = eVar;
            return cVar;
        }
    }

    public C82983b(C21582f fVar, AbstractC22186b bVar, QaStickerEditLayout qaStickerEditLayout, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(qaStickerEditLayout, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f185419f = fVar;
        this.f185420k = bVar;
        this.f185416c = qaStickerEditLayout;
        this.f185414a = new C65863a(videoPublishEditModel, 1);
        this.f185417d = C89250i.m154773a((AbstractC89171a) new C82984a(this));
        this.f185418e = new C82985b(this);
    }
}
