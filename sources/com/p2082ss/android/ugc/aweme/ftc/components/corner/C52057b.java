package com.p2082ss.android.ugc.aweme.ftc.components.corner;

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

/* renamed from: com.ss.android.ugc.aweme.ftc.components.corner.b */
public final class C52057b extends AbstractC23520b<FTCEditCornerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final int f119932a = R.id.arl;

    /* renamed from: b */
    private final AbstractC89244h f119933b;

    /* renamed from: c */
    private final AbstractC89171a<FTCEditCornerViewModel> f119934c;

    /* renamed from: d */
    private final C21582f f119935d;

    /* renamed from: e */
    private final AbstractC22186b f119936e;

    static {
        Covode.recordClassIndex(61434);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<FTCEditCornerViewModel> mo23031b() {
        return this.f119934c;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f119936e;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f119935d;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.corner.b$a */
    static final class C52058a extends AbstractC89220m implements AbstractC89171a<C52060c> {

        /* renamed from: a */
        public static final C52058a f119937a = new C52058a();

        static {
            Covode.recordClassIndex(61435);
        }

        C52058a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52060c invoke() {
            return new C52060c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.corner.b$b */
    static final class C52059b extends AbstractC89220m implements AbstractC89171a<FTCEditCornerViewModel> {

        /* renamed from: a */
        public static final C52059b f119938a = new C52059b();

        static {
            Covode.recordClassIndex(61436);
        }

        C52059b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditCornerViewModel invoke() {
            return new FTCEditCornerViewModel();
        }
    }

    public C52057b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f119935d = fVar;
        this.f119936e = bVar;
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) C52058a.f119937a);
        this.f119933b = a;
        this.f119934c = C52059b.f119938a;
        bVar.mo36387a(R.id.arl, (C52060c) a.getValue(), "FTCEditCornerScene");
    }
}
