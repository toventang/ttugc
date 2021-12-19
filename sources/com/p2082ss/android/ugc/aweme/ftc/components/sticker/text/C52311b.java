package com.p2082ss.android.ugc.aweme.ftc.components.sticker.text;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.b */
public final class C52311b extends AbstractC23520b<FTCEditTextStickerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final AbstractC52360s f120523a;

    /* renamed from: b */
    public final int f120524b;

    /* renamed from: c */
    private final AbstractC89171a<FTCEditTextStickerViewModel> f120525c;

    /* renamed from: d */
    private final AbstractC89244h f120526d;

    /* renamed from: e */
    private final C21582f f120527e;

    /* renamed from: f */
    private final AbstractC22186b f120528f;

    /* renamed from: k */
    private final int f120529k = R.id.egu;

    static {
        Covode.recordClassIndex(61701);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<FTCEditTextStickerViewModel> mo23031b() {
        return this.f120525c;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f120528f;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120527e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.b$b */
    static final class C52313b extends AbstractC89220m implements AbstractC89171a<FTCEditTextStickerViewModel> {

        /* renamed from: a */
        public static final C52313b f120531a = new C52313b();

        static {
            Covode.recordClassIndex(61703);
        }

        C52313b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditTextStickerViewModel invoke() {
            return new FTCEditTextStickerViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        this.f120528f.mo36387a(this.f120529k, (C52357r) this.f120526d.getValue(), "FTCEditTextStickerScene");
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.b$a */
    static final class C52312a extends AbstractC89220m implements AbstractC89171a<C52357r> {

        /* renamed from: a */
        final /* synthetic */ C52311b f120530a;

        static {
            Covode.recordClassIndex(61702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52312a(C52311b bVar) {
            super(0);
            this.f120530a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52357r invoke() {
            C52357r rVar = new C52357r(this.f120530a.getDiContainer(), this.f120530a.f120523a, this.f120530a.f120524b);
            AbstractC14552j jVar = (AbstractC14552j) rVar.getDiContainer().mo35249a((Type) AbstractC14552j.class, (String) null);
            C89219l.m154721d(jVar, "");
            rVar.f120615a = jVar;
            AbstractC45899e eVar = (AbstractC45899e) rVar.getDiContainer().mo35249a((Type) AbstractC45899e.class, (String) null);
            C89219l.m154721d(eVar, "");
            rVar.f120617c = eVar;
            C46224i iVar = (C46224i) rVar.getDiContainer().mo35249a((Type) C46224i.class, (String) null);
            C89219l.m154721d(iVar, "");
            rVar.f120616b = iVar;
            return rVar;
        }
    }

    public C52311b(C21582f fVar, AbstractC22186b bVar, AbstractC52360s sVar, int i) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f120527e = fVar;
        this.f120528f = bVar;
        this.f120523a = sVar;
        this.f120524b = i;
        this.f120525c = C52313b.f120531a;
        this.f120526d = C89250i.m154773a((AbstractC89171a) new C52312a(this));
    }
}
