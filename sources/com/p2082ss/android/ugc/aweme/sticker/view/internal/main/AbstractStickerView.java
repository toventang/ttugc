package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75342a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75520e;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75588b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75723b;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75729d;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76139a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76146b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76148d;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76152h;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76330b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76333e;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76343g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76374p;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerCategoryListViewModel;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76120g;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76124k;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76128m;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.EnumC76135n;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import com.p2082ss.android.ugc.tools.view.style.StyleTabLayout;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView */
public abstract class AbstractStickerView implements AbstractC33974au, AbstractC76121h {

    /* renamed from: A */
    private AbstractC76148d f171060A;

    /* renamed from: B */
    private final C88411a f171061B;

    /* renamed from: C */
    private boolean f171062C;

    /* renamed from: D */
    private long f171063D;

    /* renamed from: E */
    private final AbstractC76124k f171064E;

    /* renamed from: F */
    private final boolean f171065F;

    /* renamed from: G */
    private final AbstractC76329a f171066G;

    /* renamed from: a */
    public final AbstractC0952i f171067a;

    /* renamed from: b */
    protected View f171068b;

    /* renamed from: c */
    protected AbstractC76120g f171069c;

    /* renamed from: d */
    protected ViewGroup f171070d;

    /* renamed from: e */
    protected StyleTabLayout f171071e;

    /* renamed from: f */
    public AbstractC76146b f171072f;

    /* renamed from: g */
    protected ViewGroup f171073g;

    /* renamed from: h */
    public AbstractC76331c f171074h;

    /* renamed from: i */
    public AbstractC76139a f171075i;

    /* renamed from: j */
    public int f171076j;

    /* renamed from: k */
    final C88960c<AbstractC76128m> f171077k;

    /* renamed from: l */
    public final AbstractC88969g<Boolean> f171078l;

    /* renamed from: m */
    public final C88960c<Integer> f171079m;

    /* renamed from: n */
    public final ActivityC0945e f171080n;

    /* renamed from: o */
    public final ViewGroup f171081o;

    /* renamed from: p */
    public final AbstractC1204m f171082p;

    /* renamed from: q */
    public final AbstractC76125l.C76127b f171083q;

    /* renamed from: r */
    public final AbstractC76125l.C76126a f171084r;

    /* renamed from: s */
    public final AbstractC75301e f171085s;

    /* renamed from: t */
    public final C75574j f171086t;

    /* renamed from: u */
    private final AbstractC89244h f171087u;

    /* renamed from: v */
    private ViewGroup f171088v;

    /* renamed from: w */
    private View f171089w;

    /* renamed from: x */
    private ViewGroup f171090x;

    /* renamed from: y */
    private AbstractC76152h f171091y;

    /* renamed from: z */
    private AbstractC76330b f171092z;

