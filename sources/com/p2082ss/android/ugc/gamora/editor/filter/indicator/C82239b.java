package com.p2082ss.android.ugc.gamora.editor.filter.indicator;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.filter.indicator.b */
public final class C82239b extends AbstractC23520b<EditFilterIndicatorViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public boolean f183978a;

    /* renamed from: b */
    public final FilterBean f183979b;

    /* renamed from: c */
    public final AbstractC50707o f183980c;

    /* renamed from: d */
    private final AbstractC89244h f183981d;

    /* renamed from: e */
    private final AbstractC89171a<EditFilterIndicatorViewModel> f183982e;

    /* renamed from: f */
    private final C21582f f183983f;

    /* renamed from: k */
    private final AbstractC22186b f183984k;

    /* renamed from: l */
    private final int f183985l = R.id.arm;

    static {
        Covode.recordClassIndex(96071);
    }

    /* renamed from: a */
    private final C82242c m142282a() {
        return (C82242c) this.f183981d.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditFilterIndicatorViewModel> mo23031b() {
        return this.f183982e;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f183984k;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f183983f;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.indicator.b$b */
    static final class C82241b extends AbstractC89220m implements AbstractC89171a<EditFilterIndicatorViewModel> {

        /* renamed from: a */
        public static final C82241b f183987a = new C82241b();

        static {
            Covode.recordClassIndex(96073);
        }

        C82241b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditFilterIndicatorViewModel invoke() {
            return new EditFilterIndicatorViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.indicator.b$a */
    static final class C82240a extends AbstractC89220m implements AbstractC89171a<C82242c> {

        /* renamed from: a */
        final /* synthetic */ C82239b f183986a;

        static {
            Covode.recordClassIndex(96072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82240a(C82239b bVar) {
            super(0);
            this.f183986a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82242c invoke() {
            C82242c cVar = new C82242c(this.f183986a.f183979b, this.f183986a.f183980c);
            cVar.f183992d = this.f183986a.f183978a;
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (!this.f183984k.mo36421f(m142282a())) {
            this.f183984k.mo36387a(this.f183985l, m142282a(), "EditFilterIndicatorScene");
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        if (this.f183984k.mo36421f(m142282a())) {
            this.f183984k.mo36413d(m142282a());
        }
    }

    public C82239b(C21582f fVar, AbstractC22186b bVar, FilterBean filterBean, AbstractC50707o oVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(oVar, "");
        this.f183983f = fVar;
        this.f183984k = bVar;
        this.f183979b = filterBean;
        this.f183980c = oVar;
        this.f183978a = true;
        this.f183981d = C89250i.m154773a((AbstractC89171a) new C82240a(this));
        this.f183982e = C82241b.f183987a;
    }
}
