package com.p2082ss.android.ugc.gamora.editor.subtitle;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.subtitle.f */
public final class C83095f extends AbstractC23520b<EditSubtitleViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f185688a;

    /* renamed from: b */
    public final int f185689b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f185690c = C89250i.m154773a((AbstractC89171a) new C83096a(this));

    /* renamed from: d */
    private final AbstractC89171a<EditSubtitleViewModel> f185691d = C83097b.f185694a;

    /* renamed from: e */
    private final C21582f f185692e;

    static {
        Covode.recordClassIndex(96970);
    }

    /* renamed from: a */
    private final EditCaptionScene m143508a() {
        return (EditCaptionScene) this.f185690c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditSubtitleViewModel> mo23031b() {
        return this.f185691d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f185688a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185692e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.f$b */
    static final class C83097b extends AbstractC89220m implements AbstractC89171a<EditSubtitleViewModel> {

        /* renamed from: a */
        public static final C83097b f185694a = new C83097b();

        static {
            Covode.recordClassIndex(96972);
        }

        C83097b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditSubtitleViewModel invoke() {
            return new EditSubtitleViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        m143508a();
        m143508a().mo115709b(true);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        m143508a().mo115709b(false);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.f$a */
    static final class C83096a extends AbstractC89220m implements AbstractC89171a<EditCaptionScene> {

        /* renamed from: a */
        final /* synthetic */ C83095f f185693a;

        static {
            Covode.recordClassIndex(96971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83096a(C83095f fVar) {
            super(0);
            this.f185693a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditCaptionScene invoke() {
            C89219l.m154716b(C20531t.m38716a(C22228c.m41832b(this.f185693a.f185688a)).mo33800a(EditInfoStickerViewModel.class), "");
            EditCaptionScene editCaptionScene = new EditCaptionScene(this.f185693a.getDiContainer());
            this.f185693a.f185688a.mo36387a(this.f185693a.f185689b, editCaptionScene, "EditCaptionScene");
            return editCaptionScene;
        }
    }

    public C83095f(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f185692e = fVar;
        this.f185688a = bVar;
    }
}
