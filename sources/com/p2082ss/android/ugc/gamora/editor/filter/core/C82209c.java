package com.p2082ss.android.ugc.gamora.editor.filter.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.filter.core.c */
public final class C82209c extends AbstractC23520b<EditFilterViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final AbstractC50707o f183920a;

    /* renamed from: b */
    public final AbstractC82208b f183921b;

    /* renamed from: c */
    private C82212e f183922c;

    /* renamed from: d */
    private final AbstractC89171a<EditFilterViewModel> f183923d;

    /* renamed from: e */
    private final C21582f f183924e;

    /* renamed from: f */
    private final AbstractC22186b f183925f;

    /* renamed from: k */
    private final int f183926k = R.id.c7m;

    /* renamed from: l */
    private final AbstractC84398d f183927l;

    /* renamed from: m */
    private final AbstractC89172b<C82211d, C89391z> f183928m;

    static {
        Covode.recordClassIndex(96039);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditFilterViewModel> mo23031b() {
        return this.f183923d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f183925f;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f183924e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.c$a */
    static final class C82210a extends AbstractC89220m implements AbstractC89171a<EditFilterViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82209c f183929a;

        static {
            Covode.recordClassIndex(96040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82210a(C82209c cVar) {
            super(0);
            this.f183929a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditFilterViewModel invoke() {
            return new EditFilterViewModel(this.f183929a.getDiContainer(), this.f183929a.f183920a, this.f183929a.f183921b);
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f183922c = new C82212e(getDiContainer(), this.f183920a, this.f183927l, this.f183928m);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        AbstractC22186b bVar = this.f183925f;
        C82212e eVar = this.f183922c;
        if (eVar == null) {
            C89219l.m154710a("scene");
        }
        if (!bVar.mo36421f(eVar)) {
            AbstractC22186b bVar2 = this.f183925f;
            int i = this.f183926k;
            C82212e eVar2 = this.f183922c;
            if (eVar2 == null) {
                C89219l.m154710a("scene");
            }
            bVar2.mo36387a(i, eVar2, "EditFilterScene");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super com.ss.android.ugc.gamora.editor.filter.core.d, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C82209c(C21582f fVar, AbstractC22186b bVar, AbstractC50707o oVar, AbstractC84398d dVar, AbstractC82208b bVar2, AbstractC89172b<? super C82211d, C89391z> bVar3) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar2, "");
        this.f183924e = fVar;
        this.f183925f = bVar;
        this.f183920a = oVar;
        this.f183927l = dVar;
        this.f183921b = bVar2;
        this.f183928m = bVar3;
        this.f183923d = new C82210a(this);
    }
}
