package com.p2082ss.android.ugc.aweme.editSticker.text.als;

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

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.b */
public final class C46037b extends AbstractC23520b<EditTextStickerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final AbstractC46043d f107186a;

    /* renamed from: b */
    public final boolean f107187b;

    /* renamed from: c */
    public final int f107188c;

    /* renamed from: d */
    public boolean f107189d;

    /* renamed from: e */
    public final boolean f107190e;

    /* renamed from: f */
    private final AbstractC89171a<EditTextStickerViewModel> f107191f;

    /* renamed from: k */
    private final AbstractC89244h f107192k;

    /* renamed from: l */
    private final C21582f f107193l;

    /* renamed from: m */
    private final AbstractC22186b f107194m;

    /* renamed from: n */
    private final int f107195n = R.id.egu;

    static {
        Covode.recordClassIndex(54572);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditTextStickerViewModel> mo23031b() {
        return this.f107191f;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f107194m;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f107193l;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.b$b */
    static final class C46039b extends AbstractC89220m implements AbstractC89171a<EditTextStickerViewModel> {

        /* renamed from: a */
        public static final C46039b f107197a = new C46039b();

        static {
            Covode.recordClassIndex(54574);
        }

        C46039b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditTextStickerViewModel invoke() {
            return new EditTextStickerViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        this.f107194m.mo36387a(this.f107195n, (C46040c) this.f107192k.getValue(), "EditTextStickerScene");
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.b$a */
    static final class C46038a extends AbstractC89220m implements AbstractC89171a<C46040c> {

        /* renamed from: a */
        final /* synthetic */ C46037b f107196a;

        static {
            Covode.recordClassIndex(54573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46038a(C46037b bVar) {
            super(0);
            this.f107196a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C46040c invoke() {
            C46040c cVar = new C46040c(this.f107196a.getDiContainer(), this.f107196a.f107186a, this.f107196a.f107188c, this.f107196a.f107187b, this.f107196a.f107190e);
            AbstractC14552j jVar = (AbstractC14552j) cVar.getDiContainer().mo35249a((Type) AbstractC14552j.class, (String) null);
            C89219l.m154721d(jVar, "");
            cVar.f107199a = jVar;
            AbstractC45899e eVar = (AbstractC45899e) cVar.getDiContainer().mo35249a((Type) AbstractC45899e.class, (String) null);
            C89219l.m154721d(eVar, "");
            cVar.f107201c = eVar;
            C46224i iVar = (C46224i) cVar.getDiContainer().mo35249a((Type) C46224i.class, (String) null);
            C89219l.m154721d(iVar, "");
            cVar.f107200b = iVar;
            cVar.f107202d = this.f107196a.f107189d;
            return cVar;
        }
    }

    public C46037b(C21582f fVar, AbstractC22186b bVar, AbstractC46043d dVar, boolean z, int i, boolean z2, boolean z3) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f107193l = fVar;
        this.f107194m = bVar;
        this.f107186a = dVar;
        this.f107187b = z;
        this.f107188c = i;
        this.f107189d = z2;
        this.f107190e = z3;
        this.f107191f = C46039b.f107197a;
        this.f107192k = C89250i.m154773a((AbstractC89171a) new C46038a(this));
    }
}
