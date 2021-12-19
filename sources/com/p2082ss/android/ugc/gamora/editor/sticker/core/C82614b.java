package com.p2082ss.android.ugc.gamora.editor.sticker.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68102k;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.b */
public final class C82614b extends AbstractC23520b<EditStickerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    private final boolean f184733a;

    /* renamed from: b */
    private final AbstractC89171a<EditStickerViewModel> f184734b;

    /* renamed from: c */
    private final AbstractC89244h f184735c;

    /* renamed from: d */
    private final C21582f f184736d;

    /* renamed from: e */
    private final AbstractC22186b f184737e;

    /* renamed from: f */
    private final int f184738f = R.id.asd;

    static {
        Covode.recordClassIndex(96461);
    }

    /* renamed from: a */
    private final C82617c m142793a() {
        return (C82617c) this.f184735c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditStickerViewModel> mo23031b() {
        return this.f184734b;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f184737e;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184736d;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.b$b */
    static final class C82616b extends AbstractC89220m implements AbstractC89171a<EditStickerViewModel> {

        /* renamed from: a */
        public static final C82616b f184740a = new C82616b();

        static {
            Covode.recordClassIndex(96463);
        }

        C82616b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditStickerViewModel invoke() {
            return new EditStickerViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.b$a */
    static final class C82615a extends AbstractC89220m implements AbstractC89171a<C82617c> {

        /* renamed from: a */
        final /* synthetic */ C82614b f184739a;

        static {
            Covode.recordClassIndex(96462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82615a(C82614b bVar) {
            super(0);
            this.f184739a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82617c invoke() {
            return new C82617c(this.f184739a.getDiContainer());
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        if (!this.f184733a) {
            ((EditStickerViewModel) mo38334j()).mo127674a(m142793a());
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (this.f184733a) {
            AbstractC22186b bVar = this.f184737e;
            int i = this.f184738f;
            C82617c a = m142793a();
            a.mo127708a((AbstractC14552j) getDiContainer().mo35249a(AbstractC14552j.class, (String) null));
            a.mo127711a((AbstractC82035ab) getDiContainer().mo35249a(AbstractC82035ab.class, (String) null));
            bVar.mo36387a(i, a, "EditStickerScene");
            ((EditStickerViewModel) mo38334j()).mo127674a(m142793a());
        }
    }

    public C82614b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f184736d = fVar;
        this.f184737e = bVar;
        boolean booleanValue = ((Boolean) C68102k.f152505a.getValue()).booleanValue();
        this.f184733a = booleanValue;
        this.f184734b = C82616b.f184740a;
        this.f184735c = C89250i.m154773a((AbstractC89171a) new C82615a(this));
        if (!booleanValue) {
            C82617c a = m142793a();
            a.mo127708a((AbstractC14552j) getDiContainer().mo35249a(AbstractC14552j.class, (String) null));
            a.mo127709a((AbstractC45899e) getDiContainer().mo35249a(AbstractC45899e.class, (String) null));
            a.mo127711a((AbstractC82035ab) getDiContainer().mo35249a(AbstractC82035ab.class, (String) null));
            bVar.mo36387a(R.id.asd, a, "EditStickerScene");
        }
    }
}
