package com.p2082ss.android.ugc.gamora.editor.progressbar;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.gamora.editor.progressbar.p4285a.C82506a;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.progressbar.b */
public final class C82529b extends AbstractC23520b<EditPreviewProgressViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f184578a;

    /* renamed from: b */
    public final int f184579b = R.id.c7k;

    /* renamed from: c */
    private final AbstractC89244h f184580c = C89250i.m154773a((AbstractC89171a) new C82530a(this));

    /* renamed from: d */
    private final AbstractC89171a<EditPreviewProgressViewModel> f184581d = C82531b.f184584a;

    /* renamed from: e */
    private final C21582f f184582e;

    static {
        Covode.recordClassIndex(96373);
    }

    /* renamed from: a */
    private final C82506a m142650a() {
        return (C82506a) this.f184580c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditPreviewProgressViewModel> mo23031b() {
        return this.f184581d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f184578a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184582e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.b$b */
    static final class C82531b extends AbstractC89220m implements AbstractC89171a<EditPreviewProgressViewModel> {

        /* renamed from: a */
        public static final C82531b f184584a = new C82531b();

        static {
            Covode.recordClassIndex(96375);
        }

        C82531b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditPreviewProgressViewModel invoke() {
            return new EditPreviewProgressViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.b$a */
    static final class C82530a extends AbstractC89220m implements AbstractC89171a<C82506a> {

        /* renamed from: a */
        final /* synthetic */ C82529b f184583a;

        static {
            Covode.recordClassIndex(96374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82530a(C82529b bVar) {
            super(0);
            this.f184583a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82506a invoke() {
            C82506a aVar = new C82506a(this.f184583a.getDiContainer());
            this.f184583a.f184578a.mo36387a(this.f184583a.f184579b, aVar, "EditProgressbarScene");
            return aVar;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onResume() {
        super.onResume();
        if (!this.f184578a.mo36421f(m142650a())) {
            this.f184578a.mo36387a(this.f184579b, m142650a(), "EditProgressbarScene");
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        C85581w.EnumC85611j f;
        C82506a a = m142650a();
        View view = a.f184548x;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        view.setVisibility(0);
        TextView textView = a.f184518G;
        if (textView == null) {
            C89219l.m154710a("longPressTips");
        }
        textView.setVisibility(8);
        AbstractC31071f d = a.mo127600d();
        if (!(d == null || (f = d.mo56356f()) == null || f == C85581w.EnumC85611j.PAUSED || a.f184536e || !a.f184540i)) {
            a.mo127593C();
        }
        a.f184543l = false;
        a.f184540i = false;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        C82506a a = m142650a();
        View view = a.f184548x;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        view.setVisibility(8);
        TextView textView = a.f184518G;
        if (textView == null) {
            C89219l.m154710a("longPressTips");
        }
        textView.setVisibility(8);
        a.f184540i = true;
        a.f184543l = true;
    }

    public C82529b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f184582e = fVar;
        this.f184578a = bVar;
    }
}
