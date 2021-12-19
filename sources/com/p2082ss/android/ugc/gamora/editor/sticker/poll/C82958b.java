package com.p2082ss.android.ugc.gamora.editor.sticker.poll;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.b */
public final class C82958b extends AbstractC23520b<EditPollStickerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final int f185370a = R.id.egw;

    /* renamed from: b */
    public final PollingStickerLayout f185371b;

    /* renamed from: c */
    private final AbstractC89244h f185372c;

    /* renamed from: d */
    private final AbstractC89171a<EditPollStickerViewModel> f185373d;

    /* renamed from: e */
    private final C21582f f185374e;

    /* renamed from: f */
    private final AbstractC22186b f185375f;

    static {
        Covode.recordClassIndex(96821);
    }

    /* renamed from: a */
    public final C82961c mo128032a() {
        return (C82961c) this.f185372c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditPollStickerViewModel> mo23031b() {
        return this.f185373d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f185375f;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185374e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.b$b */
    static final class C82960b extends AbstractC89220m implements AbstractC89171a<EditPollStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82958b f185377a;

        static {
            Covode.recordClassIndex(96823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82960b(C82958b bVar) {
            super(0);
            this.f185377a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditPollStickerViewModel invoke() {
            return new EditPollStickerViewModel(this.f185377a);
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (!this.f185375f.mo36421f(mo128032a())) {
            this.f185375f.mo36387a(this.f185370a, mo128032a(), "EditPollStickerScene");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.b$a */
    static final class C82959a extends AbstractC89220m implements AbstractC89171a<C82961c> {

        /* renamed from: a */
        final /* synthetic */ C82958b f185376a;

        static {
            Covode.recordClassIndex(96822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82959a(C82958b bVar) {
            super(0);
            this.f185376a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82961c invoke() {
            C82961c cVar = new C82961c(this.f185376a.f185371b, this.f185376a.getDiContainer());
            Object a = cVar.getDiContainer().mo35249a((Type) AbstractC45899e.class, (String) null);
            C89219l.m154716b(a, "");
            AbstractC45899e eVar = (AbstractC45899e) a;
            C89219l.m154721d(eVar, "");
            cVar.mo128036d().f159176f = eVar;
            return cVar;
        }
    }

    public C82958b(C21582f fVar, AbstractC22186b bVar, PollingStickerLayout pollingStickerLayout) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(pollingStickerLayout, "");
        this.f185374e = fVar;
        this.f185375f = bVar;
        this.f185371b = pollingStickerLayout;
        this.f185372c = C89250i.m154773a((AbstractC89171a) new C82959a(this));
        this.f185373d = new C82960b(this);
    }
}