    static {
        Covode.recordClassIndex(89101);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC76396a mo119919a() {
        return (AbstractC76396a) this.f171087u.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC76120g mo119922b(ViewGroup viewGroup);

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            destroy$feature_effect_record_release();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: e */
    public final AbstractC76331c mo119141e() {
        return this.f171074h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$h */
    public static final class C76161h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractStickerView f171101a;

        static {
            Covode.recordClassIndex(89110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76161h(AbstractStickerView abstractStickerView) {
            super(0);
            this.f171101a = abstractStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f171101a.mo119924c();
            return C89391z.f203057a;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void destroy$feature_effect_record_release() {
        this.f171061B.mo142944a();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: l */
    public final void mo119148l() {
        AbstractC76331c cVar = this.f171074h;
        if (cVar != null) {
            cVar.mo120006b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final StyleTabLayout mo119923b() {
        StyleTabLayout styleTabLayout = this.f171071e;
        if (styleTabLayout == null) {
            C89219l.m154710a("tabLayout");
        }
        return styleTabLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: d */
    public final boolean mo119140d() {
        AbstractC76152h hVar = this.f171091y;
        if (hVar == null) {
            C89219l.m154710a("transitionView");
        }
        return hVar.mo119913a();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76118e
    /* renamed from: h */
    public final AbstractC88979t<Integer> mo119144h() {
        AbstractC88979t<Integer> c = this.f171079m.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: i */
    public final AbstractC88979t<Boolean> mo119145i() {
        AbstractC88979t<Boolean> c = this.f171078l.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: j */
    public final AbstractC88979t<EnumC76135n> mo119146j() {
        AbstractC76152h hVar = this.f171091y;
        if (hVar == null) {
            C89219l.m154710a("transitionView");
        }
        return hVar.mo119918f();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: k */
    public final AbstractC88979t<AbstractC76128m> mo119147k() {
        AbstractC88979t<AbstractC76128m> c = this.f171077k.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$e */
    public static final class C76158e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractStickerView f171098a;

        static {
            Covode.recordClassIndex(89107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76158e(AbstractStickerView abstractStickerView) {
            super(0);
            this.f171098a = abstractStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f171098a.mo119919a().mo120106a(new C75729d());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$o */
    static final class C76168o extends AbstractC89220m implements AbstractC89171a<AbstractC76396a> {

        /* renamed from: a */
        final /* synthetic */ AbstractStickerView f171114a;

        /* renamed from: b */
        final /* synthetic */ AbstractC76396a f171115b;

        static {
            Covode.recordClassIndex(89117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76168o(AbstractStickerView abstractStickerView, AbstractC76396a aVar) {
            super(0);
            this.f171114a = abstractStickerView;
            this.f171115b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76396a invoke() {
            AbstractC76396a aVar = this.f171115b;
            if (aVar == null) {
                return new StickerCategoryListViewModel(this.f171114a.f171082p, this.f171114a.f171083q.f171024a, this.f171114a.f171083q.f171027d);
            }
            return aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: g */
    public final void mo119143g() {
        if (this.f171065F) {
            AbstractC76152h hVar = this.f171091y;
            if (hVar == null) {
                C89219l.m154710a("transitionView");
            }
            hVar.mo119916d();
            return;
        }
        AbstractC76152h hVar2 = this.f171091y;
        if (hVar2 == null) {
            C89219l.m154710a("transitionView");
        }
        hVar2.mo119917e();
    }

    /* renamed from: c */
    public final void mo119924c() {
        this.f171077k.onNext(AbstractC76128m.C76131c.f171032a);
        if (mo119140d()) {
            mo119143g();
            if (!C89219l.m154714a((Object) mo119919a().mo120107b().getValue(), (Object) true)) {
                this.f171083q.f171026c.mo118951a(System.currentTimeMillis() - this.f171063D, 2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h
    /* renamed from: f */
    public final void mo119142f() {
        this.f171063D = System.currentTimeMillis();
        this.f171083q.f171024a.mo119281a(this.f171063D);
        m133564o();
        if (this.f171065F) {
            AbstractC76152h hVar = this.f171091y;
            if (hVar == null) {
                C89219l.m154710a("transitionView");
            }
            hVar.mo119914b();
            return;
        }
        AbstractC76152h hVar2 = this.f171091y;
        if (hVar2 == null) {
            C89219l.m154710a("transitionView");
        }
        hVar2.mo119915c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final int mo119926m() {
        int i = 0;
        for (T t : C75723b.m132877a(this.f171083q.f171024a.mo119291c().mo119464j())) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (C89219l.m154714a((Object) t.getKey(), (Object) "sticker_category:search")) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: n */
    public final void mo119927n() {
        AbstractC76331c cVar = this.f171074h;
        if (cVar != null && !cVar.mo120013h()) {
            AbstractC76139a aVar = this.f171075i;
            if (aVar == null) {
                C89219l.m154710a("stickerBarViewController");
            }
            aVar.mo119898a(false);
        }
        AbstractC76120g gVar = this.f171069c;
        if (gVar == null) {
            C89219l.m154710a("tabListView");
        }
        gVar.mo119131a(2, true);
    }

    /* renamed from: o */
    private void m133564o() {
        AbstractC88979t<C89378p<Integer, Integer>> tVar;
        if (this.f171069c == null) {
            ViewGroup viewGroup = this.f171088v;
            if (viewGroup == null) {
                C89219l.m154710a("content");
            }
            mo119920a(viewGroup);
            ViewGroup viewGroup2 = this.f171088v;
            if (viewGroup2 == null) {
                C89219l.m154710a("content");
            }
            AbstractC76120g b = mo119922b(viewGroup2);
            AbstractC88412b a = b.mo119860b().mo143254a(new C76154a(this), C88446a.f200699e);
            C89219l.m154716b(a, "");
            m133563a(a);
            AbstractC88412b a2 = b.mo119859a().mo143254a(new C76155b(this), C88446a.f200699e);
            C89219l.m154716b(a2, "");
            m133563a(a2);
            AbstractC88412b a3 = b.mo119144h().mo143254a(new C76156c(this), C84909p.f189747a);
            C89219l.m154716b(a3, "");
            m133563a(a3);
            this.f171069c = b;
            ViewGroup viewGroup3 = this.f171088v;
            if (viewGroup3 == null) {
                C89219l.m154710a("content");
            }
            C89219l.m154721d(viewGroup3, "");
            View findViewById = viewGroup3.findViewById(R.id.e9o);
            C89219l.m154716b(findViewById, "");
            new C76190j(findViewById).mo119905a(new C76161h(this));
            ViewGroup viewGroup4 = this.f171088v;
            if (viewGroup4 == null) {
                C89219l.m154710a("content");
            }
            C89219l.m154721d(viewGroup4, "");
            AbstractC76124k kVar = this.f171064E;
            ViewGroup viewGroup5 = this.f171070d;
            if (viewGroup5 == null) {
                C89219l.m154710a("tabBarLayout");
            }
            kVar.mo119865a(viewGroup5).mo119902a(new View$OnClickListenerC76157d(this));
            C75520e eVar = this.f171086t.f169841c;
            if (eVar != null) {
                boolean j = C75466g.m132358j(this.f171083q.f171024a.mo119294f());
                ViewGroup viewGroup6 = this.f171088v;
                if (viewGroup6 == null) {
                    C89219l.m154710a("content");
                }
                C89219l.m154721d(viewGroup6, "");
                C89219l.m154721d(eVar, "");
                View findViewById2 = viewGroup6.findViewById(R.id.c3h);
                C89219l.m154716b(findViewById2, "");
                this.f171072f = new C76182g((ViewGroup) findViewById2, eVar, j);
            }
            if (C76374p.C76375a.m133861a(this.f171086t.f169845g)) {
                ViewGroup viewGroup7 = this.f171088v;
                if (viewGroup7 == null) {
                    C89219l.m154710a("content");
                }
                int i = this.f171086t.f169845g;
                C89219l.m154721d(viewGroup7, "");
                View findViewById3 = viewGroup7.findViewById(R.id.c6x);
                C89219l.m154716b(findViewById3, "");
                View view = this.f171068b;
                if (view == null) {
                    C89219l.m154710a("stickerView");
                }
                ViewGroup viewGroup8 = this.f171073g;
                if (viewGroup8 == null) {
                    C89219l.m154710a("stickerViewContainer");
                }
                C76374p pVar = new C76374p(findViewById3, view, viewGroup8, i);
                ActivityC0945e eVar2 = this.f171080n;
                ViewGroup viewGroup9 = this.f171088v;
                if (viewGroup9 == null) {
                    C89219l.m154710a("content");
                }
                AbstractC76331c a4 = pVar.mo120045a(eVar2, viewGroup9, this.f171083q, this.f171084r, this.f171066G, this.f171086t);
                pVar.mo120047a(a4.mo120000a());
                AbstractC88412b d = a4.mo120009d().mo143289d(new C76162i(pVar, this));
                C89219l.m154716b(d, "");
                m133563a(d);
                AbstractC88412b d2 = a4.mo120010e().mo143289d(new C76163j(pVar, this));
                C89219l.m154716b(d2, "");
                m133563a(d2);
                AbstractC88412b d3 = mo119146j().mo143289d(new C76164k(a4, pVar, this));
                C89219l.m154716b(d3, "");
                m133563a(d3);
                this.f171074h = a4;
                this.f171092z = pVar;
                int m = mo119926m();
                if (m >= 0 && (tVar = this.f171084r.f171023g) != null) {
                    AbstractC88412b d4 = tVar.mo143289d(new C76165l(m, this));
                    C89219l.m154716b(d4, "");
                    m133563a(d4);
                }
                this.f171066G.mo120040h().observe(this.f171082p, new C76166m(this));
            }
            ViewGroup viewGroup10 = this.f171088v;
            if (viewGroup10 == null) {
                C89219l.m154710a("content");
            }
            C89219l.m154721d(viewGroup10, "");
            FrameLayout frameLayout = (FrameLayout) viewGroup10.findViewById(R.id.c7l);
            C89219l.m154716b(frameLayout, "");
            C76188i iVar = new C76188i(frameLayout, this.f171086t.f169850l.f169731a);
            mo119919a().mo120109d().observe(this.f171082p, new C76159f(iVar));
            iVar.mo119903a(new C76158e(this));
            this.f171060A = iVar;
            if (!this.f171062C) {
                this.f171062C = true;
                C88960c<AbstractC76128m> cVar = this.f171077k;
                ViewGroup viewGroup11 = this.f171088v;
                if (viewGroup11 == null) {
                    C89219l.m154710a("content");
                }
                cVar.onNext(new AbstractC76128m.C76134f(viewGroup11));
            }
            mo119919a().mo120107b().observe(this.f171082p, new C76160g(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$c */
    public static final class C76156c<T> implements AbstractC88433f<Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractStickerView f171096a;

        static {
            Covode.recordClassIndex(89105);
        }

        C76156c(AbstractStickerView abstractStickerView) {
            this.f171096a = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Integer num) {
            this.f171096a.f171079m.onNext(num);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$m */
    public static final class C76166m<T> implements AbstractC1214u<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractStickerView f171111a;

        static {
            Covode.recordClassIndex(89115);
        }

        C76166m(AbstractStickerView abstractStickerView) {
            this.f171111a = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Boolean bool) {
            AbstractC76331c cVar = this.f171111a.f171074h;
            if (cVar != null) {
                cVar.mo120003a(false);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC76139a m133562a(AbstractStickerView abstractStickerView) {
        AbstractC76139a aVar = abstractStickerView.f171075i;
        if (aVar == null) {
            C89219l.m154710a("stickerBarViewController");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$g */
    public static final class C76160g<T> implements AbstractC1214u<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractStickerView f171100a;

        static {
            Covode.recordClassIndex(89109);
        }

        C76160g(AbstractStickerView abstractStickerView) {
            this.f171100a = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                AbstractStickerView abstractStickerView = this.f171100a;
                if (bool2.booleanValue()) {
                    abstractStickerView.f171077k.onNext(AbstractC76128m.C76130b.f171031a);
                }
            }
        }
    }

    /* renamed from: a */
    private AbstractC88412b m133563a(AbstractC88412b bVar) {
        C89219l.m154721d(bVar, "");
        this.f171061B.mo142945a(bVar);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$a */
    public static final class C76154a<T> implements AbstractC88433f<C89378p<? extends EffectCategoryModel, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ AbstractStickerView f171094a;

        static {
            Covode.recordClassIndex(89103);
        }

        C76154a(AbstractStickerView abstractStickerView) {
            this.f171094a = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C89378p<? extends EffectCategoryModel, ? extends Integer> pVar) {
            C89378p<? extends EffectCategoryModel, ? extends Integer> pVar2 = pVar;
            AbstractStickerView abstractStickerView = this.f171094a;
            C89219l.m154716b(pVar2, "");
            abstractStickerView.f171077k.onNext(new AbstractC76128m.C76132d((EffectCategoryModel) pVar2.getFirst(), ((Number) pVar2.getSecond()).intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$b */
    public static final class C76155b<T> implements AbstractC88433f<C89378p<? extends EffectCategoryModel, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ AbstractStickerView f171095a;

        static {
            Covode.recordClassIndex(89104);
        }

        C76155b(AbstractStickerView abstractStickerView) {
            this.f171095a = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C89378p<? extends EffectCategoryModel, ? extends Integer> pVar) {
            C89378p<? extends EffectCategoryModel, ? extends Integer> pVar2 = pVar;
            AbstractStickerView abstractStickerView = this.f171095a;
            C89219l.m154716b(pVar2, "");
            abstractStickerView.f171077k.onNext(new AbstractC76128m.C76133e((EffectCategoryModel) pVar2.getFirst(), ((Number) pVar2.getSecond()).intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$d */
    public static final class View$OnClickListenerC76157d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractStickerView f171097a;

        static {
            Covode.recordClassIndex(89106);
        }

        View$OnClickListenerC76157d(AbstractStickerView abstractStickerView) {
            this.f171097a = abstractStickerView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractStickerView abstractStickerView = this.f171097a;
            AbstractC76125l.C76127b bVar = abstractStickerView.f171083q;
            bVar.f171026c.mo118955a("none");
            bVar.f171024a.mo119302n().mo119319a((C75588b) null);
            bVar.f171025b.mo118613a(C75342a.m132144a(EnumC75295a.UI_CLICK));
            abstractStickerView.f171077k.onNext(AbstractC76128m.C76129a.f171030a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$f */
    public static final class C76159f<T> implements AbstractC1214u<EnumC85026a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76148d f171099a;

        static {
            Covode.recordClassIndex(89108);
        }

        C76159f(AbstractC76148d dVar) {
            this.f171099a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(EnumC85026a aVar) {
            EnumC85026a aVar2 = aVar;
            if (aVar2 != null) {
                int i = C76176b.f171134b[aVar2.ordinal()];
                if (i == 1) {
                    this.f171099a.mo119904a(true);
                } else if (i == 2 || i == 3) {
                    this.f171099a.mo119904a(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$j */
    public static final class C76163j<T> implements AbstractC88433f<AbstractC76333e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76330b f171104a;

        /* renamed from: b */
        final /* synthetic */ AbstractStickerView f171105b;

        static {
            Covode.recordClassIndex(89112);
        }

        C76163j(AbstractC76330b bVar, AbstractStickerView abstractStickerView) {
            this.f171104a = bVar;
            this.f171105b = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(AbstractC76333e eVar) {
            AbstractC76333e eVar2 = eVar;
            if (eVar2 instanceof AbstractC76333e.C76336c) {
                AbstractStickerView.m133562a(this.f171105b).mo119898a(false);
            } else if (eVar2 instanceof AbstractC76333e.C76335b) {
                this.f171105b.mo119921a(((AbstractC76333e.C76335b) eVar2).f171474a);
            } else if (eVar2 instanceof AbstractC76333e.C76334a) {
                this.f171105b.mo119927n();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$i */
    public static final class C76162i<T> implements AbstractC88433f<C76343g> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76330b f171102a;

        /* renamed from: b */
        final /* synthetic */ AbstractStickerView f171103b;

        static {
            Covode.recordClassIndex(89111);
        }

        C76162i(AbstractC76330b bVar, AbstractStickerView abstractStickerView) {
            this.f171102a = bVar;
            this.f171103b = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C76343g gVar) {
            C76343g gVar2 = gVar;
            if (gVar2.f171489a) {
                AbstractStickerView.m133562a(this.f171103b).mo119898a(true);
                this.f171102a.mo120046a(gVar2.f171492d);
            } else {
                if (gVar2.f171490b || (this.f171103b.f171086t.f169845g == 2 && gVar2.f171491c)) {
                    AbstractStickerView.m133562a(this.f171103b).mo119898a(false);
                }
                this.f171102a.mo120048a(gVar2.f171491c);
            }
            this.f171103b.f171078l.onNext(Boolean.valueOf(gVar2.f171489a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$k */
    public static final class C76164k<T> implements AbstractC88433f<EnumC76135n> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76331c f171106a;

        /* renamed from: b */
        final /* synthetic */ AbstractC76330b f171107b;

        /* renamed from: c */
        final /* synthetic */ AbstractStickerView f171108c;

        static {
            Covode.recordClassIndex(89113);
        }

        C76164k(AbstractC76331c cVar, AbstractC76330b bVar, AbstractStickerView abstractStickerView) {
            this.f171106a = cVar;
            this.f171107b = bVar;
            this.f171108c = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(EnumC76135n nVar) {
            View a;
            if (nVar == EnumC76135n.PRE_HIDE) {
                this.f171106a.mo120008c();
            } else if (nVar == EnumC76135n.SHOWN) {
                AbstractC76331c cVar = this.f171108c.f171074h;
                if ((cVar != null && !cVar.mo120005a((Effect) null)) || this.f171107b.mo120049a()) {
                    AbstractStickerView abstractStickerView = this.f171108c;
                    if (C76374p.C76375a.m133861a(abstractStickerView.f171086t.f169845g)) {
                        if (abstractStickerView.f171086t.f169845g != 1) {
                            AbstractC76331c cVar2 = abstractStickerView.f171074h;
                            if (cVar2 == null || (a = cVar2.mo120000a()) == null || a.getVisibility() != 0) {
                                return;
                            }
                        } else if (abstractStickerView.mo119926m() != abstractStickerView.f171076j) {
                            return;
                        }
                        AbstractStickerView.m133562a(this.f171108c).mo119898a(true);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$l */
    public static final class C76165l<T> implements AbstractC88433f<C89378p<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ int f171109a;

        /* renamed from: b */
        final /* synthetic */ AbstractStickerView f171110b;

        static {
            Covode.recordClassIndex(89114);
        }

        C76165l(int i, AbstractStickerView abstractStickerView) {
            this.f171109a = i;
            this.f171110b = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C89378p<? extends Integer, ? extends Integer> pVar) {
            C89378p<? extends Integer, ? extends Integer> pVar2 = pVar;
            this.f171110b.f171076j = ((Number) pVar2.getSecond()).intValue();
            if (((Number) pVar2.getFirst()).intValue() == this.f171109a) {
                AbstractC76331c cVar = this.f171110b.f171074h;
                if (cVar != null && !cVar.mo120013h()) {
                    AbstractStickerView.m133562a(this.f171110b).mo119898a(false);
                }
            } else if (((Number) pVar2.getSecond()).intValue() == this.f171109a) {
                AbstractC76331c cVar2 = this.f171110b.f171074h;
                if (cVar2 != null) {
                    cVar2.mo120014i();
                }
                AbstractC76331c cVar3 = this.f171110b.f171074h;
                if (cVar3 == null || cVar3.mo120005a((Effect) null)) {
                    AbstractStickerView.m133562a(this.f171110b).mo119898a(false);
                } else {
                    AbstractStickerView.m133562a(this.f171110b).mo119898a(true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView$n */
    static final class C76167n<T> implements AbstractC88433f<EnumC76135n> {

        /* renamed from: a */
        final /* synthetic */ C1213t f171112a;

        /* renamed from: b */
        final /* synthetic */ AbstractStickerView f171113b;

        static {
            Covode.recordClassIndex(89116);
        }

        C76167n(C1213t tVar, AbstractStickerView abstractStickerView) {
            this.f171112a = tVar;
            this.f171113b = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: androidx.lifecycle.t */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(EnumC76135n nVar) {
            EnumC76135n nVar2 = nVar;
            this.f171112a.setValue(nVar2);
            if (nVar2 != null) {
                int i = C76176b.f171133a[nVar2.ordinal()];
                if (i == 1) {
                    this.f171113b.f171083q.f171026c.mo118950a().mo118974c("tool_performance_open_choose_sticker", "end_sticker_anim");
                    AbstractC76331c cVar = this.f171113b.f171074h;
                    if (cVar != null) {
                        cVar.mo120012g();
                    }
                } else if (i == 2) {
                    this.f171113b.f171083q.f171026c.mo118950a().mo118973b("tool_performance_open_choose_sticker", "start_sticker_anim");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo119920a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.c77);
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aig, frameLayout, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        this.f171070d = viewGroup2;
        if (viewGroup2 == null) {
            C89219l.m154710a("tabBarLayout");
        }
        frameLayout.addView(viewGroup2);
        AbstractC76124k kVar = this.f171064E;
        ViewGroup viewGroup3 = this.f171070d;
        if (viewGroup3 == null) {
            C89219l.m154710a("tabBarLayout");
        }
        this.f171071e = kVar.mo119866b(viewGroup3);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75521f
    /* renamed from: a */
    public final void mo119133a(AbstractC75498c cVar) {
        C89219l.m154721d(cVar, "");
        AbstractC76139a aVar = this.f171075i;
        if (aVar == null) {
            C89219l.m154710a("stickerBarViewController");
        }
        aVar.mo119133a(cVar);
    }

    /* renamed from: a */
    public final void mo119921a(Effect effect) {
        List<Effect> effects;
        AbstractC75655o oVar = this.f171083q.f171024a;
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(effect, "");
        List<EffectCategoryModel> a = C75723b.m132877a(oVar.mo119291c().mo119464j());
        int a2 = C75344c.m132145a(oVar);
        if (a.size() > a2) {
            CategoryEffectModel a3 = C75723b.m132876a(oVar.mo119291c().mo119464j(), a.get(a2).getKey());
            if (a3 == null || (effects = a3.getEffects()) == null || effects.isEmpty() || !TextUtils.equals(effect.getEffectId(), effects.get(0).getEffectId())) {
                oVar.mo119280a(a2, C89070n.m154516a(effect));
                if (a2 > 0) {
                    AbstractC76120g gVar = this.f171069c;
                    if (gVar == null) {
                        C89219l.m154710a("tabListView");
                    }
                    gVar.mo119131a(a2, true);
                    AbstractC76120g gVar2 = this.f171069c;
                    if (gVar2 == null) {
                        C89219l.m154710a("tabListView");
                    }
                    gVar2.mo119137b(0, true);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76116c
    /* renamed from: a */
    public final void mo119135a(List<EffectCategoryModel> list) {
        C89219l.m154721d(list, "");
        m133564o();
        AbstractC76120g gVar = this.f171069c;
        if (gVar == null) {
            C89219l.m154710a("tabListView");
        }
        gVar.mo119135a(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76118e
    /* renamed from: b */
    public final void mo119137b(int i, boolean z) {
        m133564o();
        AbstractC76120g gVar = this.f171069c;
        if (gVar == null) {
            C89219l.m154710a("tabListView");
        }
        gVar.mo119137b(i, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76117d
    /* renamed from: a */
    public final void mo119131a(int i, boolean z) {
        m133564o();
        AbstractC76120g gVar = this.f171069c;
        if (gVar == null) {
            C89219l.m154710a("tabListView");
        }
        gVar.mo119131a(i, z);
    }

    public AbstractStickerView(ActivityC0945e eVar, ViewGroup viewGroup, AbstractC1204m mVar, AbstractC76125l.C76127b bVar, AbstractC76125l.C76126a aVar, AbstractC75301e eVar2, C75574j jVar, AbstractC76124k kVar, AbstractC0952i iVar, AbstractC76396a aVar2, boolean z, AbstractC76329a aVar3) {
        AbstractC0952i iVar2 = iVar;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(eVar2, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(aVar3, "");
        this.f171080n = eVar;
        this.f171081o = viewGroup;
        this.f171082p = mVar;
        this.f171083q = bVar;
        this.f171084r = aVar;
        this.f171085s = eVar2;
        this.f171086t = jVar;
        this.f171064E = kVar;
        this.f171065F = z;
        this.f171066G = aVar3;
        if (iVar2 == null) {
            if (mVar instanceof Fragment) {
                iVar2 = ((Fragment) mVar).getChildFragmentManager();
            } else {
                iVar2 = eVar.getSupportFragmentManager();
            }
            C89219l.m154716b(iVar2, "");
        }
        this.f171067a = iVar2;
        this.f171087u = C89250i.m154773a((AbstractC89171a) new C76168o(this, aVar2));
        this.f171076j = -999;
        this.f171061B = new C88411a();
        C88960c<AbstractC76128m> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f171077k = cVar;
        C88960c cVar2 = new C88960c();
        C89219l.m154716b(cVar2, "");
        this.f171078l = cVar2;
        C88960c<Integer> cVar3 = new C88960c<>();
        C89219l.m154716b(cVar3, "");
        this.f171079m = cVar3;
        mVar.getLifecycle().mo4012a(this);
        bVar.f171025b.mo118615a(new AbstractC75301e(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView.C761531 */

            /* renamed from: a */
            final /* synthetic */ AbstractStickerView f171093a;

            static {
                Covode.recordClassIndex(89102);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f171093a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
            /* renamed from: a */
            public final void mo87551a(C75618a aVar) {
                C89219l.m154721d(aVar, "");
                AbstractC76146b bVar = this.f171093a.f171072f;
                if (bVar != null) {
                    bVar.mo119901a(C75466g.m132358j(aVar.f170022a));
                }
                this.f171093a.f171085s.mo87551a(aVar);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
            /* renamed from: a */
            public final void mo87552a(C75621d dVar) {
                C89219l.m154721d(dVar, "");
                AbstractC76146b bVar = this.f171093a.f171072f;
                if (bVar != null) {
                    bVar.mo119901a(true);
                }
                this.f171093a.f171085s.mo87552a(dVar);
            }
        });
        this.f171075i = new C76181f();
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b30, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        this.f171088v = viewGroup2;
        if (viewGroup2 == null) {
            C89219l.m154710a("content");
        }
        C89219l.m154721d(viewGroup2, "");
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.e89);
        viewGroup3.removeAllViews();
        Objects.requireNonNull(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aih, viewGroup3, true), "null cannot be cast to non-null type android.view.ViewGroup");
        C89219l.m154716b(viewGroup3, "");
        this.f171090x = viewGroup3;
        ViewGroup viewGroup4 = this.f171088v;
        if (viewGroup4 == null) {
            C89219l.m154710a("content");
        }
        C89219l.m154721d(viewGroup4, "");
        View findViewById = viewGroup4.findViewById(R.id.c71);
        C89219l.m154716b(findViewById, "");
        this.f171068b = findViewById;
        ViewGroup viewGroup5 = this.f171088v;
        if (viewGroup5 == null) {
            C89219l.m154710a("content");
        }
        View findViewById2 = viewGroup5.findViewById(R.id.c72);
        C89219l.m154716b(findViewById2, "");
        this.f171073g = (ViewGroup) findViewById2;
        ViewGroup viewGroup6 = this.f171088v;
        if (viewGroup6 == null) {
            C89219l.m154710a("content");
        }
        C89219l.m154721d(viewGroup6, "");
        View findViewById3 = viewGroup6.findViewById(R.id.a0v);
        C89219l.m154716b(findViewById3, "");
        this.f171089w = findViewById3;
        ViewGroup viewGroup7 = this.f171088v;
        if (viewGroup7 == null) {
            C89219l.m154710a("content");
        }
        C89219l.m154721d(viewGroup7, "");
        ViewGroup viewGroup8 = this.f171090x;
        if (viewGroup8 == null) {
            C89219l.m154710a("bottomSheet");
        }
        this.f171091y = new C76197n(viewGroup, viewGroup7, viewGroup8, jVar.f169848j, jVar.f169850l.f169734d, (byte) 0);
        C1213t tVar = new C1213t();
        AbstractC88412b d = mo119146j().mo143289d(new C76167n(tVar, this));
        C89219l.m154716b(d, "");
        m133563a(d);
        aVar.f171021e = tVar;
        C89219l.m154721d(jVar, "");
        ViewGroup viewGroup9 = this.f171088v;
        if (viewGroup9 == null) {
            C89219l.m154710a("content");
        }
        View findViewById4 = viewGroup9.findViewById(R.id.eer);
        C89219l.m154716b(findViewById4, "");
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) findViewById4).getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (jVar.f169842d > 0) {
            marginLayoutParams.topMargin = jVar.f169842d;
        }
        int i = marginLayoutParams.topMargin;
        ViewGroup viewGroup10 = this.f171088v;
        if (viewGroup10 == null) {
            C89219l.m154710a("content");
        }
        marginLayoutParams.topMargin = i + C70636dh.m124833c(viewGroup10.getContext());
        ViewGroup viewGroup11 = this.f171088v;
        if (viewGroup11 == null) {
            C89219l.m154710a("content");
        }
        View findViewById5 = viewGroup11.findViewById(R.id.c70);
        if (!(findViewById5 == null || jVar.f169839a == 0)) {
            findViewById5.setBackground(eVar.getResources().getDrawable(jVar.f169839a));
        }
        if (jVar.f169840b != 0) {
            ViewGroup viewGroup12 = this.f171073g;
            if (viewGroup12 == null) {
                C89219l.m154710a("stickerViewContainer");
            }
            viewGroup12.setBackground(eVar.getResources().getDrawable(jVar.f169840b));
        }
    }
}
