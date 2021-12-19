package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p036g.AbstractC0688a;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.effect.C46371s;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71557a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71564a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.C71644e;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.C71666k;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88297u;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.j */
public final class C71762j extends AbstractC22186b implements AbstractC21566a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f160797b = {new C89232y(C71762j.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C89232y(C71762j.class, "editAdjustApi", "getEditAdjustApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0), new C89232y(C71762j.class, "editAdjustClipsModel", "getEditAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new C89232y(C71762j.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new C89232y(C71762j.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0), new C89232y(C71762j.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0)};

    /* renamed from: h */
    public static final C71763a f160798h = new C71763a((byte) 0);

    /* renamed from: c */
    final AbstractC89248d f160799c = C21572a.m40504a(getDiContainer(), AbstractC71793q.class);

    /* renamed from: d */
    public View f160800d;

    /* renamed from: e */
    public View f160801e;

    /* renamed from: f */
    public View f160802f;

    /* renamed from: g */
    public View f160803g;

    /* renamed from: i */
    private final AbstractC89244h f160804i = C89250i.m154773a((AbstractC89171a) new C71764b(this));

    /* renamed from: j */
    private final AbstractC89248d f160805j = C21572a.m40504a(getDiContainer(), AbstractC72510a.class);

    /* renamed from: k */
    private final AbstractC89248d f160806k = C21572a.m40504a(getDiContainer(), AbstractC71692e.class);

    /* renamed from: l */
    private final AbstractC89248d f160807l = C21572a.m40504a(getDiContainer(), C71557a.class);

    /* renamed from: t */
    private final AbstractC89248d f160808t = C21572a.m40504a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    /* renamed from: u */
    private final AbstractC89248d f160809u = C21572a.m40504a(getDiContainer(), VideoEditViewModel.class);

    /* renamed from: v */
    private View f160810v;

    /* renamed from: w */
    private final C21582f f160811w;

    static {
        Covode.recordClassIndex(84307);
    }

    /* renamed from: G */
    private final AbstractC72510a m126666G() {
        return (AbstractC72510a) this.f160805j.mo23374a(this, f160797b[0]);
    }

    /* renamed from: H */
    private final EditAdjustClipsBottomViewModel m126667H() {
        return (EditAdjustClipsBottomViewModel) this.f160808t.mo23374a(this, f160797b[3]);
    }

    /* renamed from: E */
    public final AbstractC71692e mo62771E() {
        return (AbstractC71692e) this.f160806k.mo23374a(this, f160797b[1]);
    }

    /* renamed from: F */
    public final C71557a mo113415F() {
        return (C71557a) this.f160807l.mo23374a(this, f160797b[2]);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.j$a */
    public static final class C71763a {
        static {
            Covode.recordClassIndex(84308);
        }

        private C71763a() {
        }

        public /* synthetic */ C71763a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f160811w;
    }

    /* renamed from: I */
    private final int m126668I() {
        return (int) C13628n.m24520b(this.f52549m, 52.0f);
    }

    /* renamed from: J */
    private final int m126669J() {
        float f;
        Activity activity = this.f52549m;
        if (mo113415F().f160355b) {
            f = 320.0f;
        } else {
            f = 265.0f;
        }
        return (int) C13628n.m24520b(activity, f);
    }

    /* renamed from: K */
    private final int m126670K() {
        return (((C70636dh.m124836e(this.f52549m) - m126668I()) - m126669J()) - C70636dh.m124833c(this.f52549m)) - C70636dh.m124835d(this.f52549m);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.j$b */
    static final class C71764b extends AbstractC89220m implements AbstractC89171a<AbstractC71564a> {

        /* renamed from: a */
        final /* synthetic */ C71762j f160812a;

        static {
            Covode.recordClassIndex(84309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71764b(C71762j jVar) {
            super(0);
            this.f160812a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC71564a invoke() {
            if (this.f160812a.mo113415F().f160355b) {
                return new C71644e(this.f160812a.getDiContainer(), this.f160812a);
            }
            return new C71666k(this.f160812a.getDiContainer(), this.f160812a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.j$c */
    public static final class C71765c extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C71762j f160813a;

        static {
            Covode.recordClassIndex(84310);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71765c(C71762j jVar) {
            this.f160813a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f160813a.mo62771E().mo113371a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.j$d */
    public static final class C71766d extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C71762j f160814a;

        static {
            Covode.recordClassIndex(84311);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71766d(C71762j jVar) {
            this.f160814a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f160814a.mo62771E().mo113371a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.j$e */
    public static final class C71767e extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C71762j f160815a;

        static {
            Covode.recordClassIndex(84312);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71767e(C71762j jVar) {
            this.f160815a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            int i;
            C71762j jVar = this.f160815a;
            boolean d = ((AbstractC71793q) jVar.f160799c.mo23374a(jVar, C71762j.f160797b[5])).mo113316d();
            View view2 = this.f160815a.f160801e;
            if (view2 == null) {
                C89219l.m154710a("ivPlay");
            }
            if (d) {
                i = 8;
            } else {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m126671a(C71762j jVar) {
        View view = jVar.f160800d;
        if (view == null) {
            C89219l.m154710a("titleBar");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.j$f */
    static final class C71768f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71762j f160816a;

        static {
            Covode.recordClassIndex(84313);
        }

        C71768f(C71762j jVar) {
            this.f160816a = jVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Integer num = (Integer) obj;
            View a = C71762j.m126671a(this.f160816a);
            if (num != null && num.intValue() == 2) {
                i = 4;
            } else {
                i = 0;
            }
            a.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.j$g */
    static final class C71769g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71762j f160817a;

        static {
            Covode.recordClassIndex(84314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71769g(C71762j jVar) {
            super(1);
            this.f160817a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            View view = this.f160817a.f160803g;
            if (view == null) {
                C89219l.m154710a("tvSave");
            }
            view.setEnabled(!booleanValue);
            View view2 = this.f160817a.f160802f;
            if (view2 == null) {
                C89219l.m154710a("tvCancel");
            }
            view2.setEnabled(!booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.j$h */
    static final class C71770h<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ C71762j f160818a;

        /* renamed from: b */
        final /* synthetic */ boolean f160819b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f160820c;

        static {
            Covode.recordClassIndex(84315);
        }

        C71770h(C71762j jVar, boolean z, AbstractC89171a aVar) {
            this.f160818a = jVar;
            this.f160819b = z;
            this.f160820c = aVar;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            int i;
            AbstractC22186b bVar;
            View a = C71762j.m126671a(this.f160818a);
            if (this.f160819b) {
                i = 0;
            } else {
                i = 4;
            }
            a.setVisibility(i);
            if (!this.f160819b && (bVar = (AbstractC22186b) this.f160818a.f52551o) != null) {
                bVar.mo36413d(this.f160818a);
            }
            AbstractC89171a aVar = this.f160820c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public C71762j(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f160811w = fVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        AbstractC71564a aVar = (AbstractC71564a) this.f160804i.getValue();
        if (!aVar.f160374f.mo36421f(aVar)) {
            aVar.f160374f.mo36387a(aVar.f160375g, aVar, aVar.mo113345a());
        }
        if (!aVar.f160374f.mo36422g(aVar)) {
            aVar.f160374f.mo36417e(aVar);
        }
        View c = mo36475c(R.id.dm7);
        C89219l.m154716b(c, "");
        this.f160800d = c;
        View c2 = mo36475c(R.id.byg);
        C89219l.m154716b(c2, "");
        this.f160801e = c2;
        View c3 = mo36475c(R.id.vm);
        C89219l.m154716b(c3, "");
        this.f160810v = c3;
        View c4 = mo36475c(R.id.et6);
        C89219l.m154716b(c4, "");
        this.f160802f = c4;
        if (c4 == null) {
            C89219l.m154710a("tvCancel");
        }
        c4.setOnClickListener(new C71765c(this));
        View c5 = mo36475c(R.id.f2x);
        C89219l.m154716b(c5, "");
        this.f160803g = c5;
        if (c5 == null) {
            C89219l.m154710a("tvSave");
        }
        c5.setOnClickListener(new C71766d(this));
        mo36475c(R.id.ae8).setOnClickListener(new C71767e(this));
        ((VideoEditViewModel) this.f160809u.mo23374a(this, f160797b[4])).f157677b.observe(this, new C71768f(this));
        AbstractC88412b unused = m126667H().mo33677a(this, C71771k.f160821a, new C20370ah(), new C71769g(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.d4, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }

    /* renamed from: a */
    public final void mo113416a(boolean z, AbstractC89171a<C89391z> aVar) {
        if (z) {
            AbstractC22219j jVar = this.f52551o;
            AbstractC22186b bVar = null;
            if (!(jVar instanceof AbstractC22186b)) {
                jVar = null;
            }
            AbstractC22186b bVar2 = (AbstractC22186b) jVar;
            if (bVar2 == null || !bVar2.mo36422g(this)) {
                AbstractC22219j jVar2 = this.f52551o;
                if (jVar2 instanceof AbstractC22186b) {
                    bVar = jVar2;
                }
                AbstractC22186b bVar3 = bVar;
                if (bVar3 != null) {
                    bVar3.mo36417e(this);
                }
            }
            m126666G().mo114803a(C88297u.C88298a.m153448a(C77795c.m135910a(true, false, false, false), m126668I() + C70636dh.m124833c(this.f52549m), m126669J(), m126670K(), C33398a.f79357a.mo59453d(), false, false, 960).mo142784a());
            m126667H().mo113270b(((float) m126670K()) / ((float) C33398a.f79357a.mo59452b(C33398a.m68487c())));
        } else {
            m126666G().mo114803a(C88297u.C88298a.m153445a(mo36486t().getResources().getColor(R.color.a2), m126668I() + C70636dh.m124833c(this.f52549m), m126669J(), m126670K(), C33398a.f79357a.mo59453d()));
        }
        View view = this.f160801e;
        if (view == null) {
            C89219l.m154710a("ivPlay");
        }
        view.setVisibility(8);
        if (!z) {
            View view2 = this.f160800d;
            if (view2 == null) {
                C89219l.m154710a("titleBar");
            }
            view2.setVisibility(4);
        }
        View view3 = this.f160810v;
        if (view3 == null) {
            C89219l.m154710a("bottomView");
        }
        C46371s.m89467a(view3, z, m126669J(), this.f52550n, new C71770h(this, z, aVar));
    }
}
