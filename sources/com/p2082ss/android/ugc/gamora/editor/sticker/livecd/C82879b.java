package com.p2082ss.android.ugc.gamora.editor.sticker.livecd;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.b */
public final class C82879b extends AbstractC23520b<EditLiveCDStickerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final int f185223a = R.id.egv;

    /* renamed from: b */
    public final LiveCDEditStickerLayout f185224b;

    /* renamed from: c */
    private final AbstractC89244h f185225c;

    /* renamed from: d */
    private final AbstractC89171a<EditLiveCDStickerViewModel> f185226d;

    /* renamed from: e */
    private final C21582f f185227e;

    /* renamed from: f */
    private final AbstractC22186b f185228f;

    static {
        Covode.recordClassIndex(96737);
    }

    /* renamed from: a */
    public final C82882c mo127966a() {
        return (C82882c) this.f185225c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditLiveCDStickerViewModel> mo23031b() {
        return this.f185226d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f185228f;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185227e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.b$b */
    static final class C82881b extends AbstractC89220m implements AbstractC89171a<EditLiveCDStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82879b f185230a;

        static {
            Covode.recordClassIndex(96739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82881b(C82879b bVar) {
            super(0);
            this.f185230a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditLiveCDStickerViewModel invoke() {
            return new EditLiveCDStickerViewModel(this.f185230a);
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (!this.f185228f.mo36421f(mo127966a())) {
            this.f185228f.mo36387a(this.f185223a, mo127966a(), "EditLiveCountDownStickerScene");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.b$a */
    static final class C82880a extends AbstractC89220m implements AbstractC89171a<C82882c> {

        /* renamed from: a */
        final /* synthetic */ C82879b f185229a;

        static {
            Covode.recordClassIndex(96738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82880a(C82879b bVar) {
            super(0);
            this.f185229a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82882c invoke() {
            Object a = this.f185229a.getDiContainer().mo35247a(AbstractC14552j.class);
            C89219l.m154716b(a, "");
            C82882c cVar = new C82882c((AbstractC14552j) a, this.f185229a.f185224b, this.f185229a.getDiContainer());
            Object a2 = cVar.getDiContainer().mo35249a((Type) AbstractC45899e.class, (String) null);
            C89219l.m154716b(a2, "");
            AbstractC45899e eVar = (AbstractC45899e) a2;
            C89219l.m154721d(eVar, "");
            cVar.mo127970d().f159176f = eVar;
            return cVar;
        }
    }

    public C82879b(C21582f fVar, AbstractC22186b bVar, LiveCDEditStickerLayout liveCDEditStickerLayout) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(liveCDEditStickerLayout, "");
        this.f185227e = fVar;
        this.f185228f = bVar;
        this.f185224b = liveCDEditStickerLayout;
        this.f185225c = C89250i.m154773a((AbstractC89171a) new C82880a(this));
        this.f185226d = new C82881b(this);
    }
}
