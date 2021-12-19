package com.p2082ss.android.ugc.gamora.editor.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.b */
public final class C82907b extends AbstractC23520b<EditStickerPanelViewModel> implements AbstractC21566a {

    /* renamed from: a */
    private final AbstractC89244h f185271a = C89250i.m154773a((AbstractC89171a) new C82908a(this));

    /* renamed from: b */
    private final AbstractC89171a<EditStickerPanelViewModel> f185272b = new C82909b(this);

    /* renamed from: c */
    private final C21582f f185273c;

    /* renamed from: d */
    private final AbstractC22186b f185274d;

    /* renamed from: e */
    private final int f185275e = R.id.c7m;

    static {
        Covode.recordClassIndex(96767);
    }

    /* renamed from: a */
    public final C82910c mo127990a() {
        return (C82910c) this.f185271a.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditStickerPanelViewModel> mo23031b() {
        return this.f185272b;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f185274d;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185273c;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.b$a */
    static final class C82908a extends AbstractC89220m implements AbstractC89171a<C82910c> {

        /* renamed from: a */
        final /* synthetic */ C82907b f185276a;

        static {
            Covode.recordClassIndex(96768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82908a(C82907b bVar) {
            super(0);
            this.f185276a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82910c invoke() {
            return new C82910c(this.f185276a.getDiContainer());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.b$b */
    static final class C82909b extends AbstractC89220m implements AbstractC89171a<EditStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82907b f185277a;

        static {
            Covode.recordClassIndex(96769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82909b(C82907b bVar) {
            super(0);
            this.f185277a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditStickerPanelViewModel invoke() {
            return new EditStickerPanelViewModel(this.f185277a.mo127990a());
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (!this.f185274d.mo36421f(mo127990a())) {
            this.f185274d.mo36387a(this.f185275e, mo127990a(), "EditStickerPanelScene");
        }
    }

    public C82907b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f185273c = fVar;
        this.f185274d = bVar;
    }
}
