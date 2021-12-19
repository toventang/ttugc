package com.p2082ss.android.ugc.aweme.ftc.components.volume;

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

/* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.b */
public final class C52440b extends AbstractC23520b<FTCEditVolumeViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f120767a;

    /* renamed from: b */
    public final int f120768b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f120769c = C89250i.m154773a((AbstractC89171a) new C52441a(this));

    /* renamed from: d */
    private final AbstractC89171a<FTCEditVolumeViewModel> f120770d = C52442b.f120773a;

    /* renamed from: e */
    private final C21582f f120771e;

    static {
        Covode.recordClassIndex(61834);
    }

    /* renamed from: a */
    private final C52443c m97338a() {
        return (C52443c) this.f120769c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<FTCEditVolumeViewModel> mo23031b() {
        return this.f120770d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f120767a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120771e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.b$b */
    static final class C52442b extends AbstractC89220m implements AbstractC89171a<FTCEditVolumeViewModel> {

        /* renamed from: a */
        public static final C52442b f120773a = new C52442b();

        static {
            Covode.recordClassIndex(61836);
        }

        C52442b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditVolumeViewModel invoke() {
            return new FTCEditVolumeViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.b$a */
    static final class C52441a extends AbstractC89220m implements AbstractC89171a<C52443c> {

        /* renamed from: a */
        final /* synthetic */ C52440b f120772a;

        static {
            Covode.recordClassIndex(61835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52441a(C52440b bVar) {
            super(0);
            this.f120772a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52443c invoke() {
            C52443c cVar = new C52443c(this.f120772a.getDiContainer());
            this.f120772a.f120767a.mo36387a(this.f120772a.f120768b, cVar, "FTCEditVolumeScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        this.f120767a.mo36417e(m97338a());
        m97338a().mo88205a(true);
    }

    public C52440b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f120771e = fVar;
        this.f120767a = bVar;
    }
}
