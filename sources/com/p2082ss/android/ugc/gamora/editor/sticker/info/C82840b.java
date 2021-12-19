package com.p2082ss.android.ugc.gamora.editor.sticker.info;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.b */
public final class C82840b extends AbstractC23520b<EditInfoStickerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final FrameLayout f185156a;

    /* renamed from: b */
    private final AbstractC89171a<EditInfoStickerViewModel> f185157b;

    /* renamed from: c */
    private final AbstractC89244h f185158c;

    /* renamed from: d */
    private final C21582f f185159d;

    /* renamed from: e */
    private final AbstractC22186b f185160e;

    /* renamed from: f */
    private final int f185161f = R.id.bn_;

    static {
        Covode.recordClassIndex(96696);
    }

    /* renamed from: a */
    public final C82843c mo127931a() {
        return (C82843c) this.f185158c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditInfoStickerViewModel> mo23031b() {
        return this.f185157b;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f185160e;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185159d;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.b$b */
    static final class C82842b extends AbstractC89220m implements AbstractC89171a<EditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82840b f185163a;

        static {
            Covode.recordClassIndex(96698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82842b(C82840b bVar) {
            super(0);
            this.f185163a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditInfoStickerViewModel invoke() {
            EditInfoStickerViewModel editInfoStickerViewModel = new EditInfoStickerViewModel();
            C82843c a = this.f185163a.mo127931a();
            C89219l.m154721d(a, "");
            editInfoStickerViewModel.f185143a = a;
            return editInfoStickerViewModel;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (!this.f185160e.mo36421f(mo127931a())) {
            this.f185160e.mo36387a(this.f185161f, mo127931a(), "EditInfoStickerScene");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.b$a */
    static final class C82841a extends AbstractC89220m implements AbstractC89171a<C82843c> {

        /* renamed from: a */
        final /* synthetic */ C82840b f185162a;

        static {
            Covode.recordClassIndex(96697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82841a(C82840b bVar) {
            super(0);
            this.f185162a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82843c invoke() {
            C82843c cVar = new C82843c(this.f185162a.getDiContainer());
            AbstractC14552j jVar = (AbstractC14552j) cVar.getDiContainer().mo35249a((Type) AbstractC14552j.class, (String) null);
            C89219l.m154721d(jVar, "");
            cVar.f185170c = jVar;
            cVar.mo127934E().f159144z = (AbstractC45899e) cVar.getDiContainer().mo35249a((Type) AbstractC45899e.class, (String) null);
            FrameLayout frameLayout = this.f185162a.f185156a;
            C89219l.m154721d(frameLayout, "");
            cVar.f185172e = frameLayout;
            return cVar;
        }
    }

    public C82840b(C21582f fVar, AbstractC22186b bVar, FrameLayout frameLayout) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(frameLayout, "");
        this.f185159d = fVar;
        this.f185160e = bVar;
        this.f185156a = frameLayout;
        this.f185157b = new C82842b(this);
        this.f185158c = C89250i.m154773a((AbstractC89171a) new C82841a(this));
    }
}
