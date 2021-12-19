package com.p2082ss.android.ugc.gamora.editor.corner;

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

/* renamed from: com.ss.android.ugc.gamora.editor.corner.b */
public final class C82089b extends AbstractC23520b<EditCornerViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final int f183672a = R.id.arl;

    /* renamed from: b */
    private final AbstractC89244h f183673b;

    /* renamed from: c */
    private final AbstractC89171a<EditCornerViewModel> f183674c;

    /* renamed from: d */
    private final C21582f f183675d;

    /* renamed from: e */
    private final AbstractC22186b f183676e;

    static {
        Covode.recordClassIndex(95915);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditCornerViewModel> mo23031b() {
        return this.f183674c;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f183676e;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f183675d;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.corner.b$a */
    static final class C82090a extends AbstractC89220m implements AbstractC89171a<C82092c> {

        /* renamed from: a */
        public static final C82090a f183677a = new C82090a();

        static {
            Covode.recordClassIndex(95916);
        }

        C82090a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82092c invoke() {
            return new C82092c();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.corner.b$b */
    static final class C82091b extends AbstractC89220m implements AbstractC89171a<EditCornerViewModel> {

        /* renamed from: a */
        public static final C82091b f183678a = new C82091b();

        static {
            Covode.recordClassIndex(95917);
        }

        C82091b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditCornerViewModel invoke() {
            return new EditCornerViewModel();
        }
    }

    public C82089b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f183675d = fVar;
        this.f183676e = bVar;
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) C82090a.f183677a);
        this.f183673b = a;
        this.f183674c = C82091b.f183678a;
        bVar.mo36387a(R.id.arl, (C82092c) a.getValue(), "EditCornerScene");
    }
}
