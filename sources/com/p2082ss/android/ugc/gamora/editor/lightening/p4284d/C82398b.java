package com.p2082ss.android.ugc.gamora.editor.lightening.p4284d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.d.b */
public final class C82398b extends AbstractC23520b<EditToolbarViewModel> implements AbstractC21566a {

    /* renamed from: a */
    private final AbstractC89171a<EditToolbarViewModel> f184309a = C82399a.f184313a;

    /* renamed from: b */
    private final C21582f f184310b;

    /* renamed from: c */
    private final AbstractC22186b f184311c;

    /* renamed from: d */
    private final int f184312d = R.id.ask;

    static {
        Covode.recordClassIndex(96234);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditToolbarViewModel> mo23031b() {
        return this.f184309a;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f184311c;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184310b;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.d.b$a */
    static final class C82399a extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        public static final C82399a f184313a = new C82399a();

        static {
            Covode.recordClassIndex(96235);
        }

        C82399a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            return new EditToolbarViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f184311c.mo36387a(this.f184312d, new C82397a(getDiContainer()), "EditTitleBarScene");
    }

    public C82398b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f184310b = fVar;
        this.f184311c = bVar;
    }
}
