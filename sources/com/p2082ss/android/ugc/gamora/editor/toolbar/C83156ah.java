package com.p2082ss.android.ugc.gamora.editor.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ah */
public final class C83156ah extends AbstractC23520b<EditToolbarViewModel> {

    /* renamed from: a */
    private final AbstractC89171a<EditToolbarViewModel> f185814a = C83157a.f185819a;

    /* renamed from: b */
    private final C21582f f185815b;

    /* renamed from: c */
    private final AbstractC22186b f185816c;

    /* renamed from: d */
    private final int f185817d = R.id.ask;

    /* renamed from: e */
    private final int f185818e = R.id.ue;

    static {
        Covode.recordClassIndex(97040);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditToolbarViewModel> mo23031b() {
        return this.f185814a;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f185816c;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ah$a */
    static final class C83157a extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        public static final C83157a f185819a = new C83157a();

        static {
            Covode.recordClassIndex(97041);
        }

        C83157a() {
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
        AbstractC22186b bVar = this.f185816c;
        Object a = this.f185815b.mo35249a((Type) VideoPublishEditModel.class, (String) null);
        C89219l.m154716b(a, "");
        if (C70976bp.m125314j((VideoPublishEditModel) a)) {
            C22226a.m41822a(bVar, this.f185817d, new C83184g(this.f185815b), "EditTitleBarScene");
            C22226a.m41822a(bVar, this.f185818e, new C83165c(this.f185815b), "EditBottomBarScene");
            return;
        }
        bVar.mo36387a(this.f185817d, new C83184g(this.f185815b), "EditTitleBarScene");
        bVar.mo36387a(this.f185818e, new C83165c(this.f185815b), "EditBottomBarScene");
    }

    public C83156ah(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f185815b = fVar;
        this.f185816c = bVar;
    }
}
