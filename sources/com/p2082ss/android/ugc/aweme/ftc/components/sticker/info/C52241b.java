package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

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

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.b */
public final class C52241b extends AbstractC23520b<FTCEditInfoStickerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final FrameLayout f120355a;

    /* renamed from: b */
    private final AbstractC89171a<FTCEditInfoStickerViewModel> f120356b;

    /* renamed from: c */
    private final AbstractC89244h f120357c;

    /* renamed from: d */
    private final C21582f f120358d;

    /* renamed from: e */
    private final AbstractC22186b f120359e;

    /* renamed from: f */
    private final int f120360f = R.id.bn_;

    static {
        Covode.recordClassIndex(61629);
    }

    /* renamed from: a */
    public final C52244c mo87987a() {
        return (C52244c) this.f120357c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<FTCEditInfoStickerViewModel> mo23031b() {
        return this.f120356b;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f120359e;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120358d;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.b$b */
    static final class C52243b extends AbstractC89220m implements AbstractC89171a<FTCEditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52241b f120362a;

        static {
            Covode.recordClassIndex(61631);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52243b(C52241b bVar) {
            super(0);
            this.f120362a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditInfoStickerViewModel invoke() {
            FTCEditInfoStickerViewModel fTCEditInfoStickerViewModel = new FTCEditInfoStickerViewModel();
            C52244c a = this.f120362a.mo87987a();
            C89219l.m154721d(a, "");
            fTCEditInfoStickerViewModel.f120285a = a;
            return fTCEditInfoStickerViewModel;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (!this.f120359e.mo36421f(mo87987a())) {
            this.f120359e.mo36387a(this.f120360f, mo87987a(), "FTCEditInfoStickerScene");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.b$a */
    static final class C52242a extends AbstractC89220m implements AbstractC89171a<C52244c> {

        /* renamed from: a */
        final /* synthetic */ C52241b f120361a;

        static {
            Covode.recordClassIndex(61630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52242a(C52241b bVar) {
            super(0);
            this.f120361a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52244c invoke() {
            C52244c cVar = new C52244c(this.f120361a.getDiContainer());
            AbstractC14552j jVar = (AbstractC14552j) cVar.getDiContainer().mo35249a((Type) AbstractC14552j.class, (String) null);
            C89219l.m154721d(jVar, "");
            cVar.f120365b = jVar;
            cVar.mo87988C().f120454y = (AbstractC45899e) cVar.getDiContainer().mo35249a((Type) AbstractC45899e.class, (String) null);
            FrameLayout frameLayout = this.f120361a.f120355a;
            C89219l.m154721d(frameLayout, "");
            cVar.f120367d = frameLayout;
            return cVar;
        }
    }

    public C52241b(C21582f fVar, AbstractC22186b bVar, FrameLayout frameLayout) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(frameLayout, "");
        this.f120358d = fVar;
        this.f120359e = bVar;
        this.f120355a = frameLayout;
        this.f120356b = new C52243b(this);
        this.f120357c = C89250i.m154773a((AbstractC89171a) new C52242a(this));
    }
}
