package com.p2082ss.android.ugc.gamora.editor.progress;

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

/* renamed from: com.ss.android.ugc.gamora.editor.progress.b */
public final class C82480b extends AbstractC23520b<EditProgressViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f184457a;

    /* renamed from: b */
    public final int f184458b = R.id.c7k;

    /* renamed from: c */
    private final AbstractC89244h f184459c = C89250i.m154773a((AbstractC89171a) new C82481a(this));

    /* renamed from: d */
    private final AbstractC89171a<EditProgressViewModel> f184460d = C82482b.f184463a;

    /* renamed from: e */
    private final C21582f f184461e;

    static {
        Covode.recordClassIndex(96322);
    }

    /* renamed from: a */
    private final C82485d m142564a() {
        return (C82485d) this.f184459c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditProgressViewModel> mo23031b() {
        return this.f184460d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f184457a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184461e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.b$b */
    static final class C82482b extends AbstractC89220m implements AbstractC89171a<EditProgressViewModel> {

        /* renamed from: a */
        public static final C82482b f184463a = new C82482b();

        static {
            Covode.recordClassIndex(96324);
        }

        C82482b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditProgressViewModel invoke() {
            return new EditProgressViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.b$a */
    static final class C82481a extends AbstractC89220m implements AbstractC89171a<C82485d> {

        /* renamed from: a */
        final /* synthetic */ C82480b f184462a;

        static {
            Covode.recordClassIndex(96323);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82481a(C82480b bVar) {
            super(0);
            this.f184462a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82485d invoke() {
            C82485d dVar = new C82485d(this.f184462a.getDiContainer());
            this.f184462a.f184457a.mo36387a(this.f184462a.f184458b, dVar, "EditProgressScene");
            return dVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (!this.f184457a.mo36421f(m142564a())) {
            this.f184457a.mo36387a(this.f184458b, m142564a(), "EditProgressScene");
        }
    }

    public C82480b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f184461e = fVar;
        this.f184457a = bVar;
    }
}
