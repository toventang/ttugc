package com.p2082ss.android.ugc.gamora.editor.volume;

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

/* renamed from: com.ss.android.ugc.gamora.editor.volume.b */
public final class C83370b extends AbstractC23520b<EditVolumeViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f186207a;

    /* renamed from: b */
    public final int f186208b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f186209c = C89250i.m154773a((AbstractC89171a) new C83371a(this));

    /* renamed from: d */
    private final AbstractC89171a<EditVolumeViewModel> f186210d = C83372b.f186213a;

    /* renamed from: e */
    private final C21582f f186211e;

    static {
        Covode.recordClassIndex(97256);
    }

    /* renamed from: a */
    private final C83373c m143761a() {
        return (C83373c) this.f186209c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditVolumeViewModel> mo23031b() {
        return this.f186210d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f186207a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f186211e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.b$b */
    static final class C83372b extends AbstractC89220m implements AbstractC89171a<EditVolumeViewModel> {

        /* renamed from: a */
        public static final C83372b f186213a = new C83372b();

        static {
            Covode.recordClassIndex(97258);
        }

        C83372b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditVolumeViewModel invoke() {
            return new EditVolumeViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.b$a */
    static final class C83371a extends AbstractC89220m implements AbstractC89171a<C83373c> {

        /* renamed from: a */
        final /* synthetic */ C83370b f186212a;

        static {
            Covode.recordClassIndex(97257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83371a(C83370b bVar) {
            super(0);
            this.f186212a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83373c invoke() {
            C83373c cVar = new C83373c(this.f186212a.getDiContainer());
            this.f186212a.f186207a.mo36387a(this.f186212a.f186208b, cVar, "EditVolumeScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        this.f186207a.mo36417e(m143761a());
        m143761a().mo128386a(true);
    }

    public C83370b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f186211e = fVar;
        this.f186207a = bVar;
    }
}
