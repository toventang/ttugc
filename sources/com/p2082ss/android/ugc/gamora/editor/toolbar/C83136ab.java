package com.p2082ss.android.ugc.gamora.editor.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ab */
public final class C83136ab extends AbstractC23520b<ReplaceMusicToolbarViewModel> {

    /* renamed from: a */
    private final AbstractC89171a<ReplaceMusicToolbarViewModel> f185774a = C83137a.f185779a;

    /* renamed from: b */
    private final C21582f f185775b;

    /* renamed from: c */
    private final AbstractC22186b f185776c;

    /* renamed from: d */
    private final int f185777d = R.id.ask;

    /* renamed from: e */
    private final int f185778e = R.id.ue;

    static {
        Covode.recordClassIndex(97020);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<ReplaceMusicToolbarViewModel> mo23031b() {
        return this.f185774a;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f185776c;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ab$a */
    static final class C83137a extends AbstractC89220m implements AbstractC89171a<ReplaceMusicToolbarViewModel> {

        /* renamed from: a */
        public static final C83137a f185779a = new C83137a();

        static {
            Covode.recordClassIndex(97021);
        }

        C83137a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ReplaceMusicToolbarViewModel invoke() {
            return new ReplaceMusicToolbarViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f185776c.mo36387a(this.f185777d, new C83138ac(this.f185775b), "ReplaceMusicToolbarScene");
    }

    public C83136ab(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f185775b = fVar;
        this.f185776c = bVar;
    }
}
