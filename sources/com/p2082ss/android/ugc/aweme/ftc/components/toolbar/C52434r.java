package com.p2082ss.android.ugc.aweme.ftc.components.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.r */
public final class C52434r extends AbstractC23520b<FTCEditToolbarViewModel> {

    /* renamed from: a */
    private final AbstractC89171a<FTCEditToolbarViewModel> f120757a = C52435a.f120762a;

    /* renamed from: b */
    private final C21582f f120758b;

    /* renamed from: c */
    private final AbstractC22186b f120759c;

    /* renamed from: d */
    private final int f120760d = R.id.ask;

    /* renamed from: e */
    private final int f120761e = R.id.ue;

    static {
        Covode.recordClassIndex(61826);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<FTCEditToolbarViewModel> mo23031b() {
        return this.f120757a;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f120759c;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.r$a */
    static final class C52435a extends AbstractC89220m implements AbstractC89171a<FTCEditToolbarViewModel> {

        /* renamed from: a */
        public static final C52435a f120762a = new C52435a();

        static {
            Covode.recordClassIndex(61827);
        }

        C52435a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditToolbarViewModel invoke() {
            return new FTCEditToolbarViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        AbstractC22186b bVar = this.f120759c;
        bVar.mo36387a(this.f120760d, new C52388d(this.f120758b), "FTCEditTitleBarScene");
        bVar.mo36387a(this.f120761e, new C52377a(this.f120758b), "FTCEditBottomBarScene");
    }

    public C52434r(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f120758b = fVar;
        this.f120759c = bVar;
    }
}
